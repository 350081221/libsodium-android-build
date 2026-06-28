package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,521:1\n1116#2,6:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2\n*L\n155#1:522,6\n*E\n"})
/* loaded from: classes.dex */
final class TabRowKt$TabRow$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $divider;
    final /* synthetic */ q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRow$2(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
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
            ComposerKt.traceEventStart(-1961746365, i5, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:154)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        composer.startReplaceableGroup(370751195);
        boolean changedInstance = composer.changedInstance(this.$tabs) | composer.changedInstance(this.$divider) | composer.changedInstance(this.$indicator);
        p<Composer, Integer, r2> pVar = this.$tabs;
        p<Composer, Integer, r2> pVar2 = this.$divider;
        q<List<TabPosition>, Composer, Integer, r2> qVar = this.$indicator;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TabRowKt$TabRow$2$1$1(pVar, pVar2, qVar);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (p) rememberedValue, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
