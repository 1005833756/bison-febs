package com.bison.security.code.sms;

public interface SmsCodeSender {
    void send(String mobile, String code);
}
