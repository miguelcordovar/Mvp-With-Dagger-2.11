package me.fleka.mvpwithdagger;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import me.fleka.mvpwithdagger.di.AppComponent;
import me.fleka.mvpwithdagger.di.DaggerAppComponent;

/**
 * Created by Mladen Rakonjac on 8/19/17.
 */

public class MyApplication extends DaggerApplication{


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }

}
