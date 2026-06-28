package androidx.navigation.compose;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.navigation.compose.NavHostKt$NavHost$15", f = "NavHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$15\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,368:1\n1855#2,2:369\n515#3:371\n500#3,6:372\n215#4,2:378\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$15\n*L\n313#1:369,2\n317#1:371\n317#1:372,6\n318#1:378,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$15 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ Map<String, Float> $zIndices;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$15(Transition<NavBackStackEntry> transition, Map<String, Float> map, State<? extends List<NavBackStackEntry>> state, ComposeNavigator composeNavigator, d<? super NavHostKt$NavHost$15> dVar) {
        super(2, dVar);
        this.$transition = transition;
        this.$zIndices = map;
        this.$visibleEntries$delegate = state;
        this.$composeNavigator = composeNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new NavHostKt$NavHost$15(this.$transition, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((NavHostKt$NavHost$15) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        List NavHost$lambda$6;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            if (l0.g(this.$transition.getCurrentState(), this.$transition.getTargetState())) {
                NavHost$lambda$6 = NavHostKt.NavHost$lambda$6(this.$visibleEntries$delegate);
                ComposeNavigator composeNavigator = this.$composeNavigator;
                Iterator it = NavHost$lambda$6.iterator();
                while (it.hasNext()) {
                    composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
                }
                Map<String, Float> map = this.$zIndices;
                Transition<NavBackStackEntry> transition = this.$transition;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    if (!l0.g(entry.getKey(), transition.getTargetState().getId())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map<String, Float> map2 = this.$zIndices;
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    map2.remove(((Map.Entry) it2.next()).getKey());
                }
            }
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
