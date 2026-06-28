.class public final Lcom/android/dex/Dex;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dex/Dex$ClassDefIterable;,
        Lcom/android/dex/Dex$ClassDefIterator;,
        Lcom/android/dex/Dex$MethodIdTable;,
        Lcom/android/dex/Dex$FieldIdTable;,
        Lcom/android/dex/Dex$ProtoIdTable;,
        Lcom/android/dex/Dex$TypeIndexToDescriptorTable;,
        Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;,
        Lcom/android/dex/Dex$StringTable;,
        Lcom/android/dex/Dex$Section;
    }
.end annotation


# static fields
.field private static final CHECKSUM_OFFSET:I = 0x8

.field private static final CHECKSUM_SIZE:I = 0x4

.field static final EMPTY_SHORT_ARRAY:[S

.field private static final SIGNATURE_OFFSET:I = 0xc

.field private static final SIGNATURE_SIZE:I = 0x14


# instance fields
.field private data:Ljava/nio/ByteBuffer;

.field private final fieldIds:Lcom/android/dex/Dex$FieldIdTable;

.field private final methodIds:Lcom/android/dex/Dex$MethodIdTable;

.field private nextSectionStart:I

.field private final protoIds:Lcom/android/dex/Dex$ProtoIdTable;

.field private final strings:Lcom/android/dex/Dex$StringTable;

.field private final tableOfContents:Lcom/android/dex/TableOfContents;

.field private final typeIds:Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

.field private final typeNames:Lcom/android/dex/Dex$TypeIndexToDescriptorTable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [S

    .line 3
    .line 4
    sput-object v0, Lcom/android/dex/Dex;->EMPTY_SHORT_ARRAY:[S

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public constructor <init>(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Lcom/android/dex/TableOfContents;

    invoke-direct {v0}, Lcom/android/dex/TableOfContents;-><init>()V

    iput-object v0, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lcom/android/dex/Dex;->nextSectionStart:I

    .line 17
    new-instance v0, Lcom/android/dex/Dex$StringTable;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$StringTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->strings:Lcom/android/dex/Dex$StringTable;

    .line 18
    new-instance v0, Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->typeIds:Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    .line 19
    new-instance v0, Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$TypeIndexToDescriptorTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->typeNames:Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    .line 20
    new-instance v0, Lcom/android/dex/Dex$ProtoIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$ProtoIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->protoIds:Lcom/android/dex/Dex$ProtoIdTable;

    .line 21
    new-instance v0, Lcom/android/dex/Dex$FieldIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$FieldIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->fieldIds:Lcom/android/dex/Dex$FieldIdTable;

    .line 22
    new-instance v0, Lcom/android/dex/Dex$MethodIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$MethodIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->methodIds:Lcom/android/dex/Dex$MethodIdTable;

    .line 23
    new-array p1, p1, [B

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 24
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lcom/android/dex/TableOfContents;

    invoke-direct {v0}, Lcom/android/dex/TableOfContents;-><init>()V

    iput-object v0, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    const/4 v0, 0x0

    .line 38
    iput v0, p0, Lcom/android/dex/Dex;->nextSectionStart:I

    .line 39
    new-instance v0, Lcom/android/dex/Dex$StringTable;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$StringTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->strings:Lcom/android/dex/Dex$StringTable;

    .line 40
    new-instance v0, Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->typeIds:Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    .line 41
    new-instance v0, Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$TypeIndexToDescriptorTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->typeNames:Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    .line 42
    new-instance v0, Lcom/android/dex/Dex$ProtoIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$ProtoIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->protoIds:Lcom/android/dex/Dex$ProtoIdTable;

    .line 43
    new-instance v0, Lcom/android/dex/Dex$FieldIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$FieldIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->fieldIds:Lcom/android/dex/Dex$FieldIdTable;

    .line 44
    new-instance v0, Lcom/android/dex/Dex$MethodIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$MethodIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->methodIds:Lcom/android/dex/Dex$MethodIdTable;

    .line 45
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/android/dex/util/FileUtils;->hasArchiveSuffix(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 46
    new-instance v0, Ljava/util/zip/ZipFile;

    invoke-direct {v0, p1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    const-string v1, "classes.dex"

    .line 47
    invoke-virtual {v0, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 48
    invoke-virtual {v0, v1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object p1

    .line 49
    :try_start_0
    invoke-direct {p0, p1}, Lcom/android/dex/Dex;->loadFrom(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 50
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 51
    :cond_0
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 52
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    if-eqz p1, :cond_1

    .line 53
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1

    .line 54
    :cond_2
    new-instance v0, Lcom/android/dex/DexException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected classes.dex in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".dex"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 56
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 57
    :try_start_3
    invoke-direct {p0, v0}, Lcom/android/dex/Dex;->loadFrom(Ljava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 58
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :goto_1
    return-void

    :catchall_3
    move-exception p1

    .line 59
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :catchall_4
    move-exception v1

    .line 60
    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    .line 61
    :cond_4
    new-instance v0, Lcom/android/dex/DexException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unknown output extension: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lcom/android/dex/TableOfContents;

    invoke-direct {v0}, Lcom/android/dex/TableOfContents;-><init>()V

    iput-object v0, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    const/4 v0, 0x0

    .line 27
    iput v0, p0, Lcom/android/dex/Dex;->nextSectionStart:I

    .line 28
    new-instance v0, Lcom/android/dex/Dex$StringTable;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$StringTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->strings:Lcom/android/dex/Dex$StringTable;

    .line 29
    new-instance v0, Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->typeIds:Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    .line 30
    new-instance v0, Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$TypeIndexToDescriptorTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->typeNames:Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    .line 31
    new-instance v0, Lcom/android/dex/Dex$ProtoIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$ProtoIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->protoIds:Lcom/android/dex/Dex$ProtoIdTable;

    .line 32
    new-instance v0, Lcom/android/dex/Dex$FieldIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$FieldIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->fieldIds:Lcom/android/dex/Dex$FieldIdTable;

    .line 33
    new-instance v0, Lcom/android/dex/Dex$MethodIdTable;

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$MethodIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v0, p0, Lcom/android/dex/Dex;->methodIds:Lcom/android/dex/Dex$MethodIdTable;

    .line 34
    :try_start_0
    invoke-direct {p0, p1}, Lcom/android/dex/Dex;->loadFrom(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw v0
.end method

.method private constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/android/dex/TableOfContents;

    invoke-direct {v0}, Lcom/android/dex/TableOfContents;-><init>()V

    iput-object v0, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/android/dex/Dex;->nextSectionStart:I

    .line 5
    new-instance v1, Lcom/android/dex/Dex$StringTable;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/android/dex/Dex$StringTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v1, p0, Lcom/android/dex/Dex;->strings:Lcom/android/dex/Dex$StringTable;

    .line 6
    new-instance v1, Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    invoke-direct {v1, p0, v2}, Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v1, p0, Lcom/android/dex/Dex;->typeIds:Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    .line 7
    new-instance v1, Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    invoke-direct {v1, p0, v2}, Lcom/android/dex/Dex$TypeIndexToDescriptorTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v1, p0, Lcom/android/dex/Dex;->typeNames:Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    .line 8
    new-instance v1, Lcom/android/dex/Dex$ProtoIdTable;

    invoke-direct {v1, p0, v2}, Lcom/android/dex/Dex$ProtoIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v1, p0, Lcom/android/dex/Dex;->protoIds:Lcom/android/dex/Dex$ProtoIdTable;

    .line 9
    new-instance v1, Lcom/android/dex/Dex$FieldIdTable;

    invoke-direct {v1, p0, v2}, Lcom/android/dex/Dex$FieldIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v1, p0, Lcom/android/dex/Dex;->fieldIds:Lcom/android/dex/Dex$FieldIdTable;

    .line 10
    new-instance v1, Lcom/android/dex/Dex$MethodIdTable;

    invoke-direct {v1, p0, v2}, Lcom/android/dex/Dex$MethodIdTable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    iput-object v1, p0, Lcom/android/dex/Dex;->methodIds:Lcom/android/dex/Dex$MethodIdTable;

    .line 11
    iput-object p1, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 12
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 13
    invoke-virtual {v0, p0}, Lcom/android/dex/TableOfContents;->readFrom(Lcom/android/dex/Dex;)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dex/Dex;-><init>(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/android/dex/Dex;)Lcom/android/dex/TableOfContents;
    .locals 0

    iget-object p0, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    return-object p0
.end method

.method static synthetic access$1100(II)V
    .locals 0

    invoke-static {p0, p1}, Lcom/android/dex/Dex;->checkBounds(II)V

    return-void
.end method

.method static synthetic access$1200(Lcom/android/dex/Dex;)Lcom/android/dex/Dex$StringTable;
    .locals 0

    iget-object p0, p0, Lcom/android/dex/Dex;->strings:Lcom/android/dex/Dex$StringTable;

    return-object p0
.end method

.method private static checkBounds(II)V
    .locals 3

    if-ltz p0, :cond_0

    if-ge p0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", length="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private loadFrom(Ljava/io/InputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2000

    .line 7
    .line 8
    new-array v1, v1, [B

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, -0x1

    .line 15
    if-eq v2, v3, :cond_0

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lcom/android/dex/TableOfContents;->readFrom(Lcom/android/dex/Dex;)V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method


# virtual methods
.method public appendSection(ILjava/lang/String;)Lcom/android/dex/Dex$Section;
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dex/Dex;->nextSectionStart:I

    .line 6
    .line 7
    add-int/2addr v0, p1

    .line 8
    iget-object p1, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lcom/android/dex/Dex;->nextSectionStart:I

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lcom/android/dex/Dex$Section;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, p0, p2, p1, v2}, Lcom/android/dex/Dex$Section;-><init>(Lcom/android/dex/Dex;Ljava/lang/String;Ljava/nio/ByteBuffer;Lcom/android/dex/Dex$1;)V

    .line 31
    .line 32
    .line 33
    iput v0, p0, Lcom/android/dex/Dex;->nextSectionStart:I

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Not four byte aligned!"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public classDefs()Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lcom/android/dex/ClassDef;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/android/dex/Dex$ClassDefIterable;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/dex/Dex$ClassDefIterable;-><init>(Lcom/android/dex/Dex;Lcom/android/dex/Dex$1;)V

    return-object v0
.end method

.method public computeChecksum()I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/zip/Adler32;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/zip/Adler32;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2000

    .line 7
    .line 8
    new-array v2, v1, [B

    .line 9
    .line 10
    iget-object v3, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 21
    .line 22
    .line 23
    const/16 v4, 0xc

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-virtual {v3, v2, v5, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2, v5, v4}, Ljava/util/zip/Adler32;->update([BII)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0}, Ljava/util/zip/Adler32;->getValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    long-to-int v0, v0

    .line 55
    return v0
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
.end method

.method public computeSignature()[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    const-string v0, "SHA-1"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const/16 v1, 0x2000

    .line 8
    .line 9
    new-array v2, v1, [B

    .line 10
    .line 11
    iget-object v3, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 22
    .line 23
    .line 24
    const/16 v4, 0x20

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-virtual {v3, v2, v5, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2, v5, v4}, Ljava/security/MessageDigest;->update([BII)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 59
    .line 60
    .line 61
    throw v0
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
.end method

.method public descriptorIndexFromTypeIndex(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/android/dex/TableOfContents;->typeIds:Lcom/android/dex/TableOfContents$Section;

    .line 4
    .line 5
    iget v0, v0, Lcom/android/dex/TableOfContents$Section;->size:I

    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/android/dex/Dex;->checkBounds(II)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/android/dex/TableOfContents;->typeIds:Lcom/android/dex/TableOfContents$Section;

    .line 13
    .line 14
    iget v0, v0, Lcom/android/dex/TableOfContents$Section;->off:I

    .line 15
    .line 16
    mul-int/lit8 p1, p1, 0x4

    .line 17
    .line 18
    add-int/2addr v0, p1

    .line 19
    iget-object p1, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
    .line 26
    .line 27
    .line 28
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
.end method

.method public fieldIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/dex/FieldId;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dex/Dex;->fieldIds:Lcom/android/dex/Dex$FieldIdTable;

    return-object v0
.end method

.method public getBytes()[B
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-array v1, v1, [B

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    return-object v1
    .line 21
.end method

.method public getLength()I
    .locals 1

    iget-object v0, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    return v0
.end method

.method public getNextSectionStart()I
    .locals 1

    iget v0, p0, Lcom/android/dex/Dex;->nextSectionStart:I

    return v0
.end method

.method public getTableOfContents()Lcom/android/dex/TableOfContents;
    .locals 1

    iget-object v0, p0, Lcom/android/dex/Dex;->tableOfContents:Lcom/android/dex/TableOfContents;

    return-object v0
.end method

.method public methodIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/dex/MethodId;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dex/Dex;->methodIds:Lcom/android/dex/Dex$MethodIdTable;

    return-object v0
.end method

.method public open(I)Lcom/android/dex/Dex$Section;
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 32
    .line 33
    .line 34
    new-instance p1, Lcom/android/dex/Dex$Section;

    .line 35
    .line 36
    const-string v1, "section"

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {p1, p0, v1, v0, v2}, Lcom/android/dex/Dex$Section;-><init>(Lcom/android/dex/Dex;Ljava/lang/String;Ljava/nio/ByteBuffer;Lcom/android/dex/Dex$1;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "position="

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p1, " length="

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
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
.end method

.method public protoIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/dex/ProtoId;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dex/Dex;->protoIds:Lcom/android/dex/Dex$ProtoIdTable;

    return-object v0
.end method

.method public readClassData(Lcom/android/dex/ClassDef;)Lcom/android/dex/ClassData;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dex/ClassDef;->getClassDataOffset()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dex/Dex;->open(I)Lcom/android/dex/Dex$Section;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/android/dex/Dex$Section;->access$800(Lcom/android/dex/Dex$Section;)Lcom/android/dex/ClassData;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "offset == 0"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
    .line 24
.end method

.method public readCode(Lcom/android/dex/ClassData$Method;)Lcom/android/dex/Code;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dex/ClassData$Method;->getCodeOffset()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dex/Dex;->open(I)Lcom/android/dex/Dex$Section;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/android/dex/Dex$Section;->access$900(Lcom/android/dex/Dex$Section;)Lcom/android/dex/Code;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "offset == 0"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
    .line 24
.end method

.method public readTypeList(I)Lcom/android/dex/TypeList;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/android/dex/TypeList;->EMPTY:Lcom/android/dex/TypeList;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/android/dex/Dex;->open(I)Lcom/android/dex/Dex$Section;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/android/dex/Dex$Section;->readTypeList()Lcom/android/dex/TypeList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public strings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dex/Dex;->strings:Lcom/android/dex/Dex$StringTable;

    return-object v0
.end method

.method public typeIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dex/Dex;->typeIds:Lcom/android/dex/Dex$TypeIndexToDescriptorIndexTable;

    return-object v0
.end method

.method public typeNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dex/Dex;->typeNames:Lcom/android/dex/Dex$TypeIndexToDescriptorTable;

    return-object v0
.end method

.method public writeHashes()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/android/dex/Dex;->open(I)Lcom/android/dex/Dex$Section;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/android/dex/Dex;->computeSignature()[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/android/dex/Dex$Section;->write([B)V

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/android/dex/Dex;->open(I)Lcom/android/dex/Dex$Section;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0}, Lcom/android/dex/Dex;->computeChecksum()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/android/dex/Dex$Section;->writeInt(I)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
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
.end method

.method public writeTo(Ljava/io/File;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 8
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/android/dex/Dex;->writeTo(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    .line 11
    :try_start_2
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x2000

    new-array v1, v0, [B

    .line 1
    iget-object v2, p0, Lcom/android/dex/Dex;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 3
    :goto_0
    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    .line 5
    invoke-virtual {v2, v1, v4, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 6
    invoke-virtual {p1, v1, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    return-void
.end method
