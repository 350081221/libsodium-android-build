package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", "handleColor", "J", "getHandleColor-0d7_KjU", "()J", "backgroundColor", "getBackgroundColor-0d7_KjU", "<init>", "(JJLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    private TextSelectionColors(long j5, long j6) {
        this.handleColor = j5;
        this.backgroundColor = j6;
    }

    public /* synthetic */ TextSelectionColors(long j5, long j6, w wVar) {
        this(j5, j6);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        if (Color.m3735equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m3735equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1058getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m1059getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return (Color.m3741hashCodeimpl(this.handleColor) * 31) + Color.m3741hashCodeimpl(this.backgroundColor);
    }

    @l
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m3742toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m3742toStringimpl(this.backgroundColor)) + ')';
    }
}
