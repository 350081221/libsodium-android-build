package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b@\u0010AJ\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bH\u0082\bø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0017\u001a\u0004\b5\u0010\u0019R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010\r\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0007\u0010\u0019R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\u0017R\u0018\u0010=\u001a\u00020\u0002*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "", "index", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-Bjo55l4", "(I)J", "getOffset", "Lkotlin/Function1;", "mainAxisMap", "copy-4Tuh3kE", "(JLv3/l;)J", "copy", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "Lkotlin/r2;", "position", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "place", "delta", "applyScrollDelta", "I", "getIndex", "()I", "size", "getSize", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Ljava/util/List;", "visualOffset", "J", "", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "", "reverseLayout", "Z", "isVertical", "crossAxisSize", "getCrossAxisSize", "", "placeableOffsets", "[I", "<set-?>", "mainAxisLayoutSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,133:1\n129#1:146\n33#2,6:134\n69#2,4:140\n74#2:145\n1#3:144\n86#4:147\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n100#1:146\n52#1:134,6\n76#1:140,4\n76#1:145\n104#1:147\n*E\n"})
/* loaded from: classes.dex */
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;

    @m
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;

    @l
    private final Object key;

    @l
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;

    @l
    private final int[] placeableOffsets;

    @l
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;

    @m
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i5, int i6, List<? extends Placeable> list, long j5, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z4) {
        boolean z5;
        int width;
        this.index = i5;
        this.size = i6;
        this.placeables = list;
        this.visualOffset = j5;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z4;
        if (orientation == Orientation.Vertical) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isVertical = z5;
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Placeable placeable = (Placeable) list.get(i8);
            if (!this.isVertical) {
                width = placeable.getHeight();
            } else {
                width = placeable.getWidth();
            }
            i7 = Math.max(i7, width);
        }
        this.crossAxisSize = i7;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }

    public /* synthetic */ MeasuredPage(int i5, int i6, List list, long j5, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z4, w wVar) {
        this(i5, i6, list, j5, obj, orientation, horizontal, vertical, layoutDirection, z4);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m777copy4Tuh3kE(long j5, v3.l<? super Integer, Integer> lVar) {
        int m6172getXimpl = this.isVertical ? IntOffset.m6172getXimpl(j5) : lVar.invoke(Integer.valueOf(IntOffset.m6172getXimpl(j5))).intValue();
        boolean z4 = this.isVertical;
        int m6173getYimpl = IntOffset.m6173getYimpl(j5);
        if (z4) {
            m6173getYimpl = lVar.invoke(Integer.valueOf(m6173getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(m6172getXimpl, m6173getYimpl);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m778getOffsetBjo55l4(int i5) {
        int[] iArr = this.placeableOffsets;
        int i6 = i5 * 2;
        return IntOffsetKt.IntOffset(iArr[i6], iArr[i6 + 1]);
    }

    public final void applyScrollDelta(int i5) {
        this.offset = getOffset() + i5;
        int length = this.placeableOffsets.length;
        for (int i6 = 0; i6 < length; i6++) {
            boolean z4 = this.isVertical;
            if ((z4 && i6 % 2 == 1) || (!z4 && i6 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i6] = iArr[i6] + i5;
            }
        }
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    @l
    public final Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final void place(@l Placeable.PlacementScope placementScope) {
        boolean z4;
        int m6172getXimpl;
        int m6173getYimpl;
        if (this.mainAxisLayoutSize != Integer.MIN_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int size = this.placeables.size();
            for (int i5 = 0; i5 < size; i5++) {
                Placeable placeable = this.placeables.get(i5);
                long m778getOffsetBjo55l4 = m778getOffsetBjo55l4(i5);
                if (this.reverseLayout) {
                    if (this.isVertical) {
                        m6172getXimpl = IntOffset.m6172getXimpl(m778getOffsetBjo55l4);
                    } else {
                        m6172getXimpl = (this.mainAxisLayoutSize - IntOffset.m6172getXimpl(m778getOffsetBjo55l4)) - getMainAxisSize(placeable);
                    }
                    if (this.isVertical) {
                        m6173getYimpl = (this.mainAxisLayoutSize - IntOffset.m6173getYimpl(m778getOffsetBjo55l4)) - getMainAxisSize(placeable);
                    } else {
                        m6173getYimpl = IntOffset.m6173getYimpl(m778getOffsetBjo55l4);
                    }
                    m778getOffsetBjo55l4 = IntOffsetKt.IntOffset(m6172getXimpl, m6173getYimpl);
                }
                long j5 = this.visualOffset;
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m778getOffsetBjo55l4) + IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(m778getOffsetBjo55l4) + IntOffset.m6173getYimpl(j5));
                if (this.isVertical) {
                    Placeable.PlacementScope.m5052placeWithLayeraW9wM$default(placementScope, placeable, IntOffset, 0.0f, null, 6, null);
                } else {
                    Placeable.PlacementScope.m5051placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffset, 0.0f, null, 6, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i5, int i6, int i7) {
        int i8;
        int width;
        this.offset = i5;
        if (this.isVertical) {
            i8 = i7;
        } else {
            i8 = i6;
        }
        this.mainAxisLayoutSize = i8;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Placeable placeable = list.get(i9);
            int i10 = i9 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal != null) {
                    iArr[i10] = horizontal.align(placeable.getWidth(), i6, this.layoutDirection);
                    this.placeableOffsets[i10 + 1] = i5;
                    width = placeable.getHeight();
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment".toString());
                }
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i10] = i5;
                int i11 = i10 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical != null) {
                    iArr2[i11] = vertical.align(placeable.getHeight(), i7);
                    width = placeable.getWidth();
                } else {
                    throw new IllegalArgumentException("null verticalAlignment".toString());
                }
            }
            i5 += width;
        }
    }
}
