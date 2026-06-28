package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ ConstraintSetForInlineDsl $constraintSet;
    final /* synthetic */ MutableState<Boolean> $remeasureRequesterState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1(MutableState<Boolean> mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.$remeasureRequesterState = mutableState;
        this.$constraintSet = constraintSetForInlineDsl;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$remeasureRequesterState.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
        this.$constraintSet.setKnownDirty(true);
    }
}
