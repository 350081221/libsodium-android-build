package androidx.compose.ui.node;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2 extends n0 implements l<AlignmentLinesOwner, r2> {
    public static final LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2 INSTANCE = new LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2();

    LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(AlignmentLinesOwner alignmentLinesOwner) {
        invoke2(alignmentLinesOwner);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l AlignmentLinesOwner alignmentLinesOwner) {
        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
    }
}
