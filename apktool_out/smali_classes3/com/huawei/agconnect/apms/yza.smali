.class public Lcom/huawei/agconnect/apms/yza;
.super Lcom/huawei/agconnect/apms/vwx;
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
    sput-object v0, Lcom/huawei/agconnect/apms/yza;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;

    .line 8
    .line 9
    const-string v1, "CollectQueue"

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
    sput-object v0, Lcom/huawei/agconnect/apms/yza;->bcd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/huawei/agconnect/apms/yza;->cde:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 26
    .line 27
    new-instance v0, Lcom/huawei/agconnect/apms/yza$abc;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/yza$abc;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/huawei/agconnect/apms/yza;->efg:Ljava/lang/Runnable;

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

.method public static abc(Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/yza;->cde:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method
