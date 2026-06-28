package com.zzhoujay.richtext.ext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.y1;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15698a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f15699b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15700c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15701d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f15702e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f15703f = 16;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f15704g = Pattern.compile("^data:image/\\w+?;.*?base64,(.*)");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f15705a;

        /* renamed from: b, reason: collision with root package name */
        public int f15706b;

        private b() {
        }

        public abstract int a(int i5);

        public abstract boolean b(byte[] bArr, int i5, int i6, boolean z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c extends b {

        /* renamed from: f, reason: collision with root package name */
        private static final int[] f15707f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g, reason: collision with root package name */
        private static final int[] f15708g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: h, reason: collision with root package name */
        private static final int f15709h = -1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f15710i = -2;

        /* renamed from: c, reason: collision with root package name */
        private int f15711c;

        /* renamed from: d, reason: collision with root package name */
        private int f15712d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f15713e;

        public c(int i5, byte[] bArr) {
            super();
            int[] iArr;
            this.f15705a = bArr;
            if ((i5 & 8) == 0) {
                iArr = f15707f;
            } else {
                iArr = f15708g;
            }
            this.f15713e = iArr;
            this.f15711c = 0;
            this.f15712d = 0;
        }

        @Override // com.zzhoujay.richtext.ext.a.b
        public int a(int i5) {
            return ((i5 * 3) / 4) + 10;
        }

        @Override // com.zzhoujay.richtext.ext.a.b
        public boolean b(byte[] bArr, int i5, int i6, boolean z4) {
            int i7 = this.f15711c;
            if (i7 == 6) {
                return false;
            }
            int i8 = i6 + i5;
            int i9 = this.f15712d;
            byte[] bArr2 = this.f15705a;
            int[] iArr = this.f15713e;
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
                                        this.f15711c = 6;
                                        return false;
                                    }
                                } else if (i16 == -2) {
                                    i12++;
                                } else if (i16 != -1) {
                                    this.f15711c = 6;
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
                                this.f15711c = 6;
                                return false;
                            }
                        } else {
                            if (i16 < 0) {
                                if (i16 == -2) {
                                    bArr2[i10] = (byte) (i11 >> 4);
                                    i10++;
                                    i12 = 4;
                                } else if (i16 != -1) {
                                    this.f15711c = 6;
                                    return false;
                                }
                            }
                            i16 |= i11 << 6;
                        }
                    } else {
                        if (i16 < 0) {
                            if (i16 != -1) {
                                this.f15711c = 6;
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
                            this.f15711c = 6;
                            return false;
                        }
                    }
                    i12++;
                    i11 = i16;
                }
                i13 = i15;
            }
            if (!z4) {
                this.f15711c = i12;
                this.f15712d = i11;
                this.f15706b = i10;
                return true;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            this.f15711c = 6;
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
                this.f15711c = i12;
                this.f15706b = i10;
                return true;
            }
            this.f15711c = 6;
            return false;
        }
    }

    public static byte[] a(String str) {
        Matcher matcher = f15704g.matcher(str);
        if (matcher.find()) {
            return b(matcher.group(1), 0);
        }
        return null;
    }

    public static byte[] b(String str, int i5) {
        return c(str.getBytes(), i5);
    }

    public static byte[] c(byte[] bArr, int i5) {
        return d(bArr, 0, bArr.length, i5);
    }

    public static byte[] d(byte[] bArr, int i5, int i6, int i7) {
        c cVar = new c(i7, new byte[(i6 * 3) / 4]);
        if (cVar.b(bArr, i5, i6, true)) {
            int i8 = cVar.f15706b;
            byte[] bArr2 = cVar.f15705a;
            if (i8 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i8];
            System.arraycopy(bArr2, 0, bArr3, 0, i8);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static boolean e(String str) {
        return f15704g.matcher(str).find();
    }
}
