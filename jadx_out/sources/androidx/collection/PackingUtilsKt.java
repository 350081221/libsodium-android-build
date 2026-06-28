package androidx.collection;

import kotlin.i0;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0019\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0080\b¨\u0006\u0007"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PackingUtilsKt {
    public static final long packFloats(float f5, float f6) {
        return (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final long packInts(int i5, int i6) {
        return (i6 & 4294967295L) | (i5 << 32);
    }
}
