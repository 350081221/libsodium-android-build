package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.layout.LayoutCoordinates;

@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LabelKt$Label$scope$1$1$drawCaret$1 extends kotlin.jvm.internal.n0 implements v3.l<CacheDrawScope, DrawResult> {
    final /* synthetic */ MutableState<LayoutCoordinates> $anchorBounds$delegate;
    final /* synthetic */ v3.p<CacheDrawScope, LayoutCoordinates, DrawResult> $draw;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LabelKt$Label$scope$1$1$drawCaret$1(v3.p<? super CacheDrawScope, ? super LayoutCoordinates, DrawResult> pVar, MutableState<LayoutCoordinates> mutableState) {
        super(1);
        this.$draw = pVar;
        this.$anchorBounds$delegate = mutableState;
    }

    @Override // v3.l
    @p4.l
    public final DrawResult invoke(@p4.l CacheDrawScope cacheDrawScope) {
        LayoutCoordinates Label$lambda$3;
        v3.p<CacheDrawScope, LayoutCoordinates, DrawResult> pVar = this.$draw;
        Label$lambda$3 = LabelKt.Label$lambda$3(this.$anchorBounds$delegate);
        return pVar.invoke(cacheDrawScope, Label$lambda$3);
    }
}
