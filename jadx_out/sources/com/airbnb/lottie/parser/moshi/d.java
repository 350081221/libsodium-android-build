package com.airbnb.lottie.parser.moshi;

/* loaded from: classes2.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final int f1641a = 1;

    /* renamed from: b, reason: collision with root package name */
    static final int f1642b = 2;

    /* renamed from: c, reason: collision with root package name */
    static final int f1643c = 3;

    /* renamed from: d, reason: collision with root package name */
    static final int f1644d = 4;

    /* renamed from: e, reason: collision with root package name */
    static final int f1645e = 5;

    /* renamed from: f, reason: collision with root package name */
    static final int f1646f = 6;

    /* renamed from: g, reason: collision with root package name */
    static final int f1647g = 7;

    /* renamed from: h, reason: collision with root package name */
    static final int f1648h = 8;

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i5, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = iArr[i6];
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3 || i7 == 4 || i7 == 5) {
                    sb.append(external.org.apache.commons.lang3.d.f15957a);
                    String str = strArr[i6];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i6]);
                sb.append(']');
            }
        }
        return sb.toString();
    }
}
