package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.s0;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u000b\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Lkotlinx/coroutines/s0;", "scope", "Lkotlinx/coroutines/s0;", "getScope", "()Lkotlinx/coroutines/s0;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animatable", "Landroidx/compose/animation/core/Animatable;", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "initialOffset", "Ljava/lang/Integer;", "<init>", "(Lkotlinx/coroutines/s0;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,786:1\n151#2,3:787\n33#2,4:790\n154#2,2:794\n38#2:796\n156#2:797\n171#2,13:798\n151#2,3:811\n33#2,4:814\n154#2,2:818\n38#2:820\n156#2:821\n171#2,13:822\n171#2,13:835\n1#3:848\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy\n*L\n354#1:787,3\n354#1:790,4\n354#1:794,2\n354#1:796\n354#1:797\n355#1:798,13\n356#1:811,3\n356#1:814,4\n356#1:818,2\n356#1:820\n356#1:821\n357#1:822,13\n358#1:835,13\n*E\n"})
/* loaded from: classes.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;

    @p4.m
    private Animatable<Integer, AnimationVector1D> animatable;

    @p4.m
    private Integer initialOffset;

    @p4.l
    private final s0 scope;

    public SegmentedButtonContentMeasurePolicy(@p4.l s0 s0Var) {
        this.scope = s0Var;
    }

    @p4.m
    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    @p4.l
    public final s0 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1973measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends List<? extends Measurable>> list, long j5) {
        Object obj;
        int G;
        int i5;
        Object obj2;
        int G2;
        Integer num;
        Object obj3;
        int G3;
        int i6;
        float f5;
        int i7;
        int i8;
        float f6;
        List<? extends Measurable> list2 = list.get(0);
        int i9 = 1;
        List<? extends Measurable> list3 = list.get(1);
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list2.get(i10).mo4998measureBRTryo0(j5));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            G = kotlin.collections.w.G(arrayList);
            if (1 <= G) {
                int i11 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i11);
                    int width2 = ((Placeable) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
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
            i5 = placeable.getWidth();
        } else {
            i5 = 0;
        }
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.add(list3.get(i12).mo4998measureBRTryo0(j5));
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int width3 = ((Placeable) obj2).getWidth();
            G2 = kotlin.collections.w.G(arrayList2);
            if (1 <= G2) {
                int i13 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i13);
                    int width4 = ((Placeable) obj5).getWidth();
                    if (width3 < width4) {
                        obj2 = obj5;
                        width3 = width4;
                    }
                    if (i13 == G2) {
                        break;
                    }
                    i13++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        if (placeable2 != null) {
            num = Integer.valueOf(placeable2.getWidth());
        } else {
            num = null;
        }
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int height = ((Placeable) obj3).getHeight();
            G3 = kotlin.collections.w.G(arrayList2);
            if (1 <= G3) {
                while (true) {
                    Object obj6 = arrayList2.get(i9);
                    int height2 = ((Placeable) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i9 == G3) {
                        break;
                    }
                    i9++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        if (placeable3 != null) {
            i6 = placeable3.getHeight();
        } else {
            i6 = 0;
        }
        SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.INSTANCE;
        int max = Math.max(measureScope.mo298roundToPx0680j_4(segmentedButtonDefaults.m2151getIconSizeD9Ej5fM()), i5);
        f5 = SegmentedButtonKt.IconSpacing;
        int mo298roundToPx0680j_4 = max + measureScope.mo298roundToPx0680j_4(f5);
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        int i14 = mo298roundToPx0680j_4 + i7;
        if (i5 == 0) {
            int mo298roundToPx0680j_42 = measureScope.mo298roundToPx0680j_4(segmentedButtonDefaults.m2151getIconSizeD9Ej5fM());
            f6 = SegmentedButtonKt.IconSpacing;
            i8 = (-(mo298roundToPx0680j_42 + measureScope.mo298roundToPx0680j_4(f6))) / 2;
        } else {
            i8 = 0;
        }
        if (this.initialOffset == null) {
            this.initialOffset = Integer.valueOf(i8);
        } else {
            Animatable<Integer, AnimationVector1D> animatable = this.animatable;
            if (animatable == null) {
                Integer num2 = this.initialOffset;
                kotlin.jvm.internal.l0.m(num2);
                animatable = new Animatable<>(num2, VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.j0.f19410a), null, null, 12, null);
                this.animatable = animatable;
            }
            if (animatable.getTargetValue().intValue() != i8) {
                kotlinx.coroutines.k.f(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i8, null), 3, null);
            }
        }
        return MeasureScope.layout$default(measureScope, i14, i6, null, new SegmentedButtonContentMeasurePolicy$measure$2(arrayList, measureScope, this, i8, arrayList2, i6), 4, null);
    }

    public final void setAnimatable(@p4.m Animatable<Integer, AnimationVector1D> animatable) {
        this.animatable = animatable;
    }
}
