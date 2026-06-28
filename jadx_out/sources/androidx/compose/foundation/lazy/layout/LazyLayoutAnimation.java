package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bF\u0010GJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R+\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R(\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0007R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020/0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R1\u00104\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\b2\u0010)\"\u0004\b3\u0010\u0007R+\u0010;\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00118F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010?\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00020<¢\u0006\u0002\b>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR(\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bC\u0010'\u001a\u0004\bD\u0010)\"\u0004\bE\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "", "Lkotlin/r2;", "cancelPlacementAnimation", "Landroidx/compose/ui/unit/IntOffset;", "delta", "animatePlacementDelta--gyyYBs", "(J)V", "animatePlacementDelta", "animateAppearance", "stopAnimations", "Lkotlinx/coroutines/s0;", "coroutineScope", "Lkotlinx/coroutines/s0;", "getCoroutineScope", "()Lkotlinx/coroutines/s0;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "appearanceSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAppearanceSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAppearanceSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "placementSpec", "getPlacementSpec", "setPlacementSpec", "", "<set-?>", "isPlacementAnimationInProgress$delegate", "Landroidx/compose/runtime/MutableState;", "isPlacementAnimationInProgress", "()Z", "setPlacementAnimationInProgress", "(Z)V", "isAppearanceAnimationInProgress$delegate", "isAppearanceAnimationInProgress", "setAppearanceAnimationInProgress", "rawOffset", "J", "getRawOffset-nOcc-ac", "()J", "setRawOffset--gyyYBs", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "placementDeltaAnimation", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "visibilityAnimation", "placementDelta$delegate", "getPlacementDelta-nOcc-ac", "setPlacementDelta--gyyYBs", "placementDelta", "visibility$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getVisibility", "()F", "setVisibility", "(F)V", "visibility", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "Lv3/l;", "getLayerBlock", "()Lv3/l;", "lookaheadOffset", "getLookaheadOffset-nOcc-ac", "setLookaheadOffset--gyyYBs", "<init>", "(Lkotlinx/coroutines/s0;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n81#2:208\n107#2,2:209\n81#2:211\n107#2,2:212\n81#2:214\n107#2,2:215\n76#3:217\n109#3,2:218\n79#4:220\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation\n*L\n50#1:208\n50#1:209,2\n56#1:211\n56#1:212,2\n76#1:214\n76#1:215,2\n79#1:217\n79#1:218,2\n110#1:220\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutAnimation {

    @m
    private FiniteAnimationSpec<Float> appearanceSpec;

    @l
    private final s0 coroutineScope;

    @l
    private final MutableState isAppearanceAnimationInProgress$delegate;

    @l
    private final MutableState isPlacementAnimationInProgress$delegate;

    @l
    private final v3.l<GraphicsLayerScope, r2> layerBlock;
    private long lookaheadOffset;

    @l
    private final MutableState placementDelta$delegate;

    @l
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;

    @m
    private FiniteAnimationSpec<IntOffset> placementSpec;
    private long rawOffset;

    @l
    private final MutableFloatState visibility$delegate;

    @l
    private final Animatable<Float, AnimationVector1D> visibilityAnimation;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final long NotInitialized = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$Companion;", "", "()V", "NotInitialized", "Landroidx/compose/ui/unit/IntOffset;", "getNotInitialized-nOcc-ac", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m707getNotInitializednOccac() {
            return LazyLayoutAnimation.NotInitialized;
        }
    }

    public LazyLayoutAnimation(@l s0 s0Var) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        this.coroutineScope = s0Var;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isPlacementAnimationInProgress$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isAppearanceAnimationInProgress$delegate = mutableStateOf$default2;
        long j5 = NotInitialized;
        this.rawOffset = j5;
        IntOffset.Companion companion = IntOffset.Companion;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m6163boximpl(companion.m6182getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, null, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.getVectorConverter(a0.f19382a), null, null, 12, null);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m6163boximpl(companion.m6182getZeronOccac()), null, 2, null);
        this.placementDelta$delegate = mutableStateOf$default3;
        this.visibility$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
        this.layerBlock = new LazyLayoutAnimation$layerBlock$1(this);
        this.lookaheadOffset = j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearanceAnimationInProgress(boolean z4) {
        this.isAppearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlacementAnimationInProgress(boolean z4) {
        this.isPlacementAnimationInProgress$delegate.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m700setPlacementDeltagyyYBs(long j5) {
        this.placementDelta$delegate.setValue(IntOffset.m6163boximpl(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisibility(float f5) {
        this.visibility$delegate.setFloatValue(f5);
    }

    public final void animateAppearance() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.appearanceSpec;
        if (!isAppearanceAnimationInProgress() && finiteAnimationSpec != null) {
            setAppearanceAnimationInProgress(true);
            setVisibility(0.0f);
            i.e(this.coroutineScope, null, null, new LazyLayoutAnimation$animateAppearance$1(this, finiteAnimationSpec, null), 3, null);
        }
    }

    /* renamed from: animatePlacementDelta--gyyYBs, reason: not valid java name */
    public final void m701animatePlacementDeltagyyYBs(long j5) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long m703getPlacementDeltanOccac = m703getPlacementDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m703getPlacementDeltanOccac) - IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(m703getPlacementDeltanOccac) - IntOffset.m6173getYimpl(j5));
        m700setPlacementDeltagyyYBs(IntOffset);
        setPlacementAnimationInProgress(true);
        i.e(this.coroutineScope, null, null, new LazyLayoutAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, IntOffset, null), 3, null);
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            i.e(this.coroutineScope, null, null, new LazyLayoutAnimation$cancelPlacementAnimation$1(this, null), 3, null);
        }
    }

    @m
    public final FiniteAnimationSpec<Float> getAppearanceSpec() {
        return this.appearanceSpec;
    }

    @l
    public final s0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @l
    public final v3.l<GraphicsLayerScope, r2> getLayerBlock() {
        return this.layerBlock;
    }

    /* renamed from: getLookaheadOffset-nOcc-ac, reason: not valid java name */
    public final long m702getLookaheadOffsetnOccac() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m703getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta$delegate.getValue()).m6181unboximpl();
    }

    @m
    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name */
    public final long m704getRawOffsetnOccac() {
        return this.rawOffset;
    }

    public final float getVisibility() {
        return this.visibility$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean) this.isAppearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean) this.isPlacementAnimationInProgress$delegate.getValue()).booleanValue();
    }

    public final void setAppearanceSpec(@m FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.appearanceSpec = finiteAnimationSpec;
    }

    /* renamed from: setLookaheadOffset--gyyYBs, reason: not valid java name */
    public final void m705setLookaheadOffsetgyyYBs(long j5) {
        this.lookaheadOffset = j5;
    }

    public final void setPlacementSpec(@m FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m706setRawOffsetgyyYBs(long j5) {
        this.rawOffset = j5;
    }

    public final void stopAnimations() {
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            i.e(this.coroutineScope, null, null, new LazyLayoutAnimation$stopAnimations$1(this, null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            i.e(this.coroutineScope, null, null, new LazyLayoutAnimation$stopAnimations$2(this, null), 3, null);
        }
        m700setPlacementDeltagyyYBs(IntOffset.Companion.m6182getZeronOccac());
        this.rawOffset = NotInitialized;
        setVisibility(1.0f);
    }
}
