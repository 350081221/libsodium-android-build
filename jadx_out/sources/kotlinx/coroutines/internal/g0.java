package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.x2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u001e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lkotlinx/coroutines/internal/g0;", "Lkotlinx/coroutines/x2;", "Lkotlinx/coroutines/c1;", "", "F0", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "isDispatchNeeded", "", "parallelism", "Lkotlinx/coroutines/n0;", "limitedParallelism", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/n1;", "I", "E0", "Lkotlinx/coroutines/p;", "Lkotlin/r2;", "continuation", "G0", "", "toString", "", bi.ay, "Ljava/lang/Throwable;", "cause", "b", "Ljava/lang/String;", "errorHint", "C0", "()Lkotlinx/coroutines/x2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes4.dex */
public final class g0 extends x2 implements kotlinx.coroutines.c1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final Throwable f20356a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final String f20357b;

    public /* synthetic */ g0(Throwable th, String str, int i5, kotlin.jvm.internal.w wVar) {
        this(th, (i5 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void F0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f20356a
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f20357b
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f20356a
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.f0.e()
            kotlin.y r0 = new kotlin.y
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g0.F0():java.lang.Void");
    }

    @Override // kotlinx.coroutines.x2
    @p4.l
    public x2 C0() {
        return this;
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public Void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        F0();
        throw new kotlin.y();
    }

    @Override // kotlinx.coroutines.c1
    @p4.l
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public Void p(long j5, @p4.l kotlinx.coroutines.p<? super r2> pVar) {
        F0();
        throw new kotlin.y();
    }

    @Override // kotlinx.coroutines.c1
    @p4.l
    public n1 I(long j5, @p4.l Runnable runnable, @p4.l kotlin.coroutines.g gVar) {
        F0();
        throw new kotlin.y();
    }

    @Override // kotlinx.coroutines.n0
    public boolean isDispatchNeeded(@p4.l kotlin.coroutines.g gVar) {
        F0();
        throw new kotlin.y();
    }

    @Override // kotlinx.coroutines.x2, kotlinx.coroutines.n0
    @p4.l
    public kotlinx.coroutines.n0 limitedParallelism(int i5) {
        F0();
        throw new kotlin.y();
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @p4.m
    public Object p0(long j5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return c1.a.a(this, j5, dVar);
    }

    @Override // kotlinx.coroutines.x2, kotlinx.coroutines.n0
    @p4.l
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f20356a != null) {
            str = ", cause=" + this.f20356a;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public g0(@p4.m Throwable th, @p4.m String str) {
        this.f20356a = th;
        this.f20357b = str;
    }
}
