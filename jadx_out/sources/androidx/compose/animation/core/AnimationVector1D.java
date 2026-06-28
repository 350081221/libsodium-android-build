package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016R*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlin/r2;", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector1D;", "newVector", "", "index", "", "get$animation_core_release", "(I)F", "get", t0.b.f22420d, "set$animation_core_release", "(IF)V", "set", "", "toString", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "<set-?>", "F", "getValue", "()F", "setValue$animation_core_release", "(F)V", "size", "I", "getSize$animation_core_release", "()I", "initVal", "<init>", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float value;

    public AnimationVector1D(float f5) {
        super(null);
        this.value = f5;
        this.size = 1;
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof AnimationVector1D) {
            return (((AnimationVector1D) obj).value > this.value ? 1 : (((AnimationVector1D) obj).value == this.value ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i5) {
        if (i5 == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i5, float f5) {
        if (i5 == 0) {
            this.value = f5;
        }
    }

    public final void setValue$animation_core_release(float f5) {
        this.value = f5;
    }

    @l
    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @l
    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }
}
