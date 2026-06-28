package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
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
@r1({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,915:1\n74#2:916\n74#2:917\n68#3,6:918\n74#3:952\n78#3:957\n79#4,11:924\n92#4:956\n456#5,8:935\n464#5,3:949\n467#5,3:953\n3737#6,6:943\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$2\n*L\n661#1:916\n673#1:917\n684#1:918,6\n684#1:952\n684#1:957\n684#1:924,11\n684#1:956\n684#1:935,8\n684#1:949,3\n684#1:953,3\n684#1:943,6\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerKt$BottomDrawer$2 extends n0 implements q<BoxWithConstraintsScope, Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$BottomDrawer$2(boolean z4, BottomDrawerState bottomDrawerState, p<? super Composer, ? super Integer, r2> pVar, long j5, Shape shape, long j6, long j7, float f5, s0 s0Var, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
        super(3);
        this.$gesturesEnabled = z4;
        this.$drawerState = bottomDrawerState;
        this.$content = pVar;
        this.$scrimColor = j5;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j6;
        this.$drawerContentColor = j7;
        this.$drawerElevation = f5;
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
            ComposerKt.traceEventStart(1220102512, i6, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:657)");
        }
        float m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk());
        boolean z4 = Constraints.m6000getMaxWidthimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk()) > Constraints.m5999getMaxHeightimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Modifier.Companion companion = Modifier.Companion;
        Modifier m606sizeInqDBjuR0$default = SizeKt.m606sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density.mo301toDpu2uoSUM(Constraints.m6000getMaxWidthimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk())), density.mo301toDpu2uoSUM(Constraints.m5999getMaxHeightimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk())), 3, null);
        Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion.then(this.$gesturesEnabled ? NestedScrollModifierKt.nestedScroll$default(companion, this.$drawerState.getNestedScrollConnection$material_release(), null, 2, null) : companion), this.$drawerState.getAnchoredDraggableState$material_release(), Orientation.Vertical, this.$gesturesEnabled, composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl, null, false, 48, null);
        p<Composer, Integer, r2> pVar = this.$content;
        long j5 = this.$scrimColor;
        BottomDrawerState bottomDrawerState = this.$drawerState;
        Shape shape = this.$drawerShape;
        long j6 = this.$drawerBackgroundColor;
        long j7 = this.$drawerContentColor;
        float f5 = this.$drawerElevation;
        boolean z5 = this.$gesturesEnabled;
        s0 s0Var = this.$scope;
        q<ColumnScope, Composer, Integer, r2> qVar = this.$drawerContent;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        pVar.invoke(composer, 0);
        DrawerKt.m1323BottomDrawerScrim3JVO9M(j5, new DrawerKt$BottomDrawer$2$1$1(z5, bottomDrawerState, s0Var), bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, 0);
        SurfaceKt.m1454SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(m606sizeInqDBjuR0$default, new DrawerKt$BottomDrawer$2$1$2(bottomDrawerState, m5999getMaxHeightimpl, z4)), new DrawerKt$BottomDrawer$2$1$3(bottomDrawerState)), false, new DrawerKt$BottomDrawer$2$1$4(Strings_androidKt.m1452getString4foXLRw(Strings.Companion.m1449getNavigationMenuUdPEhr4(), composer, 6), bottomDrawerState, s0Var), 1, null), shape, j6, j7, null, f5, ComposableLambdaKt.composableLambda(composer, 457750254, true, new DrawerKt$BottomDrawer$2$1$5(qVar)), composer, 1572864, 16);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
