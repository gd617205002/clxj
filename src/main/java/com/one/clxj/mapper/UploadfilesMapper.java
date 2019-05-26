package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.UploadfilesExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UploadfilesMapper extends Mapper<Uploadfiles> {
    int countByExample(UploadfilesExample example);

    int deleteByExample(UploadfilesExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(Uploadfiles record);

    int insertSelective(Uploadfiles record);

    List<Uploadfiles> selectByExample(UploadfilesExample example);

    Uploadfiles selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") Uploadfiles record, @Param("example") UploadfilesExample example);

    int updateByExample(@Param("record") Uploadfiles record, @Param("example") UploadfilesExample example);

    int updateByPrimaryKeySelective(Uploadfiles record);

    int updateByPrimaryKey(Uploadfiles record);
}