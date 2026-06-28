package androidx.navigation;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.u0;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/u0;", "", "", "invoke", "()Lkotlin/u0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavDeepLink$fragArgsAndRegex$2 extends n0 implements v3.a<u0<? extends List<String>, ? extends String>> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragArgsAndRegex$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // v3.a
    @m
    public final u0<? extends List<String>, ? extends String> invoke() {
        u0<? extends List<String>, ? extends String> parseFragment;
        parseFragment = this.this$0.parseFragment();
        return parseFragment;
    }
}
