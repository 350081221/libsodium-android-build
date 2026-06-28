package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes2.dex */
public final class IconKt {
    @l
    @RequiresApi(26)
    public static final Icon toAdaptiveIcon(@l Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        return createWithAdaptiveBitmap;
    }

    @l
    @RequiresApi(26)
    public static final Icon toIcon(@l Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    @l
    @RequiresApi(26)
    public static final Icon toIcon(@l Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    @l
    @RequiresApi(26)
    public static final Icon toIcon(@l byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}
