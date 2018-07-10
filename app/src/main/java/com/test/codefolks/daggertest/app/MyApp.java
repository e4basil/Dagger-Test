package com.test.codefolks.daggertest.app;

import android.app.Application;

import com.test.codefolks.daggertest.component.DaggerNetComponent;
import com.test.codefolks.daggertest.component.NetComponent;
import com.test.codefolks.daggertest.module.AppModule;
import com.test.codefolks.daggertest.module.NetModule;

public class MyApp extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://103.214.234.25/ProdoneWebAPI/api/"))
                .build();
    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }
}
