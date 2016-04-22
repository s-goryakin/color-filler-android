package ru.fauzzzt.colorfiller.view.pages.splash;

import android.os.Bundle;
import android.view.View;

import butterknife.Bind;
import ru.fauzzzt.colorfiller.R;
import ru.fauzzzt.colorfiller.view.mvp.BaseActivity;

public class SplashActivity extends BaseActivity<SplashActivityPresenter, SplashActivityStateModel> {

    @Bind(R.id.progressView) View progressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    public SplashActivityStateModel onCreateStateModel() {
        return getApp().getStateModelFactory().getSplashActivityStateModel();
    }

    @Override
    public SplashActivityPresenter onCreatePresenter() {
        return getApp().getPresenterFactory().getSplashActivityPresenter();
    }

    @Override
    public void onStateChanged(SplashActivityStateModel stateModel) {
        progressView.setVisibility(stateModel.progress ? View.VISIBLE : View.GONE);
    }
}
