package androidx.compose.foundation;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.i0;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a.\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", t0.b.f22420d, "Lkotlin/ranges/f;", "valueRange", "", "steps", "progressSemantics", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    @Stable
    @p4.l
    public static final Modifier progressSemantics(@p4.l Modifier modifier, float f5, @p4.l kotlin.ranges.f<Float> fVar, @IntRange(from = 0) int i5) {
        return SemanticsModifierKt.semantics(modifier, true, new ProgressSemanticsKt$progressSemantics$1(f5, fVar, i5));
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f5, kotlin.ranges.f fVar, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            fVar = kotlin.ranges.t.e(0.0f, 1.0f);
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return progressSemantics(modifier, f5, fVar, i5);
    }

    @Stable
    @p4.l
    public static final Modifier progressSemantics(@p4.l Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, ProgressSemanticsKt$progressSemantics$2.INSTANCE);
    }
}
