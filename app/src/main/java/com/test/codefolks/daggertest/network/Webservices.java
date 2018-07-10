package com.test.codefolks.daggertest.network;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Webservices {

    private static Webservices instance = null;
    private String TAG = Webservices.class.getSimpleName();

    public static synchronized Webservices getInstance() {

        if (instance == null) {
            instance = new Webservices();
        }
        return instance;
    }



    public void getloginResult(int requestcode,
                               Call<LoginResponse> responseCall,
                               LoginCallBack callBack) {
        responseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful()){
                    callBack.loginSuccess(response.body(),requestcode);
                }else {
                    callBack.loginError("Response Not Successful",requestcode);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                callBack.loginError(t.toString(),requestcode);

            }
        });
    }


}

