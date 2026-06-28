package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import kotlin.i0;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceState;", "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "Lkotlin/r2;", "surfaceCreated", "", "format", "width", "height", "surfaceChanged", "surfaceDestroyed", "lastWidth", "I", "getLastWidth", "()I", "setLastWidth", "(I)V", "lastHeight", "getLastHeight", "setLastHeight", "Lkotlinx/coroutines/s0;", "scope", "<init>", "(Lkotlinx/coroutines/s0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidExternalSurfaceState extends BaseAndroidExternalSurfaceState implements SurfaceHolder.Callback {
    private int lastHeight;
    private int lastWidth;

    public AndroidExternalSurfaceState(@p4.l s0 s0Var) {
        super(s0Var);
        this.lastWidth = -1;
        this.lastHeight = -1;
    }

    public final int getLastHeight() {
        return this.lastHeight;
    }

    public final int getLastWidth() {
        return this.lastWidth;
    }

    public final void setLastHeight(int i5) {
        this.lastHeight = i5;
    }

    public final void setLastWidth(int i5) {
        this.lastWidth = i5;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@p4.l SurfaceHolder surfaceHolder, int i5, int i6, int i7) {
        if (this.lastWidth != i6 || this.lastHeight != i7) {
            this.lastWidth = i6;
            this.lastHeight = i7;
            dispatchSurfaceChanged(surfaceHolder.getSurface(), i6, i7);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@p4.l SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.lastWidth = surfaceFrame.width();
        this.lastHeight = surfaceFrame.height();
        dispatchSurfaceCreated(surfaceHolder.getSurface(), this.lastWidth, this.lastHeight);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@p4.l SurfaceHolder surfaceHolder) {
        dispatchSurfaceDestroyed(surfaceHolder.getSurface());
    }
}
