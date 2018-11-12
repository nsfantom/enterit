package tm.nsfantom.enterit.ui.main;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    @Override
    public void attach(MainContract.View view) {
        this.view = view;
        view.showMenu(); // as default
    }
}
