.class public Lcom/lody/virtual/client/service/VServiceRuntime;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;,
        Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;,
        Lcom/lody/virtual/client/service/VServiceRuntime$RebindStatus;
    }
.end annotation


# static fields
.field private static final sInstance:Lcom/lody/virtual/client/service/VServiceRuntime;


# instance fields
.field private final mComponentToServiceRecords:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/content/ComponentName;",
            "Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;",
            ">;"
        }
    .end annotation
.end field

.field private mConnectionCallbackList:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<",
            "Landroid/app/IServiceConnection;",
            ">;"
        }
    .end annotation
.end field

.field private mHandler:Landroid/os/Handler;

.field private mShadowService:Landroid/app/Service;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/lody/virtual/client/service/VServiceRuntime;

    invoke-direct {v0}, Lcom/lody/virtual/client/service/VServiceRuntime;-><init>()V

    sput-object v0, Lcom/lody/virtual/client/service/VServiceRuntime;->sInstance:Lcom/lody/virtual/client/service/VServiceRuntime;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

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
    iput-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Lcom/lody/virtual/client/service/VServiceRuntime$1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/lody/virtual/client/service/VServiceRuntime$1;-><init>(Lcom/lody/virtual/client/service/VServiceRuntime;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mConnectionCallbackList:Landroid/os/RemoteCallbackList;

    .line 17
    .line 18
    new-instance v0, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mHandler:Landroid/os/Handler;

    .line 28
    .line 29
    return-void
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

.method static synthetic access$000(Lcom/lody/virtual/client/service/VServiceRuntime;Landroid/app/IServiceConnection;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/lody/virtual/client/service/VServiceRuntime;->handleConnectionDied(Landroid/app/IServiceConnection;)V

    return-void
.end method

.method static synthetic access$100(Lcom/lody/virtual/client/service/VServiceRuntime;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$200(Lcom/lody/virtual/client/service/VServiceRuntime;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$300(Lcom/lody/virtual/client/service/VServiceRuntime;)Landroid/app/Service;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mShadowService:Landroid/app/Service;

    return-object p0
.end method

.method static synthetic access$400(Lcom/lody/virtual/client/service/VServiceRuntime;)Landroid/os/RemoteCallbackList;
    .locals 0

    iget-object p0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mConnectionCallbackList:Landroid/os/RemoteCallbackList;

    return-object p0
.end method

.method public static getInstance()Lcom/lody/virtual/client/service/VServiceRuntime;
    .locals 1

    sget-object v0, Lcom/lody/virtual/client/service/VServiceRuntime;->sInstance:Lcom/lody/virtual/client/service/VServiceRuntime;

    return-object v0
.end method

.method private handleConnectionDied(Landroid/app/IServiceConnection;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;

    .line 25
    .line 26
    iget-object v2, v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->bindings:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;

    .line 43
    .line 44
    iget-object v3, v3, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceBindRecord;->connections:Ljava/util/Set;

    .line 45
    .line 46
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-direct {p0}, Lcom/lody/virtual/client/service/VServiceRuntime;->trimService()V

    .line 55
    .line 56
    .line 57
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw p1
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

.method private trimService()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;

    .line 25
    .line 26
    iget-object v3, v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    iget-boolean v3, v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->started:Z

    .line 31
    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->getClientCount()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-gtz v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->getConnectionCount()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-gtz v3, :cond_0

    .line 45
    .line 46
    iget-object v3, v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/app/Service;->onDestroy()V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    iput-object v3, v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->service:Landroid/app/Service;

    .line 53
    .line 54
    iget-object v3, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 55
    .line 56
    iget-object v2, v2, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->component:Landroid/content/ComponentName;

    .line 57
    .line 58
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw v1
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


# virtual methods
.method public getServiceRecord(Landroid/content/ComponentName;Z)Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    new-instance v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;-><init>(Lcom/lody/virtual/client/service/VServiceRuntime;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->component:Landroid/content/ComponentName;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    iput-wide v2, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->lastActivityTime:J

    .line 28
    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    iput-wide v2, v1, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->activeSince:J

    .line 34
    .line 35
    iget-object p2, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_0
    monitor-exit v0

    .line 41
    return-object v1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public getServices()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/ActivityManager$RunningServiceInfo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v2, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mComponentToServiceRecords:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;

    .line 36
    .line 37
    new-instance v4, Landroid/app/ActivityManager$RunningServiceInfo;

    .line 38
    .line 39
    invoke-direct {v4}, Landroid/app/ActivityManager$RunningServiceInfo;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    iput v5, v4, Landroid/app/ActivityManager$RunningServiceInfo;->pid:I

    .line 47
    .line 48
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Lcom/lody/virtual/client/VClient;->getVUid()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    iput v5, v4, Landroid/app/ActivityManager$RunningServiceInfo;->uid:I

    .line 57
    .line 58
    iget-wide v5, v3, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->activeSince:J

    .line 59
    .line 60
    iput-wide v5, v4, Landroid/app/ActivityManager$RunningServiceInfo;->activeSince:J

    .line 61
    .line 62
    iget-wide v5, v3, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->lastActivityTime:J

    .line 63
    .line 64
    iput-wide v5, v4, Landroid/app/ActivityManager$RunningServiceInfo;->lastActivityTime:J

    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->getClientCount()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    iput v5, v4, Landroid/app/ActivityManager$RunningServiceInfo;->clientCount:I

    .line 71
    .line 72
    iget-object v5, v3, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->component:Landroid/content/ComponentName;

    .line 73
    .line 74
    iput-object v5, v4, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;

    .line 75
    .line 76
    iget-boolean v3, v3, Lcom/lody/virtual/client/service/VServiceRuntime$ServiceRecord;->started:Z

    .line 77
    .line 78
    iput-boolean v3, v4, Landroid/app/ActivityManager$RunningServiceInfo;->started:Z

    .line 79
    .line 80
    invoke-static {}, Lcom/lody/virtual/client/VClient;->get()Lcom/lody/virtual/client/VClient;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3}, Lcom/lody/virtual/client/VClient;->getClientConfig()Lcom/lody/virtual/remote/ClientConfig;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iget-object v3, v3, Lcom/lody/virtual/remote/ClientConfig;->processName:Ljava/lang/String;

    .line 89
    .line 90
    iput-object v3, v4, Landroid/app/ActivityManager$RunningServiceInfo;->process:Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    monitor-exit v1

    .line 97
    return-object v0

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    throw v0
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public getShadowService()Landroid/app/Service;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mShadowService:Landroid/app/Service;

    return-object v0
.end method

.method public setShadowService(Landroid/app/Service;)V
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/service/VServiceRuntime;->mShadowService:Landroid/app/Service;

    return-void
.end method
