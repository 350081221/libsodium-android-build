.class public Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static instance:Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;


# instance fields
.field public activityCount:Ljava/util/concurrent/atomic/AtomicLong;

.field public final applicationStateListeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;",
            ">;"
        }
    .end annotation
.end field

.field public executor:Ljava/util/concurrent/ExecutorService;

.field public foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/Set;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->activityCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    .line 28
    new-instance v0, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;

    .line 29
    .line 30
    const-string v1, "AppStateMonitor"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    .line 40
    .line 41
    return-void
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

.method public static synthetic access$000(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->notifyApplicationInBackground()V

    return-void
.end method

.method public static synthetic access$200(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->activityCount:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static synthetic access$300(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->notifyApplicationInForeground()V

    return-void
.end method

.method public static getInstance()Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->instance:Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->setInstance(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->instance:Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private notifyApplicationInBackground()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/Set;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    new-instance v0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;

    .line 32
    .line 33
    invoke-interface {v2, v0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;->applicationBackgrounded(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw v1
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

.method private notifyApplicationInForeground()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/Set;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    new-instance v0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;

    .line 32
    .line 33
    invoke-interface {v2, v0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;->applicationForegrounded(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateEvent;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw v1
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

.method public static setInstance(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)V
    .locals 0

    sput-object p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->instance:Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;

    return-void
.end method


# virtual methods
.method public activityStarted()V
    .locals 2

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$bcd;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$bcd;-><init>(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
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

.method public activityStopped()V
    .locals 2

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$cde;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$cde;-><init>(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
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

.method public addApplicationStateListener(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/Set;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->applicationStateListeners:Ljava/util/Set;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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

.method public isAppInBackground()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->foregrounded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public uiHidden()V
    .locals 2

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$abc;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor$abc;-><init>(Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/lifestyle/ApplicationStateMonitor;->executor:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
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
