package f3;

import android.annotation.TargetApi;

/* loaded from: classes3.dex */
public class c extends Exception {
    private static final String MESSAGE = "Bitmap 缓存不存在";

    public c() {
        super(MESSAGE);
    }

    public c(Throwable th) {
        super(MESSAGE, th);
    }

    @TargetApi(24)
    public c(Throwable th, boolean z4, boolean z5) {
        super(MESSAGE, th, z4, z5);
    }
}
