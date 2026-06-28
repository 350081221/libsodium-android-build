package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\b"}, d2 = {"Landroidx/activity/EdgeToEdgeApi30;", "Landroidx/activity/EdgeToEdgeApi29;", "Landroid/view/Window;", "window", "Lkotlin/r2;", "adjustLayoutInDisplayCutoutMode", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(30)
/* loaded from: classes.dex */
final class EdgeToEdgeApi30 extends EdgeToEdgeApi29 {
    @Override // androidx.activity.EdgeToEdgeApi28, androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void adjustLayoutInDisplayCutoutMode(@p4.l Window window) {
        l0.p(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
