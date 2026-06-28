package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aV\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\u0010*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "initialValue", "targetValue", "Lkotlin/r2;", "finishedListener", "animateContentSize", "InvalidSize", "J", "getInvalidSize", "()J", "", "isValid-ozmzZPI", "(J)Z", "isValid", "animation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationModifierKt {
    private static final long InvalidSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);

    @l
    public static final Modifier animateContentSize(@l Modifier modifier, @l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @m p<? super IntSize, ? super IntSize, r2> pVar) {
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec, pVar));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        return animateContentSize(modifier, finiteAnimationSpec, pVar);
    }

    public static final long getInvalidSize() {
        return InvalidSize;
    }

    /* renamed from: isValid-ozmzZPI, reason: not valid java name */
    public static final boolean m60isValidozmzZPI(long j5) {
        return !IntSize.m6212equalsimpl0(j5, InvalidSize);
    }
}
