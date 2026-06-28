package okio.internal;

import com.android.dx.io.Opcodes;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import okio.q1;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n68#3:77\n74#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class m {
    @p4.l
    public static final byte[] a(@p4.l String str) {
        boolean z4;
        int i5;
        int i6;
        l0.p(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (l0.t(charAt, 128) >= 0) {
                int length2 = str.length();
                int i8 = i7;
                while (i7 < length2) {
                    char charAt2 = str.charAt(i7);
                    if (l0.t(charAt2, 128) < 0) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) charAt2;
                        i7++;
                        while (true) {
                            i8 = i9;
                            if (i7 < length2 && l0.t(str.charAt(i7), 128) < 0) {
                                i9 = i8 + 1;
                                bArr[i8] = (byte) str.charAt(i7);
                                i7++;
                            }
                        }
                    } else {
                        if (l0.t(charAt2, 2048) < 0) {
                            int i10 = i8 + 1;
                            bArr[i8] = (byte) ((charAt2 >> 6) | 192);
                            byte b5 = (byte) ((charAt2 & '?') | 128);
                            i5 = i10 + 1;
                            bArr[i10] = b5;
                        } else {
                            boolean z5 = true;
                            if (55296 <= charAt2 && charAt2 < 57344) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                int i11 = i8 + 1;
                                bArr[i8] = (byte) ((charAt2 >> '\f') | Opcodes.SHL_INT_LIT8);
                                int i12 = i11 + 1;
                                bArr[i11] = (byte) (((charAt2 >> 6) & 63) | 128);
                                byte b6 = (byte) ((charAt2 & '?') | 128);
                                i5 = i12 + 1;
                                bArr[i12] = b6;
                            } else {
                                if (l0.t(charAt2, 56319) <= 0 && length2 > (i6 = i7 + 1)) {
                                    char charAt3 = str.charAt(i6);
                                    if (56320 > charAt3 || charAt3 >= 57344) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        int charAt4 = ((charAt2 << '\n') + str.charAt(i6)) - 56613888;
                                        int i13 = i8 + 1;
                                        bArr[i8] = (byte) ((charAt4 >> 18) | 240);
                                        int i14 = i13 + 1;
                                        bArr[i13] = (byte) (((charAt4 >> 12) & 63) | 128);
                                        int i15 = i14 + 1;
                                        bArr[i14] = (byte) (((charAt4 >> 6) & 63) | 128);
                                        byte b7 = (byte) ((charAt4 & 63) | 128);
                                        i5 = i15 + 1;
                                        bArr[i15] = b7;
                                        i7 += 2;
                                        i8 = i5;
                                    }
                                }
                                i5 = i8 + 1;
                                bArr[i8] = q1.f21021a;
                            }
                        }
                        i7++;
                        i8 = i5;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i8);
                l0.o(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i7] = (byte) charAt;
            i7++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        l0.o(copyOf2, "copyOf(this, newSize)");
        return copyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x011c, code lost:
    
        if (r12 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0098, code lost:
    
        if (r5 == false) goto L23;
     */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(@p4.l byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.m.b(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String c(byte[] bArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = bArr.length;
        }
        return b(bArr, i5, i6);
    }
}
