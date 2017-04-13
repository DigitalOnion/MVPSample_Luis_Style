package com.mars_explorer.model_comp;

import com.mars_explorer.presenter_comp.PresenterRequirement;

public interface ModelRequirement {

    public void attachPresenter(PresenterRequirement presenterRequirement);

    public void detachPresenter();

}
