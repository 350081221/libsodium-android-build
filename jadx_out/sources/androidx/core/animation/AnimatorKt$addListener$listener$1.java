package androidx.core.animation;

import android.animation.Animator;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/r2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n*L\n1#1,123:1\n*E\n"})
/* loaded from: classes2.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ l<Animator, r2> $onCancel;
    final /* synthetic */ l<Animator, r2> $onEnd;
    final /* synthetic */ l<Animator, r2> $onRepeat;
    final /* synthetic */ l<Animator, r2> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(l<? super Animator, r2> lVar, l<? super Animator, r2> lVar2, l<? super Animator, r2> lVar3, l<? super Animator, r2> lVar4) {
        this.$onRepeat = lVar;
        this.$onEnd = lVar2;
        this.$onCancel = lVar3;
        this.$onStart = lVar4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@p4.l Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@p4.l Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@p4.l Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@p4.l Animator animator) {
        this.$onStart.invoke(animator);
    }
}
