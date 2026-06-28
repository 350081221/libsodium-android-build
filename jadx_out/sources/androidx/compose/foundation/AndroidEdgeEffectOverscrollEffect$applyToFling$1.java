package androidx.compose.foundation;

import com.android.dx.io.Opcodes;
import kotlin.i0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {Opcodes.XOR_INT_LIT8, 248}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends kotlin.coroutines.jvm.internal.d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, kotlin.coroutines.d<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> dVar) {
        super(dVar);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo181applyToFlingBMRW4eQ(0L, null, this);
    }
}
