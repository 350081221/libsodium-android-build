package com.lody.virtual.helper.dedex;

import java.io.IOException;

/* loaded from: classes3.dex */
public class Vdex {
    private static final int VERSION_OREO_006 = 6;
    private static final int VERSION_OREO_MR1_010 = 10;
    private static final int VERSION_P_018 = 18;
    public final int dexBegin;
    public final QuickenDex[] dexFiles;
    public final Header header;
    public final int[] quickeningTableOffsets;

    /* loaded from: classes3.dex */
    public static class Header {
        final int dex_shared_data_size_;
        final int dex_size_;
        final char[] magic_;
        public final int number_of_dex_files_;
        final int quickening_info_size_;
        final int[] vdexCheckSums;
        final int verifier_deps_size_;
        public final int version;
        final char[] version_;

        public Header(DataReader dataReader) throws IOException {
            int i5;
            char[] cArr = new char[4];
            this.magic_ = cArr;
            char[] cArr2 = new char[4];
            this.version_ = cArr2;
            dataReader.readBytes(cArr);
            String str = new String(cArr);
            if ("vdex".equals(str)) {
                dataReader.readBytes(cArr2);
                this.version = DataReader.toInt(new String(cArr2));
                int readInt = dataReader.readInt();
                this.number_of_dex_files_ = readInt;
                this.dex_size_ = dataReader.readInt();
                int i6 = 0;
                if (versionNears(18)) {
                    i5 = dataReader.readInt();
                } else {
                    i5 = 0;
                }
                this.dex_shared_data_size_ = i5;
                this.verifier_deps_size_ = dataReader.readInt();
                this.quickening_info_size_ = dataReader.readInt();
                this.vdexCheckSums = new int[readInt];
                while (true) {
                    int[] iArr = this.vdexCheckSums;
                    if (i6 < iArr.length) {
                        iArr[i6] = dataReader.readInt();
                        i6++;
                    } else {
                        return;
                    }
                }
            } else {
                throw new IOException("Invalid dex magic '" + str + "'");
            }
        }

        public boolean versionNears(int i5) {
            return Math.abs(this.version - i5) <= 1;
        }
    }

    /* loaded from: classes3.dex */
    public static class QuickenDex extends Dex {
        QuickenDex(DataReader dataReader) throws IOException {
            super(dataReader);
        }
    }

    public Vdex(DataReader dataReader) throws Exception {
        int[] iArr;
        Header header = new Header(dataReader);
        this.header = header;
        int position = dataReader.position();
        this.dexBegin = position;
        dataReader.position(position);
        if (header.versionNears(18)) {
            iArr = new int[header.number_of_dex_files_];
        } else {
            iArr = null;
        }
        this.quickeningTableOffsets = iArr;
        this.dexFiles = new QuickenDex[header.number_of_dex_files_];
        for (int i5 = 0; i5 < this.header.number_of_dex_files_; i5++) {
            int[] iArr2 = this.quickeningTableOffsets;
            if (iArr2 != null) {
                iArr2[i5] = dataReader.readInt();
            }
            QuickenDex quickenDex = new QuickenDex(dataReader);
            this.dexFiles[i5] = quickenDex;
            dataReader.position(quickenDex.dexPosition + quickenDex.header.file_size_);
        }
    }
}
