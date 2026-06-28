package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.tendcloud.tenddata.cq;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\n\u0010-\u001a\u00020.*\u00020.J\n\u0010-\u001a\u00020/*\u00020/J\u0014\u0010-\u001a\u000200*\u000200ø\u0001\u0000¢\u0006\u0004\b1\u00102J\n\u00103\u001a\u00020\u0005*\u00020\u0005J\n\u00104\u001a\u00020\u0005*\u00020\u0005J\n\u00105\u001a\u00020\n*\u00020\nJ\u0014\u00106\u001a\u000207*\u000207ø\u0001\u0000¢\u0006\u0004\b8\u00102J\n\u00109\u001a\u00020\u0005*\u00020\u0005J\n\u0010:\u001a\u00020\u0005*\u00020\u0005J\n\u0010;\u001a\u00020\n*\u00020\nR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "startIndex", "", "endIndex", "startLineIndex", "endLineIndex", "top", "", "bottom", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "getBottom", "()F", "setBottom", "(F)V", "getEndIndex", "()I", "getEndLineIndex", "setEndLineIndex", "(I)V", cq.a.LENGTH, "getLength", "getParagraph", "()Landroidx/compose/ui/text/Paragraph;", "getStartIndex", "getStartLineIndex", "setStartLineIndex", "getTop", "setTop", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "toGlobal", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "toGlobal-GEjPoXI", "(J)J", "toGlobalIndex", "toGlobalLineIndex", "toGlobalYPosition", "toLocal", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "toLocalIndex", "toLocalLineIndex", "toLocalYPosition", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;

    @l
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public ParagraphInfo(@l Paragraph paragraph, int i5, int i6, int i7, int i8, float f5, float f6) {
        this.paragraph = paragraph;
        this.startIndex = i5;
        this.endIndex = i6;
        this.startLineIndex = i7;
        this.endLineIndex = i8;
        this.top = f5;
        this.bottom = f6;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i5, int i6, int i7, int i8, float f5, float f6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i9 & 2) != 0) {
            i5 = paragraphInfo.startIndex;
        }
        int i10 = i5;
        if ((i9 & 4) != 0) {
            i6 = paragraphInfo.endIndex;
        }
        int i11 = i6;
        if ((i9 & 8) != 0) {
            i7 = paragraphInfo.startLineIndex;
        }
        int i12 = i7;
        if ((i9 & 16) != 0) {
            i8 = paragraphInfo.endLineIndex;
        }
        int i13 = i8;
        if ((i9 & 32) != 0) {
            f5 = paragraphInfo.top;
        }
        float f7 = f5;
        if ((i9 & 64) != 0) {
            f6 = paragraphInfo.bottom;
        }
        return paragraphInfo.copy(paragraph, i10, i11, i12, i13, f7, f6);
    }

    @l
    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    @l
    public final ParagraphInfo copy(@l Paragraph paragraph, int i5, int i6, int i7, int i8, float f5, float f6) {
        return new ParagraphInfo(paragraph, i5, i6, i7, i8, f5, f6);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return l0.g(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    @l
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public final void setBottom(float f5) {
        this.bottom = f5;
    }

    public final void setEndLineIndex(int i5) {
        this.endLineIndex = i5;
    }

    public final void setStartLineIndex(int i5) {
        this.startLineIndex = i5;
    }

    public final void setTop(float f5) {
        this.top = f5;
    }

    @l
    public final Rect toGlobal(@l Rect rect) {
        return rect.m3530translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
    }

    /* renamed from: toGlobal-GEjPoXI, reason: not valid java name */
    public final long m5434toGlobalGEjPoXI(long j5) {
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m5545getStartimpl(j5)), toGlobalIndex(TextRange.m5540getEndimpl(j5)));
    }

    public final int toGlobalIndex(int i5) {
        return i5 + this.startIndex;
    }

    public final int toGlobalLineIndex(int i5) {
        return i5 + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f5) {
        return f5 + this.top;
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m5435toLocalMKHz9U(long j5) {
        return OffsetKt.Offset(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5) - this.top);
    }

    public final int toLocalIndex(int i5) {
        int I;
        I = u.I(i5, this.startIndex, this.endIndex);
        return I - this.startIndex;
    }

    public final int toLocalLineIndex(int i5) {
        return i5 - this.startLineIndex;
    }

    public final float toLocalYPosition(float f5) {
        return f5 - this.top;
    }

    @l
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    @l
    public final Path toGlobal(@l Path path) {
        path.mo3629translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
        return path;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i5, int i6, int i7, int i8, float f5, float f6, int i9, w wVar) {
        this(paragraph, i5, i6, (i9 & 8) != 0 ? -1 : i7, (i9 & 16) != 0 ? -1 : i8, (i9 & 32) != 0 ? -1.0f : f5, (i9 & 64) != 0 ? -1.0f : f6);
    }
}
