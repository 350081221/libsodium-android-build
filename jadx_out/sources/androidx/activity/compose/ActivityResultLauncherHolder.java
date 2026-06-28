package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.i0;
import kotlin.r2;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0006R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/activity/compose/ActivityResultLauncherHolder;", "I", "", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "Lkotlin/r2;", "launch", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "Landroidx/activity/result/ActivityResultLauncher;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "<init>", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 8;

    @m
    private ActivityResultLauncher<I> launcher;

    @m
    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(I i5, @m ActivityOptionsCompat activityOptionsCompat) {
        r2 r2Var;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(i5, activityOptionsCompat);
            r2Var = r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    public final void setLauncher(@m ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        r2 r2Var;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            r2Var = r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
