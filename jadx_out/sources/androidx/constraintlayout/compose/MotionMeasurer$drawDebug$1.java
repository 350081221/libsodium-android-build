package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionMeasurer$drawDebug$1 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ MotionMeasurer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionMeasurer$drawDebug$1(MotionMeasurer motionMeasurer) {
        super(1);
        this.this$0 = motionMeasurer;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope Canvas) {
        l0.p(Canvas, "$this$Canvas");
        PathEffect dashPathEffect = PathEffect.Companion.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
        Iterator<ConstraintWidget> it = this.this$0.getRoot().getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            WidgetFrame startFrame = this.this$0.getTransition().getStart(next);
            WidgetFrame endFrame = this.this$0.getTransition().getEnd(next);
            MotionMeasurer motionMeasurer = this.this$0;
            Canvas.getDrawContext().getTransform().translate(2.0f, 2.0f);
            float m3562getWidthimpl = Size.m3562getWidthimpl(Canvas.mo4277getSizeNHjbRc());
            float m3559getHeightimpl = Size.m3559getHeightimpl(Canvas.mo4277getSizeNHjbRc());
            l0.o(startFrame, "startFrame");
            l0.o(endFrame, "endFrame");
            Color.Companion companion = Color.Companion;
            motionMeasurer.m6386drawFrameDebugPE3pjmc(Canvas, m3562getWidthimpl, m3559getHeightimpl, startFrame, endFrame, dashPathEffect, companion.m3771getWhite0d7_KjU());
            Canvas.getDrawContext().getTransform().translate(-2.0f, -2.0f);
            this.this$0.m6386drawFrameDebugPE3pjmc(Canvas, Size.m3562getWidthimpl(Canvas.mo4277getSizeNHjbRc()), Size.m3559getHeightimpl(Canvas.mo4277getSizeNHjbRc()), startFrame, endFrame, dashPathEffect, companion.m3761getBlue0d7_KjU());
        }
    }
}
