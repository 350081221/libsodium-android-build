package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "parentBounds", "menuBounds", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1 extends n0 implements p<IntRect, IntRect, r2> {
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1(MutableState<TransformOrigin> mutableState) {
        super(2);
        this.$transformOriginState = mutableState;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(IntRect intRect, IntRect intRect2) {
        invoke2(intRect, intRect2);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l IntRect intRect, @l IntRect intRect2) {
        this.$transformOriginState.setValue(TransformOrigin.m4110boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
    }
}
