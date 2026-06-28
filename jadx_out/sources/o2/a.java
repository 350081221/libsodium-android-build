package o2;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;
import android.widget.Toast;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20840a = "HuaweiUtils";

    public static void a(Fragment fragment) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity"));
            if (f.g() == 3.1d) {
                fragment.startActivityForResult(intent, 199);
            } else {
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity"));
                fragment.startActivityForResult(intent, 199);
            }
        } catch (ActivityNotFoundException e5) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName("com.Android.settings", "com.android.settings.permission.TabItem"));
            fragment.startActivityForResult(intent2, 199);
            e5.printStackTrace();
            Log.e(f20840a, Log.getStackTraceString(e5));
        } catch (SecurityException e6) {
            Intent intent3 = new Intent();
            intent3.setFlags(268435456);
            intent3.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            fragment.startActivityForResult(intent3, 199);
            Log.e(f20840a, Log.getStackTraceString(e6));
        } catch (Exception e7) {
            Toast.makeText(fragment.getActivity(), "进入设置页面失败，请手动设置", 1).show();
            Log.e(f20840a, Log.getStackTraceString(e7));
        }
    }

    public static boolean b(Context context) {
        return c(context, 24);
    }

    @TargetApi(19)
    private static boolean c(Context context, int i5) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(i5), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Exception e5) {
            Log.e(f20840a, Log.getStackTraceString(e5));
            return false;
        }
    }
}
