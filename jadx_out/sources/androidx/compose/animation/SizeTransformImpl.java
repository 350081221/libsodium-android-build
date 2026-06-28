package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012<\u0010\u0011\u001a8\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u000e¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rRM\u0010\u0011\u001a8\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/SizeTransformImpl;", "Landroidx/compose/animation/SizeTransform;", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "createAnimationSpec-TemP2vQ", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;", "createAnimationSpec", "", "clip", "Z", "getClip", "()Z", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "sizeAnimationSpec", "Lv3/p;", "getSizeAnimationSpec", "()Lv3/p;", "<init>", "(ZLv3/p;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;

    @l
    private final p<IntSize, IntSize, FiniteAnimationSpec<IntSize>> sizeAnimationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeTransformImpl(boolean z4, @l p<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> pVar) {
        this.clip = z4;
        this.sizeAnimationSpec = pVar;
    }

    @Override // androidx.compose.animation.SizeTransform
    @l
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo105createAnimationSpecTemP2vQ(long j5, long j6) {
        return this.sizeAnimationSpec.invoke(IntSize.m6206boximpl(j5), IntSize.m6206boximpl(j6));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    @l
    public final p<IntSize, IntSize, FiniteAnimationSpec<IntSize>> getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public /* synthetic */ SizeTransformImpl(boolean z4, p pVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? true : z4, pVar);
    }
}
