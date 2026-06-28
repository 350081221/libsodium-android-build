package com.bytedance.pangle.util.b.a;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.pangle.util.b.b.d;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a {
    public static d a(String str) {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
            try {
                if (randomAccessFile2.length() >= 22) {
                    d dVar = new d(str);
                    long length = randomAccessFile2.length();
                    if (length >= 22) {
                        long j5 = length - 22;
                        randomAccessFile2.seek(j5);
                        if (dVar.f4639c.a(randomAccessFile2) != 101010256) {
                            j5 = b(randomAccessFile2, dVar);
                        }
                        randomAccessFile2.seek(j5 + 4);
                        com.bytedance.pangle.util.b.b.b bVar = new com.bytedance.pangle.util.b.b.b();
                        randomAccessFile2.skipBytes(6);
                        bVar.f4625a = dVar.f4639c.b(randomAccessFile2);
                        randomAccessFile2.skipBytes(4);
                        bVar.f4626b = dVar.f4639c.a(randomAccessFile2);
                        dVar.f4638b = bVar;
                        if (bVar.f4625a == 0) {
                            try {
                                randomAccessFile2.close();
                            } catch (IOException unused) {
                            }
                            return dVar;
                        }
                        a(randomAccessFile2, dVar);
                        try {
                            randomAccessFile2.close();
                        } catch (IOException unused2) {
                        }
                        return dVar;
                    }
                    throw new IOException("Zip file size less than size of zip headers. Probably not a zip file.");
                }
                throw new IOException("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long b(RandomAccessFile randomAccessFile, d dVar) {
        long length = randomAccessFile.length() - 22;
        long length2 = randomAccessFile.length();
        long j5 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        if (length2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            j5 = randomAccessFile.length();
        }
        while (j5 > 0 && length > 0) {
            length--;
            randomAccessFile.seek(length);
            if (dVar.f4639c.a(randomAccessFile) == 101010256) {
                return length;
            }
            j5--;
        }
        throw new IOException("Zip headers not found. Probably not a zip file");
    }

    private static void a(RandomAccessFile randomAccessFile, d dVar) {
        com.bytedance.pangle.util.b.b.a aVar = new com.bytedance.pangle.util.b.b.a();
        ArrayList arrayList = new ArrayList();
        com.bytedance.pangle.util.b.b.b bVar = dVar.f4638b;
        long j5 = bVar.f4626b;
        long j6 = bVar.f4625a;
        randomAccessFile.seek(j5);
        for (int i5 = 0; i5 < j6; i5++) {
            com.bytedance.pangle.util.b.b.c cVar = new com.bytedance.pangle.util.b.b.c();
            if (dVar.f4639c.a(randomAccessFile) == 33639248) {
                randomAccessFile.skipBytes(6);
                cVar.f4627a = dVar.f4639c.b(randomAccessFile);
                randomAccessFile.skipBytes(4);
                cVar.f4628b = dVar.f4639c.a(randomAccessFile);
                cVar.f4629c = dVar.f4639c.a(randomAccessFile);
                cVar.f4630d = dVar.f4639c.a(randomAccessFile);
                int b5 = dVar.f4639c.b(randomAccessFile);
                cVar.f4631e = b5;
                cVar.f4632f = dVar.f4639c.b(randomAccessFile);
                int b6 = dVar.f4639c.b(randomAccessFile);
                randomAccessFile.skipBytes(8);
                cVar.f4635i = dVar.f4639c.a(randomAccessFile);
                if (b5 > 0) {
                    byte[] bArr = new byte[b5];
                    randomAccessFile.readFully(bArr);
                    cVar.f4634h = new String(bArr, Charset.forName("UTF-8"));
                    randomAccessFile.skipBytes(cVar.f4632f);
                    if (b6 > 0) {
                        randomAccessFile.skipBytes(b6);
                    }
                    long filePointer = randomAccessFile.getFilePointer();
                    randomAccessFile.seek(cVar.f4635i + 28);
                    cVar.f4633g = dVar.f4639c.b(randomAccessFile);
                    randomAccessFile.seek(filePointer);
                    arrayList.add(cVar);
                } else {
                    throw new IOException("Invalid entry name in file header");
                }
            } else {
                throw new IOException("Expected central directory entry not found (#" + (i5 + 1) + ")");
            }
        }
        aVar.f4624a = arrayList;
        dVar.f4637a = aVar;
    }
}
