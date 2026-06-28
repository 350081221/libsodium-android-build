package com.ss.android.a;

import a1.i;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import kotlin.y1;
import socket.g;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f9387a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f9388a;

        /* renamed from: b, reason: collision with root package name */
        private int f9389b;

        /* renamed from: c, reason: collision with root package name */
        private int f9390c;

        /* renamed from: d, reason: collision with root package name */
        private long f9391d;

        /* renamed from: e, reason: collision with root package name */
        private String f9392e;

        private a() {
        }
    }

    public static String a(File file) {
        return a(file, 9, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
    }

    private static String b(File file, int i5, long j5) throws Exception {
        return a(new com.ss.android.a.a(file), i5, j5);
    }

    public static String a(File file, int i5, long j5) {
        if (file != null) {
            try {
                if (file.exists()) {
                    return b(file, i5, j5);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return "";
    }

    private static long b(String str) throws RuntimeException {
        return (Long.parseLong(str, 16) - 31) >> 4;
    }

    public static int a(String str, File file) {
        return a(str, file, (b) null);
    }

    public static int a(String str, File file, b bVar) {
        int i5;
        long j5;
        String str2;
        if (str == null || str.length() == 0) {
            return 2;
        }
        try {
            if (bVar != null) {
                if (bVar.a() <= 0) {
                    try {
                        bVar.b();
                    } catch (Throwable unused) {
                    }
                    return 5;
                }
            } else if (file == null || !file.exists()) {
                return 5;
            }
            try {
                a a5 = a(str);
                if (a5 == null) {
                    i5 = -1;
                    j5 = -1;
                } else {
                    if (a5.f9388a > 1) {
                        return 3;
                    }
                    i5 = a5.f9390c;
                    j5 = a5.f9391d;
                }
                a aVar = null;
                try {
                    if (bVar != null) {
                        str2 = a(bVar, i5, j5);
                    } else {
                        str2 = b(file, i5, j5);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    if (a5 != null && (a5.f9388a != 1 || a5.f9389b != 1)) {
                        if (a5.f9392e != null) {
                            try {
                                aVar = a(str2);
                            } catch (Throwable unused2) {
                            }
                            if (aVar != null && a5.f9390c == aVar.f9390c && a5.f9391d == aVar.f9391d && a5.f9392e.equals(aVar.f9392e)) {
                                return 0;
                            }
                        }
                    }
                    return str2.equals(str) ? 0 : 1;
                }
                return 6;
            } catch (Throwable unused3) {
                return 4;
            }
        } catch (Throwable unused4) {
            return 99;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|6|(6:13|14|(3:16|(1:18)|19)|(1:21)|22|(4:31|32|33|34)(3:26|27|28))|38|14|(0)|(0)|22|(1:24)|31|32|33|34) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[Catch: all -> 0x009a, TryCatch #1 {all -> 0x009a, blocks: (B:6:0x000d, B:10:0x001a, B:14:0x002d, B:16:0x003f, B:18:0x004b, B:21:0x0062, B:22:0x006c, B:31:0x007e), top: B:5:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x009a, TryCatch #1 {all -> 0x009a, blocks: (B:6:0x000d, B:10:0x001a, B:14:0x002d, B:16:0x003f, B:18:0x004b, B:21:0x0062, B:22:0x006c, B:31:0x007e), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(com.ss.android.a.b r21, int r22, long r23) throws java.lang.Exception {
        /*
            r0 = r22
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
            if (r1 != 0) goto Ld
            java.lang.String r0 = ""
            return r0
        Ld:
            long r9 = r21.a()     // Catch: java.lang.Throwable -> L9a
            r11 = 1
            if (r0 <= 0) goto L2b
            r2 = 0
            int r2 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2b
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L9a
            long r2 = r2 * r23
            r4 = 8
            long r4 = r4 * r9
            r6 = 10
            long r4 = r4 / r6
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L28
            goto L2b
        L28:
            r12 = r23
            goto L2d
        L2b:
            r12 = r9
            r0 = r11
        L2d:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r14 = new byte[r2]     // Catch: java.lang.Throwable -> L9a
            r15 = 0
            r2 = r21
            r3 = r1
            r4 = r14
            r5 = r15
            r7 = r12
            a(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9a
            r2 = 2
            if (r0 <= r2) goto L60
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L9a
            long r2 = r2 * r12
            long r2 = r9 - r2
            int r7 = r0 + (-1)
            long r4 = (long) r7     // Catch: java.lang.Throwable -> L9a
            long r17 = r2 / r4
            r8 = r11
        L49:
            if (r8 >= r7) goto L60
            long r2 = r12 + r17
            long r15 = r15 + r2
            r2 = r21
            r3 = r1
            r4 = r14
            r5 = r15
            r19 = r7
            r20 = r8
            r7 = r12
            a(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9a
            int r8 = r20 + 1
            r7 = r19
            goto L49
        L60:
            if (r0 <= r11) goto L6c
            long r5 = r9 - r12
            r2 = r21
            r3 = r1
            r4 = r14
            r7 = r12
            a(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9a
        L6c:
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r11) goto L7e
            int r2 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r2 != 0) goto L7e
            r21.b()     // Catch: java.lang.Throwable -> L7d
        L7d:
            return r1
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r2.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = a(r0, r12)     // Catch: java.lang.Throwable -> L9a
            r2.append(r0)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = ";"
            r2.append(r0)     // Catch: java.lang.Throwable -> L9a
            r2.append(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L9a
            r21.b()     // Catch: java.lang.Throwable -> L99
        L99:
            return r0
        L9a:
            r0 = move-exception
            r21.b()     // Catch: java.lang.Throwable -> L9e
        L9e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.a.c.a(com.ss.android.a.b, int, long):java.lang.String");
    }

    private static void a(b bVar, MessageDigest messageDigest, byte[] bArr, long j5, long j6) throws IOException {
        bVar.a(j5, j6);
        long j7 = 0;
        while (j7 < j6) {
            int a5 = bVar.a(bArr, 0, (int) Math.min(j6 - j7, bArr.length));
            if (a5 > 0) {
                messageDigest.update(bArr, 0, a5);
                j7 += a5;
            } else {
                throw new IOException("updateSample unexpected readCount <= 0, readCount = " + a5 + ", readTotalCount = " + j7 + ", sampleSize = " + j6);
            }
        }
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i5 = length * 2;
            char[] cArr = new char[i5];
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = bArr[i7 + 0] & y1.f19838d;
                int i9 = i6 + 1;
                char[] cArr2 = f9387a;
                cArr[i6] = cArr2[i8 >> 4];
                i6 = i9 + 1;
                cArr[i9] = cArr2[i8 & 15];
            }
            return new String(cArr, 0, i5);
        }
        throw new NullPointerException("bytes is null");
    }

    private static String a(int i5, long j5) {
        return "ttmd5:1:1:" + a(i5) + g.f22386a + a(j5);
    }

    private static a a(String str) throws Exception {
        if (!str.startsWith("ttmd5:")) {
            return null;
        }
        String[] split = str.split(i.f136b);
        String[] split2 = split[0].split(":");
        a aVar = new a();
        aVar.f9388a = Integer.parseInt(split2[1]);
        if (aVar.f9388a > 1) {
            return aVar;
        }
        aVar.f9389b = Integer.parseInt(split2[2]);
        String[] split3 = split2[3].split(g.f22386a);
        aVar.f9390c = (int) b(split3[0]);
        aVar.f9391d = b(split3[1]);
        aVar.f9392e = split[1];
        return aVar;
    }

    private static String a(long j5) {
        return Long.toHexString((j5 << 4) + 31);
    }
}
