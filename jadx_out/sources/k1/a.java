package k1;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.mediation.IMediationManager;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    public static String a(Context context) {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(1004, context);
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            return (String) mediationManager.mtool(1007, create.build());
        }
        return "";
    }

    public static boolean b() {
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            Object mtool = mediationManager.mtool(1001, null);
            if (mtool instanceof Boolean) {
                return ((Boolean) mtool).booleanValue();
            }
            return false;
        }
        return false;
    }

    public static boolean c(String str) {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(1001, str);
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            return ((Boolean) mediationManager.mtool(1010, create.build())).booleanValue();
        }
        return false;
    }

    public static boolean d(String str, String str2) {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(1001, str);
        create.add(1002, str2);
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            Object mtool = mediationManager.mtool(1002, create.build());
            if (mtool instanceof Boolean) {
                return ((Boolean) mtool).booleanValue();
            }
            return false;
        }
        return false;
    }

    public static j1.a e(String str) {
        Map map;
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(1001, str);
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager == null || (map = (Map) mediationManager.mtool(PointerIconCompat.TYPE_COPY, create.build())) == null) {
            return null;
        }
        String str2 = (String) map.get("networdSdkVersion");
        String str3 = (String) map.get("adapterSdkVersion");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new j1.a(str2, str3);
    }

    public static String f() {
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            return TTAdSdk.getAdManager().getSDKVersion();
        }
        return "";
    }

    public static boolean g(String str, String str2) {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(1001, str);
        create.add(1003, str2);
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            Object mtool = mediationManager.mtool(1003, create.build());
            if (mtool instanceof Boolean) {
                return ((Boolean) mtool).booleanValue();
            }
            return false;
        }
        return false;
    }

    public static String h() {
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            return (String) mediationManager.mtool(1005, null);
        }
        return "";
    }

    public static String i() {
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            return (String) mediationManager.mtool(1006, null);
        }
        return "";
    }

    public static void j() {
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            mediationManager.mtool(PointerIconCompat.TYPE_TEXT, null);
        }
    }

    public static void k() {
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            mediationManager.mtool(PointerIconCompat.TYPE_VERTICAL_TEXT, null);
        }
    }
}
