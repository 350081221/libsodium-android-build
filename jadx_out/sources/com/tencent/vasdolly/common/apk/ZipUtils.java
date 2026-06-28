package com.tencent.vasdolly.common.apk;

import com.tencent.vasdolly.common.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.m2;

/* loaded from: classes3.dex */
public abstract class ZipUtils {
    private static final int UINT16_MAX_VALUE = 65535;
    private static final int ZIP64_EOCD_LOCATOR_SIG_REVERSE_BYTE_ORDER = 1347094023;
    private static final int ZIP64_EOCD_LOCATOR_SIZE = 20;
    private static final int ZIP_EOCD_CENTRAL_DIR_OFFSET_FIELD_OFFSET = 16;
    private static final int ZIP_EOCD_CENTRAL_DIR_SIZE_FIELD_OFFSET = 12;
    private static final int ZIP_EOCD_COMMENT_LENGTH_FIELD_OFFSET = 20;
    public static final int ZIP_EOCD_REC_MIN_SIZE = 22;
    private static final int ZIP_EOCD_REC_SIG = 101010256;

    private ZipUtils() {
    }

    public static void assertByteOrderLittleEndian(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord = findZipEndOfCentralDirectoryRecord(randomAccessFile, 0);
        return findZipEndOfCentralDirectoryRecord != null ? findZipEndOfCentralDirectoryRecord : findZipEndOfCentralDirectoryRecord(randomAccessFile, 65535);
    }

    public static int getUnsignedInt16(ByteBuffer byteBuffer, int i5) {
        return byteBuffer.getShort(i5) & m2.f19496d;
    }

    public static long getUnsignedInt32(ByteBuffer byteBuffer, int i5) {
        return byteBuffer.getInt(i5) & 4294967295L;
    }

    public static long getZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        return getUnsignedInt32(byteBuffer, byteBuffer.position() + 16);
    }

    public static long getZipEocdCentralDirectorySizeBytes(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        return getUnsignedInt32(byteBuffer, byteBuffer.position() + 12);
    }

    public static final boolean isZip64EndOfCentralDirectoryLocatorPresent(RandomAccessFile randomAccessFile, long j5) throws IOException {
        long j6 = j5 - 20;
        if (j6 < 0) {
            return false;
        }
        randomAccessFile.seek(j6);
        if (randomAccessFile.readInt() != ZIP64_EOCD_LOCATOR_SIG_REVERSE_BYTE_ORDER) {
            return false;
        }
        return true;
    }

    private static void setUnsignedInt32(ByteBuffer byteBuffer, int i5, long j5) {
        if (j5 >= 0 && j5 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + i5, (int) j5);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j5);
    }

    public static void setZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer, long j5) {
        assertByteOrderLittleEndian(byteBuffer);
        setUnsignedInt32(byteBuffer, byteBuffer.position() + 16, j5);
    }

    private static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(RandomAccessFile randomAccessFile, int i5) throws IOException {
        if (i5 >= 0 && i5 <= 65535) {
            long length = randomAccessFile.length();
            if (length < 22) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i5, length - 22)) + 22);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            int findZipEndOfCentralDirectoryRecord = findZipEndOfCentralDirectoryRecord(allocate);
            if (findZipEndOfCentralDirectoryRecord == -1) {
                return null;
            }
            allocate.position(findZipEndOfCentralDirectoryRecord);
            ByteBuffer slice = allocate.slice();
            slice.order(byteOrder);
            return Pair.create(slice, Long.valueOf(capacity + findZipEndOfCentralDirectoryRecord));
        }
        throw new IllegalArgumentException("maxCommentSize: " + i5);
    }

    private static int findZipEndOfCentralDirectoryRecord(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            return -1;
        }
        int i5 = capacity - 22;
        int min = Math.min(i5, 65535);
        for (int i6 = 0; i6 <= min; i6++) {
            int i7 = i5 - i6;
            if (byteBuffer.getInt(i7) == ZIP_EOCD_REC_SIG && getUnsignedInt16(byteBuffer, i7 + 20) == i6) {
                return i7;
            }
        }
        return -1;
    }
}
