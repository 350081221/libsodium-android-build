package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$visibleEntries$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n766#2:369\n857#2,2:370\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$visibleEntries$2$1\n*L\n233#1:369\n233#1:370,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$visibleEntries$2$1 extends n0 implements a<List<? extends NavBackStackEntry>> {
    final /* synthetic */ State<List<NavBackStackEntry>> $allVisibleEntries$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$visibleEntries$2$1(State<? extends List<NavBackStackEntry>> state) {
        super(0);
        this.$allVisibleEntries$delegate = state;
    }

    @Override // v3.a
    @l
    public final List<? extends NavBackStackEntry> invoke() {
        List NavHost$lambda$4;
        NavHost$lambda$4 = NavHostKt.NavHost$lambda$4(this.$allVisibleEntries$delegate);
        ArrayList arrayList = new ArrayList();
        for (Object obj : NavHost$lambda$4) {
            if (l0.g(((NavBackStackEntry) obj).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
