package androidx.compose.foundation;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedBounds", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode$focusBoundsObserver$1 extends n0 implements v3.l<LayoutCoordinates, r2> {
    final /* synthetic */ FocusedBoundsObserverNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusedBoundsObserverNode$focusBoundsObserver$1(FocusedBoundsObserverNode focusedBoundsObserverNode) {
        super(1);
        this.this$0 = focusedBoundsObserverNode;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.m LayoutCoordinates layoutCoordinates) {
        v3.l parent;
        if (this.this$0.isAttached()) {
            this.this$0.getOnPositioned().invoke(layoutCoordinates);
            parent = this.this$0.getParent();
            if (parent != null) {
                parent.invoke(layoutCoordinates);
            }
        }
    }
}
