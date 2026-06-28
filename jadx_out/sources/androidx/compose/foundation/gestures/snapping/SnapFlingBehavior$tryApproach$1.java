package androidx.compose.foundation.gestures.snapping;

import com.android.dx.io.Opcodes;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {Opcodes.AND_INT_LIT16}, m = "tryApproach", n = {}, s = {})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$tryApproach$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$tryApproach$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.d<? super SnapFlingBehavior$tryApproach$1> dVar) {
        super(dVar);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object tryApproach;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryApproach = this.this$0.tryApproach(null, 0.0f, 0.0f, null, this);
        return tryApproach;
    }
}
