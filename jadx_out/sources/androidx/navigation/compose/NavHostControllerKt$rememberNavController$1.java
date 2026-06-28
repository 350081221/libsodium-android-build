package androidx.navigation.compose;

import android.content.Context;
import androidx.navigation.NavHostController;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavHostController;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavHostControllerKt$rememberNavController$1 extends n0 implements a<NavHostController> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$rememberNavController$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final NavHostController invoke() {
        NavHostController createNavController;
        createNavController = NavHostControllerKt.createNavController(this.$context);
        return createNavController;
    }
}
