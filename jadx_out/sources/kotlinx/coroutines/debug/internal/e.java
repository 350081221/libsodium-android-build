package kotlinx.coroutines.debug.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.sequences.o;
import kotlin.sequences.q;
import kotlin.sequences.u;
import v3.p;

@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010,\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b8\u00109J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J'\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082Pø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0016R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u0013\u0010,\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010+R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b0\u00101R(\u00107\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lkotlinx/coroutines/debug/internal/e;", "", "", "Ljava/lang/StackTraceElement;", "b", "Lkotlin/sequences/o;", "Lkotlin/coroutines/jvm/internal/e;", TypedValues.AttributesType.S_FRAME, "Lkotlin/r2;", "k", "(Lkotlin/sequences/o;Lkotlin/coroutines/jvm/internal/e;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "state", "Lkotlin/coroutines/d;", "", "shouldBeMatched", "j", "(Ljava/lang/String;Lkotlin/coroutines/d;Z)V", bi.aJ, "toString", "Lkotlinx/coroutines/debug/internal/m;", bi.ay, "Lkotlinx/coroutines/debug/internal/m;", "d", "()Lkotlinx/coroutines/debug/internal/m;", "creationStackBottom", "", "J", "sequenceNumber", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/g;", "c", "Ljava/lang/ref/WeakReference;", "_context", "_state", "Ljava/lang/String;", "", "I", "unmatchedResume", "Ljava/lang/Thread;", "lastObservedThread", "Ljava/lang/Thread;", "_lastObservedFrame", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "e", "()Ljava/util/List;", "creationStackTrace", socket.g.f22386a, "()Ljava/lang/String;", t0.b.f22420d, "f", "()Lkotlin/coroutines/jvm/internal/e;", "i", "(Lkotlin/coroutines/jvm/internal/e;)V", "lastObservedFrame", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/debug/internal/m;J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
/* loaded from: classes4.dex */
public final class e {

    @p4.m
    private volatile WeakReference<kotlin.coroutines.jvm.internal.e> _lastObservedFrame;

    @p4.l
    private volatile String _state = f.f19991a;

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final m f19987a;

    /* renamed from: b, reason: collision with root package name */
    @u3.e
    public final long f19988b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final WeakReference<kotlin.coroutines.g> f19989c;

    /* renamed from: d, reason: collision with root package name */
    private int f19990d;

    @p4.m
    @u3.e
    public volatile Thread lastObservedThread;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Ljava/lang/StackTraceElement;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements p<o<? super StackTraceElement>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ m $bottom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$bottom = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.$bottom, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l o<? super StackTraceElement> oVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                o oVar = (o) this.L$0;
                e eVar = e.this;
                kotlin.coroutines.jvm.internal.e callerFrame = this.$bottom.getCallerFrame();
                this.label = 1;
                if (eVar.k(oVar, callerFrame, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0, 0}, l = {163}, m = "yieldFrames", n = {"this", "$this$yieldFrames", TypedValues.AttributesType.S_FRAME}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.k(null, null, this);
        }
    }

    public e(@p4.m kotlin.coroutines.g gVar, @p4.m m mVar, long j5) {
        this.f19987a = mVar;
        this.f19988b = j5;
        this.f19989c = new WeakReference<>(gVar);
    }

    private final List<StackTraceElement> b() {
        kotlin.sequences.m b5;
        List<StackTraceElement> c32;
        List<StackTraceElement> E;
        m mVar = this.f19987a;
        if (mVar == null) {
            E = w.E();
            return E;
        }
        b5 = q.b(new a(mVar, null));
        c32 = u.c3(b5);
        return c32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004a -> B:11:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.sequences.o<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.e r7, kotlin.coroutines.d<? super kotlin.r2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.e.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.e$b r0 = (kotlinx.coroutines.debug.internal.e.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.e$b r0 = new kotlinx.coroutines.debug.internal.e$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            kotlin.coroutines.jvm.internal.e r6 = (kotlin.coroutines.jvm.internal.e) r6
            java.lang.Object r7 = r0.L$1
            kotlin.sequences.o r7 = (kotlin.sequences.o) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.debug.internal.e r2 = (kotlinx.coroutines.debug.internal.e) r2
            kotlin.e1.n(r8)
            goto L5e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.e1.n(r8)
            r2 = r5
        L41:
            if (r7 != 0) goto L46
            kotlin.r2 r6 = kotlin.r2.f19517a
            return r6
        L46:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L61
            r0.L$0 = r2
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r6.b(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r4 = r7
            r7 = r6
            r6 = r4
        L5e:
            r4 = r7
            r7 = r6
            r6 = r4
        L61:
            kotlin.coroutines.jvm.internal.e r7 = r7.getCallerFrame()
            if (r7 == 0) goto L68
            goto L41
        L68:
            kotlin.r2 r6 = kotlin.r2.f19517a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.e.k(kotlin.sequences.o, kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.m
    public final kotlin.coroutines.g c() {
        return this.f19989c.get();
    }

    @p4.m
    public final m d() {
        return this.f19987a;
    }

    @p4.l
    public final List<StackTraceElement> e() {
        return b();
    }

    @p4.m
    public final kotlin.coroutines.jvm.internal.e f() {
        WeakReference<kotlin.coroutines.jvm.internal.e> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @p4.l
    public final String g() {
        return this._state;
    }

    @p4.l
    public final List<StackTraceElement> h() {
        List<StackTraceElement> E;
        kotlin.coroutines.jvm.internal.e f5 = f();
        if (f5 == null) {
            E = w.E();
            return E;
        }
        ArrayList arrayList = new ArrayList();
        while (f5 != null) {
            StackTraceElement stackTraceElement = f5.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            f5 = f5.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@p4.m kotlin.coroutines.jvm.internal.e eVar) {
        this._lastObservedFrame = eVar != null ? new WeakReference<>(eVar) : null;
    }

    public final synchronized void j(@p4.l String str, @p4.l kotlin.coroutines.d<?> dVar, boolean z4) {
        kotlin.coroutines.jvm.internal.e eVar;
        if (l0.g(this._state, f.f19992b) && l0.g(str, f.f19992b) && z4) {
            this.f19990d++;
        } else if (this.f19990d > 0 && l0.g(str, f.f19993c)) {
            this.f19990d--;
            return;
        }
        if (l0.g(this._state, str) && l0.g(str, f.f19993c) && f() != null) {
            return;
        }
        this._state = str;
        Thread thread = null;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            eVar = (kotlin.coroutines.jvm.internal.e) dVar;
        } else {
            eVar = null;
        }
        i(eVar);
        if (l0.g(str, f.f19992b)) {
            thread = Thread.currentThread();
        }
        this.lastObservedThread = thread;
    }

    @p4.l
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
