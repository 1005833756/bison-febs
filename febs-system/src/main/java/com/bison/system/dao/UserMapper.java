package com.bison.system.dao;

import cc.mrbird.common.config.MyMapper;
import com.bison.system.domain.MyUser;
import com.bison.system.domain.UserWithRole;

import java.util.List;

public interface UserMapper extends MyMapper<MyUser> {
    
    List<MyUser> findUserWithDept(MyUser user);

    List<UserWithRole> findUserWithRole(Long userId);

    MyUser findUserProfile(MyUser user);
}