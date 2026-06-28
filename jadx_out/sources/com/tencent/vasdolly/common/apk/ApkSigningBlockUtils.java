package com.tencent.vasdolly.common.apk;

import com.tencent.vasdolly.common.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class ApkSigningBlockUtils {
    public static final int ANDROID_COMMON_PAGE_ALIGNMENT_BYTES = 4096;
    public static final long APK_SIG_BLOCK_MAGIC_HI = 3617552046287187010L;
    public static final long APK_SIG_BLOCK_MAGIC_LO = 2334950737559900225L;
    public static final int APK_SIG_BLOCK_MIN_SIZE = 32;
    private static final long CONTENT_DIGESTED_CHUNK_MAX_SIZE_BYTES = 1048576;
    public static final int VERITY_PADDING_BLOCK_ID = 1114793335;

    private ApkSigningBlockUtils() {
    }

    public static void checkByteOrderLittleEndian(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static ByteBuffer findApkSignatureSchemeBlock(ByteBuffer byteBuffer, int i5) throws SignatureNotFoundException {
        checkByteOrderLittleEndian(byteBuffer);
        ByteBuffer sliceFromTo = sliceFromTo(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i6 = 0;
        while (sliceFromTo.hasRemaining()) {
            i6++;
            if (sliceFromTo.remaining() >= 8) {
                long j5 = sliceFromTo.getLong();
                if (j5 >= 4 && j5 <= 2147483647L) {
                    int i7 = (int) j5;
                    int position = sliceFromTo.position() + i7;
                    if (i7 <= sliceFromTo.remaining()) {
                        if (sliceFromTo.getInt() == i5) {
                            return getByteBuffer(sliceFromTo, i7 - 4);
                        }
                        sliceFromTo.position(position);
                    } else {
                        throw new SignatureNotFoundException("APK Signing Block entry #" + i6 + " size out of range: " + i7 + ", available: " + sliceFromTo.remaining());
                    }
                } else {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i6 + " size out of range: " + j5);
                }
            } else {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i6);
            }
        }
        throw new SignatureNotFoundException("No block with ID " + i5 + " in APK Signing Block.");
    }

    public static Pair<ByteBuffer, Long> findApkSigningBlock(RandomAccessFile randomAccessFile, long j5) throws IOException, SignatureNotFoundException {
        if (j5 >= 32) {
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j5 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) == APK_SIG_BLOCK_MAGIC_LO && allocate.getLong(16) == APK_SIG_BLOCK_MAGIC_HI) {
                long j6 = allocate.getLong(0);
                if (j6 >= allocate.capacity() && j6 <= 2147483639) {
                    int i5 = (int) (8 + j6);
                    long j7 = j5 - i5;
                    if (j7 >= 0) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(i5);
                        allocate2.order(byteOrder);
                        randomAccessFile.seek(j7);
                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                        long j8 = allocate2.getLong(0);
                        if (j8 == j6) {
                            return Pair.create(allocate2, Long.valueOf(j7));
                        }
                        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j8 + " vs " + j6);
                    }
                    throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j7);
                }
                throw new SignatureNotFoundException("APK Signing Block size out of range: " + j6);
            }
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j5);
    }

    public static SignatureInfo findSignature(RandomAccessFile randomAccessFile, int i5) throws IOException, SignatureNotFoundException {
        Pair<ByteBuffer, Long> eocd = getEocd(randomAccessFile);
        ByteBuffer first = eocd.getFirst();
        long longValue = eocd.getSecond().longValue();
        if (!ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile, longValue)) {
            long centralDirOffset = getCentralDirOffset(first, longValue);
            Pair<ByteBuffer, Long> findApkSigningBlock = findApkSigningBlock(randomAccessFile, centralDirOffset);
            ByteBuffer first2 = findApkSigningBlock.getFirst();
            return new SignatureInfo(findApkSignatureSchemeBlock(first2, i5), findApkSigningBlock.getSecond().longValue(), centralDirOffset, longValue, first);
        }
        throw new SignatureNotFoundException("ZIP64 APK not supported");
    }

    public static ByteBuffer getByteBuffer(ByteBuffer byteBuffer, int i5) throws BufferUnderflowException {
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
        throw new IllegalArgumentException("size: " + i5);
    }

    public static long getCentralDirOffset(ByteBuffer byteBuffer, long j5) throws SignatureNotFoundException {
        long zipEocdCentralDirectoryOffset = ZipUtils.getZipEocdCentralDirectoryOffset(byteBuffer);
        if (zipEocdCentralDirectoryOffset <= j5) {
            if (ZipUtils.getZipEocdCentralDirectorySizeBytes(byteBuffer) + zipEocdCentralDirectoryOffset == j5) {
                return zipEocdCentralDirectoryOffset;
            }
            throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + zipEocdCentralDirectoryOffset + ". ZIP End of Central Directory offset: " + j5);
    }

    public static Pair<ByteBuffer, Long> getEocd(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
        Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord = ZipUtils.findZipEndOfCentralDirectoryRecord(randomAccessFile);
        if (findZipEndOfCentralDirectoryRecord != null) {
            return findZipEndOfCentralDirectoryRecord;
        }
        throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static ByteBuffer sliceFromTo(ByteBuffer byteBuffer, int i5, int i6) {
        if (i5 >= 0) {
            if (i6 >= i5) {
                int capacity = byteBuffer.capacity();
                if (i6 <= byteBuffer.capacity()) {
                    int limit = byteBuffer.limit();
                    int position = byteBuffer.position();
                    try {
                        byteBuffer.position(0);
                        byteBuffer.limit(i6);
                        byteBuffer.position(i5);
                        ByteBuffer slice = byteBuffer.slice();
                        slice.order(byteBuffer.order());
                        return slice;
                    } finally {
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                    }
                }
                throw new IllegalArgumentException("end > capacity: " + i6 + " > " + capacity);
            }
            throw new IllegalArgumentException("end < start: " + i6 + " < " + i5);
        }
        throw new IllegalArgumentException("start: " + i5);
    }
}
