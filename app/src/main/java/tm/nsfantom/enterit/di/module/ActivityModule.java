package tm.nsfantom.enterit.di.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import tm.nsfantom.enterit.ui.main.MainContract;
import tm.nsfantom.enterit.ui.main.MainPresenter;

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
    }

    @Provides
    Activity provideActivity() {
        return activity;
    }

    @Provides
    MainContract.Presenter providePresenter() {
        return new MainPresenter();
    }
}
