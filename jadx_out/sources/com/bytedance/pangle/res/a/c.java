package com.bytedance.pangle.res.a;

import android.text.TextUtils;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public final int a(File file, boolean z4, StringBuilder sb) {
        String byteArrayOutputStream;
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                ZipEntry entry = zipFile2.getEntry("assets/ZeusResMapping");
                if (entry == null) {
                    com.bytedance.pangle.util.g.a(zipFile2);
                    return 200;
                }
                if (z4) {
                    File file2 = new File(file.getParentFile(), "resMappingBak");
                    if (file2.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        FileChannel channel = fileInputStream.getChannel();
                        byteArrayOutputStream = Charset.defaultCharset().newDecoder().decode(channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).asReadOnlyBuffer()).toString();
                        channel.close();
                        fileInputStream.close();
                    } else {
                        ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "resMappingBakFile is not exists. " + file2.getAbsolutePath());
                        sb.append("resMappingBakFile is not exists. ");
                        sb.append(file2.getAbsolutePath());
                        com.bytedance.pangle.util.g.a(zipFile2);
                        return 300;
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    InputStream inputStream = zipFile2.getInputStream(entry);
                    if (inputStream != null) {
                        ReadableByteChannel newChannel = Channels.newChannel(inputStream);
                        WritableByteChannel newChannel2 = Channels.newChannel(byteArrayOutputStream2);
                        com.bytedance.pangle.util.h.a(newChannel, newChannel2);
                        newChannel.close();
                        newChannel2.close();
                    }
                    byteArrayOutputStream = byteArrayOutputStream2.toString();
                }
                if (TextUtils.isEmpty(byteArrayOutputStream)) {
                    ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "zeusResMappingContent empty, useBakFile:".concat(String.valueOf(z4)));
                    sb.append("zeusResMappingContent isEmpty. useBakFile:");
                    sb.append(z4);
                    com.bytedance.pangle.util.g.a(zipFile2);
                    return 300;
                }
                JSONObject jSONObject = new JSONObject(byteArrayOutputStream);
                JSONObject jSONObject2 = new JSONObject(byteArrayOutputStream);
                JSONArray jSONArray = (JSONArray) jSONObject.get("fileNames");
                final HashSet hashSet = new HashSet();
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    hashSet.add((String) jSONArray.get(i5));
                }
                final JSONObject jSONObject3 = (JSONObject) jSONObject.get("resMapping");
                final JSONObject jSONObject4 = (JSONObject) jSONObject2.get("resMapping");
                final int[] iArr = {0};
                a(file, (HashSet<String>) hashSet, new h() { // from class: com.bytedance.pangle.res.a.c.1
                    @Override // com.bytedance.pangle.res.a.h
                    public final int a(int i6) {
                        String str = "0x" + Integer.toHexString(i6);
                        String str2 = (String) jSONObject3.opt(str);
                        if (str2 == null) {
                            return i6;
                        }
                        int identifier = Zeus.getAppApplication().getResources().getIdentifier(str2.split(" ")[1], str2.split(" ")[0], Zeus.getAppApplication().getPackageName());
                        if (identifier == 0) {
                            identifier = Zeus.getAppApplication().getResources().getIdentifier(str2.split(" ")[1].replaceAll("_", "."), str2.split(" ")[0], Zeus.getAppApplication().getPackageName());
                        }
                        if (identifier == 0) {
                            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "getIdentifier failed. resName is ".concat(str2));
                            return i6;
                        }
                        String str3 = "0x" + Integer.toHexString(identifier);
                        if (TextUtils.equals(jSONObject4.optString(str), str2)) {
                            jSONObject4.remove(str);
                        }
                        try {
                            jSONObject4.put(str3, str2);
                        } catch (Throwable th) {
                            ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "update resMappingBak failed.", th);
                        }
                        if (identifier != i6) {
                            int[] iArr2 = iArr;
                            iArr2[0] = iArr2[0] + 1;
                        }
                        return identifier;
                    }

                    @Override // com.bytedance.pangle.res.a.h
                    public final boolean a(String str) {
                        return hashSet.contains(str);
                    }
                });
                ZeusLogger.d(ZeusLogger.TAG_INSTALL, "modifyRes count = " + iArr[0]);
                if (com.bytedance.pangle.util.h.a(jSONObject2.toString(), new File(file.getParentFile(), "resMappingBak"), sb)) {
                    com.bytedance.pangle.util.g.a(zipFile2);
                    return 100;
                }
                ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "writeText failed." + sb.toString());
                sb.append("writeText failed.");
                com.bytedance.pangle.util.g.a(zipFile2);
                return 300;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                try {
                    ZeusLogger.errReport(ZeusLogger.TAG_INSTALL, "modifyRes failed. catch: " + th.getMessage(), th);
                    sb.append("modifyRes failed. catch: ");
                    sb.append(th.getMessage());
                    return 300;
                } finally {
                    if (zipFile != null) {
                        com.bytedance.pangle.util.g.a(zipFile);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(File file, HashSet<String> hashSet, h hVar) {
        int i5;
        MappedByteBuffer a5 = a(file);
        int capacity = a5.capacity();
        if (capacity >= 22) {
            int i6 = capacity - 22;
            int min = Math.min(i6, 65535);
            for (int i7 = 0; i7 < min; i7++) {
                i5 = i6 - i7;
                if (a5.getInt(i5) == 101010256 && a5.getShort(i5 + 20) == i7) {
                    break;
                }
            }
        }
        i5 = -1;
        if (i5 != -1) {
            int i8 = a5.getInt(i5 + 12);
            int i9 = a5.getInt(i5 + 16);
            int i10 = i8 + i9;
            while (i9 < i10) {
                if (a5.getInt(i9) == 33639248) {
                    int i11 = a5.getShort(i9 + 28);
                    short s5 = a5.getShort(i9 + 30);
                    byte[] bArr = new byte[i11];
                    for (int i12 = 0; i12 < i11; i12++) {
                        bArr[i12] = a5.get(i9 + 46 + i12);
                    }
                    String str = new String(bArr);
                    int i13 = a5.getInt(i9 + 20);
                    int i14 = a5.getInt(i9 + 24);
                    if (hashSet.contains(str)) {
                        if (i13 == i14) {
                            com.bytedance.pangle.util.e<Integer, byte[]> a6 = a(a5, a5.getInt(i9 + 42), str);
                            try {
                                byte[] bArr2 = a6.f4642b;
                                if (!TextUtils.isEmpty(str) && hVar.a(str)) {
                                    if (str.equals("AndroidManifest.xml")) {
                                        k.a(bArr2, hVar);
                                    } else if ((str.endsWith(".xml") && str.startsWith("res/")) || TextUtils.equals(str, "AndroidManifest.xml")) {
                                        k.a(bArr2, hVar);
                                    } else if (str.equals("resources.arsc")) {
                                        new a(bArr2, hVar).a();
                                    }
                                }
                                for (int i15 = 0; i15 < a6.f4642b.length; i15++) {
                                    a5.put(a6.f4641a.intValue() + i15, a6.f4642b[i15]);
                                }
                            } catch (Throwable th) {
                                throw new RuntimeException(th);
                            }
                        } else {
                            throw new Throwable(str + " is compressed.");
                        }
                    }
                    i9 += i11 + 46 + s5;
                } else {
                    throw new RuntimeException("Expected: 0x02014b50, got: " + a5.getInt(i9));
                }
            }
            return;
        }
        throw new Throwable("endOfCentralPosition == -1");
    }

    private static com.bytedance.pangle.util.e<Integer, byte[]> a(MappedByteBuffer mappedByteBuffer, int i5, String str) {
        if (mappedByteBuffer.getInt(i5) == 67324752) {
            int i6 = mappedByteBuffer.getInt(i5 + 18);
            int i7 = mappedByteBuffer.getInt(i5 + 22);
            if (i6 == i7) {
                byte[] bArr = new byte[i7];
                int i8 = i5 + 30 + mappedByteBuffer.getShort(i5 + 26) + mappedByteBuffer.getShort(i5 + 28);
                for (int i9 = 0; i9 < i7; i9++) {
                    bArr[i9] = mappedByteBuffer.get(i8 + i9);
                }
                return new com.bytedance.pangle.util.e<>(Integer.valueOf(i8), bArr);
            }
            throw new RuntimeException(str + " is compressed. compressSize:" + i6 + " size:" + i7);
        }
        throw new RuntimeException("Expected: 0x04034b50, got: " + mappedByteBuffer.getInt(i5) + " FileName:" + str);
    }

    private static MappedByteBuffer a(File file) {
        RandomAccessFile randomAccessFile = null;
        try {
            ZeusLogger.d("temp-pxr", "mappedByteBuffer " + file.canWrite());
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile2.getChannel();
                long size = channel.size();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0L, size);
                byte[] bArr = new byte[4194304];
                long j5 = size / 4194304;
                int i5 = (int) (size % 4194304);
                for (int i6 = 0; i6 < j5; i6++) {
                    map.get(bArr);
                }
                if (i5 > 0) {
                    map.get(new byte[i5]);
                }
                map.order(ByteOrder.LITTLE_ENDIAN);
                randomAccessFile2.close();
                return map;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
