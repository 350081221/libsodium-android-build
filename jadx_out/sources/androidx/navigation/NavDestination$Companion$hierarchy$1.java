package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/navigation/NavDestination;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavDestination$Companion$hierarchy$1 extends n0 implements l<NavDestination, NavDestination> {
    public static final NavDestination$Companion$hierarchy$1 INSTANCE = new NavDestination$Companion$hierarchy$1();

    NavDestination$Companion$hierarchy$1() {
        super(1);
    }

    @Override // v3.l
    @m
    public final NavDestination invoke(@p4.l NavDestination it) {
        l0.p(it, "it");
        return it.getParent();
    }
}
