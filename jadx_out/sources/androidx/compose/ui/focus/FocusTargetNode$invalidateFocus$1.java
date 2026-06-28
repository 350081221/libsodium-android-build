package androidx.compose.ui.focus;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusTargetNode$invalidateFocus$1 extends n0 implements a<r2> {
    final /* synthetic */ k1.h<FocusProperties> $focusProperties;
    final /* synthetic */ FocusTargetNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetNode$invalidateFocus$1(k1.h<FocusProperties> hVar, FocusTargetNode focusTargetNode) {
        super(0);
        this.$focusProperties = hVar;
        this.this$0 = focusTargetNode;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.focus.FocusProperties, T] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusProperties.element = this.this$0.fetchFocusProperties$ui_release();
    }
}
