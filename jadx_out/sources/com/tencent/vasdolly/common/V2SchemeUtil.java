package com.tencent.vasdolly.common;

import com.tencent.vasdolly.common.apk.ApkSigningBlockUtils;
import com.tencent.vasdolly.common.apk.SignatureNotFoundException;
import com.tencent.vasdolly.common.apk.ZipUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class V2SchemeUtil {
    public static final int APK_SIGNATURE_SCHEME_V2_BLOCK_ID = 1896449818;

    public static boolean containV2Signature(File file) {
        try {
            if (getAllIdValue(getApkSigningBlock(file)).containsKey(Integer.valueOf(APK_SIGNATURE_SCHEME_V2_BLOCK_ID))) {
                return true;
            }
            return false;
        } catch (SignatureNotFoundException unused) {
            System.out.println("APK : " + file.getAbsolutePath() + " not have apk v2 signature block");
            return false;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static Pair<ByteBuffer, Long> findCentralDir(RandomAccessFile randomAccessFile, long j5, int i5) throws IOException {
        return Pair.create(getByteBuffer(randomAccessFile, j5, i5), Long.valueOf(j5));
    }

    public static Pair<ByteBuffer, Long> findContentEntry(RandomAccessFile randomAccessFile, int i5) throws IOException {
        return Pair.create(getByteBuffer(randomAccessFile, 0L, i5), 0L);
    }

    public static ByteBuffer generateApkSigningBlock(Map<Integer, ByteBuffer> map) {
        if (map != null && !map.isEmpty()) {
            long j5 = 24;
            while (map.entrySet().iterator().hasNext()) {
                j5 += r0.next().getValue().remaining() + 12;
            }
            boolean containsKey = map.containsKey(Integer.valueOf(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID));
            System.out.println("generateApkSigningBlock , needPadding = " + containsKey);
            if (containsKey) {
                j5 -= map.get(Integer.valueOf(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID)).remaining() + 12;
                map.remove(Integer.valueOf(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID));
                int i5 = (int) ((j5 + 8) % 4096);
                if (i5 != 0) {
                    int i6 = 4096 - i5;
                    if (i6 < 12) {
                        i6 += 4096;
                    }
                    j5 += i6;
                    int i7 = (i6 - 8) - 4;
                    map.put(Integer.valueOf(ApkSigningBlockUtils.VERITY_PADDING_BLOCK_ID), ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN));
                    System.out.println("generateApkSigningBlock , final length = " + j5 + " padding = " + i6 + " bufferSize = " + i7);
                }
            }
            ByteBuffer allocate = ByteBuffer.allocate((int) (8 + j5));
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putLong(j5);
            for (Map.Entry<Integer, ByteBuffer> entry : map.entrySet()) {
                ByteBuffer value = entry.getValue();
                allocate.putLong(value.remaining() + 4);
                allocate.putInt(entry.getKey().intValue());
                allocate.put(value.array(), value.arrayOffset() + value.position(), value.remaining());
            }
            allocate.putLong(j5);
            allocate.putLong(ApkSigningBlockUtils.APK_SIG_BLOCK_MAGIC_LO);
            allocate.putLong(ApkSigningBlockUtils.APK_SIG_BLOCK_MAGIC_HI);
            if (allocate.remaining() <= 0) {
                allocate.flip();
                return allocate;
            }
            throw new RuntimeException("generateNewApkV2SchemeBlock error");
        }
        throw new RuntimeException("getNewApkV2SchemeBlock , id value pair is empty");
    }

    public static Map<Integer, ByteBuffer> getAllIdValue(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        ApkSigningBlockUtils.checkByteOrderLittleEndian(byteBuffer);
        ByteBuffer sliceFromTo = ApkSigningBlockUtils.sliceFromTo(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i5 = 0;
        while (sliceFromTo.hasRemaining()) {
            i5++;
            if (sliceFromTo.remaining() >= 8) {
                long j5 = sliceFromTo.getLong();
                if (j5 >= 4 && j5 <= 2147483647L) {
                    int i6 = (int) j5;
                    int position = sliceFromTo.position() + i6;
                    if (i6 <= sliceFromTo.remaining()) {
                        linkedHashMap.put(Integer.valueOf(sliceFromTo.getInt()), ApkSigningBlockUtils.getByteBuffer(sliceFromTo, i6 - 4));
                        sliceFromTo.position(position);
                    } else {
                        throw new SignatureNotFoundException("APK Signing Block entry #" + i5 + " size out of range: " + i6 + ", available: " + sliceFromTo.remaining());
                    }
                } else {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i5 + " size out of range: " + j5);
                }
            } else {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i5);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap;
        }
        throw new SignatureNotFoundException("not have Id-Value Pair in APK Signing Block entry #" + i5);
    }

    public static ApkSectionInfo getApkSectionInfo(File file, boolean z4) throws IOException, SignatureNotFoundException {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair<ByteBuffer, Long> eocd = ApkSigningBlockUtils.getEocd(randomAccessFile2);
                ByteBuffer first = eocd.getFirst();
                long longValue = eocd.getSecond().longValue();
                if (!ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile2, longValue)) {
                    long centralDirOffset = ApkSigningBlockUtils.getCentralDirOffset(first, longValue);
                    Pair<ByteBuffer, Long> findApkSigningBlock = ApkSigningBlockUtils.findApkSigningBlock(randomAccessFile2, centralDirOffset);
                    Pair<ByteBuffer, Long> findCentralDir = findCentralDir(randomAccessFile2, centralDirOffset, (int) (longValue - centralDirOffset));
                    ApkSectionInfo apkSectionInfo = new ApkSectionInfo();
                    long length = file.length();
                    apkSectionInfo.apkSize = length;
                    apkSectionInfo.lowMemory = z4;
                    if (length > ApkSectionInfo.COPY_CONTENT_MAX_SIZE) {
                        apkSectionInfo.lowMemory = true;
                    }
                    if (!apkSectionInfo.lowMemory) {
                        apkSectionInfo.contentEntry = findContentEntry(randomAccessFile2, (int) findApkSigningBlock.getSecond().longValue());
                    }
                    apkSectionInfo.apkSigningBlock = findApkSigningBlock;
                    apkSectionInfo.centralDir = findCentralDir;
                    apkSectionInfo.eocd = eocd;
                    apkSectionInfo.checkParamters();
                    System.out.println("baseApk : " + file.getAbsolutePath() + "\nApkSectionInfo = " + apkSectionInfo);
                    randomAccessFile2.close();
                    return apkSectionInfo;
                }
                throw new SignatureNotFoundException("ZIP64 APK not supported");
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

    public static ByteBuffer getApkSigningBlock(File file) throws SignatureNotFoundException, IOException {
        RandomAccessFile randomAccessFile = null;
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair<ByteBuffer, Long> eocd = ApkSigningBlockUtils.getEocd(randomAccessFile2);
                ByteBuffer first = eocd.getFirst();
                long longValue = eocd.getSecond().longValue();
                if (!ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile2, longValue)) {
                    ByteBuffer first2 = ApkSigningBlockUtils.findApkSigningBlock(randomAccessFile2, ApkSigningBlockUtils.getCentralDirOffset(first, longValue)).getFirst();
                    randomAccessFile2.close();
                    return first2;
                }
                throw new SignatureNotFoundException("ZIP64 APK not supported");
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

    private static ByteBuffer getByteBuffer(RandomAccessFile randomAccessFile, long j5, int i5) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(i5);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j5);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        return allocate;
    }
}
