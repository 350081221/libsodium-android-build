package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", bi.ay, "", "b", "c", "d", "(FFFF)V", "equals", "", "other", "", "evaluateCubic", "m", TTDownloadField.TT_HASHCODE, "", "transform", "fraction", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private final float f238a;

    /* renamed from: b, reason: collision with root package name */
    private final float f239b;

    /* renamed from: c, reason: collision with root package name */
    private final float f240c;

    /* renamed from: d, reason: collision with root package name */
    private final float f241d;

    public CubicBezierEasing(float f5, float f6, float f7, float f8) {
        boolean z4;
        this.f238a = f5;
        this.f239b = f6;
        this.f240c = f7;
        this.f241d = f8;
        if (!Float.isNaN(f5) && !Float.isNaN(f6) && !Float.isNaN(f7) && !Float.isNaN(f8)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f5 + ", " + f6 + ", " + f7 + ", " + f8 + external.org.apache.commons.lang3.d.f15957a).toString());
    }

    private final float evaluateCubic(float f5, float f6, float f7) {
        float f8 = 3;
        float f9 = 1 - f7;
        return (f5 * f8 * f9 * f9 * f7) + (f8 * f6 * f9 * f7 * f7) + (f7 * f7 * f7);
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        if (this.f238a == cubicBezierEasing.f238a) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.f239b == cubicBezierEasing.f239b) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.f240c == cubicBezierEasing.f240c) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.f241d == cubicBezierEasing.f241d) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f238a) * 31) + Float.hashCode(this.f239b)) * 31) + Float.hashCode(this.f240c)) * 31) + Float.hashCode(this.f241d);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f5) {
        float f6 = 0.0f;
        if (f5 > 0.0f) {
            float f7 = 1.0f;
            if (f5 < 1.0f) {
                while (true) {
                    float f8 = (f6 + f7) / 2;
                    float evaluateCubic = evaluateCubic(this.f238a, this.f240c, f8);
                    if (Math.abs(f5 - evaluateCubic) < 0.001f) {
                        return evaluateCubic(this.f239b, this.f241d, f8);
                    }
                    if (evaluateCubic < f5) {
                        f6 = f8;
                    } else {
                        f7 = f8;
                    }
                }
            }
        }
        return f5;
    }
}
