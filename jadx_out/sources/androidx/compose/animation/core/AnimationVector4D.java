package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0006\u0010'\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0005\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016R*\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010!\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R*\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R*\u0010'\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\u001a\u0010*\u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlin/r2;", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector4D;", "newVector", "", "index", "", "get$animation_core_release", "(I)F", "get", t0.b.f22420d, "set$animation_core_release", "(IF)V", "set", "", "toString", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "<set-?>", com.alipay.sdk.m.x.c.f3016c, "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", com.alipay.sdk.m.x.c.f3017d, "getV2", "setV2$animation_core_release", "v3", "getV3", "setV3$animation_core_release", "v4", "getV4", "setV4$animation_core_release", "size", "I", "getSize$animation_core_release", "()I", "<init>", "(FFFF)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1, reason: collision with root package name */
    private float f235v1;

    /* renamed from: v2, reason: collision with root package name */
    private float f236v2;

    /* renamed from: v3, reason: collision with root package name */
    private float f237v3;
    private float v4;

    public AnimationVector4D(float f5, float f6, float f7, float f8) {
        super(null);
        this.f235v1 = f5;
        this.f236v2 = f6;
        this.f237v3 = f7;
        this.v4 = f8;
        this.size = 4;
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        if (animationVector4D.f235v1 == this.f235v1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (animationVector4D.f236v2 == this.f236v2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (animationVector4D.f237v3 == this.f237v3) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (animationVector4D.v4 == this.v4) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        return 0.0f;
                    }
                    return this.v4;
                }
                return this.f237v3;
            }
            return this.f236v2;
        }
        return this.f235v1;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f235v1;
    }

    public final float getV2() {
        return this.f236v2;
    }

    public final float getV3() {
        return this.f237v3;
    }

    public final float getV4() {
        return this.v4;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f235v1) * 31) + Float.hashCode(this.f236v2)) * 31) + Float.hashCode(this.f237v3)) * 31) + Float.hashCode(this.v4);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f235v1 = 0.0f;
        this.f236v2 = 0.0f;
        this.f237v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i5, float f5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        this.v4 = f5;
                        return;
                    }
                    return;
                }
                this.f237v3 = f5;
                return;
            }
            this.f236v2 = f5;
            return;
        }
        this.f235v1 = f5;
    }

    public final void setV1$animation_core_release(float f5) {
        this.f235v1 = f5;
    }

    public final void setV2$animation_core_release(float f5) {
        this.f236v2 = f5;
    }

    public final void setV3$animation_core_release(float f5) {
        this.f237v3 = f5;
    }

    public final void setV4$animation_core_release(float f5) {
        this.v4 = f5;
    }

    @l
    public String toString() {
        return "AnimationVector4D: v1 = " + this.f235v1 + ", v2 = " + this.f236v2 + ", v3 = " + this.f237v3 + ", v4 = " + this.v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @l
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
