package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,250:1\n137#2,5:251\n262#2,11:256\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n*L\n150#1:251,5\n150#1:256,11\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt$CircularArrowIndicator$2 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ State<Float> $alphaState;
    final /* synthetic */ long $color;
    final /* synthetic */ Path $path;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$2(PullRefreshState pullRefreshState, State<Float> state, long j5, Path path) {
        super(1);
        this.$state = pullRefreshState;
        this.$alphaState = state;
        this.$color = j5;
        this.$path = path;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        ArrowValues ArrowValues;
        float f5;
        float f6;
        float f7;
        ArrowValues = PullRefreshIndicatorKt.ArrowValues(this.$state.getProgress());
        float floatValue = this.$alphaState.getValue().floatValue();
        float rotation = ArrowValues.getRotation();
        long j5 = this.$color;
        Path path = this.$path;
        long mo4276getCenterF1C5BW0 = drawScope.mo4276getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4208rotateUv8p0NA(rotation, mo4276getCenterF1C5BW0);
        f5 = PullRefreshIndicatorKt.ArcRadius;
        float mo304toPx0680j_4 = drawScope.mo304toPx0680j_4(f5);
        f6 = PullRefreshIndicatorKt.StrokeWidth;
        float mo304toPx0680j_42 = mo304toPx0680j_4 + (drawScope.mo304toPx0680j_4(f6) / 2.0f);
        Rect rect = new Rect(Offset.m3493getXimpl(SizeKt.m3572getCenteruvyYCjk(drawScope.mo4277getSizeNHjbRc())) - mo304toPx0680j_42, Offset.m3494getYimpl(SizeKt.m3572getCenteruvyYCjk(drawScope.mo4277getSizeNHjbRc())) - mo304toPx0680j_42, Offset.m3493getXimpl(SizeKt.m3572getCenteruvyYCjk(drawScope.mo4277getSizeNHjbRc())) + mo304toPx0680j_42, Offset.m3494getYimpl(SizeKt.m3572getCenteruvyYCjk(drawScope.mo4277getSizeNHjbRc())) + mo304toPx0680j_42);
        float startAngle = ArrowValues.getStartAngle();
        float endAngle = ArrowValues.getEndAngle() - ArrowValues.getStartAngle();
        long m3528getTopLeftF1C5BW0 = rect.m3528getTopLeftF1C5BW0();
        long m3526getSizeNHjbRc = rect.m3526getSizeNHjbRc();
        f7 = PullRefreshIndicatorKt.StrokeWidth;
        DrawScope.m4257drawArcyD3GUKo$default(drawScope, j5, startAngle, endAngle, false, m3528getTopLeftF1C5BW0, m3526getSizeNHjbRc, floatValue, new Stroke(drawScope.mo304toPx0680j_4(f7), 0.0f, StrokeCap.Companion.m4087getSquareKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
        PullRefreshIndicatorKt.m1531drawArrowBx497Mc(drawScope, path, rect, j5, floatValue, ArrowValues);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }
}
