.class public Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;
.super Landroid/app/IServiceConnection$Stub;
.source "SourceFile"


# static fields
.field private static final sProxyMap:Lcom/lody/virtual/helper/collection/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/collection/ArrayMap<",
            "Landroid/os/IBinder;",
            "Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mConn:Landroid/app/IServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/helper/collection/ArrayMap;

    invoke-direct {v0}, Lcom/lody/virtual/helper/collection/ArrayMap;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;->sProxyMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    return-void
.end method

.method private constructor <init>(Landroid/app/IServiceConnection;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/IServiceConnection$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;->mConn:Landroid/app/IServiceConnection;

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

.method public static getDispatcher(Landroid/content/Context;Landroid/content/ServiceConnection;I)Landroid/app/IServiceConnection;
    .locals 5

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lmirror/android/app/ActivityThread;->currentActivityThread:Lmirror/RefStaticMethod;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {v0, v2}, Lmirror/RefStaticMethod;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, Lmirror/android/app/ContextImpl;->mPackageInfo:Lmirror/RefObject;

    .line 13
    .line 14
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v2, v3}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget-object v3, Lmirror/android/app/ActivityThread;->getHandler:Lmirror/RefMethod;

    .line 27
    .line 28
    new-array v4, v1, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v3, v0, v4}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/os/Handler;

    .line 35
    .line 36
    sget-object v3, Lmirror/android/app/LoadedApk;->getServiceDispatcher:Lmirror/RefMethod;

    .line 37
    .line 38
    const/4 v4, 0x4

    .line 39
    new-array v4, v4, [Ljava/lang/Object;

    .line 40
    .line 41
    aput-object p1, v4, v1

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    aput-object p0, v4, p1

    .line 45
    .line 46
    const/4 p0, 0x2

    .line 47
    aput-object v0, v4, p0

    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/4 p1, 0x3

    .line 54
    aput-object p0, v4, p1

    .line 55
    .line 56
    invoke-virtual {v3, v2, v4}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Landroid/app/IServiceConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception p0

    .line 64
    const-string p1, "ConnectionDelegate"

    .line 65
    .line 66
    const-string p2, "getServiceDispatcher"

    .line 67
    .line 68
    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    :goto_0
    if-eqz p0, :cond_0

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 76
    .line 77
    const-string p1, "Not supported in system context"

    .line 78
    .line 79
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 84
    .line 85
    const-string p1, "connection is null"

    .line 86
    .line 87
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0
.end method

.method public static getOrCreateProxy(Landroid/app/IServiceConnection;)Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;
    .locals 3

    .line 1
    instance-of v0, p0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;->sProxyMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    invoke-virtual {v1, v0}, Lcom/lody/virtual/helper/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    new-instance v2, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;

    .line 24
    .line 25
    invoke-direct {v2, p0}, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;-><init>(Landroid/app/IServiceConnection;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Lcom/lody/virtual/helper/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1
    monitor-exit v1

    .line 32
    return-object v2

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p0
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

.method public static removeDispatcher(Landroid/content/Context;Landroid/content/ServiceConnection;)Landroid/app/IServiceConnection;
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lmirror/android/app/ContextImpl;->mPackageInfo:Lmirror/RefObject;

    .line 2
    .line 3
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lmirror/android/app/LoadedApk;->forgetServiceDispatcher:Lmirror/RefMethod;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    new-array v2, v2, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object p0, v2, v3

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    aput-object p1, v2, p0

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/app/IServiceConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p0

    .line 34
    const-string p1, "ConnectionDelegate"

    .line 35
    .line 36
    const-string v0, "forgetServiceDispatcher"

    .line 37
    .line 38
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    :goto_0
    return-object p0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static removeProxy(Landroid/app/IServiceConnection;)Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    sget-object v0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;->sProxyMap:Lcom/lody/virtual/helper/collection/ArrayMap;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Lcom/lody/virtual/helper/collection/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object p0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public connected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;->connected(Landroid/content/ComponentName;Landroid/os/IBinder;Z)V

    return-void
.end method

.method public connected(Landroid/content/ComponentName;Landroid/os/IBinder;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p2}, Lcom/lody/virtual/server/IBinderProxyService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/IBinderProxyService;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {v0}, Lcom/lody/virtual/server/IBinderProxyService;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    .line 4
    invoke-interface {v0}, Lcom/lody/virtual/server/IBinderProxyService;->getService()Landroid/os/IBinder;

    move-result-object p2

    .line 5
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->isVAppProcess()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/lody/virtual/client/VClient;->getCurrentApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/lody/virtual/client/hook/secondary/ProxyServiceFactory;->getProxyService(Landroid/content/Context;Landroid/content/ComponentName;Landroid/os/IBinder;)Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object p2, v0

    .line 7
    :cond_1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    sget-object v0, Lmirror/android/app/IServiceConnectionO;->connected:Lmirror/RefMethod;

    iget-object v1, p0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;->mConn:Landroid/app/IServiceConnection;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    const/4 p1, 0x2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    aput-object p2, v2, p1

    invoke-virtual {v0, v1, v2}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_2
    iget-object p3, p0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;->mConn:Landroid/app/IServiceConnection;

    invoke-interface {p3, p1, p2}, Landroid/app/IServiceConnection;->connected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    :goto_0
    return-void
.end method

.method public getBase()Landroid/app/IServiceConnection;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/hook/secondary/ServiceConnectionProxy;->mConn:Landroid/app/IServiceConnection;

    return-object v0
.end method
