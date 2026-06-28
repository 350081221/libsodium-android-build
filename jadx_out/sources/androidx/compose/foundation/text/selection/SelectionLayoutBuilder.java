package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\n0,j\b\u0012\u0004\u0012\u00020\n`-¢\u0006\u0004\b<\u0010=J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJN\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013R\u001d\u0010\u0018\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R'\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\n0,j\b\u0012\u0004\u0012\u00020\n`-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "", "slot", "Landroidx/compose/foundation/text/selection/Direction;", "xPositionDirection", "yPositionDirection", "updateSlot", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "build", "", "selectableId", "rawStartHandleOffset", "startXHandleDirection", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "appendInfo", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "J", "getCurrentPosition-F1C5BW0", "()J", "previousHandlePosition", "getPreviousHandlePosition-F1C5BW0", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "", "isStartHandle", "Z", "()Z", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "Ljava/util/Comparator;", "getSelectableIdOrderingComparator", "()Ljava/util/Comparator;", "", "selectableIdToInfoListIndex", "Ljava/util/Map;", "", "infoList", "Ljava/util/List;", "startSlot", "I", "endSlot", "currentSlot", "<init>", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLandroidx/compose/foundation/text/selection/Selection;Ljava/util/Comparator;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionLayoutBuilder {
    public static final int $stable = 8;

    @l
    private final LayoutCoordinates containerCoordinates;
    private final long currentPosition;
    private int currentSlot;
    private int endSlot;

    @l
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final long previousHandlePosition;

    @m
    private final Selection previousSelection;

    @l
    private final Comparator<Long> selectableIdOrderingComparator;

    @l
    private final Map<Long, Integer> selectableIdToInfoListIndex;
    private int startSlot;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SelectionLayoutBuilder(long j5, long j6, LayoutCoordinates layoutCoordinates, boolean z4, Selection selection, Comparator<Long> comparator) {
        this.currentPosition = j5;
        this.previousHandlePosition = j6;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z4;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = new LinkedHashMap();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }

    public /* synthetic */ SelectionLayoutBuilder(long j5, long j6, LayoutCoordinates layoutCoordinates, boolean z4, Selection selection, Comparator comparator, w wVar) {
        this(j5, j6, layoutCoordinates, z4, selection, comparator);
    }

    private final int updateSlot(int i5, Direction direction, Direction direction2) {
        if (i5 != -1) {
            return i5;
        }
        int i6 = WhenMappings.$EnumSwitchMapping$0[SelectionLayoutKt.resolve2dDirection(direction, direction2).ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new j0();
                }
                return i5;
            }
            return this.currentSlot;
        }
        return this.currentSlot - 1;
    }

    @l
    public final SelectableInfo appendInfo(long j5, int i5, @l Direction direction, @l Direction direction2, int i6, @l Direction direction3, @l Direction direction4, int i7, @l TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        SelectableInfo selectableInfo = new SelectableInfo(j5, this.currentSlot, i5, i6, i7, textLayoutResult);
        this.startSlot = updateSlot(this.startSlot, direction, direction2);
        this.endSlot = updateSlot(this.endSlot, direction3, direction4);
        this.selectableIdToInfoListIndex.put(Long.valueOf(j5), Integer.valueOf(this.infoList.size()));
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    @l
    public final SelectionLayout build() {
        Object e5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size != 0) {
            if (size != 1) {
                Map<Long, Integer> map = this.selectableIdToInfoListIndex;
                List<SelectableInfo> list = this.infoList;
                int i10 = this.startSlot;
                if (i10 == -1) {
                    i7 = i9;
                } else {
                    i7 = i10;
                }
                int i11 = this.endSlot;
                if (i11 == -1) {
                    i8 = i9;
                } else {
                    i8 = i11;
                }
                return new MultiSelectionLayout(map, list, i7, i8, this.isStartHandle, this.previousSelection);
            }
            e5 = e0.e5(this.infoList);
            SelectableInfo selectableInfo = (SelectableInfo) e5;
            int i12 = this.startSlot;
            if (i12 == -1) {
                i5 = i9;
            } else {
                i5 = i12;
            }
            int i13 = this.endSlot;
            if (i13 == -1) {
                i6 = i9;
            } else {
                i6 = i13;
            }
            return new SingleSelectionLayout(this.isStartHandle, i5, i6, this.previousSelection, selectableInfo);
        }
        throw new IllegalStateException("SelectionLayout must not be empty.");
    }

    @l
    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    /* renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name */
    public final long m995getCurrentPositionF1C5BW0() {
        return this.currentPosition;
    }

    /* renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name */
    public final long m996getPreviousHandlePositionF1C5BW0() {
        return this.previousHandlePosition;
    }

    @m
    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @l
    public final Comparator<Long> getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    public final boolean isStartHandle() {
        return this.isStartHandle;
    }
}
