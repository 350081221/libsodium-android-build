package com.lody.virtual.helper.dedex;

import com.lody.virtual.helper.utils.FileUtils;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class Oat {
    public static final String SECTION_RODATA = ".rodata";
    public final Dex[] dexFiles;
    public final Header header;
    public final OatDexFile[] oatDexFiles;
    public final long oatPosition;
    public final File srcFile;

    /* loaded from: classes3.dex */
    public static class Header {
        final int adler32_checksum_;
        int artVersion;
        final int dex_file_count_;
        final int executable_offset_;
        final int image_file_location_oat_checksum_;
        final int image_file_location_oat_data_begin_;
        final int image_patch_delta_;
        final int instruction_set_;
        final int instruction_set_features_;
        final int interpreter_to_compiled_code_bridge_offset_;
        final int interpreter_to_interpreter_bridge_offset_;
        final int jni_dlsym_lookup_offset_;
        final char[] key_value_store_;
        final int key_value_store_size_;
        final char[] magic_;
        int portable_imt_conflict_trampoline_offset_;
        int portable_resolution_trampoline_offset_;
        int portable_to_interpreter_bridge_offset_;
        final int quick_generic_jni_trampoline_offset_;
        final int quick_imt_conflict_trampoline_offset_;
        final int quick_resolution_trampoline_offset_;
        final int quick_to_interpreter_bridge_offset_;
        final char[] version_;

        public Header(DataReader dataReader) throws IOException {
            char[] cArr = new char[4];
            this.magic_ = cArr;
            char[] cArr2 = new char[4];
            this.version_ = cArr2;
            dataReader.readBytes(cArr);
            if (cArr[0] == 'o' && cArr[1] == 'a' && cArr[2] == 't') {
                dataReader.readBytes(cArr2);
                this.artVersion = DataReader.toInt(new String(cArr2));
                this.adler32_checksum_ = dataReader.readInt();
                this.instruction_set_ = dataReader.readInt();
                this.instruction_set_features_ = dataReader.readInt();
                this.dex_file_count_ = dataReader.readInt();
                this.executable_offset_ = dataReader.readInt();
                this.interpreter_to_interpreter_bridge_offset_ = dataReader.readInt();
                this.interpreter_to_compiled_code_bridge_offset_ = dataReader.readInt();
                this.jni_dlsym_lookup_offset_ = dataReader.readInt();
                if (this.artVersion < 52) {
                    this.portable_imt_conflict_trampoline_offset_ = dataReader.readInt();
                    this.portable_resolution_trampoline_offset_ = dataReader.readInt();
                    this.portable_to_interpreter_bridge_offset_ = dataReader.readInt();
                }
                this.quick_generic_jni_trampoline_offset_ = dataReader.readInt();
                this.quick_imt_conflict_trampoline_offset_ = dataReader.readInt();
                this.quick_resolution_trampoline_offset_ = dataReader.readInt();
                this.quick_to_interpreter_bridge_offset_ = dataReader.readInt();
                this.image_patch_delta_ = dataReader.readInt();
                this.image_file_location_oat_checksum_ = dataReader.readInt();
                this.image_file_location_oat_data_begin_ = dataReader.readInt();
                int readInt = dataReader.readInt();
                this.key_value_store_size_ = readInt;
                char[] cArr3 = new char[readInt];
                this.key_value_store_ = cArr3;
                dataReader.readBytes(cArr3);
                return;
            }
            throw new IOException(String.format("Invalid art magic %c%c%c", Character.valueOf(cArr[0]), Character.valueOf(cArr[1]), Character.valueOf(cArr[2])));
        }
    }

    /* loaded from: classes3.dex */
    public static final class InstructionSet {
        public static final int kArm = 1;
        public static final int kArm64 = 2;
        public static final int kMips = 6;
        public static final int kMips64 = 7;
        public static final int kNone = 0;
        public static final int kThumb2 = 3;
        public static final int kX86 = 4;
        public static final int kX86_64 = 5;
    }

    /* loaded from: classes3.dex */
    public static class OatDexFile {
        int class_offsets_offset_;
        final int dex_file_location_checksum_;
        public final byte[] dex_file_location_data_;
        public final int dex_file_location_size_;
        final int dex_file_offset_;
        File dex_file_pointer_;
        int lookup_table_offset_;

        public OatDexFile(DataReader dataReader, int i5) throws IOException {
            int readInt = dataReader.readInt();
            this.dex_file_location_size_ = readInt;
            byte[] bArr = new byte[readInt];
            this.dex_file_location_data_ = bArr;
            dataReader.readBytes(bArr);
            this.dex_file_location_checksum_ = dataReader.readInt();
            int readInt2 = dataReader.readInt();
            this.dex_file_offset_ = readInt2;
            File changeExt = FileUtils.changeExt(dataReader.getFile(), "vdex");
            if (changeExt.exists()) {
                this.dex_file_pointer_ = changeExt;
            } else if (readInt2 == 28) {
                throw new IOException("dex_file_offset_=" + readInt2 + ", does " + changeExt.getName() + " miss?");
            }
            if (i5 >= Version.N_70.oat) {
                this.class_offsets_offset_ = dataReader.readInt();
                this.lookup_table_offset_ = dataReader.readInt();
            }
        }

        public String getLocation() {
            return new String(this.dex_file_location_data_);
        }
    }

    /* loaded from: classes3.dex */
    public enum Version {
        L_50(21, 39),
        L_MR1_51(22, 45),
        M_60(23, 64),
        N_70(24, 79),
        N_MR1_71(25, 88),
        O_80(26, 124),
        O_MR1_81(27, 131);

        public final int api;
        public final int oat;

        Version(int i5, int i6) {
            this.api = i5;
            this.oat = i6;
        }
    }

    public Oat(DataReader dataReader) throws Exception {
        Dex dex;
        long position = dataReader.position();
        this.oatPosition = position;
        if (position == 4096) {
            this.srcFile = dataReader.getFile();
            Header header = new Header(dataReader);
            this.header = header;
            int i5 = header.dex_file_count_;
            this.oatDexFiles = new OatDexFile[i5];
            this.dexFiles = new Dex[i5];
            for (int i6 = 0; i6 < this.oatDexFiles.length; i6++) {
                OatDexFile oatDexFile = new OatDexFile(dataReader, this.header.artVersion);
                this.oatDexFiles[i6] = oatDexFile;
                long position2 = dataReader.position();
                File file = oatDexFile.dex_file_pointer_;
                if (file != null) {
                    DataReader dataReader2 = new DataReader(file);
                    dataReader.addAssociatedReader(dataReader2);
                    dataReader2.seek(oatDexFile.dex_file_offset_);
                    dex = new Dex(dataReader2);
                } else {
                    dataReader.seek(this.oatPosition + oatDexFile.dex_file_offset_);
                    dex = new Dex(dataReader);
                }
                this.dexFiles[i6] = dex;
                if (this.header.artVersion < Version.N_70.oat) {
                    dataReader.seek(position2 + (dex.header.class_defs_size_ * 4));
                    if (dataReader.previewInt() > 255) {
                        dataReader.readInt();
                    }
                } else {
                    dataReader.seek(position2);
                }
            }
            return;
        }
        throw new IOException("Strange oat position " + position);
    }

    public int getArtVersion() {
        return this.header.artVersion;
    }
}
