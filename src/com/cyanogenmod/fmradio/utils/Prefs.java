package com.cyanogenmod.fmradio.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Android Shared preferences helper methods
 */
public final class Prefs {

    /**
     * Get Preferred FM Band
     */
    public static int getPreferredBand(Context ctx) {
        SharedPreferences settings = ctx.getSharedPreferences(Constants.PREFS_NAME, Context.MODE_PRIVATE);
        return settings.getInt(Constants.PREFS_SELECTED_BAND, 1);
    }


    public static void setPreferredBand(Context ctx, final int band) {
        SharedPreferences settings = ctx.getSharedPreferences(Constants.PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(Constants.PREFS_SELECTED_BAND, band);
        editor.commit();
    }

}
