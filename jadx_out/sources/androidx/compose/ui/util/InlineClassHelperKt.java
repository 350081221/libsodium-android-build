package androidx.compose.ui.util;

import kotlin.i0;
import kotlin.jvm.internal.a0;
import t0.b;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0086\b\u001a\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0086\b¨\u0006\f"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "unpackFloat1", b.f22420d, "unpackFloat2", "unpackInt1", "unpackInt2", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f5, float f6) {
        return (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final long packInts(int i5, int i6) {
        return (i6 & 4294967295L) | (i5 << 32);
    }

    public static final float unpackFloat1(long j5) {
        a0 a0Var = a0.f19382a;
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float unpackFloat2(long j5) {
        a0 a0Var = a0.f19382a;
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final int unpackInt1(long j5) {
        return (int) (j5 >> 32);
    }

    public static final int unpackInt2(long j5) {
        return (int) (j5 & 4294967295L);
    }
}
