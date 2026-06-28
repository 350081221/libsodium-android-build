.class public Lcom/lody/virtual/client/stub/ShadowJobWorkService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ShadowJobWorkService"

.field private static final debug:Z = true


# instance fields
.field private final mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/lody/virtual/helper/collection/SparseArray<",
            "Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;",
            ">;"
        }
    .end annotation
.end field

.field private mScheduler:Landroid/app/job/JobScheduler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

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
    iput-object v0, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 10
    .line 11
    return-void
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

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/lody/virtual/client/stub/ShadowJobWorkService;Landroid/app/job/IJobCallback;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->emptyCallback(Landroid/app/job/IJobCallback;I)V

    return-void
.end method

.method static synthetic access$200(Lcom/lody/virtual/client/stub/ShadowJobWorkService;)Lcom/lody/virtual/helper/collection/SparseArray;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    return-object p0
.end method

.method private emptyCallback(Landroid/app/job/IJobCallback;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p1, p2, v0}, Landroid/app/job/IJobCallback;->acknowledgeStartMessage(IZ)V

    .line 3
    .line 4
    .line 5
    invoke-interface {p1, p2, v0}, Landroid/app/job/IJobCallback;->jobFinished(IZ)V
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
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

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
.end method

.method public static startJob(Landroid/content/Context;Landroid/app/job/JobParameters;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/lody/virtual/client/stub/ShadowJobWorkService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "action.startJob"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "jobParams"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public static stopJob(Landroid/content/Context;Landroid/app/job/JobParameters;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/lody/virtual/client/stub/ShadowJobWorkService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "action.stopJob"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "jobParams"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/lody/virtual/client/core/InvocationStubManager;->getInstance()Lcom/lody/virtual/client/core/InvocationStubManager;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-class v1, Lcom/lody/virtual/client/hook/proxies/am/ActivityManagerStub;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/InvocationStubManager;->checkEnv(Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "jobscheduler"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mScheduler:Landroid/app/job/JobScheduler;

    .line 22
    .line 23
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    sget-object v0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "ShadowJobService:onDestroy"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-static {v0, v1, v2}, Lcom/lody/virtual/helper/utils/VLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz v1, :cond_0

    .line 23
    .line 24
    iget-object v2, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Lcom/lody/virtual/helper/collection/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;->stopSessionLocked()V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/lody/virtual/helper/collection/SparseArray;->clear()V

    .line 41
    .line 42
    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v1
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

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string p3, "action.startJob"

    .line 8
    .line 9
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const-string v0, "jobParams"

    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/app/job/JobParameters;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->startJob(Landroid/app/job/JobParameters;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p3, "action.stopJob"

    .line 28
    .line 29
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/app/job/JobParameters;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->stopJob(Landroid/app/job/JobParameters;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    const/4 p1, 0x2

    .line 45
    return p1
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

.method public startJob(Landroid/app/job/JobParameters;)V
    .locals 15

    move-object v7, p0

    move-object/from16 v0, p1

    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/app/job/JobParameters;->getJobId()I

    move-result v8

    .line 6
    sget-object v1, Lmirror/android/app/job/JobParameters;->callback:Lmirror/RefObject;

    invoke-virtual {v1, v0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IBinder;

    .line 7
    invoke-static {v1}, Landroid/app/job/IJobCallback$Stub;->asInterface(Landroid/os/IBinder;)Landroid/app/job/IJobCallback;

    move-result-object v9

    .line 8
    invoke-static {}, Lcom/lody/virtual/server/job/VJobSchedulerService;->get()Lcom/lody/virtual/server/job/VJobSchedulerService;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/lody/virtual/server/job/VJobSchedulerService;->findJobByVirtualJobId(I)Ljava/util/Map$Entry;

    move-result-object v1

    if-nez v1, :cond_0

    .line 9
    invoke-direct {p0, v9, v8}, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->emptyCallback(Landroid/app/job/IJobCallback;I)V

    .line 10
    iget-object v0, v7, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mScheduler:Landroid/app/job/JobScheduler;

    invoke-virtual {v0, v8}, Landroid/app/job/JobScheduler;->cancel(I)V

    goto/16 :goto_1

    .line 11
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/lody/virtual/server/job/VJobSchedulerService$JobId;

    .line 12
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;

    .line 13
    iget-object v1, v7, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    monitor-enter v1

    .line 14
    :try_start_0
    iget-object v2, v7, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    invoke-virtual {v2, v8}, Lcom/lody/virtual/helper/collection/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;

    .line 15
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v12, 0x1

    if-eqz v2, :cond_1

    .line 16
    invoke-virtual {v2, v12}, Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;->startJob(Z)V

    goto/16 :goto_1

    .line 17
    :cond_1
    iget-object v13, v7, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    monitor-enter v13

    .line 18
    :try_start_1
    sget-object v1, Lmirror/android/app/job/JobParameters;->jobId:Lmirror/RefInt;

    iget v2, v10, Lcom/lody/virtual/server/job/VJobSchedulerService$JobId;->clientJobId:I

    invoke-virtual {v1, v0, v2}, Lmirror/RefInt;->set(Ljava/lang/Object;I)V

    .line 19
    new-instance v14, Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;

    iget-object v6, v10, Lcom/lody/virtual/server/job/VJobSchedulerService$JobId;->packageName:Ljava/lang/String;

    move-object v1, v14

    move-object v2, p0

    move v3, v8

    move-object v4, v9

    move-object/from16 v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;-><init>(Lcom/lody/virtual/client/stub/ShadowJobWorkService;ILandroid/app/job/IJobCallback;Landroid/app/job/JobParameters;Ljava/lang/String;)V

    .line 20
    sget-object v1, Lmirror/android/app/job/JobParameters;->callback:Lmirror/RefObject;

    invoke-virtual {v14}, Landroid/app/job/IJobCallback$Stub;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    iget-object v0, v7, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    invoke-virtual {v0, v8, v14}, Lcom/lody/virtual/helper/collection/SparseArray;->put(ILjava/lang/Object;)V

    .line 22
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 23
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, v10, Lcom/lody/virtual/server/job/VJobSchedulerService$JobId;->packageName:Ljava/lang/String;

    iget-object v2, v11, Lcom/lody/virtual/server/job/VJobSchedulerService$JobConfig;->serviceName:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v11, 0x0

    .line 24
    :try_start_2
    sget-object v0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->TAG:Ljava/lang/String;

    const-string v1, "ShadowJobService:binService:%s, jobId=%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 25
    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v4

    aput-object v4, v2, v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v12

    .line 26
    invoke-static {v0, v1, v2}, Lcom/lody/virtual/helper/utils/VLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    move-result-object v1

    const/4 v5, 0x5

    iget v0, v10, Lcom/lody/virtual/server/job/VJobSchedulerService$JobId;->vuid:I

    .line 28
    invoke-static {v0}, Lcom/lody/virtual/os/VUserHandle;->getUserId(I)I

    move-result v6

    move-object v2, p0

    move-object v4, v14

    .line 29
    invoke-virtual/range {v1 .. v6}, Lcom/lody/virtual/client/ipc/VActivityManager;->bindService(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;II)Z

    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 30
    :try_start_3
    sget-object v1, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->TAG:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/lody/virtual/helper/utils/VLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    :goto_0
    monitor-exit v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v11, :cond_2

    .line 32
    iget-object v1, v7, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    monitor-enter v1

    .line 33
    :try_start_4
    iget-object v0, v7, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    invoke-virtual {v0, v8}, Lcom/lody/virtual/helper/collection/SparseArray;->remove(I)V

    .line 34
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 35
    invoke-direct {p0, v9, v8}, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->emptyCallback(Landroid/app/job/IJobCallback;I)V

    .line 36
    iget-object v0, v7, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mScheduler:Landroid/app/job/JobScheduler;

    invoke-virtual {v0, v8}, Landroid/app/job/JobScheduler;->cancel(I)V

    .line 37
    invoke-static {}, Lcom/lody/virtual/server/job/VJobSchedulerService;->get()Lcom/lody/virtual/server/job/VJobSchedulerService;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v8}, Lcom/lody/virtual/server/job/VJobSchedulerService;->cancel(II)V

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 38
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :cond_2
    :goto_1
    return-void

    :catchall_2
    move-exception v0

    .line 39
    :try_start_6
    monitor-exit v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v0

    :catchall_3
    move-exception v0

    .line 40
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0
.end method

.method public stopJob(Landroid/app/job/JobParameters;)V
    .locals 6

    .line 5
    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getJobId()I

    move-result p1

    .line 6
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->mJobSessions:Lcom/lody/virtual/helper/collection/SparseArray;

    invoke-virtual {v1, p1}, Lcom/lody/virtual/helper/collection/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;

    if-eqz v1, :cond_0

    .line 8
    sget-object v2, Lcom/lody/virtual/client/stub/ShadowJobWorkService;->TAG:Ljava/lang/String;

    const-string v3, "stopJob:%d"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-static {v2, v3, v4}, Lcom/lody/virtual/helper/utils/VLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v1}, Lcom/lody/virtual/client/stub/ShadowJobWorkService$JobSession;->stopSessionLocked()V

    .line 10
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
