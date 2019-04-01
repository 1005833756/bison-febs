package com.bison.system.service.impl;

import cc.mrbird.common.service.impl.BaseService;
import com.bison.system.dao.UserConnectionMapper;
import com.bison.system.domain.UserConnection;
import com.bison.system.service.UserConnectionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("userConnectionService")
public class UserConnectionImpl extends BaseService<UserConnection> implements UserConnectionService {

    @Autowired
    private UserConnectionMapper userConnectionMapper;

    @Override
    public boolean isExist(String userId, String providerId) {
        Example example = new Example(UserConnection.class);
        example.createCriteria()
                .andCondition("lower(userId)=", StringUtils.lowerCase(userId))
                .andCondition("lower(providerId)=", StringUtils.lowerCase(providerId));
        List<UserConnection> list = this.selectByExample(example);
        return !list.isEmpty();
    }

    @Override
    public List<UserConnection> findByProviderUserId(String providerUserId) {
        Example example = new Example(UserConnection.class);
        example.createCriteria()
                .andCondition("providerUserId=", providerUserId);
        return this.selectByExample(example);
    }

    @Override
    public void delete(UserConnection userConnection) {
        this.userConnectionMapper.delete(userConnection);
    }

}
