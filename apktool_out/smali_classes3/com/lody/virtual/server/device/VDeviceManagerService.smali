.class public Lcom/lody/virtual/server/device/VDeviceManagerService;
.super Lcom/lody/virtual/server/interfaces/IDeviceManager$Stub;
.source "SourceFile"


# static fields
.field private static final sInstance:Lcom/lody/virtual/server/device/VDeviceManagerService;


# instance fields
.field final mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/collection/SparseArray<",
            "Lcom/lody/virtual/remote/VDeviceConfig;",
            ">;"
        }
    .end annotation
.end field

.field private mPersistenceLayer:Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/server/device/VDeviceManagerService;

    invoke-direct {v0}, Lcom/lody/virtual/server/device/VDeviceManagerService;-><init>()V

    sput-object v0, Lcom/lody/virtual/server/device/VDeviceManagerService;->sInstance:Lcom/lody/virtual/server/device/VDeviceManagerService;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/lody/virtual/server/interfaces/IDeviceManager$Stub;-><init>()V

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
    iput-object v0, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 10
    .line 11
    new-instance v0, Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;-><init>(Lcom/lody/virtual/server/device/VDeviceManagerService;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/lody/virtual/helper/PersistenceLayer;->read()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-ge v0, v1, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/lody/virtual/remote/VDeviceConfig;

    .line 37
    .line 38
    invoke-static {v1}, Lcom/lody/virtual/remote/VDeviceConfig;->addToPool(Lcom/lody/virtual/remote/VDeviceConfig;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
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

.method public static get()Lcom/lody/virtual/server/device/VDeviceManagerService;
    .locals 1

    sget-object v0, Lcom/lody/virtual/server/device/VDeviceManagerService;->sInstance:Lcom/lody/virtual/server/device/VDeviceManagerService;

    return-object v0
.end method


# virtual methods
.method public getDeviceConfig(I)Lcom/lody/virtual/remote/VDeviceConfig;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lcom/lody/virtual/helper/collection/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/remote/VDeviceConfig;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lcom/lody/virtual/remote/VDeviceConfig;->random()Lcom/lody/virtual/remote/VDeviceConfig;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v2, p1, v1}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 26
    .line 27
    .line 28
    :cond_0
    monitor-exit v0

    .line 29
    return-object v1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p1
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

.method public isEnable(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/lody/virtual/server/device/VDeviceManagerService;->getDeviceConfig(I)Lcom/lody/virtual/remote/VDeviceConfig;

    move-result-object p1

    iget-boolean p1, p1, Lcom/lody/virtual/remote/VDeviceConfig;->enable:Z

    return p1
.end method

.method public setEnable(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Lcom/lody/virtual/helper/collection/SparseArray;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/remote/VDeviceConfig;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lcom/lody/virtual/remote/VDeviceConfig;->random()Lcom/lody/virtual/remote/VDeviceConfig;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v2, p1, v1}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-boolean p2, v1, Lcom/lody/virtual/remote/VDeviceConfig;->enable:Z

    .line 24
    .line 25
    iget-object p1, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p1
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

.method public updateDeviceConfig(ILcom/lody/virtual/remote/VDeviceConfig;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mDeviceConfigs:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p2}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/lody/virtual/server/device/VDeviceManagerService;->mPersistenceLayer:Lcom/lody/virtual/server/device/DeviceInfoPersistenceLayer;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/lody/virtual/helper/PersistenceLayer;->save()V

    .line 14
    .line 15
    .line 16
    :cond_0
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p1
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
