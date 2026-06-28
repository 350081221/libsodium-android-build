package androidx.compose.ui.input.nestedscroll;

import com.android.dx.io.Opcodes;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {Opcodes.AND_INT_LIT8}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
/* loaded from: classes.dex */
public final class NestedScrollDispatcher$dispatchPostFling$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, kotlin.coroutines.d<? super NestedScrollDispatcher$dispatchPostFling$1> dVar) {
        super(dVar);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4754dispatchPostFlingRZ2iAVY(0L, 0L, this);
    }
}
