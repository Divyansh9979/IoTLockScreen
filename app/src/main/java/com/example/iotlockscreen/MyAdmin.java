package com.example.iotlockscreen;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by ssaurel on 04/09/2017.
 */
public class MyAdmin extends DeviceAdminReceiver {

    @Override
    public void onEnabled(@androidx.annotation.NonNull Context context, @androidx.annotation.NonNull Intent intent) {
        Toast.makeText(context, "Device Admin : enabled", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDisabled(@androidx.annotation.NonNull Context context, @androidx.annotation.NonNull Intent intent) {
        Toast.makeText(context, "Device Admin : disabled", Toast.LENGTH_SHORT).show();
    }
}
