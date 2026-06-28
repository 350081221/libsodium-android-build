package androidx.compose.ui.node;

import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/platform/ViewConfiguration;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/ComposeUiNode;Landroidx/compose/ui/platform/ViewConfiguration;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetViewConfiguration$1 extends n0 implements p<ComposeUiNode, ViewConfiguration, r2> {
    public static final ComposeUiNode$Companion$SetViewConfiguration$1 INSTANCE = new ComposeUiNode$Companion$SetViewConfiguration$1();

    ComposeUiNode$Companion$SetViewConfiguration$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
        invoke2(composeUiNode, viewConfiguration);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l ComposeUiNode composeUiNode, @l ViewConfiguration viewConfiguration) {
        composeUiNode.setViewConfiguration(viewConfiguration);
    }
}
