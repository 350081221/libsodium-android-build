package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidAlertDialog_androidKt$AlertDialog$1$1$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $confirmButton;
    final /* synthetic */ p<Composer, Integer, r2> $dismissButton;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAlertDialog_androidKt$AlertDialog$1$1$1(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2) {
        super(2);
        this.$dismissButton = pVar;
        this.$confirmButton = pVar2;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1789213604, i5, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:84)");
        }
        p<Composer, Integer, r2> pVar = this.$dismissButton;
        composer.startReplaceableGroup(-1046483318);
        if (pVar != null) {
            pVar.invoke(composer, 0);
            r2 r2Var = r2.f19517a;
        }
        composer.endReplaceableGroup();
        this.$confirmButton.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
