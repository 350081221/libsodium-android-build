package n2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import com.lzf.easyfloat.utils.h;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import o2.e;
import o2.f;
import p4.l;
import socket.g;
import u3.m;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006 "}, d2 = {"Ln2/c;", "", "Landroid/content/Context;", d.X, "", bi.ay, "Landroid/app/Activity;", "activity", "Lcom/lzf/easyfloat/interfaces/g;", "onPermissionResult", "Lkotlin/r2;", "j", "e", g.f22386a, "f", "i", bi.aJ, "d", "Landroid/app/Fragment;", "fragment", "b", "c", "k", "(Landroid/app/Fragment;)V", "", "I", "requestCode", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final c f20815a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final int f20816b = 199;

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final String f20817c = "PermissionUtils--->";

    private c() {
    }

    @m
    public static final boolean a(@l Context context) {
        l0.p(context, "context");
        return f20815a.d(context);
    }

    private final void b(Fragment fragment) {
        if (f.f20845a.c()) {
            o2.b.a(fragment);
            return;
        }
        try {
            c(fragment);
        } catch (Exception e5) {
            h hVar = h.f9294a;
            String stackTraceString = Log.getStackTraceString(e5);
            l0.o(stackTraceString, "getStackTraceString(e)");
            hVar.d(f20817c, stackTraceString);
        }
    }

    @m
    public static final void c(@l Fragment fragment) {
        l0.p(fragment, "fragment");
        try {
            Field declaredField = Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION");
            l0.o(declaredField, "clazz.getDeclaredField(\"…NAGE_OVERLAY_PERMISSION\")");
            Intent intent = new Intent(declaredField.get(null).toString());
            intent.setData(Uri.parse(l0.C("package:", fragment.getActivity().getPackageName())));
            fragment.startActivityForResult(intent, 199);
        } catch (Exception e5) {
            h.f9294a.d(f20817c, String.valueOf(e5));
        }
    }

    private final boolean d(Context context) {
        if (f.f20845a.c()) {
            return f(context);
        }
        try {
            Method declaredMethod = Settings.class.getDeclaredMethod("canDrawOverlays", Context.class);
            l0.o(declaredMethod, "clazz.getDeclaredMethod(…ys\", Context::class.java)");
            Object invoke = declaredMethod.invoke(null, context);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception e5) {
            Log.e(f20817c, Log.getStackTraceString(e5));
            return true;
        }
    }

    private final boolean e(Context context) {
        return o2.a.b(context);
    }

    private final boolean f(Context context) {
        return o2.b.b(context);
    }

    private final boolean g(Context context) {
        return o2.c.b(context);
    }

    private final boolean h(Context context) {
        return o2.d.b(context);
    }

    private final boolean i(Context context) {
        return e.b(context);
    }

    @m
    public static final void j(@l Activity activity, @l com.lzf.easyfloat.interfaces.g onPermissionResult) {
        l0.p(activity, "activity");
        l0.p(onPermissionResult, "onPermissionResult");
        b.f20813a.a(activity, onPermissionResult);
    }

    public final void k(@l Fragment fragment) {
        l0.p(fragment, "fragment");
        b(fragment);
    }
}
