.class public Lcom/huawei/hms/api/FailedBinderCallBack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/api/FailedBinderCallBack$BinderCallBack;
    }
.end annotation


# static fields
.field private static final AGING_TIME:J = 0x2710L

.field public static final CALLER_ID:Ljava/lang/String; = "callId"

.field private static final LOCK_OBJECT:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String; = "FailedBinderCallBack"

.field private static binderCallBackMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/huawei/hms/api/FailedBinderCallBack$BinderCallBack;",
            ">;"
        }
    .end annotation
.end field

.field private static instance:Lcom/huawei/hms/api/FailedBinderCallBack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/huawei/hms/api/FailedBinderCallBack;->binderCallBackMap:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/huawei/hms/api/FailedBinderCallBack;->LOCK_OBJECT:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private agingCheck()V
    .locals 6

    .line 1
    new-instance v0, Ljava/sql/Timestamp;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/sql/Timestamp;->getTime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, 0x2710

    .line 15
    .line 16
    sub-long/2addr v0, v2

    .line 17
    sget-object v2, Lcom/huawei/hms/api/FailedBinderCallBack;->binderCallBackMap:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/Long;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    cmp-long v4, v0, v4

    .line 44
    .line 45
    if-ltz v4, :cond_0

    .line 46
    .line 47
    sget-object v4, Lcom/huawei/hms/api/FailedBinderCallBack;->binderCallBackMap:Ljava/util/Map;

    .line 48
    .line 49
    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-void
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

.method public static getInstance()Lcom/huawei/hms/api/FailedBinderCallBack;
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/hms/api/FailedBinderCallBack;->LOCK_OBJECT:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/huawei/hms/api/FailedBinderCallBack;->instance:Lcom/huawei/hms/api/FailedBinderCallBack;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/huawei/hms/api/FailedBinderCallBack;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/huawei/hms/api/FailedBinderCallBack;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/huawei/hms/api/FailedBinderCallBack;->instance:Lcom/huawei/hms/api/FailedBinderCallBack;

    .line 14
    .line 15
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    sget-object v0, Lcom/huawei/hms/api/FailedBinderCallBack;->instance:Lcom/huawei/hms/api/FailedBinderCallBack;

    .line 17
    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
    .line 22
    .line 23
.end method

.method private putCallBackInMap(Ljava/lang/Long;Lcom/huawei/hms/api/FailedBinderCallBack$BinderCallBack;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/hms/api/FailedBinderCallBack;->binderCallBackMap:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "FailedBinderCallBack"

    .line 6
    .line 7
    const-string p2, "binderCallBackMap is null"

    .line 8
    .line 9
    invoke-static {p1, p2}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hms/api/FailedBinderCallBack;->agingCheck()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/huawei/hms/api/FailedBinderCallBack;->binderCallBackMap:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
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
.end method


# virtual methods
.method public getCallBack(Ljava/lang/Long;)Lcom/huawei/hms/api/FailedBinderCallBack$BinderCallBack;
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/hms/api/FailedBinderCallBack;->binderCallBackMap:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "FailedBinderCallBack"

    .line 6
    .line 7
    const-string v0, "binderCallBackMap is null"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/huawei/hms/api/FailedBinderCallBack$BinderCallBack;

    .line 19
    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setCallBack(Ljava/lang/Long;Lcom/huawei/hms/api/FailedBinderCallBack$BinderCallBack;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/api/FailedBinderCallBack;->putCallBackInMap(Ljava/lang/Long;Lcom/huawei/hms/api/FailedBinderCallBack$BinderCallBack;)V

    return-void
.end method
