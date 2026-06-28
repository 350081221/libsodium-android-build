package androidx.compose.foundation.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aL\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u001c\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0002H\u0002\u001a\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u001a\u0010 \u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\"\"\u001a\u0010&\u001a\u0004\u0018\u00010#*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0018\u0010)\u001a\u00020\u0004*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "Box", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLv3/q;Landroidx/compose/runtime/Composer;II)V", "alignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "boxWidth", "boxHeight", "placeInBox", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "getBoxChildDataNode", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildDataNode;", "boxChildDataNode", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,310:1\n79#2,11:311\n92#2:342\n124#2,5:351\n130#2,5:364\n135#2:375\n137#2:378\n456#3,8:322\n464#3,6:336\n50#3:343\n49#3:344\n286#3,8:356\n294#3,2:376\n3737#4,6:330\n3737#4,6:369\n1116#5,6:345\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n73#1:311,11\n73#1:342\n209#1:351,5\n209#1:364,5\n209#1:375\n209#1:378\n73#1:322,8\n73#1:336,6\n88#1:343\n88#1:344\n209#1:356,8\n209#1:376,2\n73#1:330,6\n209#1:369,6\n88#1:345,6\n*E\n"})
/* loaded from: classes.dex */
public final class BoxKt {

    @l
    private static final MeasurePolicy DefaultBoxMeasurePolicy = new BoxMeasurePolicy(Alignment.Companion.getTopStart(), false);

    @l
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1

        @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1$1, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass1 extends n0 implements v3.l<Placeable.PlacementScope, r2> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Placeable.PlacementScope placementScope) {
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @l
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
            return MeasureScope.layout$default(measureScope, Constraints.m6002getMinWidthimpl(j5), Constraints.m6001getMinHeightimpl(j5), null, AnonymousClass1.INSTANCE, 4, null);
        }
    };

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(@m Modifier modifier, @m Alignment alignment, boolean z4, @l q<? super BoxScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(733328855);
        if ((i6 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i6 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        int i7 = i5 >> 3;
        MeasurePolicy rememberBoxMeasurePolicy = rememberBoxMeasurePolicy(alignment, z4, composer, (i7 & 112) | (i7 & 14));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i8 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
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
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, Integer.valueOf((i8 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        qVar.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i5 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    private static final BoxChildDataNode getBoxChildDataNode(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildDataNode) {
            return (BoxChildDataNode) parentData;
        }
        return null;
    }

    @l
    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        if (boxChildDataNode != null) {
            return boxChildDataNode.getMatchParentSize();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i5, int i6, Alignment alignment) {
        Alignment alignment2;
        Alignment alignment3;
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        if (boxChildDataNode != null && (alignment3 = boxChildDataNode.getAlignment()) != null) {
            alignment2 = alignment3;
        } else {
            alignment2 = alignment;
        }
        Placeable.PlacementScope.m5049place70tqf50$default(placementScope, placeable, alignment2.mo3370alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i5, i6), layoutDirection), 0.0f, 2, null);
    }

    @l
    @Composable
    @a1
    public static final MeasurePolicy rememberBoxMeasurePolicy(@l Alignment alignment, boolean z4, @m Composer composer, int i5) {
        MeasurePolicy measurePolicy;
        composer.startReplaceableGroup(56522820);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i5, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:84)");
        }
        if (l0.g(alignment, Alignment.Companion.getTopStart()) && !z4) {
            measurePolicy = DefaultBoxMeasurePolicy;
        } else {
            Boolean valueOf = Boolean.valueOf(z4);
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(valueOf) | composer.changed(alignment);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BoxMeasurePolicy(alignment, z4);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(@l Modifier modifier, @m Composer composer, int i5) {
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-211209833);
        if ((i5 & 14) == 0) {
            i6 = (startRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i6, -1, "androidx.compose.foundation.layout.Box (Box.kt:207)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            startRestartGroup.startReplaceableGroup(544976794);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            startRestartGroup.startReplaceableGroup(1405779621);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new BoxKt$Box$$inlined$Layout$1(constructor));
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m3271setimpl(m3264constructorimpl, materializeModifier, companion.getSetModifier());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BoxKt$Box$2(modifier, i5));
        }
    }
}
