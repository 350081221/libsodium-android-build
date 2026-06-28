package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.u0;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavDeepLink$fragRegex$2 extends n0 implements v3.a<String> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragRegex$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // v3.a
    @m
    public final String invoke() {
        u0 fragArgsAndRegex;
        fragArgsAndRegex = this.this$0.getFragArgsAndRegex();
        if (fragArgsAndRegex != null) {
            return (String) fragArgsAndRegex.getSecond();
        }
        return null;
    }
}
