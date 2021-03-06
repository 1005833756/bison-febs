package com.bison.quartz.service;

import cc.mrbird.common.service.IService;
import com.bison.quartz.domain.JobLog;

import java.util.List;

public interface JobLogService extends IService<JobLog>{

	List<JobLog> findAllJobLogs(JobLog jobLog);

	void saveJobLog(JobLog log);

	void deleteBatch(String jobLogIds);
}
