package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Color;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;
import v3.t;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ t<Float, Color, Color, Float, Composer, Integer, r2> $content;
    final /* synthetic */ q<InputPhase, Composer, Integer, Color> $contentColor;
    final /* synthetic */ long $focusedTextStyleColor;
    final /* synthetic */ InputPhase $inputState;
    final /* synthetic */ boolean $showLabel;
    final /* synthetic */ TextFieldTransitionScope $tmp0_rcvr;
    final /* synthetic */ long $unfocusedTextStyleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTransitionScope$Transition$1(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j5, long j6, q<? super InputPhase, ? super Composer, ? super Integer, Color> qVar, boolean z4, t<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, r2> tVar, int i5) {
        super(2);
        this.$tmp0_rcvr = textFieldTransitionScope;
        this.$inputState = inputPhase;
        this.$focusedTextStyleColor = j5;
        this.$unfocusedTextStyleColor = j6;
        this.$contentColor = qVar;
        this.$showLabel = z4;
        this.$content = tVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        this.$tmp0_rcvr.m1512TransitionDTcfvLk(this.$inputState, this.$focusedTextStyleColor, this.$unfocusedTextStyleColor, this.$contentColor, this.$showLabel, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
