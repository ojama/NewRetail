package com.newretail.common.utils;

import java.util.Random;

/**
 * 主键生成器
 * @author Yongjie
 *
 */
public class IdGenerator {
	/**  
     * 生成主键(16位数字) 
     * 主键生成方式,年月日时分秒毫秒的时间戳+四位随机数保证不重复 
     */    
    public static  String getId() {  
        //当前系统时间戳精确到毫秒  
        Long simple=System.currentTimeMillis();  
        //三位随机数  
        int random=new Random().nextInt(900)+100;//为变量赋随机值100-999;  
        return simple.toString()+random;    
    }   
    
    public static void main(String[] args) {
		System.out.println( getId());
	}
}
