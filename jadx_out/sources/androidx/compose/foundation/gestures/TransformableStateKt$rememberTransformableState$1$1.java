package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.q;

@i0(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", bi.aG, "Landroidx/compose/ui/geometry/Offset;", bi.aA, "r", "Lkotlin/r2;", "invoke-d-4ec7I", "(FJF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TransformableStateKt$rememberTransformableState$1$1 extends n0 implements q<Float, Offset, Float, r2> {
    final /* synthetic */ State<q<Float, Offset, Float, r2>> $lambdaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformableStateKt$rememberTransformableState$1$1(State<? extends q<? super Float, ? super Offset, ? super Float, r2>> state) {
        super(3);
        this.$lambdaState = state;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Float f5, Offset offset, Float f6) {
        m417invoked4ec7I(f5.floatValue(), offset.m3503unboximpl(), f6.floatValue());
        return r2.f19517a;
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final void m417invoked4ec7I(float f5, long j5, float f6) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f5), Offset.m3482boximpl(j5), Float.valueOf(f6));
    }
}
