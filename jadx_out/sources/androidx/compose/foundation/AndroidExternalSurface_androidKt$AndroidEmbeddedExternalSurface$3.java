package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/TextureView;", "view", "Lkotlin/r2;", "invoke", "(Landroid/view/TextureView;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,480:1\n1#2:481\n*E\n"})
/* loaded from: classes.dex */
final class AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3 extends n0 implements v3.l<TextureView, r2> {
    final /* synthetic */ boolean $isOpaque;
    final /* synthetic */ AndroidEmbeddedExternalSurfaceState $state;
    final /* synthetic */ long $surfaceSize;
    final /* synthetic */ float[] $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3(long j5, AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState, boolean z4, float[] fArr) {
        super(1);
        this.$surfaceSize = j5;
        this.$state = androidEmbeddedExternalSurfaceState;
        this.$isOpaque = z4;
        this.$transform = fArr;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(TextureView textureView) {
        invoke2(textureView);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l TextureView textureView) {
        Matrix matrix;
        SurfaceTexture surfaceTexture;
        if (!IntSize.m6212equalsimpl0(this.$surfaceSize, IntSize.Companion.m6219getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize(IntSize.m6214getWidthimpl(this.$surfaceSize), IntSize.m6213getHeightimpl(this.$surfaceSize));
        }
        this.$state.m185setSurfaceSizeozmzZPI(this.$surfaceSize);
        textureView.setOpaque(this.$isOpaque);
        float[] fArr = this.$transform;
        if (fArr != null) {
            matrix = this.$state.getMatrix();
            AndroidMatrixConversions_androidKt.m3604setFromEL8BTi8(matrix, fArr);
        } else {
            matrix = null;
        }
        textureView.setTransform(matrix);
    }
}
