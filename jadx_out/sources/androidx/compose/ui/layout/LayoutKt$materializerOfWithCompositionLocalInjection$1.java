package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lkotlin/r2;", "invoke-Deg8D_g", "(Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n3848#2,2:391\n3850#2,2:399\n3737#3,6:393\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n*L\n229#1:391,2\n229#1:399,2\n232#1:393,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutKt$materializerOfWithCompositionLocalInjection$1 extends n0 implements q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> {
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOfWithCompositionLocalInjection$1(Modifier modifier) {
        super(3);
        this.$modifier = modifier;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
        m5013invokeDeg8D_g(skippableUpdater.m3262unboximpl(), composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    /* renamed from: invoke-Deg8D_g, reason: not valid java name */
    public final void m5013invokeDeg8D_g(@l Composer composer, @m Composer composer2, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-55743822, i5, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:226)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        Modifier materializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, this.$modifier);
        composer.startReplaceableGroup(509942095);
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m3271setimpl(m3264constructorimpl, materializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
