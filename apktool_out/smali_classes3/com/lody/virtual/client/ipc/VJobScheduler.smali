.class public Lcom/lody/virtual/client/ipc/VJobScheduler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final sInstance:Lcom/lody/virtual/client/ipc/VJobScheduler;


# instance fields
.field private mService:Lcom/lody/virtual/server/interfaces/IJobService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/ipc/VJobScheduler;

    invoke-direct {v0}, Lcom/lody/virtual/client/ipc/VJobScheduler;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/ipc/VJobScheduler;->sInstance:Lcom/lody/virtual/client/ipc/VJobScheduler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/lody/virtual/client/ipc/VJobScheduler;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/ipc/VJobScheduler;->sInstance:Lcom/lody/virtual/client/ipc/VJobScheduler;

    return-object v0
.end method

.method private getRemoteInterface()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "job"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/client/ipc/ServiceManagerNative;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/lody/virtual/server/interfaces/IJobService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/lody/virtual/server/interfaces/IJobService;

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
.method public cancel(I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VJobScheduler;->getService()Lcom/lody/virtual/server/interfaces/IJobService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, v1, p1}, Lcom/lody/virtual/server/interfaces/IJobService;->cancel(II)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public cancelAll()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VJobScheduler;->getService()Lcom/lody/virtual/server/interfaces/IJobService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, v1}, Lcom/lody/virtual/server/interfaces/IJobService;->cancelAll(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
    .line 22
    .line 23
.end method

.method public enqueue(Landroid/app/job/JobInfo;Landroid/app/job/JobWorkItem;)I
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isOreo()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VJobScheduler;->getService()Lcom/lody/virtual/server/interfaces/IJobService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    new-instance v2, Lcom/lody/virtual/remote/VJobWorkItem;

    .line 24
    .line 25
    invoke-direct {v2, p2}, Lcom/lody/virtual/remote/VJobWorkItem;-><init>(Landroid/app/job/JobWorkItem;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1, p1, v2}, Lcom/lody/virtual/server/interfaces/IJobService;->enqueue(ILandroid/app/job/JobInfo;Lcom/lody/virtual/remote/VJobWorkItem;)I

    .line 29
    .line 30
    .line 31
    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return p1

    .line 33
    :catch_0
    move-exception p1

    .line 34
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_1
    return v0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public getAllPendingJobs()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/job/JobInfo;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VJobScheduler;->getService()Lcom/lody/virtual/server/interfaces/IJobService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, v1}, Lcom/lody/virtual/server/interfaces/IJobService;->getAllPendingJobs(I)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-object v0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    invoke-static {v0}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/util/List;

    .line 24
    .line 25
    return-object v0
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

.method public getPendingJob(I)Landroid/app/job/JobInfo;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VJobScheduler;->getService()Lcom/lody/virtual/server/interfaces/IJobService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, v1, p1}, Lcom/lody/virtual/server/interfaces/IJobService;->getPendingJob(II)Landroid/app/job/JobInfo;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-object p1

    .line 18
    :catch_0
    move-exception p1

    .line 19
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Landroid/app/job/JobInfo;

    .line 24
    .line 25
    return-object p1
    .line 26
    .line 27
.end method

.method public getService()Lcom/lody/virtual/server/interfaces/IJobService;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VJobScheduler;->mService:Lcom/lody/virtual/server/interfaces/IJobService;

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
    invoke-direct {p0}, Lcom/lody/virtual/client/ipc/VJobScheduler;->getRemoteInterface()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v1, Lcom/lody/virtual/server/interfaces/IJobService;

    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/lody/virtual/client/ipc/LocalProxyUtils;->genProxy(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/lody/virtual/server/interfaces/IJobService;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/lody/virtual/client/ipc/VJobScheduler;->mService:Lcom/lody/virtual/server/interfaces/IJobService;

    .line 25
    .line 26
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/VJobScheduler;->mService:Lcom/lody/virtual/server/interfaces/IJobService;

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

.method public schedule(Landroid/app/job/JobInfo;)I
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/VJobScheduler;->getService()Lcom/lody/virtual/server/interfaces/IJobService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, v1, p1}, Lcom/lody/virtual/server/interfaces/IJobService;->schedule(ILandroid/app/job/JobInfo;)I

    .line 14
    .line 15
    .line 16
    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return p1

    .line 18
    :catch_0
    move-exception p1

    .line 19
    invoke-static {p1}, Lcom/lody/virtual/client/env/VirtualRuntime;->crash(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
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
