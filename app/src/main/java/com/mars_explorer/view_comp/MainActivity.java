package com.mars_explorer.view_comp;
//
// MainActivity: besides being the first activity to show up, it is the V in the MVP design pattern
//

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mars_explorer.dep_injection.DaggerPresenterComponent;
import com.mars_explorer.dep_injection.PresenterModule;
import com.mars_explorer.presenter_comp.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements ViewRequirement, MainView {

    @Inject
    MainPresenter presenter;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerPresenterComponent.builder().presenterModule(new PresenterModule()).build().inject(this);

        // attaching the view to the presenter allows the Presenter to call the view
        presenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void onDataReady() {

    }
}
