package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.NotInstalledHmsDialogHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* loaded from: classes3.dex */
public class ConnectionErrorMessages {
    public static String getErrorDialogButtonMessage(Activity activity, int i5) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        return ResourceLoaderUtil.getString("hms_confirm");
    }

    public static String getErrorMessage(Activity activity, int i5) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i5 != 1 && i5 != 2) {
            return null;
        }
        return activity.getString(ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints"), NotInstalledHmsDialogHelper.getAppName(activity));
    }

    public static String getErrorTitle(Activity activity, int i5) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i5 == 1 || i5 == 2) {
            return null;
        }
        if (i5 != 3) {
            if (i5 != 9) {
                HMSLog.e("HuaweiApiAvailability", "Unexpected error code " + i5);
                return null;
            }
            HMSLog.e("HuaweiApiAvailability", "Huawei Mobile Services is invalid. Cannot recover.");
            return null;
        }
        return ResourceLoaderUtil.getString("hms_bindfaildlg_message");
    }
}
