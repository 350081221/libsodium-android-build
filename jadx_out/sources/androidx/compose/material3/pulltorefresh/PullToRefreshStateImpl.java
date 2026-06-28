package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u00106\u001a\u00020'\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020'07¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\rJ\u0006\u0010\u0010\u001a\u00020\nR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010!R+\u0010&\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010!R+\u0010.\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0014R\u0014\u00102\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0014R\u0014\u00104\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0014R\u0014\u00105\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "Lkotlin/r2;", "startRefresh", "endRefresh", "Landroidx/compose/ui/geometry/Offset;", "available", "consumeAvailableOffset-MK-Hz9U", "(J)J", "consumeAvailableOffset", "", "velocity", "onRelease", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", TypedValues.CycleType.S_WAVE_OFFSET, "animateTo", "calculateVerticalOffset", "positionalThreshold", "F", "getPositionalThreshold", "()F", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setNestedScrollConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "<set-?>", "distancePulled$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getDistancePulled$material3_release", "setDistancePulled$material3_release", "(F)V", "distancePulled", "_verticalOffset$delegate", "get_verticalOffset", "set_verticalOffset", "_verticalOffset", "", "_refreshing$delegate", "Landroidx/compose/runtime/MutableState;", "get_refreshing", "()Z", "set_refreshing", "(Z)V", "_refreshing", "getAdjustedDistancePulled", "adjustedDistancePulled", "getProgress", "progress", "getVerticalOffset", "verticalOffset", "isRefreshing", "initialRefreshing", "Lkotlin/Function0;", "enabled", "<init>", "(ZFLv3/a;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,558:1\n76#2:559\n109#2,2:560\n76#2:562\n109#2,2:563\n81#3:565\n107#3,2:566\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl\n*L\n417#1:559\n417#1:560,2\n419#1:562\n419#1:563,2\n420#1:565\n420#1:566,2\n*E\n"})
/* loaded from: classes.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final MutableState _refreshing$delegate;

    @l
    private NestedScrollConnection nestedScrollConnection;
    private final float positionalThreshold;

    @l
    private final MutableFloatState distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    @l
    private final MutableFloatState _verticalOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "positionalThreshold", "", "enabled", "Lkotlin/Function0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<PullToRefreshState, Boolean> Saver(float f5, @l a<Boolean> aVar) {
            return SaverKt.Saver(PullToRefreshStateImpl$Companion$Saver$1.INSTANCE, new PullToRefreshStateImpl$Companion$Saver$2(f5, aVar));
        }
    }

    public PullToRefreshStateImpl(boolean z4, float f5, @l a<Boolean> aVar) {
        MutableState mutableStateOf$default;
        this.positionalThreshold = f5;
        this.nestedScrollConnection = new PullToRefreshStateImpl$nestedScrollConnection$1(aVar, this);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
        this._refreshing$delegate = mutableStateOf$default;
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled$material3_release() * 0.5f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing$delegate.getValue()).booleanValue();
    }

    private final float get_verticalOffset() {
        return this._verticalOffset$delegate.getFloatValue();
    }

    private final void set_refreshing(boolean z4) {
        this._refreshing$delegate.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_verticalOffset(float f5) {
        this._verticalOffset$delegate.setFloatValue(f5);
    }

    @m
    public final Object animateTo(float f5, @l d<? super r2> dVar) {
        Object l5;
        Object animate$default = SuspendAnimationKt.animate$default(get_verticalOffset(), f5, 0.0f, null, new PullToRefreshStateImpl$animateTo$2(this), dVar, 12, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animate$default == l5 ? animate$default : r2.f19517a;
    }

    public final float calculateVerticalOffset() {
        float H;
        if (getAdjustedDistancePulled() <= getPositionalThreshold()) {
            return getAdjustedDistancePulled();
        }
        H = u.H(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getPositionalThreshold() + (getPositionalThreshold() * (H - (((float) Math.pow(H, 2)) / 4)));
    }

    /* renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    public final long m2627consumeAvailableOffsetMKHz9U(long j5) {
        float t5;
        float distancePulled$material3_release;
        if (isRefreshing()) {
            distancePulled$material3_release = 0.0f;
        } else {
            t5 = u.t(getDistancePulled$material3_release() + Offset.m3494getYimpl(j5), 0.0f);
            distancePulled$material3_release = t5 - getDistancePulled$material3_release();
            setDistancePulled$material3_release(t5);
            set_verticalOffset(calculateVerticalOffset());
        }
        return OffsetKt.Offset(0.0f, distancePulled$material3_release);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public void endRefresh() {
        set_verticalOffset(0.0f);
        set_refreshing(false);
    }

    public final float getDistancePulled$material3_release() {
        return this.distancePulled$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    @l
    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getPositionalThreshold() {
        return this.positionalThreshold;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getProgress() {
        return getAdjustedDistancePulled() / getPositionalThreshold();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getVerticalOffset() {
        return get_verticalOffset();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public boolean isRefreshing() {
        return get_refreshing();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRelease(float r6, @p4.l kotlin.coroutines.d<? super java.lang.Float> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$onRelease$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$onRelease$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$onRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$onRelease$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$onRelease$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            float r6 = r0.F$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl) r0
            kotlin.e1.n(r7)
            goto L64
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.e1.n(r7)
            boolean r7 = r5.isRefreshing()
            if (r7 == 0) goto L46
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.b.e(r4)
            return r6
        L46:
            float r7 = r5.getAdjustedDistancePulled()
            float r2 = r5.getPositionalThreshold()
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L57
            r5.startRefresh()
        L55:
            r0 = r5
            goto L64
        L57:
            r0.L$0 = r5
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.animateTo(r4, r0)
            if (r7 != r1) goto L55
            return r1
        L64:
            float r7 = r0.getDistancePulled$material3_release()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L6d
            goto L6e
        L6d:
            r3 = 0
        L6e:
            if (r3 == 0) goto L72
        L70:
            r6 = r4
            goto L77
        L72:
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 >= 0) goto L77
            goto L70
        L77:
            r0.setDistancePulled$material3_release(r4)
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.b.e(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl.onRelease(float, kotlin.coroutines.d):java.lang.Object");
    }

    public final void setDistancePulled$material3_release(float f5) {
        this.distancePulled$delegate.setFloatValue(f5);
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public void setNestedScrollConnection(@l NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollConnection = nestedScrollConnection;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public void startRefresh() {
        set_refreshing(true);
        set_verticalOffset(getPositionalThreshold());
    }
}
