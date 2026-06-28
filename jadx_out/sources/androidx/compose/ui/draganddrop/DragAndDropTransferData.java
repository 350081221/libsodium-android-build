package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "", "clipData", "Landroid/content/ClipData;", "localState", "flags", "", "(Landroid/content/ClipData;Ljava/lang/Object;I)V", "getClipData", "()Landroid/content/ClipData;", "getFlags", "()I", "getLocalState", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropTransferData {
    public static final int $stable = 8;

    @l
    private final ClipData clipData;
    private final int flags;

    @m
    private final Object localState;

    public DragAndDropTransferData(@l ClipData clipData, @m Object obj, int i5) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i5;
    }

    @l
    public final ClipData getClipData() {
        return this.clipData;
    }

    public final int getFlags() {
        return this.flags;
    }

    @m
    public final Object getLocalState() {
        return this.localState;
    }

    public /* synthetic */ DragAndDropTransferData(ClipData clipData, Object obj, int i5, int i6, w wVar) {
        this(clipData, (i6 & 2) != 0 ? null : obj, (i6 & 4) != 0 ? 0 : i5);
    }
}
