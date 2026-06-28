package androidx.compose.ui.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import p4.l;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/TestModifierUpdater;", "Lkotlin/r2;", "onAttached", "TestModifierUpdaterLayout", "(Lv3/l;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTestModifierUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,65:1\n251#2,8:66\n259#2,2:80\n3737#3,6:74\n*S KotlinDebug\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n*L\n55#1:66,8\n55#1:80,2\n60#1:74,6\n*E\n"})
/* loaded from: classes.dex */
public final class TestModifierUpdaterKt {
    @Composable
    @k(level = m.ERROR, message = "It is a test API, do not use it in the real applications")
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void TestModifierUpdaterLayout(@l v3.l<? super TestModifierUpdater, r2> lVar, @p4.m Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1673066036);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673066036, i6, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:49)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1

                @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$1, reason: invalid class name */
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
                    return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), Constraints.m5999getMaxHeightimpl(j5), null, AnonymousClass1.INSTANCE, 4, null);
                }
            };
            a<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            startRestartGroup.startReplaceableGroup(1886828752);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new TestModifierUpdaterKt$TestModifierUpdaterLayout$$inlined$ComposeNode$1(constructor$ui_release));
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m3271setimpl(m3264constructorimpl, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, companion.getSetMeasurePolicy());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3268initimpl(m3264constructorimpl, new TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(lVar));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(lVar, i5));
        }
    }
}
