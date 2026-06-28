package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.android.dx.io.Opcodes;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/SnackbarData;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends n0 implements q<SnackbarData, Composer, Integer, r2> {
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 INSTANCE = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(SnackbarData snackbarData, Composer composer, Integer num) {
        invoke(snackbarData, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@l SnackbarData snackbarData, @m Composer composer, int i5) {
        int i6;
        if ((i5 & 14) == 0) {
            i6 = i5 | (composer.changed(snackbarData) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(996639038, i6, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
        }
        SnackbarKt.m1437SnackbarsPrSdHI(snackbarData, null, false, null, 0L, 0L, 0L, 0.0f, composer, i6 & 14, Opcodes.CONST_METHOD_HANDLE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
