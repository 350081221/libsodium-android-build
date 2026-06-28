package androidx.compose.foundation.text.selection;

import java.util.Map;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H&J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000b\u001a\u00020\nH&R\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0014\u0010#\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0014\u0010%\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0014\u0010&\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006+À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayout;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "Lkotlin/r2;", "block", "forEachMiddleInfo", "other", "", "shouldRecomputeSelection", "Landroidx/compose/foundation/text/selection/Selection;", "selection", "", "", "createSubSelections", "", "getSize", "()I", "size", "getStartSlot", "startSlot", "getEndSlot", "endSlot", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "getStartInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "startInfo", "getEndInfo", "endInfo", "getCurrentInfo", "currentInfo", "getFirstInfo", "firstInfo", "getLastInfo", "lastInfo", "isStartHandle", "()Z", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface SelectionLayout {
    @l
    Map<Long, Selection> createSubSelections(@l Selection selection);

    void forEachMiddleInfo(@l v3.l<? super SelectableInfo, r2> lVar);

    @l
    CrossStatus getCrossStatus();

    @l
    SelectableInfo getCurrentInfo();

    @l
    SelectableInfo getEndInfo();

    int getEndSlot();

    @l
    SelectableInfo getFirstInfo();

    @l
    SelectableInfo getLastInfo();

    @m
    Selection getPreviousSelection();

    int getSize();

    @l
    SelectableInfo getStartInfo();

    int getStartSlot();

    boolean isStartHandle();

    boolean shouldRecomputeSelection(@m SelectionLayout selectionLayout);
}
