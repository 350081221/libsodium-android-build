package o0;

import com.android.dx.io.Opcodes;
import com.android.multidex.ClassPathElement;
import com.umeng.analytics.pro.cx;
import kotlin.jvm.internal.o;
import okio.q1;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20828a = 128;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20829b = 64;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20830c = 24;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20831d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20832e = 16;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20833f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20834g = -128;

    /* renamed from: h, reason: collision with root package name */
    public static final char f20835h = '=';

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f20836i = new byte[128];

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f20837j = new char[64];

    static {
        int i5;
        int i6;
        int i7 = 0;
        for (int i8 = 0; i8 < 128; i8++) {
            f20836i[i8] = -1;
        }
        for (int i9 = 90; i9 >= 65; i9--) {
            f20836i[i9] = (byte) (i9 - 65);
        }
        int i10 = 122;
        while (true) {
            i5 = 26;
            if (i10 < 97) {
                break;
            }
            f20836i[i10] = (byte) ((i10 - 97) + 26);
            i10--;
        }
        int i11 = 57;
        while (true) {
            i6 = 52;
            if (i11 < 48) {
                break;
            }
            f20836i[i11] = (byte) ((i11 - 48) + 52);
            i11--;
        }
        byte[] bArr = f20836i;
        bArr[43] = 62;
        bArr[47] = q1.f21021a;
        for (int i12 = 0; i12 <= 25; i12++) {
            f20837j[i12] = (char) (i12 + 65);
        }
        int i13 = 0;
        while (i5 <= 51) {
            f20837j[i5] = (char) (i13 + 97);
            i5++;
            i13++;
        }
        while (i6 <= 61) {
            f20837j[i6] = (char) (i7 + 48);
            i6++;
            i7++;
        }
        char[] cArr = f20837j;
        cArr[62] = '+';
        cArr[63] = ClassPathElement.SEPARATOR_CHAR;
    }

    public static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (!f(cArr[i6])) {
                cArr[i5] = cArr[i6];
                i5++;
            }
        }
        return i5;
    }

    public static String b(byte[] bArr) {
        int i5;
        int i6;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i7 = length % 24;
        int i8 = length / 24;
        if (i7 != 0) {
            i5 = i8 + 1;
        } else {
            i5 = i8;
        }
        char[] cArr = new char[i5 * 4];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i8) {
            int i12 = i10 + 1;
            byte b5 = bArr[i10];
            int i13 = i12 + 1;
            byte b6 = bArr[i12];
            int i14 = i13 + 1;
            byte b7 = bArr[i13];
            byte b8 = (byte) (b6 & cx.f12477m);
            byte b9 = (byte) (b5 & 3);
            int i15 = b5 & o.f19427b;
            int i16 = b5 >> 2;
            if (i15 != 0) {
                i16 ^= 192;
            }
            byte b10 = (byte) i16;
            int i17 = b6 & o.f19427b;
            int i18 = b6 >> 4;
            if (i17 != 0) {
                i18 ^= 240;
            }
            byte b11 = (byte) i18;
            if ((b7 & o.f19427b) == 0) {
                i6 = b7 >> 6;
            } else {
                i6 = (b7 >> 6) ^ Opcodes.INVOKE_CUSTOM;
            }
            int i19 = i11 + 1;
            char[] cArr2 = f20837j;
            cArr[i11] = cArr2[b10];
            int i20 = i19 + 1;
            cArr[i19] = cArr2[(b9 << 4) | b11];
            int i21 = i20 + 1;
            cArr[i20] = cArr2[(b8 << 2) | ((byte) i6)];
            cArr[i21] = cArr2[b7 & q1.f21021a];
            i9++;
            i11 = i21 + 1;
            i10 = i14;
        }
        if (i7 == 8) {
            byte b12 = bArr[i10];
            byte b13 = (byte) (b12 & 3);
            int i22 = b12 & o.f19427b;
            int i23 = b12 >> 2;
            if (i22 != 0) {
                i23 ^= 192;
            }
            int i24 = i11 + 1;
            char[] cArr3 = f20837j;
            cArr[i11] = cArr3[(byte) i23];
            int i25 = i24 + 1;
            cArr[i24] = cArr3[b13 << 4];
            cArr[i25] = f20835h;
            cArr[i25 + 1] = f20835h;
        } else if (i7 == 16) {
            byte b14 = bArr[i10];
            byte b15 = bArr[i10 + 1];
            byte b16 = (byte) (b15 & cx.f12477m);
            byte b17 = (byte) (b14 & 3);
            int i26 = b14 & o.f19427b;
            int i27 = b14 >> 2;
            if (i26 != 0) {
                i27 ^= 192;
            }
            byte b18 = (byte) i27;
            int i28 = b15 & o.f19427b;
            int i29 = b15 >> 4;
            if (i28 != 0) {
                i29 ^= 240;
            }
            int i30 = i11 + 1;
            char[] cArr4 = f20837j;
            cArr[i11] = cArr4[b18];
            int i31 = i30 + 1;
            cArr[i30] = cArr4[((byte) i29) | (b17 << 4)];
            cArr[i31] = cArr4[b16 << 2];
            cArr[i31 + 1] = f20835h;
        }
        return new String(cArr);
    }

    public static boolean c(char c5) {
        return c5 < 128 && f20836i[c5] != -1;
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int a5 = a(charArray);
        if (a5 % 4 != 0) {
            return null;
        }
        int i5 = a5 / 4;
        if (i5 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i5 * 3];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i5 - 1) {
            int i9 = i7 + 1;
            char c5 = charArray[i7];
            if (c(c5)) {
                int i10 = i9 + 1;
                char c6 = charArray[i9];
                if (c(c6)) {
                    int i11 = i10 + 1;
                    char c7 = charArray[i10];
                    if (c(c7)) {
                        int i12 = i11 + 1;
                        char c8 = charArray[i11];
                        if (c(c8)) {
                            byte[] bArr2 = f20836i;
                            byte b5 = bArr2[c5];
                            byte b6 = bArr2[c6];
                            byte b7 = bArr2[c7];
                            byte b8 = bArr2[c8];
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((b5 << 2) | (b6 >> 4));
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((b6 & cx.f12477m) << 4) | ((b7 >> 2) & 15));
                            i8 = i14 + 1;
                            bArr[i14] = (byte) ((b7 << 6) | b8);
                            i6++;
                            i7 = i12;
                        }
                    }
                }
            }
            return null;
        }
        int i15 = i7 + 1;
        char c9 = charArray[i7];
        if (!c(c9)) {
            return null;
        }
        int i16 = i15 + 1;
        char c10 = charArray[i15];
        if (!c(c10)) {
            return null;
        }
        byte[] bArr3 = f20836i;
        byte b9 = bArr3[c9];
        byte b10 = bArr3[c10];
        int i17 = i16 + 1;
        char c11 = charArray[i16];
        char c12 = charArray[i17];
        if (c(c11) && c(c12)) {
            byte b11 = bArr3[c11];
            byte b12 = bArr3[c12];
            int i18 = i8 + 1;
            bArr[i8] = (byte) ((b9 << 2) | (b10 >> 4));
            bArr[i18] = (byte) (((b10 & cx.f12477m) << 4) | ((b11 >> 2) & 15));
            bArr[i18 + 1] = (byte) (b12 | (b11 << 6));
            return bArr;
        }
        if (e(c11) && e(c12)) {
            if ((b10 & cx.f12477m) != 0) {
                return null;
            }
            int i19 = i6 * 3;
            byte[] bArr4 = new byte[i19 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i19);
            bArr4[i8] = (byte) ((b9 << 2) | (b10 >> 4));
            return bArr4;
        }
        if (e(c11) || !e(c12)) {
            return null;
        }
        byte b13 = bArr3[c11];
        if ((b13 & 3) != 0) {
            return null;
        }
        int i20 = i6 * 3;
        byte[] bArr5 = new byte[i20 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, i20);
        bArr5[i8] = (byte) ((b9 << 2) | (b10 >> 4));
        bArr5[i8 + 1] = (byte) (((b13 >> 2) & 15) | ((b10 & cx.f12477m) << 4));
        return bArr5;
    }

    public static boolean e(char c5) {
        return c5 == '=';
    }

    public static boolean f(char c5) {
        return c5 == ' ' || c5 == '\r' || c5 == '\n' || c5 == '\t';
    }
}
