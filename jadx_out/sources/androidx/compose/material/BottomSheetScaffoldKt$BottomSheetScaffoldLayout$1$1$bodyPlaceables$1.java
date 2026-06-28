package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceables$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $body;
    final /* synthetic */ float $sheetPeekHeight;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceables$1(q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, float f5) {
        super(2);
        this.$body = qVar;
        this.$sheetPeekHeight = f5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-389342674, i5, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:704)");
        }
        this.$body.invoke(PaddingKt.m550PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, this.$sheetPeekHeight, 7, null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
