package androidx.navigation;

import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.sequences.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/r2;", "invoke", "(Landroidx/navigation/NavOptionsBuilder;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$handleDeepLink$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,2604:1\n2141#2,2:2605\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$handleDeepLink$2\n*L\n1422#1:2605,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavController$handleDeepLink$2 extends n0 implements l<NavOptionsBuilder, r2> {
    final /* synthetic */ NavDestination $node;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/AnimBuilder;", "Lkotlin/r2;", "invoke", "(Landroidx/navigation/AnimBuilder;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.NavController$handleDeepLink$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends n0 implements l<AnimBuilder, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(AnimBuilder animBuilder) {
            invoke2(animBuilder);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l AnimBuilder anim) {
            l0.p(anim, "$this$anim");
            anim.setEnter(0);
            anim.setExit(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/PopUpToBuilder;", "Lkotlin/r2;", "invoke", "(Landroidx/navigation/PopUpToBuilder;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.NavController$handleDeepLink$2$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends n0 implements l<PopUpToBuilder, r2> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(PopUpToBuilder popUpToBuilder) {
            invoke2(popUpToBuilder);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l PopUpToBuilder popUpTo) {
            l0.p(popUpTo, "$this$popUpTo");
            popUpTo.setSaveState(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$handleDeepLink$2(NavDestination navDestination, NavController navController) {
        super(1);
        this.$node = navDestination;
        this.this$0 = navController;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(NavOptionsBuilder navOptionsBuilder) {
        invoke2(navOptionsBuilder);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l NavOptionsBuilder navOptions) {
        boolean z4;
        boolean z5;
        l0.p(navOptions, "$this$navOptions");
        navOptions.anim(AnonymousClass1.INSTANCE);
        NavDestination navDestination = this.$node;
        boolean z6 = false;
        if (navDestination instanceof NavGraph) {
            m<NavDestination> hierarchy = NavDestination.Companion.getHierarchy(navDestination);
            NavController navController = this.this$0;
            Iterator<NavDestination> it = hierarchy.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = true;
                    break;
                }
                NavDestination next = it.next();
                NavDestination currentDestination = navController.getCurrentDestination();
                if (l0.g(next, currentDestination != null ? currentDestination.getParent() : null)) {
                    z5 = false;
                    break;
                }
            }
            if (z5) {
                z6 = true;
            }
        }
        if (z6) {
            z4 = NavController.deepLinkSaveState;
            if (z4) {
                navOptions.popUpTo(NavGraph.Companion.findStartDestination(this.this$0.getGraph()).getId(), AnonymousClass2.INSTANCE);
            }
        }
    }
}
