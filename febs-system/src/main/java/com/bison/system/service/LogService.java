package com.bison.system.service;

import cc.mrbird.common.service.IService;
import com.bison.system.domain.SysLog;

import java.util.List;

public interface LogService extends IService<SysLog> {
	
	List<SysLog> findAllLogs(SysLog log);
	
	void deleteLogs(String logIds);
}
