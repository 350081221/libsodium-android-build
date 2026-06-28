.class public Lcom/lody/virtual/server/location/VirtualLocationService;
.super Lcom/lody/virtual/server/interfaces/IVirtualLocationManager$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;
    }
.end annotation


# static fields
.field private static final sInstance:Lcom/lody/virtual/server/location/VirtualLocationService;


# instance fields
.field private final mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

.field private final mLocConfigs:Lcom/lody/virtual/helper/collection/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/collection/SparseArray<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/location/VirtualLocationService;

    invoke-direct {v0}, Lcom/lody/virtual/server/location/VirtualLocationService;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/location/VirtualLocationService;->sInstance:Lcom/lody/virtual/server/location/VirtualLocationService;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lody/virtual/helper/collection/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/lody/virtual/helper/collection/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mLocConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 10
    .line 11
    new-instance v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 17
    .line 18
    new-instance v0, Lcom/lody/virtual/server/location/VirtualLocationService$1;

    .line 19
    .line 20
    invoke-static {}, Lcom/lody/virtual/os/VEnvironment;->getVirtualLocationFile()Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, p0, v1}, Lcom/lody/virtual/server/location/VirtualLocationService$1;-><init>(Lcom/lody/virtual/server/location/VirtualLocationService;Ljava/io/File;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/lody/virtual/helper/PersistenceLayer;->read()V

    .line 30
    .line 31
    .line 32
    return-void
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

.method static synthetic access$000(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    return-object p0
.end method

.method static synthetic access$100(Lcom/lody/virtual/server/location/VirtualLocationService;)Lcom/lody/virtual/helper/collection/SparseArray;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mLocConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    return-object p0
.end method

.method public static get()Lcom/lody/virtual/server/location/VirtualLocationService;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/location/VirtualLocationService;->sInstance:Lcom/lody/virtual/server/location/VirtualLocationService;

    return-object v0
.end method

.method private getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mLocConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/lody/virtual/helper/collection/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

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
    iget-object v1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mLocConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v1, p1, v0}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    new-instance p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 30
    .line 31
    invoke-direct {p1}, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    iput v1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 36
    .line 37
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object p1
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


# virtual methods
.method public getAllCell(ILjava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/vloc/VCell;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 8
    .line 9
    .line 10
    iget p2, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq p2, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    if-eq p2, v0, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->allCell:Ljava/util/List;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->allCell:Ljava/util/List;

    .line 26
    .line 27
    return-object p1
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

.method public getCell(ILjava/lang/String;)Lcom/lody/virtual/remote/vloc/VCell;
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 8
    .line 9
    .line 10
    iget p2, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq p2, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    if-eq p2, v0, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->cell:Lcom/lody/virtual/remote/vloc/VCell;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->cell:Lcom/lody/virtual/remote/vloc/VCell;

    .line 26
    .line 27
    return-object p1
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

.method public getGlobalLocation()Lcom/lody/virtual/remote/vloc/VLocation;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    iget-object v0, v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    return-object v0
.end method

.method public getLocation(ILjava/lang/String;)Lcom/lody/virtual/remote/vloc/VLocation;
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 8
    .line 9
    .line 10
    iget p2, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq p2, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    if-eq p2, v0, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 26
    .line 27
    return-object p1
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

.method public getMode(ILjava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mLocConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p2, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 11
    .line 12
    .line 13
    iget p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1
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

.method public getNeighboringCell(ILjava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/vloc/VCell;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 8
    .line 9
    .line 10
    iget p2, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq p2, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    if-eq p2, v0, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->neighboringCell:Ljava/util/List;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->neighboringCell:Ljava/util/List;

    .line 26
    .line 27
    return-object p1
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

.method public setAllCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/vloc/VCell;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p3, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->allCell:Ljava/util/List;

    .line 6
    .line 7
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public setCell(ILjava/lang/String;Lcom/lody/virtual/remote/vloc/VCell;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p3, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->cell:Lcom/lody/virtual/remote/vloc/VCell;

    .line 6
    .line 7
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public setGlobalAllCell(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/vloc/VCell;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->allCell:Ljava/util/List;

    .line 4
    .line 5
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public setGlobalCell(Lcom/lody/virtual/remote/vloc/VCell;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->cell:Lcom/lody/virtual/remote/vloc/VCell;

    .line 4
    .line 5
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public setGlobalLocation(Lcom/lody/virtual/remote/vloc/VLocation;)V
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    iput-object p1, v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    return-void
.end method

.method public setGlobalNeighboringCell(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/vloc/VCell;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mGlobalConfig:Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->neighboringCell:Ljava/util/List;

    .line 4
    .line 5
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public setLocation(ILjava/lang/String;Lcom/lody/virtual/remote/vloc/VLocation;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p3, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->location:Lcom/lody/virtual/remote/vloc/VLocation;

    .line 6
    .line 7
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public setMode(ILjava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mLocConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput p3, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->mode:I

    .line 9
    .line 10
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1
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

.method public setNeighboringCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/lody/virtual/remote/vloc/VCell;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/server/location/VirtualLocationService;->getOrCreateConfig(ILjava/lang/String;)Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p3, p1, Lcom/lody/virtual/server/location/VirtualLocationService$VLocConfig;->neighboringCell:Ljava/util/List;

    .line 6
    .line 7
    iget-object p1, p0, Lcom/lody/virtual/server/location/VirtualLocationService;->mPersistenceLayer:Lcom/lody/virtual/helper/PersistenceLayer;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 10
    .line 11
    .line 12
    return-void
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
