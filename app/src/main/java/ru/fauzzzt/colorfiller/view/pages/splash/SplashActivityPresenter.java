package ru.fauzzzt.colorfiller.view.pages.splash;

import android.os.Handler;

import etr.android.reamp.navigation.Navigation;
import ru.fauzzzt.colorfiller.view.mvp.BasePresenter;
import ru.fauzzzt.colorfiller.view.navigation.PageStartNavigationUnit;

public class SplashActivityPresenter extends BasePresenter<SplashActivityStateModel> {

    private static final long SPLASH_DISPLAY_TIME_MS = 3000;

    @Override
    public void onResume() {
        final SplashActivityStateModel stateModel = getStateModel();
        stateModel.progress = true;
        sendStateModel(stateModel);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Navigation navigation = getNavigation();
                navigation.open(new PageStartNavigationUnit());
                navigation.close();
            }
        }, SPLASH_DISPLAY_TIME_MS);
    }

}
