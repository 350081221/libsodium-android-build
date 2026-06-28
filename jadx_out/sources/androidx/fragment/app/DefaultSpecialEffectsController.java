package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.u0;

@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003+,-B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J@\u0010\u000f\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0002JL\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0002J&\u0010\u001b\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0002J(\u0010 \u001a\u00020\u00052\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001cj\b\u0012\u0004\u0012\u00020\u0018`\u001d2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J$\u0010#\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180!2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0003H\u0002J\u001e\u0010&\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¨\u0006."}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "Lkotlin/r2;", "syncAnimations", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animationInfos", "", "awaitingContainerChanges", "", "startedAnyTransition", "", "startedTransitions", "startAnimations", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "isPop", "firstOut", "lastIn", "startTransitions", "Landroidx/collection/ArrayMap;", "", "Landroid/view/View;", "", "names", "retainMatchingViews", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "transitioningViews", "view", "captureTransitioningViews", "", "namedViews", "findNamedViews", "operation", "applyContainerChanges", "executeOperations", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "AnimationInfo", "SpecialEffectsInfo", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class AnimationInfo extends SpecialEffectsInfo {

        @p4.m
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(@p4.l SpecialEffectsController.Operation operation, @p4.l CancellationSignal signal, boolean z4) {
            super(operation, signal);
            l0.p(operation, "operation");
            l0.p(signal, "signal");
            this.isPop = z4;
        }

        @p4.m
        public final FragmentAnim.AnimationOrAnimator getAnimation(@p4.l Context context) {
            boolean z4;
            l0.p(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            Fragment fragment = getOperation().getFragment();
            if (getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                z4 = true;
            } else {
                z4 = false;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, fragment, z4, this.isPop);
            this.animation = loadAnimation;
            this.isAnimLoaded = true;
            return loadAnimation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "Lkotlin/r2;", "completeSpecialEffect", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "Landroidx/core/os/CancellationSignal;", "signal", "Landroidx/core/os/CancellationSignal;", "getSignal", "()Landroidx/core/os/CancellationSignal;", "", "isVisibilityUnchanged", "()Z", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;)V", "fragment_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static class SpecialEffectsInfo {

        @p4.l
        private final SpecialEffectsController.Operation operation;

        @p4.l
        private final CancellationSignal signal;

        public SpecialEffectsInfo(@p4.l SpecialEffectsController.Operation operation, @p4.l CancellationSignal signal) {
            l0.p(operation, "operation");
            l0.p(signal, "signal");
            this.operation = operation;
            this.signal = signal;
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }

        @p4.l
        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        @p4.l
        public final CancellationSignal getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = this.operation.getFragment().mView;
            l0.o(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (asOperationState != finalState && (asOperationState == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state)) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(@p4.l ViewGroup container) {
        super(container);
        l0.p(container, "container");
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        l0.o(view, "view");
        finalState.applyState(view);
    }

    private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View child = viewGroup.getChildAt(i5);
                if (child.getVisibility() == 0) {
                    l0.o(child, "child");
                    captureTransitioningViews(arrayList, child);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        l0.p(awaitingContainerChanges, "$awaitingContainerChanges");
        l0.p(operation, "$operation");
        l0.p(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.applyContainerChanges(operation);
        }
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View child = viewGroup.getChildAt(i5);
                if (child.getVisibility() == 0) {
                    l0.o(child, "child");
                    findNamedViews(map, child);
                }
            }
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        l0.o(entries, "entries");
        b0.N0(entries, new DefaultSpecialEffectsController$retainMatchingViews$1(collection));
    }

    private final void startAnimations(List<AnimationInfo> list, List<SpecialEffectsController.Operation> list2, boolean z4, Map<SpecialEffectsController.Operation, Boolean> map) {
        final boolean z5;
        Context context = getContainer().getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z6 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                l0.o(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (l0.g(map.get(operation), Boolean.TRUE)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                list2.remove(operation);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(@p4.l Animator anim) {
                                    l0.p(anim, "anim");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z5) {
                                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                        View viewToAnimate = view;
                                        l0.o(viewToAnimate, "viewToAnimate");
                                        finalState.applyState(viewToAnimate);
                                    }
                                    animationInfo.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
                            }
                            animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.f
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.startAnimations$lambda$3(animator, operation);
                                }
                            });
                            z6 = true;
                        }
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z4) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.completeSpecialEffect();
            } else if (z6) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                l0.o(context, "context");
                FragmentAnim.AnimationOrAnimator animation2 = animationInfo2.getAnimation(context);
                if (animation2 != null) {
                    Animation animation3 = animation2.animation;
                    if (animation3 != null) {
                        if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                            view2.startAnimation(animation3);
                            animationInfo2.completeSpecialEffect();
                        } else {
                            getContainer().startViewTransition(view2);
                            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation3, getContainer(), view2);
                            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$startAnimations$3(operation2, this, view2, animationInfo2));
                            view2.startAnimation(endViewTransitionAnimation);
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animation from operation " + operation2 + " has started.");
                            }
                        }
                        animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.g
                            @Override // androidx.core.os.CancellationSignal.OnCancelListener
                            public final void onCancel() {
                                DefaultSpecialEffectsController.startAnimations$lambda$4(view2, this, animationInfo2, operation2);
                            }
                        });
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator animator, SpecialEffectsController.Operation operation) {
        l0.p(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View view, DefaultSpecialEffectsController this$0, AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        l0.p(this$0, "this$0");
        l0.p(animationInfo, "$animationInfo");
        l0.p(operation, "$operation");
        view.clearAnimation();
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> list, List<SpecialEffectsController.Operation> list2, final boolean z4, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        View view;
        Object obj;
        Object obj2;
        View view2;
        Object obj3;
        LinkedHashMap linkedHashMap;
        Object obj4;
        SpecialEffectsController.Operation operation3;
        final ArrayList<View> arrayList;
        Rect rect;
        View view3;
        Collection<?> X5;
        Collection<?> X52;
        Rect rect2;
        u0 a5;
        Object obj5;
        Object obj6;
        View view4;
        final Rect rect3;
        final View view5;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj7 : list) {
            if (!((TransitionInfo) obj7).isVisibilityUnchanged()) {
                arrayList2.add(obj7);
            }
        }
        ArrayList<TransitionInfo> arrayList3 = new ArrayList();
        for (Object obj8 : arrayList2) {
            if (((TransitionInfo) obj8).getHandlingImpl() != null) {
                arrayList3.add(obj8);
            }
        }
        final FragmentTransitionImpl fragmentTransitionImpl = null;
        for (TransitionInfo transitionInfo : arrayList3) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (!(fragmentTransitionImpl == null || handlingImpl == fragmentTransitionImpl)) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl = handlingImpl;
        }
        if (fragmentTransitionImpl == null) {
            for (TransitionInfo transitionInfo2 : list) {
                linkedHashMap2.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return linkedHashMap2;
        }
        View view6 = new View(getContainer().getContext());
        Rect rect4 = new Rect();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        View view7 = null;
        Object obj9 = null;
        boolean z5 = false;
        for (TransitionInfo transitionInfo3 : list) {
            if (!transitionInfo3.hasSharedElementTransition() || operation == null || operation2 == null) {
                rect2 = rect4;
                view6 = view6;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                linkedHashMap2 = linkedHashMap2;
                view7 = view7;
                arrayMap = arrayMap;
            } else {
                Object wrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(transitionInfo3.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                l0.o(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                View view8 = view7;
                l0.o(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                l0.o(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view9 = view6;
                Rect rect5 = rect4;
                int i5 = 0;
                while (i5 < size) {
                    int i6 = size;
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i5));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i5));
                    }
                    i5++;
                    size = i6;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                l0.o(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                if (!z4) {
                    a5 = q1.a(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback());
                } else {
                    a5 = q1.a(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                }
                SharedElementCallback sharedElementCallback = (SharedElementCallback) a5.component1();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) a5.component2();
                int size2 = sharedElementSourceNames.size();
                int i7 = 0;
                while (i7 < size2) {
                    arrayMap.put(sharedElementSourceNames.get(i7), sharedElementTargetNames2.get(i7));
                    i7++;
                    size2 = size2;
                    fragmentTransitionImpl = fragmentTransitionImpl;
                }
                FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    for (Iterator<String> it = sharedElementTargetNames2.iterator(); it.hasNext(); it = it) {
                        Log.v(FragmentManager.TAG, "Name: " + it.next());
                    }
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it2 = sharedElementSourceNames.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v(FragmentManager.TAG, "Name: " + it2.next());
                    }
                }
                ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                View view10 = operation.getFragment().mView;
                l0.o(view10, "firstOut.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(arrayMap2, view10);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + operation);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i8 = size3 - 1;
                            String str = sharedElementSourceNames.get(size3);
                            View view11 = arrayMap2.get(str);
                            if (view11 == null) {
                                arrayMap.remove(str);
                                obj5 = wrapTransitionInSet;
                            } else {
                                obj5 = wrapTransitionInSet;
                                if (!l0.g(str, ViewCompat.getTransitionName(view11))) {
                                    arrayMap.put(ViewCompat.getTransitionName(view11), (String) arrayMap.remove(str));
                                }
                            }
                            if (i8 < 0) {
                                break;
                            }
                            size3 = i8;
                            wrapTransitionInSet = obj5;
                        }
                    } else {
                        obj5 = wrapTransitionInSet;
                    }
                } else {
                    obj5 = wrapTransitionInSet;
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                final ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                View view12 = operation2.getFragment().mView;
                l0.o(view12, "lastIn.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(arrayMap3, view12);
                arrayMap3.retainAll(sharedElementTargetNames2);
                arrayMap3.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation2);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, arrayMap3);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i9 = size4 - 1;
                            String name = sharedElementTargetNames2.get(size4);
                            View view13 = arrayMap3.get(name);
                            if (view13 == null) {
                                l0.o(name, "name");
                                String findKeyForValue = FragmentTransition.findKeyForValue(arrayMap, name);
                                if (findKeyForValue != null) {
                                    arrayMap.remove(findKeyForValue);
                                }
                            } else if (!l0.g(name, ViewCompat.getTransitionName(view13))) {
                                l0.o(name, "name");
                                String findKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, name);
                                if (findKeyForValue2 != null) {
                                    arrayMap.put(findKeyForValue2, ViewCompat.getTransitionName(view13));
                                }
                            }
                            if (i9 < 0) {
                                break;
                            }
                            size4 = i9;
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                Collection<String> keySet = arrayMap.keySet();
                l0.o(keySet, "sharedElementNameMapping.keys");
                defaultSpecialEffectsController.retainMatchingViews(arrayMap2, keySet);
                Collection<String> values = arrayMap.values();
                l0.o(values, "sharedElementNameMapping.values");
                defaultSpecialEffectsController.retainMatchingViews(arrayMap3, values);
                if (arrayMap.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view7 = view8;
                    rect4 = rect5;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    obj9 = null;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z4, arrayMap2, true);
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$9(SpecialEffectsController.Operation.this, operation, z4, arrayMap3);
                        }
                    });
                    arrayList4.addAll(arrayMap2.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        view4 = arrayMap2.get(sharedElementSourceNames.get(0));
                        obj6 = obj5;
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                        fragmentTransitionImpl.setEpicenter(obj6, view4);
                    } else {
                        obj6 = obj5;
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                        view4 = view8;
                    }
                    arrayList5.addAll(arrayMap3.values());
                    if (!(!sharedElementTargetNames2.isEmpty()) || (view5 = arrayMap3.get(sharedElementTargetNames2.get(0))) == null) {
                        rect3 = rect5;
                    } else {
                        rect3 = rect5;
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.startTransitions$lambda$10(FragmentTransitionImpl.this, view5, rect3);
                            }
                        });
                        z5 = true;
                    }
                    fragmentTransitionImpl.setSharedElementTargets(obj6, view9, arrayList4);
                    obj9 = obj6;
                    ArrayList<View> arrayList6 = arrayList5;
                    rect2 = rect3;
                    fragmentTransitionImpl.scheduleRemoveTargets(obj9, null, null, null, null, obj6, arrayList6);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(operation, bool);
                    linkedHashMap3.put(operation2, bool);
                    view7 = view4;
                    arrayList5 = arrayList6;
                    arrayList4 = arrayList4;
                    arrayMap = arrayMap;
                    view6 = view9;
                    linkedHashMap2 = linkedHashMap3;
                }
            }
            rect4 = rect2;
        }
        View view14 = view7;
        ArrayMap arrayMap4 = arrayMap;
        ArrayList<View> arrayList7 = arrayList5;
        ArrayList<View> arrayList8 = arrayList4;
        Rect rect6 = rect4;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view15 = view6;
        ArrayList arrayList9 = new ArrayList();
        Iterator<TransitionInfo> it3 = list.iterator();
        Object obj10 = null;
        Object obj11 = null;
        while (it3.hasNext()) {
            TransitionInfo next = it3.next();
            if (next.isVisibilityUnchanged()) {
                linkedHashMap4.put(next.getOperation(), Boolean.FALSE);
                next.completeSpecialEffect();
            } else {
                Object cloneTransition = fragmentTransitionImpl.cloneTransition(next.getTransition());
                SpecialEffectsController.Operation operation4 = next.getOperation();
                boolean z6 = obj9 != null && (operation4 == operation || operation4 == operation2);
                if (cloneTransition != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Iterator<TransitionInfo> it4 = it3;
                    View view16 = operation4.getFragment().mView;
                    Object obj12 = obj9;
                    l0.o(view16, "operation.fragment.mView");
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList10, view16);
                    if (z6) {
                        if (operation4 == operation) {
                            X52 = e0.X5(arrayList8);
                            arrayList10.removeAll(X52);
                        } else {
                            X5 = e0.X5(arrayList7);
                            arrayList10.removeAll(X5);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        fragmentTransitionImpl.addTarget(cloneTransition, view15);
                        view2 = view15;
                        operation3 = operation4;
                        obj2 = obj10;
                        obj3 = obj11;
                        arrayList = arrayList10;
                        view = view14;
                        linkedHashMap = linkedHashMap5;
                        obj = obj12;
                        obj4 = cloneTransition;
                    } else {
                        fragmentTransitionImpl.addTargets(cloneTransition, arrayList10);
                        view = view14;
                        obj = obj12;
                        obj2 = obj10;
                        view2 = view15;
                        obj3 = obj11;
                        linkedHashMap = linkedHashMap5;
                        fragmentTransitionImpl.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList10, null, null, null, null);
                        if (operation4.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation4;
                            list2.remove(operation3);
                            arrayList = arrayList10;
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList);
                            arrayList11.remove(operation3.getFragment().mView);
                            obj4 = cloneTransition;
                            fragmentTransitionImpl.scheduleHideFragmentView(obj4, operation3.getFragment().mView, arrayList11);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$11(arrayList);
                                }
                            });
                        } else {
                            obj4 = cloneTransition;
                            operation3 = operation4;
                            arrayList = arrayList10;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList9.addAll(arrayList);
                        rect = rect6;
                        if (z5) {
                            fragmentTransitionImpl.setEpicenter(obj4, rect);
                        }
                        view3 = view;
                    } else {
                        rect = rect6;
                        view3 = view;
                        fragmentTransitionImpl.setEpicenter(obj4, view3);
                    }
                    linkedHashMap.put(operation3, Boolean.TRUE);
                    if (next.isOverlapAllowed()) {
                        obj11 = fragmentTransitionImpl.mergeTransitionsTogether(obj3, obj4, null);
                    } else {
                        obj2 = fragmentTransitionImpl.mergeTransitionsTogether(obj2, obj4, null);
                        obj11 = obj3;
                    }
                    linkedHashMap4 = linkedHashMap;
                    rect6 = rect;
                    view14 = view3;
                    obj9 = obj;
                    view15 = view2;
                    it3 = it4;
                    obj10 = obj2;
                    defaultSpecialEffectsController = this;
                } else if (!z6) {
                    linkedHashMap4.put(operation4, Boolean.FALSE);
                    next.completeSpecialEffect();
                }
            }
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object obj13 = obj9;
        Object mergeTransitionsInSequence = fragmentTransitionImpl.mergeTransitionsInSequence(obj11, obj10, obj13);
        if (mergeTransitionsInSequence == null) {
            return linkedHashMap6;
        }
        ArrayList<TransitionInfo> arrayList12 = new ArrayList();
        for (Object obj14 : list) {
            if (!((TransitionInfo) obj14).isVisibilityUnchanged()) {
                arrayList12.add(obj14);
            }
        }
        for (final TransitionInfo transitionInfo4 : arrayList12) {
            Object transition = transitionInfo4.getTransition();
            final SpecialEffectsController.Operation operation5 = transitionInfo4.getOperation();
            boolean z7 = obj13 != null && (operation5 == operation || operation5 == operation2);
            if (transition != null || z7) {
                if (!ViewCompat.isLaidOut(getContainer())) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation5);
                    }
                    transitionInfo4.completeSpecialEffect();
                } else {
                    fragmentTransitionImpl.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), mergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$14$lambda$13(DefaultSpecialEffectsController.TransitionInfo.this, operation5);
                        }
                    });
                }
            }
        }
        if (!ViewCompat.isLaidOut(getContainer())) {
            return linkedHashMap6;
        }
        FragmentTransition.setViewVisibility(arrayList9, 4);
        ArrayList<String> prepareSetNameOverridesReordered = fragmentTransitionImpl.prepareSetNameOverridesReordered(arrayList7);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
            Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it5 = arrayList8.iterator();
            while (it5.hasNext()) {
                View sharedElementFirstOutViews = it5.next();
                l0.o(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view17 = sharedElementFirstOutViews;
                Log.v(FragmentManager.TAG, "View: " + view17 + " Name: " + ViewCompat.getTransitionName(view17));
            }
            Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it6 = arrayList7.iterator();
            while (it6.hasNext()) {
                View sharedElementLastInViews = it6.next();
                l0.o(sharedElementLastInViews, "sharedElementLastInViews");
                View view18 = sharedElementLastInViews;
                Log.v(FragmentManager.TAG, "View: " + view18 + " Name: " + ViewCompat.getTransitionName(view18));
            }
        }
        fragmentTransitionImpl.beginDelayedTransition(getContainer(), mergeTransitionsInSequence);
        fragmentTransitionImpl.setNameOverridesReordered(getContainer(), arrayList8, arrayList7, prepareSetNameOverridesReordered, arrayMap4);
        FragmentTransition.setViewVisibility(arrayList9, 0);
        fragmentTransitionImpl.swapSharedElementTargets(obj13, arrayList8, arrayList7);
        return linkedHashMap6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
        l0.p(impl, "$impl");
        l0.p(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.getBoundsOnScreen(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList transitioningViews) {
        l0.p(transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo transitionInfo, SpecialEffectsController.Operation operation) {
        l0.p(transitionInfo, "$transitionInfo");
        l0.p(operation, "$operation");
        transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z4, ArrayMap lastInViews) {
        l0.p(lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z4, lastInViews, false);
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        Object m32;
        m32 = e0.m3(list);
        Fragment fragment = ((SpecialEffectsController.Operation) m32).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(@p4.l List<? extends SpecialEffectsController.Operation> operations, boolean z4) {
        SpecialEffectsController.Operation operation;
        SpecialEffectsController.Operation operation2;
        final List<SpecialEffectsController.Operation> V5;
        boolean z5;
        boolean z6;
        boolean z7;
        l0.p(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            operation = null;
            if (it.hasNext()) {
                operation2 = it.next();
                SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) operation2;
                SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
                View view = operation3.getFragment().mView;
                l0.o(view, "operation.fragment.mView");
                SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
                SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                if (asOperationState == state && operation3.getFinalState() != state) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    break;
                }
            } else {
                operation2 = 0;
                break;
            }
        }
        SpecialEffectsController.Operation operation4 = operation2;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            SpecialEffectsController.Operation previous = listIterator.previous();
            SpecialEffectsController.Operation operation5 = previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation5.getFragment().mView;
            l0.o(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState2 != state2 && operation5.getFinalState() == state2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                operation = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation6 = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + operation4 + " to " + operation6);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        V5 = e0.V5(operations);
        syncAnimations(operations);
        for (final SpecialEffectsController.Operation operation7 : operations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation7.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(operation7, cancellationSignal, z4));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation7.markStartedSpecialEffect(cancellationSignal2);
            if (!z4 ? operation7 == operation6 : operation7 == operation4) {
                z5 = true;
            } else {
                z5 = false;
            }
            arrayList2.add(new TransitionInfo(operation7, cancellationSignal2, z4, z5));
            operation7.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.executeOperations$lambda$2(V5, operation7, this);
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> startTransitions = startTransitions(arrayList2, V5, z4, operation4, operation6);
        startAnimations(arrayList, V5, startTransitions.containsValue(Boolean.TRUE), startTransitions);
        Iterator<SpecialEffectsController.Operation> it2 = V5.iterator();
        while (it2.hasNext()) {
            applyContainerChanges(it2.next());
        }
        V5.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Completed executing operations from " + operation4 + " to " + operation6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;

        @p4.m
        private final Object sharedElementTransition;

        @p4.m
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(@p4.l SpecialEffectsController.Operation operation, @p4.l CancellationSignal signal, boolean z4, boolean z5) {
            super(operation, signal);
            Object exitTransition;
            boolean z6;
            Object obj;
            l0.p(operation, "operation");
            l0.p(signal, "signal");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                if (z4) {
                    exitTransition = fragment.getReenterTransition();
                } else {
                    exitTransition = fragment.getEnterTransition();
                }
            } else {
                Fragment fragment2 = operation.getFragment();
                if (z4) {
                    exitTransition = fragment2.getReturnTransition();
                } else {
                    exitTransition = fragment2.getExitTransition();
                }
            }
            this.transition = exitTransition;
            if (operation.getFinalState() == state) {
                if (z4) {
                    z6 = operation.getFragment().getAllowReturnTransitionOverlap();
                } else {
                    z6 = operation.getFragment().getAllowEnterTransitionOverlap();
                }
            } else {
                z6 = true;
            }
            this.isOverlapAllowed = z6;
            if (z5) {
                if (z4) {
                    obj = operation.getFragment().getSharedElementReturnTransition();
                } else {
                    obj = operation.getFragment().getSharedElementEnterTransition();
                }
            } else {
                obj = null;
            }
            this.sharedElementTransition = obj;
        }

        @p4.m
        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        @p4.m
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @p4.m
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
