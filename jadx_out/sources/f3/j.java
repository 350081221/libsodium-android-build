package f3;

/* loaded from: classes3.dex */
public class j extends IllegalArgumentException {
    private static final String MESSAGE = "GifDrawable和Bitmap有且只有一个为null";

    public j() {
        super(MESSAGE);
    }

    public j(Throwable th) {
        super(MESSAGE, th);
    }
}
