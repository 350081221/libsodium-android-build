package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "", "start", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "end", "handlesCrossed", "", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)V", "getEnd", "()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getHandlesCrossed", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "", "merge", "toString", "", "toTextRange", "Landroidx/compose/ui/text/TextRange;", "toTextRange-d9O1mEE", "()J", "AnchorInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class Selection {
    public static final int $stable = 0;

    @l
    private final AnchorInfo end;
    private final boolean handlesCrossed;

    @l
    private final AnchorInfo start;

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/ui/text/style/ResolvedTextDirection;", TypedValues.CycleType.S_WAVE_OFFSET, "", "selectableId", "", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)V", "getDirection", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getOffset", "()I", "getSelectableId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class AnchorInfo {
        public static final int $stable = 0;

        @l
        private final ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public AnchorInfo(@l ResolvedTextDirection resolvedTextDirection, int i5, long j5) {
            this.direction = resolvedTextDirection;
            this.offset = i5;
            this.selectableId = j5;
        }

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i5, long j5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i6 & 2) != 0) {
                i5 = anchorInfo.offset;
            }
            if ((i6 & 4) != 0) {
                j5 = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i5, j5);
        }

        @l
        public final ResolvedTextDirection component1() {
            return this.direction;
        }

        public final int component2() {
            return this.offset;
        }

        public final long component3() {
            return this.selectableId;
        }

        @l
        public final AnchorInfo copy(@l ResolvedTextDirection resolvedTextDirection, int i5, long j5) {
            return new AnchorInfo(resolvedTextDirection, i5, j5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        @l
        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Long.hashCode(this.selectableId);
        }

        @l
        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }
    }

    public Selection(@l AnchorInfo anchorInfo, @l AnchorInfo anchorInfo2, boolean z4) {
        this.start = anchorInfo;
        this.end = anchorInfo2;
        this.handlesCrossed = z4;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i5 & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i5 & 4) != 0) {
            z4 = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z4);
    }

    @l
    public final AnchorInfo component1() {
        return this.start;
    }

    @l
    public final AnchorInfo component2() {
        return this.end;
    }

    public final boolean component3() {
        return this.handlesCrossed;
    }

    @l
    public final Selection copy(@l AnchorInfo anchorInfo, @l AnchorInfo anchorInfo2, boolean z4) {
        return new Selection(anchorInfo, anchorInfo2, z4);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return l0.g(this.start, selection.start) && l0.g(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    @l
    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @l
    public final AnchorInfo getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.start.hashCode() * 31) + this.end.hashCode()) * 31) + Boolean.hashCode(this.handlesCrossed);
    }

    @l
    public final Selection merge(@m Selection selection) {
        AnchorInfo anchorInfo;
        AnchorInfo anchorInfo2;
        if (selection == null) {
            return this;
        }
        boolean z4 = this.handlesCrossed;
        if (!z4 && !selection.handlesCrossed) {
            return copy$default(this, null, selection.end, false, 5, null);
        }
        if (selection.handlesCrossed) {
            anchorInfo = selection.start;
        } else {
            anchorInfo = selection.end;
        }
        if (z4) {
            anchorInfo2 = this.end;
        } else {
            anchorInfo2 = this.start;
        }
        return new Selection(anchorInfo, anchorInfo2, true);
    }

    @l
    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    /* renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m986toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z4, int i5, w wVar) {
        this(anchorInfo, anchorInfo2, (i5 & 4) != 0 ? false : z4);
    }
}
