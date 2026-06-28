package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0016\u0010\u0007\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003J7\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/animation/Scale;", "", "", "component1", "Landroidx/compose/ui/graphics/TransformOrigin;", "component2-SzJe1aQ", "()J", "component2", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "component3", "scale", "transformOrigin", "animationSpec", "copy-bnNdC4k", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Scale;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "F", "getScale", "()F", "J", "getTransformOrigin-SzJe1aQ", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "<init>", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/internal/w;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class Scale {
    public static final int $stable = 0;

    @l
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    private Scale(float f5, long j5, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scale = f5;
        this.transformOrigin = j5;
        this.animationSpec = finiteAnimationSpec;
    }

    public /* synthetic */ Scale(float f5, long j5, FiniteAnimationSpec finiteAnimationSpec, w wVar) {
        this(f5, j5, finiteAnimationSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ Scale m90copybnNdC4k$default(Scale scale, float f5, long j5, FiniteAnimationSpec finiteAnimationSpec, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = scale.scale;
        }
        if ((i5 & 2) != 0) {
            j5 = scale.transformOrigin;
        }
        if ((i5 & 4) != 0) {
            finiteAnimationSpec = scale.animationSpec;
        }
        return scale.m92copybnNdC4k(f5, j5, finiteAnimationSpec);
    }

    public final float component1() {
        return this.scale;
    }

    /* renamed from: component2-SzJe1aQ, reason: not valid java name */
    public final long m91component2SzJe1aQ() {
        return this.transformOrigin;
    }

    @l
    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    @l
    /* renamed from: copy-bnNdC4k, reason: not valid java name */
    public final Scale m92copybnNdC4k(float f5, long j5, @l FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new Scale(f5, j5, finiteAnimationSpec, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m4117equalsimpl0(this.transformOrigin, scale.transformOrigin) && l0.g(this.animationSpec, scale.animationSpec);
    }

    @l
    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m93getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + TransformOrigin.m4120hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    @l
    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m4121toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }
}
