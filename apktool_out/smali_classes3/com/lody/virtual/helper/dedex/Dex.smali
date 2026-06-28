.class public Lcom/lody/virtual/helper/dedex/Dex;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/helper/dedex/Dex$Header;
    }
.end annotation


# instance fields
.field public final dataEnd:I

.field public final dexPosition:I

.field public final header:Lcom/lody/virtual/helper/dedex/Dex$Header;

.field private final mReader:Lcom/lody/virtual/helper/dedex/DataReader;


# direct methods
.method public constructor <init>(Lcom/lody/virtual/helper/dedex/DataReader;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->position()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex;->dexPosition:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/lody/virtual/helper/dedex/Dex;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    .line 11
    .line 12
    new-instance v0, Lcom/lody/virtual/helper/dedex/Dex$Header;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lcom/lody/virtual/helper/dedex/Dex$Header;-><init>(Lcom/lody/virtual/helper/dedex/DataReader;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Dex;->header:Lcom/lody/virtual/helper/dedex/Dex$Header;

    .line 18
    .line 19
    iget-boolean p1, v0, Lcom/lody/virtual/helper/dedex/Dex$Header;->isCompactDex:Z

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget p1, v0, Lcom/lody/virtual/helper/dedex/Dex$Header;->data_off_:I

    .line 24
    .line 25
    iget v0, v0, Lcom/lody/virtual/helper/dedex/Dex$Header;->data_size_:I

    .line 26
    .line 27
    add-int/2addr p1, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget p1, v0, Lcom/lody/virtual/helper/dedex/Dex$Header;->file_size_:I

    .line 30
    .line 31
    :goto_0
    iput p1, p0, Lcom/lody/virtual/helper/dedex/Dex;->dataEnd:I

    .line 32
    .line 33
    return-void
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

.method private calcChecksum([B)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/zip/Adler32;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/zip/Adler32;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/16 v2, 0xc

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    invoke-virtual {v0, p1, v2, v1}, Ljava/util/zip/Adler32;->update([BII)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/zip/Adler32;->getValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    long-to-int v0, v0

    .line 18
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Dex;->header:Lcom/lody/virtual/helper/dedex/Dex$Header;

    .line 19
    .line 20
    iget v1, v1, Lcom/lody/virtual/helper/dedex/Dex$Header;->checksum_:I

    .line 21
    .line 22
    if-eq v1, v0, :cond_0

    .line 23
    .line 24
    int-to-byte v1, v0

    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    aput-byte v1, p1, v2

    .line 28
    .line 29
    shr-int/lit8 v1, v0, 0x8

    .line 30
    .line 31
    int-to-byte v1, v1

    .line 32
    const/16 v2, 0x9

    .line 33
    .line 34
    aput-byte v1, p1, v2

    .line 35
    .line 36
    shr-int/lit8 v1, v0, 0x10

    .line 37
    .line 38
    int-to-byte v1, v1

    .line 39
    const/16 v2, 0xa

    .line 40
    .line 41
    aput-byte v1, p1, v2

    .line 42
    .line 43
    shr-int/lit8 v0, v0, 0x18

    .line 44
    .line 45
    int-to-byte v0, v0

    .line 46
    const/16 v1, 0xb

    .line 47
    .line 48
    aput-byte v0, p1, v1

    .line 49
    .line 50
    :cond_0
    return-void
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

.method private calcSignature([B)V
    .locals 3

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

    .line 7
    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    .line 8
    .line 9
    .line 10
    array-length v1, p1

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    sub-int/2addr v1, v2

    .line 14
    invoke-virtual {v0, p1, v2, v1}, Ljava/security/MessageDigest;->update([BII)V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0xc

    .line 18
    .line 19
    const/16 v2, 0x14

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1, v2}, Ljava/security/MessageDigest;->digest([BII)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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


# virtual methods
.method public getBytes()[B
    .locals 3

    .line 1
    iget v0, p0, Lcom/lody/virtual/helper/dedex/Dex;->dataEnd:I

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Dex;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    .line 6
    .line 7
    iget v2, p0, Lcom/lody/virtual/helper/dedex/Dex;->dexPosition:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/lody/virtual/helper/dedex/DataReader;->position(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Dex;->mReader:Lcom/lody/virtual/helper/dedex/DataReader;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([B)V

    .line 15
    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getFixedBytes()[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Dex;->getBytes()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/lody/virtual/helper/dedex/Dex;->calcSignature([B)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/lody/virtual/helper/dedex/Dex;->calcChecksum([B)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method public writeTo(Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Dex;->getFixedBytes()[B

    move-result-object v0

    invoke-static {v0, p1}, Lcom/lody/virtual/helper/utils/FileUtils;->writeToFile([BLjava/io/File;)V

    return-void
.end method
