package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/LookaheadScopeImpl;", "scope", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LookaheadScopeImpl;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LookaheadScopeKt$LookaheadScope$2$2 extends n0 implements p<LayoutNode, LookaheadScopeImpl, r2> {
    public static final LookaheadScopeKt$LookaheadScope$2$2 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$2();

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements a<LayoutCoordinates> {
        final /* synthetic */ LayoutNode $this_set;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LayoutNode layoutNode) {
            super(0);
            this.$this_set = layoutNode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final LayoutCoordinates invoke() {
            LayoutNode parent$ui_release = this.$this_set.getParent$ui_release();
            l0.m(parent$ui_release);
            return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
        }
    }

    LookaheadScopeKt$LookaheadScope$2$2() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
        invoke2(layoutNode, lookaheadScopeImpl);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l LayoutNode layoutNode, @l LookaheadScopeImpl lookaheadScopeImpl) {
        lookaheadScopeImpl.setScopeCoordinates(new AnonymousClass1(layoutNode));
    }
}
