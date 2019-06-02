package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.UploadfilesExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UploadfilesMapper {
    int countByExample(UploadfilesExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insertSelective(Uploadfiles record);

    List<Uploadfiles> selectByExample(UploadfilesExample example);

    Uploadfiles selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(Uploadfiles record);

}