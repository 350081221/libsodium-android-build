package androidx.navigation;

import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.u0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavDeepLink$fragArgs$2 extends n0 implements v3.a<List<String>> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragArgs$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // v3.a
    @l
    public final List<String> invoke() {
        u0 fragArgsAndRegex;
        List<String> list;
        fragArgsAndRegex = this.this$0.getFragArgsAndRegex();
        return (fragArgsAndRegex == null || (list = (List) fragArgsAndRegex.getFirst()) == null) ? new ArrayList() : list;
    }
}
