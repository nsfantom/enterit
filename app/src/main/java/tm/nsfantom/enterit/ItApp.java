package tm.nsfantom.enterit;

import android.app.Application;

import tm.nsfantom.enterit.di.component.AppComponent;
import tm.nsfantom.enterit.di.component.DaggerAppComponent;
import tm.nsfantom.enterit.di.module.AppModule;

public class ItApp extends Application {

    private AppComponent appComponent;
    private ItApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initDagger();
    }

    public AppComponent getApplicationComponent(){
        return appComponent;
    }

    private void initDagger() {
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
        appComponent.inject(this);
    }
}
