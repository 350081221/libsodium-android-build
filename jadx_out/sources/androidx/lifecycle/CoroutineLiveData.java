package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.m3;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BJ\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012-\u0010\u001e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001d¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\tH\u0080@¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\tH\u0014J\b\u0010\u000e\u001a\u00020\tH\u0014R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/n1;", "emitSource$lifecycle_livedata_release", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "emitSource", "Lkotlin/r2;", "clearSource$lifecycle_livedata_release", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "clearSource", "onActive", "onInactive", "Landroidx/lifecycle/BlockRunner;", "blockRunner", "Landroidx/lifecycle/BlockRunner;", "Landroidx/lifecycle/EmittedSource;", "emittedSource", "Landroidx/lifecycle/EmittedSource;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "<init>", "(Lkotlin/coroutines/g;JLv3/p;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {

    @m
    private BlockRunner<T> blockRunner;

    @m
    private EmittedSource emittedSource;

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.CoroutineLiveData$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends n0 implements v3.a<r2> {
        final /* synthetic */ CoroutineLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CoroutineLiveData<T> coroutineLiveData) {
            super(0);
            this.this$0 = coroutineLiveData;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CoroutineLiveData) this.this$0).blockRunner = null;
        }
    }

    public /* synthetic */ CoroutineLiveData(kotlin.coroutines.g gVar, long j5, p pVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? kotlin.coroutines.i.INSTANCE : gVar, (i5 & 2) != 0 ? 5000L : j5, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearSource$lifecycle_livedata_release(@p4.l kotlin.coroutines.d<? super kotlin.r2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r0 = (androidx.lifecycle.CoroutineLiveData) r0
            kotlin.e1.n(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.e1.n(r5)
            androidx.lifecycle.EmittedSource r5 = r4.emittedSource
            if (r5 == 0) goto L47
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.disposeNow(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            r5 = 0
            r0.emittedSource = r5
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.clearSource$lifecycle_livedata_release(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(@p4.l androidx.lifecycle.LiveData<T> r6, @p4.l kotlin.coroutines.d<? super kotlinx.coroutines.n1> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r6 = (androidx.lifecycle.CoroutineLiveData) r6
            kotlin.e1.n(r7)
            goto L66
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.L$1
            androidx.lifecycle.LiveData r6 = (androidx.lifecycle.LiveData) r6
            java.lang.Object r2 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r2 = (androidx.lifecycle.CoroutineLiveData) r2
            kotlin.e1.n(r7)
            r7 = r6
            r6 = r2
            goto L58
        L46:
            kotlin.e1.n(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.clearSource$lifecycle_livedata_release(r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r7 = r6
            r6 = r5
        L58:
            r0.L$0 = r6
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r6, r7, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            androidx.lifecycle.EmittedSource r7 = (androidx.lifecycle.EmittedSource) r7
            r6.emittedSource = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    public CoroutineLiveData(@l kotlin.coroutines.g context, long j5, @l p<? super LiveDataScope<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(block, "block");
        this.blockRunner = new BlockRunner<>(this, block, j5, t0.a(k1.e().C0().plus(context).plus(m3.a((l2) context.get(l2.U)))), new AnonymousClass1(this));
    }
}
