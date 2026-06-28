package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0005\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016R*\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010!\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010$\u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlin/r2;", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector2D;", "newVector", "", "index", "", "get$animation_core_release", "(I)F", "get", t0.b.f22420d, "set$animation_core_release", "(IF)V", "set", "", "toString", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "<set-?>", com.alipay.sdk.m.x.c.f3016c, "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", com.alipay.sdk.m.x.c.f3017d, "getV2", "setV2$animation_core_release", "size", "I", "getSize$animation_core_release", "()I", "<init>", "(FF)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationVector2D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1, reason: collision with root package name */
    private float f230v1;

    /* renamed from: v2, reason: collision with root package name */
    private float f231v2;

    public AnimationVector2D(float f5, float f6) {
        super(null);
        this.f230v1 = f5;
        this.f231v2 = f6;
        this.size = 2;
    }

    public boolean equals(@m Object obj) {
        if (!(obj instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        if (animationVector2D.f230v1 == this.f230v1) {
            return (animationVector2D.f231v2 > this.f231v2 ? 1 : (animationVector2D.f231v2 == this.f231v2 ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                return 0.0f;
            }
            return this.f231v2;
        }
        return this.f230v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f230v1;
    }

    public final float getV2() {
        return this.f231v2;
    }

    public int hashCode() {
        return (Float.hashCode(this.f230v1) * 31) + Float.hashCode(this.f231v2);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f230v1 = 0.0f;
        this.f231v2 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i5, float f5) {
        if (i5 != 0) {
            if (i5 == 1) {
                this.f231v2 = f5;
                return;
            }
            return;
        }
        this.f230v1 = f5;
    }

    public final void setV1$animation_core_release(float f5) {
        this.f230v1 = f5;
    }

    public final void setV2$animation_core_release(float f5) {
        this.f231v2 = f5;
    }

    @l
    public String toString() {
        return "AnimationVector2D: v1 = " + this.f230v1 + ", v2 = " + this.f231v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @l
    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }
}
