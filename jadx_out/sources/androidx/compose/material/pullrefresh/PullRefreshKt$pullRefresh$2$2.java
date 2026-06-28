package androidx.compose.material.pullrefresh;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.n;
import kotlin.i0;
import kotlin.jvm.internal.a;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class PullRefreshKt$pullRefresh$2$2 extends a implements p<Float, d<? super Float>, Object>, n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PullRefreshKt$pullRefresh$2$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    @m
    public final Object invoke(float f5, @l d<? super Float> dVar) {
        Object pullRefresh$lambda$1$onRelease;
        pullRefresh$lambda$1$onRelease = PullRefreshKt.pullRefresh$lambda$1$onRelease((PullRefreshState) this.receiver, f5, dVar);
        return pullRefresh$lambda$1$onRelease;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Object invoke(Float f5, d<? super Float> dVar) {
        return invoke(f5.floatValue(), dVar);
    }
}
