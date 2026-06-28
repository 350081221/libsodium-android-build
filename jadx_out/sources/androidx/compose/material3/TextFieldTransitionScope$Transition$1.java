package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Color;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ v3.u<Float, Color, Color, Float, Float, Composer, Integer, r2> $content;
    final /* synthetic */ v3.q<InputPhase, Composer, Integer, Color> $contentColor;
    final /* synthetic */ long $focusedTextStyleColor;
    final /* synthetic */ InputPhase $inputState;
    final /* synthetic */ boolean $showLabel;
    final /* synthetic */ TextFieldTransitionScope $tmp0_rcvr;
    final /* synthetic */ long $unfocusedTextStyleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTransitionScope$Transition$1(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j5, long j6, v3.q<? super InputPhase, ? super Composer, ? super Integer, Color> qVar, boolean z4, v3.u<? super Float, ? super Color, ? super Color, ? super Float, ? super Float, ? super Composer, ? super Integer, r2> uVar, int i5) {
        super(2);
        this.$tmp0_rcvr = textFieldTransitionScope;
        this.$inputState = inputPhase;
        this.$focusedTextStyleColor = j5;
        this.$unfocusedTextStyleColor = j6;
        this.$contentColor = qVar;
        this.$showLabel = z4;
        this.$content = uVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        this.$tmp0_rcvr.m2450TransitionDTcfvLk(this.$inputState, this.$focusedTextStyleColor, this.$unfocusedTextStyleColor, this.$contentColor, this.$showLabel, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
