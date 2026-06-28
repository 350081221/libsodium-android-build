package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.a1;
import kotlin.i0;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0014\u0010\nR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lkotlinx/coroutines/debug/internal/d;", "", "Lkotlin/coroutines/g;", bi.ay, "Lkotlin/coroutines/g;", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/jvm/internal/e;", "b", "Lkotlin/coroutines/jvm/internal/e;", "()Lkotlin/coroutines/jvm/internal/e;", "creationStackBottom", "", "c", "J", "f", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", "d", "Ljava/util/List;", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", socket.g.f22386a, "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "lastObservedThread", "lastObservedFrame", bi.aJ, "lastObservedStackTrace", "Lkotlinx/coroutines/debug/internal/e;", "source", "<init>", "(Lkotlinx/coroutines/debug/internal/e;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@a1
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.g f19979a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final kotlin.coroutines.jvm.internal.e f19980b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19981c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final List<StackTraceElement> f19982d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final String f19983e;

    /* renamed from: f, reason: collision with root package name */
    @p4.m
    private final Thread f19984f;

    /* renamed from: g, reason: collision with root package name */
    @p4.m
    private final kotlin.coroutines.jvm.internal.e f19985g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final List<StackTraceElement> f19986h;

    public d(@p4.l e eVar, @p4.l kotlin.coroutines.g gVar) {
        this.f19979a = gVar;
        this.f19980b = eVar.d();
        this.f19981c = eVar.f19988b;
        this.f19982d = eVar.e();
        this.f19983e = eVar.g();
        this.f19984f = eVar.lastObservedThread;
        this.f19985g = eVar.f();
        this.f19986h = eVar.h();
    }

    @p4.l
    public final kotlin.coroutines.g a() {
        return this.f19979a;
    }

    @p4.m
    public final kotlin.coroutines.jvm.internal.e b() {
        return this.f19980b;
    }

    @p4.l
    public final List<StackTraceElement> c() {
        return this.f19982d;
    }

    @p4.m
    public final kotlin.coroutines.jvm.internal.e d() {
        return this.f19985g;
    }

    @p4.m
    public final Thread e() {
        return this.f19984f;
    }

    public final long f() {
        return this.f19981c;
    }

    @p4.l
    public final String g() {
        return this.f19983e;
    }

    @p4.l
    @u3.h(name = "lastObservedStackTrace")
    public final List<StackTraceElement> h() {
        return this.f19986h;
    }
}
