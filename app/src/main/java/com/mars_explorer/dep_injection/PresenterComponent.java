package com.mars_explorer.dep_injection;

import com.mars_explorer.presenter_comp.MainPresenter;
import com.mars_explorer.view_comp.MainActivity;

import dagger.Component;

@Component(modules = PresenterModule.class)
public interface PresenterComponent {

    void inject(MainActivity activity);

}
