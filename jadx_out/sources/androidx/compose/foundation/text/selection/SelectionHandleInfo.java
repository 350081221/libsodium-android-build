package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0016\u0010\u0007\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "Landroidx/compose/foundation/text/Handle;", "component1", "Landroidx/compose/ui/geometry/Offset;", "component2-F1C5BW0", "()J", "component2", "Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "component3", "", "component4", "handle", "position", "anchor", "visible", "copy-ubNVwUQ", "(Landroidx/compose/foundation/text/Handle;JLandroidx/compose/foundation/text/selection/SelectionHandleAnchor;Z)Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "equals", "Landroidx/compose/foundation/text/Handle;", "getHandle", "()Landroidx/compose/foundation/text/Handle;", "J", "getPosition-F1C5BW0", "Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "getAnchor", "()Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "Z", "getVisible", "()Z", "<init>", "(Landroidx/compose/foundation/text/Handle;JLandroidx/compose/foundation/text/selection/SelectionHandleAnchor;ZLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    public static final int $stable = 0;

    @l
    private final SelectionHandleAnchor anchor;

    @l
    private final Handle handle;
    private final long position;
    private final boolean visible;

    private SelectionHandleInfo(Handle handle, long j5, SelectionHandleAnchor selectionHandleAnchor, boolean z4) {
        this.handle = handle;
        this.position = j5;
        this.anchor = selectionHandleAnchor;
        this.visible = z4;
    }

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j5, SelectionHandleAnchor selectionHandleAnchor, boolean z4, w wVar) {
        this(handle, j5, selectionHandleAnchor, z4);
    }

    /* renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m990copyubNVwUQ$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j5, SelectionHandleAnchor selectionHandleAnchor, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i5 & 2) != 0) {
            j5 = selectionHandleInfo.position;
        }
        long j6 = j5;
        if ((i5 & 4) != 0) {
            selectionHandleAnchor = selectionHandleInfo.anchor;
        }
        SelectionHandleAnchor selectionHandleAnchor2 = selectionHandleAnchor;
        if ((i5 & 8) != 0) {
            z4 = selectionHandleInfo.visible;
        }
        return selectionHandleInfo.m992copyubNVwUQ(handle, j6, selectionHandleAnchor2, z4);
    }

    @l
    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m991component2F1C5BW0() {
        return this.position;
    }

    @l
    public final SelectionHandleAnchor component3() {
        return this.anchor;
    }

    public final boolean component4() {
        return this.visible;
    }

    @l
    /* renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final SelectionHandleInfo m992copyubNVwUQ(@l Handle handle, long j5, @l SelectionHandleAnchor selectionHandleAnchor, boolean z4) {
        return new SelectionHandleInfo(handle, j5, selectionHandleAnchor, z4, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m3490equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    @l
    public final SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    @l
    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m993getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (((((this.handle.hashCode() * 31) + Offset.m3495hashCodeimpl(this.position)) * 31) + this.anchor.hashCode()) * 31) + Boolean.hashCode(this.visible);
    }

    @l
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m3501toStringimpl(this.position)) + ", anchor=" + this.anchor + ", visible=" + this.visible + ')';
    }
}
