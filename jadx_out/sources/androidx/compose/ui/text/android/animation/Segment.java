package androidx.compose.ui.text.android.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/android/animation/Segment;", "", "startOffset", "", "endOffset", "left", "top", "right", "bottom", "(IIIIII)V", "getBottom", "()I", "getEndOffset", "getLeft", "getRight", "getStartOffset", "getTop", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Segment {
    public static final int $stable = 0;
    private final int bottom;
    private final int endOffset;
    private final int left;
    private final int right;
    private final int startOffset;
    private final int top;

    public Segment(int i5, int i6, int i7, int i8, int i9, int i10) {
        this.startOffset = i5;
        this.endOffset = i6;
        this.left = i7;
        this.top = i8;
        this.right = i9;
        this.bottom = i10;
    }

    public static /* synthetic */ Segment copy$default(Segment segment, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = segment.startOffset;
        }
        if ((i11 & 2) != 0) {
            i6 = segment.endOffset;
        }
        int i12 = i6;
        if ((i11 & 4) != 0) {
            i7 = segment.left;
        }
        int i13 = i7;
        if ((i11 & 8) != 0) {
            i8 = segment.top;
        }
        int i14 = i8;
        if ((i11 & 16) != 0) {
            i9 = segment.right;
        }
        int i15 = i9;
        if ((i11 & 32) != 0) {
            i10 = segment.bottom;
        }
        return segment.copy(i5, i12, i13, i14, i15, i10);
    }

    public final int component1() {
        return this.startOffset;
    }

    public final int component2() {
        return this.endOffset;
    }

    public final int component3() {
        return this.left;
    }

    public final int component4() {
        return this.top;
    }

    public final int component5() {
        return this.right;
    }

    public final int component6() {
        return this.bottom;
    }

    @l
    public final Segment copy(int i5, int i6, int i7, int i8, int i9, int i10) {
        return new Segment(i5, i6, i7, i8, i9, i10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) obj;
        return this.startOffset == segment.startOffset && this.endOffset == segment.endOffset && this.left == segment.left && this.top == segment.top && this.right == segment.right && this.bottom == segment.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getEndOffset() {
        return this.endOffset;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.startOffset) * 31) + Integer.hashCode(this.endOffset)) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    @l
    public String toString() {
        return "Segment(startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
    }
}
