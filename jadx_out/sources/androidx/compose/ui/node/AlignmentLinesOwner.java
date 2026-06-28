package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import java.util.Map;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J\u001c\u0010\n\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&R\u0014\u0010\u000e\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/r2;", "layoutChildren", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLines", "Lkotlin/Function1;", "block", "forEachChildAlignmentLinesOwner", "requestLayout", "requestMeasure", "", "isPlaced", "()Z", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface AlignmentLinesOwner extends Measurable {
    @l
    Map<AlignmentLine, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(@l v3.l<? super AlignmentLinesOwner, r2> lVar);

    @l
    AlignmentLines getAlignmentLines();

    @l
    NodeCoordinator getInnerCoordinator();

    @m
    AlignmentLinesOwner getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
