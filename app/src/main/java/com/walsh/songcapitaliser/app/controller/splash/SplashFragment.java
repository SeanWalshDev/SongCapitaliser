package com.walsh.songcapitaliser.app.controller.splash;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walsh.songcapitaliser.app.R;
import com.walsh.songcapitaliser.app.controller.home.HomeActivity;
import com.walsh.songcapitaliser.app.util.FontManager;

public class SplashFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash, container, false);

        Typeface iconText = FontManager.getTypeface(getContext(), FontManager.FONTAWESOME);
        FontManager.markAsIconContainer(view.findViewById(R.id.fragment_splash), iconText);

        TextView titleText = (TextView)view.findViewById(R.id.titleText);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Pacifico.ttf");
        titleText.setTypeface(typeface);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CountDownTimer timer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent i = new Intent(getActivity(), HomeActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        }.start();
    }
}
