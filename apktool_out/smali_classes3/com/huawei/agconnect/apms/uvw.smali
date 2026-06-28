.class public Lcom/huawei/agconnect/apms/uvw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final efg:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static fgh:Lcom/huawei/agconnect/apms/uvw;

.field public static final ghi:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/huawei/agconnect/apms/xyz;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/zyx;

.field public bcd:Lcom/huawei/agconnect/apms/zab;

.field public cde:Lcom/huawei/agconnect/apms/collect/model/CollectData;

.field public def:Lcom/huawei/agconnect/apms/wxy;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/uvw;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/agconnect/apms/uvw;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/uvw;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/huawei/agconnect/apms/uvw;->ghi:Ljava/util/Collection;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/huawei/agconnect/apms/wxy;->cde()Lcom/huawei/agconnect/apms/wxy;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/huawei/agconnect/apms/uvw;->def:Lcom/huawei/agconnect/apms/wxy;

    .line 9
    .line 10
    return-void
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

.method public static abc(Lcom/huawei/agconnect/apms/collect/model/event/Event;Lcom/huawei/agconnect/apms/collect/model/event/Events;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/huawei/agconnect/apms/collect/model/event/Event;",
            ">(TT;",
            "Lcom/huawei/agconnect/apms/collect/model/event/Events<",
            "TT;>;)V"
        }
    .end annotation

    .line 20
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->cde()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 21
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    .line 22
    iget v0, v0, Lcom/huawei/agconnect/apms/zyx;->abc:I

    const/4 v2, 0x4

    const/4 v3, 0x1

    if-ne v2, v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move v1, v3

    :cond_1
    if-eqz v1, :cond_2

    return-void

    .line 23
    :cond_2
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 24
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->def:Lcom/huawei/agconnect/apms/wxy;

    .line 25
    iget v0, v0, Lcom/huawei/agconnect/apms/wxy;->cde:I

    .line 26
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/collect/model/event/Events;->count()I

    move-result v1

    if-lt v1, v0, :cond_3

    .line 27
    sget-object p1, Lcom/huawei/agconnect/apms/uvw;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Collector: events count limitation "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " reached, "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " dropped."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    return-void

    .line 28
    :cond_3
    invoke-virtual {p1, p0}, Lcom/huawei/agconnect/apms/collect/model/event/Events;->add(Lcom/huawei/agconnect/apms/collect/model/event/Event;)V

    .line 29
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "Collector: now contains ["

    invoke-static {v1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/collect/model/event/Events;->count()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "] "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/wxy;)V
    .locals 5

    .line 13
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->cde()Z

    move-result v0

    if-nez v0, :cond_0

    .line 14
    sget-object p0, Lcom/huawei/agconnect/apms/uvw;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v0, "Collector: cannot configure Collector before initialization."

    invoke-interface {p0, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 15
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 16
    iget-object v1, v0, Lcom/huawei/agconnect/apms/uvw;->def:Lcom/huawei/agconnect/apms/wxy;

    invoke-virtual {v1, p0}, Lcom/huawei/agconnect/apms/wxy;->abc(Lcom/huawei/agconnect/apms/wxy;)V

    .line 17
    iget-object p0, v0, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, v0, Lcom/huawei/agconnect/apms/uvw;->def:Lcom/huawei/agconnect/apms/wxy;

    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/wxy;->abc()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    .line 18
    iput-wide v1, p0, Lcom/huawei/agconnect/apms/zab;->cde:J

    .line 19
    iget-object p0, v0, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->def:Lcom/huawei/agconnect/apms/wxy;

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/zyx;->abc(Lcom/huawei/agconnect/apms/wxy;)V

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/xyz;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->cde()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->ghi:Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 3
    invoke-static {p0}, Lcom/huawei/agconnect/apms/uvw;->bcd(Lcom/huawei/agconnect/apms/xyz;)V

    :cond_2
    return-void

    .line 4
    :cond_3
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 5
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    .line 6
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/apms/zyx;->abc(Lcom/huawei/agconnect/apms/xyz;)V

    return-void
.end method

.method public static bcd()Lcom/huawei/agconnect/apms/wxy;
    .locals 1

    .line 2
    invoke-static {}, Lcom/huawei/agconnect/apms/uvw;->cde()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/huawei/agconnect/apms/wxy;->cde()Lcom/huawei/agconnect/apms/wxy;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 5
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->def:Lcom/huawei/agconnect/apms/wxy;

    return-object v0
.end method

.method public static declared-synchronized bcd(Lcom/huawei/agconnect/apms/xyz;)V
    .locals 2

    const-class v0, Lcom/huawei/agconnect/apms/uvw;

    monitor-enter v0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    .line 1
    :cond_0
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/uvw;->ghi:Ljava/util/Collection;

    invoke-interface {v1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static cde()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->abc:Lcom/huawei/agconnect/apms/zyx;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
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

.method public static declared-synchronized def()V
    .locals 3

    .line 1
    const-class v0, Lcom/huawei/agconnect/apms/uvw;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    sget-object v2, Lcom/huawei/agconnect/apms/uvw;->ghi:Ljava/util/Collection;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/huawei/agconnect/apms/xyz;

    .line 26
    .line 27
    invoke-static {v2}, Lcom/huawei/agconnect/apms/uvw;->abc(Lcom/huawei/agconnect/apms/xyz;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object v1, Lcom/huawei/agconnect/apms/uvw;->ghi:Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Collection;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    monitor-exit v0

    .line 40
    throw v1
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

.method public static efg()V
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 11
    .line 12
    const-string v1, "the collect timer is null, can not stop timer."

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/zab;->cde()V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
.end method


# virtual methods
.method public final abc()V
    .locals 7

    .line 7
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->fgh:Lcom/huawei/agconnect/apms/uvw;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, v0, Lcom/huawei/agconnect/apms/uvw;->bcd:Lcom/huawei/agconnect/apms/zab;

    if-eqz v0, :cond_1

    .line 9
    iget-wide v3, v0, Lcom/huawei/agconnect/apms/zab;->fgh:J

    cmp-long v3, v3, v1

    if-nez v3, :cond_0

    move-wide v3, v1

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 11
    iget-wide v5, v0, Lcom/huawei/agconnect/apms/zab;->fgh:J

    sub-long/2addr v3, v5

    :goto_0
    cmp-long v0, v3, v1

    if-gez v0, :cond_2

    :cond_1
    move-wide v3, v1

    :cond_2
    cmp-long v0, v3, v1

    if-nez v0, :cond_3

    .line 12
    sget-object v0, Lcom/huawei/agconnect/apms/uvw;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v1, "Collector: session duration is invalid."

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
