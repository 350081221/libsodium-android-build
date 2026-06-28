package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0015\"\b\b\u0001\u0010\u0016*\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00160\u0019H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFLjava/lang/Object;)V", "getDampingRatio", "()F", "getStiffness", "getVisibilityThreshold", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "vectorize", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final float dampingRatio;
    private final float stiffness;

    @m
    private final T visibilityThreshold;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public SpringSpec(float f5, float f6, @m T t5) {
        this.dampingRatio = f5;
        this.stiffness = f6;
        this.visibilityThreshold = t5;
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        if (!(obj instanceof SpringSpec)) {
            return false;
        }
        SpringSpec springSpec = (SpringSpec) obj;
        if (springSpec.dampingRatio == this.dampingRatio) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (springSpec.stiffness == this.stiffness) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 || !l0.g(springSpec.visibilityThreshold, this.visibilityThreshold)) {
            return false;
        }
        return true;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @m
    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t5 = this.visibilityThreshold;
        return ((((t5 != null ? t5.hashCode() : 0) * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @l
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(@l TwoWayConverter<T, V> twoWayConverter) {
        AnimationVector convert;
        float f5 = this.dampingRatio;
        float f6 = this.stiffness;
        convert = AnimationSpecKt.convert(twoWayConverter, this.visibilityThreshold);
        return new VectorizedSpringSpec<>(f5, f6, convert);
    }

    public /* synthetic */ SpringSpec(float f5, float f6, Object obj, int i5, w wVar) {
        this((i5 & 1) != 0 ? 1.0f : f5, (i5 & 2) != 0 ? 1500.0f : f6, (i5 & 4) != 0 ? null : obj);
    }
}
