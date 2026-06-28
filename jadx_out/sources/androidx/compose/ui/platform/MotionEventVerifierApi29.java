package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/MotionEventVerifierApi29;", "", "()V", "isValidMotionEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "index", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(29)
/* loaded from: classes.dex */
final class MotionEventVerifierApi29 {

    @p4.l
    public static final MotionEventVerifierApi29 INSTANCE = new MotionEventVerifierApi29();

    private MotionEventVerifierApi29() {
    }

    @DoNotInline
    public final boolean isValidMotionEvent(@p4.l MotionEvent motionEvent, int i5) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i5);
        if ((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true) {
            rawY = motionEvent.getRawY(i5);
            if ((Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
