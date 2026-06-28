package androidx.compose.material.pullrefresh;

import kotlin.i0;
import kotlin.jvm.internal.h0;
import v3.l;

@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class PullRefreshKt$pullRefresh$2$1 extends h0 implements l<Float, Float> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PullRefreshKt$pullRefresh$2$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    @p4.l
    public final Float invoke(float f5) {
        return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(f5));
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Float invoke(Float f5) {
        return invoke(f5.floatValue());
    }
}
