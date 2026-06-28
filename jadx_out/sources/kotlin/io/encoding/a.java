package kotlin.io.encoding;

import com.umeng.analytics.pro.cx;
import java.nio.charset.Charset;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.y1;
import okio.q1;
import p4.l;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 22\u00020\u0001:\u00012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001bJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J0\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J \u0010 \u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\"\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J5\u0010#\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J=\u0010&\u001a\u0002H'\"\f\b\u0000\u0010'*\u00060(j\u0002`)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u0002H'2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010*J\"\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J%\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b-J(\u0010.\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002J \u00101\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u00063"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "(ZZ)V", "isMimeScheme$kotlin_stdlib", "()Z", "isUrlSafe$kotlin_stdlib", "bytesToStringImpl", "", "source", "", "bytesToStringImpl$kotlin_stdlib", "charsToBytesImpl", "", "startIndex", "", "endIndex", "charsToBytesImpl$kotlin_stdlib", "checkDestinationBounds", "", "destinationSize", "destinationOffset", "capacityNeeded", "checkSourceBounds", "sourceSize", "checkSourceBounds$kotlin_stdlib", "decode", "decodeImpl", "destination", "decodeIntoByteArray", "decodeSize", "encode", "encodeIntoByteArray", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "encodeToAppendable", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "encodeToByteArray", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "skipIllegalSymbolsIfMime", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.8")
@f
/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final int f19273d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f19274e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19275f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f19276g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f19277h = 61;

    /* renamed from: i, reason: collision with root package name */
    public static final int f19278i = 76;

    /* renamed from: j, reason: collision with root package name */
    private static final int f19279j = 19;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19283a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19284b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public static final C0555a f19272c = new C0555a(null);

    /* renamed from: k, reason: collision with root package name */
    @l
    private static final byte[] f19280k = {cx.f12475k, 10};

    /* renamed from: l, reason: collision with root package name */
    @l
    private static final a f19281l = new a(true, false);

    /* renamed from: m, reason: collision with root package name */
    @l
    private static final a f19282m = new a(false, true);

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "()V", "Mime", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "padSymbol", "", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.encoding.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0555a extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private C0555a() {
            /*
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.a.C0555a.<init>():void");
        }

        public /* synthetic */ C0555a(w wVar) {
            this();
        }

        @l
        public final a G() {
            return a.f19282m;
        }

        @l
        public final byte[] H() {
            return a.f19280k;
        }

        @l
        public final a I() {
            return a.f19281l;
        }
    }

    private a(boolean z4, boolean z5) {
        boolean z6;
        this.f19283a = z4;
        this.f19284b = z5;
        if (z4 && z5) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ a(boolean z4, boolean z5, w wVar) {
        this(z4, z5);
    }

    public static /* synthetic */ byte[] A(a aVar, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return aVar.z(bArr, i5, i6);
    }

    private final int C(byte[] bArr, int i5, int i6, int i7) {
        if (i7 != -8) {
            if (i7 != -6) {
                if (i7 != -4) {
                    if (i7 != -2) {
                        throw new IllegalStateException("Unreachable".toString());
                    }
                } else {
                    i5 = F(bArr, i5 + 1, i6);
                    if (i5 == i6 || bArr[i5] != 61) {
                        throw new IllegalArgumentException("Missing one pad character at index " + i5);
                    }
                }
            }
            return i5 + 1;
        }
        throw new IllegalArgumentException("Redundant pad character at index " + i5);
    }

    private final int F(byte[] bArr, int i5, int i6) {
        if (!this.f19284b) {
            return i5;
        }
        while (i5 < i6) {
            if (c.a()[bArr[i5] & y1.f19838d] != -1) {
                return i5;
            }
            i5++;
        }
        return i5;
    }

    private final void f(int i5, int i6, int i7) {
        if (i6 >= 0 && i6 <= i5) {
            int i8 = i6 + i7;
            if (i8 >= 0 && i8 <= i5) {
                return;
            }
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i6 + ", destination size: " + i5 + ", capacity needed: " + i7);
        }
        throw new IndexOutOfBoundsException("destination offset: " + i6 + ", destination size: " + i5);
    }

    public static /* synthetic */ byte[] j(a aVar, CharSequence charSequence, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = charSequence.length();
        }
        return aVar.h(charSequence, i5, i6);
    }

    public static /* synthetic */ byte[] k(a aVar, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return aVar.i(bArr, i5, i6);
    }

    private final int l(byte[] bArr, byte[] bArr2, int i5, int i6, int i7) {
        int[] a5;
        if (this.f19283a) {
            a5 = c.c();
        } else {
            a5 = c.a();
        }
        int i8 = -8;
        int i9 = i5;
        int i10 = -8;
        int i11 = 0;
        int i12 = i6;
        while (true) {
            if (i12 >= i7) {
                break;
            }
            if (i10 == i8 && i12 + 3 < i7) {
                int i13 = i12 + 1;
                int i14 = a5[bArr[i12] & y1.f19838d];
                int i15 = i13 + 1;
                int i16 = a5[bArr[i13] & y1.f19838d];
                int i17 = i15 + 1;
                int i18 = a5[bArr[i15] & y1.f19838d];
                int i19 = i17 + 1;
                int i20 = (i18 << 6) | (i14 << 18) | (i16 << 12) | a5[bArr[i17] & y1.f19838d];
                if (i20 >= 0) {
                    int i21 = i9 + 1;
                    bArr2[i9] = (byte) (i20 >> 16);
                    int i22 = i21 + 1;
                    bArr2[i21] = (byte) (i20 >> 8);
                    bArr2[i22] = (byte) i20;
                    i9 = i22 + 1;
                    i12 = i19;
                    i8 = -8;
                } else {
                    i12 = i19 - 4;
                }
            }
            int i23 = bArr[i12] & y1.f19838d;
            int i24 = a5[i23];
            if (i24 < 0) {
                if (i24 == -2) {
                    i12 = C(bArr, i12, i7, i10);
                    break;
                }
                if (this.f19284b) {
                    i12++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid symbol '");
                    sb.append((char) i23);
                    sb.append("'(");
                    String num = Integer.toString(i23, kotlin.text.c.a(8));
                    l0.o(num, "toString(this, checkRadix(radix))");
                    sb.append(num);
                    sb.append(") at index ");
                    sb.append(i12);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                i12++;
                i11 = (i11 << 6) | i24;
                i10 += 6;
                if (i10 >= 0) {
                    bArr2[i9] = (byte) (i11 >>> i10);
                    i11 &= (1 << i10) - 1;
                    i10 -= 8;
                    i9++;
                }
            }
            i8 = -8;
        }
        if (i10 != -2) {
            int F = F(bArr, i12, i7);
            if (F >= i7) {
                return i9 - i5;
            }
            int i25 = bArr[F] & y1.f19838d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Symbol '");
            sb2.append((char) i25);
            sb2.append("'(");
            String num2 = Integer.toString(i25, kotlin.text.c.a(8));
            l0.o(num2, "toString(this, checkRadix(radix))");
            sb2.append(num2);
            sb2.append(") at index ");
            sb2.append(F - 1);
            sb2.append(" is prohibited after the pad character");
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    }

    public static /* synthetic */ int o(a aVar, CharSequence charSequence, byte[] bArr, int i5, int i6, int i7, int i8, Object obj) {
        int i9;
        int i10;
        if (obj == null) {
            if ((i8 & 4) != 0) {
                i9 = 0;
            } else {
                i9 = i5;
            }
            if ((i8 & 8) != 0) {
                i10 = 0;
            } else {
                i10 = i6;
            }
            if ((i8 & 16) != 0) {
                i7 = charSequence.length();
            }
            return aVar.m(charSequence, bArr, i9, i10, i7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public static /* synthetic */ int p(a aVar, byte[] bArr, byte[] bArr2, int i5, int i6, int i7, int i8, Object obj) {
        int i9;
        int i10;
        if (obj == null) {
            if ((i8 & 4) != 0) {
                i9 = 0;
            } else {
                i9 = i5;
            }
            if ((i8 & 8) != 0) {
                i10 = 0;
            } else {
                i10 = i6;
            }
            if ((i8 & 16) != 0) {
                i7 = bArr.length;
            }
            return aVar.n(bArr, bArr2, i9, i10, i7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    private final int q(byte[] bArr, int i5, int i6) {
        int i7 = i6 - i5;
        if (i7 == 0) {
            return 0;
        }
        if (i7 != 1) {
            if (this.f19284b) {
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    int i8 = c.a()[bArr[i5] & y1.f19838d];
                    if (i8 < 0) {
                        if (i8 == -2) {
                            i7 -= i6 - i5;
                            break;
                        }
                        i7--;
                    }
                    i5++;
                }
            } else if (bArr[i6 - 1] == 61) {
                i7--;
                if (bArr[i6 - 2] == 61) {
                    i7--;
                }
            }
            return (int) ((i7 * 6) / 8);
        }
        throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + i5 + ", endIndex: " + i6);
    }

    public static /* synthetic */ String s(a aVar, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return aVar.r(bArr, i5, i6);
    }

    public static /* synthetic */ int u(a aVar, byte[] bArr, byte[] bArr2, int i5, int i6, int i7, int i8, Object obj) {
        int i9;
        int i10;
        if (obj == null) {
            if ((i8 & 4) != 0) {
                i9 = 0;
            } else {
                i9 = i5;
            }
            if ((i8 & 8) != 0) {
                i10 = 0;
            } else {
                i10 = i6;
            }
            if ((i8 & 16) != 0) {
                i7 = bArr.length;
            }
            return aVar.t(bArr, bArr2, i9, i10, i7);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    private final int w(int i5) {
        int i6;
        int i7 = ((i5 + 3) - 1) / 3;
        if (this.f19284b) {
            i6 = (i7 - 1) / 19;
        } else {
            i6 = 0;
        }
        int i8 = (i7 * 4) + (i6 * 2);
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public static /* synthetic */ Appendable y(a aVar, byte[] bArr, Appendable appendable, int i5, int i6, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 4) != 0) {
                i5 = 0;
            }
            if ((i7 & 8) != 0) {
                i6 = bArr.length;
            }
            return aVar.x(bArr, appendable, i5, i6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    @l
    public final byte[] B(@l byte[] source, int i5, int i6) {
        l0.p(source, "source");
        g(source.length, i5, i6);
        byte[] bArr = new byte[w(i6 - i5)];
        v(source, bArr, 0, i5, i6);
        return bArr;
    }

    public final boolean D() {
        return this.f19284b;
    }

    public final boolean E() {
        return this.f19283a;
    }

    @l
    public final String d(@l byte[] source) {
        l0.p(source, "source");
        StringBuilder sb = new StringBuilder(source.length);
        for (byte b5 : source) {
            sb.append((char) b5);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "stringBuilder.toString()");
        return sb2;
    }

    @l
    public final byte[] e(@l CharSequence source, int i5, int i6) {
        l0.p(source, "source");
        g(source.length(), i5, i6);
        byte[] bArr = new byte[i6 - i5];
        int i7 = 0;
        while (i5 < i6) {
            char charAt = source.charAt(i5);
            if (charAt <= 255) {
                bArr[i7] = (byte) charAt;
                i7++;
            } else {
                bArr[i7] = q1.f21021a;
                i7++;
            }
            i5++;
        }
        return bArr;
    }

    public final void g(int i5, int i6, int i7) {
        kotlin.collections.c.Companion.a(i6, i7, i5);
    }

    @l
    public final byte[] h(@l CharSequence source, int i5, int i6) {
        byte[] e5;
        l0.p(source, "source");
        if (source instanceof String) {
            g(source.length(), i5, i6);
            String substring = ((String) source).substring(i5, i6);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = kotlin.text.f.f19708g;
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            e5 = substring.getBytes(charset);
            l0.o(e5, "this as java.lang.String).getBytes(charset)");
        } else {
            e5 = e(source, i5, i6);
        }
        return k(this, e5, 0, 0, 6, null);
    }

    @l
    public final byte[] i(@l byte[] source, int i5, int i6) {
        boolean z4;
        l0.p(source, "source");
        g(source.length, i5, i6);
        int q5 = q(source, i5, i6);
        byte[] bArr = new byte[q5];
        if (l(source, bArr, 0, i5, i6) == q5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int m(@l CharSequence source, @l byte[] destination, int i5, int i6, int i7) {
        byte[] e5;
        l0.p(source, "source");
        l0.p(destination, "destination");
        if (source instanceof String) {
            g(source.length(), i6, i7);
            String substring = ((String) source).substring(i6, i7);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = kotlin.text.f.f19708g;
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            e5 = substring.getBytes(charset);
            l0.o(e5, "this as java.lang.String).getBytes(charset)");
        } else {
            e5 = e(source, i6, i7);
        }
        return p(this, e5, destination, i5, 0, 0, 24, null);
    }

    public final int n(@l byte[] source, @l byte[] destination, int i5, int i6, int i7) {
        l0.p(source, "source");
        l0.p(destination, "destination");
        g(source.length, i6, i7);
        f(destination.length, i5, q(source, i6, i7));
        return l(source, destination, i5, i6, i7);
    }

    @l
    public final String r(@l byte[] source, int i5, int i6) {
        l0.p(source, "source");
        return new String(B(source, i5, i6), kotlin.text.f.f19708g);
    }

    public final int t(@l byte[] source, @l byte[] destination, int i5, int i6, int i7) {
        l0.p(source, "source");
        l0.p(destination, "destination");
        return v(source, destination, i5, i6, i7);
    }

    public final int v(@l byte[] source, @l byte[] destination, int i5, int i6, int i7) {
        byte[] b5;
        int i8;
        boolean z4;
        l0.p(source, "source");
        l0.p(destination, "destination");
        g(source.length, i6, i7);
        f(destination.length, i5, w(i7 - i6));
        if (this.f19283a) {
            b5 = c.d();
        } else {
            b5 = c.b();
        }
        if (this.f19284b) {
            i8 = 19;
        } else {
            i8 = Integer.MAX_VALUE;
        }
        int i9 = i5;
        while (true) {
            z4 = false;
            if (i6 + 2 >= i7) {
                break;
            }
            int min = Math.min((i7 - i6) / 3, i8);
            int i10 = 0;
            while (i10 < min) {
                int i11 = i6 + 1;
                int i12 = i11 + 1;
                int i13 = ((source[i6] & y1.f19838d) << 16) | ((source[i11] & y1.f19838d) << 8) | (source[i12] & y1.f19838d);
                int i14 = i9 + 1;
                destination[i9] = b5[i13 >>> 18];
                int i15 = i14 + 1;
                destination[i14] = b5[(i13 >>> 12) & 63];
                int i16 = i15 + 1;
                destination[i15] = b5[(i13 >>> 6) & 63];
                i9 = i16 + 1;
                destination[i16] = b5[i13 & 63];
                i10++;
                i6 = i12 + 1;
            }
            if (min == i8 && i6 != i7) {
                int i17 = i9 + 1;
                byte[] bArr = f19280k;
                destination[i9] = bArr[0];
                i9 = i17 + 1;
                destination[i17] = bArr[1];
            }
        }
        int i18 = i7 - i6;
        if (i18 != 1) {
            if (i18 == 2) {
                int i19 = i6 + 1;
                int i20 = i19 + 1;
                int i21 = ((source[i19] & y1.f19838d) << 2) | ((source[i6] & y1.f19838d) << 10);
                int i22 = i9 + 1;
                destination[i9] = b5[i21 >>> 12];
                int i23 = i22 + 1;
                destination[i22] = b5[(i21 >>> 6) & 63];
                int i24 = i23 + 1;
                destination[i23] = b5[i21 & 63];
                i9 = i24 + 1;
                destination[i24] = f19277h;
                i6 = i20;
            }
        } else {
            int i25 = i6 + 1;
            int i26 = (source[i6] & y1.f19838d) << 4;
            int i27 = i9 + 1;
            destination[i9] = b5[i26 >>> 6];
            int i28 = i27 + 1;
            destination[i27] = b5[i26 & 63];
            int i29 = i28 + 1;
            destination[i28] = f19277h;
            i9 = i29 + 1;
            destination[i29] = f19277h;
            i6 = i25;
        }
        if (i6 == i7) {
            z4 = true;
        }
        if (z4) {
            return i9 - i5;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @l
    public final <A extends Appendable> A x(@l byte[] source, @l A destination, int i5, int i6) {
        l0.p(source, "source");
        l0.p(destination, "destination");
        destination.append(new String(B(source, i5, i6), kotlin.text.f.f19708g));
        return destination;
    }

    @l
    public final byte[] z(@l byte[] source, int i5, int i6) {
        l0.p(source, "source");
        return B(source, i5, i6);
    }
}
