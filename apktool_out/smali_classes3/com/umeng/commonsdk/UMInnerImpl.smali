.class public Lcom/umeng/commonsdk/UMInnerImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static isInternal:Z = false


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

.method public static declared-synchronized initAndSendInternal(Landroid/content/Context;)V
    .locals 6

    .line 1
    const-class v0, Lcom/umeng/commonsdk/UMInnerImpl;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    sget-boolean v2, Lcom/umeng/commonsdk/UMInnerImpl;->isInternal:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Ljava/lang/Thread;

    .line 12
    .line 13
    new-instance v3, Lcom/umeng/commonsdk/UMInnerImpl$2;

    .line 14
    .line 15
    invoke-direct {v3, p0}, Lcom/umeng/commonsdk/UMInnerImpl$2;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 22
    .line 23
    .line 24
    sput-boolean v1, Lcom/umeng/commonsdk/UMInnerImpl;->isInternal:Z

    .line 25
    .line 26
    invoke-static {p0}, Lcom/umeng/commonsdk/UMInnerImpl;->sendInternal(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v2

    .line 31
    :try_start_1
    const-string v3, "internal"

    .line 32
    .line 33
    new-array v1, v1, [Ljava/lang/Object;

    .line 34
    .line 35
    new-instance v4, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v5, "e is "

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const/4 v5, 0x0

    .line 57
    aput-object v4, v1, v5

    .line 58
    .line 59
    invoke-static {v3, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v2}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    monitor-exit v0

    .line 68
    throw p0

    .line 69
    :cond_0
    :goto_0
    monitor-exit v0

    .line 70
    return-void
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

.method private static declared-synchronized sendInternal(Landroid/content/Context;)V
    .locals 6

    .line 1
    const-class v0, Lcom/umeng/commonsdk/UMInnerImpl;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    new-instance v2, Ljava/lang/Thread;

    .line 8
    .line 9
    new-instance v3, Lcom/umeng/commonsdk/UMInnerImpl$1;

    .line 10
    .line 11
    invoke-direct {v3, p0}, Lcom/umeng/commonsdk/UMInnerImpl$1;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 18
    .line 19
    .line 20
    sput-boolean v1, Lcom/umeng/commonsdk/UMInnerImpl;->isInternal:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v2

    .line 24
    :try_start_1
    const-string v3, "internal"

    .line 25
    .line 26
    new-array v1, v1, [Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v5, "e is "

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const/4 v5, 0x0

    .line 50
    aput-object v4, v1, v5

    .line 51
    .line 52
    invoke-static {v3, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_1
    move-exception p0

    .line 60
    monitor-exit v0

    .line 61
    throw p0

    .line 62
    :cond_0
    :goto_0
    monitor-exit v0

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
.end method
