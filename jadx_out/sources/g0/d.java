package g0;

import a1.n;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Collections;
import m0.a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16103a = 1010;

    /* renamed from: b, reason: collision with root package name */
    public static a f16104b;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z4, JSONObject jSONObject, String str);
    }

    public static boolean a(y0.a aVar, int i5, int i6, Intent intent) {
        if (i5 != 1010 || intent == null) {
            return false;
        }
        a aVar2 = f16104b;
        if (aVar2 == null) {
            return true;
        }
        f16104b = null;
        if (i6 != -1) {
            if (i6 != 0) {
                i0.a.i(aVar, i0.b.f16157l, i0.b.f16180w0, "" + i6);
            } else {
                i0.a.d(aVar, i0.b.f16157l, i0.b.f16178v0, intent.toUri(1));
                aVar2.a(false, null, "CANCELED");
            }
        } else {
            i0.a.d(aVar, i0.b.f16157l, i0.b.f16182x0, intent.toUri(1));
            aVar2.a(true, n.t(intent), "OK");
        }
        return true;
    }

    public static boolean b(y0.a aVar, Activity activity, int i5, String str, String str2, a aVar2) {
        try {
            i0.a.c(aVar, i0.b.f16157l, i0.b.f16176u0);
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i5);
            f16104b = aVar2;
            return true;
        } catch (Throwable th) {
            aVar2.a(false, null, "UNKNOWN_ERROR");
            i0.a.e(aVar, i0.b.f16157l, i0.b.f16184y0, th);
            return false;
        }
    }

    public static boolean c(y0.a aVar, Context context) {
        return n.y(aVar, context, Collections.singletonList(new a.b("com.taobao.taobao", 0, "")), false);
    }
}
