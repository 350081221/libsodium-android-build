package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/regex/Pattern;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$mimeTypePattern$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
/* loaded from: classes2.dex */
public final class NavDeepLink$mimeTypePattern$2 extends n0 implements v3.a<Pattern> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$mimeTypePattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // v3.a
    @m
    public final Pattern invoke() {
        String str;
        str = this.this$0.mimeTypeRegex;
        if (str != null) {
            return Pattern.compile(str);
        }
        return null;
    }
}
