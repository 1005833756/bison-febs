package com.bison.netty.protocol;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public abstract class Packet {
    /**
     * 协议版本
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;
    /**
     * 指令类型
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte type;
    /**
     * 来源
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte code;
    /**
     * 重传标志
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte flag;
    /**
     * 井id
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte[] devId;
    /**
     * 消息日期
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte[] date;
    /**
     * 时间
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte[] time;
    /**
     * 校验码
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte[] crc;
    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
