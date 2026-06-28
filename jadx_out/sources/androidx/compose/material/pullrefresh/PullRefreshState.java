package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001f0\u001e\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\bG\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010$R+\u0010,\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0012R+\u00101\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010$\"\u0004\b0\u0010\u0016R+\u00105\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u0010$\"\u0004\b4\u0010\u0016R+\u00109\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u0010$\"\u0004\b8\u0010\u0016R+\u0010=\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010.\u001a\u0004\b;\u0010$\"\u0004\b<\u0010\u0016R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010*R\u0014\u0010E\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010$R\u0014\u0010\u0014\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010$¨\u0006I"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlinx/coroutines/l2;", "animateIndicatorTo", "calculateIndicatorPosition", "pullDelta", "onPull$material_release", "(F)F", "onPull", "velocity", "onRelease$material_release", "onRelease", "", "refreshing", "Lkotlin/r2;", "setRefreshing$material_release", "(Z)V", "setRefreshing", "threshold", "setThreshold$material_release", "(F)V", "setThreshold", "refreshingOffset", "setRefreshingOffset$material_release", "setRefreshingOffset", "Lkotlinx/coroutines/s0;", "animationScope", "Lkotlinx/coroutines/s0;", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "onRefreshState", "Landroidx/compose/runtime/State;", "adjustedDistancePulled$delegate", "getAdjustedDistancePulled", "()F", "adjustedDistancePulled", "<set-?>", "_refreshing$delegate", "Landroidx/compose/runtime/MutableState;", "get_refreshing", "()Z", "set_refreshing", "_refreshing", "_position$delegate", "Landroidx/compose/runtime/MutableFloatState;", "get_position", "set_position", "_position", "distancePulled$delegate", "getDistancePulled", "setDistancePulled", "distancePulled", "_threshold$delegate", "get_threshold", "set_threshold", "_threshold", "_refreshingOffset$delegate", "get_refreshingOffset", "set_refreshingOffset", "_refreshingOffset", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "getProgress", "progress", "getRefreshing$material_release", "getPosition$material_release", "position", "getThreshold$material_release", "<init>", "(Lkotlinx/coroutines/s0;Landroidx/compose/runtime/State;FF)V", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
@r1({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,234:1\n81#2:235\n81#2:236\n107#2,2:237\n76#3:239\n109#3,2:240\n76#3:242\n109#3,2:243\n76#3:245\n109#3,2:246\n76#3:248\n109#3,2:249\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n122#1:235\n124#1:236\n124#1:237,2\n125#1:239\n125#1:240,2\n126#1:242\n126#1:243,2\n127#1:245\n127#1:246,2\n128#1:248\n128#1:249,2\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshState {
    public static final int $stable = 8;

    @l
    private final MutableFloatState _position$delegate;

    @l
    private final MutableState _refreshing$delegate;

    @l
    private final MutableFloatState _refreshingOffset$delegate;

    @l
    private final MutableFloatState _threshold$delegate;

    @l
    private final State adjustedDistancePulled$delegate = SnapshotStateKt.derivedStateOf(new PullRefreshState$adjustedDistancePulled$2(this));

    @l
    private final s0 animationScope;

    @l
    private final MutableFloatState distancePulled$delegate;

    @l
    private final MutatorMutex mutatorMutex;

    @l
    private final State<a<r2>> onRefreshState;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(@l s0 s0Var, @l State<? extends a<r2>> state, float f5, float f6) {
        MutableState mutableStateOf$default;
        this.animationScope = s0Var;
        this.onRefreshState = state;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this._refreshing$delegate = mutableStateOf$default;
        this._position$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this._threshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f6);
        this._refreshingOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
        this.mutatorMutex = new MutatorMutex();
    }

    private final l2 animateIndicatorTo(float f5) {
        l2 f6;
        f6 = k.f(this.animationScope, null, null, new PullRefreshState$animateIndicatorTo$1(this, f5, null), 3, null);
        return f6;
    }

    private final float calculateIndicatorPosition() {
        float H;
        if (getAdjustedDistancePulled() <= getThreshold$material_release()) {
            return getAdjustedDistancePulled();
        }
        H = u.H(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThreshold$material_release() + (getThreshold$material_release() * (H - (((float) Math.pow(H, 2)) / 4)));
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float get_position() {
        return this._position$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing$delegate.getValue()).booleanValue();
    }

    private final float get_refreshingOffset() {
        return this._refreshingOffset$delegate.getFloatValue();
    }

    private final float get_threshold() {
        return this._threshold$delegate.getFloatValue();
    }

    private final void setDistancePulled(float f5) {
        this.distancePulled$delegate.setFloatValue(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f5) {
        this._position$delegate.setFloatValue(f5);
    }

    private final void set_refreshing(boolean z4) {
        this._refreshing$delegate.setValue(Boolean.valueOf(z4));
    }

    private final void set_refreshingOffset(float f5) {
        this._refreshingOffset$delegate.setFloatValue(f5);
    }

    private final void set_threshold(float f5) {
        this._threshold$delegate.setFloatValue(f5);
    }

    public final float getPosition$material_release() {
        return get_position();
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return get_refreshing();
    }

    public final float getThreshold$material_release() {
        return get_threshold();
    }

    public final float onPull$material_release(float f5) {
        float t5;
        if (get_refreshing()) {
            return 0.0f;
        }
        t5 = u.t(getDistancePulled() + f5, 0.0f);
        float distancePulled = t5 - getDistancePulled();
        setDistancePulled(t5);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material_release(float f5) {
        boolean z4;
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material_release()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if (getDistancePulled() == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || f5 < 0.0f) {
            f5 = 0.0f;
        }
        setDistancePulled(0.0f);
        return f5;
    }

    public final void setRefreshing$material_release(boolean z4) {
        if (get_refreshing() != z4) {
            set_refreshing(z4);
            float f5 = 0.0f;
            setDistancePulled(0.0f);
            if (z4) {
                f5 = get_refreshingOffset();
            }
            animateIndicatorTo(f5);
        }
    }

    public final void setRefreshingOffset$material_release(float f5) {
        boolean z4;
        if (get_refreshingOffset() == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            set_refreshingOffset(f5);
            if (getRefreshing$material_release()) {
                animateIndicatorTo(f5);
            }
        }
    }

    public final void setThreshold$material_release(float f5) {
        set_threshold(f5);
    }
}
