package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0015J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "createRenderEffect", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "", "radiusX", "F", "radiusY", "Landroidx/compose/ui/graphics/TileMode;", "edgeTreatment", "I", "<init>", "(Landroidx/compose/ui/graphics/RenderEffect;FFILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class BlurEffect extends RenderEffect {
    private final int edgeTreatment;
    private final float radiusX;
    private final float radiusY;

    @p4.m
    private final RenderEffect renderEffect;

    private BlurEffect(RenderEffect renderEffect, float f5, float f6, int i5) {
        super(null);
        this.renderEffect = renderEffect;
        this.radiusX = f5;
        this.radiusY = f6;
        this.edgeTreatment = i5;
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f5, float f6, int i5, kotlin.jvm.internal.w wVar) {
        this(renderEffect, f5, f6, i5);
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @p4.l
    @RequiresApi(31)
    protected android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m4042createBlurEffect8A3gB4(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(@p4.m Object obj) {
        boolean z4;
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        if (this.radiusX == blurEffect.radiusX) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.radiusY == blurEffect.radiusY) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && TileMode.m4101equalsimpl0(this.edgeTreatment, blurEffect.edgeTreatment) && kotlin.jvm.internal.l0.g(this.renderEffect, blurEffect.renderEffect)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i5;
        RenderEffect renderEffect = this.renderEffect;
        if (renderEffect != null) {
            i5 = renderEffect.hashCode();
        } else {
            i5 = 0;
        }
        return (((((i5 * 31) + Float.hashCode(this.radiusX)) * 31) + Float.hashCode(this.radiusY)) * 31) + TileMode.m4102hashCodeimpl(this.edgeTreatment);
    }

    @p4.l
    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) TileMode.m4103toStringimpl(this.edgeTreatment)) + ')';
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f5, float f6, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(renderEffect, f5, (i6 & 4) != 0 ? f5 : f6, (i6 & 8) != 0 ? TileMode.Companion.m4105getClamp3opZhB0() : i5, null);
    }
}
