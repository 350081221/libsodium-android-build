package i1;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.mtesttools.act.TestToolMainActivity;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.mediation.IMediationManager;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0451a f16197a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f16198b = "";

    /* renamed from: i1.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0451a {
        void a(ImageView imageView, String str);
    }

    public static String a(Context context) {
        if (TextUtils.isEmpty(f16198b) && context != null) {
            try {
                f16198b = context.getPackageName();
            } catch (Throwable unused) {
            }
        }
        return f16198b;
    }

    public static void b(Context context, InterfaceC0451a interfaceC0451a) {
        f16197a = interfaceC0451a;
        Intent intent = new Intent(context, (Class<?>) TestToolMainActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static void c(ImageView imageView, String str) {
        if (f16197a != null && imageView != null && !TextUtils.isEmpty(str)) {
            f16197a.a(imageView, str);
        }
    }

    public static void d(TTCustomController tTCustomController) {
        IMediationManager mediationManager = TTAdSdk.getMediationManager();
        if (mediationManager != null) {
            mediationManager.updatePrivacyConfig(tTCustomController);
        }
    }
}
