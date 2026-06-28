package o2;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20841a = "MeizuUtils";

    public static void a(Fragment fragment) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.putExtra(TTDownloadField.TT_PACKAGE_NAME, fragment.getActivity().getPackageName());
            fragment.startActivityForResult(intent, 199);
        } catch (Exception e5) {
            try {
                Log.e(f20841a, "获取悬浮窗权限, 打开AppSecActivity失败, " + Log.getStackTraceString(e5));
                n2.c.c(fragment);
            } catch (Exception e6) {
                Log.e(f20841a, "获取悬浮窗权限失败, 通用获取方法失败, " + Log.getStackTraceString(e6));
            }
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
            Log.e(f20841a, Log.getStackTraceString(e5));
            return false;
        }
    }
}
