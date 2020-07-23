package com.cmsr.sicp.custom.mapper;

import com.cmsr.sicp.custom.bean.Score;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}