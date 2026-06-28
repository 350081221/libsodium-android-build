.class public Lcom/huawei/agconnect/apms/dcb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static final bcd:Ljava/util/concurrent/ScheduledExecutorService;

.field public static final cde:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static def:Ljava/util/concurrent/Future;

.field public static final efg:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/dcb;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;

    .line 8
    .line 9
    const-string v1, "HttpEventWaitReportQueue"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/huawei/agconnect/apms/dcb;->bcd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/huawei/agconnect/apms/dcb;->cde:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 26
    .line 27
    new-instance v0, Lcom/huawei/agconnect/apms/dcb$abc;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/dcb$abc;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/huawei/agconnect/apms/dcb;->efg:Ljava/lang/Runnable;

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

.method public static synthetic abc()V
    .locals 10

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3
    sget-object v3, Lcom/huawei/agconnect/apms/dcb;->cde:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 4
    instance-of v5, v4, Lcom/huawei/agconnect/apms/fed;

    if-eqz v5, :cond_1

    .line 5
    move-object v5, v4

    check-cast v5, Lcom/huawei/agconnect/apms/fed;

    .line 6
    invoke-virtual {v5}, Lcom/huawei/agconnect/apms/fed;->cde()J

    move-result-wide v6

    sub-long v6, v0, v6

    const-wide/16 v8, 0x2710

    cmp-long v6, v6, v8

    if-lez v6, :cond_0

    .line 7
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    invoke-virtual {v5}, Lcom/huawei/agconnect/apms/fed;->fgh()Z

    move-result v4

    if-nez v4, :cond_0

    .line 9
    invoke-virtual {v5}, Lcom/huawei/agconnect/apms/fed;->pqr()Lcom/huawei/agconnect/apms/gfe;

    move-result-object v4

    if-eqz v4, :cond_0

    const/4 v6, 0x1

    .line 10
    invoke-virtual {v5, v6}, Lcom/huawei/agconnect/apms/fed;->abc(Z)V

    .line 11
    new-instance v5, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    const-string v6, ""

    invoke-direct {v5, v4, v6}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;Ljava/lang/String;)V

    invoke-static {v5}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    goto :goto_0

    .line 12
    :cond_1
    sget-object v5, Lcom/huawei/agconnect/apms/dcb;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v6, "object is not a state of Http."

    invoke-interface {v5, v6}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 15
    sget-object v0, Lcom/huawei/agconnect/apms/dcb;->cde:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->removeAll(Ljava/util/Collection;)Z

    :cond_3
    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;)V
    .locals 1

    .line 17
    sget-object v0, Lcom/huawei/agconnect/apms/dcb;->cde:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static abc(Ljava/lang/Object;)V
    .locals 1

    .line 16
    sget-object v0, Lcom/huawei/agconnect/apms/dcb;->cde:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method
