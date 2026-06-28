package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.g;
import kotlin.i0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/FixedMotionDurationScale;", "Landroidx/compose/ui/MotionDurationScale;", "()V", "scaleFactor", "", "getScaleFactor", "()F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FixedMotionDurationScale implements MotionDurationScale {

    @l
    public static final FixedMotionDurationScale INSTANCE = new FixedMotionDurationScale();

    private FixedMotionDurationScale() {
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @l p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r5, pVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @m
    public <E extends g.b> E get(@l g.c<E> cVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 1.0f;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @l
    public g minusKey(@l g.c<?> cVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.g
    @l
    public g plus(@l g gVar) {
        return MotionDurationScale.DefaultImpls.plus(this, gVar);
    }
}
