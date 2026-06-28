package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$BottomSheetScaffoldKt$lambda2$1 extends kotlin.jvm.internal.n0 implements v3.q<SnackbarHostState, Composer, Integer, r2> {
    public static final ComposableSingletons$BottomSheetScaffoldKt$lambda2$1 INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt$lambda2$1();

    ComposableSingletons$BottomSheetScaffoldKt$lambda2$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
        invoke(snackbarHostState, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l SnackbarHostState snackbarHostState, @p4.m Composer composer, int i5) {
        if ((i5 & 6) == 0) {
            i5 |= composer.changed(snackbarHostState) ? 4 : 2;
        }
        if ((i5 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(923568898, i5, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda-2.<anonymous> (BottomSheetScaffold.kt:114)");
        }
        SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i5 & 14, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
