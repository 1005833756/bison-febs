package com.bison.system.service;

import cc.mrbird.common.service.IService;
import com.bison.system.domain.UserConnection;

import java.util.List;

public interface UserConnectionService extends IService<UserConnection> {

    boolean isExist(String userId, String providerId);

    List<UserConnection> findByProviderUserId(String providerUserId);

    void delete(UserConnection userConnection);
}
