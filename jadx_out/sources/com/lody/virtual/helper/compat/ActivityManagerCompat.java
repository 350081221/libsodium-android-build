package com.lody.virtual.helper.compat;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import mirror.RefStaticInt;
import mirror.android.app.ActivityManager;
import mirror.android.app.ActivityManagerNative;
import mirror.android.app.IActivityManager;
import mirror.android.app.IActivityManagerN;

/* loaded from: classes3.dex */
public class ActivityManagerCompat {
    public static final int INTENT_SENDER_ACTIVITY = 2;
    public static final int INTENT_SENDER_ACTIVITY_RESULT = 3;
    public static final int INTENT_SENDER_BROADCAST = 1;
    public static final int INTENT_SENDER_SERVICE = 4;
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    public static final int START_INTENT_NOT_RESOLVED;
    public static final int START_NOT_CURRENT_USER_ACTIVITY;
    public static final int START_TASK_TO_FRONT;
    public static final int USER_OP_SUCCESS = 0;

    static {
        int i5;
        int i6;
        int i7;
        RefStaticInt refStaticInt = ActivityManager.START_INTENT_NOT_RESOLVED;
        if (refStaticInt == null) {
            i5 = -1;
        } else {
            i5 = refStaticInt.get();
        }
        START_INTENT_NOT_RESOLVED = i5;
        RefStaticInt refStaticInt2 = ActivityManager.START_NOT_CURRENT_USER_ACTIVITY;
        if (refStaticInt2 == null) {
            i6 = -8;
        } else {
            i6 = refStaticInt2.get();
        }
        START_NOT_CURRENT_USER_ACTIVITY = i6;
        RefStaticInt refStaticInt3 = ActivityManager.START_TASK_TO_FRONT;
        if (refStaticInt3 == null) {
            i7 = 2;
        } else {
            i7 = refStaticInt3.get();
        }
        START_TASK_TO_FRONT = i7;
    }

    public static boolean finishActivity(IBinder iBinder, int i5, Intent intent) {
        return IActivityManagerN.finishActivity.call(ActivityManagerNative.getDefault.call(new Object[0]), iBinder, Integer.valueOf(i5), intent, 0).booleanValue();
    }

    public static void setActivityOrientation(Activity activity, int i5) {
        try {
            activity.setRequestedOrientation(i5);
        } catch (Throwable th) {
            th.printStackTrace();
            Activity activity2 = mirror.android.app.Activity.mParent.get(activity);
            while (activity2 != null) {
                activity2 = mirror.android.app.Activity.mParent.get(activity2);
            }
            try {
                IActivityManager.setRequestedOrientation.call(ActivityManagerNative.getDefault.call(new Object[0]), mirror.android.app.Activity.mToken.get(activity2), Integer.valueOf(i5));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
