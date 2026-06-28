package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.Map;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 $2\u00020\u0001:\u0001$J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J2\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H&JB\u0010\u001c\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "Lkotlin/r2;", "unsubscribe", "", "nextSelectableId", "selectableId", "notifyPositionChange", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isInTouchMode", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "newPosition", "previousPosition", "isStartHandle", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "", "Landroidx/compose/foundation/text/selection/Selection;", "getSubselections", "()Ljava/util/Map;", "subselections", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface SelectionRegistrar {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;", "", "()V", "InvalidSelectableId", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    @l
    Map<Long, Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j5);

    void notifySelectableChange(long j5);

    /* renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo1040notifySelectionUpdatenjBpvok(@l LayoutCoordinates layoutCoordinates, long j5, long j6, boolean z4, @l SelectionAdjustment selectionAdjustment, boolean z5);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j5, boolean z4);

    /* renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo1041notifySelectionUpdateStartubNVwUQ(@l LayoutCoordinates layoutCoordinates, long j5, @l SelectionAdjustment selectionAdjustment, boolean z4);

    @l
    Selectable subscribe(@l Selectable selectable);

    void unsubscribe(@l Selectable selectable);
}
