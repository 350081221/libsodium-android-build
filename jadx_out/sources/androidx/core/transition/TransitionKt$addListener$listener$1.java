package androidx.core.transition;

import android.transition.Transition;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/r2;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n*L\n1#1,76:1\n*E\n"})
/* loaded from: classes2.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ l<Transition, r2> $onCancel;
    final /* synthetic */ l<Transition, r2> $onEnd;
    final /* synthetic */ l<Transition, r2> $onPause;
    final /* synthetic */ l<Transition, r2> $onResume;
    final /* synthetic */ l<Transition, r2> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(l<? super Transition, r2> lVar, l<? super Transition, r2> lVar2, l<? super Transition, r2> lVar3, l<? super Transition, r2> lVar4, l<? super Transition, r2> lVar5) {
        this.$onEnd = lVar;
        this.$onResume = lVar2;
        this.$onPause = lVar3;
        this.$onCancel = lVar4;
        this.$onStart = lVar5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(@p4.l Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(@p4.l Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(@p4.l Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(@p4.l Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(@p4.l Transition transition) {
        this.$onStart.invoke(transition);
    }
}
