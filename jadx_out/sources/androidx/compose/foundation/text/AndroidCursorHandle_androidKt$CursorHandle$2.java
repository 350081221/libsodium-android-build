package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidCursorHandle_androidKt$CursorHandle$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidCursorHandle_androidKt$CursorHandle$2(p<? super Composer, ? super Integer, r2> pVar, Modifier modifier) {
        super(2);
        this.$content = pVar;
        this.$modifier = modifier;
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
            ComposerKt.traceEventStart(-1458480226, i5, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:47)");
        }
        if (this.$content == null) {
            composer.startReplaceableGroup(1275643845);
            AndroidCursorHandle_androidKt.DefaultCursorHandle(this.$modifier, composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1275643915);
            this.$content.invoke(composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
