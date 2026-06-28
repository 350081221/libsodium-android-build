package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/CanvasZHelper;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Lkotlin/r2;", "enableZ", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(29)
/* loaded from: classes.dex */
final class CanvasZHelper {

    @p4.l
    public static final CanvasZHelper INSTANCE = new CanvasZHelper();

    private CanvasZHelper() {
    }

    @DoNotInline
    public final void enableZ(@p4.l android.graphics.Canvas canvas, boolean z4) {
        if (z4) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
