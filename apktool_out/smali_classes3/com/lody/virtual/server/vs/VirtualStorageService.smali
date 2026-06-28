.class public Lcom/lody/virtual/server/vs/VirtualStorageService;
.super Lcom/lody/virtual/server/interfaces/IVirtualStorageService$Stub;
.source "SourceFile"


# static fields
.field private static final sPublicDirs:[Ljava/lang/String;

.field private static final sService:Lcom/lody/virtual/server/vs/VirtualStorageService;


# instance fields
.field private final mConfigs:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/vs/VSConfig;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mLayer:Lcom/lody/virtual/server/vs/VSPersistenceLayer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/lody/virtual/server/vs/VirtualStorageService;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/server/vs/VirtualStorageService;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lody/virtual/server/vs/VirtualStorageService;->sService:Lcom/lody/virtual/server/vs/VirtualStorageService;

    .line 7
    .line 8
    const-string v0, "Music"

    .line 9
    .line 10
    const-string v1, "Pictures"

    .line 11
    .line 12
    const-string v2, "DCIM"

    .line 13
    .line 14
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/lody/virtual/server/vs/VirtualStorageService;->sPublicDirs:[Ljava/lang/String;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/interfaces/IVirtualStorageService$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/server/vs/VSPersistenceLayer;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/vs/VSPersistenceLayer;-><init>(Lcom/lody/virtual/server/vs/VirtualStorageService;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mLayer:Lcom/lody/virtual/server/vs/VSPersistenceLayer;

    .line 10
    .line 11
    new-instance v1, Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mConfigs:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/lody/virtual/helper/PersistenceLayer;->read()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method private checkUserId(I)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/server/pm/VUserManagerService;->get()Lcom/lody/virtual/server/pm/VUserManagerService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/lody/virtual/server/pm/VUserManagerService;->exists(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "Invalid userId "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
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

.method public static get()Lcom/lody/virtual/server/vs/VirtualStorageService;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/vs/VirtualStorageService;->sService:Lcom/lody/virtual/server/vs/VirtualStorageService;

    return-object v0
.end method

.method private getOrCreateVSConfigLocked(Ljava/lang/String;I)Lcom/lody/virtual/server/vs/VSConfig;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mConfigs:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/HashMap;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mConfigs:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, Lcom/lody/virtual/server/vs/VSConfig;

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    new-instance p2, Lcom/lody/virtual/server/vs/VSConfig;

    .line 30
    .line 31
    invoke-direct {p2}, Lcom/lody/virtual/server/vs/VSConfig;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    iput-boolean v1, p2, Lcom/lody/virtual/server/vs/VSConfig;->enable:Z

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object p2
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
.end method

.method private preInitPublicPath(Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "DCIM"

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/lody/virtual/server/vs/VirtualStorageService;->sPublicDirs:[Ljava/lang/String;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    new-instance v4, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v4, p1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
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


# virtual methods
.method getConfigs()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/vs/VSConfig;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mConfigs:Landroid/util/SparseArray;

    return-object v0
.end method

.method public getVirtualStorage(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mConfigs:Landroid/util/SparseArray;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->getOrCreateVSConfigLocked(Ljava/lang/String;I)Lcom/lody/virtual/server/vs/VSConfig;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Lcom/lody/virtual/server/vs/VSConfig;->vsPath:Ljava/lang/String;

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-object p1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p1
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
.end method

.method public isVirtualStorageEnable(Ljava/lang/String;I)Z
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mConfigs:Landroid/util/SparseArray;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->getOrCreateVSConfigLocked(Ljava/lang/String;I)Lcom/lody/virtual/server/vs/VSConfig;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-boolean p1, p1, Lcom/lody/virtual/server/vs/VSConfig;->enable:Z

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return p1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p1
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
.end method

.method public setVirtualStorage(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mConfigs:Landroid/util/SparseArray;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->getOrCreateVSConfigLocked(Ljava/lang/String;I)Lcom/lody/virtual/server/vs/VSConfig;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p3, p1, Lcom/lody/virtual/server/vs/VSConfig;->vsPath:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mLayer:Lcom/lody/virtual/server/vs/VSPersistenceLayer;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 16
    .line 17
    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-direct {p0, p3}, Lcom/lody/virtual/server/vs/VirtualStorageService;->preInitPublicPath(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
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
.end method

.method public setVirtualStorageState(Ljava/lang/String;IZ)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->checkUserId(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mConfigs:Landroid/util/SparseArray;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/vs/VirtualStorageService;->getOrCreateVSConfigLocked(Ljava/lang/String;I)Lcom/lody/virtual/server/vs/VSConfig;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-boolean p3, p1, Lcom/lody/virtual/server/vs/VSConfig;->enable:Z

    .line 12
    .line 13
    iget-object p1, p0, Lcom/lody/virtual/server/vs/VirtualStorageService;->mLayer:Lcom/lody/virtual/server/vs/VSPersistenceLayer;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p1
    .line 23
    .line 24
    .line 25
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
.end method
