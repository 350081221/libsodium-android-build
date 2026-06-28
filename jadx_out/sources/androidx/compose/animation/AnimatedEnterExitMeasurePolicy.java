package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J,\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "scope", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V", "getScope", "()Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,919:1\n151#2,3:920\n33#2,4:923\n154#2,2:927\n38#2:929\n156#2:930\n171#2,13:931\n171#2,13:944\n317#2,8:957\n317#2,8:965\n317#2,8:973\n317#2,8:981\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n851#1:920,3\n851#1:923,4\n851#1:927,2\n851#1:929\n851#1:930\n852#1:931,13\n853#1:944,13\n866#1:957,8\n871#1:965,8\n876#1:973,8\n881#1:981,8\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {

    @l
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(@l AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.scope = animatedVisibilityScopeImpl;
    }

    @l
    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
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
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v20 */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
        Object obj;
        int G;
        int i5;
        int G2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(list.get(i7).mo4998measureBRTryo0(j5));
        }
        Placeable placeable = null;
        int i8 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            G = w.G(arrayList);
            if (1 <= G) {
                int i9 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i9);
                    int width2 = ((Placeable) obj2).getWidth();
                    if (width < width2) {
                        obj = obj2;
                        width = width2;
                    }
                    if (i9 == G) {
                        break;
                    }
                    i9++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj;
        if (placeable2 != null) {
            i5 = placeable2.getWidth();
        } else {
            i5 = 0;
        }
        if (!arrayList.isEmpty()) {
            ?? r12 = arrayList.get(0);
            int height = ((Placeable) r12).getHeight();
            G2 = w.G(arrayList);
            boolean z4 = r12;
            if (1 <= G2) {
                while (true) {
                    Object obj3 = arrayList.get(i8);
                    int height2 = ((Placeable) obj3).getHeight();
                    r12 = z4;
                    if (height < height2) {
                        r12 = obj3;
                        height = height2;
                    }
                    if (i8 == G2) {
                        break;
                    }
                    i8++;
                    z4 = r12;
                }
            }
            placeable = r12;
        }
        Placeable placeable3 = placeable;
        if (placeable3 != null) {
            i6 = placeable3.getHeight();
        }
        int i10 = i6;
        this.scope.getTargetSize$animation_release().setValue(IntSize.m6206boximpl(IntSizeKt.IntSize(i5, i10)));
        return MeasureScope.layout$default(measureScope, i5, i10, null, new AnimatedEnterExitMeasurePolicy$measure$1(arrayList), 4, null);
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
