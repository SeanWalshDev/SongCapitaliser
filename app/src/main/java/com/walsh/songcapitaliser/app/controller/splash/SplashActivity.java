package com.walsh.songcapitaliser.app.controller.splash;

import android.support.v4.app.Fragment;
import com.walsh.songcapitaliser.app.R;
import com.walsh.songcapitaliser.app.util.android.AbstractActivity;

public class SplashActivity extends AbstractActivity {

    @Override
    protected Fragment createFragment() {
        return new SplashFragment();
    }

    @Override
    protected int getContainerID() {
        return R.id.fragment_container;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_container;
    }
}
