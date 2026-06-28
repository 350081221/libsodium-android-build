package kotlin;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\t\u001a@\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a-\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\u000f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\t\u001a@\u0010\u000f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"check", "", t0.b.f22420d, "", "lazyMessage", "Lkotlin/Function0;", "", "checkNotNull", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", com.umeng.analytics.pro.d.U, "", CrashHianalyticsData.MESSAGE, "require", "requireNotNull", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/PreconditionsKt")
@kotlin.jvm.internal.r1({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
/* loaded from: classes3.dex */
class y0 extends x0 {
    @kotlin.internal.f
    private static final void c(boolean z4) {
        if (!z4) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @kotlin.internal.f
    private static final void d(boolean z4, v3.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.l0.p(lazyMessage, "lazyMessage");
        if (z4) {
        } else {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    @kotlin.internal.f
    private static final <T> T e(T t5) {
        if (t5 != null) {
            return t5;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @kotlin.internal.f
    private static final <T> T f(T t5, v3.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.l0.p(lazyMessage, "lazyMessage");
        if (t5 != null) {
            return t5;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    @kotlin.internal.f
    private static final Void g(Object message) {
        kotlin.jvm.internal.l0.p(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @kotlin.internal.f
    private static final void h(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @kotlin.internal.f
    private static final void i(boolean z4, v3.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.l0.p(lazyMessage, "lazyMessage");
        if (z4) {
        } else {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    @kotlin.internal.f
    private static final <T> T j(T t5) {
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @kotlin.internal.f
    private static final <T> T k(T t5, v3.a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.l0.p(lazyMessage, "lazyMessage");
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }
}
