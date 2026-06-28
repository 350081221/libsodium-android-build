package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010[\u001a\u00028\u0000\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b\\\u0010]B1\b\u0017\u0012\u0006\u0010[\u001a\u00028\u0000\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\\\u0010^J_\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u00002%\u0010\u000b\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\tH\u0002J%\u0010\u0015\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016Jg\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010\u0017\u001a\u00028\u00002\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\b\b\u0002\u0010\u0007\u001a\u00028\u00002'\b\u0002\u0010\u000b\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\nH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ[\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2'\b\u0002\u0010\u000b\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\nH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b!\u0010\"J\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#R#\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R+\u0010:\u001a\u0002062\u0006\u00107\u001a\u0002068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010\u0017\u001a\u00028\u00002\u0006\u00107\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\u00107\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\bC\u0010@R(\u0010\u0014\u001a\u0004\u0018\u00018\u00002\b\u00107\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\bD\u0010@R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010M\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bM\u0010N\u0012\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bQ\u0010N\u0012\u0004\bR\u0010PR\u0016\u0010S\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010NR\u0016\u0010T\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010NR\u0011\u0010\u000f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bU\u0010@R\u0011\u0010X\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010Z\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bY\u0010@¨\u0006_"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/Animation;", "animation", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/r2;", "Lkotlin/u;", "block", "Landroidx/compose/animation/core/AnimationResult;", "runAnimation", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", t0.b.f22420d, "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "lowerBound", "upperBound", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThreshold", "Ljava/lang/Object;", "", TTDownloadField.TT_LABEL, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "targetValue$delegate", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "getLowerBound", "getUpperBound", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "negativeInfinityBounds", "Landroidx/compose/animation/core/AnimationVector;", "getNegativeInfinityBounds$annotations", "()V", "positiveInfinityBounds", "getPositiveInfinityBounds$annotations", "lowerBoundVector", "upperBoundVector", "getValue", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n81#2:508\n107#2,2:509\n81#2:511\n107#2,2:512\n1#3:514\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n98#1:508\n98#1:509,2\n105#1:511\n105#1:512,2\n*E\n"})
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;

    @l
    private final SpringSpec<T> defaultSpringSpec;

    @l
    private final AnimationState<T, V> internalState;

    @l
    private final MutableState isRunning$delegate;

    @l
    private final String label;

    @m
    private T lowerBound;

    @l
    private V lowerBoundVector;

    @l
    private final MutatorMutex mutatorMutex;

    @l
    private final V negativeInfinityBounds;

    @l
    private final V positiveInfinityBounds;

    @l
    private final MutableState targetValue$delegate;

    @l
    private final TwoWayConverter<T, V> typeConverter;

    @m
    private T upperBound;

    @l
    private V upperBoundVector;

    @m
    private final T visibilityThreshold;

    public Animatable(T t5, @l TwoWayConverter<T, V> twoWayConverter, @m T t6, @l String str) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        V access$getNegativeInfinityBounds3D$p;
        V access$getPositiveInfinityBounds3D$p;
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t6;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t5, null, 0L, 0L, false, 60, null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t5, null, 2, null);
        this.targetValue$delegate = mutableStateOf$default2;
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t6, 3, null);
        V velocityVector = getVelocityVector();
        if (velocityVector instanceof AnimationVector1D) {
            access$getNegativeInfinityBounds3D$p = AnimatableKt.access$getNegativeInfinityBounds1D$p();
        } else if (velocityVector instanceof AnimationVector2D) {
            access$getNegativeInfinityBounds3D$p = AnimatableKt.access$getNegativeInfinityBounds2D$p();
        } else {
            access$getNegativeInfinityBounds3D$p = velocityVector instanceof AnimationVector3D ? AnimatableKt.access$getNegativeInfinityBounds3D$p() : AnimatableKt.access$getNegativeInfinityBounds4D$p();
        }
        l0.n(access$getNegativeInfinityBounds3D$p, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = access$getNegativeInfinityBounds3D$p;
        V velocityVector2 = getVelocityVector();
        if (velocityVector2 instanceof AnimationVector1D) {
            access$getPositiveInfinityBounds3D$p = AnimatableKt.access$getPositiveInfinityBounds1D$p();
        } else if (velocityVector2 instanceof AnimationVector2D) {
            access$getPositiveInfinityBounds3D$p = AnimatableKt.access$getPositiveInfinityBounds2D$p();
        } else {
            access$getPositiveInfinityBounds3D$p = velocityVector2 instanceof AnimationVector3D ? AnimatableKt.access$getPositiveInfinityBounds3D$p() : AnimatableKt.access$getPositiveInfinityBounds4D$p();
        }
        l0.n(access$getPositiveInfinityBounds3D$p, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = access$getPositiveInfinityBounds3D$p;
        this.lowerBoundVector = access$getNegativeInfinityBounds3D$p;
        this.upperBoundVector = access$getPositiveInfinityBounds3D$p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, v3.l lVar, kotlin.coroutines.d dVar, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, lVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, v3.l lVar, kotlin.coroutines.d dVar, int i5, Object obj3) {
        if ((i5 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T t5 = obj2;
        if ((i5 & 4) != 0) {
            t5 = animatable.getVelocity();
        }
        T t6 = t5;
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        return animatable.animateTo(obj, animationSpec2, t6, lVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t5) {
        float H;
        if (l0.g(this.lowerBoundVector, this.negativeInfinityBounds) && l0.g(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t5;
        }
        V invoke = this.typeConverter.getConvertToVector().invoke(t5);
        int size$animation_core_release = invoke.getSize$animation_core_release();
        boolean z4 = false;
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            if (invoke.get$animation_core_release(i5) < this.lowerBoundVector.get$animation_core_release(i5) || invoke.get$animation_core_release(i5) > this.upperBoundVector.get$animation_core_release(i5)) {
                H = u.H(invoke.get$animation_core_release(i5), this.lowerBoundVector.get$animation_core_release(i5), this.upperBoundVector.get$animation_core_release(i5));
                invoke.set$animation_core_release(i5, H);
                z4 = true;
            }
        }
        if (z4) {
            return this.typeConverter.getConvertFromVector().invoke(invoke);
        }
        return t5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t5, v3.l<? super Animatable<T, V>, r2> lVar, kotlin.coroutines.d<? super AnimationResult<T, V>> dVar) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$runAnimation$2(this, t5, animation, this.internalState.getLastFrameTimeNanos(), lVar, null), dVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z4) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t5) {
        this.targetValue$delegate.setValue(t5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i5, Object obj3) {
        if ((i5 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i5 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    @m
    public final Object animateDecay(T t5, @l DecayAnimationSpec<T> decayAnimationSpec, @m v3.l<? super Animatable<T, V>, r2> lVar, @l kotlin.coroutines.d<? super AnimationResult<T, V>> dVar) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t5)), t5, lVar, dVar);
    }

    @m
    public final Object animateTo(T t5, @l AnimationSpec<T> animationSpec, T t6, @m v3.l<? super Animatable<T, V>, r2> lVar, @l kotlin.coroutines.d<? super AnimationResult<T, V>> dVar) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t5, t6), t6, lVar, dVar);
    }

    @l
    public final State<T> asState() {
        return this.internalState;
    }

    @l
    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    @l
    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    @l
    public final String getLabel() {
        return this.label;
    }

    @m
    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    @l
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @m
    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    @l
    public final V getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    @m
    public final Object snapTo(T t5, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2(this, t5, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (mutate$default == l5) {
            return mutate$default;
        }
        return r2.f19517a;
    }

    @m
    public final Object stop(@l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(this, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (mutate$default == l5) {
            return mutate$default;
        }
        return r2.f19517a;
    }

    public final void updateBounds(@m T t5, @m T t6) {
        V v4;
        V v5;
        boolean z4;
        if (t5 == null || (v4 = this.typeConverter.getConvertToVector().invoke(t5)) == null) {
            v4 = this.negativeInfinityBounds;
        }
        if (t6 == null || (v5 = this.typeConverter.getConvertToVector().invoke(t6)) == null) {
            v5 = this.positiveInfinityBounds;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            if (v4.get$animation_core_release(i5) <= v5.get$animation_core_release(i5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v4 + " is greater than upper bound " + v5 + " on index " + i5).toString());
            }
        }
        this.lowerBoundVector = v4;
        this.upperBoundVector = v5;
        this.upperBound = t6;
        this.lowerBound = t5;
        if (!isRunning()) {
            T clampToBounds = clampToBounds(getValue());
            if (!l0.g(clampToBounds, getValue())) {
                this.internalState.setValue$animation_core_release(clampToBounds);
            }
        }
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i5, w wVar) {
        this(obj, twoWayConverter, (i5 & 4) != 0 ? null : obj2, (i5 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i5, w wVar) {
        this(obj, twoWayConverter, (i5 & 4) != 0 ? null : obj2);
    }

    @k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @b1(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }
}
