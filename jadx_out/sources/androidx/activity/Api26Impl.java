package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/activity/Api26Impl;", "", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", DownloadProviderHook.COLUMN_FILE_NAME_HINT, "Lkotlin/r2;", "setPipParamsSourceRectHint", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
/* loaded from: classes.dex */
public final class Api26Impl {

    @p4.l
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final void setPipParamsSourceRectHint(@p4.l Activity activity, @p4.l Rect hint) {
        PictureInPictureParams.Builder sourceRectHint;
        PictureInPictureParams build;
        l0.p(activity, "activity");
        l0.p(hint, "hint");
        sourceRectHint = new PictureInPictureParams.Builder().setSourceRectHint(hint);
        build = sourceRectHint.build();
        activity.setPictureInPictureParams(build);
    }
}
