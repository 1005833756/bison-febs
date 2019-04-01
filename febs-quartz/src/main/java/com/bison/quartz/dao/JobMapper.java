package com.bison.quartz.dao;

import com.bison.common.config.MyMapper;
import com.bison.quartz.domain.Job;

import java.util.List;

public interface JobMapper extends MyMapper<Job> {

	List<Job> queryList();
}