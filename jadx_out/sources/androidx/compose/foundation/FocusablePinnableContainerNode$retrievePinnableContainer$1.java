package androidx.compose.foundation;

import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusablePinnableContainerNode$retrievePinnableContainer$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ k1.h<PinnableContainer> $container;
    final /* synthetic */ FocusablePinnableContainerNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusablePinnableContainerNode$retrievePinnableContainer$1(k1.h<PinnableContainer> hVar, FocusablePinnableContainerNode focusablePinnableContainerNode) {
        super(0);
        this.$container = hVar;
        this.this$0 = focusablePinnableContainerNode;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$container.element = CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, PinnableContainerKt.getLocalPinnableContainer());
    }
}
