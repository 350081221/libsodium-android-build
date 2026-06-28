package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/GlowEdgeEffectCompat;", "Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "Lkotlin/r2;", "onPull", "onRelease", "", "velocity", "onAbsorb", "delta", "releaseWithOppositeDelta", "oppositeReleaseDeltaThreshold", "F", "oppositeReleaseDelta", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "<init>", "(Landroid/content/Context;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nEdgeEffectCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,157:1\n1#2:158\n154#3:159\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n88#1:159\n*E\n"})
/* loaded from: classes.dex */
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    public GlowEdgeEffectCompat(@p4.l Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).mo304toPx0680j_4(Dp.m6044constructorimpl(1));
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i5) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(i5);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f5, float f6) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f5, f6);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float f5) {
        float f6 = this.oppositeReleaseDelta + f5;
        this.oppositeReleaseDelta = f6;
        if (Math.abs(f6) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f5) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f5);
    }
}
