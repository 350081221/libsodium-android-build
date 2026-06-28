package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NavigationBarKt$NavigationBarItem$3$indicator$1$1$1 extends kotlin.jvm.internal.n0 implements v3.l<GraphicsLayerScope, r2> {
    final /* synthetic */ State<Float> $animationProgress;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$3$indicator$1$1$1(State<Float> state) {
        super(1);
        this.$animationProgress = state;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(this.$animationProgress.getValue().floatValue());
    }
}
