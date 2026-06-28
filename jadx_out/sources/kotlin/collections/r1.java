package kotlin.collections;

import kotlin.m2;
import kotlin.n2;
import kotlin.y1;
import kotlin.z1;

@kotlin.i0(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r1 {
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int a(long[] r6, int r7, int r8) {
        /*
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = kotlin.h2.n(r6, r0)
        L8:
            if (r7 > r8) goto L39
        La:
            long r2 = kotlin.h2.n(r6, r7)
            int r2 = androidx.collection.a.a(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = kotlin.h2.n(r6, r8)
            int r2 = androidx.collection.a.a(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = kotlin.h2.n(r6, r7)
            long r4 = kotlin.h2.n(r6, r8)
            kotlin.h2.u(r6, r7, r4)
            kotlin.h2.u(r6, r8, r2)
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L39:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.r1.a(long[], int, int):int");
    }

    @kotlin.t
    private static final int b(byte[] bArr, int i5, int i6) {
        int i7;
        byte n5 = z1.n(bArr, (i5 + i6) / 2);
        while (i5 <= i6) {
            while (true) {
                int n6 = z1.n(bArr, i5) & y1.f19838d;
                i7 = n5 & y1.f19838d;
                if (kotlin.jvm.internal.l0.t(n6, i7) >= 0) {
                    break;
                }
                i5++;
            }
            while (kotlin.jvm.internal.l0.t(z1.n(bArr, i6) & y1.f19838d, i7) > 0) {
                i6--;
            }
            if (i5 <= i6) {
                byte n7 = z1.n(bArr, i5);
                z1.u(bArr, i5, z1.n(bArr, i6));
                z1.u(bArr, i6, n7);
                i5++;
                i6--;
            }
        }
        return i5;
    }

    @kotlin.t
    private static final int c(short[] sArr, int i5, int i6) {
        int i7;
        short n5 = n2.n(sArr, (i5 + i6) / 2);
        while (i5 <= i6) {
            while (true) {
                int n6 = n2.n(sArr, i5) & m2.f19496d;
                i7 = n5 & m2.f19496d;
                if (kotlin.jvm.internal.l0.t(n6, i7) >= 0) {
                    break;
                }
                i5++;
            }
            while (kotlin.jvm.internal.l0.t(n2.n(sArr, i6) & m2.f19496d, i7) > 0) {
                i6--;
            }
            if (i5 <= i6) {
                short n7 = n2.n(sArr, i5);
                n2.u(sArr, i5, n2.n(sArr, i6));
                n2.u(sArr, i6, n7);
                i5++;
                i6--;
            }
        }
        return i5;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int d(int[] r3, int r4, int r5) {
        /*
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = kotlin.d2.n(r3, r0)
        L8:
            if (r4 > r5) goto L39
        La:
            int r1 = kotlin.d2.n(r3, r4)
            int r1 = kotlin.v1.a(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = kotlin.d2.n(r3, r5)
            int r1 = kotlin.v1.a(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = kotlin.d2.n(r3, r4)
            int r2 = kotlin.d2.n(r3, r5)
            kotlin.d2.u(r3, r4, r2)
            kotlin.d2.u(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.r1.d(int[], int, int):int");
    }

    @kotlin.t
    private static final void e(long[] jArr, int i5, int i6) {
        int a5 = a(jArr, i5, i6);
        int i7 = a5 - 1;
        if (i5 < i7) {
            e(jArr, i5, i7);
        }
        if (a5 < i6) {
            e(jArr, a5, i6);
        }
    }

    @kotlin.t
    private static final void f(byte[] bArr, int i5, int i6) {
        int b5 = b(bArr, i5, i6);
        int i7 = b5 - 1;
        if (i5 < i7) {
            f(bArr, i5, i7);
        }
        if (b5 < i6) {
            f(bArr, b5, i6);
        }
    }

    @kotlin.t
    private static final void g(short[] sArr, int i5, int i6) {
        int c5 = c(sArr, i5, i6);
        int i7 = c5 - 1;
        if (i5 < i7) {
            g(sArr, i5, i7);
        }
        if (c5 < i6) {
            g(sArr, c5, i6);
        }
    }

    @kotlin.t
    private static final void h(int[] iArr, int i5, int i6) {
        int d5 = d(iArr, i5, i6);
        int i7 = d5 - 1;
        if (i5 < i7) {
            h(iArr, i5, i7);
        }
        if (d5 < i6) {
            h(iArr, d5, i6);
        }
    }

    @kotlin.t
    public static final void i(@p4.l long[] array, int i5, int i6) {
        kotlin.jvm.internal.l0.p(array, "array");
        e(array, i5, i6 - 1);
    }

    @kotlin.t
    public static final void j(@p4.l byte[] array, int i5, int i6) {
        kotlin.jvm.internal.l0.p(array, "array");
        f(array, i5, i6 - 1);
    }

    @kotlin.t
    public static final void k(@p4.l short[] array, int i5, int i6) {
        kotlin.jvm.internal.l0.p(array, "array");
        g(array, i5, i6 - 1);
    }

    @kotlin.t
    public static final void l(@p4.l int[] array, int i5, int i6) {
        kotlin.jvm.internal.l0.p(array, "array");
        h(array, i5, i6 - 1);
    }
}
