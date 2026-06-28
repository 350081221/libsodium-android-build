package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,436:1\n151#2,3:437\n33#2,4:440\n154#2,2:444\n38#2:446\n156#2:447\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1\n*L\n178#1:437,3\n178#1:440,4\n178#1:444,2\n178#1:446\n178#1:447\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopup_androidKt$SimpleStack$1 implements MeasurePolicy {
    public static final ExposedDropdownMenuPopup_androidKt$SimpleStack$1 INSTANCE = new ExposedDropdownMenuPopup_androidKt$SimpleStack$1();

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1\n*L\n1#1,436:1\n*E\n"})
    /* renamed from: androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$2\n*L\n1#1,436:1\n*E\n"})
    /* renamed from: androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<Placeable.PlacementScope, r2> {
        final /* synthetic */ Placeable $p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Placeable placeable) {
            super(1);
            this.$p = placeable;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$p, 0, 0, 0.0f, 4, null);
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$3\n*L\n1#1,436:1\n*E\n"})
    /* renamed from: androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends n0 implements l<Placeable.PlacementScope, r2> {
        final /* synthetic */ List<Placeable> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends Placeable> list) {
            super(1);
            this.$placeables = list;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            int G;
            G = w.G(this.$placeables);
            if (G < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeables.get(i5), 0, 0, 0.0f, 4, null);
                if (i5 == G) {
                    return;
                } else {
                    i5++;
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @p4.l
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
        int G;
        int i5;
        int i6;
        int size = list.size();
        if (size != 0) {
            int i7 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    arrayList.add(list.get(i8).mo4998measureBRTryo0(j5));
                }
                G = w.G(arrayList);
                if (G >= 0) {
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        Placeable placeable = (Placeable) arrayList.get(i7);
                        i9 = Math.max(i9, placeable.getWidth());
                        i10 = Math.max(i10, placeable.getHeight());
                        if (i7 == G) {
                            break;
                        }
                        i7++;
                    }
                    i5 = i9;
                    i6 = i10;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                return MeasureScope.layout$default(measureScope, i5, i6, null, new AnonymousClass3(arrayList), 4, null);
            }
            Placeable mo4998measureBRTryo0 = list.get(0).mo4998measureBRTryo0(j5);
            return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new AnonymousClass2(mo4998measureBRTryo0), 4, null);
        }
        return MeasureScope.layout$default(measureScope, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
    }
}
