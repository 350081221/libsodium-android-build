package kotlin.coroutines;

import kotlin.d1;
import kotlin.e1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k0;
import kotlin.r2;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00012\u001a\b\u0004\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\f\u0012\u0004\u0012\u00020\r0\u000bH\u0087\bø\u0001\u0000ø\u0001\u0001\u001a@\u0010\u000e\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u001a\b\u0004\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0004\u0012\u00020\r0\u000bH\u0087Hø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0010\u001aD\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\"\u0004\b\u0000\u0010\b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\b*#\b\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u0002H\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\u001b\u001a\u0002H\bH\u0087\b¢\u0006\u0002\u0010\u001c\u001a!\u0010\u001d\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0087\b\u001a>\u0010 \u001a\u00020\r\"\u0004\b\u0000\u0010\b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007ø\u0001\u0001¢\u0006\u0002\u0010!\u001aW\u0010 \u001a\u00020\r\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\b*#\b\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0002\b\u00172\u0006\u0010\u0018\u001a\u0002H\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\"\"\u001b\u0010\u0000\u001a\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Continuation", "Lkotlin/coroutines/Continuation;", "T", com.umeng.analytics.pro.d.X, "resumeWith", "Lkotlin/Function1;", "Lkotlin/Result;", "", "suspendCoroutine", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCoroutine", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "resume", t0.b.f22420d, "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeWithException", "exception", "", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"kotlin/coroutines/ContinuationKt$Continuation$1", "Lkotlin/coroutines/Continuation;", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f19227a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<d1<? extends T>, r2> f19228b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, l<? super d1<? extends T>, r2> lVar) {
            this.f19227a = gVar;
            this.f19228b = lVar;
        }

        @Override // kotlin.coroutines.d
        @p4.l
        public g getContext() {
            return this.f19227a;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@p4.l Object obj) {
            this.f19228b.invoke(d1.m6443boximpl(obj));
        }
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <T> d<T> a(g context, l<? super d1<? extends T>, r2> resumeWith) {
        l0.p(context, "context");
        l0.p(resumeWith, "resumeWith");
        return new a(context, resumeWith);
    }

    @p4.l
    @g1(version = "1.3")
    public static final <T> d<r2> b(@p4.l l<? super d<? super T>, ? extends Object> lVar, @p4.l d<? super T> completion) {
        d b5;
        d e5;
        Object l5;
        l0.p(lVar, "<this>");
        l0.p(completion, "completion");
        b5 = kotlin.coroutines.intrinsics.c.b(lVar, completion);
        e5 = kotlin.coroutines.intrinsics.c.e(b5);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return new k(e5, l5);
    }

    @p4.l
    @g1(version = "1.3")
    public static final <R, T> d<r2> c(@p4.l p<? super R, ? super d<? super T>, ? extends Object> pVar, R r5, @p4.l d<? super T> completion) {
        d c5;
        d e5;
        Object l5;
        l0.p(pVar, "<this>");
        l0.p(completion, "completion");
        c5 = kotlin.coroutines.intrinsics.c.c(pVar, r5, completion);
        e5 = kotlin.coroutines.intrinsics.c.e(c5);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return new k(e5, l5);
    }

    private static final g d() {
        throw new k0("Implemented as intrinsic");
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    public static /* synthetic */ void e() {
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <T> void f(d<? super T> dVar, T t5) {
        l0.p(dVar, "<this>");
        d1.a aVar = d1.Companion;
        dVar.resumeWith(d1.m6444constructorimpl(t5));
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <T> void g(d<? super T> dVar, Throwable exception) {
        l0.p(dVar, "<this>");
        l0.p(exception, "exception");
        d1.a aVar = d1.Companion;
        dVar.resumeWith(d1.m6444constructorimpl(e1.a(exception)));
    }

    @g1(version = "1.3")
    public static final <T> void h(@p4.l l<? super d<? super T>, ? extends Object> lVar, @p4.l d<? super T> completion) {
        d b5;
        d e5;
        l0.p(lVar, "<this>");
        l0.p(completion, "completion");
        b5 = kotlin.coroutines.intrinsics.c.b(lVar, completion);
        e5 = kotlin.coroutines.intrinsics.c.e(b5);
        d1.a aVar = d1.Companion;
        e5.resumeWith(d1.m6444constructorimpl(r2.f19517a));
    }

    @g1(version = "1.3")
    public static final <R, T> void i(@p4.l p<? super R, ? super d<? super T>, ? extends Object> pVar, R r5, @p4.l d<? super T> completion) {
        d c5;
        d e5;
        l0.p(pVar, "<this>");
        l0.p(completion, "completion");
        c5 = kotlin.coroutines.intrinsics.c.c(pVar, r5, completion);
        e5 = kotlin.coroutines.intrinsics.c.e(c5);
        d1.a aVar = d1.Companion;
        e5.resumeWith(d1.m6444constructorimpl(r2.f19517a));
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object j(l<? super d<? super T>, r2> lVar, d<? super T> dVar) {
        d e5;
        Object l5;
        kotlin.jvm.internal.i0.e(0);
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        k kVar = new k(e5);
        lVar.invoke(kVar);
        Object b5 = kVar.b();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (b5 == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        kotlin.jvm.internal.i0.e(1);
        return b5;
    }
}
