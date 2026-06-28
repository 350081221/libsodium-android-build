.class public Lcom/lody/virtual/client/ipc/ServiceManagerNative;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACCOUNT:Ljava/lang/String; = "account"

.field public static final ACTIVITY:Ljava/lang/String; = "activity"

.field public static final APP:Ljava/lang/String; = "app"

.field public static final CONTENT:Ljava/lang/String; = "content"

.field public static final DEVICE:Ljava/lang/String; = "device"

.field public static final FILE_TRANSFER:Ljava/lang/String; = "file-transfer"

.field public static final JOB:Ljava/lang/String; = "job"

.field public static final NOTIFICATION:Ljava/lang/String; = "notification"

.field public static final PACKAGE:Ljava/lang/String; = "package"

.field private static final TAG:Ljava/lang/String; = "ServiceManagerNative"

.field public static final USER:Ljava/lang/String; = "user"

.field public static final VIRTUAL_LOC:Ljava/lang/String; = "virtual-loc"

.field public static final VS:Ljava/lang/String; = "vs"

.field private static sFetcher:Lcom/lody/virtual/server/interfaces/IServiceFetcher;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addService(Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getServiceFetcher()Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-interface {v0, p0, p1}, Lcom/lody/virtual/server/interfaces/IServiceFetcher;->addService(Ljava/lang/String;Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    return-void
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
.end method

.method public static clearServerFetcher()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->sFetcher:Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    return-void
.end method

.method public static ensureServerStarted()V
    .locals 3

    new-instance v0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v1, "ensure_created"

    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->methodName(Ljava/lang/String;)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->callSafely()Landroid/os/Bundle;

    return-void
.end method

.method private static getAuthority()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/SettingConfig;->getBinderProviderAuthority()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getService(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isServerProcess()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lcom/lody/virtual/server/ServiceCache;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getServiceFetcher()Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :try_start_0
    invoke-interface {v0, p0}, Lcom/lody/virtual/server/interfaces/IServiceFetcher;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    :cond_1
    sget-object v0, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->TAG:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    new-array v1, v1, [Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aput-object p0, v1, v2

    .line 38
    .line 39
    const-string p0, "GetService(%s) return null."

    .line 40
    .line 41
    invoke-static {v0, p0, v1}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0
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

.method private static getServiceFetcher()Lcom/lody/virtual/server/interfaces/IServiceFetcher;
    .locals 4

    .line 1
    sget-object v0, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->sFetcher:Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/os/IBinder;->isBinderAlive()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    :cond_0
    const-class v0, Lcom/lody/virtual/client/ipc/ServiceManagerNative;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    .line 27
    .line 28
    invoke-static {}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getAuthority()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v2, v1, v3}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "@"

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->methodName(Ljava/lang/String;)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->callSafely()Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    const-string v2, "_VA_|_binder_"

    .line 48
    .line 49
    invoke-static {v1, v2}, Lcom/lody/virtual/helper/compat/BundleCompat;->getBinder(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->linkBinderDied(Landroid/os/IBinder;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Lcom/lody/virtual/server/interfaces/IServiceFetcher$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sput-object v1, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->sFetcher:Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    .line 61
    .line 62
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_2
    sget-object v0, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->sFetcher:Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    .line 64
    .line 65
    return-object v0

    .line 66
    :catchall_0
    move-exception v1

    .line 67
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw v1
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

.method private static linkBinderDied(Landroid/os/IBinder;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/lody/virtual/client/ipc/ServiceManagerNative$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/lody/virtual/client/ipc/ServiceManagerNative$1;-><init>(Landroid/os/IBinder;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    invoke-interface {p0, v0, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    :goto_0
    return-void
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

.method public static linkToDeath(Landroid/os/IBinder$DeathRecipient;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getServiceFetcher()Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-void
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

.method public static removeService(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getServiceFetcher()Lcom/lody/virtual/server/interfaces/IServiceFetcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-interface {v0, p0}, Lcom/lody/virtual/server/interfaces/IServiceFetcher;->removeService(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    return-void
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
