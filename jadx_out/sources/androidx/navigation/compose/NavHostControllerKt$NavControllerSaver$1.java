package androidx.navigation.compose;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.navigation.NavHostController;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/navigation/NavHostController;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavHostControllerKt$NavControllerSaver$1 extends n0 implements p<SaverScope, NavHostController, Bundle> {
    public static final NavHostControllerKt$NavControllerSaver$1 INSTANCE = new NavHostControllerKt$NavControllerSaver$1();

    NavHostControllerKt$NavControllerSaver$1() {
        super(2);
    }

    @Override // v3.p
    @m
    public final Bundle invoke(@l SaverScope saverScope, @l NavHostController navHostController) {
        return navHostController.saveState();
    }
}
