package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/selection/ClicksCounter;", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "update", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "prevClick", "newClick", "", "timeIsTolerable", "positionIsTolerable", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "", "clicks", "I", "getClicks", "()I", "setClicks", "(I)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "getPrevClick", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setPrevClick", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<init>", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClicksCounter {
    private int clicks;

    @m
    private PointerInputChange prevClick;

    @l
    private final ViewConfiguration viewConfiguration;

    public ClicksCounter(@l ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    public final int getClicks() {
        return this.clicks;
    }

    @m
    public final PointerInputChange getPrevClick() {
        return this.prevClick;
    }

    public final boolean positionIsTolerable(@l PointerInputChange pointerInputChange, @l PointerInputChange pointerInputChange2) {
        return ((double) Offset.m3491getDistanceimpl(Offset.m3497minusMKHz9U(pointerInputChange2.m4872getPositionF1C5BW0(), pointerInputChange.m4872getPositionF1C5BW0()))) < 100.0d;
    }

    public final void setClicks(int i5) {
        this.clicks = i5;
    }

    public final void setPrevClick(@m PointerInputChange pointerInputChange) {
        this.prevClick = pointerInputChange;
    }

    public final boolean timeIsTolerable(@l PointerInputChange pointerInputChange, @l PointerInputChange pointerInputChange2) {
        return pointerInputChange2.getUptimeMillis() - pointerInputChange.getUptimeMillis() < this.viewConfiguration.getDoubleTapTimeoutMillis();
    }

    public final void update(@l PointerEvent pointerEvent) {
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = pointerEvent.getChanges().get(0);
        if (pointerInputChange != null && timeIsTolerable(pointerInputChange, pointerInputChange2) && positionIsTolerable(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }
}
