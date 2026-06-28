.class public abstract Lcom/lody/virtual/helper/PersistenceLayer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mPersistenceFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lody/virtual/helper/PersistenceLayer;->mPersistenceFile:Ljava/io/File;

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public abstract getCurrentVersion()I
.end method

.method public final getPersistenceFile()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/PersistenceLayer;->mPersistenceFile:Ljava/io/File;

    return-object v0
.end method

.method public onPersistenceFileDamage()V
    .locals 0

    return-void
.end method

.method public read()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/helper/PersistenceLayer;->mPersistenceFile:Ljava/io/File;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    .line 8
    .line 9
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    long-to-int v0, v3

    .line 17
    new-array v3, v0, [B

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 24
    .line 25
    .line 26
    if-ne v4, v0, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v1, v3, v2, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lcom/lody/virtual/helper/PersistenceLayer;->verifyMagic(Landroid/os/Parcel;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p0, v1, v0}, Lcom/lody/virtual/helper/PersistenceLayer;->readPersistenceData(Landroid/os/Parcel;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/lody/virtual/helper/PersistenceLayer;->onPersistenceFileDamage()V

    .line 50
    .line 51
    .line 52
    new-instance v0, Ljava/io/IOException;

    .line 53
    .line 54
    const-string v2, "Invalid persistence file."

    .line 55
    .line 56
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 61
    .line 62
    const-string v2, "Unable to read Persistence file."

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :catch_0
    move-exception v0

    .line 71
    :try_start_1
    instance-of v2, v0, Ljava/io/FileNotFoundException;

    .line 72
    .line 73
    if-nez v2, :cond_2

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 83
    .line 84
    .line 85
    throw v0
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

.method public abstract readPersistenceData(Landroid/os/Parcel;I)V
.end method

.method public save()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/lody/virtual/helper/PersistenceLayer;->writeMagic(Landroid/os/Parcel;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/lody/virtual/helper/PersistenceLayer;->getCurrentVersion()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/lody/virtual/helper/PersistenceLayer;->writePersistenceData(Landroid/os/Parcel;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Ljava/io/FileOutputStream;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/lody/virtual/helper/PersistenceLayer;->mPersistenceFile:Ljava/io/File;

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception v1

    .line 39
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 47
    .line 48
    .line 49
    throw v1
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

.method public verifyMagic(Landroid/os/Parcel;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public writeMagic(Landroid/os/Parcel;)V
    .locals 0

    return-void
.end method

.method public abstract writePersistenceData(Landroid/os/Parcel;)V
.end method
