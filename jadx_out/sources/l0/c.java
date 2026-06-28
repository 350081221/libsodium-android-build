package l0;

/* loaded from: classes2.dex */
public class c {
    public static byte[] a(int i5) {
        byte[] bArr = {(byte) ((r3 >> 8) % 256), (byte) (r3 % 256), (byte) (r3 % 256), (byte) (i5 % 256)};
        int i6 = i5 >> 8;
        int i7 = i6 >> 8;
        return bArr;
    }
}
