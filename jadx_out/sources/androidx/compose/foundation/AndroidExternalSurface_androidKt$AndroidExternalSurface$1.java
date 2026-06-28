package androidx.compose.foundation;

import android.content.Context;
import android.view.SurfaceView;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/SurfaceView;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidExternalSurface_androidKt$AndroidExternalSurface$1 extends n0 implements v3.l<Context, SurfaceView> {
    final /* synthetic */ v3.l<AndroidExternalSurfaceScope, r2> $onInit;
    final /* synthetic */ AndroidExternalSurfaceState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidExternalSurface_androidKt$AndroidExternalSurface$1(v3.l<? super AndroidExternalSurfaceScope, r2> lVar, AndroidExternalSurfaceState androidExternalSurfaceState) {
        super(1);
        this.$onInit = lVar;
        this.$state = androidExternalSurfaceState;
    }

    @Override // v3.l
    @p4.l
    public final SurfaceView invoke(@p4.l Context context) {
        SurfaceView surfaceView = new SurfaceView(context);
        v3.l<AndroidExternalSurfaceScope, r2> lVar = this.$onInit;
        AndroidExternalSurfaceState androidExternalSurfaceState = this.$state;
        lVar.invoke(androidExternalSurfaceState);
        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
        return surfaceView;
    }
}
