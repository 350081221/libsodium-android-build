package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class c extends ValueAnimator {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f1740a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f1741b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private final Set<Animator.AnimatorPauseListener> f1742c = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Iterator<Animator.AnimatorListener> it = this.f1741b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f1741b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1742c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f1740a.add(animatorUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z4) {
        for (Animator.AnimatorListener animatorListener : this.f1741b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z4);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Iterator<Animator.AnimatorPauseListener> it = this.f1742c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Iterator<Animator.AnimatorListener> it = this.f1741b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        Iterator<Animator.AnimatorPauseListener> it = this.f1742c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z4) {
        for (Animator.AnimatorListener animatorListener : this.f1741b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z4);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f1740a.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f1741b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f1740a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f1741b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f1742c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f1740a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j5) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j5) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
