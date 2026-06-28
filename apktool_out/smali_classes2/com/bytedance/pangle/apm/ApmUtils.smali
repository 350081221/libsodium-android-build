.class public Lcom/bytedance/pangle/apm/ApmUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field public static final FLAG_ANR_MONITOR:I = 0x2

.field public static final FLAG_JAVA_CRASH:I = 0x1

.field public static final FLAG_NATIVE_CRASH:I = 0x4

.field public static final FLAG_REGISTER_JAVA_CRASH:I = 0x8

.field private static volatile sApm:Lcom/bytedance/pangle/apm/AbsApm;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getApmInstance()Lcom/bytedance/pangle/apm/AbsApm;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/pangle/apm/ApmUtils;->sApm:Lcom/bytedance/pangle/apm/AbsApm;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/bytedance/pangle/apm/AbsApm;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/bytedance/pangle/apm/ApmUtils;->sApm:Lcom/bytedance/pangle/apm/AbsApm;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/bytedance/pangle/apm/ApmUtils$1;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/bytedance/pangle/apm/ApmUtils$1;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/bytedance/pangle/apm/ApmUtils;->sApm:Lcom/bytedance/pangle/apm/AbsApm;

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
    sget-object v0, Lcom/bytedance/pangle/apm/ApmUtils;->sApm:Lcom/bytedance/pangle/apm/AbsApm;

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
.end method

.method public static declared-synchronized register(Lcom/bytedance/pangle/apm/AbsApm;)V
    .locals 1

    .line 1
    const-class v0, Lcom/bytedance/pangle/apm/ApmUtils;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sput-object p0, Lcom/bytedance/pangle/apm/ApmUtils;->sApm:Lcom/bytedance/pangle/apm/AbsApm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0

    .line 10
    throw p0
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
    .line 24
.end method
