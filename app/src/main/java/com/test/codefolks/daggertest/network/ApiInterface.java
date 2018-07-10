package com.test.codefolks.daggertest.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Basi on 13-09-2017.
 */

public interface ApiInterface {

    @POST("DigicardLogin")
    Call<LoginResponse> getLoginResults(@Query("userName") String username, @Query("password") String passwoed);



}

