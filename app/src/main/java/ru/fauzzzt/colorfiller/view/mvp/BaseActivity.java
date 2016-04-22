package ru.fauzzzt.colorfiller.view.mvp;

import etr.android.reamp.mvp.MvpAppCompatActivity;
import etr.android.reamp.mvp.MvpStateModel;
import ru.fauzzzt.colorfiller.CFApplication;


public abstract class BaseActivity<P extends BasePresenter<SM>, SM extends MvpStateModel> extends MvpAppCompatActivity<P, SM> {

    public CFApplication getApp() {
        return ((CFApplication) getApplication());
    }

}
