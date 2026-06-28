package com.bytedance.pangle.g;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    static final HashMap<String, SparseArray<m>> f4421a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements j {

        /* renamed from: a, reason: collision with root package name */
        private final MessageDigest[] f4422a;

        a(MessageDigest[] messageDigestArr) {
            this.f4422a = messageDigestArr;
        }

        @Override // com.bytedance.pangle.g.j
        public final void a(ByteBuffer byteBuffer) {
            ByteBuffer slice = byteBuffer.slice();
            for (MessageDigest messageDigest : this.f4422a) {
                slice.position(0);
                messageDigest.update(slice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(api = 21)
    public static void a(Map<Integer, byte[]> map, RandomAccessFile randomAccessFile, m mVar) {
        if (!map.isEmpty()) {
            ArrayMap arrayMap = new ArrayMap();
            boolean z4 = true;
            if (map.containsKey(1)) {
                arrayMap.put(1, map.get(1));
            }
            if (map.containsKey(2)) {
                arrayMap.put(2, map.get(2));
            }
            boolean z5 = false;
            if (!arrayMap.isEmpty()) {
                try {
                    a(arrayMap, randomAccessFile.getFD(), mVar);
                    z4 = false;
                } catch (IOException e5) {
                    throw new SecurityException("Cannot get FD", e5);
                }
            }
            if (map.containsKey(3)) {
                try {
                    if (!Arrays.equals(a(map.get(3), randomAccessFile.length(), mVar), g.a(randomAccessFile, mVar, new i() { // from class: com.bytedance.pangle.g.f.1
                        @Override // com.bytedance.pangle.g.i
                        public final ByteBuffer a(int i5) {
                            return ByteBuffer.allocate(i5);
                        }
                    }).f4425b)) {
                        throw new SecurityException("APK verity digest of contents did not verify");
                    }
                } catch (IOException | DigestException | NoSuchAlgorithmException e6) {
                    throw new SecurityException("Error during verification", e6);
                }
            } else {
                z5 = z4;
            }
            if (z5) {
                throw new SecurityException("No known digest exists for integrity check");
            }
            return;
        }
        throw new SecurityException("No digests provided");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(int i5) {
        if (i5 == 1) {
            return "SHA-256";
        }
        if (i5 == 2) {
            return "SHA-512";
        }
        if (i5 == 3) {
            return "SHA-256";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i5)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(int i5) {
        if (i5 == 513 || i5 == 514) {
            return "EC";
        }
        if (i5 == 769) {
            return "DSA";
        }
        if (i5 == 1057) {
            return o0.d.f20838a;
        }
        if (i5 == 1059) {
            return "EC";
        }
        if (i5 == 1061) {
            return "DSA";
        }
        switch (i5) {
            case 257:
            case 258:
            case 259:
            case 260:
                return o0.d.f20838a;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i5 & (-1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<String, ? extends AlgorithmParameterSpec> d(int i5) {
        if (i5 != 513) {
            if (i5 != 514) {
                if (i5 != 769) {
                    if (i5 != 1057) {
                        if (i5 != 1059) {
                            if (i5 != 1061) {
                                switch (i5) {
                                    case 257:
                                        return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                    case 258:
                                        return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                    case 259:
                                        break;
                                    case 260:
                                        return Pair.create("SHA512withRSA", null);
                                    default:
                                        throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i5 & (-1)));
                                }
                            }
                        }
                    }
                    return Pair.create("SHA256withRSA", null);
                }
                return Pair.create("SHA256withDSA", null);
            }
            return Pair.create("SHA512withECDSA", null);
        }
        return Pair.create("SHA256withECDSA", null);
    }

    private static int e(int i5) {
        if (i5 == 1) {
            return 32;
        }
        if (i5 == 2) {
            return 64;
        }
        if (i5 == 3) {
            return 32;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i5)));
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i5) {
        if (i5 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i6 = i5 + position;
            if (i6 >= position && i6 <= limit) {
                byteBuffer.limit(i6);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i6);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: ".concat(String.valueOf(i5)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(ByteBuffer byteBuffer) {
        int i5 = byteBuffer.getInt();
        if (i5 >= 0) {
            if (i5 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i5];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i5 + ", available: " + byteBuffer.remaining());
        }
        throw new IOException("Negative length");
    }

    private static void a(Map<Integer, byte[]> map, FileDescriptor fileDescriptor, m mVar) {
        l lVar = new l(fileDescriptor, 0L, mVar.f4437b);
        long j5 = mVar.f4438c;
        l lVar2 = new l(fileDescriptor, j5, mVar.f4439d - j5);
        ByteBuffer duplicate = mVar.f4440e.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        long j6 = mVar.f4437b;
        s.a(duplicate);
        int position = duplicate.position() + 16;
        if (j6 >= 0 && j6 <= 4294967295L) {
            duplicate.putInt(duplicate.position() + position, (int) j6);
            h hVar = new h(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            Iterator<Integer> it = map.keySet().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                iArr[i5] = it.next().intValue();
                i5++;
            }
            try {
                byte[][] a5 = a(iArr, new k[]{lVar, lVar2, hVar});
                for (int i6 = 0; i6 < size; i6++) {
                    int i7 = iArr[i6];
                    if (!MessageDigest.isEqual(map.get(Integer.valueOf(i7)), a5[i6])) {
                        throw new SecurityException(b(i7) + " digest of contents did not verify");
                    }
                }
                return;
            } catch (DigestException e5) {
                throw new SecurityException("Failed to compute digest(s) of contents", e5);
            }
        }
        throw new IllegalArgumentException("uint32 value of out range: ".concat(String.valueOf(j6)));
    }

    private static byte[][] a(int[] iArr, k[] kVarArr) {
        int i5;
        long j5;
        long j6 = 0;
        long j7 = 0;
        int i6 = 0;
        while (true) {
            j5 = 1048576;
            if (i6 >= 3) {
                break;
            }
            j7 += ((kVarArr[i6].a() + 1048576) - 1) / 1048576;
            i6++;
        }
        if (j7 < 2097151) {
            int i7 = (int) j7;
            byte[][] bArr = new byte[iArr.length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                byte[] bArr2 = new byte[(e(iArr[i8]) * i7) + 5];
                bArr2[0] = 90;
                a(i7, bArr2);
                bArr[i8] = bArr2;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            int length = iArr.length;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                String b5 = b(iArr[i9]);
                try {
                    messageDigestArr[i9] = MessageDigest.getInstance(b5);
                } catch (NoSuchAlgorithmException e5) {
                    throw new RuntimeException(b5 + " digest not supported", e5);
                }
            }
            a aVar = new a(messageDigestArr);
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (i5 = 3; i10 < i5; i5 = 3) {
                k kVar = kVarArr[i10];
                long j8 = j6;
                int i13 = i12;
                a aVar2 = aVar;
                long a5 = kVar.a();
                while (a5 > j6) {
                    int min = (int) Math.min(a5, j5);
                    a(min, bArr3);
                    for (int i14 = 0; i14 < length; i14++) {
                        messageDigestArr[i14].update(bArr3);
                    }
                    a aVar3 = aVar2;
                    long j9 = j8;
                    try {
                        kVar.a(aVar3, j9, min);
                        aVar2 = aVar3;
                        k kVar2 = kVar;
                        int i15 = 0;
                        while (i15 < iArr.length) {
                            int i16 = iArr[i15];
                            byte[] bArr4 = bArr3;
                            byte[] bArr5 = bArr[i15];
                            int e6 = e(i16);
                            int i17 = length;
                            MessageDigest messageDigest = messageDigestArr[i15];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i13 * e6) + 5, e6);
                            if (digest != e6) {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                            i15++;
                            bArr3 = bArr4;
                            length = i17;
                            messageDigestArr = messageDigestArr2;
                        }
                        long j10 = min;
                        long j11 = j9 + j10;
                        a5 -= j10;
                        i13++;
                        j6 = 0;
                        j5 = 1048576;
                        kVar = kVar2;
                        bArr3 = bArr3;
                        j8 = j11;
                    } catch (IOException e7) {
                        throw new DigestException("Failed to digest chunk #" + i13 + " of section #" + i11, e7);
                    }
                }
                i11++;
                i10++;
                aVar = aVar2;
                j6 = 0;
                j5 = 1048576;
                i12 = i13;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i18 = 0; i18 < iArr.length; i18++) {
                int i19 = iArr[i18];
                byte[] bArr7 = bArr[i18];
                String b6 = b(i19);
                try {
                    bArr6[i18] = MessageDigest.getInstance(b6).digest(bArr7);
                } catch (NoSuchAlgorithmException e8) {
                    throw new RuntimeException(b6 + " digest not supported", e8);
                }
            }
            return bArr6;
        }
        throw new DigestException("Too many chunks: ".concat(String.valueOf(j7)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(byte[] bArr, long j5, m mVar) {
        if (bArr.length == 40) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.position(32);
            if (order.getLong() == j5 - (mVar.f4438c - mVar.f4437b)) {
                return Arrays.copyOfRange(bArr, 0, 32);
            }
            throw new SecurityException("APK content size did not verify");
        }
        throw new SecurityException("Verity digest size is wrong: " + bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i5, int i6) {
        int a5 = a(i5);
        int a6 = a(i6);
        if (a5 == 1) {
            if (a6 == 1) {
                return 0;
            }
            if (a6 == 2 || a6 == 3) {
                return -1;
            }
            throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a6)));
        }
        if (a5 == 2) {
            if (a6 != 1) {
                if (a6 == 2) {
                    return 0;
                }
                if (a6 != 3) {
                    throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a6)));
                }
            }
            return 1;
        }
        if (a5 != 3) {
            throw new IllegalArgumentException("Unknown digestAlgorithm1: ".concat(String.valueOf(a5)));
        }
        if (a6 == 1) {
            return 1;
        }
        if (a6 == 2) {
            return -1;
        }
        if (a6 == 3) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown digestAlgorithm2: ".concat(String.valueOf(a6)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i5) {
        if (i5 == 513) {
            return 1;
        }
        if (i5 == 514) {
            return 2;
        }
        if (i5 == 769) {
            return 1;
        }
        if (i5 == 1057 || i5 == 1059 || i5 == 1061) {
            return 3;
        }
        switch (i5) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i5 & (-1)));
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i5) {
        if (i5 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i5 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i5);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            }
            throw new IllegalArgumentException("end > capacity: " + i5 + " > " + capacity);
        }
        throw new IllegalArgumentException("end < start: " + i5 + " < 8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i5 = byteBuffer.getInt();
            if (i5 >= 0) {
                if (i5 <= byteBuffer.remaining()) {
                    return b(byteBuffer, i5);
                }
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i5 + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    private static void a(int i5, byte[] bArr) {
        bArr[1] = (byte) (i5 & 255);
        bArr[2] = (byte) ((i5 >>> 8) & 255);
        bArr[3] = (byte) ((i5 >>> 16) & 255);
        bArr[4] = (byte) ((i5 >>> 24) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r24, java.io.RandomAccessFile r25, int... r26) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.g.f.a(java.lang.String, java.io.RandomAccessFile, int[]):void");
    }
}
