package androidx.compose.ui.semantics;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/r2;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Lkotlin/r2;Lkotlin/r2;)Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SemanticsProperties$IsDialog$1 extends n0 implements p<r2, r2, r2> {
    public static final SemanticsProperties$IsDialog$1 INSTANCE = new SemanticsProperties$IsDialog$1();

    SemanticsProperties$IsDialog$1() {
        super(2);
    }

    @Override // v3.p
    @m
    public final r2 invoke(@m r2 r2Var, @l r2 r2Var2) {
        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
    }
}
