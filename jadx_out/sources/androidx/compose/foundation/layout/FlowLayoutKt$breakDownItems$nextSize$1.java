package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "placeable", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FlowLayoutKt$breakDownItems$nextSize$1 extends n0 implements l<Placeable, r2> {
    final /* synthetic */ Placeable[] $placeables;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$breakDownItems$nextSize$1(Placeable[] placeableArr) {
        super(1);
        this.$placeables = placeableArr;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable placeable) {
        invoke2(placeable);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Placeable placeable) {
        this.$placeables[0] = placeable;
    }
}
