package com.lody.virtual.helper.dedex;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class Elf implements Closeable {
    static final int EI_CLASS = 4;
    static final int EI_DATA = 5;
    static final int EI_NIDENT = 16;
    static final char[] ELF_MAGIC = {127, 'E', 'L', 'F'};
    static final int PF_MASKOS = 267386880;
    static final int PF_MASKPROC = -268435456;
    static final int PF_R = 4;
    static final int PF_W = 2;
    static final int PF_X = 1;
    static final int PT_DYNAMIC = 2;
    static final int PT_INTERP = 3;
    static final int PT_LOAD = 1;
    static final int PT_NOTE = 4;
    static final int PT_NULL = 0;
    static final int PT_PHDR = 6;
    static final int PT_SHLIB = 5;
    static final int PT_TLS = 7;
    public static final String SHN_DYNAMIC = ".dynamic";
    public static final String SHN_DYNSTR = ".dynstr";
    public static final String SHN_DYNSYM = ".dynsym";
    public static final String SHN_HASH = ".hash";
    public static final String SHN_RODATA = ".rodata";
    public static final String SHN_SHSTRTAB = ".shstrtab";
    public static final String SHN_TEXT = ".text";
    static final int SHN_UNDEF = 0;
    static final int SHT_DYNAMIC = 6;
    static final int SHT_DYNSYM = 11;
    static final int SHT_HASH = 5;
    static final int SHT_PROGBITS = 1;
    static final int SHT_RELA = 4;
    static final int SHT_STRTAB = 3;
    static final int SHT_SYMTAB = 2;
    final char[] e_ident;
    public final boolean is64bit;
    byte[] mDynStringTable;
    Elf_Sym[] mDynamicSymbols;
    private final Ehdr mHeader;
    Elf_Phdr[] mProgHeaders;
    boolean mReadFull;
    private final DataReader mReader;
    private final Elf_Shdr[] mSectionHeaders;
    private byte[] mStringTable;

    /* loaded from: classes3.dex */
    public static abstract class Ehdr {
        short e_ehsize;
        int e_flags;
        short e_machine;
        short e_phentsize;
        short e_phnum;
        short e_shentsize;
        short e_shnum;
        short e_shstrndx;
        short e_type;
        int e_version;

        abstract long getProgramOffset();

        abstract long getSectionOffset();
    }

    /* loaded from: classes3.dex */
    static class Elf32_Ehdr extends Ehdr {
        int e_entry;
        int e_phoff;
        int e_shoff;

        Elf32_Ehdr() {
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Ehdr
        long getProgramOffset() {
            return this.e_phoff;
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Ehdr
        long getSectionOffset() {
            return this.e_shoff;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Elf32_Phdr extends Elf_Phdr {
        int p_align;
        int p_filesz;
        int p_flags;
        int p_memsz;
        int p_paddr;
        int p_vaddr;

        Elf32_Phdr() {
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Elf_Phdr
        public long getFlags() {
            return this.p_flags;
        }
    }

    /* loaded from: classes3.dex */
    static class Elf32_Shdr extends Elf_Shdr {
        int sh_addr;
        int sh_addralign;
        int sh_entsize;
        int sh_flags;
        int sh_offset;
        int sh_size;

        Elf32_Shdr() {
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Elf_Shdr
        public long getOffset() {
            return this.sh_offset;
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Elf_Shdr
        public int getSize() {
            return this.sh_size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Elf32_Sym extends Elf_Sym {
        int st_size;
        int st_value;

        Elf32_Sym() {
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Elf_Sym
        long getSize() {
            return this.st_size;
        }
    }

    /* loaded from: classes3.dex */
    static class Elf64_Ehdr extends Ehdr {
        long e_entry;
        long e_phoff;
        long e_shoff;

        Elf64_Ehdr() {
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Ehdr
        long getProgramOffset() {
            return this.e_phoff;
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Ehdr
        long getSectionOffset() {
            return this.e_shoff;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Elf64_Phdr extends Elf_Phdr {
        long p_align;
        long p_filesz;
        long p_flags;
        long p_memsz;
        long p_paddr;
        long p_vaddr;

        Elf64_Phdr() {
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Elf_Phdr
        public long getFlags() {
            return this.p_flags;
        }
    }

    /* loaded from: classes3.dex */
    static class Elf64_Shdr extends Elf_Shdr {
        long sh_addr;
        long sh_addralign;
        long sh_entsize;
        long sh_flags;
        long sh_offset;
        long sh_size;

        Elf64_Shdr() {
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Elf_Shdr
        public long getOffset() {
            return this.sh_offset;
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Elf_Shdr
        public int getSize() {
            return (int) this.sh_size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Elf64_Sym extends Elf_Sym {
        long st_size;
        long st_value;

        Elf64_Sym() {
        }

        @Override // com.lody.virtual.helper.dedex.Elf.Elf_Sym
        long getSize() {
            return this.st_size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class Elf_Phdr {
        int p_offset;
        int p_type;

        Elf_Phdr() {
        }

        String flagsString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            String str3 = "_";
            if ((getFlags() & 4) == 0) {
                str = "_";
            } else {
                str = "R";
            }
            sb.append(str);
            if ((getFlags() & 2) == 0) {
                str2 = "_";
            } else {
                str2 = "W";
            }
            sb.append(str2);
            if ((getFlags() & 1) != 0) {
                str3 = "X";
            }
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        abstract long getFlags();

        String programType() {
            switch (this.p_type) {
                case 0:
                    return "NULL";
                case 1:
                    return "Loadable Segment";
                case 2:
                    return "Dynamic Segment";
                case 3:
                    return "Interpreter Path";
                case 4:
                    return "Note";
                case 5:
                    return "PT_SHLIB";
                case 6:
                    return "Program Header";
                default:
                    return "Unknown Section";
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Elf_Shdr {
        int sh_info;
        int sh_link;
        int sh_name;
        int sh_type;

        public abstract long getOffset();

        public abstract int getSize();
    }

    /* loaded from: classes3.dex */
    public static abstract class Elf_Sym {
        char st_info;
        int st_name;
        char st_other;
        short st_shndx;

        char getBinding() {
            return (char) (this.st_info >> 4);
        }

        public long getOffset(Elf elf) {
            for (int i5 = 0; i5 < elf.mSectionHeaders.length; i5++) {
                if (this.st_shndx == i5) {
                    return elf.mSectionHeaders[i5].getOffset();
                }
            }
            return -1L;
        }

        abstract long getSize();

        char getType() {
            return (char) (this.st_info & 15);
        }

        void setBinding(char c5) {
            setBindingAndType(c5, getType());
        }

        void setBindingAndType(char c5, char c6) {
            this.st_info = (char) ((c5 << 4) + (c6 & 15));
        }

        void setType(char c5) {
            setBindingAndType(getBinding(), c5);
        }
    }

    public Elf(String str, boolean z4) throws Exception {
        this(str);
        if (z4) {
            this.mReader.close();
        }
    }

    private void readProgramHeaders() {
        Ehdr ehdr = this.mHeader;
        DataReader dataReader = this.mReader;
        this.mProgHeaders = new Elf_Phdr[ehdr.e_phnum];
        for (int i5 = 0; i5 < ehdr.e_phnum; i5++) {
            dataReader.seek(ehdr.getProgramOffset() + (ehdr.e_phentsize * i5));
            if (this.is64bit) {
                Elf64_Phdr elf64_Phdr = new Elf64_Phdr();
                elf64_Phdr.p_type = dataReader.readInt();
                elf64_Phdr.p_offset = dataReader.readInt();
                elf64_Phdr.p_vaddr = dataReader.readLong();
                elf64_Phdr.p_paddr = dataReader.readLong();
                elf64_Phdr.p_filesz = dataReader.readLong();
                elf64_Phdr.p_memsz = dataReader.readLong();
                elf64_Phdr.p_flags = dataReader.readLong();
                elf64_Phdr.p_align = dataReader.readLong();
                this.mProgHeaders[i5] = elf64_Phdr;
            } else {
                Elf32_Phdr elf32_Phdr = new Elf32_Phdr();
                elf32_Phdr.p_type = dataReader.readInt();
                elf32_Phdr.p_offset = dataReader.readInt();
                elf32_Phdr.p_vaddr = dataReader.readInt();
                elf32_Phdr.p_paddr = dataReader.readInt();
                elf32_Phdr.p_filesz = dataReader.readInt();
                elf32_Phdr.p_memsz = dataReader.readInt();
                elf32_Phdr.p_flags = dataReader.readInt();
                elf32_Phdr.p_align = dataReader.readInt();
                this.mProgHeaders[i5] = elf32_Phdr;
            }
        }
    }

    private void readSymbolTables() {
        int i5;
        DataReader dataReader = this.mReader;
        Elf_Shdr section = getSection(SHN_DYNSYM);
        if (section != null) {
            dataReader.seek(section.getOffset());
            int size = section.getSize();
            if (this.is64bit) {
                i5 = 24;
            } else {
                i5 = 16;
            }
            int i6 = size / i5;
            this.mDynamicSymbols = new Elf_Sym[i6];
            char[] cArr = new char[1];
            for (int i7 = 0; i7 < i6; i7++) {
                if (this.is64bit) {
                    Elf64_Sym elf64_Sym = new Elf64_Sym();
                    elf64_Sym.st_name = dataReader.readInt();
                    dataReader.readBytes(cArr);
                    elf64_Sym.st_info = cArr[0];
                    dataReader.readBytes(cArr);
                    elf64_Sym.st_other = cArr[0];
                    elf64_Sym.st_value = dataReader.readLong();
                    elf64_Sym.st_size = dataReader.readLong();
                    elf64_Sym.st_shndx = dataReader.readShort();
                    this.mDynamicSymbols[i7] = elf64_Sym;
                } else {
                    Elf32_Sym elf32_Sym = new Elf32_Sym();
                    elf32_Sym.st_name = dataReader.readInt();
                    elf32_Sym.st_value = dataReader.readInt();
                    elf32_Sym.st_size = dataReader.readInt();
                    dataReader.readBytes(cArr);
                    elf32_Sym.st_info = cArr[0];
                    dataReader.readBytes(cArr);
                    elf32_Sym.st_other = cArr[0];
                    elf32_Sym.st_shndx = dataReader.readShort();
                    this.mDynamicSymbols[i7] = elf32_Sym;
                }
            }
            Elf_Shdr elf_Shdr = this.mSectionHeaders[section.sh_link];
            dataReader.seek(elf_Shdr.getOffset());
            byte[] bArr = new byte[elf_Shdr.getSize()];
            this.mDynStringTable = bArr;
            dataReader.readBytes(bArr);
        }
    }

    final boolean checkMagic() {
        char[] cArr = this.e_ident;
        char c5 = cArr[0];
        char[] cArr2 = ELF_MAGIC;
        return c5 == cArr2[0] && cArr[1] == cArr2[1] && cArr[2] == cArr2[2] && cArr[3] == cArr2[3];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mReader.close();
    }

    final char getDataEncoding() {
        return this.e_ident[5];
    }

    public final String getDynString(int i5) {
        if (i5 == 0) {
            return "SHN_UNDEF";
        }
        int i6 = i5;
        while (true) {
            byte[] bArr = this.mDynStringTable;
            if (bArr[i6] != 0) {
                i6++;
            } else {
                return new String(bArr, i5, i6 - i5);
            }
        }
    }

    final char getFileClass() {
        return this.e_ident[4];
    }

    public Ehdr getHeader() {
        return this.mHeader;
    }

    public DataReader getReader() {
        return this.mReader;
    }

    public final Elf_Shdr getSection(String str) {
        for (Elf_Shdr elf_Shdr : this.mSectionHeaders) {
            if (str.equals(getString(elf_Shdr.sh_name))) {
                return elf_Shdr;
            }
        }
        return null;
    }

    public Elf_Shdr[] getSectionHeaders() {
        return this.mSectionHeaders;
    }

    public final String getString(int i5) {
        if (i5 == 0) {
            return "SHN_UNDEF";
        }
        int i6 = i5;
        while (true) {
            byte[] bArr = this.mStringTable;
            if (bArr[i6] != 0) {
                i6++;
            } else {
                return new String(bArr, i5, i6 - i5);
            }
        }
    }

    public final Elf_Sym getSymbolTable(String str) {
        Elf_Sym[] elf_SymArr = this.mDynamicSymbols;
        if (elf_SymArr != null) {
            for (Elf_Sym elf_Sym : elf_SymArr) {
                if (str.equals(getDynString(elf_Sym.st_name))) {
                    return elf_Sym;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean isLittleEndian() {
        return getDataEncoding() == 1;
    }

    public Elf(String str) throws Exception {
        this(new File(str));
    }

    public Elf(File file) throws Exception {
        char[] cArr = new char[16];
        this.e_ident = cArr;
        DataReader dataReader = new DataReader(file);
        this.mReader = dataReader;
        dataReader.readBytes(cArr);
        if (checkMagic()) {
            dataReader.setLittleEndian(isLittleEndian());
            boolean z4 = getFileClass() == 2;
            this.is64bit = z4;
            if (z4) {
                Elf64_Ehdr elf64_Ehdr = new Elf64_Ehdr();
                elf64_Ehdr.e_type = dataReader.readShort();
                elf64_Ehdr.e_machine = dataReader.readShort();
                elf64_Ehdr.e_version = dataReader.readInt();
                elf64_Ehdr.e_entry = dataReader.readLong();
                elf64_Ehdr.e_phoff = dataReader.readLong();
                elf64_Ehdr.e_shoff = dataReader.readLong();
                this.mHeader = elf64_Ehdr;
            } else {
                Elf32_Ehdr elf32_Ehdr = new Elf32_Ehdr();
                elf32_Ehdr.e_type = dataReader.readShort();
                elf32_Ehdr.e_machine = dataReader.readShort();
                elf32_Ehdr.e_version = dataReader.readInt();
                elf32_Ehdr.e_entry = dataReader.readInt();
                elf32_Ehdr.e_phoff = dataReader.readInt();
                elf32_Ehdr.e_shoff = dataReader.readInt();
                this.mHeader = elf32_Ehdr;
            }
            Ehdr ehdr = this.mHeader;
            ehdr.e_flags = dataReader.readInt();
            ehdr.e_ehsize = dataReader.readShort();
            ehdr.e_phentsize = dataReader.readShort();
            ehdr.e_phnum = dataReader.readShort();
            ehdr.e_shentsize = dataReader.readShort();
            ehdr.e_shnum = dataReader.readShort();
            ehdr.e_shstrndx = dataReader.readShort();
            this.mSectionHeaders = new Elf_Shdr[ehdr.e_shnum];
            for (int i5 = 0; i5 < ehdr.e_shnum; i5++) {
                dataReader.seek(ehdr.getSectionOffset() + (ehdr.e_shentsize * i5));
                if (this.is64bit) {
                    Elf64_Shdr elf64_Shdr = new Elf64_Shdr();
                    elf64_Shdr.sh_name = dataReader.readInt();
                    elf64_Shdr.sh_type = dataReader.readInt();
                    elf64_Shdr.sh_flags = dataReader.readLong();
                    elf64_Shdr.sh_addr = dataReader.readLong();
                    elf64_Shdr.sh_offset = dataReader.readLong();
                    elf64_Shdr.sh_size = dataReader.readLong();
                    elf64_Shdr.sh_link = dataReader.readInt();
                    elf64_Shdr.sh_info = dataReader.readInt();
                    elf64_Shdr.sh_addralign = dataReader.readLong();
                    elf64_Shdr.sh_entsize = dataReader.readLong();
                    this.mSectionHeaders[i5] = elf64_Shdr;
                } else {
                    Elf32_Shdr elf32_Shdr = new Elf32_Shdr();
                    elf32_Shdr.sh_name = dataReader.readInt();
                    elf32_Shdr.sh_type = dataReader.readInt();
                    elf32_Shdr.sh_flags = dataReader.readInt();
                    elf32_Shdr.sh_addr = dataReader.readInt();
                    elf32_Shdr.sh_offset = dataReader.readInt();
                    elf32_Shdr.sh_size = dataReader.readInt();
                    elf32_Shdr.sh_link = dataReader.readInt();
                    elf32_Shdr.sh_info = dataReader.readInt();
                    elf32_Shdr.sh_addralign = dataReader.readInt();
                    elf32_Shdr.sh_entsize = dataReader.readInt();
                    this.mSectionHeaders[i5] = elf32_Shdr;
                }
            }
            short s5 = ehdr.e_shstrndx;
            if (s5 > -1) {
                Elf_Shdr[] elf_ShdrArr = this.mSectionHeaders;
                if (s5 < elf_ShdrArr.length) {
                    Elf_Shdr elf_Shdr = elf_ShdrArr[s5];
                    if (elf_Shdr.sh_type == 3) {
                        this.mStringTable = new byte[elf_Shdr.getSize()];
                        dataReader.seek(elf_Shdr.getOffset());
                        dataReader.readBytes(this.mStringTable);
                        if (this.mReadFull) {
                            readSymbolTables();
                            readProgramHeaders();
                            return;
                        }
                        return;
                    }
                    throw new IOException("Wrong string section e_shstrndx=" + ((int) ehdr.e_shstrndx));
                }
            }
            throw new IOException("Invalid e_shstrndx=" + ((int) ehdr.e_shstrndx));
        }
        throw new IOException("Invalid elf magic: " + file);
    }
}
