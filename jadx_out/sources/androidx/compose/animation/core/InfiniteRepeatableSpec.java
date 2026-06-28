package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\b\u0017\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fB)\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010 J,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "vectorize", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "J", "getInitialStartOffset-Rmkjzm4", "()J", "<init>", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/w;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 8;

    @l
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;

    @l
    private final RepeatMode repeatMode;

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j5) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j5;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j5, w wVar) {
        this(durationBasedAnimationSpec, repeatMode, j5);
    }

    public boolean equals(@m Object obj) {
        if (!(obj instanceof InfiniteRepeatableSpec)) {
            return false;
        }
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
        if (!l0.g(infiniteRepeatableSpec.animation, this.animation) || infiniteRepeatableSpec.repeatMode != this.repeatMode || !StartOffset.m141equalsimpl0(infiniteRepeatableSpec.initialStartOffset, this.initialStartOffset)) {
            return false;
        }
        return true;
    }

    @l
    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m122getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    @l
    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m144hashCodeimpl(this.initialStartOffset);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    @l
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(@l TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.animation.vectorize((TwoWayConverter) twoWayConverter), this.repeatMode, this.initialStartOffset, (w) null);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j5, int i5, w wVar) {
        this(durationBasedAnimationSpec, (i5 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i5 & 4) != 0 ? StartOffset.m139constructorimpl$default(0, 0, 2, null) : j5, (w) null);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i5, w wVar) {
        this(durationBasedAnimationSpec, (i5 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @k(level = kotlin.m.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this(durationBasedAnimationSpec, repeatMode, StartOffset.m139constructorimpl$default(0, 0, 2, null), (w) null);
    }
}
