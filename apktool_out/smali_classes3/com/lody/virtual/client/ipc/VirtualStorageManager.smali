.class public Lcom/lody/virtual/client/ipc/VirtualStorageManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sInstance:Lcom/lody/virtual/client/ipc/VirtualStorageManager;


# instance fields
.field private mService:Lcom/lody/virtual/server/interfaces/IVirtualStorageService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/ipc/VirtualStorageManager;

    invoke-direct {v0}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->sInstance:Lcom/lody/virtual/client/ipc/VirtualStorageManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/lody/virtual/client/ipc/VirtualStorageManager;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->sInstance:Lcom/lody/virtual/client/ipc/VirtualStorageManager;

    return-object v0
.end method

.method private getRemoteInterface()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "vs"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/lody/virtual/server/interfaces/IVirtualStorageService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

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
.method public getService()Lcom/lody/virtual/server/interfaces/IVirtualStorageService;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->mService:Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

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
    invoke-direct {p0}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->getRemoteInterface()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/lody/virtual/client/ipc/LocalProxyUtils;->genProxy(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->mService:Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

    .line 25
    .line 26
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->mService:Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

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

.method public getVirtualStorage(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IVirtualStorageService;->getVirtualStorage(Ljava/lang/String;I)Ljava/lang/String;

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
    check-cast p1, Ljava/lang/String;

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

.method public isVirtualStorageEnable(Ljava/lang/String;I)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/lody/virtual/server/interfaces/IVirtualStorageService;->isVirtualStorageEnable(Ljava/lang/String;I)Z

    .line 6
    .line 7
    .line 8
    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return p1

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
    check-cast p1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IVirtualStorageService;->setVirtualStorage(Ljava/lang/String;ILjava/lang/String;)V
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

.method public setVirtualStorageState(Ljava/lang/String;IZ)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VirtualStorageManager;->getService()Lcom/lody/virtual/server/interfaces/IVirtualStorageService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/lody/virtual/server/interfaces/IVirtualStorageService;->setVirtualStorageState(Ljava/lang/String;IZ)V
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
