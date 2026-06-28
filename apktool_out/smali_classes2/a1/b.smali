.class public La1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J = 0xbb8L

.field public static b:J = -0x1L


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Z
    .locals 7

    .line 1
    const-class v0, La1/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    sget-wide v3, La1/b;->b:J

    .line 9
    .line 10
    sub-long v3, v1, v3

    .line 11
    .line 12
    const-wide/16 v5, 0xbb8

    .line 13
    .line 14
    cmp-long v3, v3, v5

    .line 15
    .line 16
    if-ltz v3, :cond_0

    .line 17
    .line 18
    sput-wide v1, La1/b;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    const/4 v0, 0x0

    .line 22
    return v0

    .line 23
    :cond_0
    monitor-exit v0

    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    monitor-exit v0

    .line 28
    throw v1
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
