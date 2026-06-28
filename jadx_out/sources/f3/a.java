package f3;

/* loaded from: classes3.dex */
public class a extends RuntimeException {
    private static final String MESSAGE = "Bitmap缓存过程异常";

    public a() {
        super(MESSAGE);
    }

    public a(Throwable th) {
        super(MESSAGE, th);
    }
}
