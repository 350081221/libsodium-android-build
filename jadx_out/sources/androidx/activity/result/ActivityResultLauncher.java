package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\b\u0010\n\u001a\u00020\u0004H'R\u001e\u0010\u000e\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/activity/result/ActivityResultLauncher;", "I", "", "input", "Lkotlin/r2;", "launch", "(Ljava/lang/Object;)V", "Landroidx/core/app/ActivityOptionsCompat;", "options", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "Landroidx/activity/result/contract/ActivityResultContract;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    @l
    public abstract ActivityResultContract<I, ?> getContract();

    public void launch(I i5) {
        launch(i5, null);
    }

    public abstract void launch(I i5, @m ActivityOptionsCompat activityOptionsCompat);

    @MainThread
    public abstract void unregister();
}
