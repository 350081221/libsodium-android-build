package okio;

import com.umeng.analytics.pro.cx;
import java.util.Arrays;
import kotlin.y1;
import okio.n;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\nH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\r"}, d2 = {"BASE64", "", "getBASE64$annotations", "()V", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE$annotations", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-Base64")
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final byte[] f20854a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final byte[] f20855b;

    static {
        n.a aVar = n.Companion;
        f20854a = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        f20855b = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    @p4.m
    public static final byte[] a(@p4.l String str) {
        boolean z4;
        boolean z5;
        int i5;
        char charAt;
        kotlin.jvm.internal.l0.p(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i6 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            boolean z6 = true;
            if (i7 < length) {
                char charAt2 = str.charAt(i7);
                if ('A' <= charAt2 && charAt2 < '[') {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i5 = charAt2 - 'A';
                } else {
                    if ('a' <= charAt2 && charAt2 < '{') {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        i5 = charAt2 - 'G';
                    } else {
                        if ('0' > charAt2 || charAt2 >= ':') {
                            z6 = false;
                        }
                        if (z6) {
                            i5 = charAt2 + 4;
                        } else if (charAt2 != '+' && charAt2 != '-') {
                            if (charAt2 != '/' && charAt2 != '_') {
                                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                                    return null;
                                }
                                i7++;
                            } else {
                                i5 = 63;
                            }
                        } else {
                            i5 = 62;
                        }
                    }
                }
                i9 = (i9 << 6) | i5;
                i8++;
                if (i8 % 4 == 0) {
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (i9 >> 16);
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) (i9 >> 8);
                    bArr[i12] = (byte) i9;
                    i10 = i12 + 1;
                }
                i7++;
            } else {
                int i13 = i8 % 4;
                if (i13 == 1) {
                    return null;
                }
                if (i13 != 2) {
                    if (i13 == 3) {
                        int i14 = i9 << 6;
                        int i15 = i10 + 1;
                        bArr[i10] = (byte) (i14 >> 16);
                        i10 = i15 + 1;
                        bArr[i15] = (byte) (i14 >> 8);
                    }
                } else {
                    bArr[i10] = (byte) ((i9 << 12) >> 16);
                    i10++;
                }
                if (i10 == i6) {
                    return bArr;
                }
                byte[] copyOf = Arrays.copyOf(bArr, i10);
                kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
        }
    }

    @p4.l
    public static final String b(@p4.l byte[] bArr, @p4.l byte[] map) {
        kotlin.jvm.internal.l0.p(bArr, "<this>");
        kotlin.jvm.internal.l0.p(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i5 + 1;
            byte b5 = bArr[i5];
            int i8 = i7 + 1;
            byte b6 = bArr[i7];
            int i9 = i8 + 1;
            byte b7 = bArr[i8];
            int i10 = i6 + 1;
            bArr2[i6] = map[(b5 & y1.f19838d) >> 2];
            int i11 = i10 + 1;
            bArr2[i10] = map[((b5 & 3) << 4) | ((b6 & y1.f19838d) >> 4)];
            int i12 = i11 + 1;
            bArr2[i11] = map[((b6 & cx.f12477m) << 2) | ((b7 & y1.f19838d) >> 6)];
            i6 = i12 + 1;
            bArr2[i12] = map[b7 & q1.f21021a];
            i5 = i9;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i13 = i5 + 1;
                byte b8 = bArr[i5];
                byte b9 = bArr[i13];
                int i14 = i6 + 1;
                bArr2[i6] = map[(b8 & y1.f19838d) >> 2];
                int i15 = i14 + 1;
                bArr2[i14] = map[((b8 & 3) << 4) | ((b9 & y1.f19838d) >> 4)];
                bArr2[i15] = map[(b9 & cx.f12477m) << 2];
                bArr2[i15 + 1] = kotlin.io.encoding.a.f19277h;
            }
        } else {
            byte b10 = bArr[i5];
            int i16 = i6 + 1;
            bArr2[i6] = map[(b10 & y1.f19838d) >> 2];
            int i17 = i16 + 1;
            bArr2[i16] = map[(b10 & 3) << 4];
            bArr2[i17] = kotlin.io.encoding.a.f19277h;
            bArr2[i17 + 1] = kotlin.io.encoding.a.f19277h;
        }
        return s1.c(bArr2);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            bArr2 = f20854a;
        }
        return b(bArr, bArr2);
    }

    @p4.l
    public static final byte[] d() {
        return f20854a;
    }

    public static /* synthetic */ void e() {
    }

    @p4.l
    public static final byte[] f() {
        return f20855b;
    }

    public static /* synthetic */ void g() {
    }
}
