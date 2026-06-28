package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$block$1 extends n0 implements l<GraphicsLayerScope, r2> {
    final /* synthetic */ State<Float> $alpha;
    final /* synthetic */ State<Float> $scale;
    final /* synthetic */ State<TransformOrigin> $transformOrigin;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$block$1(State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
        super(1);
        this.$alpha = state;
        this.$scale = state2;
        this.$transformOrigin = state3;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l GraphicsLayerScope graphicsLayerScope) {
        State<Float> state = this.$alpha;
        graphicsLayerScope.setAlpha(state != null ? state.getValue().floatValue() : 1.0f);
        State<Float> state2 = this.$scale;
        graphicsLayerScope.setScaleX(state2 != null ? state2.getValue().floatValue() : 1.0f);
        State<Float> state3 = this.$scale;
        graphicsLayerScope.setScaleY(state3 != null ? state3.getValue().floatValue() : 1.0f);
        State<TransformOrigin> state4 = this.$transformOrigin;
        graphicsLayerScope.mo3926setTransformOrigin__ExYCQ(state4 != null ? state4.getValue().m4122unboximpl() : TransformOrigin.Companion.m4123getCenterSzJe1aQ());
    }
}
