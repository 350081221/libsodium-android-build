package android.net.http;

import android.os.SystemClock;
import android.util.Log;

/* loaded from: assets/org.apache.http.legacy.boot */
class HttpLog {
    private static final boolean DEBUG = false;
    private static final String LOGTAG = "http";
    static final boolean LOGV = false;

    HttpLog() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(String logMe) {
        Log.v("http", SystemClock.uptimeMillis() + " " + Thread.currentThread().getName() + " " + logMe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(String logMe) {
        Log.e("http", logMe);
    }
}
