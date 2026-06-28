package com.lody.virtual.helper.dedex;

import com.android.dex.DexFormat;
import com.lody.virtual.helper.utils.FileUtils;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.zip.Adler32;

/* loaded from: classes3.dex */
public class Dex {
    public final int dataEnd;
    public final int dexPosition;
    public final Header header;
    private final DataReader mReader;

    /* loaded from: classes3.dex */
    public static class Header {
        static final String MAGIC_COMPACT_DEX = "cdex";
        static final String MAGIC_DEX = "dex";
        final int checksum_;
        final int class_defs_off_;
        final int class_defs_size_;
        public final int data_off_;
        final int data_size_;
        final int endian_tag_;
        final int field_ids_off_;
        final int field_ids_size_;
        public final int file_size_;
        public final int header_size_;
        final boolean isCompactDex;
        final int link_off_;
        final int link_size_;
        final String magic;
        final char[] magic_;
        final int map_off_;
        final int method_ids_off_;
        final int method_ids_size_;
        final int proto_ids_off_;
        final int proto_ids_size_;
        final byte[] signature_;
        final int string_ids_off_;
        final int string_ids_size_;
        final int type_ids_off_;
        final int type_ids_size_;
        final String version;
        final char[] version_;

        public Header(DataReader dataReader) throws IOException {
            char[] cArr = new char[4];
            this.magic_ = cArr;
            char[] cArr2 = new char[4];
            this.version_ = cArr2;
            byte[] bArr = new byte[20];
            this.signature_ = bArr;
            dataReader.readBytes(cArr);
            String trim = new String(cArr).trim();
            this.magic = trim;
            boolean equals = trim.equals(MAGIC_COMPACT_DEX);
            this.isCompactDex = equals;
            if (!trim.equals(MAGIC_DEX) && !equals) {
                throw new IOException(String.format("Invalid dex magic '%s'", trim));
            }
            dataReader.readBytes(cArr2);
            String trim2 = new String(cArr2).trim();
            this.version = trim2;
            if (!equals && trim2.compareTo(DexFormat.VERSION_FOR_API_13) < 0) {
                throw new IOException(String.format("Invalid dex version '%s'", trim2));
            }
            this.checksum_ = dataReader.readInt();
            dataReader.readBytes(bArr);
            this.file_size_ = dataReader.readInt();
            this.header_size_ = dataReader.readInt();
            this.endian_tag_ = dataReader.readInt();
            this.link_size_ = dataReader.readInt();
            this.link_off_ = dataReader.readInt();
            this.map_off_ = dataReader.readInt();
            this.string_ids_size_ = dataReader.readInt();
            this.string_ids_off_ = dataReader.readInt();
            this.type_ids_size_ = dataReader.readInt();
            this.type_ids_off_ = dataReader.readInt();
            this.proto_ids_size_ = dataReader.readInt();
            this.proto_ids_off_ = dataReader.readInt();
            this.field_ids_size_ = dataReader.readInt();
            this.field_ids_off_ = dataReader.readInt();
            this.method_ids_size_ = dataReader.readInt();
            this.method_ids_off_ = dataReader.readInt();
            this.class_defs_size_ = dataReader.readInt();
            this.class_defs_off_ = dataReader.readInt();
            this.data_size_ = dataReader.readInt();
            this.data_off_ = dataReader.readInt();
        }
    }

    public Dex(DataReader dataReader) throws IOException {
        int i5;
        this.dexPosition = dataReader.position();
        this.mReader = dataReader;
        Header header = new Header(dataReader);
        this.header = header;
        if (header.isCompactDex) {
            i5 = header.data_off_ + header.data_size_;
        } else {
            i5 = header.file_size_;
        }
        this.dataEnd = i5;
    }

    private void calcChecksum(byte[] bArr) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr, 12, bArr.length - 12);
        int value = (int) adler32.getValue();
        if (this.header.checksum_ != value) {
            bArr[8] = (byte) value;
            bArr[9] = (byte) (value >> 8);
            bArr[10] = (byte) (value >> 16);
            bArr[11] = (byte) (value >> 24);
        }
    }

    private void calcSignature(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(bArr, 32, bArr.length - 32);
            messageDigest.digest(bArr, 12, 20);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[this.dataEnd];
        this.mReader.position(this.dexPosition);
        this.mReader.readBytes(bArr);
        return bArr;
    }

    public byte[] getFixedBytes() {
        byte[] bytes = getBytes();
        calcSignature(bytes);
        calcChecksum(bytes);
        return bytes;
    }

    public void writeTo(File file) throws IOException {
        FileUtils.writeToFile(getFixedBytes(), file);
    }
}
