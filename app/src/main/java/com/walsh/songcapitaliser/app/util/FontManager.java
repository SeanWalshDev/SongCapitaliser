package com.walsh.songcapitaliser.app.util;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FontManager {

    public static final String ROOT = "fonts/", FONTAWESOME = ROOT + "fontawesome.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }

    public static void markAsIconContainer(View view, Typeface typeface) {
        if(view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;

            for(int i = 0; i < viewGroup.getChildCount(); i++) {
                View child = viewGroup.getChildAt(i);
                markAsIconContainer(child, typeface);
            }
        }
        else if(view instanceof TextView) {
            ((TextView) view).setTypeface(typeface);
        }
    }
}
