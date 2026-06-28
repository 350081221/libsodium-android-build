package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016R(\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "", "width", "height", "Lkotlin/r2;", "onSurfaceTextureAvailable", "onSurfaceTextureSizeChanged", "", "onSurfaceTextureDestroyed", "surface", "onSurfaceTextureUpdated", "Landroidx/compose/ui/unit/IntSize;", "surfaceSize", "J", "getSurfaceSize-YbymL2g", "()J", "setSurfaceSize-ozmzZPI", "(J)V", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "Landroid/view/Surface;", "surfaceTextureSurface", "Landroid/view/Surface;", "Lkotlinx/coroutines/s0;", "scope", "<init>", "(Lkotlinx/coroutines/s0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {

    @p4.l
    private final Matrix matrix;
    private long surfaceSize;

    @p4.m
    private Surface surfaceTextureSurface;

    public AndroidEmbeddedExternalSurfaceState(@p4.l s0 s0Var) {
        super(s0Var);
        this.surfaceSize = IntSize.Companion.m6219getZeroYbymL2g();
        this.matrix = new Matrix();
    }

    @p4.l
    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m184getSurfaceSizeYbymL2g() {
        return this.surfaceSize;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@p4.l SurfaceTexture surfaceTexture, int i5, int i6) {
        if (!IntSize.m6212equalsimpl0(this.surfaceSize, IntSize.Companion.m6219getZeroYbymL2g())) {
            i5 = IntSize.m6214getWidthimpl(this.surfaceSize);
            i6 = IntSize.m6213getHeightimpl(this.surfaceSize);
            surfaceTexture.setDefaultBufferSize(i5, i6);
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, i5, i6);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@p4.l SurfaceTexture surfaceTexture) {
        Surface surface = this.surfaceTextureSurface;
        l0.m(surface);
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@p4.l SurfaceTexture surfaceTexture, int i5, int i6) {
        if (!IntSize.m6212equalsimpl0(this.surfaceSize, IntSize.Companion.m6219getZeroYbymL2g())) {
            i5 = IntSize.m6214getWidthimpl(this.surfaceSize);
            i6 = IntSize.m6213getHeightimpl(this.surfaceSize);
            surfaceTexture.setDefaultBufferSize(i5, i6);
        }
        Surface surface = this.surfaceTextureSurface;
        l0.m(surface);
        dispatchSurfaceChanged(surface, i5, i6);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@p4.l SurfaceTexture surfaceTexture) {
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m185setSurfaceSizeozmzZPI(long j5) {
        this.surfaceSize = j5;
    }
}
