package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0015J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "createRenderEffect", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "J", "<init>", "(Landroidx/compose/ui/graphics/RenderEffect;JLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class OffsetEffect extends RenderEffect {
    private final long offset;

    @p4.m
    private final RenderEffect renderEffect;

    private OffsetEffect(RenderEffect renderEffect, long j5) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j5;
    }

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect, long j5, kotlin.jvm.internal.w wVar) {
        this(renderEffect, j5);
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @p4.l
    @RequiresApi(31)
    protected android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m4043createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        if (kotlin.jvm.internal.l0.g(this.renderEffect, offsetEffect.renderEffect) && Offset.m3490equalsimpl0(this.offset, offsetEffect.offset)) {
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
        return (i5 * 31) + Offset.m3495hashCodeimpl(this.offset);
    }

    @p4.l
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m3501toStringimpl(this.offset)) + ')';
    }
}
