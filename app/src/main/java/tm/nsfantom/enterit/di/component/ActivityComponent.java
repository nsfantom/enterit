package tm.nsfantom.enterit.di.component;

import dagger.Component;
import tm.nsfantom.enterit.di.module.ActivityModule;
import tm.nsfantom.enterit.ui.main.MainActivity;

@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
