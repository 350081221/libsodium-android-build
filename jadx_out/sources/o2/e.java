package o2;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20844a = "QikuUtils";

    public static void a(Fragment fragment) {
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.Settings$OverlaySettingsActivity");
        if (d(intent, fragment.getActivity())) {
            fragment.startActivityForResult(intent, 199);
            return;
        }
        intent.setClassName("com.qihoo360.mobilesafe", "com.qihoo360.mobilesafe.ui.index.AppEnterActivity");
        if (d(intent, fragment.getActivity())) {
            fragment.startActivityForResult(intent, 199);
        } else {
            Log.e(f20844a, "can't open permission page with particular name, please use \"adb shell dumpsys activity\" command and tell me the name of the float window permission page");
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
            Log.e(f20844a, Log.getStackTraceString(e5));
            return false;
        }
    }

    private static boolean d(Intent intent, Context context) {
        return intent != null && context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
