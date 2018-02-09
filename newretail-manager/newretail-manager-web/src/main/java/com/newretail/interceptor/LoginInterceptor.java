package com.newretail.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.newretail.common.utils.CookieUtils;
import com.newretail.pojo.UserTable;
import com.newretail.service.UserService;
public class LoginInterceptor implements HandlerInterceptor {
	/*普通用户*/
	private final static String USER_STATUS_ADMIN = "4";
	/*商家*/
	private final static String USER_STATUS_SELELL = "2";
	
	@Value("${ADMIN_PAGES}")
	public  String adminPages;
	
	@Value("${SELLER_PAGES}")
	public   String sellerPages;
	@Autowired
	public UserService userService;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
			//判断用户是否登录
			//从cookie中取token
			String token = CookieUtils.getCookieValue(request, "NEWRETAIL_LOGIN");
			//根据token换取用户信息，调用sso系统的接口。
			Logger log = Logger.getLogger(LoginInterceptor.class);
			log.error("=======cokile--NEWRETAIL_LOGIN====="+token);
			UserTable user = userService.getUserByToken(token);
			//取不到用户信息
			if (null == user) {
				//跳转到登录页面，把用户请求的url作为参数传递给登录页面。
				response.sendRedirect("/login/"+ "?redirect=" + request.getRequestURL());
				//response.sendRedirect("/login");
				//返回false
				return false;
			}
			//用户类型
			String identify = user.getIdentify();
			String requestURI = request.getRequestURI();  
			String uri = requestURI.substring(requestURI.lastIndexOf("/"));
			String sellerIndex = "sellerIndex";
			//取到用户信息，放行
			//把用户信息放入Request
			String[] adminPageList = adminPages.split(",");
			String[] sellerPagesList = sellerPages.split(",");
			log.error("=======adminPages====="+adminPages);
			log.error("=======sellerPages====="+sellerPages);
			log.error("=======index uri====="+uri);
			log.error("=======identify====="+identify);
			if(USER_STATUS_ADMIN.equals(identify)){
				return isLoginUser(uri,adminPageList);
			}else if(USER_STATUS_SELELL.equals(identify)){
				boolean isSeller = isLoginUser(uri,sellerPagesList);
				if(isSeller==true){
					if(uri.equals("/index")){
						response.sendRedirect(request.getContextPath() + sellerIndex);
					}
					return true;
				}
			}else{
				response.sendRedirect("/login/"+ "?redirect=" + request.getRequestURL());
				return false;
			}
			request.setAttribute("user", user);
			//返回值决定handler是否执行。true：执行，false：不执行。
			return true;
		} catch (Exception e) {
			response.sendRedirect("/login/"+ "?redirect=" + request.getRequestURL());
			return false;
		}
	}

	boolean isLoginUser(String uri, String[] pages) {
		for(String page:pages){
			if(uri.equals(page)){
				return true;
			}	
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// handler执行之后，返回ModelAndView之前

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 返回ModelAndView之后。
		//响应用户之后。

	}

}
