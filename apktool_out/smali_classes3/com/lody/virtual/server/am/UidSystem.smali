.class public Lcom/lody/virtual/server/am/UidSystem;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "UidSystem"


# instance fields
.field private mFreeUid:I

.field private final mSharedUserIdMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 10
    .line 11
    const/16 v0, 0x2710

    .line 12
    .line 13
    iput v0, p0, Lcom/lody/virtual/server/am/UidSystem;->mFreeUid:I

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private loadUidList(Ljava/io/File;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/ObjectInputStream;

    .line 10
    .line 11
    new-instance v2, Ljava/io/FileInputStream;

    .line 12
    .line 13
    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, Lcom/lody/virtual/server/am/UidSystem;->mFreeUid:I

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :catchall_0
    return v1
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

.method private save()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getUidListFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getBakUidListFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    sget-object v2, Lcom/lody/virtual/server/am/UidSystem;->TAG:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v4, "Warning: Unable to delete the expired file --\n "

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const/4 v4, 0x0

    .line 51
    new-array v4, v4, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {v2, v3, v4}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    :try_start_0
    invoke-static {v0, v1}, Lcom/lody/virtual/helper/utils/FileUtils;->copyFile(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    :try_start_1
    new-instance v1, Ljava/io/ObjectOutputStream;

    .line 65
    .line 66
    new-instance v2, Ljava/io/FileOutputStream;

    .line 67
    .line 68
    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 72
    .line 73
    .line 74
    iget v0, p0, Lcom/lody/virtual/server/am/UidSystem;->mFreeUid:I

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catch_1
    move-exception v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-void
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


# virtual methods
.method public getOrCreateUid(Lcom/lody/virtual/server/pm/parser/VPackage;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->mSharedUserId:Ljava/lang/String;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    monitor-exit v0

    .line 25
    return p1

    .line 26
    :cond_1
    iget p1, p0, Lcom/lody/virtual/server/am/UidSystem;->mFreeUid:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    iput p1, p0, Lcom/lody/virtual/server/am/UidSystem;->mFreeUid:I

    .line 31
    .line 32
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Lcom/lody/virtual/client/core/VirtualCore;->myUid()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-ne p1, v2, :cond_2

    .line 41
    .line 42
    iget p1, p0, Lcom/lody/virtual/server/am/UidSystem;->mFreeUid:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    iput p1, p0, Lcom/lody/virtual/server/am/UidSystem;->mFreeUid:I

    .line 47
    .line 48
    :cond_2
    iget-object v2, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/lody/virtual/server/am/UidSystem;->save()V

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return p1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    throw p1
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

.method public getUid(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    monitor-exit v0

    .line 19
    return p1

    .line 20
    :cond_0
    monitor-exit v0

    .line 21
    const/4 p1, -0x1

    .line 22
    return p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
    .line 26
    .line 27
.end method

.method public initUidList()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/am/UidSystem;->mSharedUserIdMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getUidListFile()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/am/UidSystem;->loadUidList(Ljava/io/File;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getBakUidListFile()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/am/UidSystem;->loadUidList(Ljava/io/File;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
