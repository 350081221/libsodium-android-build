package io.github.aakira.napier;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.apache.commons.logging.LogFactory;
import p4.l;
import p4.m;
import socket.g;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ.\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0001J&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ,\u0010\u0012\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ&\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ,\u0010\u0014\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ&\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ,\u0010\u0016\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ&\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ,\u0010\u0018\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ,\u0010\u001a\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ&\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ,\u0010\u001c\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ.\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\bJ4\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0011J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010 \u001a\u00020\u0004R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006&"}, d2 = {"Lio/github/aakira/napier/e;", "", "Lio/github/aakira/napier/a;", "antilog", "Lkotlin/r2;", bi.ay, "Lio/github/aakira/napier/e$a;", LogFactory.PRIORITY_KEY, "", TTDownloadField.TT_TAG, "", "n", "", "throwable", CrashHianalyticsData.MESSAGE, bi.aE, "v", "Lkotlin/Function0;", "w", "j", "k", "b", "c", bi.aG, "A", "f", g.f22386a, "D", "E", "o", bi.aA, bi.aK, bi.aL, "", "Ljava/util/List;", "baseArray", "<init>", "()V", "napier_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static final e f16219b = new e();

    /* renamed from: a, reason: collision with root package name */
    private static final List<io.github.aakira.napier.a> f16218a = new ArrayList();

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/github/aakira/napier/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "VERBOSE", "DEBUG", "INFO", "WARNING", "ERROR", "ASSERT", "napier_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public enum a {
        VERBOSE,
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        ASSERT
    }

    private e() {
    }

    public static /* synthetic */ void B(e eVar, String str, Throwable th, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        eVar.z(str, th, str2);
    }

    public static /* synthetic */ void C(e eVar, v3.a aVar, Throwable th, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str = null;
        }
        eVar.A(aVar, th, str);
    }

    public static /* synthetic */ void F(e eVar, String str, Throwable th, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        eVar.D(str, th, str2);
    }

    public static /* synthetic */ void G(e eVar, v3.a aVar, Throwable th, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str = null;
        }
        eVar.E(aVar, th, str);
    }

    public static /* synthetic */ void d(e eVar, String str, Throwable th, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        eVar.b(str, th, str2);
    }

    public static /* synthetic */ void e(e eVar, v3.a aVar, Throwable th, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str = null;
        }
        eVar.c(aVar, th, str);
    }

    public static /* synthetic */ void h(e eVar, String str, Throwable th, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        eVar.f(str, th, str2);
    }

    public static /* synthetic */ void i(e eVar, v3.a aVar, Throwable th, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str = null;
        }
        eVar.g(aVar, th, str);
    }

    public static /* synthetic */ void l(e eVar, String str, Throwable th, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        eVar.j(str, th, str2);
    }

    public static /* synthetic */ void m(e eVar, v3.a aVar, Throwable th, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str = null;
        }
        eVar.k(aVar, th, str);
    }

    public static /* synthetic */ void q(e eVar, a aVar, String str, Throwable th, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            th = null;
        }
        eVar.o(aVar, str, th, str2);
    }

    public static /* synthetic */ void r(e eVar, a aVar, String str, Throwable th, v3.a aVar2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            th = null;
        }
        eVar.p(aVar, str, th, aVar2);
    }

    public static /* synthetic */ void x(e eVar, String str, Throwable th, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        eVar.v(str, th, str2);
    }

    public static /* synthetic */ void y(e eVar, v3.a aVar, Throwable th, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        if ((i5 & 4) != 0) {
            str = null;
        }
        eVar.w(aVar, th, str);
    }

    public final void A(@l v3.a<String> message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        p(a.WARNING, str, th, message);
    }

    public final void D(@l String message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        o(a.ASSERT, str, th, message);
    }

    public final void E(@l v3.a<String> message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        p(a.ASSERT, str, th, message);
    }

    public final void a(@l io.github.aakira.napier.a antilog) {
        l0.p(antilog, "antilog");
        f16218a.add(antilog);
    }

    public final void b(@l String message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        o(a.DEBUG, str, th, message);
    }

    public final void c(@l v3.a<String> message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        p(a.DEBUG, str, th, message);
    }

    public final void f(@l String message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        o(a.ERROR, str, th, message);
    }

    public final void g(@l v3.a<String> message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        p(a.ERROR, str, th, message);
    }

    public final void j(@l String message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        o(a.INFO, str, th, message);
    }

    public final void k(@l v3.a<String> message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        p(a.INFO, str, th, message);
    }

    public final boolean n(@l a priority, @m String str) {
        l0.p(priority, "priority");
        List<io.github.aakira.napier.a> list = f16218a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((io.github.aakira.napier.a) it.next()).a(priority, str)) {
                return true;
            }
        }
        return false;
    }

    public final void o(@l a priority, @m String str, @m Throwable th, @l String message) {
        l0.p(priority, "priority");
        l0.p(message, "message");
        if (n(priority, str)) {
            s(priority, str, th, message);
        }
    }

    public final void p(@l a priority, @m String str, @m Throwable th, @l v3.a<String> message) {
        l0.p(priority, "priority");
        l0.p(message, "message");
        if (n(priority, str)) {
            s(priority, str, th, message.invoke());
        }
    }

    @a1
    public final void s(@l a priority, @m String str, @m Throwable th, @m String str2) {
        l0.p(priority, "priority");
        Iterator<T> it = f16218a.iterator();
        while (it.hasNext()) {
            ((io.github.aakira.napier.a) it.next()).d(priority, str, th, str2);
        }
    }

    public final void t() {
        f16218a.clear();
    }

    public final void u(@l io.github.aakira.napier.a antilog) {
        l0.p(antilog, "antilog");
        f16218a.remove(antilog);
    }

    public final void v(@l String message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        o(a.VERBOSE, str, th, message);
    }

    public final void w(@l v3.a<String> message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        p(a.VERBOSE, str, th, message);
    }

    public final void z(@l String message, @m Throwable th, @m String str) {
        l0.p(message, "message");
        o(a.WARNING, str, th, message);
    }
}
