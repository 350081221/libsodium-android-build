.class public final Lcom/bytedance/pangle/util/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Ljava/nio/ByteBuffer;I)J
    .locals 2

    .line 16
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    int-to-long p0, p0

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    return-wide p0
.end method

.method static a(Ljava/io/RandomAccessFile;I)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/RandomAccessFile;",
            "I)",
            "Landroid/util/Pair<",
            "Ljava/nio/ByteBuffer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    if-ltz p1, :cond_2

    const v0, 0xffff

    if-gt p1, v0, :cond_2

    .line 1
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x16

    cmp-long v4, v0, v2

    const/4 v5, 0x0

    if-gez v4, :cond_0

    return-object v5

    :cond_0
    int-to-long v6, p1

    sub-long v2, v0, v2

    .line 2
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p1, v2

    add-int/lit8 p1, p1, 0x16

    .line 3
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 4
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v0, v3

    .line 6
    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v4

    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v6

    invoke-virtual {p0, v3, v4, v6}, Ljava/io/RandomAccessFile;->readFully([BII)V

    .line 8
    invoke-static {p1}, Lcom/bytedance/pangle/util/a/c;->b(Ljava/nio/ByteBuffer;)I

    move-result p0

    const/4 v3, -0x1

    if-ne p0, v3, :cond_1

    return-object v5

    .line 9
    :cond_1
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 10
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 11
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    int-to-long v2, p0

    add-long/2addr v0, v2

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    .line 13
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxCommentSize: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static a(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 14
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object p0

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne p0, v0, :cond_0

    return-void

    .line 15
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "ByteBuffer byte order must be little endian"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Ljava/util/zip/ZipFile;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 17
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static b(Ljava/nio/ByteBuffer;)I
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/bytedance/pangle/util/a/c;->a(Ljava/nio/ByteBuffer;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    const/16 v2, 0x16

    .line 10
    .line 11
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    sub-int/2addr v0, v2

    .line 15
    const v2, 0xffff

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    :goto_0
    if-gt v4, v3, :cond_2

    .line 24
    .line 25
    sub-int v5, v0, v4

    .line 26
    .line 27
    invoke-virtual {p0, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    const v7, 0x6054b50

    .line 32
    .line 33
    .line 34
    if-ne v6, v7, :cond_1

    .line 35
    .line 36
    add-int/lit8 v6, v5, 0x14

    .line 37
    .line 38
    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    and-int/2addr v6, v2

    .line 43
    if-ne v6, v4, :cond_1

    .line 44
    .line 45
    return v5

    .line 46
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return v1
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
