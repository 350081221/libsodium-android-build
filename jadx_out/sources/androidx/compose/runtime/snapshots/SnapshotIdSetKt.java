package androidx.compose.runtime.snapshots;

import kotlin.i0;
import okhttp3.internal.ws.WebSocketProtocol;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"lowestBitOf", "", "bits", "", "binarySearch", "", t0.b.f22420d, "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotIdSetKt {
    public static final int binarySearch(@l int[] iArr, int i5) {
        int length = iArr.length - 1;
        int i6 = 0;
        while (i6 <= length) {
            int i7 = (i6 + length) >>> 1;
            int i8 = iArr[i7];
            if (i5 > i8) {
                i6 = i7 + 1;
            } else if (i5 < i8) {
                length = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i6 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lowestBitOf(long j5) {
        int i5;
        if ((4294967295L & j5) == 0) {
            i5 = 32;
            j5 >>= 32;
        } else {
            i5 = 0;
        }
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & j5) == 0) {
            i5 += 16;
            j5 >>= 16;
        }
        if ((255 & j5) == 0) {
            i5 += 8;
            j5 >>= 8;
        }
        if ((15 & j5) == 0) {
            i5 += 4;
            j5 >>= 4;
        }
        if ((1 & j5) != 0) {
            return i5;
        }
        if ((2 & j5) != 0) {
            return i5 + 1;
        }
        if ((4 & j5) != 0) {
            return i5 + 2;
        }
        if ((j5 & 8) != 0) {
            return i5 + 3;
        }
        return -1;
    }
}
