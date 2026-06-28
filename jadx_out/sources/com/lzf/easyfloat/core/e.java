package com.lzf.easyfloat.core;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.server.content.SyncStorageEngine;
import com.lzf.easyfloat.core.d;
import com.lzf.easyfloat.data.FloatConfig;
import com.lzf.easyfloat.interfaces.a;
import com.lzf.easyfloat.utils.h;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J%\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J-\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0018R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u001a8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/lzf/easyfloat/core/e;", "", "Lcom/lzf/easyfloat/data/FloatConfig;", "config", "", bi.ay, "", TTDownloadField.TT_TAG, "f", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Lkotlin/r2;", "b", TTDownloadField.TT_FORCE, "c", "(Ljava/lang/String;Z)Lkotlin/r2;", "floatTag", "Lcom/lzf/easyfloat/core/d;", bi.aJ, "isShow", "needShow", "i", "(ZLjava/lang/String;Z)Lkotlin/r2;", "e", "Ljava/lang/String;", "DEFAULT_TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", socket.g.f22386a, "()Ljava/util/concurrent/ConcurrentHashMap;", "windowMap", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final String f9235b = "default";

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final e f9234a = new e();

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final ConcurrentHashMap<String, d> f9236c = new ConcurrentHashMap<>();

    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/lzf/easyfloat/core/e$a", "Lcom/lzf/easyfloat/core/d$a;", "", SyncStorageEngine.MESG_SUCCESS, "Lkotlin/r2;", bi.ay, "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FloatConfig f9237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f9238b;

        a(FloatConfig floatConfig, d dVar) {
            this.f9237a = floatConfig;
            this.f9238b = dVar;
        }

        @Override // com.lzf.easyfloat.core.d.a
        public void a(boolean z4) {
            if (z4) {
                ConcurrentHashMap<String, d> g5 = e.f9234a.g();
                String floatTag = this.f9237a.getFloatTag();
                l0.m(floatTag);
                g5.put(floatTag, this.f9238b);
            }
        }
    }

    private e() {
    }

    private final boolean a(FloatConfig floatConfig) {
        floatConfig.setFloatTag(f(floatConfig.getFloatTag()));
        ConcurrentHashMap<String, d> concurrentHashMap = f9236c;
        String floatTag = floatConfig.getFloatTag();
        l0.m(floatTag);
        return concurrentHashMap.containsKey(floatTag);
    }

    public static /* synthetic */ r2 d(e eVar, String str, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return eVar.c(str, z4);
    }

    private final String f(String str) {
        return str == null ? f9235b : str;
    }

    public static /* synthetic */ r2 j(e eVar, boolean z4, String str, boolean z5, int i5, Object obj) {
        FloatConfig r5;
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            d dVar = f9236c.get(str);
            if (dVar == null || (r5 = dVar.r()) == null) {
                z5 = true;
            } else {
                z5 = r5.getNeedShow$easyfloat_release();
            }
        }
        return eVar.i(z4, str, z5);
    }

    public final void b(@l Context context, @l FloatConfig config) {
        a.C0174a a5;
        q<Boolean, String, View, r2> e5;
        l0.p(context, "context");
        l0.p(config, "config");
        if (!a(config)) {
            d dVar = new d(context, config);
            dVar.l(new a(config, dVar));
            return;
        }
        com.lzf.easyfloat.interfaces.d callbacks = config.getCallbacks();
        if (callbacks != null) {
            callbacks.d(false, k2.c.f19073d, null);
        }
        com.lzf.easyfloat.interfaces.a floatCallbacks = config.getFloatCallbacks();
        if (floatCallbacks != null && (a5 = floatCallbacks.a()) != null && (e5 = a5.e()) != null) {
            e5.invoke(Boolean.FALSE, k2.c.f19073d, null);
        }
        h.f9294a.i(k2.c.f19073d);
    }

    @m
    public final r2 c(@m String str, boolean z4) {
        d e5 = e(str);
        if (e5 == null) {
            return null;
        }
        if (z4) {
            e5.z(z4);
        } else {
            e5.p();
        }
        return r2.f19517a;
    }

    @m
    public final d e(@m String str) {
        return f9236c.get(f(str));
    }

    @l
    public final ConcurrentHashMap<String, d> g() {
        return f9236c;
    }

    @m
    public final d h(@m String str) {
        return f9236c.remove(f(str));
    }

    @m
    public final r2 i(boolean z4, @m String str, boolean z5) {
        d e5 = e(str);
        if (e5 == null) {
            return null;
        }
        e5.H(z4 ? 0 : 8, z5);
        return r2.f19517a;
    }
}
