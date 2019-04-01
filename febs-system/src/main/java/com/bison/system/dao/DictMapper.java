package com.bison.system.dao;

import cc.mrbird.common.config.MyMapper;
import com.bison.system.domain.Dict;

import java.util.List;

public interface DictMapper extends MyMapper<Dict> {

    List<Dict> findDictByFieldName(String fieldName);

    Dict findDictByFieldNameAndKeyy(String fieldName, String keyy);
}