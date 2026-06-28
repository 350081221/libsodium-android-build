package androidx.navigation;

import android.app.Activity;
import androidx.annotation.MainThread;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u0087\b¨\u0006\u0005"}, d2 = {"navArgs", "Landroidx/navigation/NavArgsLazy;", "Args", "Landroidx/navigation/NavArgs;", "Landroid/app/Activity;", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityNavArgsLazyKt {
    @MainThread
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(Activity activity) {
        l0.p(activity, "<this>");
        l0.y(4, "Args");
        return new NavArgsLazy<>(l1.d(NavArgs.class), new ActivityNavArgsLazyKt$navArgs$1(activity));
    }
}
