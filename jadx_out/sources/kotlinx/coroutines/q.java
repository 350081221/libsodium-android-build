package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001f\u0012\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000d\u0012\u0006\u0010(\u001a\u00020#¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0017\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082\bJ;\u0010\u0015\u001a\u00020\r2'\u0010\u0014\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u00132\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001e\u0010\u0018\u001a\u00020\r2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001dH\u0002J\u001a\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0002J1\u0010\"\u001a\u00020!2'\u0010\u0014\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u0013H\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0002JS\u0010+\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u001d2\u0006\u0010(\u001a\u00020#2#\u0010)\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\b\u0010*\u001a\u0004\u0018\u00010\u001dH\u0002JA\u0010\u0001\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u001d2\u0006\u0010(\u001a\u00020#2%\b\u0002\u0010)\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0002JC\u0010-\u001a\u0004\u0018\u00010,2\b\u0010'\u001a\u0004\u0018\u00010\u001d2\b\u0010*\u001a\u0004\u0018\u00010\u001d2#\u0010)\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0002J\u0012\u0010/\u001a\u00020.2\b\u0010'\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u00100\u001a\u00020\rH\u0002J\b\u00101\u001a\u00020\rH\u0016J\b\u00102\u001a\u00020\u0007H\u0001J\u0010\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`4H\u0016J\u0011\u00106\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0017\u0010<\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020!2\b\u0010\n\u001a\u0004\u0018\u00010\tJ1\u0010?\u001a\u00020\r2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0016J\n\u0010C\u001a\u0004\u0018\u00010\u001dH\u0001J\u000f\u0010D\u001a\u00020\rH\u0000¢\u0006\u0004\bD\u0010EJ \u0010H\u001a\u00020\r2\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ<\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00028\u00002#\u0010)\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0016¢\u0006\u0004\bK\u0010LJ\u001c\u0010N\u001a\u00020\r2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010M\u001a\u00020#H\u0016J1\u0010O\u001a\u00020\r2'\u0010\u0014\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u0013H\u0016J\u000f\u0010P\u001a\u00020\rH\u0000¢\u0006\u0004\bP\u0010EJ#\u0010Q\u001a\u0004\u0018\u00010\u001d2\u0006\u0010J\u001a\u00028\u00002\b\u0010*\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\bQ\u0010RJH\u0010S\u001a\u0004\u0018\u00010\u001d2\u0006\u0010J\u001a\u00028\u00002\b\u0010*\u001a\u0004\u0018\u00010\u001d2#\u0010)\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0016¢\u0006\u0004\bS\u0010TJ\u0012\u0010V\u001a\u0004\u0018\u00010\u001d2\u0006\u0010U\u001a\u00020\tH\u0016J\u0010\u0010X\u001a\u00020\r2\u0006\u0010W\u001a\u00020\u001dH\u0016J\u001b\u0010Z\u001a\u00020\r*\u00020Y2\u0006\u0010J\u001a\u00028\u0000H\u0016¢\u0006\u0004\bZ\u0010[J\u0014\u0010\\\u001a\u00020\r*\u00020Y2\u0006\u0010U\u001a\u00020\tH\u0016J\u001f\u0010]\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u0004\u0018\u00010\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\b_\u0010`J\b\u0010b\u001a\u00020aH\u0016J\b\u0010c\u001a\u00020aH\u0014R \u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010k\u001a\u0004\bl\u0010mR\u0016\u0010q\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u00107R\u0014\u0010v\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010wR\u0014\u0010y\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010wR\u001c\u0010|\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u000b\u0010~\u001a\u00020}8\u0002X\u0082\u0004R\u0014\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u007f8\u0002X\u0082\u0004R\u0014\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u007f8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0084\u0001"}, d2 = {"Lkotlinx/coroutines/q;", "T", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/p;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/z3;", "", "J", "", "cause", "v", "Lkotlin/Function0;", "Lkotlin/r2;", "block", "r", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "q", "Lkotlinx/coroutines/internal/q0;", "segment", bi.aL, "Y", "W", "Lkotlinx/coroutines/n1;", "H", "", "I", "state", "O", "Lkotlinx/coroutines/n;", "N", "", "mode", "y", "Lkotlinx/coroutines/b3;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "V", "Lkotlinx/coroutines/internal/t0;", "X", "", "o", "x", "B", "S", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "n", "()Ljava/lang/Object;", "takenState", "f", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", bi.ay, "Q", "(Ljava/lang/Throwable;)V", bi.aA, bi.aE, "Lkotlinx/coroutines/l2;", "parent", "A", "E", "R", "()V", "Lkotlin/d1;", "result", "resumeWith", "(Ljava/lang/Object;)V", t0.b.f22420d, "C", "(Ljava/lang/Object;Lv3/l;)V", "index", "b", socket.g.f22386a, "w", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", bi.aK, "(Ljava/lang/Object;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;", "exception", "i", "token", "K", "Lkotlinx/coroutines/n0;", bi.aG, "(Lkotlinx/coroutines/n0;Ljava/lang/Object;)V", "k", "l", "(Ljava/lang/Object;)Ljava/lang/Object;", "j", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "P", "Lkotlin/coroutines/d;", "d", "Lkotlin/coroutines/d;", bi.aJ, "()Lkotlin/coroutines/d;", "delegate", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "D", "()Lkotlinx/coroutines/n1;", "parentHandle", "G", "()Ljava/lang/String;", "stateDebugRepresentation", "F", "isActive", "()Z", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "<init>", "(Lkotlin/coroutines/d;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.a1
@kotlin.jvm.internal.r1({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
/* loaded from: classes4.dex */
public class q<T> extends h1<T> implements p<T>, kotlin.coroutines.jvm.internal.e, z3 {

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20439f = AtomicIntegerFieldUpdater.newUpdater(q.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20440g = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20441h = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_parentHandle");

    @u3.w
    private volatile int _decisionAndIndex;

    @u3.w
    @p4.m
    private volatile Object _parentHandle;

    @u3.w
    @p4.m
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.d<T> f20442d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.g f20443e;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@p4.l kotlin.coroutines.d<? super T> dVar, int i5) {
        super(i5);
        this.f20442d = dVar;
        this.f20443e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.f19949a;
    }

    private final n1 D() {
        return (n1) f20441h.get(this);
    }

    private final String G() {
        Object F = F();
        if (F instanceof b3) {
            return "Active";
        }
        if (F instanceof t) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final n1 H() {
        l2 l2Var = (l2) getContext().get(l2.U);
        if (l2Var == null) {
            return null;
        }
        n1 g5 = l2.a.g(l2Var, true, false, new u(this), 2, null);
        androidx.concurrent.futures.a.a(f20441h, this, null, g5);
        return g5;
    }

    private final void I(Object obj) {
        boolean z4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20440g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.a.a(f20440g, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof n) {
                    z4 = true;
                } else {
                    z4 = obj2 instanceof kotlinx.coroutines.internal.q0;
                }
                if (z4) {
                    O(obj, obj2);
                } else {
                    boolean z5 = obj2 instanceof d0;
                    if (z5) {
                        d0 d0Var = (d0) obj2;
                        if (!d0Var.b()) {
                            O(obj, obj2);
                        }
                        if (obj2 instanceof t) {
                            Throwable th = null;
                            if (!z5) {
                                d0Var = null;
                            }
                            if (d0Var != null) {
                                th = d0Var.f19951a;
                            }
                            if (obj instanceof n) {
                                p((n) obj, th);
                                return;
                            } else {
                                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                t((kotlinx.coroutines.internal.q0) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof c0) {
                        c0 c0Var = (c0) obj2;
                        if (c0Var.f19863b != null) {
                            O(obj, obj2);
                        }
                        if (obj instanceof kotlinx.coroutines.internal.q0) {
                            return;
                        }
                        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        n nVar = (n) obj;
                        if (c0Var.h()) {
                            p(nVar, c0Var.f19866e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.a.a(f20440g, this, obj2, c0.g(c0Var, null, nVar, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof kotlinx.coroutines.internal.q0) {
                            return;
                        }
                        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.a.a(f20440g, this, obj2, new c0(obj2, (n) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final boolean J() {
        if (i1.d(this.f20294c)) {
            kotlin.coroutines.d<T> dVar = this.f20442d;
            kotlin.jvm.internal.l0.n(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((kotlinx.coroutines.internal.l) dVar).t()) {
                return true;
            }
        }
        return false;
    }

    private final void L(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, v3.l<? super Integer, kotlin.r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void M(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, kotlin.r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final n N(v3.l<? super Throwable, kotlin.r2> lVar) {
        return lVar instanceof n ? (n) lVar : new i2(lVar);
    }

    private final void O(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void T(Object obj, int i5, v3.l<? super Throwable, kotlin.r2> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20440g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof b3) {
            } else {
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.c()) {
                        if (lVar != null) {
                            s(lVar, tVar.f19951a);
                            return;
                        }
                        return;
                    }
                }
                o(obj);
                throw new kotlin.y();
            }
        } while (!androidx.concurrent.futures.a.a(f20440g, this, obj2, V((b3) obj2, obj, i5, lVar, null)));
        x();
        y(i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void U(q qVar, Object obj, int i5, v3.l lVar, int i6, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        qVar.T(obj, i5, lVar);
    }

    private final Object V(b3 b3Var, Object obj, int i5, v3.l<? super Throwable, kotlin.r2> lVar, Object obj2) {
        n nVar;
        if (!(obj instanceof d0)) {
            if (i1.c(i5) || obj2 != null) {
                if (lVar != null || (b3Var instanceof n) || obj2 != null) {
                    if (b3Var instanceof n) {
                        nVar = (n) b3Var;
                    } else {
                        nVar = null;
                    }
                    return new c0(obj, nVar, lVar, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    private final boolean W() {
        int i5;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20439f;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f20439f.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
        return true;
    }

    private final kotlinx.coroutines.internal.t0 X(Object obj, Object obj2, v3.l<? super Throwable, kotlin.r2> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20440g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof b3) {
            } else {
                if (!(obj3 instanceof c0) || obj2 == null || ((c0) obj3).f19865d != obj2) {
                    return null;
                }
                return r.f20456g;
            }
        } while (!androidx.concurrent.futures.a.a(f20440g, this, obj3, V((b3) obj3, obj, this.f20294c, lVar, obj2)));
        x();
        return r.f20456g;
    }

    private final boolean Y() {
        int i5;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20439f;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f20439f.compareAndSet(this, i5, 536870912 + (536870911 & i5)));
        return true;
    }

    private final void Z(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, v3.l<? super Integer, Integer> lVar, Object obj) {
        int i5;
        do {
            i5 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i5, lVar.invoke(Integer.valueOf(i5)).intValue()));
    }

    private final Void o(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void q(v3.l<? super Throwable, kotlin.r2> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            p0.b(getContext(), new g0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void r(v3.a<kotlin.r2> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            p0.b(getContext(), new g0("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final void t(kotlinx.coroutines.internal.q0<?> q0Var, Throwable th) {
        boolean z4;
        int i5 = f20439f.get(this) & 536870911;
        if (i5 != 536870911) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            try {
                q0Var.q(i5, th, getContext());
                return;
            } catch (Throwable th2) {
                p0.b(getContext(), new g0("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    private final boolean v(Throwable th) {
        if (!J()) {
            return false;
        }
        kotlin.coroutines.d<T> dVar = this.f20442d;
        kotlin.jvm.internal.l0.n(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.internal.l) dVar).w(th);
    }

    private final void x() {
        if (J()) {
            return;
        }
        w();
    }

    private final void y(int i5) {
        if (W()) {
            return;
        }
        i1.a(this, i5);
    }

    @p4.l
    public Throwable A(@p4.l l2 l2Var) {
        return l2Var.y();
    }

    @Override // kotlinx.coroutines.p
    public void B() {
        n1 H = H();
        if (H != null && d()) {
            H.dispose();
            f20441h.set(this, a3.f19846a);
        }
    }

    @Override // kotlinx.coroutines.p
    public void C(T t5, @p4.m v3.l<? super Throwable, kotlin.r2> lVar) {
        T(t5, this.f20294c, lVar);
    }

    @kotlin.a1
    @p4.m
    public final Object E() {
        l2 l2Var;
        Object l5;
        boolean J = J();
        if (Y()) {
            if (D() == null) {
                H();
            }
            if (J) {
                R();
            }
            l5 = kotlin.coroutines.intrinsics.d.l();
            return l5;
        }
        if (J) {
            R();
        }
        Object F = F();
        if (!(F instanceof d0)) {
            if (i1.c(this.f20294c) && (l2Var = (l2) getContext().get(l2.U)) != null && !l2Var.isActive()) {
                CancellationException y4 = l2Var.y();
                f(F, y4);
                throw y4;
            }
            return l(F);
        }
        throw ((d0) F).f19951a;
    }

    @p4.m
    public final Object F() {
        return f20440g.get(this);
    }

    @Override // kotlinx.coroutines.p
    public void K(@p4.l Object obj) {
        y(this.f20294c);
    }

    @p4.l
    protected String P() {
        return "CancellableContinuation";
    }

    public final void Q(@p4.l Throwable th) {
        if (v(th)) {
            return;
        }
        a(th);
        x();
    }

    public final void R() {
        kotlinx.coroutines.internal.l lVar;
        Throwable E;
        kotlin.coroutines.d<T> dVar = this.f20442d;
        if (dVar instanceof kotlinx.coroutines.internal.l) {
            lVar = (kotlinx.coroutines.internal.l) dVar;
        } else {
            lVar = null;
        }
        if (lVar != null && (E = lVar.E(this)) != null) {
            w();
            a(E);
        }
    }

    @u3.h(name = "resetStateReusable")
    public final boolean S() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20440g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof c0) && ((c0) obj).f19865d != null) {
            w();
            return false;
        }
        f20439f.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, d.f19949a);
        return true;
    }

    @Override // kotlinx.coroutines.p
    public boolean a(@p4.m Throwable th) {
        Object obj;
        boolean z4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20440g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z4 = false;
            if (!(obj instanceof b3)) {
                return false;
            }
            if ((obj instanceof n) || (obj instanceof kotlinx.coroutines.internal.q0)) {
                z4 = true;
            }
        } while (!androidx.concurrent.futures.a.a(f20440g, this, obj, new t(this, th, z4)));
        b3 b3Var = (b3) obj;
        if (b3Var instanceof n) {
            p((n) obj, th);
        } else if (b3Var instanceof kotlinx.coroutines.internal.q0) {
            t((kotlinx.coroutines.internal.q0) obj, th);
        }
        x();
        y(this.f20294c);
        return true;
    }

    @Override // kotlinx.coroutines.z3
    public void b(@p4.l kotlinx.coroutines.internal.q0<?> q0Var, int i5) {
        int i6;
        boolean z4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20439f;
        do {
            i6 = atomicIntegerFieldUpdater.get(this);
            if ((i6 & 536870911) == 536870911) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, ((i6 >> 29) << 29) + i5));
        I(q0Var);
    }

    @Override // kotlinx.coroutines.p
    public boolean d() {
        return !(F() instanceof b3);
    }

    @Override // kotlinx.coroutines.p
    @p4.m
    public Object e(T t5, @p4.m Object obj) {
        return X(t5, obj, null);
    }

    @Override // kotlinx.coroutines.h1
    public void f(@p4.m Object obj, @p4.l Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20440g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof b3)) {
                if (obj2 instanceof d0) {
                    return;
                }
                if (obj2 instanceof c0) {
                    c0 c0Var = (c0) obj2;
                    if (!c0Var.h()) {
                        if (androidx.concurrent.futures.a.a(f20440g, this, obj2, c0.g(c0Var, null, null, null, null, th, 15, null))) {
                            c0Var.i(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (androidx.concurrent.futures.a.a(f20440g, this, obj2, new c0(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.p
    public void g(@p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        I(N(lVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f20442d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @p4.l
    public kotlin.coroutines.g getContext() {
        return this.f20443e;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.h1
    @p4.l
    public final kotlin.coroutines.d<T> h() {
        return this.f20442d;
    }

    @Override // kotlinx.coroutines.p
    @p4.m
    public Object i(@p4.l Throwable th) {
        return X(new d0(th, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.p
    public boolean isActive() {
        return F() instanceof b3;
    }

    @Override // kotlinx.coroutines.p
    public boolean isCancelled() {
        return F() instanceof t;
    }

    @Override // kotlinx.coroutines.h1
    @p4.m
    public Throwable j(@p4.m Object obj) {
        Throwable j5 = super.j(obj);
        if (j5 != null) {
            return j5;
        }
        return null;
    }

    @Override // kotlinx.coroutines.p
    public void k(@p4.l n0 n0Var, @p4.l Throwable th) {
        kotlinx.coroutines.internal.l lVar;
        int i5;
        kotlin.coroutines.d<T> dVar = this.f20442d;
        n0 n0Var2 = null;
        if (dVar instanceof kotlinx.coroutines.internal.l) {
            lVar = (kotlinx.coroutines.internal.l) dVar;
        } else {
            lVar = null;
        }
        d0 d0Var = new d0(th, false, 2, null);
        if (lVar != null) {
            n0Var2 = lVar.f20369d;
        }
        if (n0Var2 == n0Var) {
            i5 = 4;
        } else {
            i5 = this.f20294c;
        }
        U(this, d0Var, i5, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.h1
    public <T> T l(@p4.m Object obj) {
        return obj instanceof c0 ? (T) ((c0) obj).f19862a : obj;
    }

    @Override // kotlinx.coroutines.h1
    @p4.m
    public Object n() {
        return F();
    }

    public final void p(@p4.l n nVar, @p4.m Throwable th) {
        try {
            nVar.j(th);
        } catch (Throwable th2) {
            p0.b(getContext(), new g0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@p4.l Object obj) {
        U(this, j0.b(obj, this), this.f20294c, null, 4, null);
    }

    public final void s(@p4.l v3.l<? super Throwable, kotlin.r2> lVar, @p4.l Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            p0.b(getContext(), new g0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @p4.l
    public String toString() {
        return P() + '(' + x0.c(this.f20442d) + "){" + G() + "}@" + x0.b(this);
    }

    @Override // kotlinx.coroutines.p
    @p4.m
    public Object u(T t5, @p4.m Object obj, @p4.m v3.l<? super Throwable, kotlin.r2> lVar) {
        return X(t5, obj, lVar);
    }

    public final void w() {
        n1 D = D();
        if (D == null) {
            return;
        }
        D.dispose();
        f20441h.set(this, a3.f19846a);
    }

    @Override // kotlinx.coroutines.p
    public void z(@p4.l n0 n0Var, T t5) {
        kotlinx.coroutines.internal.l lVar;
        int i5;
        kotlin.coroutines.d<T> dVar = this.f20442d;
        n0 n0Var2 = null;
        if (dVar instanceof kotlinx.coroutines.internal.l) {
            lVar = (kotlinx.coroutines.internal.l) dVar;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            n0Var2 = lVar.f20369d;
        }
        if (n0Var2 == n0Var) {
            i5 = 4;
        } else {
            i5 = this.f20294c;
        }
        U(this, t5, i5, null, 4, null);
    }
}
