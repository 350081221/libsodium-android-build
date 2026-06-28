package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$7\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,493:1\n74#2:494\n1#3:495\n68#4,6:496\n74#4:530\n78#4:535\n78#5,11:502\n91#5:534\n456#6,8:513\n464#6,3:527\n467#6,3:531\n3737#7,6:521\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt$Surface$7\n*L\n454#1:494\n444#1:496,6\n444#1:530\n444#1:535\n444#1:502,11\n444#1:534\n444#1:513,8\n444#1:527,3\n444#1:531,3\n444#1:521,6\n*E\n"})
/* loaded from: classes.dex */
public final class SurfaceKt$Surface$7 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ long $color;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Boolean, r2> $onCheckedChange;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceKt$Surface$7(Modifier modifier, Shape shape, long j5, float f5, BorderStroke borderStroke, boolean z4, MutableInteractionSource mutableInteractionSource, boolean z5, v3.l<? super Boolean, r2> lVar, float f6, v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$modifier = modifier;
        this.$shape = shape;
        this.$color = j5;
        this.$absoluteElevation = f5;
        this.$border = borderStroke;
        this.$checked = z4;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z5;
        this.$onCheckedChange = lVar;
        this.$shadowElevation = f6;
        this.$content = pVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        long m2311surfaceColorAtElevationCLU3JFs;
        Modifier m2310surfaceXOJAsU;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(712720927, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:442)");
        }
        Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.$modifier);
        Shape shape = this.$shape;
        m2311surfaceColorAtElevationCLU3JFs = SurfaceKt.m2311surfaceColorAtElevationCLU3JFs(this.$color, this.$absoluteElevation, composer, 0);
        m2310surfaceXOJAsU = SurfaceKt.m2310surfaceXOJAsU(minimumInteractiveComponentSize, shape, m2311surfaceColorAtElevationCLU3JFs, this.$border, ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo304toPx0680j_4(this.$shadowElevation));
        Modifier m799toggleableO2vRcR0$default = ToggleableKt.m799toggleableO2vRcR0$default(m2310surfaceXOJAsU, this.$checked, this.$interactionSource, RippleKt.m1541rememberRipple9IZ8Weo(false, 0.0f, 0L, composer, 0, 7), this.$enabled, null, this.$onCheckedChange, 16, null);
        v3.p<Composer, Integer, r2> pVar = this.$content;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m799toggleableO2vRcR0$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        pVar.invoke(composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
