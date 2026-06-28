package androidx.compose.material3.carousel;

import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a0\u0010\u0000\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"lerp", "Landroidx/compose/material3/carousel/Keyline;", "start", "end", "fraction", "", "Landroidx/compose/material3/carousel/KeylineList;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "outputMin", "outputMax", "inputMin", "inputMax", b.f22420d, "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,509:1\n277#2,3:510\n69#2,4:513\n280#2,2:517\n74#2:519\n282#2:520\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n*L\n488#1:510,3\n488#1:513,4\n488#1:517,2\n488#1:519\n488#1:520\n*E\n"})
/* loaded from: classes.dex */
public final class StrategyKt {
    @l
    @VisibleForTesting
    public static final Keyline lerp(@l Keyline keyline, @l Keyline keyline2, float f5) {
        return new Keyline(MathHelpersKt.lerp(keyline.getSize(), keyline2.getSize(), f5), MathHelpersKt.lerp(keyline.getOffset(), keyline2.getOffset(), f5), MathHelpersKt.lerp(keyline.getUnadjustedOffset(), keyline2.getUnadjustedOffset(), f5), f5 < 0.5f ? keyline.isFocal() : keyline2.isFocal(), f5 < 0.5f ? keyline.isAnchor() : keyline2.isAnchor(), f5 < 0.5f ? keyline.isPivot() : keyline2.isPivot(), MathHelpersKt.lerp(keyline.getCutoff(), keyline2.getCutoff(), f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lerp(float f5, float f6, float f7, float f8, float f9) {
        return f9 <= f7 ? f5 : f9 >= f8 ? f6 : MathHelpersKt.lerp(f5, f6, (f9 - f7) / (f8 - f7));
    }

    @l
    @VisibleForTesting
    public static final KeylineList lerp(@l KeylineList keylineList, @l KeylineList keylineList2, float f5) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(lerp(keylineList.get(i5), keylineList2.get(i5), f5));
        }
        return new KeylineList(arrayList);
    }
}
