package com.bison.system.dao;

import cc.mrbird.common.config.MyMapper;
import com.bison.system.domain.Role;
import com.bison.system.domain.RoleWithMenu;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
	
	List<Role> findUserRole(String userName);
	
	List<RoleWithMenu> findById(Long roleId);
}