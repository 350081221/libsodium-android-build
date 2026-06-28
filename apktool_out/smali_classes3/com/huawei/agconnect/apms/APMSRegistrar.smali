.class public Lcom/huawei/agconnect/apms/APMSRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/core/ServiceRegistrar;


# static fields
.field public static final LOG:Lcom/huawei/agconnect/apms/log/AgentLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/APMSRegistrar;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000(Lcom/huawei/agconnect/apms/APMSRegistrar;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/apms/APMSRegistrar;->initHiAnalyticsManager(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic access$100()Lcom/huawei/agconnect/apms/log/AgentLog;
    .locals 1

    sget-object v0, Lcom/huawei/agconnect/apms/APMSRegistrar;->LOG:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-object v0
.end method

.method private initHiAnalyticsManager(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/agconnect/apms/APMSRegistrar$bcd;

    invoke-direct {v1, p0, p1}, Lcom/huawei/agconnect/apms/APMSRegistrar$bcd;-><init>(Lcom/huawei/agconnect/apms/APMSRegistrar;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public getServices(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/core/Service;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 p1, 0x1

    .line 2
    new-array p1, p1, [Lcom/huawei/agconnect/core/Service;

    .line 3
    .line 4
    const-class v0, Lcom/huawei/agconnect/apms/APMS;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/huawei/agconnect/core/Service;->builder(Ljava/lang/Class;)Lcom/huawei/agconnect/core/Service$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/huawei/agconnect/core/Service$Builder;->build()Lcom/huawei/agconnect/core/Service;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    aput-object v0, p1, v1

    .line 16
    .line 17
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public initialize(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/huawei/agconnect/common/network/AccessNetworkManager;->getInstance()Lcom/huawei/agconnect/common/network/AccessNetworkManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/agconnect/apms/APMSRegistrar$abc;

    invoke-direct {v1, p0, p1}, Lcom/huawei/agconnect/apms/APMSRegistrar$abc;-><init>(Lcom/huawei/agconnect/apms/APMSRegistrar;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/common/network/AccessNetworkManager;->addCallback(Lcom/huawei/agconnect/common/network/AccessNetworkManager$AccessNetworkCallback;)V

    return-void
.end method
