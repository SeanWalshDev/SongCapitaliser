package com.walsh.songcapitaliser.app.util.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public abstract class AbstractActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();
    protected abstract int getLayout();
    protected abstract int getContainerID();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayout());

        int containerID = getContainerID();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = fragmentManager.findFragmentById(containerID);
        Fragment content;

        if(fragment == null) {
            content = createFragment();
            fragmentTransaction.add(containerID, content);
            fragmentTransaction.commit();
        }
    }
}
