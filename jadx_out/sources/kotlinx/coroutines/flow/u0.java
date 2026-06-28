package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00108\u001a\u00020\u0007¢\u0006\u0004\b9\u0010/J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0016J!\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0003H\u0014J\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J&\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%H\u0016R\u0016\u0010+\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R*\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lkotlinx/coroutines/flow/u0;", "T", "Lkotlinx/coroutines/flow/internal/b;", "Lkotlinx/coroutines/flow/w0;", "Lkotlinx/coroutines/flow/e0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/r;", "", "expectedState", "newState", "", "r", "expect", "update", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", t0.b.f22420d, "b", "(Ljava/lang/Object;)Z", "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "Lkotlinx/coroutines/flow/j;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "", "size", "", bi.aA, "(I)[Lkotlinx/coroutines/flow/w0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", bi.ay, "e", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "", "d", "()Ljava/util/List;", "replayCache", "Lkotlinx/atomicfu/AtomicRef;", "_state", "initialState", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,428:1\n18#2:429\n18#2:443\n28#3,4:430\n28#3,4:437\n20#4:434\n20#4:441\n13579#5,2:435\n329#6:442\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n315#1:429\n396#1:443\n324#1:430,4\n352#1:437,4\n324#1:434\n352#1:441\n348#1:435,2\n385#1:442\n*E\n"})
/* loaded from: classes4.dex */
public final class u0<T> extends kotlinx.coroutines.flow.internal.b<w0> implements e0<T>, c<T>, kotlinx.coroutines.flow.internal.r<T> {

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20224f = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_state");

    @u3.w
    @p4.m
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    private int f20225e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {384, 396, 401}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ u0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0<T> u0Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.this$0 = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public u0(@p4.l Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void q() {
    }

    private final boolean r(Object obj, Object obj2) {
        int i5;
        w0[] n5;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20224f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.l0.g(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.l0.g(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i6 = this.f20225e;
            if ((i6 & 1) == 0) {
                int i7 = i6 + 1;
                this.f20225e = i7;
                w0[] n6 = n();
                r2 r2Var = r2.f19517a;
                while (true) {
                    w0[] w0VarArr = n6;
                    if (w0VarArr != null) {
                        for (w0 w0Var : w0VarArr) {
                            if (w0Var != null) {
                                w0Var.h();
                            }
                        }
                    }
                    synchronized (this) {
                        i5 = this.f20225e;
                        if (i5 == i7) {
                            this.f20225e = i7 + 1;
                            return true;
                        }
                        n5 = n();
                        r2 r2Var2 = r2.f19517a;
                    }
                    n6 = n5;
                    i7 = i5;
                }
            } else {
                this.f20225e = i6 + 2;
                return true;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.r
    @p4.l
    public i<T> a(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return v0.d(this, gVar, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.d0
    public boolean b(T t5) {
        setValue(t5);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        if (kotlin.jvm.internal.l0.g(r11, r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d8 -> B:14:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ea -> B:14:0x00a6). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r11, @p4.l kotlin.coroutines.d<?> r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u0.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.e0
    public boolean compareAndSet(T t5, T t6) {
        if (t5 == null) {
            t5 = (T) kotlinx.coroutines.flow.internal.u.f20143a;
        }
        if (t6 == null) {
            t6 = (T) kotlinx.coroutines.flow.internal.u.f20143a;
        }
        return r(t5, t6);
    }

    @Override // kotlinx.coroutines.flow.i0
    @p4.l
    public List<T> d() {
        List<T> k5;
        k5 = kotlin.collections.v.k(getValue());
        return k5;
    }

    @Override // kotlinx.coroutines.flow.d0, kotlinx.coroutines.flow.j
    @p4.m
    public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        setValue(t5);
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.flow.d0
    public void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.e0, kotlinx.coroutines.flow.t0
    public T getValue() {
        kotlinx.coroutines.internal.t0 t0Var = kotlinx.coroutines.flow.internal.u.f20143a;
        T t5 = (T) f20224f.get(this);
        if (t5 == t0Var) {
            return null;
        }
        return t5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.b
    @p4.l
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public w0 i() {
        return new w0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.b
    @p4.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public w0[] j(int i5) {
        return new w0[i5];
    }

    @Override // kotlinx.coroutines.flow.e0
    public void setValue(T t5) {
        if (t5 == null) {
            t5 = (T) kotlinx.coroutines.flow.internal.u.f20143a;
        }
        r(null, t5);
    }
}
