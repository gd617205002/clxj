package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.UploadfilesExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UploadfilesMapper extends Mapper<Uploadfiles> {
    int countByExample(UploadfilesExample example);


    List<Uploadfiles> selectByExample2(UploadfilesExample example);

    Uploadfiles selectByPrimaryKey2(Integer fileId);


}