package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;

@Stable
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u000f\u0012\u0006\u0010@\u001a\u00020\u0010¢\u0006\u0004\bA\u0010\u001eJA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010\"\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R$\u0010:\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u00108F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR\u0011\u0010>\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00102¨\u0006C"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "", t0.b.f22420d, "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollTo", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "scrollTo", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableIntState;", "getValue", "()I", "setValue", "(I)V", "viewportSize$delegate", "getViewportSize", "setViewportSize$foundation_release", "viewportSize", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/runtime/MutableIntState;", "_maxValueState", "accumulator", "F", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "canScrollForward$delegate", "Landroidx/compose/runtime/State;", "getCanScrollForward", "()Z", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "canScrollBackward", "newMax", "getMaxValue", "setMaxValue$foundation_release", "maxValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "isScrollInProgress", "initial", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,459:1\n75#2:460\n108#2,2:461\n75#2:473\n108#2,2:474\n495#3,4:463\n500#3:472\n129#4,5:467\n81#5:476\n81#5:477\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n99#1:460\n99#1:461,2\n120#1:473\n120#1:474,2\n109#1:463,4\n109#1:472\n109#1:467,5\n164#1:476\n166#1:477\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(ScrollState$Companion$Saver$1.INSTANCE, ScrollState$Companion$Saver$2.INSTANCE);
    private float accumulator;

    @p4.l
    private final MutableIntState value$delegate;

    @p4.l
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);

    @p4.l
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();

    @p4.l
    private MutableIntState _maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    @p4.l
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new ScrollState$scrollableState$1(this));

    @p4.l
    private final State canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new ScrollState$canScrollForward$2(this));

    @p4.l
    private final State canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new ScrollState$canScrollBackward$2(this));

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/ScrollState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @p4.l
        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }
    }

    public ScrollState(int i5) {
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i5, AnimationSpec animationSpec, kotlin.coroutines.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i5, animationSpec, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i5) {
        this.value$delegate.setIntValue(i5);
    }

    @p4.m
    public final Object animateScrollTo(int i5, @p4.l AnimationSpec<Float> animationSpec, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i5 - getValue(), animationSpec, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateScrollBy == l5 ? animateScrollBy : r2.f19517a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f5) {
        return this.scrollableState.dispatchRawDelta(f5);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @p4.l
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @p4.l
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @p4.m
    public Object scroll(@p4.l MutatePriority mutatePriority, @p4.l v3.p<? super ScrollScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object scroll = this.scrollableState.scroll(mutatePriority, pVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll == l5 ? scroll : r2.f19517a;
    }

    @p4.m
    public final Object scrollTo(int i5, @p4.l kotlin.coroutines.d<? super Float> dVar) {
        return ScrollExtensionsKt.scrollBy(this, i5 - getValue(), dVar);
    }

    public final void setMaxValue$foundation_release(int i5) {
        this._maxValueState.setIntValue(i5);
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                if (getValue() > i5) {
                    setValue(i5);
                }
                r2 r2Var = r2.f19517a;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    public final void setViewportSize$foundation_release(int i5) {
        this.viewportSize$delegate.setIntValue(i5);
    }
}
