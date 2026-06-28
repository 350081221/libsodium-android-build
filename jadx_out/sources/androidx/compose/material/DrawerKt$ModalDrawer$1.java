package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,915:1\n74#2:916\n74#2:923\n74#2:1006\n1116#3,6:917\n1116#3,6:1000\n1116#3,6:1007\n68#4,6:924\n74#4:958\n67#4,7:959\n74#4:994\n78#4:999\n78#4:1017\n79#5,11:930\n79#5,11:966\n92#5:998\n92#5:1016\n456#6,8:941\n464#6,3:955\n456#6,8:977\n464#6,3:991\n467#6,3:995\n467#6,3:1013\n3737#7,6:949\n3737#7,6:985\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n*L\n526#1:916\n536#1:923\n566#1:1006\n527#1:917,6\n559#1:1000,6\n575#1:1007,6\n537#1:924,6\n537#1:958\n546#1:959,7\n546#1:994\n546#1:999\n537#1:1017\n537#1:930,11\n546#1:966,11\n546#1:998\n537#1:1016\n537#1:941,8\n537#1:955,3\n546#1:977,8\n546#1:991,3\n546#1:995,3\n537#1:1013,3\n537#1:949,6\n546#1:985,6\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerKt$ModalDrawer$1 extends n0 implements q<BoxWithConstraintsScope, Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$ModalDrawer$1(DrawerState drawerState, boolean z4, long j5, Shape shape, long j6, long j7, float f5, p<? super Composer, ? super Integer, r2> pVar, s0 s0Var, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
        super(3);
        this.$drawerState = drawerState;
        this.$gesturesEnabled = z4;
        this.$scrimColor = j5;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j6;
        this.$drawerContentColor = j7;
        this.$drawerElevation = f5;
        this.$content = pVar;
        this.$scope = s0Var;
        this.$drawerContent = qVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@l BoxWithConstraintsScope boxWithConstraintsScope, @m Composer composer, int i5) {
        int i6;
        float f5;
        if ((i5 & 14) == 0) {
            i6 = i5 | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(816674999, i6, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:517)");
        }
        long mo489getConstraintsmsEJaDk = boxWithConstraintsScope.mo489getConstraintsmsEJaDk();
        if (Constraints.m5996getHasBoundedWidthimpl(mo489getConstraintsmsEJaDk)) {
            float f6 = -Constraints.m6000getMaxWidthimpl(mo489getConstraintsmsEJaDk);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceableGroup(463500327);
            boolean changed = composer.changed(this.$drawerState) | composer.changed(density) | composer.changed(f6) | composer.changed(0.0f);
            DrawerState drawerState = this.$drawerState;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DrawerKt$ModalDrawer$1$1$1(drawerState, density, f6, 0.0f);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect((a) rememberedValue, composer, 0);
            boolean z4 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Modifier.Companion companion = Modifier.Companion;
            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion, this.$drawerState.getAnchoredDraggableState$material_release(), Orientation.Horizontal, this.$gesturesEnabled, z4, null, false, 48, null);
            DrawerState drawerState2 = this.$drawerState;
            long j5 = this.$scrimColor;
            Shape shape = this.$drawerShape;
            long j6 = this.$drawerBackgroundColor;
            long j7 = this.$drawerContentColor;
            float f7 = this.$drawerElevation;
            p<Composer, Integer, r2> pVar = this.$content;
            boolean z5 = this.$gesturesEnabled;
            s0 s0Var = this.$scope;
            q<ColumnScope, Composer, Integer, r2> qVar = this.$drawerContent;
            composer.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(anchoredDraggable$default);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor2 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            pVar.invoke(composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            boolean isOpen = drawerState2.isOpen();
            DrawerKt$ModalDrawer$1$2$2 drawerKt$ModalDrawer$1$2$2 = new DrawerKt$ModalDrawer$1$2$2(z5, drawerState2, s0Var);
            composer.startReplaceableGroup(463501456);
            boolean changed2 = composer.changed(f6) | composer.changed(0.0f) | composer.changed(drawerState2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DrawerKt$ModalDrawer$1$2$3$1(f6, 0.0f, drawerState2);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            DrawerKt.m1325ScrimBx497Mc(isOpen, drawerKt$ModalDrawer$1$2$2, (a) rememberedValue2, j5, composer, 0);
            String m1452getString4foXLRw = Strings_androidKt.m1452getString4foXLRw(Strings.Companion.m1449getNavigationMenuUdPEhr4(), composer, 6);
            Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Modifier m605sizeInqDBjuR0 = SizeKt.m605sizeInqDBjuR0(companion, density2.mo301toDpu2uoSUM(Constraints.m6002getMinWidthimpl(mo489getConstraintsmsEJaDk)), density2.mo301toDpu2uoSUM(Constraints.m6001getMinHeightimpl(mo489getConstraintsmsEJaDk)), density2.mo301toDpu2uoSUM(Constraints.m6000getMaxWidthimpl(mo489getConstraintsmsEJaDk)), density2.mo301toDpu2uoSUM(Constraints.m5999getMaxHeightimpl(mo489getConstraintsmsEJaDk)));
            composer.startReplaceableGroup(463502210);
            boolean changed3 = composer.changed(drawerState2);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DrawerKt$ModalDrawer$1$2$5$1(drawerState2);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            Modifier offset = OffsetKt.offset(m605sizeInqDBjuR0, (v3.l) rememberedValue3);
            f5 = DrawerKt.EndDrawerPadding;
            SurfaceKt.m1454SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m557paddingqDBjuR0$default(offset, 0.0f, 0.0f, f5, 0.0f, 11, null), false, new DrawerKt$ModalDrawer$1$2$6(m1452getString4foXLRw, drawerState2, s0Var), 1, null), shape, j6, j7, null, f7, ComposableLambdaKt.composableLambda(composer, -1941234439, true, new DrawerKt$ModalDrawer$1$2$7(qVar)), composer, 1572864, 16);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        throw new IllegalStateException("Drawer shouldn't have infinite width");
    }
}
