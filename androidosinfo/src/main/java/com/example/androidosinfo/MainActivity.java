package com.example.androidosinfo;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Build.BOARD;

        //System.getProperty();
        String property = System.getProperty("os.version");

        ActivityInfo activityInfo = new ActivityInfo();
        ServiceInfo serviceInfo = new ServiceInfo();
        ApplicationInfo applicationInfo = new ApplicationInfo();
        PackageInfo packageInfo = new PackageInfo();
        ResolveInfo resolveInfo = new ResolveInfo();

        PackageManager packageManager = this.getPackageManager();
//        try {
//             ApplicationInfo applicationInfo1 = packageManager.getApplicationInfo("com.example.androidosinfo", PackageManager.GET_UNINSTALLED_PACKAGES);
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//        }

        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(PackageManager.GET_UNINSTALLED_PACKAGES);

        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(PackageManager.GET_UNINSTALLED_PACKAGES);

//        packageManager.queryIntentActivities();
//        packageManager.queryIntentServices();
//        packageManager.resolveActivity();
//        packageManager.resolveService();



    }
}
