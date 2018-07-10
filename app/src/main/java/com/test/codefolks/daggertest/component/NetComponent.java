package com.test.codefolks.daggertest.component;

import com.test.codefolks.daggertest.module.AppModule;
import com.test.codefolks.daggertest.module.NetModule;
import com.test.codefolks.daggertest.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    void inject(MainActivity activity);
}
