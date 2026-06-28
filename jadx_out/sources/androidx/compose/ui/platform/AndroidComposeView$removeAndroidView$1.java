package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidComposeView$removeAndroidView$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ AndroidViewHolder $view;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$removeAndroidView$1(AndroidComposeView androidComposeView, AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidComposeView;
        this.$view = androidViewHolder;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getAndroidViewsHandler$ui_release().removeViewInLayout(this.$view);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = this.this$0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        kotlin.jvm.internal.u1.k(layoutNodeToHolder).remove(this.this$0.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.$view));
        ViewCompat.setImportantForAccessibility(this.$view, 0);
    }
}
