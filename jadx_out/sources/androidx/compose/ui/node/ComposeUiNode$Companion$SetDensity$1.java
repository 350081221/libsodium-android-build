package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/unit/Density;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/ComposeUiNode;Landroidx/compose/ui/unit/Density;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetDensity$1 extends n0 implements p<ComposeUiNode, Density, r2> {
    public static final ComposeUiNode$Companion$SetDensity$1 INSTANCE = new ComposeUiNode$Companion$SetDensity$1();

    ComposeUiNode$Companion$SetDensity$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(ComposeUiNode composeUiNode, Density density) {
        invoke2(composeUiNode, density);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l ComposeUiNode composeUiNode, @l Density density) {
        composeUiNode.setDensity(density);
    }
}
