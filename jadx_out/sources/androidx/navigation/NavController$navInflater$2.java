package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavInflater;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavController$navInflater$2 extends n0 implements v3.a<NavInflater> {
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$navInflater$2(NavController navController) {
        super(0);
        this.this$0 = navController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final NavInflater invoke() {
        NavInflater navInflater;
        navInflater = this.this$0.inflater;
        return navInflater == null ? new NavInflater(this.this$0.getContext(), this.this$0._navigatorProvider) : navInflater;
    }
}
