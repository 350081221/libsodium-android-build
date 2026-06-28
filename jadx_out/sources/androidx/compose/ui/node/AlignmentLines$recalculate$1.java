package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "childOwner", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,247:1\n215#2,2:248\n1855#3,2:250\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n163#1:248,2\n170#1:250,2\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLines$recalculate$1 extends n0 implements l<AlignmentLinesOwner, r2> {
    final /* synthetic */ AlignmentLines this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.this$0 = alignmentLines;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(AlignmentLinesOwner alignmentLinesOwner) {
        invoke2(alignmentLinesOwner);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l AlignmentLinesOwner alignmentLinesOwner) {
        Map map;
        if (alignmentLinesOwner.isPlaced()) {
            if (alignmentLinesOwner.getAlignmentLines().getDirty$ui_release()) {
                alignmentLinesOwner.layoutChildren();
            }
            map = alignmentLinesOwner.getAlignmentLines().alignmentLineMap;
            AlignmentLines alignmentLines = this.this$0;
            for (Map.Entry entry : map.entrySet()) {
                alignmentLines.addAlignmentLine((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.getInnerCoordinator());
            }
            NodeCoordinator wrappedBy$ui_release = alignmentLinesOwner.getInnerCoordinator().getWrappedBy$ui_release();
            l0.m(wrappedBy$ui_release);
            while (!l0.g(wrappedBy$ui_release, this.this$0.getAlignmentLinesOwner().getInnerCoordinator())) {
                Set<AlignmentLine> keySet = this.this$0.getAlignmentLinesMap(wrappedBy$ui_release).keySet();
                AlignmentLines alignmentLines2 = this.this$0;
                for (AlignmentLine alignmentLine : keySet) {
                    alignmentLines2.addAlignmentLine(alignmentLine, alignmentLines2.getPositionFor(wrappedBy$ui_release, alignmentLine), wrappedBy$ui_release);
                }
                wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
                l0.m(wrappedBy$ui_release);
            }
        }
    }
}
