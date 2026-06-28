package f3;

import android.annotation.TargetApi;

/* loaded from: classes3.dex */
public class b extends Exception {
    private static final String MESSAGE = "Bitmap 缓存加载失败";

    public b() {
        super(MESSAGE);
    }

    public b(Throwable th) {
        super(MESSAGE, th);
    }

    @TargetApi(24)
    public b(Throwable th, boolean z4, boolean z5) {
        super(MESSAGE, th, z4, z5);
    }
}
