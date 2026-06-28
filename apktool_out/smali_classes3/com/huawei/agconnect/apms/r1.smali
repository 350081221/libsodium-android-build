.class public Lcom/huawei/agconnect/apms/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/agconnect/apms/r1$def;
    }
.end annotation


# static fields
.field public static final efg:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static volatile fgh:Lcom/huawei/agconnect/apms/r1;


# instance fields
.field public abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

.field public final bcd:Ljava/util/concurrent/ExecutorService;

.field public cde:Z

.field public def:Lcom/huawei/agconnect/apms/r1$def;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/r1;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;

    .line 5
    .line 6
    const-string v1, "RemoteConfigManager"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/huawei/agconnect/apms/r1;->bcd:Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/huawei/agconnect/apms/r1;->cde:Z

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic abc(Lcom/huawei/agconnect/apms/r1;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/huawei/agconnect/apms/r1;->abc(J)V

    return-void
.end method

.method public static def()Lcom/huawei/agconnect/apms/r1;
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/r1;->fgh:Lcom/huawei/agconnect/apms/r1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/huawei/agconnect/apms/r1;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/r1;->fgh:Lcom/huawei/agconnect/apms/r1;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/huawei/agconnect/apms/r1;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/r1;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/huawei/agconnect/apms/r1;->fgh:Lcom/huawei/agconnect/apms/r1;

    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/agconnect/apms/r1;->fgh:Lcom/huawei/agconnect/apms/r1;

    .line 25
    .line 26
    return-object v0
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


# virtual methods
.method public abc()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->getInstance()Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    return-void
.end method

.method public final abc(J)V
    .locals 2

    .line 3
    sget-object v0, Lcom/huawei/agconnect/apms/r1;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "begin to fetch remote config."

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->info(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/r1;->bcd()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    invoke-virtual {v0}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->loadLastFetched()Lcom/huawei/agconnect/remoteconfig/ConfigValues;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->apply(Lcom/huawei/agconnect/remoteconfig/ConfigValues;)V

    .line 7
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;->fetch(J)Lcom/huawei/hmf/tasks/Task;

    move-result-object p1

    new-instance p2, Lcom/huawei/agconnect/apms/r1$cde;

    invoke-direct {p2, p0}, Lcom/huawei/agconnect/apms/r1$cde;-><init>(Lcom/huawei/agconnect/apms/r1;)V

    invoke-virtual {p1, p2}, Lcom/huawei/hmf/tasks/Task;->k(Lcom/huawei/hmf/tasks/i;)Lcom/huawei/hmf/tasks/Task;

    move-result-object p1

    new-instance p2, Lcom/huawei/agconnect/apms/r1$bcd;

    invoke-direct {p2, p0}, Lcom/huawei/agconnect/apms/r1$bcd;-><init>(Lcom/huawei/agconnect/apms/r1;)V

    .line 8
    invoke-virtual {p1, p2}, Lcom/huawei/hmf/tasks/Task;->h(Lcom/huawei/hmf/tasks/h;)Lcom/huawei/hmf/tasks/Task;

    return-void
.end method

.method public final bcd()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r1;->abc:Lcom/huawei/agconnect/remoteconfig/AGConnectConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/r1;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 8
    .line 9
    const-string v1, "can not get remote config with AGConnectConfig null instance."

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public cde()V
    .locals 2

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/r1$abc;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/r1$abc;-><init>(Lcom/huawei/agconnect/apms/r1;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/r1;->bcd:Ljava/util/concurrent/ExecutorService;

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
