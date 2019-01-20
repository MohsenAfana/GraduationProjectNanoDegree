package com.example.ibrahimelhout.graduationprojectnanodegree.Utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * This file is created By: ( Ibrahim A. Elhout ) on 07/03/2018 at 6:27 PM
 * Project : LaundaryApp
 * Contacts:
 * Email: Ibrahimhout.dev@gmail.com
 * Phone: 00972598825662
 **/
public class UtilsClass {
    private static final UtilsClass ourInstance = new UtilsClass();

    public static UtilsClass getInstance() {
        return ourInstance;
    }

    private UtilsClass() {
    }




    public void hideKeyboard(Context context){

        // Check if no view has focus:
        View view = ((Activity) context).getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            assert imm != null;
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
