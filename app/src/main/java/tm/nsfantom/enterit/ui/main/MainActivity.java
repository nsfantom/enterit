package tm.nsfantom.enterit.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import tm.nsfantom.enterit.R;
import tm.nsfantom.enterit.di.component.ActivityComponent;
import tm.nsfantom.enterit.di.component.DaggerActivityComponent;
import tm.nsfantom.enterit.di.module.ActivityModule;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependency();
        presenter.attach(this);
        setContentView(R.layout.activity_main);
    }


    private void injectDependency() {
        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .build();

        activityComponent.inject(this);
    }

    @Override
    public void showMenu() {

    }

    @Override
    public void showGame() {

    }

    @Override
    public void showStats() {

    }
}
