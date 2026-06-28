package androidx.compose.foundation;

import android.view.SurfaceView;
import androidx.compose.foundation.AndroidExternalSurfaceZOrder;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/SurfaceView;", "view", "Lkotlin/r2;", "invoke", "(Landroid/view/SurfaceView;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1 extends n0 implements v3.l<SurfaceView, r2> {
    final /* synthetic */ boolean $isOpaque;
    final /* synthetic */ boolean $isSecure;
    final /* synthetic */ long $surfaceSize;
    final /* synthetic */ int $zOrder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1(long j5, boolean z4, int i5, boolean z5) {
        super(1);
        this.$surfaceSize = j5;
        this.$isOpaque = z4;
        this.$zOrder = i5;
        this.$isSecure = z5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SurfaceView surfaceView) {
        invoke2(surfaceView);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SurfaceView surfaceView) {
        if (!IntSize.m6212equalsimpl0(this.$surfaceSize, IntSize.Companion.m6219getZeroYbymL2g())) {
            surfaceView.getHolder().setFixedSize(IntSize.m6214getWidthimpl(this.$surfaceSize), IntSize.m6213getHeightimpl(this.$surfaceSize));
        } else {
            surfaceView.getHolder().setSizeFromLayout();
        }
        surfaceView.getHolder().setFormat(this.$isOpaque ? -1 : -3);
        int i5 = this.$zOrder;
        AndroidExternalSurfaceZOrder.Companion companion = AndroidExternalSurfaceZOrder.Companion;
        if (AndroidExternalSurfaceZOrder.m189equalsimpl0(i5, companion.m193getBehindB_4ceCc())) {
            surfaceView.setZOrderOnTop(false);
        } else if (AndroidExternalSurfaceZOrder.m189equalsimpl0(i5, companion.m194getMediaOverlayB_4ceCc())) {
            surfaceView.setZOrderMediaOverlay(true);
        } else if (AndroidExternalSurfaceZOrder.m189equalsimpl0(i5, companion.m195getOnTopB_4ceCc())) {
            surfaceView.setZOrderOnTop(true);
        }
        surfaceView.setSecure(this.$isSecure);
    }
}
