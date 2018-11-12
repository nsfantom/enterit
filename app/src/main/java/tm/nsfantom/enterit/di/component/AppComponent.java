package tm.nsfantom.enterit.di.component;


import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Component;
import tm.nsfantom.enterit.ItApp;
import tm.nsfantom.enterit.di.module.AppModule;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Resources resources();

    void inject(ItApp application);
}
