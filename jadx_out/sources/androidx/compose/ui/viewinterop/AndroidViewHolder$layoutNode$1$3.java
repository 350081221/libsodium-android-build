package androidx.compose.ui.viewinterop;

import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/Owner;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$3 extends n0 implements l<Owner, r2> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Owner owner) {
        invoke2(owner);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Owner owner) {
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        if (androidComposeView != null) {
            androidComposeView.addAndroidView(this.$this_run, this.$layoutNode);
        }
        ViewParent parent = this.$this_run.getView().getParent();
        AndroidViewHolder androidViewHolder = this.$this_run;
        if (parent != androidViewHolder) {
            androidViewHolder.addView(androidViewHolder.getView());
        }
    }
}
