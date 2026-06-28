package androidx.compose.material3;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/ComposableSingletons$SnackbarKt$lambda-1$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,437:1\n59#2:438\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/ComposableSingletons$SnackbarKt$lambda-1$1\n*L\n231#1:438\n*E\n"})
/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$SnackbarKt$lambda1$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    public static final ComposableSingletons$SnackbarKt$lambda1$1 INSTANCE = new ComposableSingletons$SnackbarKt$lambda1$1();

    ComposableSingletons$SnackbarKt$lambda1$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-505750804, i5, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:228)");
        }
        ImageVector close = CloseKt.getClose(Icons.Filled.INSTANCE);
        Strings.Companion companion = Strings.Companion;
        IconKt.m1925Iconww6aTOc(close, Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_snackbar_dismiss), composer, 0), (Modifier) null, 0L, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
