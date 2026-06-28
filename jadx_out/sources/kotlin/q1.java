package kotlin;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u0086\u0004¢\u0006\u0002\u0010\u0005\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u0001\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\t¨\u0006\n"}, d2 = {TypedValues.TransitionType.S_TO, "Lkotlin/Pair;", "A", "B", "that", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "toList", "", "T", "Lkotlin/Triple;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "TuplesKt")
/* loaded from: classes3.dex */
public final class q1 {
    @p4.l
    public static final <A, B> u0<A, B> a(A a5, B b5) {
        return new u0<>(a5, b5);
    }

    @p4.l
    public static final <T> List<T> b(@p4.l u0<? extends T, ? extends T> u0Var) {
        List<T> L;
        kotlin.jvm.internal.l0.p(u0Var, "<this>");
        L = kotlin.collections.w.L(u0Var.getFirst(), u0Var.getSecond());
        return L;
    }

    @p4.l
    public static final <T> List<T> c(@p4.l p1<? extends T, ? extends T, ? extends T> p1Var) {
        List<T> L;
        kotlin.jvm.internal.l0.p(p1Var, "<this>");
        L = kotlin.collections.w.L(p1Var.getFirst(), p1Var.getSecond(), p1Var.getThird());
        return L;
    }
}
