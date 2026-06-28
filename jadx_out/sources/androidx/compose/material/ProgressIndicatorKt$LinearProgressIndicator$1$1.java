package androidx.compose.material;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $coercedProgress;
    final /* synthetic */ long $color;
    final /* synthetic */ int $strokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1$1(long j5, int i5, float f5, long j6) {
        super(1);
        this.$backgroundColor = j5;
        this.$strokeCap = i5;
        this.$coercedProgress = f5;
        this.$color = j6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        float m3559getHeightimpl = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc());
        ProgressIndicatorKt.m1416drawLinearIndicatorBackgroundAZGd3zU(drawScope, this.$backgroundColor, m3559getHeightimpl, this.$strokeCap);
        ProgressIndicatorKt.m1415drawLinearIndicatorqYKTg0g(drawScope, 0.0f, this.$coercedProgress, this.$color, m3559getHeightimpl, this.$strokeCap);
    }
}
