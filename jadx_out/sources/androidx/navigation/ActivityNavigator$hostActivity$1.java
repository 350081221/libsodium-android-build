package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Context;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ActivityNavigator$hostActivity$1 extends n0 implements l<Context, Context> {
    public static final ActivityNavigator$hostActivity$1 INSTANCE = new ActivityNavigator$hostActivity$1();

    ActivityNavigator$hostActivity$1() {
        super(1);
    }

    @Override // v3.l
    @m
    public final Context invoke(@p4.l Context it) {
        l0.p(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }
}
