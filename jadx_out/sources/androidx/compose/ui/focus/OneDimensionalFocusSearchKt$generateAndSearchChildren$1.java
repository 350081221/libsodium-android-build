package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "invoke", "(Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt$generateAndSearchChildren$1 extends n0 implements l<BeyondBoundsLayout.BeyondBoundsScope, Boolean> {
    final /* synthetic */ int $direction;
    final /* synthetic */ FocusTargetNode $focusedItem;
    final /* synthetic */ l<FocusTargetNode, Boolean> $onFound;
    final /* synthetic */ FocusTargetNode $this_generateAndSearchChildren;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i5, l<? super FocusTargetNode, Boolean> lVar) {
        super(1);
        this.$this_generateAndSearchChildren = focusTargetNode;
        this.$focusedItem = focusTargetNode2;
        this.$direction = i5;
        this.$onFound = lVar;
    }

    @Override // v3.l
    @m
    public final Boolean invoke(@p4.l BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
        boolean m3450searchChildren4C6V_qg;
        m3450searchChildren4C6V_qg = OneDimensionalFocusSearchKt.m3450searchChildren4C6V_qg(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound);
        Boolean valueOf = Boolean.valueOf(m3450searchChildren4C6V_qg);
        if (valueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
            return valueOf;
        }
        return null;
    }
}
