package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H&J\u001d\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0013H&R\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/Selectable;", "", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "builder", "Lkotlin/r2;", "appendSelectableInfoToBuilder", "Landroidx/compose/foundation/text/selection/Selection;", "getSelectAllSelection", "selection", "", "isStartHandle", "Landroidx/compose/ui/geometry/Offset;", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "", "getLineLeft", "getLineRight", "getCenterYForOffset", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getLastVisibleOffset", "", "getSelectableId", "()J", "selectableId", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface Selectable {
    void appendSelectableInfoToBuilder(@l SelectionLayoutBuilder selectionLayoutBuilder);

    @l
    Rect getBoundingBox(int i5);

    float getCenterYForOffset(int i5);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo980getHandlePositiondBAh8RU(@l Selection selection, boolean z4);

    int getLastVisibleOffset();

    @m
    LayoutCoordinates getLayoutCoordinates();

    float getLineLeft(int i5);

    float getLineRight(int i5);

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo981getRangeOfLineContainingjx7JFs(int i5);

    @m
    Selection getSelectAllSelection();

    long getSelectableId();

    @l
    AnnotatedString getText();
}
