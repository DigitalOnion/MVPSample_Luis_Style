package com.mars_explorer.dep_injection;

import com.mars_explorer.presenter_comp.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    @Provides
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }
}
