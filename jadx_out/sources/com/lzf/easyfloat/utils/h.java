package com.lzf.easyfloat.utils;

import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/lzf/easyfloat/utils/h;", "", "msg", "Lkotlin/r2;", "e", socket.g.f22386a, bi.ay, "i", "c", "", TTDownloadField.TT_TAG, "f", bi.aJ, "b", "j", "d", "Ljava/lang/String;", "", "Z", "logEnable", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final h f9294a = new h();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static String f9295b = "EasyFloat--->";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f9296c;

    private h() {
    }

    public final void a(@l Object msg) {
        l0.p(msg, "msg");
        b(f9295b, msg.toString());
    }

    public final void b(@l String tag, @l String msg) {
        l0.p(tag, "tag");
        l0.p(msg, "msg");
        if (f9296c) {
            Log.d(tag, msg);
        }
    }

    public final void c(@l Object msg) {
        l0.p(msg, "msg");
        d(f9295b, msg.toString());
    }

    public final void d(@l String tag, @l String msg) {
        l0.p(tag, "tag");
        l0.p(msg, "msg");
        if (f9296c) {
            Log.e(tag, msg);
        }
    }

    public final void e(@l Object msg) {
        l0.p(msg, "msg");
        f(f9295b, msg.toString());
    }

    public final void f(@l String tag, @l String msg) {
        l0.p(tag, "tag");
        l0.p(msg, "msg");
        if (f9296c) {
            Log.i(tag, msg);
        }
    }

    public final void g(@l Object msg) {
        l0.p(msg, "msg");
        h(f9295b, msg.toString());
    }

    public final void h(@l String tag, @l String msg) {
        l0.p(tag, "tag");
        l0.p(msg, "msg");
        if (f9296c) {
            Log.v(tag, msg);
        }
    }

    public final void i(@l Object msg) {
        l0.p(msg, "msg");
        j(f9295b, msg.toString());
    }

    public final void j(@l String tag, @l String msg) {
        l0.p(tag, "tag");
        l0.p(msg, "msg");
        if (f9296c) {
            Log.w(tag, msg);
        }
    }
}
