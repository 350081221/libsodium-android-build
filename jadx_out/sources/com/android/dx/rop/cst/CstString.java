package com.android.dx.rop.cst;

import com.android.dx.io.Opcodes;
import com.android.dx.rop.type.Type;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import kotlin.text.k0;

/* loaded from: classes2.dex */
public final class CstString extends TypedConstant {
    public static final CstString EMPTY_STRING = new CstString("");
    private final ByteArray bytes;
    private final String string;

    public CstString(String str) {
        if (str != null) {
            this.string = str.intern();
            this.bytes = new ByteArray(stringToUtf8Bytes(str));
            return;
        }
        throw new NullPointerException("string == null");
    }

    public static byte[] stringToUtf8Bytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt != 0 && charAt < 128) {
                bArr[i5] = (byte) charAt;
                i5++;
            } else if (charAt < 2048) {
                bArr[i5] = (byte) (((charAt >> 6) & 31) | 192);
                bArr[i5 + 1] = (byte) ((charAt & '?') | 128);
                i5 += 2;
            } else {
                bArr[i5] = (byte) (((charAt >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                bArr[i5 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                bArr[i5 + 2] = (byte) ((charAt & '?') | 128);
                i5 += 3;
            }
        }
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        return bArr2;
    }

    private static String throwBadUtf8(int i5, int i6) {
        throw new IllegalArgumentException("bad utf-8 byte " + Hex.u1(i5) + " at offset " + Hex.u4(i6));
    }

    public static String utf8BytesToString(ByteArray byteArray) {
        char c5;
        int size = byteArray.size();
        char[] cArr = new char[size];
        int i5 = 0;
        int i6 = 0;
        while (size > 0) {
            int unsignedByte = byteArray.getUnsignedByte(i6);
            switch (unsignedByte >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    size--;
                    if (unsignedByte == 0) {
                        return throwBadUtf8(unsignedByte, i6);
                    }
                    c5 = (char) unsignedByte;
                    i6++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return throwBadUtf8(unsignedByte, i6);
                case 12:
                case 13:
                    size -= 2;
                    if (size < 0) {
                        return throwBadUtf8(unsignedByte, i6);
                    }
                    int i7 = i6 + 1;
                    int unsignedByte2 = byteArray.getUnsignedByte(i7);
                    if ((unsignedByte2 & 192) != 128) {
                        return throwBadUtf8(unsignedByte2, i7);
                    }
                    int i8 = ((unsignedByte & 31) << 6) | (unsignedByte2 & 63);
                    if (i8 != 0 && i8 < 128) {
                        return throwBadUtf8(unsignedByte2, i7);
                    }
                    c5 = (char) i8;
                    i6 += 2;
                    break;
                case 14:
                    size -= 3;
                    if (size < 0) {
                        return throwBadUtf8(unsignedByte, i6);
                    }
                    int i9 = i6 + 1;
                    int unsignedByte3 = byteArray.getUnsignedByte(i9);
                    int i10 = unsignedByte3 & 192;
                    if (i10 != 128) {
                        return throwBadUtf8(unsignedByte3, i9);
                    }
                    int i11 = i6 + 2;
                    int unsignedByte4 = byteArray.getUnsignedByte(i11);
                    if (i10 != 128) {
                        return throwBadUtf8(unsignedByte4, i11);
                    }
                    int i12 = ((unsignedByte & 15) << 12) | ((unsignedByte3 & 63) << 6) | (unsignedByte4 & 63);
                    if (i12 < 2048) {
                        return throwBadUtf8(unsignedByte4, i11);
                    }
                    c5 = (char) i12;
                    i6 += 3;
                    break;
            }
            cArr[i5] = c5;
            i5++;
        }
        return new String(cArr, 0, i5);
    }

    @Override // com.android.dx.rop.cst.Constant
    protected int compareTo0(Constant constant) {
        return this.string.compareTo(((CstString) constant).string);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CstString)) {
            return false;
        }
        return this.string.equals(((CstString) obj).string);
    }

    public ByteArray getBytes() {
        return this.bytes;
    }

    public String getString() {
        return this.string;
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public Type getType() {
        return Type.STRING;
    }

    public int getUtf16Size() {
        return this.string.length();
    }

    public int getUtf8Size() {
        return this.bytes.size();
    }

    public int hashCode() {
        return this.string.hashCode();
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        char c5;
        boolean z4;
        int length = this.string.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = this.string.charAt(i5);
            if (charAt >= ' ' && charAt < 127) {
                if (charAt == '\'' || charAt == '\"' || charAt == '\\') {
                    sb.append('\\');
                }
                sb.append(charAt);
            } else if (charAt <= 127) {
                if (charAt != '\t') {
                    if (charAt != '\n') {
                        if (charAt != '\r') {
                            if (i5 < length - 1) {
                                c5 = this.string.charAt(i5 + 1);
                            } else {
                                c5 = 0;
                            }
                            if (c5 >= '0' && c5 <= '7') {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            sb.append('\\');
                            for (int i6 = 6; i6 >= 0; i6 -= 3) {
                                char c6 = (char) (((charAt >> i6) & 7) + 48);
                                if (c6 != '0' || z4) {
                                    sb.append(c6);
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                sb.append('0');
                            }
                        } else {
                            sb.append("\\r");
                        }
                    } else {
                        sb.append("\\n");
                    }
                } else {
                    sb.append("\\t");
                }
            } else {
                sb.append("\\u");
                sb.append(Character.forDigit(charAt >> '\f', 16));
                sb.append(Character.forDigit((charAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((charAt >> 4) & 15, 16));
                sb.append(Character.forDigit(charAt & 15, 16));
            }
        }
        return sb.toString();
    }

    public String toQuoted() {
        return k0.f19765b + toHuman() + k0.f19765b;
    }

    public String toString() {
        return "string{\"" + toHuman() + "\"}";
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "utf8";
    }

    public String toQuoted(int i5) {
        String str;
        String human = toHuman();
        if (human.length() <= i5 - 2) {
            str = "";
        } else {
            human = human.substring(0, i5 - 5);
            str = "...";
        }
        return k0.f19765b + human + str + k0.f19765b;
    }

    public CstString(ByteArray byteArray) {
        if (byteArray != null) {
            this.bytes = byteArray;
            this.string = utf8BytesToString(byteArray).intern();
            return;
        }
        throw new NullPointerException("bytes == null");
    }
}
