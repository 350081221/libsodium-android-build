package f3;

import android.annotation.TargetApi;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class f extends Exception {
    private static final String IMAGE_DECODE_FAILURE = "Image Decode Failure";
    private OutOfMemoryError error;

    public f() {
        super(IMAGE_DECODE_FAILURE);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        OutOfMemoryError outOfMemoryError = this.error;
        if (outOfMemoryError != null) {
            outOfMemoryError.printStackTrace();
        } else {
            super.printStackTrace();
        }
    }

    public f(Throwable th) {
        super(IMAGE_DECODE_FAILURE, th);
        if (th instanceof OutOfMemoryError) {
            this.error = (OutOfMemoryError) th;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        OutOfMemoryError outOfMemoryError = this.error;
        if (outOfMemoryError != null) {
            outOfMemoryError.printStackTrace(printStream);
        } else {
            super.printStackTrace(printStream);
        }
    }

    @TargetApi(24)
    public f(Throwable th, boolean z4, boolean z5) {
        super(IMAGE_DECODE_FAILURE, th, z4, z5);
        if (th instanceof OutOfMemoryError) {
            this.error = (OutOfMemoryError) th;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        OutOfMemoryError outOfMemoryError = this.error;
        if (outOfMemoryError != null) {
            outOfMemoryError.printStackTrace(printWriter);
        } else {
            super.printStackTrace(printWriter);
        }
    }
}
