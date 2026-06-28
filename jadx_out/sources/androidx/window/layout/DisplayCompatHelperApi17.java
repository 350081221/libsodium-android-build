package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/window/layout/DisplayCompatHelperApi17;", "", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "point", "Lkotlin/r2;", "getRealSize", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
@RequiresApi(17)
/* loaded from: classes2.dex */
public final class DisplayCompatHelperApi17 {

    @l
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(@l Display display, @l Point point) {
        l0.p(display, "display");
        l0.p(point, "point");
        display.getRealSize(point);
    }
}
