package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\f\b \u0018\u0000 .2\u00020\u0001:\u0003./0B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rJ\u0006\u0010\u001b\u001a\u00020\rJ#\u0010\u001f\u001a\u00020\r2\u0011\u0010\u001e\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u001d0\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H&R\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*¨\u00061"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "findPendingOperation", "findRunningOperation", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/FragmentStateManager;", "fragmentStateManager", "Lkotlin/r2;", "enqueue", "updateFinalState", "getAwaitingCompletionLifecycleImpact", "enqueueAdd", "enqueueShow", "enqueueHide", "enqueueRemove", "", "isPop", "updateOperationDirection", "markPostponedState", "forcePostponedExecutePendingOperations", "executePendingOperations", "forceCompleteAllOperations", "", "Lu3/n;", "operations", "executeOperations", "Landroid/view/ViewGroup;", "container", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "", "pendingOperations", "Ljava/util/List;", "runningOperations", "operationDirectionIsPop", "Z", "isContainerPostponed", "<init>", "(Landroid/view/ViewGroup;)V", "Companion", "FragmentStateManagerOperation", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
/* loaded from: classes2.dex */
public abstract class SpecialEffectsController {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;

    @p4.l
    private final List<Operation> pendingOperations;

    @p4.l
    private final List<Operation> runningOperations;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "Lkotlin/r2;", "onStart", "complete", "Landroidx/fragment/app/FragmentStateManager;", "fragmentStateManager", "Landroidx/fragment/app/FragmentStateManager;", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/core/os/CancellationSignal;", "cancellationSignal", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;Landroidx/core/os/CancellationSignal;)V", "fragment_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class FragmentStateManagerOperation extends Operation {

        @p4.l
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public FragmentStateManagerOperation(@p4.l androidx.fragment.app.SpecialEffectsController.Operation.State r3, @p4.l androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, @p4.l androidx.fragment.app.FragmentStateManager r5, @p4.l androidx.core.os.CancellationSignal r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.l0.p(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.l0.p(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.l0.p(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                kotlin.jvm.internal.l0.p(r6, r0)
                androidx.fragment.app.Fragment r0 = r5.getFragment()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.l0.o(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.fragmentStateManager = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.FragmentStateManager, androidx.core.os.CancellationSignal):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.fragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            boolean z4;
            if (getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.fragmentStateManager.getFragment();
                l0.o(fragment, "fragmentStateManager.fragment");
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = getFragment().requireView();
                l0.o(requireView, "this.fragment.requireView()");
                if (requireView.getParent() == null) {
                    this.fragmentStateManager.addViewToContainer();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                return;
            }
            if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                Fragment fragment2 = this.fragmentStateManager.getFragment();
                l0.o(fragment2, "fragmentStateManager.fragment");
                View requireView2 = fragment2.requireView();
                l0.o(requireView2, "fragment.requireView()");
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
                }
                requireView2.clearFocus();
            }
        }
    }

    @i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010/\u001a\u00020\u000f¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\u0004H\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R$\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010-¨\u00064"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "", "toString", "Lkotlin/r2;", "cancel", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "mergeWith", "Ljava/lang/Runnable;", "listener", "addCompletionListener", "onStart", "Landroidx/core/os/CancellationSignal;", "signal", "markStartedSpecialEffect", "completeSpecialEffect", "complete", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "", "completionListeners", "Ljava/util/List;", "", "specialEffectsSignals", "Ljava/util/Set;", "", "<set-?>", "isCanceled", "Z", "()Z", "isComplete", "cancellationSignal", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;Landroidx/core/os/CancellationSignal;)V", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static class Operation {

        @p4.l
        private final List<Runnable> completionListeners;

        @p4.l
        private State finalState;

        @p4.l
        private final Fragment fragment;
        private boolean isCanceled;
        private boolean isComplete;

        @p4.l
        private LifecycleImpact lifecycleImpact;

        @p4.l
        private final Set<CancellationSignal> specialEffectsSignals;

        @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "Landroid/view/View;", "view", "Lkotlin/r2;", "applyState", "<init>", "(Ljava/lang/String;I)V", "Companion", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes2.dex */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            @p4.l
            public static final Companion Companion = new Companion(null);

            @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u00020\u0004*\u00020\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "()V", TypedValues.TransitionType.S_FROM, "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "visibility", "", "asOperationState", "Landroid/view/View;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(w wVar) {
                    this();
                }

                @p4.l
                public final State asOperationState(@p4.l View view) {
                    boolean z4;
                    l0.p(view, "<this>");
                    if (view.getAlpha() == 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && view.getVisibility() == 0) {
                        return State.INVISIBLE;
                    }
                    return from(view.getVisibility());
                }

                @p4.l
                @u3.m
                public final State from(int i5) {
                    if (i5 != 0) {
                        if (i5 != 4) {
                            if (i5 == 8) {
                                return State.GONE;
                            }
                            throw new IllegalArgumentException("Unknown visibility " + i5);
                        }
                        return State.INVISIBLE;
                    }
                    return State.VISIBLE;
                }
            }

            @i0(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @p4.l
            @u3.m
            public static final State from(int i5) {
                return Companion.from(i5);
            }

            public final void applyState(@p4.l View view) {
                ViewGroup viewGroup;
                l0.p(view, "view");
                int i5 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 4) {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(@p4.l State finalState, @p4.l LifecycleImpact lifecycleImpact, @p4.l Fragment fragment, @p4.l CancellationSignal cancellationSignal) {
            l0.p(finalState, "finalState");
            l0.p(lifecycleImpact, "lifecycleImpact");
            l0.p(fragment, "fragment");
            l0.p(cancellationSignal, "cancellationSignal");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.specialEffectsSignals = new LinkedHashSet();
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.v
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    SpecialEffectsController.Operation._init_$lambda$0(SpecialEffectsController.Operation.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(Operation this$0) {
            l0.p(this$0, "this$0");
            this$0.cancel();
        }

        public final void addCompletionListener(@p4.l Runnable listener) {
            l0.p(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void cancel() {
            Set W5;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this.specialEffectsSignals.isEmpty()) {
                complete();
                return;
            }
            W5 = e0.W5(this.specialEffectsSignals);
            Iterator it = W5.iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).cancel();
            }
        }

        @CallSuper
        public void complete() {
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void completeSpecialEffect(@p4.l CancellationSignal signal) {
            l0.p(signal, "signal");
            if (this.specialEffectsSignals.remove(signal) && this.specialEffectsSignals.isEmpty()) {
                complete();
            }
        }

        @p4.l
        public final State getFinalState() {
            return this.finalState;
        }

        @p4.l
        public final Fragment getFragment() {
            return this.fragment;
        }

        @p4.l
        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void markStartedSpecialEffect(@p4.l CancellationSignal signal) {
            l0.p(signal, "signal");
            onStart();
            this.specialEffectsSignals.add(signal);
        }

        public final void mergeWith(@p4.l State finalState, @p4.l LifecycleImpact lifecycleImpact) {
            l0.p(finalState, "finalState");
            l0.p(lifecycleImpact, "lifecycleImpact");
            int i5 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3 && this.finalState != State.REMOVED) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + external.org.apache.commons.lang3.d.f15957a);
                        }
                        this.finalState = finalState;
                        return;
                    }
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = State.REMOVED;
                this.lifecycleImpact = LifecycleImpact.REMOVING;
                return;
            }
            if (this.finalState == State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                }
                this.finalState = State.VISIBLE;
                this.lifecycleImpact = LifecycleImpact.ADDING;
            }
        }

        public void onStart() {
        }

        public final void setFinalState(@p4.l State state) {
            l0.p(state, "<set-?>");
            this.finalState = state;
        }

        public final void setLifecycleImpact(@p4.l LifecycleImpact lifecycleImpact) {
            l0.p(lifecycleImpact, "<set-?>");
            this.lifecycleImpact = lifecycleImpact;
        }

        @p4.l
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(@p4.l ViewGroup container) {
        l0.p(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void enqueue(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Fragment fragment = fragmentStateManager.getFragment();
            l0.o(fragment, "fragmentStateManager.fragment");
            Operation findPendingOperation = findPendingOperation(fragment);
            if (findPendingOperation != null) {
                findPendingOperation.mergeWith(state, lifecycleImpact);
                return;
            }
            final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.pendingOperations.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.t
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$2(SpecialEffectsController.this, fragmentStateManagerOperation);
                }
            });
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.u
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$3(SpecialEffectsController.this, fragmentStateManagerOperation);
                }
            });
            r2 r2Var = r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        l0.p(this$0, "this$0");
        l0.p(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            l0.o(view, "operation.fragment.mView");
            finalState.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        l0.p(this$0, "this$0");
        l0.p(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object obj;
        boolean z4;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
                if (l0.g(operation.getFragment(), fragment) && !operation.isCanceled()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Operation) obj;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object obj;
        boolean z4;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
                if (l0.g(operation.getFragment(), fragment) && !operation.isCanceled()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Operation) obj;
    }

    @p4.l
    @u3.m
    public static final SpecialEffectsController getOrCreateController(@p4.l ViewGroup viewGroup, @p4.l FragmentManager fragmentManager) {
        return Companion.getOrCreateController(viewGroup, fragmentManager);
    }

    @p4.l
    @u3.m
    public static final SpecialEffectsController getOrCreateController(@p4.l ViewGroup viewGroup, @p4.l SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.getFragment().requireView();
                l0.o(requireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void enqueueAdd(@p4.l Operation.State finalState, @p4.l FragmentStateManager fragmentStateManager) {
        l0.p(finalState, "finalState");
        l0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(@p4.l FragmentStateManager fragmentStateManager) {
        l0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(@p4.l FragmentStateManager fragmentStateManager) {
        l0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(@p4.l FragmentStateManager fragmentStateManager) {
        l0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void executeOperations(@p4.l List<Operation> list, boolean z4);

    public final void executePendingOperations() {
        List<Operation> V5;
        List<Operation> V52;
        if (this.isContainerPostponed) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.container)) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            if (!this.pendingOperations.isEmpty()) {
                V5 = e0.V5(this.runningOperations);
                this.runningOperations.clear();
                for (Operation operation : V5) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.cancel();
                    if (!operation.isComplete()) {
                        this.runningOperations.add(operation);
                    }
                }
                updateFinalState();
                V52 = e0.V5(this.pendingOperations);
                this.pendingOperations.clear();
                this.runningOperations.addAll(V52);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Executing pending operations");
                }
                Iterator<Operation> it = V52.iterator();
                while (it.hasNext()) {
                    it.next().onStart();
                }
                executeOperations(V52, this.operationDirectionIsPop);
                this.operationDirectionIsPop = false;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Finished executing pending operations");
                }
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public final void forceCompleteAllOperations() {
        List<Operation> V5;
        List<Operation> V52;
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = ViewCompat.isAttachedToWindow(this.container);
        synchronized (this.pendingOperations) {
            updateFinalState();
            Iterator<Operation> it = this.pendingOperations.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
            V5 = e0.V5(this.runningOperations);
            for (Operation operation : V5) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.container + " is not attached to window. ";
                    }
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation);
                }
                operation.cancel();
            }
            V52 = e0.V5(this.pendingOperations);
            for (Operation operation2 : V52) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.container + " is not attached to window. ";
                    }
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str + "Cancelling pending operation " + operation2);
                }
                operation2.cancel();
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    @p4.m
    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@p4.l FragmentStateManager fragmentStateManager) {
        Operation.LifecycleImpact lifecycleImpact;
        int i5;
        l0.p(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        l0.o(fragment, "fragmentStateManager.fragment");
        Operation findPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = null;
        if (findPendingOperation != null) {
            lifecycleImpact = findPendingOperation.getLifecycleImpact();
        } else {
            lifecycleImpact = null;
        }
        Operation findRunningOperation = findRunningOperation(fragment);
        if (findRunningOperation != null) {
            lifecycleImpact2 = findRunningOperation.getLifecycleImpact();
        }
        if (lifecycleImpact == null) {
            i5 = -1;
        } else {
            i5 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        }
        if (i5 == -1 || i5 == 1) {
            return lifecycleImpact2;
        }
        return lifecycleImpact;
    }

    @p4.l
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final void markPostponedState() {
        boolean z4;
        Fragment fragment;
        Operation operation;
        boolean z5;
        synchronized (this.pendingOperations) {
            updateFinalState();
            List<Operation> list = this.pendingOperations;
            ListIterator<Operation> listIterator = list.listIterator(list.size());
            while (true) {
                z4 = false;
                fragment = null;
                if (listIterator.hasPrevious()) {
                    operation = listIterator.previous();
                    Operation operation2 = operation;
                    Operation.State.Companion companion = Operation.State.Companion;
                    View view = operation2.getFragment().mView;
                    l0.o(view, "operation.fragment.mView");
                    Operation.State asOperationState = companion.asOperationState(view);
                    Operation.State finalState = operation2.getFinalState();
                    Operation.State state = Operation.State.VISIBLE;
                    if (finalState == state && asOperationState != state) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        break;
                    }
                } else {
                    operation = null;
                    break;
                }
            }
            Operation operation3 = operation;
            if (operation3 != null) {
                fragment = operation3.getFragment();
            }
            if (fragment != null) {
                z4 = fragment.isPostponed();
            }
            this.isContainerPostponed = z4;
            r2 r2Var = r2.f19517a;
        }
    }

    public final void updateOperationDirection(boolean z4) {
        this.operationDirectionIsPop = z4;
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "()V", "getOrCreateController", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "factory", "Landroidx/fragment/app/SpecialEffectsControllerFactory;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @p4.l
        @u3.m
        public final SpecialEffectsController getOrCreateController(@p4.l ViewGroup container, @p4.l FragmentManager fragmentManager) {
            l0.p(container, "container");
            l0.p(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            l0.o(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, specialEffectsControllerFactory);
        }

        @p4.l
        @u3.m
        public final SpecialEffectsController getOrCreateController(@p4.l ViewGroup container, @p4.l SpecialEffectsControllerFactory factory) {
            l0.p(container, "container");
            l0.p(factory, "factory");
            int i5 = R.id.special_effects_controller_view_tag;
            Object tag = container.getTag(i5);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController createController = factory.createController(container);
            l0.o(createController, "factory.createController(container)");
            container.setTag(i5, createController);
            return createController;
        }
    }
}
