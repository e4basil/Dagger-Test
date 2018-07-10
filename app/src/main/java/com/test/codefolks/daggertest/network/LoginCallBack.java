package com.test.codefolks.daggertest.network;

public interface LoginCallBack {
    void loginSuccess(LoginResponse response,int requestcode);
    void loginError(String msg,int requestcode);
}
