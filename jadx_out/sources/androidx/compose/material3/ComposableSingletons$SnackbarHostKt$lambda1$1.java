package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/SnackbarData;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends kotlin.jvm.internal.n0 implements v3.q<SnackbarData, Composer, Integer, r2> {
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
    public final void invoke(@p4.l SnackbarData snackbarData, @p4.m Composer composer, int i5) {
        int i6;
        if ((i5 & 6) == 0) {
            i6 = i5 | (composer.changed(snackbarData) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(818736383, i6, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:223)");
        }
        SnackbarKt.m2221SnackbarsDKtq54(snackbarData, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i6 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
