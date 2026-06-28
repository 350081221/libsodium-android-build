.class public Lcom/huawei/agconnect/apms/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final mno:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static volatile nop:Lcom/huawei/agconnect/apms/v0;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/n0;

.field public bcd:Ljava/lang/String;

.field public cde:J

.field public def:J

.field public efg:J

.field public fgh:J

.field public ghi:J

.field public hij:J

.field public ijk:J

.field public jkl:J

.field public klm:J

.field public lmn:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/v0;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/huawei/agconnect/apms/n0;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/n0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    .line 10
    .line 11
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getCreateTime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->cde:J

    .line 16
    .line 17
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getCreateTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->def:J

    .line 22
    .line 23
    return-void
.end method

.method public static ijk()Lcom/huawei/agconnect/apms/v0;
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/v0;->nop:Lcom/huawei/agconnect/apms/v0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/huawei/agconnect/apms/v0;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/v0;->nop:Lcom/huawei/agconnect/apms/v0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/huawei/agconnect/apms/v0;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/huawei/agconnect/apms/v0;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/huawei/agconnect/apms/v0;->nop:Lcom/huawei/agconnect/apms/v0;

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
    sget-object v0, Lcom/huawei/agconnect/apms/v0;->nop:Lcom/huawei/agconnect/apms/v0;

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
.method public final abc(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    .line 2
    :catchall_0
    sget-object p1, Lcom/huawei/agconnect/apms/v0;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "getApplicationClassName fail"

    invoke-interface {p1, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    return-object v0
.end method

.method public abc()V
    .locals 2

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->ijk:J

    .line 23
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->abc()V

    :cond_0
    return-void
.end method

.method public abc(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/v0;->abc(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 6
    iget p2, p2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 7
    invoke-direct {v1, p1, p2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 8
    iget-object p1, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p1, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    :goto_0
    return-void
.end method

.method public abc(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->hij:J

    .line 11
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_2

    .line 12
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/v0;->efg:J

    cmp-long v0, v1, v3

    if-nez v0, :cond_0

    .line 13
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->hij:J

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->cde:J

    .line 14
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    sget-object v1, Lcom/huawei/agconnect/apms/g0;->bcd:Lcom/huawei/agconnect/apms/g0;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/n0;->abc(Lcom/huawei/agconnect/apms/g0;)V

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 16
    iget p2, p2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 17
    invoke-direct {v1, p1, p2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 18
    iget-object p1, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p1, :cond_1

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    goto :goto_0

    .line 20
    :cond_2
    iget-wide p1, p0, Lcom/huawei/agconnect/apms/v0;->cde:J

    cmp-long p1, v1, p1

    if-nez p1, :cond_3

    .line 21
    iget-wide p1, p0, Lcom/huawei/agconnect/apms/v0;->hij:J

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/v0;->cde:J

    :cond_3
    :goto_0
    return-void
.end method

.method public bcd()V
    .locals 5

    const/4 v0, 0x0

    .line 20
    :try_start_0
    sget-boolean v1, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    if-eqz v1, :cond_0

    .line 21
    iget-object v1, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    invoke-virtual {v1}, Lcom/huawei/agconnect/apms/n0;->abc()V

    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/v0;->ghi()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 23
    :try_start_1
    sget-object v2, Lcom/huawei/agconnect/apms/v0;->mno:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "application trace error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :goto_0
    sput-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 25
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/v0;->hij()V

    return-void

    .line 26
    :goto_1
    sput-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->isBackground:Z

    .line 27
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/v0;->hij()V

    .line 28
    throw v1
.end method

.method public bcd(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->efg:J

    .line 2
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->cde:J

    .line 3
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    sget-object v1, Lcom/huawei/agconnect/apms/g0;->bcd:Lcom/huawei/agconnect/apms/g0;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/n0;->abc(Lcom/huawei/agconnect/apms/g0;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/v0;->abc(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 6
    iget p2, p2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 7
    invoke-direct {v1, p1, p2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 8
    iget-object p1, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p1, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    :goto_0
    return-void
.end method

.method public bcd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 10
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->jkl:J

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->jkl:J

    .line 12
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->cde:J

    .line 13
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    if-eqz v0, :cond_2

    .line 14
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    sget-object v1, Lcom/huawei/agconnect/apms/g0;->bcd:Lcom/huawei/agconnect/apms/g0;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/n0;->abc(Lcom/huawei/agconnect/apms/g0;)V

    .line 15
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 16
    iget p2, p2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 17
    invoke-direct {v1, p1, p2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 18
    iget-object p1, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p1, :cond_1

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public cde()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->abc()V

    :cond_0
    return-void
.end method

.method public cde(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/v0;->bcd:Ljava/lang/String;

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 8
    iget p2, p2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 9
    invoke-direct {v1, p1, p2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 10
    iget-object p1, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p1, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public def()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->ghi:J

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->abc()V

    return-void
.end method

.method public def(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    new-instance v1, Lcom/huawei/agconnect/apms/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/huawei/agconnect/apms/i0;->bcd:Lcom/huawei/agconnect/apms/i0;

    .line 6
    iget p2, p2, Lcom/huawei/agconnect/apms/i0;->abc:I

    .line 7
    invoke-direct {v1, p1, p2}, Lcom/huawei/agconnect/apms/c;-><init>(Ljava/lang/String;I)V

    .line 8
    iget-object p1, v0, Lcom/huawei/agconnect/apms/n0;->abc:Lcom/huawei/agconnect/apms/m0;

    if-nez p1, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/m0;->cde(Lcom/huawei/agconnect/apms/c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public efg()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->fgh:J

    .line 6
    .line 7
    iget-object v0, p0, Lcom/huawei/agconnect/apms/v0;->abc:Lcom/huawei/agconnect/apms/n0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/n0;->abc()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final fgh()J
    .locals 5

    .line 1
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/v0;->efg:J

    .line 8
    .line 9
    cmp-long v0, v1, v3

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->lmn:J

    .line 14
    .line 15
    sub-long/2addr v0, v3

    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/v0;->def:J

    .line 18
    .line 19
    cmp-long v0, v1, v3

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->lmn:J

    .line 24
    .line 25
    iget-wide v2, p0, Lcom/huawei/agconnect/apms/v0;->cde:J

    .line 26
    .line 27
    sub-long/2addr v0, v2

    .line 28
    return-wide v0

    .line 29
    :cond_1
    iget-wide v3, p0, Lcom/huawei/agconnect/apms/v0;->hij:J

    .line 30
    .line 31
    cmp-long v0, v1, v3

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->lmn:J

    .line 36
    .line 37
    iget-wide v2, p0, Lcom/huawei/agconnect/apms/v0;->jkl:J

    .line 38
    .line 39
    sub-long/2addr v0, v2

    .line 40
    return-wide v0

    .line 41
    :cond_2
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->lmn:J

    .line 42
    .line 43
    sub-long/2addr v0, v3

    .line 44
    return-wide v0
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

.method public final ghi()V
    .locals 23

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->lmn:J

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/agconnect/apms/v0;->fgh()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-lez v4, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->bcd()Lcom/huawei/agconnect/apms/wxy;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iget-wide v4, v4, Lcom/huawei/agconnect/apms/wxy;->fgh:J

    .line 24
    .line 25
    cmp-long v0, v0, v4

    .line 26
    .line 27
    if-gez v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    if-nez v0, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-wide v4, v14, Lcom/huawei/agconnect/apms/v0;->cde:J

    .line 36
    .line 37
    iget-object v6, v14, Lcom/huawei/agconnect/apms/v0;->bcd:Ljava/lang/String;

    .line 38
    .line 39
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->efg:J

    .line 44
    .line 45
    cmp-long v0, v2, v0

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->def:J

    .line 51
    .line 52
    cmp-long v0, v2, v0

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    :goto_1
    const-string v0, "cold_start"

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const-string v0, "hot_start"

    .line 60
    .line 61
    :goto_2
    move-object v7, v0

    .line 62
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/agconnect/apms/v0;->fgh()J

    .line 63
    .line 64
    .line 65
    move-result-wide v8

    .line 66
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->efg:J

    .line 67
    .line 68
    cmp-long v10, v2, v0

    .line 69
    .line 70
    if-nez v10, :cond_4

    .line 71
    .line 72
    const-wide/16 v11, -0x1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    iget-wide v11, v14, Lcom/huawei/agconnect/apms/v0;->fgh:J

    .line 76
    .line 77
    sub-long/2addr v11, v0

    .line 78
    :goto_3
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->fgh:J

    .line 79
    .line 80
    cmp-long v10, v2, v0

    .line 81
    .line 82
    if-nez v10, :cond_5

    .line 83
    .line 84
    const-wide/16 v17, -0x1

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    iget-wide v2, v14, Lcom/huawei/agconnect/apms/v0;->ghi:J

    .line 88
    .line 89
    sub-long/2addr v2, v0

    .line 90
    move-wide/from16 v17, v2

    .line 91
    .line 92
    :goto_4
    sget-boolean v0, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->selfApplication:Z

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->ghi:J

    .line 97
    .line 98
    const-wide/16 v2, 0x0

    .line 99
    .line 100
    cmp-long v10, v2, v0

    .line 101
    .line 102
    if-eqz v10, :cond_7

    .line 103
    .line 104
    iget-wide v2, v14, Lcom/huawei/agconnect/apms/v0;->ijk:J

    .line 105
    .line 106
    sub-long/2addr v2, v0

    .line 107
    move-wide v15, v11

    .line 108
    move-wide v12, v2

    .line 109
    const-wide/16 v2, 0x0

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_6
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->def:J

    .line 113
    .line 114
    const-wide/16 v2, 0x0

    .line 115
    .line 116
    cmp-long v0, v2, v0

    .line 117
    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->ijk:J

    .line 121
    .line 122
    iget-wide v2, v14, Lcom/huawei/agconnect/apms/v0;->cde:J

    .line 123
    .line 124
    sub-long/2addr v0, v2

    .line 125
    move-wide v15, v11

    .line 126
    const-wide/16 v2, 0x0

    .line 127
    .line 128
    :goto_5
    move-wide v12, v0

    .line 129
    goto :goto_7

    .line 130
    :cond_7
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->hij:J

    .line 131
    .line 132
    const-wide/16 v2, 0x0

    .line 133
    .line 134
    cmp-long v10, v2, v0

    .line 135
    .line 136
    move-wide v15, v11

    .line 137
    if-eqz v10, :cond_9

    .line 138
    .line 139
    iget-wide v10, v14, Lcom/huawei/agconnect/apms/v0;->ijk:J

    .line 140
    .line 141
    cmp-long v12, v2, v10

    .line 142
    .line 143
    if-nez v12, :cond_8

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_8
    sub-long/2addr v10, v0

    .line 147
    move-wide v12, v10

    .line 148
    goto :goto_7

    .line 149
    :cond_9
    :goto_6
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->klm:J

    .line 150
    .line 151
    iget-wide v10, v14, Lcom/huawei/agconnect/apms/v0;->jkl:J

    .line 152
    .line 153
    sub-long/2addr v0, v10

    .line 154
    goto :goto_5

    .line 155
    :goto_7
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->hij:J

    .line 156
    .line 157
    cmp-long v0, v2, v0

    .line 158
    .line 159
    if-nez v0, :cond_a

    .line 160
    .line 161
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->lmn:J

    .line 162
    .line 163
    iget-wide v2, v14, Lcom/huawei/agconnect/apms/v0;->klm:J

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_a
    iget-wide v0, v14, Lcom/huawei/agconnect/apms/v0;->lmn:J

    .line 167
    .line 168
    iget-wide v2, v14, Lcom/huawei/agconnect/apms/v0;->ijk:J

    .line 169
    .line 170
    :goto_8
    sub-long/2addr v0, v2

    .line 171
    move-wide/from16 v19, v0

    .line 172
    .line 173
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getExecutor()Ljava/util/concurrent/ExecutorService;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    new-instance v11, Lcom/huawei/agconnect/apms/v0$abc;

    .line 178
    .line 179
    move-object v0, v11

    .line 180
    move-object/from16 v1, p0

    .line 181
    .line 182
    move-wide v2, v4

    .line 183
    move-object v4, v6

    .line 184
    move-object v5, v7

    .line 185
    move-wide v6, v8

    .line 186
    move-wide v8, v15

    .line 187
    move-object v15, v10

    .line 188
    move-object/from16 v21, v11

    .line 189
    .line 190
    move-wide/from16 v10, v17

    .line 191
    .line 192
    move-object/from16 v22, v15

    .line 193
    .line 194
    move-wide/from16 v14, v19

    .line 195
    .line 196
    invoke-direct/range {v0 .. v15}, Lcom/huawei/agconnect/apms/v0$abc;-><init>(Lcom/huawei/agconnect/apms/v0;JLjava/lang/String;Ljava/lang/String;JJJJJ)V

    .line 197
    .line 198
    .line 199
    move-object/from16 v1, v21

    .line 200
    .line 201
    move-object/from16 v0, v22

    .line 202
    .line 203
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 204
    .line 205
    .line 206
    return-void
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method

.method public final hij()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->def:J

    .line 4
    .line 5
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->cde:J

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->efg:J

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->fgh:J

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->ghi:J

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->hij:J

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->ijk:J

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->lmn:J

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->jkl:J

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/v0;->klm:J

    .line 22
    .line 23
    return-void
.end method
