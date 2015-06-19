// This class is used on all Androids below Honeycomb
package com.eyc.statusBarNotification;


import com.eyc.mobility.R;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;



@SuppressLint("NewApi")
public class StatusNotificationIntent {
    public static Notification buildNotification( Context context, CharSequence tag, CharSequence contentTitle, CharSequence contentText, int flag ) {
        int icon = R.drawable.ic_launcher; 
        long when = System.currentTimeMillis();
        Notification noti = new Notification(icon, contentTitle, when);
        noti.flags |= flag;

        PackageManager pm = context.getPackageManager();
        Intent notificationIntent = pm.getLaunchIntentForPackage(context.getPackageName());
        notificationIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        notificationIntent.putExtra("notificationTag", tag);

        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);
        noti.setLatestEventInfo(context, contentTitle, contentText, contentIntent);
        return noti;
    }
}