package androidx.compose.foundation.text2;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BasicTextField2Kt$DefaultTextFieldDecorator$1 implements TextFieldDecorator {
    public static final BasicTextField2Kt$DefaultTextFieldDecorator$1 INSTANCE = new BasicTextField2Kt$DefaultTextFieldDecorator$1();

    BasicTextField2Kt$DefaultTextFieldDecorator$1() {
    }

    @Override // androidx.compose.foundation.text2.TextFieldDecorator
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void Decoration(@l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-186734623);
        if ((i5 & 14) == 0) {
            i6 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            i6 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-186734623, i6, -1, "androidx.compose.foundation.text2.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField2.kt:541)");
            }
            pVar.invoke(startRestartGroup, Integer.valueOf(i6 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BasicTextField2Kt$DefaultTextFieldDecorator$1$Decoration$1(this, pVar, i5));
        }
    }
}
