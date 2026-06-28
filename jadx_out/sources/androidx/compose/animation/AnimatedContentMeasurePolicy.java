package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.collections.p;
import kotlin.collections.s0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J,\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,831:1\n69#2,6:832\n69#2,6:838\n317#2,8:872\n317#2,8:880\n317#2,8:888\n317#2,8:896\n14166#3,14:844\n14166#3,14:858\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n783#1:832,6\n792#1:838,6\n817#1:872,8\n821#1:880,8\n825#1:888,8\n829#1:896,8\n797#1:844,14\n798#1:858,14\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    @l
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(@l AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    @l
    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        Integer valueOf;
        int G;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i5));
            G = w.G(list);
            int i6 = 1;
            if (1 <= G) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i6).maxIntrinsicHeight(i5));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i6 == G) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Integer num = valueOf;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        Integer valueOf;
        int G;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i5));
            G = w.G(list);
            int i6 = 1;
            if (1 <= G) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i6).maxIntrinsicWidth(i5));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i6 == G) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Integer num = valueOf;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    @l
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
        Placeable placeable;
        Object[] objArr;
        Placeable placeable2;
        int we;
        int i5;
        int i6;
        int i7;
        Object[] objArr2;
        int we2;
        int i8;
        int i9;
        int size = list.size();
        Placeable[] placeableArr = new Placeable[size];
        int size2 = list.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            placeable = null;
            AnimatedContentTransitionScopeImpl.ChildData childData = null;
            boolean z4 = true;
            if (i11 >= size2) {
                break;
            }
            Measurable measurable = list.get(i11);
            Object parentData = measurable.getParentData();
            if (parentData instanceof AnimatedContentTransitionScopeImpl.ChildData) {
                childData = (AnimatedContentTransitionScopeImpl.ChildData) parentData;
            }
            if (childData == null || !childData.isTarget()) {
                z4 = false;
            }
            if (z4) {
                placeableArr[i11] = measurable.mo4998measureBRTryo0(j5);
            }
            i11++;
        }
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Measurable measurable2 = list.get(i12);
            if (placeableArr[i12] == null) {
                placeableArr[i12] = measurable2.mo4998measureBRTryo0(j5);
            }
        }
        if (size == 0) {
            objArr = true;
        } else {
            objArr = false;
        }
        if (objArr != false) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            we = p.we(placeableArr);
            if (we != 0) {
                if (placeable2 != null) {
                    i5 = placeable2.getWidth();
                } else {
                    i5 = 0;
                }
                s0 it = new kotlin.ranges.l(1, we).iterator();
                while (it.hasNext()) {
                    Placeable placeable3 = placeableArr[it.nextInt()];
                    if (placeable3 != null) {
                        i6 = placeable3.getWidth();
                    } else {
                        i6 = 0;
                    }
                    if (i5 < i6) {
                        placeable2 = placeable3;
                        i5 = i6;
                    }
                }
            }
        }
        if (placeable2 != null) {
            i7 = placeable2.getWidth();
        } else {
            i7 = 0;
        }
        if (size == 0) {
            objArr2 = true;
        } else {
            objArr2 = false;
        }
        if (objArr2 == false) {
            placeable = placeableArr[0];
            we2 = p.we(placeableArr);
            if (we2 != 0) {
                if (placeable != null) {
                    i8 = placeable.getHeight();
                } else {
                    i8 = 0;
                }
                s0 it2 = new kotlin.ranges.l(1, we2).iterator();
                while (it2.hasNext()) {
                    Placeable placeable4 = placeableArr[it2.nextInt()];
                    if (placeable4 != null) {
                        i9 = placeable4.getHeight();
                    } else {
                        i9 = 0;
                    }
                    if (i8 < i9) {
                        placeable = placeable4;
                        i8 = i9;
                    }
                }
            }
        }
        if (placeable != null) {
            i10 = placeable.getHeight();
        }
        int i13 = i10;
        this.rootScope.m55setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(i7, i13));
        return MeasureScope.layout$default(measureScope, i7, i13, null, new AnimatedContentMeasurePolicy$measure$3(placeableArr, this, i7, i13), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        Integer valueOf;
        int G;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i5));
            G = w.G(list);
            int i6 = 1;
            if (1 <= G) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i6).minIntrinsicHeight(i5));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i6 == G) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Integer num = valueOf;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        Integer valueOf;
        int G;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i5));
            G = w.G(list);
            int i6 = 1;
            if (1 <= G) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i6).minIntrinsicWidth(i5));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i6 == G) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Integer num = valueOf;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
