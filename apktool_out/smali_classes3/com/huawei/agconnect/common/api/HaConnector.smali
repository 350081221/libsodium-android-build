.class public Lcom/huawei/agconnect/common/api/HaConnector;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final HA_HTTP_HEADER:Ljava/lang/String; = "com.huawei.agconnect"

.field private static final HA_SERVICE_TAG:Ljava/lang/String; = "AGC_TAG"

.field private static final INSTANCE:Lcom/huawei/agconnect/common/api/HaConnector;

.field private static final TAG:Ljava/lang/String; = "HaConnector"


# instance fields
.field private hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

.field private final mainHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/common/api/HaConnector;

    invoke-direct {v0}, Lcom/huawei/agconnect/common/api/HaConnector;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/common/api/HaConnector;->INSTANCE:Lcom/huawei/agconnect/common/api/HaConnector;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->mainHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/agconnect/common/api/HaConnector;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/common/api/HaConnector;->initInMainThread(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/agconnect/common/api/HaConnector;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->mainHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$200(Lcom/huawei/agconnect/common/api/HaConnector;)Lcom/huawei/agconnect/credential/obs/ak;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    return-object p0
.end method

.method public static declared-synchronized getInstance()Lcom/huawei/agconnect/common/api/HaConnector;
    .locals 2

    const-class v0, Lcom/huawei/agconnect/common/api/HaConnector;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/common/api/HaConnector;->INSTANCE:Lcom/huawei/agconnect/common/api/HaConnector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private initHiAnalytics(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Lcom/huawei/agconnect/common/api/HaConnector;->useOldHaInitFunction()Z

    move-result v0

    const-string v1, "com.huawei.agconnect"

    const-string v2, "AGC_TAG"

    const-string v3, "HaConnector"

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, v2, v1}, Lcom/huawei/agconnect/credential/obs/aj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/agconnect/credential/obs/ak;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/AGConnectOptions;->getRoutePolicy()Lcom/huawei/agconnect/AGCRoutePolicy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/AGCRoutePolicy;->getRouteName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v1, v0}, Lcom/huawei/agconnect/credential/obs/aj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/agconnect/credential/obs/ak;

    move-result-object p1

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    if-nez p1, :cond_1

    const-string p1, "init HiAnalyticsBridge SDK error, please make sure the project inherits HiAnalytics SDK correctlyor download the latest agconnect-services.json file and try again."

    invoke-static {v3, p1}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    const-string p1, "init HiAnalyticsBridge SDK end."

    invoke-static {v3, p1}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    return-void

    :catch_0
    move-exception p1

    instance-of v0, p1, Ljava/lang/NoSuchMethodError;

    if-eqz v0, :cond_2

    const-string v0, "please upgrade HiAnalytics SDK (com.huawei.hms:hianalytics) to the latest version"

    invoke-static {v3, v0}, Lcom/huawei/agconnect/common/api/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    throw p1
.end method

.method private initInMainThread(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/common/api/HaConnector;->initHiAnalytics(Landroid/content/Context;)V

    return-void
.end method

.method private useOldHaInitFunction()Z
    .locals 5

    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object v0

    const-string v1, "/service/analytics/collector_url_ru"

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object v1

    const-string v2, "/service/analytics/collector_url_sg"

    invoke-interface {v1, v2}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object v2

    const-string v3, "/service/analytics/collector_url_de"

    invoke-interface {v2, v3}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/huawei/agconnect/AGConnectInstance;->getInstance()Lcom/huawei/agconnect/AGConnectInstance;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/agconnect/AGConnectInstance;->getOptions()Lcom/huawei/agconnect/AGConnectOptions;

    move-result-object v3

    const-string v4, "/service/analytics/collector_url_cn"

    invoke-interface {v3, v4}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method public containHaInstance()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getUserProfiles(Z)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lcom/huawei/agconnect/credential/obs/ak;->b(Z)Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public init(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/huawei/agconnect/common/network/AccessNetworkManager;->getInstance()Lcom/huawei/agconnect/common/network/AccessNetworkManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/agconnect/common/api/HaConnector$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/agconnect/common/api/HaConnector$1;-><init>(Lcom/huawei/agconnect/common/api/HaConnector;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/common/network/AccessNetworkManager;->addCallback(Lcom/huawei/agconnect/common/network/AccessNetworkManager$AccessNetworkCallback;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/huawei/agconnect/credential/obs/ak;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public onReport()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/huawei/agconnect/credential/obs/ak;->a()V

    :cond_0
    return-void
.end method

.method public setAnalyticsEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/huawei/agconnect/credential/obs/ak;->c(Z)V

    :cond_0
    return-void
.end method

.method public syncOAID(Lcom/huawei/agconnect/common/api/HaSyncCallBack;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    if-eqz v0, :cond_0

    const-string v0, "HaConnector"

    const-string v1, "start sync ha oaid"

    invoke-static {v0, v1}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector;->hiAnalytics:Lcom/huawei/agconnect/credential/obs/ak;

    new-instance v1, Lcom/huawei/agconnect/common/api/HaConnector$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/agconnect/common/api/HaConnector$2;-><init>(Lcom/huawei/agconnect/common/api/HaConnector;Lcom/huawei/agconnect/common/api/HaSyncCallBack;)V

    invoke-interface {v0, v1}, Lcom/huawei/agconnect/credential/obs/ak;->syncOaid(Lcom/huawei/agconnect/credential/obs/ai;)V

    :cond_0
    return-void
.end method
