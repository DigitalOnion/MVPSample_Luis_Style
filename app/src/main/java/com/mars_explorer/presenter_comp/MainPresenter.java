package com.mars_explorer.presenter_comp;

//
// MainPresenter: controls the information transfer and Business rules. Besides, it is
//              the P in the MVP for the MainActivity of the app.
//
import com.mars_explorer.dep_injection.DaggerModelComponent;
import com.mars_explorer.dep_injection.DaggerPresenterComponent;
import com.mars_explorer.dep_injection.ModelModule;
import com.mars_explorer.dep_injection.PresenterModule;
import com.mars_explorer.model_comp.HttpModel;
import com.mars_explorer.view_comp.MainView;
import com.mars_explorer.view_comp.ViewRequirement;

import javax.inject.Inject;

public class MainPresenter implements PresenterRequirement {

    MainView mainView;

    @Inject
    HttpModel httpModel;

    @Override
    public void attachView(MainView mainView) {
        this.mainView = mainView;

        DaggerModelComponent
                .builder()
                .modelModule(new ModelModule())
                .build().inject(this);

        // attaching the presenter to the model allows the model to call the presenteroy
        httpModel.attachPresenter(this);
    }

    @Override
    public void detachView() {

    }
}
