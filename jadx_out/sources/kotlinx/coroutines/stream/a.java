package kotlinx.coroutines.stream;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import kotlinx.coroutines.flow.i;
import p4.l;
import p4.m;
import u3.w;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/stream/a;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/stream/Stream;", bi.ay, "Ljava/util/stream/Stream;", "stream", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "<init>", "(Ljava/util/stream/Stream;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class a<T> implements i<T> {

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final AtomicIntegerFieldUpdater f20602b = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed");

    /* renamed from: a, reason: collision with root package name */
    @l
    private final Stream<T> f20603a;

    @w
    private volatile int consumed = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {26}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.stream.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0614a extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0614a(a<T> aVar, kotlin.coroutines.d<? super C0614a> dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public a(@l Stream<T> stream) {
        this.f20603a = stream;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:11:0x0031, B:14:0x0056, B:16:0x005c), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.i
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.stream.a.C0614a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.stream.a$a r0 = (kotlinx.coroutines.stream.a.C0614a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.stream.a$a r0 = new kotlinx.coroutines.stream.a$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.stream.a r4 = (kotlinx.coroutines.stream.a) r4
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L36
            r8 = r2
            goto L56
        L36:
            r7 = move-exception
            goto L79
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            kotlin.e1.n(r8)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = kotlinx.coroutines.stream.a.f20602b
            r2 = 0
            boolean r8 = r8.compareAndSet(r6, r2, r3)
            if (r8 == 0) goto L7f
            java.util.stream.Stream<T> r8 = r6.f20603a     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L77
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L56:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L36
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L36
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L36
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L36
            r0.label = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r8.emit(r2, r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L56
            return r1
        L6f:
            java.util.stream.Stream<T> r7 = r4.f20603a
            r7.close()
            kotlin.r2 r7 = kotlin.r2.f19517a
            return r7
        L77:
            r7 = move-exception
            r4 = r6
        L79:
            java.util.stream.Stream<T> r8 = r4.f20603a
            r8.close()
            throw r7
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Stream.consumeAsFlow can be collected only once"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.a.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }
}
