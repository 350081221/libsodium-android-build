package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidAlertDialog_androidKt$AlertDialog$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ p<Composer, Integer, r2> $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ p<Composer, Integer, r2> $text;
    final /* synthetic */ p<Composer, Integer, r2> $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAlertDialog_androidKt$AlertDialog$3(p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, Shape shape, long j5, long j6) {
        super(2);
        this.$buttons = pVar;
        this.$modifier = modifier;
        this.$title = pVar2;
        this.$text = pVar3;
        this.$shape = shape;
        this.$backgroundColor = j5;
        this.$contentColor = j6;
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
            ComposerKt.traceEventStart(-1787418772, i5, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:140)");
        }
        AlertDialogKt.m1191AlertDialogContentWMdw5o4(this.$buttons, this.$modifier, this.$title, this.$text, this.$shape, this.$backgroundColor, this.$contentColor, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
