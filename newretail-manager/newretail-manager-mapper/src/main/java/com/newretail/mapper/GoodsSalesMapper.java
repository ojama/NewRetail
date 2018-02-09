package com.newretail.mapper;

import com.newretail.pojo.GoodsSales;
import com.newretail.pojo.GoodsSalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSalesMapper {
    int countByExample(GoodsSalesExample example);

    int deleteByExample(GoodsSalesExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsSales record);

    int insertSelective(GoodsSales record);

    List<GoodsSales> selectByExample(GoodsSalesExample example);

    GoodsSales selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsSales record, @Param("example") GoodsSalesExample example);

    int updateByExample(@Param("record") GoodsSales record, @Param("example") GoodsSalesExample example);

    int updateByPrimaryKeySelective(GoodsSales record);

    int updateByPrimaryKey(GoodsSales record);
}