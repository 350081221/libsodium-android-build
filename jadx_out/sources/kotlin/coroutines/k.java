package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.a1;
import kotlin.d1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@g1(version = "1.3")
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u001aB\u0015\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0001J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "(Lkotlin/coroutines/Continuation;)V", "initialResult", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "result", "getOrThrow", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@a1
/* loaded from: classes3.dex */
public final class k<T> implements d<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final a f19238b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<k<?>, Object> f19239c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    @l
    private final d<T> f19240a;

    @m
    private volatile Object result;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Rd\u0010\u0003\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006\b"}, d2 = {"Lkotlin/coroutines/SafeContinuation$Companion;", "", "()V", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/SafeContinuation;", "kotlin.jvm.PlatformType", "getRESULT$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        private static /* synthetic */ void a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@l d<? super T> delegate, @m Object obj) {
        l0.p(delegate, "delegate");
        this.f19240a = delegate;
        this.result = obj;
    }

    @a1
    @m
    public final Object b() {
        Object l5;
        Object l6;
        Object l7;
        Object obj = this.result;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<k<?>, Object> atomicReferenceFieldUpdater = f19239c;
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, aVar, l6)) {
                l7 = kotlin.coroutines.intrinsics.d.l();
                return l7;
            }
            obj = this.result;
        }
        if (obj == kotlin.coroutines.intrinsics.a.RESUMED) {
            l5 = kotlin.coroutines.intrinsics.d.l();
            return l5;
        }
        if (!(obj instanceof d1.b)) {
            return obj;
        }
        throw ((d1.b) obj).exception;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d<T> dVar = this.f19240a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @l
    public g getContext() {
        return this.f19240a.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@l Object obj) {
        Object l5;
        Object l6;
        while (true) {
            Object obj2 = this.result;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.UNDECIDED;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.a.a(f19239c, this, aVar, obj)) {
                    return;
                }
            } else {
                l5 = kotlin.coroutines.intrinsics.d.l();
                if (obj2 == l5) {
                    AtomicReferenceFieldUpdater<k<?>, Object> atomicReferenceFieldUpdater = f19239c;
                    l6 = kotlin.coroutines.intrinsics.d.l();
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, l6, kotlin.coroutines.intrinsics.a.RESUMED)) {
                        this.f19240a.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @l
    public String toString() {
        return "SafeContinuation for " + this.f19240a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @a1
    public k(@l d<? super T> delegate) {
        this(delegate, kotlin.coroutines.intrinsics.a.UNDECIDED);
        l0.p(delegate, "delegate");
    }
}
