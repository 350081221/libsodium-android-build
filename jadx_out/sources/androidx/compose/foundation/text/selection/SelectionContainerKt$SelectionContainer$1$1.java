package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text/selection/Selection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionContainerKt$SelectionContainer$1$1 extends n0 implements l<Selection, r2> {
    final /* synthetic */ MutableState<Selection> $selection$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$1$1(MutableState<Selection> mutableState) {
        super(1);
        this.$selection$delegate = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Selection selection) {
        invoke2(selection);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Selection selection) {
        this.$selection$delegate.setValue(selection);
    }
}
