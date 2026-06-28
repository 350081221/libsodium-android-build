package kotlin;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\b\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\r\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0003*\u00020\u0003H\u0087\b¨\u0006\u000b"}, d2 = {"countLeadingZeroBits", "", "", "", "countOneBits", "countTrailingZeroBits", "rotateLeft", "bitCount", "rotateRight", "takeHighestOneBit", "takeLowestOneBit", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
class q0 extends p0 {
    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final int T0(byte b5) {
        return Integer.numberOfLeadingZeros(b5 & y1.f19838d) - 24;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final int U0(short s5) {
        return Integer.numberOfLeadingZeros(s5 & m2.f19496d) - 16;
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final int V0(byte b5) {
        return Integer.bitCount(b5 & y1.f19838d);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final int W0(short s5) {
        return Integer.bitCount(s5 & m2.f19496d);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final int X0(byte b5) {
        return Integer.numberOfTrailingZeros(b5 | 256);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final int Y0(short s5) {
        return Integer.numberOfTrailingZeros(s5 | m2.f19495c);
    }

    @g1(version = "1.6")
    @v2(markerClass = {r.class})
    public static final byte Z0(byte b5, int i5) {
        int i6 = i5 & 7;
        return (byte) (((b5 & 255) >>> (8 - i6)) | (b5 << i6));
    }

    @g1(version = "1.6")
    @v2(markerClass = {r.class})
    public static final short a1(short s5, int i5) {
        int i6 = i5 & 15;
        return (short) (((s5 & 65535) >>> (16 - i6)) | (s5 << i6));
    }

    @g1(version = "1.6")
    @v2(markerClass = {r.class})
    public static final byte b1(byte b5, int i5) {
        int i6 = i5 & 7;
        return (byte) (((b5 & 255) >>> i6) | (b5 << (8 - i6)));
    }

    @g1(version = "1.6")
    @v2(markerClass = {r.class})
    public static final short c1(short s5, int i5) {
        int i6 = i5 & 15;
        return (short) (((s5 & 65535) >>> i6) | (s5 << (16 - i6)));
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final byte d1(byte b5) {
        return (byte) Integer.highestOneBit(b5 & y1.f19838d);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final short e1(short s5) {
        return (short) Integer.highestOneBit(s5 & m2.f19496d);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final byte f1(byte b5) {
        return (byte) Integer.lowestOneBit(b5);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    @v2(markerClass = {r.class})
    private static final short g1(short s5) {
        return (short) Integer.lowestOneBit(s5);
    }
}
