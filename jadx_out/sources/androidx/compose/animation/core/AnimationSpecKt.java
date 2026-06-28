package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.KeyframesWithSplineSpec;
import androidx.compose.runtime.Stable;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a;\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0007\u001a3\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0007\u001aH\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a4\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007\u001a@\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a,\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000*\"\u0004\b\u0000\u0010\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007\u001a\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "data", "convert", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/TweenSpec;", "tween", "", "dampingRatio", "stiffness", "visibilityThreshold", "Landroidx/compose/animation/core/SpringSpec;", "spring", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "Lkotlin/r2;", "Lkotlin/u;", "init", "Landroidx/compose/animation/core/KeyframesSpec;", "keyframes", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "keyframesWithSpline", "iterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "Landroidx/compose/animation/core/RepeatableSpec;", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "repeatable", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "infiniteRepeatable", "Landroidx/compose/animation/core/SnapSpec;", "snap", "animation-core_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t5) {
        if (t5 == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t5);
    }

    @Stable
    @k(level = m.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, StartOffset.m139constructorimpl$default(0, 0, 2, null), (w) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    @l
    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m118infiniteRepeatable9IiC70o(@l DurationBasedAnimationSpec<T> durationBasedAnimationSpec, @l RepeatMode repeatMode, long j5) {
        return new InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j5, (w) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m119infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i5 & 4) != 0) {
            j5 = StartOffset.m139constructorimpl$default(0, 0, 2, null);
        }
        return m118infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j5);
    }

    @Stable
    @l
    public static final <T> KeyframesSpec<T> keyframes(@l v3.l<? super KeyframesSpec.KeyframesSpecConfig<T>, r2> lVar) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        lVar.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    @Stable
    @l
    @ExperimentalAnimationSpecApi
    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(@l v3.l<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, r2> lVar) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        lVar.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig);
    }

    @Stable
    @k(level = m.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ RepeatableSpec repeatable(int i5, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new RepeatableSpec(i5, durationBasedAnimationSpec, repeatMode, StartOffset.m139constructorimpl$default(0, 0, 2, null), (w) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i5, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i5, durationBasedAnimationSpec, repeatMode);
    }

    @Stable
    @l
    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m120repeatable91I0pcU(int i5, @l DurationBasedAnimationSpec<T> durationBasedAnimationSpec, @l RepeatMode repeatMode, long j5) {
        return new RepeatableSpec<>(i5, durationBasedAnimationSpec, repeatMode, j5, (w) null);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m121repeatable91I0pcU$default(int i5, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i6 & 8) != 0) {
            j5 = StartOffset.m139constructorimpl$default(0, 0, 2, null);
        }
        return m120repeatable91I0pcU(i5, durationBasedAnimationSpec, repeatMode, j5);
    }

    @Stable
    @l
    public static final <T> SnapSpec<T> snap(int i5) {
        return new SnapSpec<>(i5);
    }

    public static /* synthetic */ SnapSpec snap$default(int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return snap(i5);
    }

    @Stable
    @l
    public static final <T> SpringSpec<T> spring(float f5, float f6, @p4.m T t5) {
        return new SpringSpec<>(f5, f6, t5);
    }

    public static /* synthetic */ SpringSpec spring$default(float f5, float f6, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 1500.0f;
        }
        if ((i5 & 4) != 0) {
            obj = null;
        }
        return spring(f5, f6, obj);
    }

    @Stable
    @l
    public static final <T> TweenSpec<T> tween(int i5, int i6, @l Easing easing) {
        return new TweenSpec<>(i5, i6, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i5, int i6, Easing easing, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 300;
        }
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        if ((i7 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i5, i6, easing);
    }
}
