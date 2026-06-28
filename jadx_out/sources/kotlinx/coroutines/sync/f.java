package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.internal.y0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013\"\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"", "permits", "acquiredPermits", "Lkotlinx/coroutines/sync/d;", bi.ay, "T", "Lkotlin/Function0;", "action", "k", "(Lkotlinx/coroutines/sync/d;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "Lkotlinx/coroutines/sync/g;", "prev", "j", "I", "MAX_SPIN_CYCLES", "Lkotlinx/coroutines/internal/t0;", "b", "Lkotlinx/coroutines/internal/t0;", "PERMIT", "c", "TAKEN", "d", "BROKEN", "e", "CANCELLED", "f", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20624a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final t0 f20625b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final t0 f20626c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final t0 f20627d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final t0 f20628e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f20629f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {86}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt$withPermit$1\n*L\n1#1,397:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return f.k(null, null, this);
        }
    }

    static {
        int e5;
        int e6;
        e5 = y0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f20624a = e5;
        f20625b = new t0("PERMIT");
        f20626c = new t0("TAKEN");
        f20627d = new t0("BROKEN");
        f20628e = new t0("CANCELLED");
        e6 = y0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f20629f = e6;
    }

    @l
    public static final d a(int i5, int i6) {
        return new e(i5, i6);
    }

    public static /* synthetic */ d b(int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return a(i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g j(long j5, g gVar) {
        return new g(j5, gVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@p4.l kotlinx.coroutines.sync.d r4, @p4.l v3.a<? extends T> r5, @p4.l kotlin.coroutines.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.f.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.f$a r0 = (kotlinx.coroutines.sync.f.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.f$a r0 = new kotlinx.coroutines.sync.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            v3.a r5 = (v3.a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.d r4 = (kotlinx.coroutines.sync.d) r4
            kotlin.e1.n(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.e1.n(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.e(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L58
            kotlin.jvm.internal.i0.d(r3)
            r4.release()
            kotlin.jvm.internal.i0.c(r3)
            return r5
        L58:
            r5 = move-exception
            kotlin.jvm.internal.i0.d(r3)
            r4.release()
            kotlin.jvm.internal.i0.c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.f.k(kotlinx.coroutines.sync.d, v3.a, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object l(d dVar, v3.a<? extends T> aVar, kotlin.coroutines.d<? super T> dVar2) {
        kotlin.jvm.internal.i0.e(0);
        dVar.e(dVar2);
        kotlin.jvm.internal.i0.e(1);
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            dVar.release();
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
