.class public Lcom/lody/virtual/client/ipc/VirtualLocationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MODE_CLOSE:I = 0x0

.field public static final MODE_USE_GLOBAL:I = 0x1

.field public static final MODE_USE_SELF:I = 0x2

.field private static final sInstance:Lcom/lody/virtual/client/ipc/VirtualLocationManager;


# instance fields
.field private mService:Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    invoke-direct {v0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->sInstance:Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/lody/virtual/client/ipc/VirtualLocationManager;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->sInstance:Lcom/lody/virtual/client/ipc/VirtualLocationManager;

    return-object v0
.end method

.method private getRemoteInterface()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "virtual-loc"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

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
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->getAllCell(ILjava/lang/String;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    return-object p1
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

.method public getCell(ILjava/lang/String;)Lcom/lody/virtual/remote/vloc/VCell;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->getCell(ILjava/lang/String;)Lcom/lody/virtual/remote/vloc/VCell;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/lody/virtual/remote/vloc/VCell;

    .line 16
    .line 17
    return-object p1
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

.method public getGlobalLocation()Lcom/lody/virtual/remote/vloc/VLocation;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->getGlobalLocation()Lcom/lody/virtual/remote/vloc/VLocation;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object v0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    invoke-static {v0}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/lody/virtual/remote/vloc/VLocation;

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

.method public getLocation()Lcom/lody/virtual/remote/vloc/VLocation;
    .locals 2

    .line 3
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppUserId()I

    move-result v0

    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getLocation(ILjava/lang/String;)Lcom/lody/virtual/remote/vloc/VLocation;

    move-result-object v0

    return-object v0
.end method

.method public getLocation(ILjava/lang/String;)Lcom/lody/virtual/remote/vloc/VLocation;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->getLocation(ILjava/lang/String;)Lcom/lody/virtual/remote/vloc/VLocation;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 2
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/lody/virtual/remote/vloc/VLocation;

    return-object p1
.end method

.method public getMode()I
    .locals 2

    .line 3
    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppUserId()I

    move-result v0

    invoke-static {}, Lcom/lody/virtual/client/hook/base/MethodProxy;->getAppPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getMode(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getMode(ILjava/lang/String;)I
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->getMode(ILjava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 2
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
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
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->getNeighboringCell(ILjava/lang/String;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    return-object p1
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

.method public getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->mService:Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lcom/lody/virtual/helper/utils/IInterfaceUtils;->isAlive(Landroid/os/IInterface;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    monitor-enter p0

    .line 12
    :try_start_0
    invoke-direct {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getRemoteInterface()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/lody/virtual/client/ipc/LocalProxyUtils;->genProxy(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->mService:Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 25
    .line 26
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->mService:Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 28
    .line 29
    return-object v0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v0
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

.method public isUseVirtualLocation(ILjava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getMode(ILjava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setAllCell(ILjava/lang/String;Ljava/util/List;)V
    .locals 1
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
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setAllCell(ILjava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setCell(ILjava/lang/String;Lcom/lody/virtual/remote/vloc/VCell;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setGlobalAllCell(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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

.method public setGlobalCell(Lcom/lody/virtual/remote/vloc/VCell;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setGlobalCell(Lcom/lody/virtual/remote/vloc/VCell;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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

.method public setGlobalLocation(Lcom/lody/virtual/remote/vloc/VLocation;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setGlobalLocation(Lcom/lody/virtual/remote/vloc/VLocation;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setGlobalNeighboringCell(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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

.method public setLocation(ILjava/lang/String;Lcom/lody/virtual/remote/vloc/VLocation;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setLocation(ILjava/lang/String;Lcom/lody/virtual/remote/vloc/VLocation;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setMode(ILjava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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
    .locals 1
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
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualLocationManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IVirtualLocationManager;->setNeighboringCell(ILjava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
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
