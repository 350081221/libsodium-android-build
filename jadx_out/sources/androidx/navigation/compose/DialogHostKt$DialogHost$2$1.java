package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import java.util.Set;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1855#2,2:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$DialogHost$2$1\n*L\n75#1:138,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DialogHostKt$DialogHost$2$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;
    final /* synthetic */ State<Set<NavBackStackEntry>> $transitionInProgress$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogHostKt$DialogHost$2$1(State<? extends Set<NavBackStackEntry>> state, DialogNavigator dialogNavigator, SnapshotStateList<NavBackStackEntry> snapshotStateList, d<? super DialogHostKt$DialogHost$2$1> dVar) {
        super(2, dVar);
        this.$transitionInProgress$delegate = state;
        this.$dialogNavigator = dialogNavigator;
        this.$dialogsToDispose = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new DialogHostKt$DialogHost$2$1(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((DialogHostKt$DialogHost$2$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Set<NavBackStackEntry> DialogHost$lambda$1;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            DialogHost$lambda$1 = DialogHostKt.DialogHost$lambda$1(this.$transitionInProgress$delegate);
            DialogNavigator dialogNavigator = this.$dialogNavigator;
            SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
            for (NavBackStackEntry navBackStackEntry : DialogHost$lambda$1) {
                if (!dialogNavigator.getBackStack$navigation_compose_release().getValue().contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                    dialogNavigator.onTransitionComplete$navigation_compose_release(navBackStackEntry);
                }
            }
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
