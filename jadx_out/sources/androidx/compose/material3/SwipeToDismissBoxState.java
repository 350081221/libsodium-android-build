package androidx.compose.material3;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.color.utilities.Contrast;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.r2;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.BP\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060&\u0012!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00020&¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0011\u0010$\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001e¨\u0006/"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxState;", "", "", "requireOffset", "Landroidx/compose/material3/DismissDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "isDismissed", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "targetValue", "Lkotlin/r2;", "snapTo", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Lkotlin/coroutines/d;)Ljava/lang/Object;", "reset", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/material3/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material3/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/AnchoredDraggableState;", "getOffset$material3_release", "()F", TypedValues.CycleType.S_WAVE_OFFSET, "getCurrentValue", "()Landroidx/compose/material3/SwipeToDismissBoxValue;", "currentValue", "getTargetValue", "getProgress", "progress", "getDismissDirection", "dismissDirection", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "Lkotlin/v0;", "name", "totalDistance", "positionalThreshold", "<init>", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Landroidx/compose/ui/unit/Density;Lv3/l;Lv3/l;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SwipeToDismissBoxState {
    public static final int $stable = 0;

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private final AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState;

    @p4.l
    private final Density density;

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "invoke", "(Landroidx/compose/material3/SwipeToDismissBoxValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.SwipeToDismissBoxState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<SwipeToDismissBoxValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l SwipeToDismissBoxValue swipeToDismissBoxValue) {
            return Boolean.TRUE;
        }
    }

    @kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxState$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "", "confirmValueChange", "", "Lkotlin/v0;", "name", "totalDistance", "positionalThreshold", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeToDismissBoxState;", "Saver", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver(@p4.l v3.l<? super SwipeToDismissBoxValue, Boolean> lVar, @p4.l v3.l<? super Float, Float> lVar2, @p4.l Density density) {
            return SaverKt.Saver(SwipeToDismissBoxState$Companion$Saver$1.INSTANCE, new SwipeToDismissBoxState$Companion$Saver$2(density, lVar, lVar2));
        }
    }

    public SwipeToDismissBoxState(@p4.l SwipeToDismissBoxValue swipeToDismissBoxValue, @p4.l Density density, @p4.l v3.l<? super SwipeToDismissBoxValue, Boolean> lVar, @p4.l v3.l<? super Float, Float> lVar2) {
        this.density = density;
        this.anchoredDraggableState = new AnchoredDraggableState<>(swipeToDismissBoxValue, lVar2, new SwipeToDismissBoxState$anchoredDraggableState$1(this), AnchoredDraggableDefaults.INSTANCE.getAnimationSpec(), lVar);
    }

    @p4.m
    public final Object dismiss(@p4.l SwipeToDismissBoxValue swipeToDismissBoxValue, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, swipeToDismissBoxValue, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    @p4.l
    public final AnchoredDraggableState<SwipeToDismissBoxValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    @p4.l
    public final SwipeToDismissBoxValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @p4.l
    public final Density getDensity$material3_release() {
        return this.density;
    }

    @p4.l
    public final SwipeToDismissBoxValue getDismissDirection() {
        boolean z4;
        if (getOffset$material3_release() == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && !Float.isNaN(getOffset$material3_release())) {
            if (getOffset$material3_release() > 0.0f) {
                return SwipeToDismissBoxValue.StartToEnd;
            }
            return SwipeToDismissBoxValue.EndToStart;
        }
        return SwipeToDismissBoxValue.Settled;
    }

    public final float getOffset$material3_release() {
        return this.anchoredDraggableState.getOffset();
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    @p4.l
    public final SwipeToDismissBoxValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "DismissDirection is no longer used by SwipeToDismissBoxState. Please compare currentValue against SwipeToDismissValue instead.")
    public final /* synthetic */ boolean isDismissed(DismissDirection dismissDirection) {
        SwipeToDismissBoxValue swipeToDismissBoxValue;
        SwipeToDismissBoxValue currentValue = getCurrentValue();
        if (dismissDirection == DismissDirection.StartToEnd) {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.StartToEnd;
        } else {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.EndToStart;
        }
        if (currentValue == swipeToDismissBoxValue) {
            return true;
        }
        return false;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    @p4.m
    public final Object reset(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SwipeToDismissBoxValue.Settled, 0.0f, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo$default == l5) {
            return animateTo$default;
        }
        return r2.f19517a;
    }

    @p4.m
    public final Object snapTo(@p4.l SwipeToDismissBoxValue swipeToDismissBoxValue, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object snapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, swipeToDismissBoxValue, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return snapTo == l5 ? snapTo : r2.f19517a;
    }

    public /* synthetic */ SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, v3.l lVar, v3.l lVar2, int i5, kotlin.jvm.internal.w wVar) {
        this(swipeToDismissBoxValue, density, (i5 & 4) != 0 ? AnonymousClass1.INSTANCE : lVar, lVar2);
    }
}
