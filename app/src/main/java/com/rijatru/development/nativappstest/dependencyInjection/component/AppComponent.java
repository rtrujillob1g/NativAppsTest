package com.rijatru.development.nativappstest.dependencyInjection.component;

import com.rijatru.development.nativappstest.App;
import com.rijatru.development.nativappstest.dependencyInjection.module.AppModule;
import com.rijatru.development.nativappstest.dependencyInjection.module.DataModule;
import com.rijatru.development.nativappstest.dependencyInjection.module.ViewsModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, ViewsModule.class})
public interface AppComponent {

    App app();
}
