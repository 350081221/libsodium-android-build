package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$1$1 extends kotlin.jvm.internal.n0 implements v3.l<GraphicsLayerScope, r2> {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ State<Float> $scale$delegate;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(MutableState<TransformOrigin> mutableState, State<Float> state, State<Float> state2) {
        super(1);
        this.$transformOriginState = mutableState;
        this.$scale$delegate = state;
        this.$alpha$delegate = state2;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l GraphicsLayerScope graphicsLayerScope) {
        float DropdownMenuContent$lambda$1;
        float DropdownMenuContent$lambda$12;
        float DropdownMenuContent$lambda$3;
        DropdownMenuContent$lambda$1 = MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate);
        graphicsLayerScope.setScaleX(DropdownMenuContent$lambda$1);
        DropdownMenuContent$lambda$12 = MenuKt.DropdownMenuContent$lambda$1(this.$scale$delegate);
        graphicsLayerScope.setScaleY(DropdownMenuContent$lambda$12);
        DropdownMenuContent$lambda$3 = MenuKt.DropdownMenuContent$lambda$3(this.$alpha$delegate);
        graphicsLayerScope.setAlpha(DropdownMenuContent$lambda$3);
        graphicsLayerScope.mo3926setTransformOrigin__ExYCQ(this.$transformOriginState.getValue().m4122unboximpl());
    }
}
