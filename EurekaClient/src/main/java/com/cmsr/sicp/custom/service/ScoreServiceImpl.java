package com.cmsr.sicp.custom.service;

import com.cmsr.sicp.custom.bean.Score;
import com.cmsr.sicp.custom.mapper.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by 巩尊豪 2020/7/21
 */
@Service
public class ScoreServiceImpl implements ScoreService{
    @Autowired
    private ScoreMapper scoreMapper;

}
