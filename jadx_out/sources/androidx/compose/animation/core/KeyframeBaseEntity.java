package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.q1;
import kotlin.u0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0001\u0001\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/KeyframeBaseEntity;", "T", "", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "Lkotlin/u0;", "Landroidx/compose/animation/core/Easing;", "toPair$animation_core_release", "(Lv3/l;)Lkotlin/u0;", "toPair", t0.b.f22420d, "Ljava/lang/Object;", "getValue$animation_core_release", "()Ljava/lang/Object;", "easing", "Landroidx/compose/animation/core/Easing;", "getEasing$animation_core_release", "()Landroidx/compose/animation/core/Easing;", "setEasing$animation_core_release", "(Landroidx/compose/animation/core/Easing;)V", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {
    public static final int $stable = 8;

    @l
    private Easing easing;
    private final T value;

    private KeyframeBaseEntity(T t5, Easing easing) {
        this.value = t5;
        this.easing = easing;
    }

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, w wVar) {
        this(obj, easing);
    }

    @l
    public final Easing getEasing$animation_core_release() {
        return this.easing;
    }

    public final T getValue$animation_core_release() {
        return this.value;
    }

    public final void setEasing$animation_core_release(@l Easing easing) {
        this.easing = easing;
    }

    @l
    public final <V extends AnimationVector> u0<V, Easing> toPair$animation_core_release(@l v3.l<? super T, ? extends V> lVar) {
        return q1.a(lVar.invoke(this.value), this.easing);
    }
}
