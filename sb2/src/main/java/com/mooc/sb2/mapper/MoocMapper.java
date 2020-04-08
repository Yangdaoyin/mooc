package com.mooc.sb2.mapper;

import com.mooc.sb2.bean.Mooc;
import com.mooc.sb2.bean.MoocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoocMapper {
    long countByExample(MoocExample example);

    int deleteByExample(MoocExample example);

    int insert(Mooc record);

    int insertSelective(Mooc record);

    List<Mooc> selectByExample(MoocExample example);

    int updateByExampleSelective(@Param("record") Mooc record, @Param("example") MoocExample example);

    int updateByExample(@Param("record") Mooc record, @Param("example") MoocExample example);
}