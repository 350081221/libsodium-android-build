.class public Lcom/efs/sdk/h5pagesdk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "com.efs.sdk.h5pagesdk.a"

.field private static volatile i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private static j:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/efs/sdk/h5pagesdk/a$1;

    invoke-direct {v0}, Lcom/efs/sdk/h5pagesdk/a$1;-><init>()V

    sput-object v0, Lcom/efs/sdk/h5pagesdk/a;->j:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 4

    .line 1
    sget-object v0, Lcom/efs/sdk/h5pagesdk/a;->i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/efs/sdk/h5pagesdk/a;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/efs/sdk/h5pagesdk/a;->i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 13
    .line 14
    sget-object v2, Lcom/efs/sdk/h5pagesdk/a;->j:Ljava/util/concurrent/ThreadFactory;

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    invoke-direct {v1, v3, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/efs/sdk/h5pagesdk/a;->i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1

    .line 27
    :cond_1
    :goto_0
    sget-object v0, Lcom/efs/sdk/h5pagesdk/a;->i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 28
    .line 29
    return-object v0
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
.end method

.method public static execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/efs/sdk/h5pagesdk/a;->a()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
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
.end method
