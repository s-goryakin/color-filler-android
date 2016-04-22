package ru.fauzzzt.colorfiller;

import android.app.Application;
import android.support.annotation.NonNull;

import ru.fauzzzt.colorfiller.domain.commands.CommandFactory;
import ru.fauzzzt.colorfiller.view.mvp.PresenterFactory;
import ru.fauzzzt.colorfiller.view.mvp.StateModelFactory;

public class CFApplication extends Application {

    private PresenterFactory presenterFactory;
    private StateModelFactory stateModelFactory;
    private CommandFactory commandFactory;
    private Config config;

    @Override
    public void onCreate() {
        super.onCreate();
        config = new Config();
        commandFactory = new CommandFactory();
        presenterFactory = new PresenterFactory(commandFactory);
        stateModelFactory = new StateModelFactory();
    }

    @NonNull
    public PresenterFactory getPresenterFactory() {
        return presenterFactory;
    }

    @NonNull
    public StateModelFactory getStateModelFactory() {
        return stateModelFactory;
    }

    public CommandFactory getCommandFactory() {
        return commandFactory;
    }
}
