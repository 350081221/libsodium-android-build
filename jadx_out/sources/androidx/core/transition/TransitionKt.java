package androidx.core.transition;

import android.transition.Transition;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\t\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001a2\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u001aÆ\u0001\u0010\u0012\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¨\u0006\u0013"}, d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "transition", "Lkotlin/r2;", "action", "Landroid/transition/Transition$TransitionListener;", "doOnEnd", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "onEnd", "onStart", "onCancel", "onResume", "onPause", "addListener", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,76:1\n59#1,16:77\n59#1,16:93\n59#1,16:109\n59#1,16:125\n59#1,16:141\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n26#1:77,16\n33#1:93,16\n40#1:109,16\n47#1:125,16\n54#1:141,16\n*E\n"})
/* loaded from: classes2.dex */
public final class TransitionKt {
    @l
    public static final Transition.TransitionListener addListener(@l Transition transition, @l v3.l<? super Transition, r2> lVar, @l v3.l<? super Transition, r2> lVar2, @l v3.l<? super Transition, r2> lVar3, @l v3.l<? super Transition, r2> lVar4, @l v3.l<? super Transition, r2> lVar5) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, v3.l lVar, v3.l lVar2, v3.l lVar3, v3.l lVar4, v3.l lVar5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = TransitionKt$addListener$1.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            lVar2 = TransitionKt$addListener$2.INSTANCE;
        }
        v3.l lVar6 = lVar2;
        if ((i5 & 4) != 0) {
            lVar3 = TransitionKt$addListener$3.INSTANCE;
        }
        v3.l lVar7 = lVar3;
        if ((i5 & 8) != 0) {
            lVar4 = TransitionKt$addListener$4.INSTANCE;
        }
        if ((i5 & 16) != 0) {
            lVar5 = TransitionKt$addListener$5.INSTANCE;
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar7, lVar6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    @l
    public static final Transition.TransitionListener doOnCancel(@l Transition transition, @l final v3.l<? super Transition, r2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@l Transition transition2) {
                v3.l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@l Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @l
    public static final Transition.TransitionListener doOnEnd(@l Transition transition, @l final v3.l<? super Transition, r2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@l Transition transition2) {
                v3.l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@l Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @l
    public static final Transition.TransitionListener doOnPause(@l Transition transition, @l final v3.l<? super Transition, r2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@l Transition transition2) {
                v3.l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@l Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @l
    public static final Transition.TransitionListener doOnResume(@l Transition transition, @l final v3.l<? super Transition, r2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@l Transition transition2) {
                v3.l.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@l Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @l
    public static final Transition.TransitionListener doOnStart(@l Transition transition, @l final v3.l<? super Transition, r2> lVar) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@l Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@l Transition transition2) {
                v3.l.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
