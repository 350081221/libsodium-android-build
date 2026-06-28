.class public Lcom/huawei/agconnect/apms/nop;
.super Lcom/huawei/agconnect/apms/lmn;
.source "SourceFile"


# static fields
.field public static ghi:Lcom/huawei/agconnect/apms/nop;


# instance fields
.field public efg:Landroid/os/FileObserver;

.field public fgh:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/lmn;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/huawei/agconnect/apms/nop;->efg:Landroid/os/FileObserver;

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/nop;->fgh:J

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/huawei/agconnect/apms/lmn;->bcd:Ljava/util/Set;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static synthetic abc(Lcom/huawei/agconnect/apms/nop;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/nop;->bcd()V

    return-void
.end method

.method public static declared-synchronized cde()Lcom/huawei/agconnect/apms/nop;
    .locals 2

    .line 1
    const-class v0, Lcom/huawei/agconnect/apms/nop;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/nop;->ghi:Lcom/huawei/agconnect/apms/nop;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/huawei/agconnect/apms/nop;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/nop;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/huawei/agconnect/apms/nop;->ghi:Lcom/huawei/agconnect/apms/nop;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Lcom/huawei/agconnect/apms/nop;->ghi:Lcom/huawei/agconnect/apms/nop;
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
.method public abc(Z)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 3
    :cond_1
    :goto_0
    sget-object p1, Lcom/huawei/agconnect/apms/lmn;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v0, "APMS agent or anr monitor is disabled, please enable."

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public final bcd()V
    .locals 6

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->isDisabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-wide v2, p0, Lcom/huawei/agconnect/apms/nop;->fgh:J

    .line 13
    .line 14
    sub-long v2, v0, v2

    .line 15
    .line 16
    const-wide/16 v4, 0x3a98

    .line 17
    .line 18
    cmp-long v2, v2, v4

    .line 19
    .line 20
    if-gez v2, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const-string v2, ""

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lcom/huawei/agconnect/apms/lmn;->abc(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/nop;->fgh:J

    .line 33
    .line 34
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
