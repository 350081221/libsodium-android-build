.class public Lcom/lody/virtual/helper/dedex/DataReader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private mAssociatedReaders:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/lody/virtual/helper/dedex/DataReader;",
            ">;"
        }
    .end annotation
.end field

.field private final mFile:Ljava/io/File;

.field private final mMappedBuffer:Ljava/nio/MappedByteBuffer;

.field private final mRaf:Ljava/io/RandomAccessFile;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mFile:Ljava/io/File;

    .line 4
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "r"

    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mRaf:Ljava/io/RandomAccessFile;

    .line 5
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v4, 0x0

    .line 6
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 7
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    .line 8
    invoke-virtual {p1}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    const/4 p1, 0x1

    .line 9
    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/dedex/DataReader;->setLittleEndian(Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/lody/virtual/helper/dedex/DataReader;-><init>(Ljava/io/File;)V

    return-void
.end method

.method public static toInt(Ljava/lang/String;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [C

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v3, v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    const/16 v6, 0x30

    .line 17
    .line 18
    if-lt v5, v6, :cond_0

    .line 19
    .line 20
    const/16 v6, 0x39

    .line 21
    .line 22
    if-le v5, v6, :cond_1

    .line 23
    .line 24
    :cond_0
    const/16 v6, 0x2d

    .line 25
    .line 26
    if-ne v5, v6, :cond_2

    .line 27
    .line 28
    :cond_1
    add-int/lit8 v6, v4, 0x1

    .line 29
    .line 30
    aput-char v5, v1, v4

    .line 31
    .line 32
    move v4, v6

    .line 33
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    if-nez v4, :cond_4

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_4
    new-instance p0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {p0, v1, v2, v4}, Ljava/lang/String;-><init>([CII)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    :goto_1
    return v2
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


# virtual methods
.method public addAssociatedReader(Lcom/lody/virtual/helper/dedex/DataReader;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mAssociatedReaders:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mAssociatedReaders:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mAssociatedReaders:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public close()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mRaf:Ljava/io/RandomAccessFile;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mAssociatedReaders:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/lody/virtual/helper/dedex/DataReader;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->close()V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    return-void
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
.end method

.method public getChannel()Ljava/nio/channels/FileChannel;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mRaf:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    return-object v0
.end method

.method public getFile()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mFile:Ljava/io/File;

    return-object v0
.end method

.method public position()I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    return v0
.end method

.method public position(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public previewInt()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->mark()Ljava/nio/Buffer;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/nio/Buffer;->reset()Ljava/nio/Buffer;

    .line 13
    .line 14
    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public readByte()I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public readBytes([B)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public readBytes([C)V
    .locals 3

    .line 2
    array-length v0, p1

    new-array v0, v0, [B

    .line 3
    invoke-virtual {p0, v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([B)V

    const/4 v1, 0x0

    .line 4
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 5
    aget-byte v2, v0, v1

    int-to-char v2, v2

    aput-char v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public readInt()I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    return v0
.end method

.method public final readLong()J
    .locals 2

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public readShort()S
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    return v0
.end method

.method public readUleb128()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/DataReader;->readByte()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/DataReader;->readByte()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    and-int/lit8 v0, v0, 0x7f

    .line 14
    .line 15
    and-int/lit8 v3, v2, 0x7f

    .line 16
    .line 17
    shl-int/lit8 v3, v3, 0x7

    .line 18
    .line 19
    or-int/2addr v0, v3

    .line 20
    if-le v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/DataReader;->readByte()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    and-int/lit8 v3, v2, 0x7f

    .line 27
    .line 28
    shl-int/lit8 v3, v3, 0xe

    .line 29
    .line 30
    or-int/2addr v0, v3

    .line 31
    if-le v2, v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/DataReader;->readByte()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    and-int/lit8 v3, v2, 0x7f

    .line 38
    .line 39
    shl-int/lit8 v3, v3, 0x15

    .line 40
    .line 41
    or-int/2addr v0, v3

    .line 42
    if-le v2, v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/DataReader;->readByte()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    shl-int/lit8 v1, v1, 0x1c

    .line 49
    .line 50
    or-int/2addr v0, v1

    .line 51
    :cond_0
    return v0
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
.end method

.method public seek(J)V
    .locals 0

    long-to-int p1, p1

    invoke-virtual {p0, p1}, Lcom/lody/virtual/helper/dedex/DataReader;->position(I)V

    return-void
.end method

.method public setLittleEndian(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/DataReader;->mMappedBuffer:Ljava/nio/MappedByteBuffer;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    .line 13
    return-void
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method
