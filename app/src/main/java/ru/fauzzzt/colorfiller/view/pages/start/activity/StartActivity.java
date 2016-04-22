package ru.fauzzzt.colorfiller.view.pages.start.activity;

import android.os.Bundle;
import android.view.View;

import butterknife.Bind;
import ru.fauzzzt.colorfiller.R;
import ru.fauzzzt.colorfiller.view.mvp.BaseActivity;

public class StartActivity extends BaseActivity<StartActivityPresenter, StartActivityStateModel> {

    @Bind(R.id.progressView) View progressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    @Override
    public StartActivityStateModel onCreateStateModel() {
        return getApp().getStateModelFactory().getStartActivityStateModel();
    }

    @Override
    public StartActivityPresenter onCreatePresenter() {
        return getApp().getPresenterFactory().getStartActivityPresenter();
    }

    @Override
    public void onStateChanged(StartActivityStateModel stateModel) {
        progressView.setVisibility(stateModel.progress ? View.VISIBLE : View.GONE);
    }
}
