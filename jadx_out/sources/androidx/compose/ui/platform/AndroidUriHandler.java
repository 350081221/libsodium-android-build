package androidx.compose.ui.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidUriHandler;", "Landroidx/compose/ui/platform/UriHandler;", "", "uri", "Lkotlin/r2;", "openUri", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;

    @p4.l
    private final Context context;

    public AndroidUriHandler(@p4.l Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public void openUri(@p4.l String str) {
        this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
