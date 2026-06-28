.class public Lcom/huawei/agconnect/apms/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static ghi:Lcom/huawei/agconnect/apms/e1;


# instance fields
.field public abc:Ljava/util/concurrent/ScheduledExecutorService;

.field public bcd:Lcom/huawei/agconnect/apms/c1;

.field public cde:Lcom/huawei/agconnect/apms/d1;

.field public def:Lcom/huawei/agconnect/apms/util/Session;

.field public efg:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/e1;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

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
    const-string v1, "ResourceManager"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/huawei/agconnect/apms/e1;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/huawei/agconnect/apms/e1;->def:Lcom/huawei/agconnect/apms/util/Session;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/huawei/agconnect/apms/e1;->efg:Ljava/util/concurrent/ScheduledFuture;

    .line 21
    .line 22
    sget-object v0, Lcom/huawei/agconnect/apms/c1;->ijk:Lcom/huawei/agconnect/apms/c1;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    new-instance v0, Lcom/huawei/agconnect/apms/c1;

    .line 27
    .line 28
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/c1;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/huawei/agconnect/apms/c1;->ijk:Lcom/huawei/agconnect/apms/c1;

    .line 32
    .line 33
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/c1;->ijk:Lcom/huawei/agconnect/apms/c1;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/huawei/agconnect/apms/e1;->bcd:Lcom/huawei/agconnect/apms/c1;

    .line 36
    .line 37
    sget-object v0, Lcom/huawei/agconnect/apms/d1;->ghi:Lcom/huawei/agconnect/apms/d1;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    new-instance v0, Lcom/huawei/agconnect/apms/d1;

    .line 42
    .line 43
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/d1;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/huawei/agconnect/apms/d1;->ghi:Lcom/huawei/agconnect/apms/d1;

    .line 47
    .line 48
    :cond_1
    sget-object v0, Lcom/huawei/agconnect/apms/d1;->ghi:Lcom/huawei/agconnect/apms/d1;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/huawei/agconnect/apms/e1;->cde:Lcom/huawei/agconnect/apms/d1;

    .line 51
    .line 52
    return-void
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

.method public static synthetic abc(Lcom/huawei/agconnect/apms/e1;Lcom/huawei/agconnect/apms/util/Session;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/e1;->abc(Lcom/huawei/agconnect/apms/util/Session;)V

    return-void
.end method

.method public static declared-synchronized cde()Lcom/huawei/agconnect/apms/e1;
    .locals 2

    .line 1
    const-class v0, Lcom/huawei/agconnect/apms/e1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/e1;->ghi:Lcom/huawei/agconnect/apms/e1;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/huawei/agconnect/apms/e1;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/e1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/huawei/agconnect/apms/e1;->ghi:Lcom/huawei/agconnect/apms/e1;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lcom/huawei/agconnect/apms/e1;->ghi:Lcom/huawei/agconnect/apms/e1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1
    .line 22
    .line 23
.end method


# virtual methods
.method public abc()V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1;->bcd:Lcom/huawei/agconnect/apms/c1;

    if-eqz v0, :cond_0

    .line 37
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/c1;->bcd()V

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1;->cde:Lcom/huawei/agconnect/apms/d1;

    if-eqz v0, :cond_1

    .line 39
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/d1;->bcd()V

    :cond_1
    return-void
.end method

.method public final abc(Lcom/huawei/agconnect/apms/util/Session;)V
    .locals 3

    .line 28
    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/event/resource/CPUMemoryEvent;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/collect/model/event/resource/CPUMemoryEvent;-><init>()V

    .line 29
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/collect/model/event/resource/CPUMemoryEvent;->addSession(Lcom/huawei/agconnect/apms/util/Session;)V

    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/collect/model/event/resource/CPUMemoryEvent;->setTimestamp(J)V

    .line 31
    :goto_0
    iget-object p1, p0, Lcom/huawei/agconnect/apms/e1;->bcd:Lcom/huawei/agconnect/apms/c1;

    iget-object p1, p1, Lcom/huawei/agconnect/apms/c1;->fgh:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 32
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/collect/model/event/resource/CPUMemoryEvent;->getCpuResourceList()Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/huawei/agconnect/apms/e1;->bcd:Lcom/huawei/agconnect/apms/c1;

    iget-object v1, v1, Lcom/huawei/agconnect/apms/c1;->fgh:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 33
    :cond_0
    :goto_1
    iget-object p1, p0, Lcom/huawei/agconnect/apms/e1;->cde:Lcom/huawei/agconnect/apms/d1;

    iget-object p1, p1, Lcom/huawei/agconnect/apms/d1;->efg:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 34
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/collect/model/event/resource/CPUMemoryEvent;->getAppMemoryResourceList()Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/huawei/agconnect/apms/e1;->cde:Lcom/huawei/agconnect/apms/d1;

    iget-object v1, v1, Lcom/huawei/agconnect/apms/d1;->efg:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 35
    :cond_1
    invoke-static {v0}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    return-void
.end method

.method public abc(Lcom/huawei/agconnect/apms/util/Session;Z)V
    .locals 9

    .line 2
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1;->def:Lcom/huawei/agconnect/apms/util/Session;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/e1;->bcd()V

    :cond_1
    if-eqz p2, :cond_2

    .line 5
    sget-object p1, Lcom/huawei/agconnect/apms/e1;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p2, "stop report cpu and memory metrics when in background."

    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_2
    invoke-static {}, Lcom/huawei/agconnect/apms/ghi;->def()Lcom/huawei/agconnect/apms/ghi;

    move-result-object p2

    .line 7
    iget-object v0, p2, Lcom/huawei/agconnect/apms/ghi;->abc:Landroid/os/Bundle;

    const-string v1, "collect_cpu_frequency_fg_ms"

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 8
    invoke-virtual {p2, v0}, Lcom/huawei/agconnect/apms/ghi;->abc(I)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    .line 9
    :goto_0
    invoke-static {v0}, Lcom/huawei/agconnect/apms/c1;->bcd(I)Z

    move-result p2

    const/4 v3, -0x1

    if-eqz p2, :cond_4

    move v0, v3

    :cond_4
    const/4 p2, 0x1

    if-lez v0, :cond_8

    .line 10
    iget-object v4, p0, Lcom/huawei/agconnect/apms/e1;->bcd:Lcom/huawei/agconnect/apms/c1;

    .line 11
    iget-wide v5, v4, Lcom/huawei/agconnect/apms/c1;->efg:J

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-lez v5, :cond_9

    invoke-static {v0}, Lcom/huawei/agconnect/apms/c1;->bcd(I)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_1

    .line 12
    :cond_5
    iget-object v5, v4, Lcom/huawei/agconnect/apms/c1;->bcd:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v5, :cond_7

    int-to-long v5, v0

    .line 13
    iget-wide v7, v4, Lcom/huawei/agconnect/apms/c1;->cde:J

    cmp-long v5, v5, v7

    if-nez v5, :cond_6

    goto :goto_1

    .line 14
    :cond_6
    invoke-virtual {v4}, Lcom/huawei/agconnect/apms/c1;->abc()V

    .line 15
    :cond_7
    invoke-virtual {v4, v0}, Lcom/huawei/agconnect/apms/c1;->abc(I)V

    goto :goto_1

    .line 16
    :cond_8
    sget-object v4, Lcom/huawei/agconnect/apms/e1;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v6, p2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v1

    const-string v7, "invalid cpu metrics collection frequency-%d. Did not report cpu metrics."

    invoke-static {v5, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 17
    :cond_9
    :goto_1
    invoke-static {}, Lcom/huawei/agconnect/apms/ghi;->def()Lcom/huawei/agconnect/apms/ghi;

    move-result-object v4

    .line 18
    iget-object v5, v4, Lcom/huawei/agconnect/apms/ghi;->abc:Landroid/os/Bundle;

    const-string v6, "collect_memory_frequency_fg_ms"

    invoke-virtual {v5, v6, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 19
    invoke-virtual {v4, v2}, Lcom/huawei/agconnect/apms/ghi;->abc(I)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_2

    :cond_a
    move v2, v1

    .line 20
    :goto_2
    invoke-static {v2}, Lcom/huawei/agconnect/apms/d1;->cde(I)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_3

    :cond_b
    move v3, v2

    :goto_3
    if-lez v3, :cond_c

    .line 21
    iget-object v2, p0, Lcom/huawei/agconnect/apms/e1;->cde:Lcom/huawei/agconnect/apms/d1;

    invoke-virtual {v2, v3}, Lcom/huawei/agconnect/apms/d1;->abc(I)V

    goto :goto_4

    .line 22
    :cond_c
    sget-object v2, Lcom/huawei/agconnect/apms/e1;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v5, p2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    const-string v6, "invalid memory metrics collection frequency-%d. Did not report memory metrics."

    invoke-static {v4, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    :goto_4
    int-to-long v4, v0

    const-wide/16 v6, -0x1

    cmp-long v2, v4, v6

    if-nez v2, :cond_d

    goto :goto_5

    .line 23
    :cond_d
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :goto_5
    int-to-long v2, v3

    cmp-long v0, v2, v6

    if-nez v0, :cond_e

    .line 24
    sget-object p1, Lcom/huawei/agconnect/apms/e1;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p2, "invalid resource collection frequency. Unable to start collecting resource metrics."

    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    return-void

    .line 25
    :cond_e
    iput-object p1, p0, Lcom/huawei/agconnect/apms/e1;->def:Lcom/huawei/agconnect/apms/util/Session;

    .line 26
    :try_start_0
    iget-object p1, p0, Lcom/huawei/agconnect/apms/e1;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/huawei/agconnect/apms/e1$abc;

    invoke-direct {v0, p0}, Lcom/huawei/agconnect/apms/e1$abc;-><init>(Lcom/huawei/agconnect/apms/e1;)V

    const-wide/16 v4, 0x14

    mul-long v6, v2, v4

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v2, p1

    move-object v3, v0

    move-wide v4, v6

    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/apms/e1;->efg:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception p1

    .line 27
    sget-object v0, Lcom/huawei/agconnect/apms/e1;->fgh:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v1

    const-string p1, "unable to start collecting metrics: %s"

    invoke-static {v2, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    :goto_6
    return-void
.end method

.method public bcd()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1;->def:Lcom/huawei/agconnect/apms/util/Session;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1;->bcd:Lcom/huawei/agconnect/apms/c1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/c1;->abc()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1;->cde:Lcom/huawei/agconnect/apms/d1;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/d1;->abc()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1;->efg:Ljava/util/concurrent/ScheduledFuture;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e1;->def:Lcom/huawei/agconnect/apms/util/Session;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/huawei/agconnect/apms/e1;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    new-instance v2, Lcom/huawei/agconnect/apms/e1$bcd;

    .line 29
    .line 30
    invoke-direct {v2, p0, v0}, Lcom/huawei/agconnect/apms/e1$bcd;-><init>(Lcom/huawei/agconnect/apms/e1;Lcom/huawei/agconnect/apms/util/Session;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    const-wide/16 v3, 0x14

    .line 36
    .line 37
    invoke-interface {v1, v2, v3, v4, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Lcom/huawei/agconnect/apms/e1;->def:Lcom/huawei/agconnect/apms/util/Session;

    .line 42
    .line 43
    return-void
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
