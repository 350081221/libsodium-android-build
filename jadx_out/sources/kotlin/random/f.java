package kotlin.random;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import kotlin.g1;
import kotlin.i0;
import kotlin.internal.m;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", TypedValues.TransitionType.S_FROM, "nextFloat", "", "nextInt", "nextLong", "", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
@r1({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes4.dex */
public abstract class f {

    @l
    public static final a Default = new a(null);

    @l
    private static final f defaultRandom = m.f19264a.b();

    @i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", TypedValues.TransitionType.S_FROM, "nextFloat", "", "nextInt", "nextLong", "", "writeReplace", "", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends f implements Serializable {

        @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.random.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0559a implements Serializable {

            @l
            public static final C0559a INSTANCE = new C0559a();
            private static final long serialVersionUID = 0;

            private C0559a() {
            }

            private final Object readResolve() {
                return f.Default;
            }
        }

        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        private final Object writeReplace() {
            return C0559a.INSTANCE;
        }

        @Override // kotlin.random.f
        public int nextBits(int i5) {
            return f.defaultRandom.nextBits(i5);
        }

        @Override // kotlin.random.f
        public boolean nextBoolean() {
            return f.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.f
        @l
        public byte[] nextBytes(@l byte[] array) {
            l0.p(array, "array");
            return f.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.f
        public double nextDouble() {
            return f.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.f
        public float nextFloat() {
            return f.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.f
        public int nextInt() {
            return f.defaultRandom.nextInt();
        }

        @Override // kotlin.random.f
        public long nextLong() {
            return f.defaultRandom.nextLong();
        }

        @Override // kotlin.random.f
        @l
        public byte[] nextBytes(int i5) {
            return f.defaultRandom.nextBytes(i5);
        }

        @Override // kotlin.random.f
        public double nextDouble(double d5) {
            return f.defaultRandom.nextDouble(d5);
        }

        @Override // kotlin.random.f
        public int nextInt(int i5) {
            return f.defaultRandom.nextInt(i5);
        }

        @Override // kotlin.random.f
        public long nextLong(long j5) {
            return f.defaultRandom.nextLong(j5);
        }

        @Override // kotlin.random.f
        @l
        public byte[] nextBytes(@l byte[] array, int i5, int i6) {
            l0.p(array, "array");
            return f.defaultRandom.nextBytes(array, i5, i6);
        }

        @Override // kotlin.random.f
        public double nextDouble(double d5, double d6) {
            return f.defaultRandom.nextDouble(d5, d6);
        }

        @Override // kotlin.random.f
        public int nextInt(int i5, int i6) {
            return f.defaultRandom.nextInt(i5, i6);
        }

        @Override // kotlin.random.f
        public long nextLong(long j5, long j6) {
            return f.defaultRandom.nextLong(j5, j6);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(f fVar, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return fVar.nextBytes(bArr, i5, i6);
    }

    public abstract int nextBits(int i5);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @l
    public byte[] nextBytes(@l byte[] array, int i5, int i6) {
        l0.p(array, "array");
        if (!(new kotlin.ranges.l(0, array.length).l(i5) && new kotlin.ranges.l(0, array.length).l(i6))) {
            throw new IllegalArgumentException(("fromIndex (" + i5 + ") or toIndex (" + i6 + ") are out of range: 0.." + array.length + external.org.apache.commons.lang3.d.f15957a).toString());
        }
        if (i5 <= i6) {
            int i7 = (i6 - i5) / 4;
            for (int i8 = 0; i8 < i7; i8++) {
                int nextInt = nextInt();
                array[i5] = (byte) nextInt;
                array[i5 + 1] = (byte) (nextInt >>> 8);
                array[i5 + 2] = (byte) (nextInt >>> 16);
                array[i5 + 3] = (byte) (nextInt >>> 24);
                i5 += 4;
            }
            int i9 = i6 - i5;
            int nextBits = nextBits(i9 * 8);
            for (int i10 = 0; i10 < i9; i10++) {
                array[i5 + i10] = (byte) (nextBits >>> (i10 * 8));
            }
            return array;
        }
        throw new IllegalArgumentException(("fromIndex (" + i5 + ") must be not greater than toIndex (" + i6 + ").").toString());
    }

    public double nextDouble() {
        return e.d(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public double nextDouble(double d5) {
        return nextDouble(0.0d, d5);
    }

    public int nextInt(int i5) {
        return nextInt(0, i5);
    }

    public long nextLong(long j5) {
        return nextLong(0L, j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            kotlin.random.g.d(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r3 == 0) goto L3d
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L43
        L3d:
            double r2 = r6.nextDouble()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L43:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L4d
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L4d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.f.nextDouble(double, double):double");
    }

    public int nextInt(int i5, int i6) {
        int nextInt;
        int i7;
        int i8;
        int nextInt2;
        boolean z4;
        g.e(i5, i6);
        int i9 = i6 - i5;
        if (i9 > 0 || i9 == Integer.MIN_VALUE) {
            if (((-i9) & i9) == i9) {
                i8 = nextBits(g.g(i9));
                return i5 + i8;
            }
            do {
                nextInt = nextInt() >>> 1;
                i7 = nextInt % i9;
            } while ((nextInt - i7) + (i9 - 1) < 0);
            i8 = i7;
            return i5 + i8;
        }
        do {
            nextInt2 = nextInt();
            z4 = false;
            if (i5 <= nextInt2 && nextInt2 < i6) {
                z4 = true;
            }
        } while (!z4);
        return nextInt2;
    }

    public long nextLong(long j5, long j6) {
        long nextLong;
        boolean z4;
        long nextLong2;
        long j7;
        long j8;
        int nextInt;
        g.f(j5, j6);
        long j9 = j6 - j5;
        if (j9 > 0) {
            if (((-j9) & j9) == j9) {
                int i5 = (int) j9;
                int i6 = (int) (j9 >>> 32);
                if (i5 != 0) {
                    nextInt = nextBits(g.g(i5));
                } else if (i6 == 1) {
                    nextInt = nextInt();
                } else {
                    j8 = (nextBits(g.g(i6)) << 32) + (nextInt() & 4294967295L);
                    return j5 + j8;
                }
                j8 = nextInt & 4294967295L;
                return j5 + j8;
            }
            do {
                nextLong2 = nextLong() >>> 1;
                j7 = nextLong2 % j9;
            } while ((nextLong2 - j7) + (j9 - 1) < 0);
            j8 = j7;
            return j5 + j8;
        }
        do {
            nextLong = nextLong();
            z4 = false;
            if (j5 <= nextLong && nextLong < j6) {
                z4 = true;
            }
        } while (!z4);
        return nextLong;
    }

    @l
    public byte[] nextBytes(@l byte[] array) {
        l0.p(array, "array");
        return nextBytes(array, 0, array.length);
    }

    @l
    public byte[] nextBytes(int i5) {
        return nextBytes(new byte[i5]);
    }
}
