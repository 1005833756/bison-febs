package com.bison.system.service;

import cc.mrbird.common.service.IService;
import com.bison.system.domain.UserRole;

public interface UserRoleService extends IService<UserRole> {

	void deleteUserRolesByRoleId(String roleIds);

	void deleteUserRolesByUserId(String userIds);
}
