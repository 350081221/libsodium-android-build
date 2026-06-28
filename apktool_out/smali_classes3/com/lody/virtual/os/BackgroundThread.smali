.class public final Lcom/lody/virtual/os/BackgroundThread;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# static fields
.field private static sHandler:Landroid/os/Handler;

.field private static sInstance:Lcom/lody/virtual/os/BackgroundThread;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "va.android.bg"

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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

.method private static ensureThreadLocked()V
    .locals 2

    .line 1
    sget-object v0, Lcom/lody/virtual/os/BackgroundThread;->sInstance:Lcom/lody/virtual/os/BackgroundThread;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/lody/virtual/os/BackgroundThread;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/lody/virtual/os/BackgroundThread;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/lody/virtual/os/BackgroundThread;->sInstance:Lcom/lody/virtual/os/BackgroundThread;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    sget-object v1, Lcom/lody/virtual/os/BackgroundThread;->sInstance:Lcom/lody/virtual/os/BackgroundThread;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/lody/virtual/os/BackgroundThread;->sHandler:Landroid/os/Handler;

    .line 27
    .line 28
    :cond_0
    return-void
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

.method public static get()Lcom/lody/virtual/os/BackgroundThread;
    .locals 2

    .line 1
    const-class v0, Lcom/lody/virtual/os/BackgroundThread;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/os/BackgroundThread;->ensureThreadLocked()V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lcom/lody/virtual/os/BackgroundThread;->sInstance:Lcom/lody/virtual/os/BackgroundThread;

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object v1

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw v1
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

.method public static getHandler()Landroid/os/Handler;
    .locals 2

    .line 1
    const-class v0, Lcom/lody/virtual/os/BackgroundThread;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/os/BackgroundThread;->ensureThreadLocked()V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lcom/lody/virtual/os/BackgroundThread;->sHandler:Landroid/os/Handler;

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object v1

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw v1
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
