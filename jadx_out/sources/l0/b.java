package l0;

import android.annotation.SuppressLint;
import java.io.UnsupportedEncodingException;
import kotlin.y1;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f20701a = true;

    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f20702a;

        /* renamed from: b, reason: collision with root package name */
        public int f20703b;
    }

    /* renamed from: l0.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0620b extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final int[] f20704f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g, reason: collision with root package name */
        public static final int[] f20705g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c, reason: collision with root package name */
        public int f20706c;

        /* renamed from: d, reason: collision with root package name */
        public int f20707d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f20708e;

        public C0620b(int i5, byte[] bArr) {
            int[] iArr;
            this.f20702a = bArr;
            if ((i5 & 8) == 0) {
                iArr = f20704f;
            } else {
                iArr = f20705g;
            }
            this.f20708e = iArr;
            this.f20706c = 0;
            this.f20707d = 0;
        }

        public boolean a(byte[] bArr, int i5, int i6, boolean z4) {
            int i7 = this.f20706c;
            if (i7 == 6) {
                return false;
            }
            int i8 = i6 + i5;
            int i9 = this.f20707d;
            byte[] bArr2 = this.f20702a;
            int[] iArr = this.f20708e;
            int i10 = 0;
            int i11 = i9;
            int i12 = i7;
            int i13 = i5;
            while (i13 < i8) {
                if (i12 == 0) {
                    while (true) {
                        int i14 = i13 + 4;
                        if (i14 > i8 || (i11 = (iArr[bArr[i13] & y1.f19838d] << 18) | (iArr[bArr[i13 + 1] & y1.f19838d] << 12) | (iArr[bArr[i13 + 2] & y1.f19838d] << 6) | iArr[bArr[i13 + 3] & y1.f19838d]) < 0) {
                            break;
                        }
                        bArr2[i10 + 2] = (byte) i11;
                        bArr2[i10 + 1] = (byte) (i11 >> 8);
                        bArr2[i10] = (byte) (i11 >> 16);
                        i10 += 3;
                        i13 = i14;
                    }
                    if (i13 >= i8) {
                        break;
                    }
                }
                int i15 = i13 + 1;
                int i16 = iArr[bArr[i13] & y1.f19838d];
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4) {
                                    if (i12 == 5 && i16 != -1) {
                                        this.f20706c = 6;
                                        return false;
                                    }
                                } else if (i16 == -2) {
                                    i12++;
                                } else if (i16 != -1) {
                                    this.f20706c = 6;
                                    return false;
                                }
                            } else if (i16 >= 0) {
                                int i17 = i16 | (i11 << 6);
                                bArr2[i10 + 2] = (byte) i17;
                                bArr2[i10 + 1] = (byte) (i17 >> 8);
                                bArr2[i10] = (byte) (i17 >> 16);
                                i10 += 3;
                                i11 = i17;
                                i12 = 0;
                            } else if (i16 == -2) {
                                bArr2[i10 + 1] = (byte) (i11 >> 2);
                                bArr2[i10] = (byte) (i11 >> 10);
                                i10 += 2;
                                i12 = 5;
                            } else if (i16 != -1) {
                                this.f20706c = 6;
                                return false;
                            }
                        } else {
                            if (i16 < 0) {
                                if (i16 == -2) {
                                    bArr2[i10] = (byte) (i11 >> 4);
                                    i10++;
                                    i12 = 4;
                                } else if (i16 != -1) {
                                    this.f20706c = 6;
                                    return false;
                                }
                            }
                            i16 |= i11 << 6;
                        }
                    } else {
                        if (i16 < 0) {
                            if (i16 != -1) {
                                this.f20706c = 6;
                                return false;
                            }
                        }
                        i16 |= i11 << 6;
                    }
                    i12++;
                    i11 = i16;
                } else {
                    if (i16 < 0) {
                        if (i16 != -1) {
                            this.f20706c = 6;
                            return false;
                        }
                    }
                    i12++;
                    i11 = i16;
                }
                i13 = i15;
            }
            if (!z4) {
                this.f20706c = i12;
                this.f20707d = i11;
                this.f20703b = i10;
                return true;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            this.f20706c = 6;
                            return false;
                        }
                    } else {
                        int i18 = i10 + 1;
                        bArr2[i10] = (byte) (i11 >> 10);
                        i10 = i18 + 1;
                        bArr2[i18] = (byte) (i11 >> 2);
                    }
                } else {
                    bArr2[i10] = (byte) (i11 >> 4);
                    i10++;
                }
                this.f20706c = i12;
                this.f20703b = i10;
                return true;
            }
            this.f20706c = 6;
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public static final byte[] f20709j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k, reason: collision with root package name */
        public static final byte[] f20710k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ boolean f20711l = true;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f20712c;

        /* renamed from: d, reason: collision with root package name */
        public int f20713d;

        /* renamed from: e, reason: collision with root package name */
        public int f20714e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f20715f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f20716g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f20717h;

        /* renamed from: i, reason: collision with root package name */
        public final byte[] f20718i;

        public c(int i5, byte[] bArr) {
            boolean z4;
            boolean z5;
            byte[] bArr2;
            int i6;
            this.f20702a = bArr;
            if ((i5 & 1) == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f20715f = z4;
            if ((i5 & 2) == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f20716g = z5;
            this.f20717h = (i5 & 4) != 0;
            if ((i5 & 8) == 0) {
                bArr2 = f20709j;
            } else {
                bArr2 = f20710k;
            }
            this.f20718i = bArr2;
            this.f20712c = new byte[2];
            this.f20713d = 0;
            if (z5) {
                i6 = 19;
            } else {
                i6 = -1;
            }
            this.f20714e = i6;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01cd A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r19, int r20, int r21, boolean r22) {
            /*
                Method dump skipped, instructions count: 514
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.b.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int i5) {
        return b(bArr, 0, bArr.length, i5);
    }

    public static byte[] b(byte[] bArr, int i5, int i6, int i7) {
        C0620b c0620b = new C0620b(i7, new byte[(i6 * 3) / 4]);
        if (c0620b.a(bArr, i5, i6, true)) {
            int i8 = c0620b.f20703b;
            byte[] bArr2 = c0620b.f20702a;
            if (i8 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i8];
            System.arraycopy(bArr2, 0, bArr3, 0, i8);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] c(byte[] bArr, int i5) {
        return d(bArr, 0, bArr.length, i5);
    }

    @SuppressLint({"Assert"})
    public static byte[] d(byte[] bArr, int i5, int i6, int i7) {
        c cVar = new c(i7, null);
        int i8 = (i6 / 3) * 4;
        int i9 = 2;
        if (cVar.f20715f) {
            if (i6 % 3 > 0) {
                i8 += 4;
            }
        } else {
            int i10 = i6 % 3;
            if (i10 != 1) {
                if (i10 == 2) {
                    i8 += 3;
                }
            } else {
                i8 += 2;
            }
        }
        if (cVar.f20716g && i6 > 0) {
            int i11 = ((i6 - 1) / 57) + 1;
            if (!cVar.f20717h) {
                i9 = 1;
            }
            i8 += i11 * i9;
        }
        cVar.f20702a = new byte[i8];
        cVar.a(bArr, i5, i6, true);
        if (!f20701a && cVar.f20703b != i8) {
            throw new AssertionError();
        }
        return cVar.f20702a;
    }

    public static String e(byte[] bArr, int i5) {
        try {
            return new String(c(bArr, i5), "US-ASCII");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }
}
