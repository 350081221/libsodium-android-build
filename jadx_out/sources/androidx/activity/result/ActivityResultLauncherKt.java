package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a%\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "Landroidx/core/app/ActivityOptionsCompat;", "options", "Lkotlin/r2;", "launch", "launchUnit", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/core/app/ActivityOptionsCompat;)V", "activity_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActivityResultLauncherKt {
    public static final void launch(@l ActivityResultLauncher<Void> activityResultLauncher, @m ActivityOptionsCompat activityOptionsCompat) {
        l0.p(activityResultLauncher, "<this>");
        activityResultLauncher.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(activityResultLauncher, activityOptionsCompat);
    }

    @h(name = "launchUnit")
    public static final void launchUnit(@l ActivityResultLauncher<r2> activityResultLauncher, @m ActivityOptionsCompat activityOptionsCompat) {
        l0.p(activityResultLauncher, "<this>");
        activityResultLauncher.launch(r2.f19517a, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(activityResultLauncher, activityOptionsCompat);
    }
}
