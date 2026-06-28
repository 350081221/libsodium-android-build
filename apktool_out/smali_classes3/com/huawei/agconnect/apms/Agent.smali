.class public Lcom/huawei/agconnect/apms/Agent;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HA_VERSION:Ljava/lang/String; = ""

.field public static final IMPL_LOCK:Ljava/lang/Object;

.field public static final NAME:Ljava/lang/String; = "AndroidAgent"

.field public static final NOOP_AGENT_IMPL:Lcom/huawei/agconnect/apms/fgh;

.field public static final OS_NAME:Ljava/lang/String; = "Android"

.field public static final RC_VERSION:Ljava/lang/String; = ""

.field public static final VERSION:Ljava/lang/String; = "1.6.2.300"

.field public static executor:Ljava/util/concurrent/ExecutorService;

.field public static impl:Lcom/huawei/agconnect/apms/fgh;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/huawei/agconnect/apms/hij;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/hij;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/huawei/agconnect/apms/Agent;->NOOP_AGENT_IMPL:Lcom/huawei/agconnect/apms/fgh;

    .line 7
    .line 8
    sput-object v0, Lcom/huawei/agconnect/apms/Agent;->impl:Lcom/huawei/agconnect/apms/fgh;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/huawei/agconnect/apms/Agent;->IMPL_LOCK:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v0, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;

    .line 18
    .line 19
    const-string v1, "AgentReportEvent"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/util/NamedThreadFactory;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcom/huawei/agconnect/apms/Agent;->executor:Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static enableAnrMonitor(Z)V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/fgh;->cde(Z)V

    return-void
.end method

.method public static enableCollectionByUser(Z)V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/fgh;->bcd(Z)V

    return-void
.end method

.method public static getAgentConfiguration()Lcom/huawei/agconnect/apms/efg;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->lmn()Lcom/huawei/agconnect/apms/efg;

    move-result-object v0

    return-object v0
.end method

.method public static getApplicationInformation()Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->ghi()Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    move-result-object v0

    return-object v0
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->klm()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static getCreateTime()J
    .locals 2

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->abc()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getDeviceInformation()Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->hij()Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    move-result-object v0

    return-object v0
.end method

.method public static getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/Agent;->executor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static getImpl()Lcom/huawei/agconnect/apms/fgh;
    .locals 2

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/Agent;->IMPL_LOCK:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/apms/Agent;->impl:Lcom/huawei/agconnect/apms/fgh;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
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

.method public static getPlatformInformation()Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->fgh()Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    move-result-object v0

    return-object v0
.end method

.method public static getRuntimeEnvInformation()Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->efg()Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    move-result-object v0

    return-object v0
.end method

.method public static getSession()Lcom/huawei/agconnect/apms/util/Session;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->ijk()Lcom/huawei/agconnect/apms/util/Session;

    move-result-object v0

    return-object v0
.end method

.method public static getUserIdentifier()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->jkl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getUserSettingsInformation()Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->def()Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    move-result-object v0

    return-object v0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.6.2.300"

    return-object v0
.end method

.method public static isDisabled()Z
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->bcd()Z

    move-result v0

    return v0
.end method

.method public static setImpl(Lcom/huawei/agconnect/apms/fgh;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/huawei/agconnect/apms/Agent;->IMPL_LOCK:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    :try_start_0
    sget-object p0, Lcom/huawei/agconnect/apms/Agent;->NOOP_AGENT_IMPL:Lcom/huawei/agconnect/apms/fgh;

    .line 7
    .line 8
    sput-object p0, Lcom/huawei/agconnect/apms/Agent;->impl:Lcom/huawei/agconnect/apms/fgh;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sput-object p0, Lcom/huawei/agconnect/apms/Agent;->impl:Lcom/huawei/agconnect/apms/fgh;

    .line 12
    .line 13
    :goto_0
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static setUserIdentifier(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/fgh;->abc(Ljava/lang/String;)V

    return-void
.end method

.method public static setUserPrivacyAgreed(Z)V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/fgh;->abc(Z)V

    return-void
.end method

.method public static start()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getImpl()Lcom/huawei/agconnect/apms/fgh;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/apms/fgh;->cde()V

    return-void
.end method
