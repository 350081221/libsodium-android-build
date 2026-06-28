.class public Lcom/lody/virtual/helper/dedex/Elf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf64_Sym;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf32_Sym;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;,
        Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;,
        Lcom/lody/virtual/helper/dedex/Elf$Ehdr;
    }
.end annotation


# static fields
.field static final EI_CLASS:I = 0x4

.field static final EI_DATA:I = 0x5

.field static final EI_NIDENT:I = 0x10

.field static final ELF_MAGIC:[C

.field static final PF_MASKOS:I = 0xff00000

.field static final PF_MASKPROC:I = -0x10000000

.field static final PF_R:I = 0x4

.field static final PF_W:I = 0x2

.field static final PF_X:I = 0x1

.field static final PT_DYNAMIC:I = 0x2

.field static final PT_INTERP:I = 0x3

.field static final PT_LOAD:I = 0x1

.field static final PT_NOTE:I = 0x4

.field static final PT_NULL:I = 0x0

.field static final PT_PHDR:I = 0x6

.field static final PT_SHLIB:I = 0x5

.field static final PT_TLS:I = 0x7

.field public static final SHN_DYNAMIC:Ljava/lang/String; = ".dynamic"

.field public static final SHN_DYNSTR:Ljava/lang/String; = ".dynstr"

.field public static final SHN_DYNSYM:Ljava/lang/String; = ".dynsym"

.field public static final SHN_HASH:Ljava/lang/String; = ".hash"

.field public static final SHN_RODATA:Ljava/lang/String; = ".rodata"

.field public static final SHN_SHSTRTAB:Ljava/lang/String; = ".shstrtab"

.field public static final SHN_TEXT:Ljava/lang/String; = ".text"

.field static final SHN_UNDEF:I = 0x0

.field static final SHT_DYNAMIC:I = 0x6

.field static final SHT_DYNSYM:I = 0xb

.field static final SHT_HASH:I = 0x5

.field static final SHT_PROGBITS:I = 0x1

.field static final SHT_RELA:I = 0x4

.field static final SHT_STRTAB:I = 0x3

.field static final SHT_SYMTAB:I = 0x2


# instance fields
.field final e_ident:[C

.field public final is64bit:Z

.field mDynStringTable:[B

.field mDynamicSymbols:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;

.field private final mHeader:Lcom/lody/virtual/helper/dedex/Elf$Ehdr;

.field mProgHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;

.field mReadFull:Z

.field private final mReader:Lcom/lody/virtual/helper/dedex/DataReader;

.field private final mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

.field private mStringTable:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/lody/virtual/helper/dedex/Elf;->ELF_MAGIC:[C

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 2
        0x7fs
        0x45s
        0x4cs
        0x46s
    .end array-data
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 5
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->e_ident:[C

    .line 6
    new-instance v1, Lcom/lody/virtual/helper/dedex/DataReader;

    invoke-direct {v1, p1}, Lcom/lody/virtual/helper/dedex/DataReader;-><init>(Ljava/io/File;)V

    iput-object v1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    .line 7
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 8
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf;->checkMagic()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 9
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf;->isLittleEndian()Z

    move-result p1

    invoke-virtual {v1, p1}, Lcom/lody/virtual/helper/dedex/DataReader;->setLittleEndian(Z)V

    .line 10
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf;->getFileClass()C

    move-result p1

    const/4 v0, 0x2

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iput-boolean p1, p0, Lcom/lody/virtual/helper/dedex/Elf;->is64bit:Z

    if-eqz p1, :cond_1

    .line 11
    new-instance p1, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;

    invoke-direct {p1}, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;-><init>()V

    .line 12
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_type:S

    .line 13
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_machine:S

    .line 14
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v0

    iput v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_version:I

    .line 15
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, p1, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;->e_entry:J

    .line 16
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, p1, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;->e_phoff:J

    .line 17
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, p1, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;->e_shoff:J

    .line 18
    iput-object p1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mHeader:Lcom/lody/virtual/helper/dedex/Elf$Ehdr;

    goto :goto_1

    .line 19
    :cond_1
    new-instance p1, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;

    invoke-direct {p1}, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;-><init>()V

    .line 20
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_type:S

    .line 21
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_machine:S

    .line 22
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v0

    iput v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_version:I

    .line 23
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v0

    iput v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;->e_entry:I

    .line 24
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v0

    iput v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;->e_phoff:I

    .line 25
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v0

    iput v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;->e_shoff:I

    .line 26
    iput-object p1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mHeader:Lcom/lody/virtual/helper/dedex/Elf$Ehdr;

    .line 27
    :goto_1
    iget-object p1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mHeader:Lcom/lody/virtual/helper/dedex/Elf$Ehdr;

    .line 28
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v0

    iput v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_flags:I

    .line 29
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_ehsize:S

    .line 30
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_phentsize:S

    .line 31
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_phnum:S

    .line 32
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shentsize:S

    .line 33
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shnum:S

    .line 34
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    move-result v0

    iput-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shstrndx:S

    .line 35
    iget-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shnum:S

    new-array v0, v0, [Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    .line 36
    :goto_2
    iget-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shnum:S

    if-ge v2, v0, :cond_3

    .line 37
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->getSectionOffset()J

    move-result-wide v3

    iget-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shentsize:S

    mul-int/2addr v0, v2

    int-to-long v5, v0

    add-long/2addr v3, v5

    .line 38
    invoke-virtual {v1, v3, v4}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 39
    iget-boolean v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->is64bit:Z

    if-eqz v0, :cond_2

    .line 40
    new-instance v0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;

    invoke-direct {v0}, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;-><init>()V

    .line 41
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_name:I

    .line 42
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_type:I

    .line 43
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;->sh_flags:J

    .line 44
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;->sh_addr:J

    .line 45
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;->sh_offset:J

    .line 46
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;->sh_size:J

    .line 47
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_link:I

    .line 48
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_info:I

    .line 49
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;->sh_addralign:J

    .line 50
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;->sh_entsize:J

    .line 51
    iget-object v3, p0, Lcom/lody/virtual/helper/dedex/Elf;->mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    aput-object v0, v3, v2

    goto :goto_3

    .line 52
    :cond_2
    new-instance v0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;

    invoke-direct {v0}, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;-><init>()V

    .line 53
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_name:I

    .line 54
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_type:I

    .line 55
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;->sh_flags:I

    .line 56
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;->sh_addr:I

    .line 57
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;->sh_offset:I

    .line 58
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;->sh_size:I

    .line 59
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_link:I

    .line 60
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_info:I

    .line 61
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;->sh_addralign:I

    .line 62
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    move-result v3

    iput v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;->sh_entsize:I

    .line 63
    iget-object v3, p0, Lcom/lody/virtual/helper/dedex/Elf;->mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    aput-object v0, v3, v2

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    .line 64
    :cond_3
    iget-short v0, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shstrndx:S

    const/4 v2, -0x1

    if-le v0, v2, :cond_6

    iget-object v2, p0, Lcom/lody/virtual/helper/dedex/Elf;->mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    array-length v3, v2

    if-ge v0, v3, :cond_6

    .line 65
    aget-object v0, v2, v0

    .line 66
    iget v2, v0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_type:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_5

    .line 67
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->getSize()I

    move-result p1

    .line 68
    new-array p1, p1, [B

    iput-object p1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mStringTable:[B

    .line 69
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->getOffset()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 70
    iget-object p1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mStringTable:[B

    invoke-virtual {v1, p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([B)V

    .line 71
    iget-boolean p1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mReadFull:Z

    if-eqz p1, :cond_4

    .line 72
    invoke-direct {p0}, Lcom/lody/virtual/helper/dedex/Elf;->readSymbolTables()V

    .line 73
    invoke-direct {p0}, Lcom/lody/virtual/helper/dedex/Elf;->readProgramHeaders()V

    :cond_4
    return-void

    .line 74
    :cond_5
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong string section e_shstrndx="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short p1, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shstrndx:S

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid e_shstrndx="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short p1, p1, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_shstrndx:S

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_7
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid elf magic: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 3
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/lody/virtual/helper/dedex/Elf;-><init>(Ljava/io/File;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/lody/virtual/helper/dedex/Elf;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->close()V

    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/lody/virtual/helper/dedex/Elf;)[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    return-object p0
.end method

.method private readProgramHeaders()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mHeader:Lcom/lody/virtual/helper/dedex/Elf$Ehdr;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    .line 4
    .line 5
    iget-short v2, v0, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_phnum:S

    .line 6
    .line 7
    new-array v2, v2, [Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;

    .line 8
    .line 9
    iput-object v2, p0, Lcom/lody/virtual/helper/dedex/Elf;->mProgHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    iget-short v3, v0, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_phnum:S

    .line 13
    .line 14
    if-ge v2, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->getProgramOffset()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-short v5, v0, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;->e_phentsize:S

    .line 21
    .line 22
    mul-int/2addr v5, v2

    .line 23
    int-to-long v5, v5

    .line 24
    add-long/2addr v3, v5

    .line 25
    invoke-virtual {v1, v3, v4}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 26
    .line 27
    .line 28
    iget-boolean v3, p0, Lcom/lody/virtual/helper/dedex/Elf;->is64bit:Z

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    new-instance v3, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;

    .line 33
    .line 34
    invoke-direct {v3}, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;->p_type:I

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;->p_offset:I

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    iput-wide v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;->p_vaddr:J

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iput-wide v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;->p_paddr:J

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    iput-wide v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;->p_filesz:J

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    iput-wide v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;->p_memsz:J

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    iput-wide v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;->p_flags:J

    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    iput-wide v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;->p_align:J

    .line 84
    .line 85
    iget-object v4, p0, Lcom/lody/virtual/helper/dedex/Elf;->mProgHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;

    .line 86
    .line 87
    aput-object v3, v4, v2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_0
    new-instance v3, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;

    .line 91
    .line 92
    invoke-direct {v3}, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;->p_type:I

    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;->p_offset:I

    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;->p_vaddr:I

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;->p_paddr:I

    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;->p_filesz:I

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;->p_memsz:I

    .line 130
    .line 131
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;->p_flags:I

    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    iput v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;->p_align:I

    .line 142
    .line 143
    iget-object v4, p0, Lcom/lody/virtual/helper/dedex/Elf;->mProgHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;

    .line 144
    .line 145
    aput-object v3, v4, v2

    .line 146
    .line 147
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_1
    return-void
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method private readSymbolTables()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    .line 2
    .line 3
    const-string v1, ".dynsym"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/lody/virtual/helper/dedex/Elf;->getSection(Ljava/lang/String;)Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->getOffset()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-virtual {v0, v2, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->getSize()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-boolean v3, p0, Lcom/lody/virtual/helper/dedex/Elf;->is64bit:Z

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/16 v3, 0x18

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/16 v3, 0x10

    .line 30
    .line 31
    :goto_0
    div-int/2addr v2, v3

    .line 32
    new-array v3, v2, [Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;

    .line 33
    .line 34
    iput-object v3, p0, Lcom/lody/virtual/helper/dedex/Elf;->mDynamicSymbols:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    new-array v3, v3, [C

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    move v5, v4

    .line 41
    :goto_1
    if-ge v5, v2, :cond_2

    .line 42
    .line 43
    iget-boolean v6, p0, Lcom/lody/virtual/helper/dedex/Elf;->is64bit:Z

    .line 44
    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    new-instance v6, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Sym;

    .line 48
    .line 49
    invoke-direct {v6}, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Sym;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    iput v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_name:I

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 59
    .line 60
    .line 61
    aget-char v7, v3, v4

    .line 62
    .line 63
    iput-char v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_info:C

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 66
    .line 67
    .line 68
    aget-char v7, v3, v4

    .line 69
    .line 70
    iput-char v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_other:C

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    iput-wide v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Sym;->st_value:J

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readLong()J

    .line 79
    .line 80
    .line 81
    move-result-wide v7

    .line 82
    iput-wide v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Sym;->st_size:J

    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    iput-short v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_shndx:S

    .line 89
    .line 90
    iget-object v7, p0, Lcom/lody/virtual/helper/dedex/Elf;->mDynamicSymbols:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;

    .line 91
    .line 92
    aput-object v6, v7, v5

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_1
    new-instance v6, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Sym;

    .line 96
    .line 97
    invoke-direct {v6}, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Sym;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    iput v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_name:I

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    iput v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Sym;->st_value:I

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    iput v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Sym;->st_size:I

    .line 117
    .line 118
    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 119
    .line 120
    .line 121
    aget-char v7, v3, v4

    .line 122
    .line 123
    iput-char v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_info:C

    .line 124
    .line 125
    invoke-virtual {v0, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 126
    .line 127
    .line 128
    aget-char v7, v3, v4

    .line 129
    .line 130
    iput-char v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_other:C

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readShort()S

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    iput-short v7, v6, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_shndx:S

    .line 137
    .line 138
    iget-object v7, p0, Lcom/lody/virtual/helper/dedex/Elf;->mDynamicSymbols:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;

    .line 139
    .line 140
    aput-object v6, v7, v5

    .line 141
    .line 142
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    iget-object v2, p0, Lcom/lody/virtual/helper/dedex/Elf;->mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    .line 146
    .line 147
    iget v1, v1, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_link:I

    .line 148
    .line 149
    aget-object v1, v2, v1

    .line 150
    .line 151
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->getOffset()J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    invoke-virtual {v0, v2, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->getSize()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    new-array v1, v1, [B

    .line 163
    .line 164
    iput-object v1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mDynStringTable:[B

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([B)V

    .line 167
    .line 168
    .line 169
    :cond_3
    return-void
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method


# virtual methods
.method final checkMagic()Z
    .locals 6

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->e_ident:[C

    const/4 v1, 0x0

    aget-char v2, v0, v1

    sget-object v3, Lcom/lody/virtual/helper/dedex/Elf;->ELF_MAGIC:[C

    aget-char v4, v3, v1

    if-ne v2, v4, :cond_0

    const/4 v2, 0x1

    aget-char v4, v0, v2

    aget-char v5, v3, v2

    if-ne v4, v5, :cond_0

    const/4 v4, 0x2

    aget-char v5, v0, v4

    aget-char v4, v3, v4

    if-ne v5, v4, :cond_0

    const/4 v4, 0x3

    aget-char v0, v0, v4

    aget-char v3, v3, v4

    if-ne v0, v3, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    invoke-virtual {v0}, Lcom/lody/virtual/helper/dedex/DataReader;->close()V

    return-void
.end method

.method final getDataEncoding()C
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->e_ident:[C

    const/4 v1, 0x5

    aget-char v0, v0, v1

    return v0
.end method

.method public final getDynString(I)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "SHN_UNDEF"

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    move v0, p1

    .line 7
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mDynStringTable:[B

    .line 8
    .line 9
    aget-byte v2, v1, v0

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    new-instance v2, Ljava/lang/String;

    .line 17
    .line 18
    sub-int/2addr v0, p1

    .line 19
    invoke-direct {v2, v1, p1, v0}, Ljava/lang/String;-><init>([BII)V

    .line 20
    .line 21
    .line 22
    return-object v2
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method final getFileClass()C
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->e_ident:[C

    const/4 v1, 0x4

    aget-char v0, v0, v1

    return v0
.end method

.method public getHeader()Lcom/lody/virtual/helper/dedex/Elf$Ehdr;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mHeader:Lcom/lody/virtual/helper/dedex/Elf$Ehdr;

    return-object v0
.end method

.method public getReader()Lcom/lody/virtual/helper/dedex/DataReader;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    return-object v0
.end method

.method public final getSection(Ljava/lang/String;)Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->sh_name:I

    .line 10
    .line 11
    invoke-virtual {p0, v4}, Lcom/lody/virtual/helper/dedex/Elf;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    return-object v3

    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return-object p1
    .line 27
.end method

.method public getSectionHeaders()[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mSectionHeaders:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    return-object v0
.end method

.method public final getString(I)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "SHN_UNDEF"

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    move v0, p1

    .line 7
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Elf;->mStringTable:[B

    .line 8
    .line 9
    aget-byte v2, v1, v0

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    new-instance v2, Ljava/lang/String;

    .line 17
    .line 18
    sub-int/2addr v0, p1

    .line 19
    invoke-direct {v2, v1, p1, v0}, Ljava/lang/String;-><init>([BII)V

    .line 20
    .line 21
    .line 22
    return-object v2
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final getSymbolTable(Ljava/lang/String;)Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Elf;->mDynamicSymbols:[Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget v4, v3, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_name:I

    .line 12
    .line 13
    invoke-virtual {p0, v4}, Lcom/lody/virtual/helper/dedex/Elf;->getDynString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return-object p1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final isLittleEndian()Z
    .locals 2

    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf;->getDataEncoding()C

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
