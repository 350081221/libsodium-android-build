package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$1$1 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ State<Color> $borderColor$delegate;
    final /* synthetic */ State<Color> $boxColor$delegate;
    final /* synthetic */ CheckDrawingCache $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction$delegate;
    final /* synthetic */ State<Color> $checkColor$delegate;
    final /* synthetic */ State<Float> $checkDrawFraction$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(CheckDrawingCache checkDrawingCache, State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5) {
        super(1);
        this.$checkCache = checkDrawingCache;
        this.$boxColor$delegate = state;
        this.$borderColor$delegate = state2;
        this.$checkColor$delegate = state3;
        this.$checkDrawFraction$delegate = state4;
        this.$checkCenterGravitationShiftFraction$delegate = state5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        float f5;
        long CheckboxImpl$lambda$9;
        long CheckboxImpl$lambda$10;
        float f6;
        long CheckboxImpl$lambda$8;
        float CheckboxImpl$lambda$4;
        float CheckboxImpl$lambda$6;
        f5 = CheckboxKt.StrokeWidth;
        float floor = (float) Math.floor(drawScope.mo304toPx0680j_4(f5));
        CheckboxImpl$lambda$9 = CheckboxKt.CheckboxImpl$lambda$9(this.$boxColor$delegate);
        CheckboxImpl$lambda$10 = CheckboxKt.CheckboxImpl$lambda$10(this.$borderColor$delegate);
        f6 = CheckboxKt.RadiusSize;
        CheckboxKt.m1256drawBox1wkBAMs(drawScope, CheckboxImpl$lambda$9, CheckboxImpl$lambda$10, drawScope.mo304toPx0680j_4(f6), floor);
        CheckboxImpl$lambda$8 = CheckboxKt.CheckboxImpl$lambda$8(this.$checkColor$delegate);
        CheckboxImpl$lambda$4 = CheckboxKt.CheckboxImpl$lambda$4(this.$checkDrawFraction$delegate);
        CheckboxImpl$lambda$6 = CheckboxKt.CheckboxImpl$lambda$6(this.$checkCenterGravitationShiftFraction$delegate);
        CheckboxKt.m1257drawCheck3IgeMak(drawScope, CheckboxImpl$lambda$8, CheckboxImpl$lambda$4, CheckboxImpl$lambda$6, floor, this.$checkCache);
    }
}
