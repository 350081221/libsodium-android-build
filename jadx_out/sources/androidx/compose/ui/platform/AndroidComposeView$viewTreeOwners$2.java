package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView$viewTreeOwners$2 extends kotlin.jvm.internal.n0 implements v3.a<AndroidComposeView.ViewTreeOwners> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$viewTreeOwners$2(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.m
    public final AndroidComposeView.ViewTreeOwners invoke() {
        AndroidComposeView.ViewTreeOwners viewTreeOwners;
        viewTreeOwners = this.this$0.get_viewTreeOwners();
        return viewTreeOwners;
    }
}
