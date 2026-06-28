package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n154#2:234\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n*L\n124#1:234\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonKt$RadioButton$2$1 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ State<Dp> $dotRadius;
    final /* synthetic */ State<Color> $radioColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$2$1(State<Color> state, State<Dp> state2) {
        super(1);
        this.$radioColor = state;
        this.$dotRadius = state2;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        float f5;
        float f6;
        f5 = RadioButtonKt.RadioStrokeWidth;
        float mo304toPx0680j_4 = drawScope.mo304toPx0680j_4(f5);
        long m3744unboximpl = this.$radioColor.getValue().m3744unboximpl();
        f6 = RadioButtonKt.RadioRadius;
        float f7 = mo304toPx0680j_4 / 2;
        DrawScope.m4259drawCircleVaOC9Bg$default(drawScope, m3744unboximpl, drawScope.mo304toPx0680j_4(f6) - f7, 0L, 0.0f, new Stroke(mo304toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (Dp.m6043compareTo0680j_4(this.$dotRadius.getValue().m6058unboximpl(), Dp.m6044constructorimpl(0)) > 0) {
            DrawScope.m4259drawCircleVaOC9Bg$default(drawScope, this.$radioColor.getValue().m3744unboximpl(), drawScope.mo304toPx0680j_4(this.$dotRadius.getValue().m6058unboximpl()) - f7, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
        }
    }
}
