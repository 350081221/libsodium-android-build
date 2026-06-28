package f3;

import android.annotation.TargetApi;

/* loaded from: classes3.dex */
public class k extends RuntimeException {
    private static final String MESSAGE = "ImageHolder的source只能在INIT阶段修改";

    public k() {
        super(MESSAGE);
    }

    public k(Throwable th) {
        super(MESSAGE, th);
    }

    @TargetApi(24)
    public k(Throwable th, boolean z4, boolean z5) {
        super(MESSAGE, th, z4, z5);
    }
}
