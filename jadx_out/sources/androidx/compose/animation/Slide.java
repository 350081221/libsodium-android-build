package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B8\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J>\u0010\r\u001a\u00020\u00002#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R2\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/Slide;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/v0;", "name", "fullSize", "Landroidx/compose/ui/unit/IntOffset;", "component1", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "component2", "slideOffset", "animationSpec", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Lv3/l;", "getSlideOffset", "()Lv3/l;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "<init>", "(Lv3/l;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class Slide {
    public static final int $stable = 0;

    @l
    private final FiniteAnimationSpec<IntOffset> animationSpec;

    @l
    private final v3.l<IntSize, IntOffset> slideOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(@l v3.l<? super IntSize, IntOffset> lVar, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.slideOffset = lVar;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide copy$default(Slide slide, v3.l lVar, FiniteAnimationSpec finiteAnimationSpec, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = slide.slideOffset;
        }
        if ((i5 & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(lVar, finiteAnimationSpec);
    }

    @l
    public final v3.l<IntSize, IntOffset> component1() {
        return this.slideOffset;
    }

    @l
    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    @l
    public final Slide copy(@l v3.l<? super IntSize, IntOffset> lVar, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return new Slide(lVar, finiteAnimationSpec);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return l0.g(this.slideOffset, slide.slideOffset) && l0.g(this.animationSpec, slide.animationSpec);
    }

    @l
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    @l
    public final v3.l<IntSize, IntOffset> getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    @l
    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
