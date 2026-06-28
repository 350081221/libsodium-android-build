package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "innerTextField", "invoke", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$CoreTextFieldKt$lambda1$1 extends n0 implements q<p<? super Composer, ? super Integer, ? extends r2>, Composer, Integer, r2> {
    public static final ComposableSingletons$CoreTextFieldKt$lambda1$1 INSTANCE = new ComposableSingletons$CoreTextFieldKt$lambda1$1();

    ComposableSingletons$CoreTextFieldKt$lambda1$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(p<? super Composer, ? super Integer, ? extends r2> pVar, Composer composer, Integer num) {
        invoke((p<? super Composer, ? super Integer, r2>) pVar, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void invoke(@l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        if ((i5 & 14) == 0) {
            i5 |= composer.changedInstance(pVar) ? 4 : 2;
        }
        if ((i5 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(671295101, i5, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:212)");
        }
        pVar.invoke(composer, Integer.valueOf(i5 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
