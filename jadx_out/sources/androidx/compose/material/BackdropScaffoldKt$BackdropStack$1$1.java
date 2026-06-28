package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;
import v3.p;
import v3.r;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,524:1\n151#2,3:525\n33#2,4:528\n154#2,2:532\n38#2:534\n156#2:535\n33#2,6:536\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1\n*L\n470#1:525,3\n470#1:528,4\n470#1:532,2\n470#1:534\n470#1:535\n474#1:536,6\n*E\n"})
/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropStack$1$1 extends n0 implements p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ p<Composer, Integer, r2> $backLayer;
    final /* synthetic */ l<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ r<Constraints, Float, Composer, Integer, r2> $frontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,524:1\n33#2,6:525\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1$2\n*L\n481#1:525,6\n*E\n"})
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<Placeable.PlacementScope, r2> {
        final /* synthetic */ Placeable $backLayerPlaceable;
        final /* synthetic */ List<Placeable> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Placeable placeable, List<? extends Placeable> list) {
            super(1);
            this.$backLayerPlaceable = placeable;
            this.$placeables = list;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$backLayerPlaceable, 0, 0, 0.0f, 4, null);
            List<Placeable> list = this.$placeables;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i5), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropStack$1$1(p<? super Composer, ? super Integer, r2> pVar, l<? super Constraints, Constraints> lVar, r<? super Constraints, ? super Float, ? super Composer, ? super Integer, r2> rVar) {
        super(2);
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$frontLayer = rVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1216invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1216invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        Object y22;
        y22 = e0.y2(subcomposeMeasureScope.subcompose(BackdropLayers.Back, this.$backLayer));
        Placeable mo4998measureBRTryo0 = ((Measurable) y22).mo4998measureBRTryo0(this.$calculateBackLayerConstraints.invoke(Constraints.m5988boximpl(j5)).m6006unboximpl());
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(BackdropLayers.Front, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new BackdropScaffoldKt$BackdropStack$1$1$placeables$1(this.$frontLayer, j5, mo4998measureBRTryo0.getHeight())));
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size = subcompose.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(subcompose.get(i5).mo4998measureBRTryo0(j5));
        }
        int max = Math.max(Constraints.m6002getMinWidthimpl(j5), mo4998measureBRTryo0.getWidth());
        int max2 = Math.max(Constraints.m6001getMinHeightimpl(j5), mo4998measureBRTryo0.getHeight());
        int size2 = arrayList.size();
        int i6 = max2;
        int i7 = max;
        for (int i8 = 0; i8 < size2; i8++) {
            Placeable placeable = (Placeable) arrayList.get(i8);
            i7 = Math.max(i7, placeable.getWidth());
            i6 = Math.max(i6, placeable.getHeight());
        }
        return MeasureScope.layout$default(subcomposeMeasureScope, i7, i6, null, new AnonymousClass2(mo4998measureBRTryo0, arrayList), 4, null);
    }
}
