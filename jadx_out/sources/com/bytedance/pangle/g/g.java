package com.bytedance.pangle.g;

import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;

/* loaded from: classes2.dex */
abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f4423a = new byte[8];

    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f4424a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f4425b;

        a(ByteBuffer byteBuffer, byte[] bArr) {
            this.f4424a = byteBuffer;
            this.f4425b = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private int f4426a;

        /* renamed from: b, reason: collision with root package name */
        private final ByteBuffer f4427b;

        /* renamed from: c, reason: collision with root package name */
        private final MessageDigest f4428c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f4429d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f4430e;

        /* synthetic */ b(byte[] bArr, ByteBuffer byteBuffer, byte b5) {
            this(bArr, byteBuffer);
        }

        @Override // com.bytedance.pangle.g.j
        public final void a(ByteBuffer byteBuffer) {
            byteBuffer.position();
            int remaining = byteBuffer.remaining();
            while (remaining > 0) {
                int min = Math.min(remaining, 4096 - this.f4426a);
                byteBuffer.limit(byteBuffer.position() + min);
                this.f4428c.update(byteBuffer);
                remaining -= min;
                int i5 = this.f4426a + min;
                this.f4426a = i5;
                if (i5 == 4096) {
                    MessageDigest messageDigest = this.f4428c;
                    byte[] bArr = this.f4429d;
                    messageDigest.digest(bArr, 0, bArr.length);
                    this.f4427b.put(this.f4429d);
                    this.f4428c.update(this.f4430e);
                    this.f4426a = 0;
                }
            }
        }

        final void b() {
            int position = this.f4427b.position() % 4096;
            if (position == 0) {
                return;
            }
            this.f4427b.put(ByteBuffer.allocate(4096 - position));
        }

        private b(byte[] bArr, ByteBuffer byteBuffer) {
            this.f4429d = new byte[32];
            this.f4430e = bArr;
            this.f4427b = byteBuffer.slice();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f4428c = messageDigest;
            messageDigest.update(bArr);
            this.f4426a = 0;
        }

        public final void a() {
            if (this.f4426a == 0) {
                return;
            }
            throw new IllegalStateException("Buffer is not empty: " + this.f4426a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(RandomAccessFile randomAccessFile, m mVar, i iVar) {
        int[] a5 = a(randomAccessFile.length() - (mVar.f4438c - mVar.f4437b));
        int i5 = a5[a5.length - 1];
        int i6 = i5 + 4096;
        ByteBuffer a6 = iVar.a(i6);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        a6.order(byteOrder);
        ByteBuffer a7 = a(a6, 0, i5);
        int i7 = i5 + 64;
        ByteBuffer a8 = a(a6, i5, i7);
        ByteBuffer a9 = a(a6, i7, i6);
        byte[] bArr = new byte[32];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(byteOrder);
        long j5 = mVar.f4437b;
        if (j5 % 4096 == 0) {
            long j6 = mVar.f4438c;
            if ((j6 - j5) % 4096 == 0) {
                long j7 = j6 - j5;
                int[] a10 = a(randomAccessFile.length() - j7);
                if (a7 != null) {
                    wrap.put(a(randomAccessFile, mVar, f4423a, a10, a7));
                    wrap.flip();
                }
                if (a8 != null) {
                    a8.order(byteOrder);
                    long length = randomAccessFile.length();
                    byte[] bArr2 = f4423a;
                    if (bArr2.length == 8) {
                        a8.put("TrueBrew".getBytes());
                        a8.put((byte) 1);
                        a8.put((byte) 0);
                        a8.put((byte) 12);
                        a8.put((byte) 7);
                        a8.putShort((short) 1);
                        a8.putShort((short) 1);
                        a8.putInt(0);
                        a8.putInt(0);
                        a8.putLong(length);
                        a8.put((byte) 2);
                        a8.put((byte) 0);
                        a8.put(bArr2);
                        a(a8, 22);
                        a8.flip();
                    } else {
                        throw new IllegalArgumentException("salt is not 8 bytes long");
                    }
                }
                if (a9 != null) {
                    a9.order(byteOrder);
                    long j8 = mVar.f4437b;
                    long j9 = mVar.f4439d;
                    a9.putInt(24);
                    a9.putShort((short) 1);
                    a(a9, 2);
                    a9.putLong(j8);
                    a9.putLong(j7);
                    a9.putInt(20);
                    a9.putShort((short) 2);
                    a(a9, 2);
                    a9.putLong(j9 + 16);
                    a9.putInt(c(j8));
                    a(a9, 4);
                    a9.flip();
                }
                a6.position(i7 + a9.limit());
                a6.putInt(a9.limit() + 64 + 4);
                a6.flip();
                return new a(a6, bArr);
            }
            throw new IllegalArgumentException("Size of APK Signing Block is not a multiple of 4096: " + (mVar.f4438c - mVar.f4437b));
        }
        throw new IllegalArgumentException("APK Signing Block does not start at the page  boundary: " + mVar.f4437b);
    }

    private static long b(long j5) {
        return ((j5 + 4096) - 1) / 4096;
    }

    private static int c(long j5) {
        int i5 = (int) j5;
        if (i5 == j5) {
            return i5;
        }
        throw new ArithmeticException("integer overflow");
    }

    private static void a(j jVar, k kVar, int i5) {
        long a5 = kVar.a();
        long j5 = 0;
        while (a5 > 0) {
            int min = (int) Math.min(a5, i5);
            kVar.a(jVar, j5, min);
            long j6 = min;
            j5 += j6;
            a5 -= j6;
        }
    }

    private static byte[] a(RandomAccessFile randomAccessFile, m mVar, byte[] bArr, int[] iArr, ByteBuffer byteBuffer) {
        byte b5 = 0;
        b bVar = new b(bArr, a(byteBuffer, iArr[iArr.length - 2], iArr[iArr.length - 1]), b5);
        a(bVar, new l(randomAccessFile.getFD(), 0L, mVar.f4437b), 1048576);
        long j5 = mVar.f4439d + 16;
        FileDescriptor fd = randomAccessFile.getFD();
        long j6 = mVar.f4438c;
        a(bVar, new l(fd, j6, j5 - j6), 1048576);
        ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(c(mVar.f4437b));
        order.flip();
        bVar.a(order);
        long j7 = j5 + 4;
        a(bVar, new l(randomAccessFile.getFD(), j7, randomAccessFile.length() - j7), 1048576);
        int length = (int) (randomAccessFile.length() % 4096);
        if (length != 0) {
            bVar.a(ByteBuffer.allocate(4096 - length));
        }
        bVar.a();
        bVar.b();
        for (int length2 = iArr.length - 3; length2 >= 0; length2--) {
            int i5 = length2 + 1;
            ByteBuffer a5 = a(byteBuffer, iArr[i5], iArr[length2 + 2]);
            ByteBuffer a6 = a(byteBuffer, iArr[length2], iArr[i5]);
            h hVar = new h(a5);
            b bVar2 = new b(bArr, a6, b5);
            a(bVar2, hVar, 4096);
            bVar2.a();
            bVar2.b();
        }
        byte[] bArr2 = new byte[32];
        b bVar3 = new b(bArr, ByteBuffer.wrap(bArr2), b5);
        bVar3.a(a(byteBuffer, 0, 4096));
        bVar3.a();
        return bArr2;
    }

    private static int[] a(long j5) {
        ArrayList arrayList = new ArrayList();
        do {
            j5 = b(j5) * 32;
            arrayList.add(Long.valueOf(b(j5) * 4096));
        } while (j5 > 4096);
        int[] iArr = new int[arrayList.size() + 1];
        int i5 = 0;
        iArr[0] = 0;
        while (i5 < arrayList.size()) {
            int i6 = i5 + 1;
            iArr[i6] = iArr[i5] + c(((Long) arrayList.get((arrayList.size() - i5) - 1)).longValue());
            i5 = i6;
        }
        return iArr;
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i5, int i6) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(0);
        duplicate.limit(i6);
        duplicate.position(i5);
        return duplicate.slice();
    }

    private static void a(ByteBuffer byteBuffer, int i5) {
        byteBuffer.position(byteBuffer.position() + i5);
    }
}
