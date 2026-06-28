package androidx.navigation.fragment;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.u0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/u0;", "", "", "it", "invoke", "(Lkotlin/u0;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class FragmentNavigator$popBackStack$1$1 extends n0 implements l<u0<? extends String, ? extends Boolean>, String> {
    public static final FragmentNavigator$popBackStack$1$1 INSTANCE = new FragmentNavigator$popBackStack$1$1();

    FragmentNavigator$popBackStack$1$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ String invoke(u0<? extends String, ? extends Boolean> u0Var) {
        return invoke2((u0<String, Boolean>) u0Var);
    }

    @p4.l
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final String invoke2(@p4.l u0<String, Boolean> it) {
        l0.p(it, "it");
        return it.getFirst();
    }
}
