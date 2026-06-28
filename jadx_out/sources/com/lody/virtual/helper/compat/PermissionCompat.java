package com.lody.virtual.helper.compat;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.stub.RequestPermissionsActivity;
import com.lody.virtual.server.IRequestPermissionsResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class PermissionCompat {
    public static Set<String> DANGEROUS_PERMISSION = new HashSet<String>() { // from class: com.lody.virtual.helper.compat.PermissionCompat.1
        {
            add("android.permission.READ_CALENDAR");
            add("android.permission.WRITE_CALENDAR");
            add("android.permission.CAMERA");
            add("android.permission.READ_CONTACTS");
            add("android.permission.WRITE_CONTACTS");
            add("android.permission.GET_ACCOUNTS");
            add("android.permission.ACCESS_FINE_LOCATION");
            add("android.permission.ACCESS_COARSE_LOCATION");
            add("android.permission.READ_PHONE_STATE");
            add("android.permission.CALL_PHONE");
            int i5 = Build.VERSION.SDK_INT;
            add("android.permission.READ_CALL_LOG");
            add("android.permission.WRITE_CALL_LOG");
            add("com.android.voicemail.permission.ADD_VOICEMAIL");
            add("android.permission.USE_SIP");
            add("android.permission.PROCESS_OUTGOING_CALLS");
            add("android.permission.SEND_SMS");
            add("android.permission.RECEIVE_SMS");
            add("android.permission.READ_SMS");
            add("android.permission.RECEIVE_WAP_PUSH");
            add("android.permission.RECEIVE_MMS");
            add("android.permission.RECORD_AUDIO");
            add("android.permission.WRITE_EXTERNAL_STORAGE");
            add("android.permission.READ_EXTERNAL_STORAGE");
            add("android.permission.BODY_SENSORS");
            if (i5 >= 31) {
                add("android.permission.BLUETOOTH_CONNECT");
            }
            if (i5 >= 33) {
                add("android.permission.READ_MEDIA_IMAGES");
                add("android.permission.READ_MEDIA_VIDEO");
                add("android.permission.READ_MEDIA_AUDIO");
                add("android.permission.POST_NOTIFICATIONS");
            }
        }
    };

    /* loaded from: classes3.dex */
    public interface CallBack {
        boolean onResult(int i5, String[] strArr, int[] iArr);
    }

    public static boolean checkPermissions(String[] strArr, boolean z4) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!VirtualCore.get().checkSelfPermission(str, z4)) {
                return false;
            }
        }
        return true;
    }

    public static String[] findDangerousPermissions(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (DANGEROUS_PERMISSION.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String[] findDangrousPermissions(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (DANGEROUS_PERMISSION.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean isCheckPermissionRequired(ApplicationInfo applicationInfo) {
        if (VirtualCore.get().getTargetSdkVersion() < 23 || applicationInfo.targetSdkVersion >= 23) {
            return false;
        }
        return true;
    }

    public static boolean isRequestGranted(int[] iArr) {
        for (int i5 : iArr) {
            if (i5 == -1) {
                return false;
            }
        }
        return true;
    }

    public static void startRequestPermissions(Context context, boolean z4, String[] strArr, final CallBack callBack) {
        RequestPermissionsActivity.request(context, z4, strArr, new IRequestPermissionsResult.Stub() { // from class: com.lody.virtual.helper.compat.PermissionCompat.2
            @Override // com.lody.virtual.server.IRequestPermissionsResult
            public boolean onResult(int i5, String[] strArr2, int[] iArr) {
                CallBack callBack2 = CallBack.this;
                if (callBack2 != null) {
                    return callBack2.onResult(i5, strArr2, iArr);
                }
                return false;
            }
        });
    }
}
