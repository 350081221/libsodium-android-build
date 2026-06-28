package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$LegacyScaffoldLayout$1$1 extends n0 implements p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ p<Composer, Integer, r2> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ boolean $isFabDocked;
    final /* synthetic */ p<Composer, Integer, r2> $snackbar;
    final /* synthetic */ p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$LegacyScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,818:1\n151#2,3:819\n33#2,4:822\n154#2,2:826\n38#2:828\n156#2:829\n171#2,13:830\n151#2,3:843\n33#2,4:846\n154#2,2:850\n38#2:852\n156#2:853\n171#2,13:854\n151#2,3:867\n33#2,4:870\n154#2,2:874\n38#2:876\n156#2:877\n171#2,13:878\n171#2,13:891\n151#2,3:904\n33#2,4:907\n154#2,2:911\n38#2:913\n156#2:914\n171#2,13:915\n151#2,3:928\n33#2,4:931\n154#2,2:935\n38#2:937\n156#2:938\n33#2,6:939\n33#2,6:945\n33#2,6:951\n33#2,6:957\n33#2,6:963\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$LegacyScaffoldLayout$1$1$1\n*L\n636#1:819,3\n636#1:822,4\n636#1:826,2\n636#1:828\n636#1:829\n640#1:830,13\n642#1:843,3\n642#1:846,4\n642#1:850,2\n642#1:852\n642#1:853\n658#1:854,13\n661#1:867,3\n661#1:870,4\n661#1:874,2\n661#1:876\n661#1:877\n677#1:878,13\n678#1:891,13\n719#1:904,3\n719#1:907,4\n719#1:911,2\n719#1:913\n719#1:914\n721#1:915,13\n767#1:928,3\n767#1:931,4\n767#1:935,2\n767#1:937\n767#1:938\n770#1:939,6\n773#1:945,6\n776#1:951,6\n780#1:957,6\n784#1:963,6\n*E\n"})
    /* renamed from: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
        final /* synthetic */ p<Composer, Integer, r2> $bottomBar;
        final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
        final /* synthetic */ WindowInsets $contentWindowInsets;
        final /* synthetic */ p<Composer, Integer, r2> $fab;
        final /* synthetic */ int $fabPosition;
        final /* synthetic */ boolean $isFabDocked;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ long $looseConstraints;
        final /* synthetic */ p<Composer, Integer, r2> $snackbar;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ p<Composer, Integer, r2> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(SubcomposeMeasureScope subcomposeMeasureScope, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, int i5, int i6, boolean z4, WindowInsets windowInsets, int i7, long j5, p<? super Composer, ? super Integer, r2> pVar4, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = pVar;
            this.$snackbar = pVar2;
            this.$fab = pVar3;
            this.$fabPosition = i5;
            this.$layoutWidth = i6;
            this.$isFabDocked = z4;
            this.$contentWindowInsets = windowInsets;
            this.$layoutHeight = i7;
            this.$looseConstraints = j5;
            this.$bottomBar = pVar4;
            this.$content = qVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0309  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0254 A[LOOP:3: B:48:0x0252->B:49:0x0254, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x02f1  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x034a A[LOOP:4: B:67:0x0348->B:68:0x034a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0373 A[LOOP:5: B:71:0x0371->B:72:0x0373, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x038e A[LOOP:6: B:75:0x038c->B:76:0x038e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x03b1 A[LOOP:7: B:79:0x03af->B:80:0x03b1, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x03d4  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x03fa  */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2(@p4.l androidx.compose.ui.layout.Placeable.PlacementScope r30) {
            /*
                Method dump skipped, instructions count: 1060
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1.AnonymousClass1.invoke2(androidx.compose.ui.layout.Placeable$PlacementScope):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$LegacyScaffoldLayout$1$1(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, int i5, boolean z4, WindowInsets windowInsets, p<? super Composer, ? super Integer, r2> pVar4, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$topBar = pVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$fabPosition = i5;
        this.$isFabDocked = z4;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = pVar4;
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1427invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1427invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
        return MeasureScope.layout$default(subcomposeMeasureScope, m6000getMaxWidthimpl, m5999getMaxHeightimpl, null, new AnonymousClass1(subcomposeMeasureScope, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m6000getMaxWidthimpl, this.$isFabDocked, this.$contentWindowInsets, m5999getMaxHeightimpl, Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$content), 4, null);
    }
}
