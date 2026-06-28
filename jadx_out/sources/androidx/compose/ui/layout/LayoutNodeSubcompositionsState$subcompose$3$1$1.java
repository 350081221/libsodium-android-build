package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,987:1\n169#2,9:988\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n*L\n478#1:988,9\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState$subcompose$3$1$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ LayoutNodeSubcompositionsState.NodeState $nodeState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeSubcompositionsState$subcompose$3$1$1(LayoutNodeSubcompositionsState.NodeState nodeState, p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$nodeState = nodeState;
        this.$content = pVar;
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
            ComposerKt.traceEventStart(-1750409193, i5, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:477)");
        }
        boolean active = this.$nodeState.getActive();
        p<Composer, Integer, r2> pVar = this.$content;
        composer.startReusableGroup(207, Boolean.valueOf(active));
        boolean changed = composer.changed(active);
        if (active) {
            pVar.invoke(composer, 0);
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
