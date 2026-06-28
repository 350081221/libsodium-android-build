package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4 extends n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isOpaque;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<AndroidExternalSurfaceScope, r2> $onInit;
    final /* synthetic */ long $surfaceSize;
    final /* synthetic */ float[] $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4(Modifier modifier, boolean z4, long j5, float[] fArr, v3.l<? super AndroidExternalSurfaceScope, r2> lVar, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$isOpaque = z4;
        this.$surfaceSize = j5;
        this.$transform = fArr;
        this.$onInit = lVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        AndroidExternalSurface_androidKt.m196AndroidEmbeddedExternalSurfacesv6N_fY(this.$modifier, this.$isOpaque, this.$surfaceSize, this.$transform, this.$onInit, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
