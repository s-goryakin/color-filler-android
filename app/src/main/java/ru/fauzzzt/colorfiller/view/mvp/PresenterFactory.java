package ru.fauzzzt.colorfiller.view.mvp;

import ru.fauzzzt.colorfiller.domain.commands.CommandFactory;
import ru.fauzzzt.colorfiller.view.pages.splash.SplashActivityPresenter;
import ru.fauzzzt.colorfiller.view.pages.start.activity.StartActivityPresenter;

public class PresenterFactory {
    private final CommandFactory commandFactory;

    public PresenterFactory(CommandFactory commandFactory) {
        this.commandFactory = commandFactory;
    }


    public SplashActivityPresenter getSplashActivityPresenter() {
        return new SplashActivityPresenter();
    }

    public StartActivityPresenter getStartActivityPresenter() {
        return new StartActivityPresenter();
    }
}
