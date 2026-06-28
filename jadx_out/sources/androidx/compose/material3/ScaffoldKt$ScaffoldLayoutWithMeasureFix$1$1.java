package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.FabPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,598:1\n151#2,3:599\n33#2,4:602\n154#2,2:606\n38#2:608\n156#2:609\n171#2,13:610\n151#2,3:623\n33#2,4:626\n154#2,2:630\n38#2:632\n156#2:633\n171#2,13:634\n171#2,13:647\n416#2,3:660\n33#2,4:663\n419#2:667\n420#2:670\n38#2:671\n421#2:672\n171#2,13:673\n171#2,13:686\n151#2,3:699\n33#2,4:702\n154#2,2:706\n38#2:708\n156#2:709\n171#2,13:710\n151#2,3:723\n33#2,4:726\n154#2,2:730\n38#2:732\n156#2:733\n1#3:668\n1#3:669\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1\n*L\n185#1:599,3\n185#1:602,4\n185#1:606,2\n185#1:608\n185#1:609\n189#1:610,13\n191#1:623,3\n191#1:626,4\n191#1:630,2\n191#1:632\n191#1:633\n207#1:634,13\n208#1:647,13\n211#1:660,3\n211#1:663,4\n211#1:667\n211#1:670\n211#1:671\n211#1:672\n228#1:673,13\n229#1:686,13\n263#1:699,3\n263#1:702,4\n263#1:706,2\n263#1:708\n263#1:709\n265#1:710,13\n304#1:723,3\n304#1:726,4\n304#1:730,2\n304#1:732\n304#1:733\n211#1:669\n*E\n"})
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1 extends kotlin.jvm.internal.n0 implements v3.p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ v3.p<Composer, Integer, r2> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ v3.p<Composer, Integer, r2> $snackbar;
    final /* synthetic */ v3.p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,598:1\n33#2,6:599\n33#2,6:605\n33#2,6:611\n33#2,6:617\n33#2,6:623\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$1\n*L\n309#1:599,6\n312#1:605,6\n315#1:611,6\n323#1:617,6\n328#1:623,6\n*E\n"})
    /* renamed from: androidx.compose.material3.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ List<Placeable> $bodyContentPlaceables;
        final /* synthetic */ Integer $bottomBarHeight;
        final /* synthetic */ List<Placeable> $bottomBarPlaceables;
        final /* synthetic */ WindowInsets $contentWindowInsets;
        final /* synthetic */ Integer $fabOffsetFromBottom;
        final /* synthetic */ List<Placeable> $fabPlaceables;
        final /* synthetic */ FabPlacement $fabPlacement;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ int $snackbarOffsetFromBottom;
        final /* synthetic */ List<Placeable> $snackbarPlaceables;
        final /* synthetic */ int $snackbarWidth;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ List<Placeable> $topBarPlaceables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, List<? extends Placeable> list2, List<? extends Placeable> list3, List<? extends Placeable> list4, FabPlacement fabPlacement, int i5, int i6, WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, int i7, int i8, Integer num, List<? extends Placeable> list5, Integer num2) {
            super(1);
            this.$bodyContentPlaceables = list;
            this.$topBarPlaceables = list2;
            this.$snackbarPlaceables = list3;
            this.$bottomBarPlaceables = list4;
            this.$fabPlacement = fabPlacement;
            this.$layoutWidth = i5;
            this.$snackbarWidth = i6;
            this.$contentWindowInsets = windowInsets;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$layoutHeight = i7;
            this.$snackbarOffsetFromBottom = i8;
            this.$bottomBarHeight = num;
            this.$fabPlaceables = list5;
            this.$fabOffsetFromBottom = num2;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            List<Placeable> list = this.$bodyContentPlaceables;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                Placeable.PlacementScope.place$default(placementScope, list.get(i5), 0, 0, 0.0f, 4, null);
            }
            List<Placeable> list2 = this.$topBarPlaceables;
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Placeable.PlacementScope.place$default(placementScope, list2.get(i6), 0, 0, 0.0f, 4, null);
            }
            List<Placeable> list3 = this.$snackbarPlaceables;
            int i7 = this.$layoutWidth;
            int i8 = this.$snackbarWidth;
            WindowInsets windowInsets = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
            int i9 = this.$layoutHeight;
            int i10 = this.$snackbarOffsetFromBottom;
            int size3 = list3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                Placeable.PlacementScope.place$default(placementScope, list3.get(i11), ((i7 - i8) / 2) + windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), i9 - i10, 0.0f, 4, null);
            }
            List<Placeable> list4 = this.$bottomBarPlaceables;
            int i12 = this.$layoutHeight;
            Integer num = this.$bottomBarHeight;
            int size4 = list4.size();
            for (int i13 = 0; i13 < size4; i13++) {
                Placeable.PlacementScope.place$default(placementScope, list4.get(i13), 0, i12 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
            }
            FabPlacement fabPlacement = this.$fabPlacement;
            if (fabPlacement != null) {
                List<Placeable> list5 = this.$fabPlaceables;
                int i14 = this.$layoutHeight;
                Integer num2 = this.$fabOffsetFromBottom;
                int size5 = list5.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    Placeable placeable = list5.get(i15);
                    int left = fabPlacement.getLeft();
                    kotlin.jvm.internal.l0.m(num2);
                    Placeable.PlacementScope.place$default(placementScope, placeable, left, i14 - num2.intValue(), 0.0f, 4, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, int i5, WindowInsets windowInsets, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$topBar = pVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$fabPosition = i5;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = pVar4;
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m2114invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m2114invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        Object obj;
        int G;
        int i5;
        Object obj2;
        int G2;
        int i6;
        Object obj3;
        int G3;
        int i7;
        FabPlacement fabPlacement;
        Object obj4;
        int G4;
        Integer num;
        Integer num2;
        int i8;
        int bottom;
        float f5;
        int mo298roundToPx0680j_4;
        int bottom2;
        float f6;
        Object obj5;
        int G5;
        Object obj6;
        int G6;
        boolean m1879equalsimpl0;
        int i9;
        float f7;
        float f8;
        int mo298roundToPx0680j_42;
        float f9;
        float f10;
        boolean z4;
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, this.$topBar);
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size = subcompose.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(subcompose.get(i10).mo4998measureBRTryo0(m5991copyZbe2FdA$default));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int height = ((Placeable) obj).getHeight();
            G = kotlin.collections.w.G(arrayList);
            if (1 <= G) {
                int i11 = 1;
                while (true) {
                    Object obj7 = arrayList.get(i11);
                    int height2 = ((Placeable) obj7).getHeight();
                    if (height < height2) {
                        obj = obj7;
                        height = height2;
                    }
                    if (i11 == G) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        if (placeable != null) {
            i5 = placeable.getHeight();
        } else {
            i5 = 0;
        }
        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, this.$snackbar);
        WindowInsets windowInsets = this.$contentWindowInsets;
        ArrayList arrayList2 = new ArrayList(subcompose2.size());
        int size2 = subcompose2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.add(subcompose2.get(i12).mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(m5991copyZbe2FdA$default, (-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope))));
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int height3 = ((Placeable) obj2).getHeight();
            G2 = kotlin.collections.w.G(arrayList2);
            if (1 <= G2) {
                Object obj8 = obj2;
                int i13 = height3;
                int i14 = 1;
                while (true) {
                    Object obj9 = arrayList2.get(i14);
                    int height4 = ((Placeable) obj9).getHeight();
                    if (i13 < height4) {
                        obj8 = obj9;
                        i13 = height4;
                    }
                    if (i14 == G2) {
                        break;
                    }
                    i14++;
                }
                obj2 = obj8;
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        if (placeable2 != null) {
            i6 = placeable2.getHeight();
        } else {
            i6 = 0;
        }
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int width = ((Placeable) obj3).getWidth();
            G3 = kotlin.collections.w.G(arrayList2);
            if (1 <= G3) {
                Object obj10 = obj3;
                int i15 = width;
                int i16 = 1;
                while (true) {
                    Object obj11 = arrayList2.get(i16);
                    int width2 = ((Placeable) obj11).getWidth();
                    if (i15 < width2) {
                        obj10 = obj11;
                        i15 = width2;
                    }
                    if (i16 == G3) {
                        break;
                    }
                    i16++;
                }
                obj3 = obj10;
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        if (placeable3 != null) {
            i7 = placeable3.getWidth();
        } else {
            i7 = 0;
        }
        List<Measurable> subcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, this.$fab);
        WindowInsets windowInsets2 = this.$contentWindowInsets;
        ArrayList arrayList3 = new ArrayList(subcompose3.size());
        int size3 = subcompose3.size();
        int i17 = 0;
        while (i17 < size3) {
            List<Measurable> list = subcompose3;
            int i18 = size3;
            WindowInsets windowInsets3 = windowInsets2;
            Placeable mo4998measureBRTryo0 = subcompose3.get(i17).mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(m5991copyZbe2FdA$default, (-windowInsets2.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope)));
            if (mo4998measureBRTryo0.getHeight() != 0 && mo4998measureBRTryo0.getWidth() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                mo4998measureBRTryo0 = null;
            }
            if (mo4998measureBRTryo0 != null) {
                arrayList3.add(mo4998measureBRTryo0);
            }
            i17++;
            windowInsets2 = windowInsets3;
            subcompose3 = list;
            size3 = i18;
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.isEmpty()) {
                obj5 = null;
            } else {
                obj5 = arrayList3.get(0);
                int width3 = ((Placeable) obj5).getWidth();
                G5 = kotlin.collections.w.G(arrayList3);
                if (1 <= G5) {
                    int i19 = width3;
                    int i20 = 1;
                    while (true) {
                        Object obj12 = arrayList3.get(i20);
                        int width4 = ((Placeable) obj12).getWidth();
                        if (i19 < width4) {
                            obj5 = obj12;
                            i19 = width4;
                        }
                        if (i20 == G5) {
                            break;
                        }
                        i20++;
                    }
                }
            }
            kotlin.jvm.internal.l0.m(obj5);
            int width5 = ((Placeable) obj5).getWidth();
            if (arrayList3.isEmpty()) {
                obj6 = null;
            } else {
                obj6 = arrayList3.get(0);
                int height5 = ((Placeable) obj6).getHeight();
                G6 = kotlin.collections.w.G(arrayList3);
                if (1 <= G6) {
                    Object obj13 = obj6;
                    int i21 = height5;
                    int i22 = 1;
                    while (true) {
                        Object obj14 = arrayList3.get(i22);
                        Object obj15 = obj13;
                        int height6 = ((Placeable) obj14).getHeight();
                        if (i21 < height6) {
                            i21 = height6;
                            obj13 = obj14;
                        } else {
                            obj13 = obj15;
                        }
                        if (i22 == G6) {
                            break;
                        }
                        i22++;
                    }
                    obj6 = obj13;
                }
            }
            kotlin.jvm.internal.l0.m(obj6);
            int height7 = ((Placeable) obj6).getHeight();
            int i23 = this.$fabPosition;
            FabPosition.Companion companion = FabPosition.Companion;
            if (FabPosition.m1879equalsimpl0(i23, companion.m1886getStartERTFSPs())) {
                if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                    f10 = ScaffoldKt.FabSpacing;
                    i9 = subcomposeMeasureScope.mo298roundToPx0680j_4(f10);
                    fabPlacement = new FabPlacement(i9, width5, height7);
                } else {
                    f9 = ScaffoldKt.FabSpacing;
                    mo298roundToPx0680j_42 = subcomposeMeasureScope.mo298roundToPx0680j_4(f9);
                    i9 = (m6000getMaxWidthimpl - mo298roundToPx0680j_42) - width5;
                    fabPlacement = new FabPlacement(i9, width5, height7);
                }
            } else {
                if (FabPosition.m1879equalsimpl0(i23, companion.m1884getEndERTFSPs())) {
                    m1879equalsimpl0 = true;
                } else {
                    m1879equalsimpl0 = FabPosition.m1879equalsimpl0(i23, companion.m1885getEndOverlayERTFSPs());
                }
                if (m1879equalsimpl0) {
                    if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                        f8 = ScaffoldKt.FabSpacing;
                        mo298roundToPx0680j_42 = subcomposeMeasureScope.mo298roundToPx0680j_4(f8);
                        i9 = (m6000getMaxWidthimpl - mo298roundToPx0680j_42) - width5;
                    } else {
                        f7 = ScaffoldKt.FabSpacing;
                        i9 = subcomposeMeasureScope.mo298roundToPx0680j_4(f7);
                    }
                } else {
                    i9 = (m6000getMaxWidthimpl - width5) / 2;
                }
                fabPlacement = new FabPlacement(i9, width5, height7);
            }
        } else {
            fabPlacement = null;
        }
        List<Measurable> subcompose4 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(1843374446, true, new ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$bottomBarPlaceables$1(fabPlacement, this.$bottomBar)));
        ArrayList arrayList4 = new ArrayList(subcompose4.size());
        int size4 = subcompose4.size();
        for (int i24 = 0; i24 < size4; i24++) {
            arrayList4.add(subcompose4.get(i24).mo4998measureBRTryo0(m5991copyZbe2FdA$default));
        }
        if (arrayList4.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList4.get(0);
            int height8 = ((Placeable) obj4).getHeight();
            G4 = kotlin.collections.w.G(arrayList4);
            if (1 <= G4) {
                int i25 = 1;
                while (true) {
                    Object obj16 = arrayList4.get(i25);
                    Object obj17 = obj4;
                    int height9 = ((Placeable) obj16).getHeight();
                    if (height8 < height9) {
                        height8 = height9;
                        obj4 = obj16;
                    } else {
                        obj4 = obj17;
                    }
                    if (i25 == G4) {
                        break;
                    }
                    i25++;
                }
            }
        }
        Placeable placeable4 = (Placeable) obj4;
        if (placeable4 != null) {
            num = Integer.valueOf(placeable4.getHeight());
        } else {
            num = null;
        }
        if (fabPlacement != null) {
            int i26 = this.$fabPosition;
            WindowInsets windowInsets4 = this.$contentWindowInsets;
            if (num != null && !FabPosition.m1879equalsimpl0(i26, FabPosition.Companion.m1885getEndOverlayERTFSPs())) {
                mo298roundToPx0680j_4 = num.intValue() + fabPlacement.getHeight();
                f6 = ScaffoldKt.FabSpacing;
                bottom2 = subcomposeMeasureScope.mo298roundToPx0680j_4(f6);
            } else {
                int height10 = fabPlacement.getHeight();
                f5 = ScaffoldKt.FabSpacing;
                mo298roundToPx0680j_4 = height10 + subcomposeMeasureScope.mo298roundToPx0680j_4(f5);
                bottom2 = windowInsets4.getBottom(subcomposeMeasureScope);
            }
            num2 = Integer.valueOf(mo298roundToPx0680j_4 + bottom2);
        } else {
            num2 = null;
        }
        if (i6 != 0) {
            if (num2 != null) {
                bottom = num2.intValue();
            } else if (num != null) {
                bottom = num.intValue();
            } else {
                bottom = this.$contentWindowInsets.getBottom(subcomposeMeasureScope);
            }
            i8 = i6 + bottom;
        } else {
            i8 = 0;
        }
        int i27 = i7;
        FabPlacement fabPlacement2 = fabPlacement;
        List<Measurable> subcompose5 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(1655277373, true, new ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$bodyContentPlaceables$1(this.$contentWindowInsets, subcomposeMeasureScope, arrayList, i5, arrayList4, num, this.$content)));
        ArrayList arrayList5 = new ArrayList(subcompose5.size());
        int size5 = subcompose5.size();
        for (int i28 = 0; i28 < size5; i28++) {
            arrayList5.add(subcompose5.get(i28).mo4998measureBRTryo0(m5991copyZbe2FdA$default));
        }
        return MeasureScope.layout$default(subcomposeMeasureScope, m6000getMaxWidthimpl, m5999getMaxHeightimpl, null, new AnonymousClass1(arrayList5, arrayList, arrayList2, arrayList4, fabPlacement2, m6000getMaxWidthimpl, i27, this.$contentWindowInsets, subcomposeMeasureScope, m5999getMaxHeightimpl, i8, num, arrayList3, num2), 4, null);
    }
}
