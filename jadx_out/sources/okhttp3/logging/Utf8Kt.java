package okhttp3.logging;

import java.io.EOFException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lokio/l;", "", "isProbablyUtf8", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(@l okio.l isProbablyUtf8) {
        long C;
        l0.p(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            okio.l lVar = new okio.l();
            C = u.C(isProbablyUtf8.M0(), 64L);
            isProbablyUtf8.y(lVar, 0L, C);
            for (int i5 = 0; i5 < 16; i5++) {
                if (!lVar.e0()) {
                    int k02 = lVar.k0();
                    if (Character.isISOControl(k02) && !Character.isWhitespace(k02)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
