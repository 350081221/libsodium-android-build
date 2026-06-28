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
/* loaded from: classes.dex */
public final class ScaffoldKt$LegacyScaffoldLayout$1$1 extends kotlin.jvm.internal.n0 implements v3.p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ v3.p<Composer, Integer, r2> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ v3.p<Composer, Integer, r2> $snackbar;
    final /* synthetic */ v3.p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$LegacyScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,598:1\n151#2,3:599\n33#2,4:602\n154#2,2:606\n38#2:608\n156#2:609\n171#2,13:610\n151#2,3:623\n33#2,4:626\n154#2,2:630\n38#2:632\n156#2:633\n171#2,13:634\n171#2,13:647\n416#2,3:660\n33#2,4:663\n419#2:667\n420#2:670\n38#2:671\n421#2:672\n171#2,13:673\n171#2,13:686\n151#2,3:699\n33#2,4:702\n154#2,2:706\n38#2:708\n156#2:709\n171#2,13:710\n151#2,3:723\n33#2,4:726\n154#2,2:730\n38#2:732\n156#2:733\n33#2,6:734\n33#2,6:740\n33#2,6:746\n33#2,6:752\n33#2,6:758\n1#3:668\n1#3:669\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$LegacyScaffoldLayout$1$1$1\n*L\n356#1:599,3\n356#1:602,4\n356#1:606,2\n356#1:608\n356#1:609\n360#1:610,13\n362#1:623,3\n362#1:626,4\n362#1:630,2\n362#1:632\n362#1:633\n378#1:634,13\n379#1:647,13\n382#1:660,3\n382#1:663,4\n382#1:667\n382#1:670\n382#1:671\n382#1:672\n399#1:673,13\n400#1:686,13\n434#1:699,3\n434#1:702,4\n434#1:706,2\n434#1:708\n434#1:709\n436#1:710,13\n475#1:723,3\n475#1:726,4\n475#1:730,2\n475#1:732\n475#1:733\n478#1:734,6\n481#1:740,6\n484#1:746,6\n492#1:752,6\n497#1:758,6\n382#1:669\n*E\n"})
    /* renamed from: androidx.compose.material3.ScaffoldKt$LegacyScaffoldLayout$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ v3.p<Composer, Integer, r2> $bottomBar;
        final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $content;
        final /* synthetic */ WindowInsets $contentWindowInsets;
        final /* synthetic */ v3.p<Composer, Integer, r2> $fab;
        final /* synthetic */ int $fabPosition;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ long $looseConstraints;
        final /* synthetic */ v3.p<Composer, Integer, r2> $snackbar;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ v3.p<Composer, Integer, r2> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(SubcomposeMeasureScope subcomposeMeasureScope, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, int i5, int i6, WindowInsets windowInsets, long j5, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, int i7) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = pVar;
            this.$snackbar = pVar2;
            this.$fab = pVar3;
            this.$fabPosition = i5;
            this.$layoutWidth = i6;
            this.$contentWindowInsets = windowInsets;
            this.$looseConstraints = j5;
            this.$bottomBar = pVar4;
            this.$content = qVar;
            this.$layoutHeight = i7;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            Object obj;
            int G;
            Object obj2;
            int G2;
            Object obj3;
            int G3;
            FabPlacement fabPlacement;
            int i5;
            Object obj4;
            int G4;
            Integer num;
            int i6;
            int intValue;
            float f5;
            int mo298roundToPx0680j_4;
            float f6;
            Object obj5;
            int G5;
            Object obj6;
            int G6;
            int i7;
            float f7;
            int i8;
            float f8;
            int mo298roundToPx0680j_42;
            float f9;
            float f10;
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, this.$topBar);
            long j5 = this.$looseConstraints;
            ArrayList arrayList = new ArrayList(subcompose.size());
            int size = subcompose.size();
            for (int i9 = 0; i9 < size; i9++) {
                arrayList.add(subcompose.get(i9).mo4998measureBRTryo0(j5));
            }
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int height = ((Placeable) obj).getHeight();
                G = kotlin.collections.w.G(arrayList);
                if (1 <= G) {
                    int i10 = 1;
                    while (true) {
                        Object obj7 = arrayList.get(i10);
                        int height2 = ((Placeable) obj7).getHeight();
                        if (height < height2) {
                            obj = obj7;
                            height = height2;
                        }
                        if (i10 == G) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            Placeable placeable = (Placeable) obj;
            int height3 = placeable != null ? placeable.getHeight() : 0;
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, this.$snackbar);
            WindowInsets windowInsets = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
            long j6 = this.$looseConstraints;
            ArrayList arrayList2 = new ArrayList(subcompose2.size());
            int size2 = subcompose2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(subcompose2.get(i11).mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(j6, (-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope))));
            }
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int height4 = ((Placeable) obj2).getHeight();
                G2 = kotlin.collections.w.G(arrayList2);
                if (1 <= G2) {
                    int i12 = 1;
                    while (true) {
                        Object obj8 = arrayList2.get(i12);
                        int height5 = ((Placeable) obj8).getHeight();
                        if (height4 < height5) {
                            obj2 = obj8;
                            height4 = height5;
                        }
                        if (i12 == G2) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            Placeable placeable2 = (Placeable) obj2;
            int height6 = placeable2 != null ? placeable2.getHeight() : 0;
            if (arrayList2.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList2.get(0);
                int width = ((Placeable) obj3).getWidth();
                G3 = kotlin.collections.w.G(arrayList2);
                if (1 <= G3) {
                    int i13 = 1;
                    while (true) {
                        Object obj9 = arrayList2.get(i13);
                        int width2 = ((Placeable) obj9).getWidth();
                        if (width < width2) {
                            obj3 = obj9;
                            width = width2;
                        }
                        if (i13 == G3) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            Placeable placeable3 = (Placeable) obj3;
            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
            List<Measurable> subcompose3 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, this.$fab);
            WindowInsets windowInsets2 = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope2 = this.$this_SubcomposeLayout;
            long j7 = this.$looseConstraints;
            ArrayList arrayList3 = new ArrayList(subcompose3.size());
            int size3 = subcompose3.size();
            int i14 = 0;
            while (i14 < size3) {
                List<Measurable> list = subcompose3;
                int i15 = size3;
                WindowInsets windowInsets3 = windowInsets2;
                Placeable mo4998measureBRTryo0 = subcompose3.get(i14).mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(j7, (-windowInsets2.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope2)));
                if (!((mo4998measureBRTryo0.getHeight() == 0 || mo4998measureBRTryo0.getWidth() == 0) ? false : true)) {
                    mo4998measureBRTryo0 = null;
                }
                if (mo4998measureBRTryo0 != null) {
                    arrayList3.add(mo4998measureBRTryo0);
                }
                i14++;
                windowInsets2 = windowInsets3;
                subcompose3 = list;
                size3 = i15;
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int width4 = ((Placeable) obj5).getWidth();
                    G5 = kotlin.collections.w.G(arrayList3);
                    if (1 <= G5) {
                        int i16 = 1;
                        while (true) {
                            Object obj10 = arrayList3.get(i16);
                            int width5 = ((Placeable) obj10).getWidth();
                            if (width4 < width5) {
                                obj5 = obj10;
                                width4 = width5;
                            }
                            if (i16 == G5) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                    }
                }
                kotlin.jvm.internal.l0.m(obj5);
                int width6 = ((Placeable) obj5).getWidth();
                if (arrayList3.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList3.get(0);
                    int height7 = ((Placeable) obj6).getHeight();
                    G6 = kotlin.collections.w.G(arrayList3);
                    if (1 <= G6) {
                        int i17 = 1;
                        while (true) {
                            Object obj11 = arrayList3.get(i17);
                            int height8 = ((Placeable) obj11).getHeight();
                            if (height7 < height8) {
                                obj6 = obj11;
                                height7 = height8;
                            }
                            if (i17 == G6) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                kotlin.jvm.internal.l0.m(obj6);
                int height9 = ((Placeable) obj6).getHeight();
                int i18 = this.$fabPosition;
                FabPosition.Companion companion = FabPosition.Companion;
                if (FabPosition.m1879equalsimpl0(i18, companion.m1886getStartERTFSPs())) {
                    if (this.$this_SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr) {
                        SubcomposeMeasureScope subcomposeMeasureScope3 = this.$this_SubcomposeLayout;
                        f10 = ScaffoldKt.FabSpacing;
                        i7 = subcomposeMeasureScope3.mo298roundToPx0680j_4(f10);
                        fabPlacement = new FabPlacement(i7, width6, height9);
                    } else {
                        i8 = this.$layoutWidth;
                        SubcomposeMeasureScope subcomposeMeasureScope4 = this.$this_SubcomposeLayout;
                        f9 = ScaffoldKt.FabSpacing;
                        mo298roundToPx0680j_42 = subcomposeMeasureScope4.mo298roundToPx0680j_4(f9);
                        i7 = (i8 - mo298roundToPx0680j_42) - width6;
                        fabPlacement = new FabPlacement(i7, width6, height9);
                    }
                } else {
                    if (FabPosition.m1879equalsimpl0(i18, companion.m1884getEndERTFSPs())) {
                        if (this.$this_SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr) {
                            i8 = this.$layoutWidth;
                            SubcomposeMeasureScope subcomposeMeasureScope5 = this.$this_SubcomposeLayout;
                            f8 = ScaffoldKt.FabSpacing;
                            mo298roundToPx0680j_42 = subcomposeMeasureScope5.mo298roundToPx0680j_4(f8);
                            i7 = (i8 - mo298roundToPx0680j_42) - width6;
                        } else {
                            SubcomposeMeasureScope subcomposeMeasureScope6 = this.$this_SubcomposeLayout;
                            f7 = ScaffoldKt.FabSpacing;
                            i7 = subcomposeMeasureScope6.mo298roundToPx0680j_4(f7);
                        }
                    } else {
                        i7 = (this.$layoutWidth - width6) / 2;
                    }
                    fabPlacement = new FabPlacement(i7, width6, height9);
                }
            } else {
                fabPlacement = null;
            }
            List<Measurable> subcompose4 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-791102355, true, new ScaffoldKt$LegacyScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, this.$bottomBar)));
            long j8 = this.$looseConstraints;
            ArrayList arrayList4 = new ArrayList(subcompose4.size());
            int size4 = subcompose4.size();
            for (int i19 = 0; i19 < size4; i19++) {
                arrayList4.add(subcompose4.get(i19).mo4998measureBRTryo0(j8));
            }
            if (arrayList4.isEmpty()) {
                obj4 = null;
                i5 = 0;
            } else {
                i5 = 0;
                obj4 = arrayList4.get(0);
                int height10 = ((Placeable) obj4).getHeight();
                G4 = kotlin.collections.w.G(arrayList4);
                if (1 <= G4) {
                    int i20 = height10;
                    Object obj12 = obj4;
                    int i21 = 1;
                    while (true) {
                        Object obj13 = arrayList4.get(i21);
                        int height11 = ((Placeable) obj13).getHeight();
                        if (i20 < height11) {
                            obj12 = obj13;
                            i20 = height11;
                        }
                        if (i21 == G4) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                    obj4 = obj12;
                }
            }
            Placeable placeable4 = (Placeable) obj4;
            Integer valueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
            if (fabPlacement != null) {
                SubcomposeMeasureScope subcomposeMeasureScope7 = this.$this_SubcomposeLayout;
                WindowInsets windowInsets4 = this.$contentWindowInsets;
                if (valueOf == null) {
                    int height12 = fabPlacement.getHeight();
                    f6 = ScaffoldKt.FabSpacing;
                    mo298roundToPx0680j_4 = height12 + subcomposeMeasureScope7.mo298roundToPx0680j_4(f6) + windowInsets4.getBottom(subcomposeMeasureScope7);
                } else {
                    int intValue2 = valueOf.intValue() + fabPlacement.getHeight();
                    f5 = ScaffoldKt.FabSpacing;
                    mo298roundToPx0680j_4 = intValue2 + subcomposeMeasureScope7.mo298roundToPx0680j_4(f5);
                }
                num = Integer.valueOf(mo298roundToPx0680j_4);
            } else {
                num = null;
            }
            if (height6 != 0) {
                if (num != null) {
                    intValue = num.intValue();
                } else {
                    intValue = valueOf != null ? valueOf.intValue() : this.$contentWindowInsets.getBottom(this.$this_SubcomposeLayout);
                }
                i6 = height6 + intValue;
            } else {
                i6 = i5;
            }
            SubcomposeMeasureScope subcomposeMeasureScope8 = this.$this_SubcomposeLayout;
            FabPlacement fabPlacement2 = fabPlacement;
            ArrayList arrayList5 = arrayList4;
            int i22 = i5;
            List<Measurable> subcompose5 = subcomposeMeasureScope8.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(495329982, true, new ScaffoldKt$LegacyScaffoldLayout$1$1$1$bodyContentPlaceables$1(this.$contentWindowInsets, subcomposeMeasureScope8, arrayList, height3, arrayList4, valueOf, this.$content)));
            long j9 = this.$looseConstraints;
            ArrayList arrayList6 = new ArrayList(subcompose5.size());
            int size5 = subcompose5.size();
            for (int i23 = i22; i23 < size5; i23++) {
                arrayList6.add(subcompose5.get(i23).mo4998measureBRTryo0(j9));
            }
            int size6 = arrayList6.size();
            for (int i24 = i22; i24 < size6; i24++) {
                Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList6.get(i24), 0, 0, 0.0f, 4, null);
            }
            int size7 = arrayList.size();
            for (int i25 = i22; i25 < size7; i25++) {
                Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList.get(i25), 0, 0, 0.0f, 4, null);
            }
            int i26 = this.$layoutWidth;
            WindowInsets windowInsets5 = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope9 = this.$this_SubcomposeLayout;
            int i27 = this.$layoutHeight;
            int size8 = arrayList2.size();
            for (int i28 = i22; i28 < size8; i28++) {
                Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList2.get(i28), ((i26 - width3) / 2) + windowInsets5.getLeft(subcomposeMeasureScope9, subcomposeMeasureScope9.getLayoutDirection()), i27 - i6, 0.0f, 4, null);
            }
            int i29 = this.$layoutHeight;
            int size9 = arrayList5.size();
            int i30 = i22;
            while (i30 < size9) {
                ArrayList arrayList7 = arrayList5;
                Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList7.get(i30), 0, i29 - (valueOf != null ? valueOf.intValue() : i22), 0.0f, 4, null);
                i30++;
                arrayList5 = arrayList7;
            }
            if (fabPlacement2 != null) {
                int i31 = this.$layoutHeight;
                int size10 = arrayList3.size();
                for (int i32 = i22; i32 < size10; i32++) {
                    Placeable placeable5 = (Placeable) arrayList3.get(i32);
                    int left = fabPlacement2.getLeft();
                    kotlin.jvm.internal.l0.m(num);
                    Placeable.PlacementScope.place$default(placementScope, placeable5, left, i31 - num.intValue(), 0.0f, 4, null);
                }
                r2 r2Var = r2.f19517a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$LegacyScaffoldLayout$1$1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, int i5, WindowInsets windowInsets, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar) {
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
        return m2113invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m2113invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
        return MeasureScope.layout$default(subcomposeMeasureScope, m6000getMaxWidthimpl, m5999getMaxHeightimpl, null, new AnonymousClass1(subcomposeMeasureScope, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m6000getMaxWidthimpl, this.$contentWindowInsets, Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$content, m5999getMaxHeightimpl), 4, null);
    }
}
