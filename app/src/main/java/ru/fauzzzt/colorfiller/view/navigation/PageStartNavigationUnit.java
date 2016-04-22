package ru.fauzzzt.colorfiller.view.navigation;

import android.content.Intent;

import etr.android.reamp.navigation.Navigation;
import etr.android.reamp.navigation.NavigationUnit;
import ru.fauzzzt.colorfiller.view.pages.start.activity.StartActivity;

public class PageStartNavigationUnit extends NavigationUnit {
    @Override
    protected void navigate(Navigation navigation) {
        Intent intent = new Intent(navigation.getActivity(), StartActivity.class);
        navigation.getActivity().startActivity(intent);
    }
}
