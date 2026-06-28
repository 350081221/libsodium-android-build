package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.t0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"", "locked", "Lkotlinx/coroutines/sync/a;", bi.ay, "T", "", "owner", "Lkotlin/Function0;", "action", "e", "(Lkotlinx/coroutines/sync/a;Ljava/lang/Object;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/t0;", "Lkotlinx/coroutines/internal/t0;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "", "c", "I", "TRY_LOCK_SUCCESS", "d", "TRY_LOCK_FAILED", "TRY_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final t0 f20612a = new t0("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final t0 f20613b = new t0("ALREADY_LOCKED_BY_OWNER");

    /* renamed from: c, reason: collision with root package name */
    private static final int f20614c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f20615d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f20616e = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {125}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    @i0(k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexKt$withLock$1\n*L\n1#1,300:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.e(null, null, null, this);
        }
    }

    @l
    public static final kotlinx.coroutines.sync.a a(boolean z4) {
        return new b(z4);
    }

    public static /* synthetic */ kotlinx.coroutines.sync.a b(boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return a(z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(@p4.l kotlinx.coroutines.sync.a r4, @p4.m java.lang.Object r5, @p4.l v3.a<? extends T> r6, @p4.l kotlin.coroutines.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.c.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.c$a r0 = (kotlinx.coroutines.sync.c.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.c$a r0 = new kotlinx.coroutines.sync.c$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$2
            r6 = r4
            v3.a r6 = (v3.a) r6
            java.lang.Object r5 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.a r4 = (kotlinx.coroutines.sync.a) r4
            kotlin.e1.n(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.e1.n(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.f(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.i0.d(r3)
            r4.g(r5)
            kotlin.jvm.internal.i0.c(r3)
            return r6
        L5c:
            r6 = move-exception
            kotlin.jvm.internal.i0.d(r3)
            r4.g(r5)
            kotlin.jvm.internal.i0.c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.c.e(kotlinx.coroutines.sync.a, java.lang.Object, v3.a, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object f(kotlinx.coroutines.sync.a aVar, Object obj, v3.a<? extends T> aVar2, kotlin.coroutines.d<? super T> dVar) {
        kotlin.jvm.internal.i0.e(0);
        aVar.f(obj, dVar);
        kotlin.jvm.internal.i0.e(1);
        try {
            return aVar2.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            aVar.g(obj);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static /* synthetic */ Object g(kotlinx.coroutines.sync.a aVar, Object obj, v3.a aVar2, kotlin.coroutines.d dVar, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.i0.e(0);
        aVar.f(obj, dVar);
        kotlin.jvm.internal.i0.e(1);
        try {
            return aVar2.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            aVar.g(obj);
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
