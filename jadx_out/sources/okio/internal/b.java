package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.cx;
import java.util.Arrays;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.e0;
import kotlin.y1;
import okio.n;
import okio.s1;

@i0(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0080\b\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0080\b\u001a-\u0010\u0016\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0080\b\u001a\u0017\u0010\"\u001a\u00020 *\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0080\b\u001a\u0015\u0010$\u001a\u00020%*\u00020\f2\u0006\u0010&\u001a\u00020\u0007H\u0080\b\u001a\r\u0010'\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010(\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010)\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\r\u0010,\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\tH\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\fH\u0080\b\u001a\u001d\u00102\u001a\u00020\f*\u00020\f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0080\b\u001a\r\u00105\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00106\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00107\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u00108\u001a\u00020\f*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010:\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a$\u0010;\u001a\u00020\u0017*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006>"}, d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS$annotations", "()V", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", bi.aE, "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonCopyInto", "", TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.AttributesType.S_TARGET, "targetOffset", "byteCount", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "otherOffset", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "buffer", "Lokio/Buffer;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-ByteString")
@r1({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a */
    @p4.l
    private static final char[] f20939a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @p4.l
    public static final n A(@p4.l n nVar, int i5, int i6) {
        boolean z4;
        boolean z5;
        byte[] f12;
        l0.p(nVar, "<this>");
        int l5 = okio.i.l(nVar, i6);
        boolean z6 = true;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (l5 <= nVar.getData$okio().length) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (l5 - i5 < 0) {
                    z6 = false;
                }
                if (z6) {
                    if (i5 == 0 && l5 == nVar.getData$okio().length) {
                        return nVar;
                    }
                    f12 = o.f1(nVar.getData$okio(), i5, l5);
                    return new n(f12);
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + nVar.getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    @p4.l
    public static final n B(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        for (int i5 = 0; i5 < nVar.getData$okio().length; i5++) {
            byte b5 = nVar.getData$okio()[i5];
            if (b5 >= 65 && b5 <= 90) {
                byte[] data$okio = nVar.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                l0.o(copyOf, "copyOf(this, size)");
                copyOf[i5] = (byte) (b5 + 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b6 = copyOf[i6];
                    if (b6 >= 65 && b6 <= 90) {
                        copyOf[i6] = (byte) (b6 + 32);
                    }
                }
                return new n(copyOf);
            }
        }
        return nVar;
    }

    @p4.l
    public static final n C(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        for (int i5 = 0; i5 < nVar.getData$okio().length; i5++) {
            byte b5 = nVar.getData$okio()[i5];
            if (b5 >= 97 && b5 <= 122) {
                byte[] data$okio = nVar.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                l0.o(copyOf, "copyOf(this, size)");
                copyOf[i5] = (byte) (b5 - 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b6 = copyOf[i6];
                    if (b6 >= 97 && b6 <= 122) {
                        copyOf[i6] = (byte) (b6 - 32);
                    }
                }
                return new n(copyOf);
            }
        }
        return nVar;
    }

    @p4.l
    public static final byte[] D(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        byte[] data$okio = nVar.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @p4.l
    public static final n E(@p4.l byte[] bArr, int i5, int i6) {
        byte[] f12;
        l0.p(bArr, "<this>");
        int m5 = okio.i.m(bArr, i6);
        okio.i.e(bArr.length, i5, m5);
        f12 = o.f1(bArr, i5, m5 + i5);
        return new n(f12);
    }

    @p4.l
    public static final String F(@p4.l n nVar) {
        boolean z4;
        String i22;
        String i23;
        String i24;
        boolean z5;
        byte[] f12;
        n nVar2 = nVar;
        l0.p(nVar2, "<this>");
        boolean z6 = true;
        if (nVar.getData$okio().length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "[size=0]";
        }
        int c5 = c(nVar.getData$okio(), 64);
        if (c5 == -1) {
            if (nVar.getData$okio().length <= 64) {
                return "[hex=" + nVar.hex() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(nVar.getData$okio().length);
            sb.append(" hex=");
            int l5 = okio.i.l(nVar2, 64);
            if (l5 <= nVar.getData$okio().length) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (l5 + 0 < 0) {
                    z6 = false;
                }
                if (z6) {
                    if (l5 != nVar.getData$okio().length) {
                        f12 = o.f1(nVar.getData$okio(), 0, l5);
                        nVar2 = new n(f12);
                    }
                    sb.append(nVar2.hex());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + nVar.getData$okio().length + ')').toString());
        }
        String utf8 = nVar.utf8();
        String substring = utf8.substring(0, c5);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        i22 = e0.i2(substring, "\\", "\\\\", false, 4, null);
        i23 = e0.i2(i22, "\n", "\\n", false, 4, null);
        i24 = e0.i2(i23, "\r", "\\r", false, 4, null);
        if (c5 < utf8.length()) {
            return "[size=" + nVar.getData$okio().length + " text=" + i24 + "…]";
        }
        return "[text=" + i24 + ']';
    }

    @p4.l
    public static final String G(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        String utf8$okio = nVar.getUtf8$okio();
        if (utf8$okio == null) {
            String c5 = s1.c(nVar.internalArray$okio());
            nVar.setUtf8$okio(c5);
            return c5;
        }
        return utf8$okio;
    }

    public static final void H(@p4.l n nVar, @p4.l okio.l buffer, int i5, int i6) {
        l0.p(nVar, "<this>");
        l0.p(buffer, "buffer");
        buffer.write(nVar.getData$okio(), i5, i6);
    }

    public static final int I(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        char c6 = 'a';
        if (!('a' <= c5 && c5 < 'g')) {
            c6 = 'A';
            if (!('A' <= c5 && c5 < 'G')) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c5);
            }
        }
        return (c5 - c6) + 10;
    }

    @p4.l
    public static final char[] J() {
        return f20939a;
    }

    public static /* synthetic */ void K() {
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0081 A[EDGE_INSN: B:267:0x0081->B:268:0x0081 BREAK  A[LOOP:1: B:249:0x0051->B:276:0x0088, LOOP_LABEL: LOOP:0: B:2:0x0008->B:43:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.b.c(byte[], int):int");
    }

    @p4.l
    public static final String d(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        return okio.a.c(nVar.getData$okio(), null, 1, null);
    }

    @p4.l
    public static final String e(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        return okio.a.b(nVar.getData$okio(), okio.a.f());
    }

    public static final int f(@p4.l n nVar, @p4.l n other) {
        l0.p(nVar, "<this>");
        l0.p(other, "other");
        int size = nVar.size();
        int size2 = other.size();
        int min = Math.min(size, size2);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = nVar.getByte(i5) & y1.f19838d;
            int i7 = other.getByte(i5) & y1.f19838d;
            if (i6 != i7) {
                if (i6 < i7) {
                    return -1;
                }
                return 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
            return -1;
        }
        return 1;
    }

    public static final void g(@p4.l n nVar, int i5, @p4.l byte[] target, int i6, int i7) {
        l0.p(nVar, "<this>");
        l0.p(target, "target");
        o.v0(nVar.getData$okio(), target, i6, i5, i7 + i5);
    }

    @p4.m
    public static final n h(@p4.l String str) {
        l0.p(str, "<this>");
        byte[] a5 = okio.a.a(str);
        if (a5 != null) {
            return new n(a5);
        }
        return null;
    }

    @p4.l
    public static final n i(@p4.l String str) {
        boolean z4;
        l0.p(str, "<this>");
        if (str.length() % 2 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = i5 * 2;
                bArr[i5] = (byte) ((I(str.charAt(i6)) << 4) + I(str.charAt(i6 + 1)));
            }
            return new n(bArr);
        }
        throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
    }

    @p4.l
    public static final n j(@p4.l String str) {
        l0.p(str, "<this>");
        n nVar = new n(s1.a(str));
        nVar.setUtf8$okio(str);
        return nVar;
    }

    public static final boolean k(@p4.l n nVar, @p4.l n suffix) {
        l0.p(nVar, "<this>");
        l0.p(suffix, "suffix");
        return nVar.rangeEquals(nVar.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean l(@p4.l n nVar, @p4.l byte[] suffix) {
        l0.p(nVar, "<this>");
        l0.p(suffix, "suffix");
        return nVar.rangeEquals(nVar.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final boolean m(@p4.l n nVar, @p4.m Object obj) {
        l0.p(nVar, "<this>");
        if (obj == nVar) {
            return true;
        }
        if (obj instanceof n) {
            n nVar2 = (n) obj;
            if (nVar2.size() == nVar.getData$okio().length && nVar2.rangeEquals(0, nVar.getData$okio(), 0, nVar.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte n(@p4.l n nVar, int i5) {
        l0.p(nVar, "<this>");
        return nVar.getData$okio()[i5];
    }

    public static final int o(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        return nVar.getData$okio().length;
    }

    public static final int p(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        int hashCode$okio = nVar.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(nVar.getData$okio());
        nVar.setHashCode$okio(hashCode);
        return hashCode;
    }

    @p4.l
    public static final String q(@p4.l n nVar) {
        String t12;
        l0.p(nVar, "<this>");
        char[] cArr = new char[nVar.getData$okio().length * 2];
        int i5 = 0;
        for (byte b5 : nVar.getData$okio()) {
            int i6 = i5 + 1;
            cArr[i5] = J()[(b5 >> 4) & 15];
            i5 = i6 + 1;
            cArr[i6] = J()[b5 & cx.f12477m];
        }
        t12 = e0.t1(cArr);
        return t12;
    }

    public static final int r(@p4.l n nVar, @p4.l byte[] other, int i5) {
        l0.p(nVar, "<this>");
        l0.p(other, "other");
        int length = nVar.getData$okio().length - other.length;
        int max = Math.max(i5, 0);
        if (max <= length) {
            while (!okio.i.d(nVar.getData$okio(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    @p4.l
    public static final byte[] s(@p4.l n nVar) {
        l0.p(nVar, "<this>");
        return nVar.getData$okio();
    }

    public static final int t(@p4.l n nVar, @p4.l n other, int i5) {
        l0.p(nVar, "<this>");
        l0.p(other, "other");
        return nVar.lastIndexOf(other.internalArray$okio(), i5);
    }

    public static final int u(@p4.l n nVar, @p4.l byte[] other, int i5) {
        l0.p(nVar, "<this>");
        l0.p(other, "other");
        for (int min = Math.min(okio.i.l(nVar, i5), nVar.getData$okio().length - other.length); -1 < min; min--) {
            if (okio.i.d(nVar.getData$okio(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    @p4.l
    public static final n v(@p4.l byte[] data) {
        l0.p(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        l0.o(copyOf, "copyOf(this, size)");
        return new n(copyOf);
    }

    public static final boolean w(@p4.l n nVar, int i5, @p4.l n other, int i6, int i7) {
        l0.p(nVar, "<this>");
        l0.p(other, "other");
        return other.rangeEquals(i6, nVar.getData$okio(), i5, i7);
    }

    public static final boolean x(@p4.l n nVar, int i5, @p4.l byte[] other, int i6, int i7) {
        l0.p(nVar, "<this>");
        l0.p(other, "other");
        if (i5 >= 0 && i5 <= nVar.getData$okio().length - i7 && i6 >= 0 && i6 <= other.length - i7 && okio.i.d(nVar.getData$okio(), i5, other, i6, i7)) {
            return true;
        }
        return false;
    }

    public static final boolean y(@p4.l n nVar, @p4.l n prefix) {
        l0.p(nVar, "<this>");
        l0.p(prefix, "prefix");
        return nVar.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean z(@p4.l n nVar, @p4.l byte[] prefix) {
        l0.p(nVar, "<this>");
        l0.p(prefix, "prefix");
        return nVar.rangeEquals(0, prefix, 0, prefix.length);
    }
}
