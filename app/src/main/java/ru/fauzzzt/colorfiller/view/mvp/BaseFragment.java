package ru.fauzzzt.colorfiller.view.mvp;

import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.widget.Toast;

import etr.android.reamp.mvp.Consumable;
import etr.android.reamp.mvp.MvpFragment;
import etr.android.reamp.mvp.MvpStateModel;
import ru.fauzzzt.colorfiller.CFApplication;
import ru.fauzzzt.colorfiller.R;

public abstract class BaseFragment<P extends BasePresenter<SM>, SM extends MvpStateModel> extends MvpFragment<P, SM> {

    public CFApplication getApp() {
        return (CFApplication) getActivity().getApplication();
    }

    public void showToast(String text) {
        Toast.makeText(getView().getContext(), text, Toast.LENGTH_LONG).show();
    }

    public void showError(Consumable<String> error) {
        String errorText = error.get();
        if (!TextUtils.isEmpty(errorText)) {
            showErrorAlert(errorText);
        }
    }

    public  void showErrorAlert(String errorMessage) {
        new AlertDialog.Builder(getContext())
                .setMessage(errorMessage)
                .setPositiveButton(R.string.dialog_ok, null)
                .setCancelable(false)
                .create()
                .show();
    }
}
