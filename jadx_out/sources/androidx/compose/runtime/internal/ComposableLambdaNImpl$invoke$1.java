package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/Composer;", "nc", "", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,179:1\n37#2,2:180\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n*L\n122#1:180,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl$invoke$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ Object[] $args;
    final /* synthetic */ int $realParams;
    final /* synthetic */ ComposableLambdaNImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaNImpl$invoke$1(Object[] objArr, int i5, ComposableLambdaNImpl composableLambdaNImpl) {
        super(2);
        this.$args = objArr;
        this.$realParams = i5;
        this.this$0 = composableLambdaNImpl;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@l Composer composer, int i5) {
        kotlin.ranges.l W1;
        List Rt;
        Object[] objArr = this.$args;
        W1 = u.W1(0, this.$realParams);
        Rt = kotlin.collections.p.Rt(objArr, W1);
        Object[] array = Rt.toArray(new Object[0]);
        Object obj = this.$args[this.$realParams + 1];
        l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
        int updateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj).intValue());
        int length = (this.$args.length - this.$realParams) - 2;
        Object[] objArr2 = new Object[length];
        for (int i6 = 0; i6 < length; i6++) {
            Object obj2 = this.$args[this.$realParams + 2 + i6];
            l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
            objArr2[i6] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj2).intValue()));
        }
        ComposableLambdaNImpl composableLambdaNImpl = this.this$0;
        s1 s1Var = new s1(4);
        s1Var.b(array);
        s1Var.a(composer);
        s1Var.a(Integer.valueOf(updateChangedFlags | 1));
        s1Var.b(objArr2);
        composableLambdaNImpl.invoke(s1Var.d(new Object[s1Var.c()]));
    }
}
