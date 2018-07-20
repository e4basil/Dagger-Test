package com.test.codefolks.daggertest.ui;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.test.codefolks.daggertest.R;
import com.test.codefolks.daggertest.app.MyApp;
import com.test.codefolks.daggertest.network.ApiInterface;
import com.test.codefolks.daggertest.network.LoginCallBack;
import com.test.codefolks.daggertest.network.LoginResponse;
import com.test.codefolks.daggertest.network.Webservices;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements LoginCallBack {

    @Inject
    Retrofit retrofit;
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApp) getApplication()).getmNetComponent().inject(this);


//        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<LoginResponse> responseCall = apiInterface.getLoginResults("dataload", "dataload");
        Webservices.getInstance().getloginResult(100, responseCall, this);
    }

    @Override
    public void loginSuccess(LoginResponse response, int requestcode) {
        if (requestcode == 100) {
            if (response != null) {
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void loginError(String msg, int requestcode) {
        if (requestcode == 100) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
