package com.mars_explorer.dep_injection;

import com.mars_explorer.model_comp.HttpModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ModelModule {

    @Provides
    public HttpModel provideHttpModel() {
        return new HttpModel();
    }

}
