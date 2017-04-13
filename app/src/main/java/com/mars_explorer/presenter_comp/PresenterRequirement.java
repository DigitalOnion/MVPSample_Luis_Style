package com.mars_explorer.presenter_comp;

import com.mars_explorer.view_comp.MainView;
import com.mars_explorer.view_comp.ViewRequirement;

public interface PresenterRequirement {
    public void attachView(MainView mainView);
    public void detachView();
}
