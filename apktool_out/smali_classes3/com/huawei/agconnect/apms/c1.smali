.class public Lcom/huawei/agconnect/apms/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static final hij:J

.field public static ijk:Lcom/huawei/agconnect/apms/c1;


# instance fields
.field public abc:Ljava/util/concurrent/ScheduledExecutorService;

.field public bcd:Ljava/util/concurrent/ScheduledFuture;

.field public cde:J

.field public def:Ljava/lang/String;

.field public efg:J

.field public fgh:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/huawei/agconnect/apms/g1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    const-wide/16 v1, 0x1

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/huawei/agconnect/apms/c1;->hij:J

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/huawei/agconnect/apms/c1;->bcd:Ljava/util/concurrent/ScheduledFuture;

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/c1;->cde:J

    .line 10
    .line 11
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    aput-object v2, v1, v3

    .line 26
    .line 27
    const-string v2, "/proc/%s/stat"

    .line 28
    .line 29
    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/huawei/agconnect/apms/c1;->def:Ljava/lang/String;

    .line 34
    .line 35
    sget v0, Landroid/system/OsConstants;->_SC_CLK_TCK:I

    .line 36
    .line 37
    invoke-static {v0}, Landroid/system/Os;->sysconf(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/c1;->efg:J

    .line 42
    .line 43
    new-instance v0, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;

    .line 44
    .line 45
    const-string v1, "CPUCollector"

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/huawei/agconnect/apms/c1;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    .line 55
    .line 56
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/huawei/agconnect/apms/c1;->fgh:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 62
    .line 63
    return-void
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

.method public static synthetic abc(Lcom/huawei/agconnect/apms/c1;J)Lcom/huawei/agconnect/apms/g1;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/huawei/agconnect/apms/c1;->abc(J)Lcom/huawei/agconnect/apms/g1;

    move-result-object p0

    return-object p0
.end method

.method public static bcd(I)Z
    .locals 0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final abc(J)Lcom/huawei/agconnect/apms/g1;
    .locals 23

    move-object/from16 v1, p0

    const-string v2, "unable to close read \'proc/[pid]/stat\' file: %s"

    const/4 v5, 0x1

    .line 9
    :try_start_0
    new-instance v6, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/FileReader;

    iget-object v7, v1, Lcom/huawei/agconnect/apms/c1;->def:Ljava/lang/String;

    invoke-direct {v0, v7}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 10
    :try_start_1
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_0

    goto :goto_2

    :cond_0
    const-string v7, " "

    .line 12
    invoke-virtual {v0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 13
    array-length v7, v0

    const/16 v8, 0x10

    if-ge v8, v7, :cond_1

    const/16 v7, 0xd

    .line 14
    aget-object v7, v0, v7

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    const/16 v7, 0xf

    .line 15
    aget-object v7, v0, v7

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    const/16 v7, 0xe

    .line 16
    aget-object v7, v0, v7

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13

    .line 17
    aget-object v0, v0, v8

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    goto :goto_0

    :cond_1
    const-wide/16 v9, 0x0

    move-wide v7, v9

    move-wide v11, v7

    move-wide v13, v11

    .line 18
    :goto_0
    new-instance v22, Lcom/huawei/agconnect/apms/g1;

    add-long/2addr v9, v11

    long-to-double v9, v9

    .line 19
    iget-wide v11, v1, Lcom/huawei/agconnect/apms/c1;->efg:J

    long-to-double v11, v11

    div-double/2addr v9, v11

    sget-wide v11, Lcom/huawei/agconnect/apms/c1;->hij:J

    long-to-double v3, v11

    mul-double/2addr v9, v3

    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    move-result-wide v18

    add-long/2addr v13, v7

    long-to-double v3, v13

    .line 20
    iget-wide v7, v1, Lcom/huawei/agconnect/apms/c1;->efg:J

    long-to-double v7, v7

    div-double/2addr v3, v7

    long-to-double v7, v11

    mul-double/2addr v3, v7

    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    move-result-wide v20

    move-object/from16 v15, v22

    move-wide/from16 v16, p1

    .line 21
    invoke-direct/range {v15 .. v21}, Lcom/huawei/agconnect/apms/g1;-><init>(JJJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 22
    :try_start_2
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 23
    :try_start_3
    sget-object v0, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v6, v5, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    aput-object v3, v6, v7

    invoke-static {v4, v2, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    :goto_1
    return-object v22

    .line 24
    :cond_2
    :goto_2
    :try_start_4
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    const/4 v2, 0x0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v0

    .line 25
    :try_start_5
    sget-object v0, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v6, v5, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    aput-object v3, v6, v7

    invoke-static {v4, v2, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    goto :goto_3

    :goto_4
    return-object v2

    :catchall_2
    move-exception v0

    .line 26
    :try_start_6
    sget-object v3, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    const-string v7, "unable to read \'proc/[pid]/stat\' file: %s"

    :try_start_7
    new-array v8, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    aput-object v0, v8, v9

    invoke-static {v4, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 27
    :try_start_8
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v3, v0

    .line 28
    :try_start_9
    sget-object v0, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v6, v5, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    aput-object v3, v6, v7

    invoke-static {v4, v2, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    goto :goto_6

    :catchall_4
    move-exception v0

    move-object v3, v0

    .line 29
    :try_start_a
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object v4, v0

    .line 30
    :try_start_b
    sget-object v0, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v7, v5, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    aput-object v4, v7, v8

    invoke-static {v6, v2, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 31
    :goto_5
    throw v3
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :catchall_6
    move-exception v0

    .line 32
    sget-object v2, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const-string v0, "unexpected \'/proc/[pid]/stat\' file format encountered: %s"

    invoke-static {v3, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    goto :goto_6

    .line 33
    :catch_0
    sget-object v0, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "unable to read \'proc/[pid]/stat\' file"

    invoke-interface {v0, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    :goto_6
    const/4 v2, 0x0

    return-object v2
.end method

.method public abc()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/c1;->bcd:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 3
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/huawei/agconnect/apms/c1;->bcd:Ljava/util/concurrent/ScheduledFuture;

    const-wide/16 v0, -0x1

    .line 5
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/c1;->cde:J

    return-void
.end method

.method public final declared-synchronized abc(I)V
    .locals 7

    monitor-enter p0

    int-to-long v4, p1

    .line 6
    :try_start_0
    iput-wide v4, p0, Lcom/huawei/agconnect/apms/c1;->cde:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/c1;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/huawei/agconnect/apms/c1$abc;

    invoke-direct {v1, p0}, Lcom/huawei/agconnect/apms/c1$abc;-><init>(Lcom/huawei/agconnect/apms/c1;)V

    const-wide/16 v2, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/apms/c1;->bcd:Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    :try_start_2
    sget-object v0, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const-string p1, "unable to start collecting cpu metrics: %s"

    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized bcd()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/c1;->abc:Ljava/util/concurrent/ScheduledExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/huawei/agconnect/apms/c1$bcd;

    .line 5
    .line 6
    invoke-direct {v1, p0}, Lcom/huawei/agconnect/apms/c1$bcd;-><init>(Lcom/huawei/agconnect/apms/c1;)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    invoke-interface {v0, v1, v3, v4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :catch_0
    move-exception v0

    .line 20
    :try_start_1
    sget-object v1, Lcom/huawei/agconnect/apms/c1;->ghi:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 21
    .line 22
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    new-array v3, v3, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v4, 0x0

    .line 32
    aput-object v0, v3, v4

    .line 33
    .line 34
    const-string v0, "unable to start collecting cpu metrics: %s"

    .line 35
    .line 36
    invoke-static {v2, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    :goto_0
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit p0

    .line 46
    throw v0
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
