package androidx.compose.foundation.gestures;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {TTAdConstant.VALUE_CLICK_AREA_SAAS_AUTH}, m = "reset", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class PressGestureScopeImpl$reset$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PressGestureScopeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$reset$1(PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.d<? super PressGestureScopeImpl$reset$1> dVar) {
        super(dVar);
        this.this$0 = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.reset(this);
    }
}
