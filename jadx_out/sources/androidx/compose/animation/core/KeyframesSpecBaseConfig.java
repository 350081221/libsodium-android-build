package androidx.compose.animation.core;

import androidx.annotation.IntRange;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u0000H ¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00028\u0001*\u00028\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u0007H\u0096\u0004¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0004¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\u001f\u001a\u00020 H\u0086\u0004¢\u0006\u0002\u0010!R\u001c\u0010\u0006\u001a\u00020\u00078GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00020\u00078GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\"#¨\u0006$"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "T", "E", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "", "()V", "delayMillis", "", "getDelayMillis", "()I", "setDelayMillis", "(I)V", "durationMillis", "getDurationMillis", "setDurationMillis", "keyframes", "Landroidx/collection/MutableIntObjectMap;", "getKeyframes$animation_core_release", "()Landroidx/collection/MutableIntObjectMap;", "createEntityFor", t0.b.f22420d, "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframeBaseEntity;", "at", "timeStamp", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframeBaseEntity;", "atFraction", "fraction", "", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframeBaseEntity;", "using", "easing", "Landroidx/compose/animation/core/Easing;", "(Landroidx/compose/animation/core/KeyframeBaseEntity;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/KeyframeBaseEntity;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    public static final int $stable = 8;
    private int delayMillis;
    private int durationMillis;

    @l
    private final MutableIntObjectMap<E> keyframes;

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = IntObjectMapKt.mutableIntObjectMapOf();
    }

    public /* synthetic */ KeyframesSpecBaseConfig(w wVar) {
        this();
    }

    @l
    public E at(T t5, @IntRange(from = 0) int i5) {
        E createEntityFor$animation_core_release = createEntityFor$animation_core_release(t5);
        this.keyframes.set(i5, createEntityFor$animation_core_release);
        return createEntityFor$animation_core_release;
    }

    @l
    public E atFraction(T t5, float f5) {
        int L0;
        L0 = kotlin.math.d.L0(this.durationMillis * f5);
        return at(t5, L0);
    }

    @l
    public abstract E createEntityFor$animation_core_release(T t5);

    @IntRange(from = 0)
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    @IntRange(from = 0)
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @l
    public final MutableIntObjectMap<E> getKeyframes$animation_core_release() {
        return this.keyframes;
    }

    public final void setDelayMillis(int i5) {
        this.delayMillis = i5;
    }

    public final void setDurationMillis(int i5) {
        this.durationMillis = i5;
    }

    @l
    public final E using(@l E e5, @l Easing easing) {
        e5.setEasing$animation_core_release(easing);
        return e5;
    }
}
