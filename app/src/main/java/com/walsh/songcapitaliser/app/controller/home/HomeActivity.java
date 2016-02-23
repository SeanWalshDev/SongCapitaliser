package com.walsh.songcapitaliser.app.controller.home;

import android.support.v4.app.Fragment;
import com.walsh.songcapitaliser.app.R;
import com.walsh.songcapitaliser.app.util.android.AbstractActivity;

public class HomeActivity extends AbstractActivity {

    @Override
    protected Fragment createFragment() {
        return null;
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
