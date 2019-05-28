package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.UploadfilesExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UploadfilesMapper extends Mapper<Uploadfiles> {
    int countByExample(UploadfilesExample example);

    int deleteByExample2(UploadfilesExample example);

    int deleteByPrimaryKey2(Integer fileId);

    int insert(Uploadfiles record);

    int insertSelective(Uploadfiles record);

    List<Uploadfiles> selectByExample2(UploadfilesExample example);

    Uploadfiles selectByPrimaryKey2(Integer fileId);

    int updateByExampleSelective2(@Param("record") Uploadfiles record, @Param("example") UploadfilesExample example);

    int updateByExample2(@Param("record") Uploadfiles record, @Param("example") UploadfilesExample example);

    int updateByPrimaryKeySelective(Uploadfiles record);

    int updateByPrimaryKey(Uploadfiles record);
}