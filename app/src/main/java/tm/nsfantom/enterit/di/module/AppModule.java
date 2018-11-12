package tm.nsfantom.enterit.di.module;


import android.app.Application;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import tm.nsfantom.enterit.di.scope.PerApplication;

@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @PerApplication
    Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    Resources providesResources() {
        return application.getResources();
    }
}
