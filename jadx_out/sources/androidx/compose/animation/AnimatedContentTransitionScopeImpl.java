package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002[\\B'\b\u0000\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\bY\u0010ZJ\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0004JK\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00130\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00130\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R1\u0010@\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00038@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R,\u0010C\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030B0A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR*\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0018\u0010P\u001a\u00020M*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0018\u0010R\u001a\u00020M*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u001a\u0010\u0005\u001a\u00020\u00038BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010=R\u0014\u0010V\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^²\u0006\u0014\u0010]\u001a\u00020M\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "currentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculateOffset-emnUabE", "(JJ)J", "calculateOffset", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lv3/l;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lv3/l;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "setContentAlignment", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "", "Landroidx/compose/runtime/State;", "targetSizeMap", "Ljava/util/Map;", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "animatedSize", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "", "isLeft-gWo6LJ4", "(I)Z", "isLeft", "isRight-gWo6LJ4", "isRight", "getCurrentSize-YbymL2g", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "ChildData", "SizeModifier", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,831:1\n81#2:832\n107#2,2:833\n81#2:849\n107#2,2:850\n36#3:835\n36#3:842\n1116#4,6:836\n1116#4,6:843\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n528#1:832\n528#1:833,2\n540#1:849\n540#1:850,2\n540#1:835\n552#1:842\n540#1:836,6\n552#1:843,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 8;

    @m
    private State<IntSize> animatedSize;

    @l
    private Alignment contentAlignment;

    @l
    private LayoutDirection layoutDirection;

    @l
    private final MutableState measuredSize$delegate;

    @l
    private final Map<S, State<IntSize>> targetSizeMap;

    @l
    private final Transition<S> transition;

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "()Z", "setTarget", "component1", "copy", "equals", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ChildData implements ParentDataModifier {
        public static final int $stable = 0;
        private boolean isTarget;

        public ChildData(boolean z4) {
            this.isTarget = z4;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z4 = childData.isTarget;
            }
            return childData.copy(z4);
        }

        public final boolean component1() {
            return this.isTarget;
        }

        @l
        public final ChildData copy(boolean z4) {
            return new ChildData(z4);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChildData) && this.isTarget == ((ChildData) obj).isTarget;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTarget);
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        @l
        public Object modifyParentData(@l Density density, @m Object obj) {
            return this;
        }

        public final void setTarget(boolean z4) {
            this.isTarget = z4;
        }

        @l
        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B3\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0002\u0010\nJ&\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {

        @l
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

        @l
        private final State<SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(@l Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @l State<? extends SizeTransform> state) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
        }

        @l
        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        @l
        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        @l
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo56measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
            Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
            State<IntSize> animate = this.sizeAnimation.animate(new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(AnimatedContentTransitionScopeImpl.this, this), new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2(AnimatedContentTransitionScopeImpl.this));
            AnimatedContentTransitionScopeImpl.this.setAnimatedSize$animation_release(animate);
            return MeasureScope.layout$default(measureScope, IntSize.m6214getWidthimpl(animate.getValue().m6218unboximpl()), IntSize.m6213getHeightimpl(animate.getValue().m6218unboximpl()), null, new AnimatedContentTransitionScopeImpl$SizeModifier$measure$1(mo4998measureBRTryo0, AnimatedContentTransitionScopeImpl.this.getContentAlignment().mo3370alignKFBX0sM(IntSizeKt.IntSize(mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight()), animate.getValue().m6218unboximpl(), LayoutDirection.Ltr)), 4, null);
        }
    }

    public AnimatedContentTransitionScopeImpl(@l Transition<S> transition, @l Alignment alignment, @l LayoutDirection layoutDirection) {
        MutableState mutableStateOf$default;
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m6206boximpl(IntSize.Companion.m6219getZeroYbymL2g()), null, 2, null);
        this.measuredSize$delegate = mutableStateOf$default;
        this.targetSizeMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m50calculateOffsetemnUabE(long j5, long j6) {
        return getContentAlignment().mo3370alignKFBX0sM(j5, j6, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m51getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().m6218unboximpl() : m54getMeasuredSizeYbymL2g$animation_release();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m52isLeftgWo6LJ4(int i5) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (!AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m44getLeftDKzdypw()) && ((!AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m46getStartDKzdypw()) || this.layoutDirection != LayoutDirection.Ltr) && (!AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m43getEndDKzdypw()) || this.layoutDirection != LayoutDirection.Rtl))) {
            return false;
        }
        return true;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m53isRightgWo6LJ4(int i5) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (!AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m45getRightDKzdypw()) && ((!AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m46getStartDKzdypw()) || this.layoutDirection != LayoutDirection.Rtl) && (!AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m43getEndDKzdypw()) || this.layoutDirection != LayoutDirection.Ltr))) {
            return false;
        }
        return true;
    }

    @l
    @Composable
    public final Modifier createSizeAnimationModifier$animation_release(@l ContentTransform contentTransform, @m Composer composer, int i5) {
        Modifier modifier;
        composer.startReplaceableGroup(93755870);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i5, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:538)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        boolean z4 = false;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (l0.g(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(createDeferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                if (sizeTransform != null && !sizeTransform.getClip()) {
                    z4 = true;
                }
                Modifier modifier2 = Modifier.Companion;
                if (!z4) {
                    modifier2 = ClipKt.clipToBounds(modifier2);
                }
                rememberedValue2 = modifier2.then(new SizeModifier(createDeferredAnimation, rememberUpdatedState));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) rememberedValue2;
        } else {
            this.animatedSize = null;
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    @m
    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @l
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @l
    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m54getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m6218unboximpl();
    }

    @l
    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @l
    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    public final void setAnimatedSize$animation_release(@m State<IntSize> state) {
        this.animatedSize = state;
    }

    public void setContentAlignment(@l Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(@l LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m55setMeasuredSizeozmzZPI$animation_release(long j5) {
        this.measuredSize$delegate.setValue(IntSize.m6206boximpl(j5));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @l
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo33slideIntoContainermOhB8PU(int i5, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super Integer, Integer> lVar) {
        if (m52isLeftgWo6LJ4(i5)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$1(lVar, this));
        }
        if (m53isRightgWo6LJ4(i5)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$2(lVar, this));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m47getUpDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$3(lVar, this));
        }
        if (AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m42getDownDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$4(lVar, this));
        }
        return EnterTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @l
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo34slideOutOfContainermOhB8PU(int i5, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @l v3.l<? super Integer, Integer> lVar) {
        if (m52isLeftgWo6LJ4(i5)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(this, lVar));
        }
        if (m53isRightgWo6LJ4(i5)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(this, lVar));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m47getUpDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(this, lVar));
        }
        if (AnimatedContentTransitionScope.SlideDirection.m38equalsimpl0(i5, companion.m42getDownDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(this, lVar));
        }
        return ExitTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @l
    public ContentTransform using(@l ContentTransform contentTransform, @m SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
