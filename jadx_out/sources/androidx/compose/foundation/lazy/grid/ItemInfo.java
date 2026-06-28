package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR4\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/ItemInfo;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "positionedItem", "Lkotlinx/coroutines/s0;", "coroutineScope", "Lkotlin/r2;", "updateAnimation", "", "crossAxisSize", "I", "getCrossAxisSize", "()I", "setCrossAxisSize", "(I)V", "crossAxisOffset", "getCrossAxisOffset", "setCrossAxisOffset", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "<set-?>", "animations", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "<init>", "(II)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ItemInfo {

    @l
    private LazyLayoutAnimation[] animations;
    private int crossAxisOffset;
    private int crossAxisSize;

    public ItemInfo(int i5, int i6) {
        LazyLayoutAnimation[] lazyLayoutAnimationArr;
        this.crossAxisSize = i5;
        this.crossAxisOffset = i6;
        lazyLayoutAnimationArr = LazyGridItemPlacementAnimatorKt.EmptyArray;
        this.animations = lazyLayoutAnimationArr;
    }

    @l
    public final LazyLayoutAnimation[] getAnimations() {
        return this.animations;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final void setCrossAxisOffset(int i5) {
        this.crossAxisOffset = i5;
    }

    public final void setCrossAxisSize(int i5) {
        this.crossAxisSize = i5;
    }

    public final void updateAnimation(@l LazyGridMeasuredItem lazyGridMeasuredItem, @l s0 s0Var) {
        LazyLayoutAnimationSpecsNode specs;
        int length = this.animations.length;
        for (int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
            LazyLayoutAnimation lazyLayoutAnimation = this.animations[placeablesCount];
            if (lazyLayoutAnimation != null) {
                lazyLayoutAnimation.stopAnimations();
            }
        }
        if (this.animations.length != lazyGridMeasuredItem.getPlaceablesCount()) {
            Object[] copyOf = Arrays.copyOf(this.animations, lazyGridMeasuredItem.getPlaceablesCount());
            l0.o(copyOf, "copyOf(this, newSize)");
            this.animations = (LazyLayoutAnimation[]) copyOf;
        }
        int placeablesCount2 = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i5 = 0; i5 < placeablesCount2; i5++) {
            specs = LazyGridItemPlacementAnimatorKt.getSpecs(lazyGridMeasuredItem.getParentData(i5));
            if (specs == null) {
                LazyLayoutAnimation lazyLayoutAnimation2 = this.animations[i5];
                if (lazyLayoutAnimation2 != null) {
                    lazyLayoutAnimation2.stopAnimations();
                }
                this.animations[i5] = null;
            } else {
                LazyLayoutAnimation lazyLayoutAnimation3 = this.animations[i5];
                if (lazyLayoutAnimation3 == null) {
                    lazyLayoutAnimation3 = new LazyLayoutAnimation(s0Var);
                    this.animations[i5] = lazyLayoutAnimation3;
                }
                lazyLayoutAnimation3.setAppearanceSpec(specs.getAppearanceSpec());
                lazyLayoutAnimation3.setPlacementSpec(specs.getPlacementSpec());
            }
        }
    }
}
