package ru.fauzzzt.colorfiller.view.mvp;


import ru.fauzzzt.colorfiller.view.pages.splash.SplashActivityStateModel;
import ru.fauzzzt.colorfiller.view.pages.start.activity.StartActivityStateModel;

public class StateModelFactory {

    public SplashActivityStateModel getSplashActivityStateModel() {
        return new SplashActivityStateModel();
    }

    public StartActivityStateModel getStartActivityStateModel() {
        return new StartActivityStateModel();
    }
}
