package androidx.compose.foundation;

import android.content.Context;
import android.view.TextureView;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/TextureView;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 extends n0 implements v3.l<Context, TextureView> {
    final /* synthetic */ v3.l<AndroidExternalSurfaceScope, r2> $onInit;
    final /* synthetic */ AndroidEmbeddedExternalSurfaceState $state;
    final /* synthetic */ long $surfaceSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1(AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState, long j5, v3.l<? super AndroidExternalSurfaceScope, r2> lVar) {
        super(1);
        this.$state = androidEmbeddedExternalSurfaceState;
        this.$surfaceSize = j5;
        this.$onInit = lVar;
    }

    @Override // v3.l
    @p4.l
    public final TextureView invoke(@p4.l Context context) {
        TextureView textureView = new TextureView(context);
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = this.$state;
        long j5 = this.$surfaceSize;
        v3.l<AndroidExternalSurfaceScope, r2> lVar = this.$onInit;
        androidEmbeddedExternalSurfaceState.m185setSurfaceSizeozmzZPI(j5);
        lVar.invoke(androidEmbeddedExternalSurfaceState);
        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
        return textureView;
    }
}
