package com.lody.virtual.helper.dedex;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.y1;

/* loaded from: classes3.dex */
public class DataReader implements Closeable {
    private ArrayList<DataReader> mAssociatedReaders;
    private final File mFile;
    private final MappedByteBuffer mMappedBuffer;
    private final RandomAccessFile mRaf;

    public DataReader(String str) throws Exception {
        this(new File(str));
    }

    public static int toInt(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
                cArr[i5] = charAt;
                i5++;
            }
        }
        if (i5 == 0) {
            return 0;
        }
        return Integer.parseInt(new String(cArr, 0, i5));
    }

    public void addAssociatedReader(DataReader dataReader) {
        if (this.mAssociatedReaders == null) {
            this.mAssociatedReaders = new ArrayList<>();
        }
        this.mAssociatedReaders.add(dataReader);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.mRaf.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        ArrayList<DataReader> arrayList = this.mAssociatedReaders;
        if (arrayList != null) {
            Iterator<DataReader> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    public FileChannel getChannel() {
        return this.mRaf.getChannel();
    }

    public File getFile() {
        return this.mFile;
    }

    public void position(int i5) {
        this.mMappedBuffer.position(i5);
    }

    public int previewInt() {
        this.mMappedBuffer.mark();
        int readInt = readInt();
        this.mMappedBuffer.reset();
        return readInt;
    }

    public int readByte() {
        return this.mMappedBuffer.get() & y1.f19838d;
    }

    public void readBytes(byte[] bArr) {
        this.mMappedBuffer.get(bArr, 0, bArr.length);
    }

    public int readInt() {
        return this.mMappedBuffer.getInt();
    }

    public final long readLong() {
        return this.mMappedBuffer.getLong();
    }

    public short readShort() {
        return this.mMappedBuffer.getShort();
    }

    public int readUleb128() {
        int readByte = readByte();
        if (readByte > 127) {
            int readByte2 = readByte();
            int i5 = (readByte & 127) | ((readByte2 & 127) << 7);
            if (readByte2 > 127) {
                int readByte3 = readByte();
                int i6 = i5 | ((readByte3 & 127) << 14);
                if (readByte3 > 127) {
                    int readByte4 = readByte();
                    int i7 = i6 | ((readByte4 & 127) << 21);
                    if (readByte4 > 127) {
                        return i7 | (readByte() << 28);
                    }
                    return i7;
                }
                return i6;
            }
            return i5;
        }
        return readByte;
    }

    public void seek(long j5) {
        position((int) j5);
    }

    public void setLittleEndian(boolean z4) {
        ByteOrder byteOrder;
        MappedByteBuffer mappedByteBuffer = this.mMappedBuffer;
        if (z4) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        mappedByteBuffer.order(byteOrder);
    }

    public DataReader(File file) throws Exception {
        this.mFile = file;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.mRaf = randomAccessFile;
        MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
        this.mMappedBuffer = map;
        map.rewind();
        setLittleEndian(true);
    }

    public int position() {
        return this.mMappedBuffer.position();
    }

    public void readBytes(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        readBytes(bArr);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            cArr[i5] = (char) bArr[i5];
        }
    }
}
