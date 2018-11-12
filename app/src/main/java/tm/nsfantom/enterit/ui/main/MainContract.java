package tm.nsfantom.enterit.ui.main;

import tm.nsfantom.enterit.ui.base.BaseContract;

public class MainContract  {

    interface View extends BaseContract.View {

        void showMenu();

        void showGame();

        void showStats();

    }

    public interface Presenter extends BaseContract.Presenter<MainContract.View>{

    }


}
