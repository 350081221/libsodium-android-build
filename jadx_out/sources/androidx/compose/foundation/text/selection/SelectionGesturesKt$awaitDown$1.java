package androidx.compose.foundation.text.selection;

import com.android.dx.io.Opcodes;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {Opcodes.SHR_INT_LIT8}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt$awaitDown$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SelectionGesturesKt$awaitDown$1(kotlin.coroutines.d<? super SelectionGesturesKt$awaitDown$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object awaitDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitDown = SelectionGesturesKt.awaitDown(null, this);
        return awaitDown;
    }
}
