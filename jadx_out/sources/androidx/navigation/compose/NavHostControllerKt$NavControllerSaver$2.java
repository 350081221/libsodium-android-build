package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.NavHostController;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/navigation/NavHostController;", "it", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavHostController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt$NavControllerSaver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostControllerKt$NavControllerSaver$2 extends n0 implements l<Bundle, NavHostController> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$NavControllerSaver$2(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // v3.l
    @m
    public final NavHostController invoke(@p4.l Bundle bundle) {
        NavHostController createNavController;
        createNavController = NavHostControllerKt.createNavController(this.$context);
        createNavController.restoreState(bundle);
        return createNavController;
    }
}
