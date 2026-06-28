package androidx.navigation.fragment;

import androidx.lifecycle.Observer;
import kotlin.i0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.l0;
import kotlin.v;
import p4.m;
import v3.l;

@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FragmentNavigator$sam$androidx_lifecycle_Observer$0 implements Observer, d0 {
    private final /* synthetic */ l function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentNavigator$sam$androidx_lifecycle_Observer$0(l function) {
        l0.p(function, "function");
        this.function = function;
    }

    public final boolean equals(@m Object obj) {
        if ((obj instanceof Observer) && (obj instanceof d0)) {
            return l0.g(getFunctionDelegate(), ((d0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    @p4.l
    public final v<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
