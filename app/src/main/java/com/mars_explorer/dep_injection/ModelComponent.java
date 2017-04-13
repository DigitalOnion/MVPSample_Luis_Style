package com.mars_explorer.dep_injection;

import com.mars_explorer.presenter_comp.MainPresenter;

import dagger.Component;

@Component(modules = ModelModule.class)
public interface ModelComponent {

    void inject(MainPresenter mainPresenter);

}
