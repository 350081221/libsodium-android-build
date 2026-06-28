package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.d1;
import kotlin.jvm.internal.r1;
import kotlin.q1;

@kotlin.i0(d1 = {"\u0000\\\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00170\u0016\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00172\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\"\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b!\u0010\u0004\u001a!\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\"\u0010\u0004\u001a\u001e\u0010#\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00102\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0010\u0010%\u001a\u00020$*\u00060\u0011j\u0002`\u0012H\u0000\u001a%\u0010)\u001a\u00020(*\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u00172\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010+\u001a\u00020$*\u00060\u0011j\u0002`\u00122\n\u0010\u0014\u001a\u00060\u0011j\u0002`\u0012H\u0002\u001a\u0014\u0010,\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0000\"\u0014\u0010/\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010.\"\u0014\u00104\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u001c\u00106\u001a\n 5*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.\"\u001c\u00107\u001a\n 5*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.*\f\b\u0000\u00108\"\u00020\n2\u00020\n*\f\b\u0000\u00109\"\u00020\u00112\u00020\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"", "E", "exception", "o", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q", "Lkotlin/coroutines/d;", "continuation", bi.aA, "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Throwable;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "n", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/e;)Ljava/lang/Throwable;", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "e", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lkotlin/u0;", "", "d", "(Ljava/lang/Throwable;)Lkotlin/u0;", "recoveredStacktrace", "Lkotlin/r2;", "k", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "l", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "r", bi.aE, "f", "", "j", "", "methodName", "", bi.aJ, "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", socket.g.f22386a, "i", bi.ay, "Ljava/lang/String;", "baseContinuationImplClass", "b", "stackTraceRecoveryClass", "c", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "kotlin.jvm.PlatformType", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1735#2,6:215\n12744#2,2:223\n1627#2,6:227\n12744#2,2:233\n1627#2,6:236\n37#3,2:221\n26#4:225\n26#4:226\n1#5:235\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n43#1:215,6\n131#1:223,2\n141#1:227,6\n171#1:233,2\n192#1:236,6\n106#1:221,2\n133#1:225\n135#1:226\n*E\n"})
/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final String f20386a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final String f20387b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final StackTraceElement f20388c = new _COROUTINE.a().a();

    /* renamed from: d, reason: collision with root package name */
    private static final String f20389d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f20390e;

    static {
        Object m6444constructorimpl;
        Object m6444constructorimpl2;
        try {
            d1.a aVar = kotlin.d1.Companion;
            m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            d1.a aVar2 = kotlin.d1.Companion;
            m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th));
        }
        if (kotlin.d1.m6447exceptionOrNullimpl(m6444constructorimpl) != null) {
            m6444constructorimpl = f20386a;
        }
        f20389d = (String) m6444constructorimpl;
        try {
            d1.a aVar3 = kotlin.d1.Companion;
            m6444constructorimpl2 = kotlin.d1.m6444constructorimpl(s0.class.getCanonicalName());
        } catch (Throwable th2) {
            d1.a aVar4 = kotlin.d1.Companion;
            m6444constructorimpl2 = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th2));
        }
        if (kotlin.d1.m6447exceptionOrNullimpl(m6444constructorimpl2) != null) {
            m6444constructorimpl2 = f20387b;
        }
        f20390e = (String) m6444constructorimpl2;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    private static final <E extends Throwable> kotlin.u0<E, StackTraceElement[]> d(E e5) {
        boolean z4;
        Throwable cause = e5.getCause();
        if (cause != null && kotlin.jvm.internal.l0.g(cause.getClass(), e5.getClass())) {
            StackTraceElement[] stackTrace = e5.getStackTrace();
            int length = stackTrace.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    if (j(stackTrace[i5])) {
                        z4 = true;
                        break;
                    }
                    i5++;
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                return q1.a(cause, stackTrace);
            }
            return q1.a(e5, new StackTraceElement[0]);
        }
        return q1.a(e5, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E e(E e5, E e6, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f20388c);
        StackTraceElement[] stackTrace = e5.getStackTrace();
        int h5 = h(stackTrace, f20389d);
        int i5 = 0;
        if (h5 == -1) {
            e6.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e6;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + h5];
        for (int i6 = 0; i6 < h5; i6++) {
            stackTraceElementArr[i6] = stackTrace[i6];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i5 + h5] = it.next();
            i5++;
        }
        e6.setStackTrace(stackTraceElementArr);
        return e6;
    }

    private static final ArrayDeque<StackTraceElement> f(kotlin.coroutines.jvm.internal.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean g(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.l0.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.l0.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.l0.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
            return true;
        }
        return false;
    }

    private static final int h(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (kotlin.jvm.internal.l0.g(str, stackTraceElementArr[i5].getClassName())) {
                return i5;
            }
        }
        return -1;
    }

    public static final void i(@p4.l Throwable th, @p4.l Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean j(@p4.l StackTraceElement stackTraceElement) {
        boolean s22;
        s22 = kotlin.text.e0.s2(stackTraceElement.getClassName(), _COROUTINE.b.c(), false, 2, null);
        return s22;
    }

    private static final void k(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                if (j(stackTraceElementArr[i5])) {
                    break;
                } else {
                    i5++;
                }
            } else {
                i5 = -1;
                break;
            }
        }
        int i6 = i5 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i6 > length2) {
            return;
        }
        while (true) {
            if (g(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 != i6) {
                length2--;
            } else {
                return;
            }
        }
    }

    @p4.m
    public static final Object l(@p4.l Throwable th, @p4.l kotlin.coroutines.d<?> dVar) {
        throw th;
    }

    private static final Object m(Throwable th, kotlin.coroutines.d<?> dVar) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E n(E e5, kotlin.coroutines.jvm.internal.e eVar) {
        kotlin.u0 d5 = d(e5);
        Throwable th = (Throwable) d5.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) d5.component2();
        Throwable g5 = o.g(th);
        if (g5 == null) {
            return e5;
        }
        ArrayDeque<StackTraceElement> f5 = f(eVar);
        if (f5.isEmpty()) {
            return e5;
        }
        if (th != e5) {
            k(stackTraceElementArr, f5);
        }
        return (E) e(th, g5, f5);
    }

    @p4.l
    public static final <E extends Throwable> E o(@p4.l E e5) {
        return e5;
    }

    @p4.l
    public static final <E extends Throwable> E p(@p4.l E e5, @p4.l kotlin.coroutines.d<?> dVar) {
        return e5;
    }

    private static final <E extends Throwable> E q(E e5) {
        int i5;
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e5.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i6 = length2 - 1;
                if (kotlin.jvm.internal.l0.g(f20390e, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i6 < 0) {
                    break;
                }
                length2 = i6;
            }
        }
        length2 = -1;
        int i7 = length2 + 1;
        int h5 = h(stackTrace, f20389d);
        if (h5 == -1) {
            i5 = 0;
        } else {
            i5 = length - h5;
        }
        int i8 = (length - length2) - i5;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 == 0) {
                stackTraceElement = f20388c;
            } else {
                stackTraceElement = stackTrace[(i7 + i9) - 1];
            }
            stackTraceElementArr[i9] = stackTraceElement;
        }
        e5.setStackTrace(stackTraceElementArr);
        return e5;
    }

    @p4.l
    public static final <E extends Throwable> E r(@p4.l E e5) {
        return e5;
    }

    @p4.l
    public static final <E extends Throwable> E s(@p4.l E e5) {
        E e6 = (E) e5.getCause();
        if (e6 != null && kotlin.jvm.internal.l0.g(e6.getClass(), e5.getClass())) {
            StackTraceElement[] stackTrace = e5.getStackTrace();
            int length = stackTrace.length;
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (j(stackTrace[i5])) {
                    z4 = true;
                    break;
                }
                i5++;
            }
            if (z4) {
                return e6;
            }
        }
        return e5;
    }
}
