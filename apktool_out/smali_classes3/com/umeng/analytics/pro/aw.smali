.class public Lcom/umeng/analytics/pro/aw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/umeng/analytics/pro/av; = null

.field private static b:Z = false


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

.method public static declared-synchronized a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    const-class v0, Lcom/umeng/analytics/pro/aw;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "MobclickRT"

    .line 5
    .line 6
    const-string v2, "--->>>*** real call OpenDeviceId.getOaid()"

    .line 7
    .line 8
    invoke-static {v1, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    invoke-static {p0}, Lcom/umeng/analytics/pro/aw;->b(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Lcom/umeng/analytics/pro/aw;->a:Lcom/umeng/analytics/pro/av;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    :try_start_1
    invoke-interface {v1, p0}, Lcom/umeng/analytics/pro/av;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    monitor-exit v0

    .line 35
    return-object p0

    .line 36
    :catch_0
    :cond_0
    monitor-exit v0

    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_1
    :try_start_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v1, "Cannot be called from the main thread"

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    .line 48
    .line 49
    const-string v1, "Context is null"

    .line 50
    .line 51
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    monitor-exit v0

    .line 57
    throw p0
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

.method private static b(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/umeng/analytics/pro/aw;->a:Lcom/umeng/analytics/pro/av;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-boolean v0, Lcom/umeng/analytics/pro/aw;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/umeng/analytics/pro/aw;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/aw;->a:Lcom/umeng/analytics/pro/av;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    sget-boolean v1, Lcom/umeng/analytics/pro/aw;->b:Z

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-static {p0}, Lcom/umeng/analytics/pro/ay;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/av;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sput-object p0, Lcom/umeng/analytics/pro/aw;->a:Lcom/umeng/analytics/pro/av;

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    sput-boolean p0, Lcom/umeng/analytics/pro/aw;->b:Z

    .line 28
    .line 29
    :cond_0
    monitor-exit v0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    return-void
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
