package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/ContentTransform;", "", "targetContentEnter", "Landroidx/compose/animation/EnterTransition;", "initialContentExit", "Landroidx/compose/animation/ExitTransition;", "targetContentZIndex", "", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;FLandroidx/compose/animation/SizeTransform;)V", "getInitialContentExit", "()Landroidx/compose/animation/ExitTransition;", "<set-?>", "getSizeTransform", "()Landroidx/compose/animation/SizeTransform;", "setSizeTransform$animation_release", "(Landroidx/compose/animation/SizeTransform;)V", "getTargetContentEnter", "()Landroidx/compose/animation/EnterTransition;", "getTargetContentZIndex", "()F", "setTargetContentZIndex", "(F)V", "targetContentZIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,831:1\n76#2:832\n109#2,2:833\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n198#1:832\n198#1:833,2\n*E\n"})
/* loaded from: classes.dex */
public final class ContentTransform {
    public static final int $stable = 8;

    @l
    private final ExitTransition initialContentExit;

    @m
    private SizeTransform sizeTransform;

    @l
    private final EnterTransition targetContentEnter;

    @l
    private final MutableFloatState targetContentZIndex$delegate;

    public ContentTransform(@l EnterTransition enterTransition, @l ExitTransition exitTransition, float f5, @m SizeTransform sizeTransform) {
        this.targetContentEnter = enterTransition;
        this.initialContentExit = exitTransition;
        this.targetContentZIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
        this.sizeTransform = sizeTransform;
    }

    @l
    public final ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    @m
    public final SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    @l
    public final EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float getTargetContentZIndex() {
        return this.targetContentZIndex$delegate.getFloatValue();
    }

    public final void setSizeTransform$animation_release(@m SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }

    public final void setTargetContentZIndex(float f5) {
        this.targetContentZIndex$delegate.setFloatValue(f5);
    }

    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f5, SizeTransform sizeTransform, int i5, w wVar) {
        this(enterTransition, exitTransition, (i5 & 4) != 0 ? 0.0f : f5, (i5 & 8) != 0 ? AnimatedContentKt.SizeTransform$default(false, null, 3, null) : sizeTransform);
    }
}
