package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.a;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$2$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,558:1\n137#2,5:559\n262#2,11:564\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt$CircularArrowProgressIndicator$2$1\n*L\n445#1:559,5\n445#1:564,11\n*E\n"})
/* loaded from: classes.dex */
public final class PullToRefreshKt$CircularArrowProgressIndicator$2$1 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ State<Float> $alphaState;
    final /* synthetic */ long $color;
    final /* synthetic */ Path $path;
    final /* synthetic */ a<Float> $progress;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$CircularArrowProgressIndicator$2$1(a<Float> aVar, State<Float> state, long j5, Path path) {
        super(1);
        this.$progress = aVar;
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
        float f8;
        ArrowValues = PullToRefreshKt.ArrowValues(this.$progress.invoke().floatValue());
        float floatValue = this.$alphaState.getValue().floatValue();
        float rotation = ArrowValues.getRotation();
        long j5 = this.$color;
        Path path = this.$path;
        long mo4276getCenterF1C5BW0 = drawScope.mo4276getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4208rotateUv8p0NA(rotation, mo4276getCenterF1C5BW0);
        f5 = PullToRefreshKt.ArcRadius;
        float mo304toPx0680j_4 = drawScope.mo304toPx0680j_4(f5);
        f6 = PullToRefreshKt.StrokeWidth;
        Rect m3532Rect3MmeM6k = RectKt.m3532Rect3MmeM6k(SizeKt.m3572getCenteruvyYCjk(drawScope.mo4277getSizeNHjbRc()), mo304toPx0680j_4 + (drawScope.mo304toPx0680j_4(f6) / 2.0f));
        f7 = PullToRefreshKt.StrokeWidth;
        PullToRefreshKt.m2625drawCircularIndicatorKzyDr3Q(drawScope, j5, floatValue, ArrowValues, m3532Rect3MmeM6k, f7);
        f8 = PullToRefreshKt.StrokeWidth;
        PullToRefreshKt.m2624drawArrowuDrxG_w(drawScope, path, m3532Rect3MmeM6k, j5, floatValue, ArrowValues, f8);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }
}
