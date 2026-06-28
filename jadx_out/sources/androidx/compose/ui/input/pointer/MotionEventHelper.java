package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventHelper;", "", "()V", "toRawOffset", "Landroidx/compose/ui/geometry/Offset;", "motionEvent", "Landroid/view/MotionEvent;", "index", "", "toRawOffset-dBAh8RU", "(Landroid/view/MotionEvent;I)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(29)
/* loaded from: classes.dex */
final class MotionEventHelper {

    @l
    public static final MotionEventHelper INSTANCE = new MotionEventHelper();

    private MotionEventHelper() {
    }

    @DoNotInline
    /* renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public final long m4803toRawOffsetdBAh8RU(@l MotionEvent motionEvent, int i5) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i5);
        rawY = motionEvent.getRawY(i5);
        return OffsetKt.Offset(rawX, rawY);
    }
}
