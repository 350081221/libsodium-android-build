.class public final Lcom/huawei/hms/analytics/ce;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static lmn:Lcom/huawei/hms/analytics/ce;


# instance fields
.field private klm:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/ce;->klm:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/hms/utils/HMSBIInitializer;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSBIInitializer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/hms/utils/HMSBIInitializer;->initBI()V

    return-void
.end method

.method private static declared-synchronized klm(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/huawei/hms/analytics/ce;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/hms/analytics/ce;->lmn:Lcom/huawei/hms/analytics/ce;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/hms/analytics/ce;

    invoke-direct {v1, p0}, Lcom/huawei/hms/analytics/ce;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/huawei/hms/analytics/ce;->lmn:Lcom/huawei/hms/analytics/ce;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/ce;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/ce;->lmn:Lcom/huawei/hms/analytics/ce;

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/huawei/hms/analytics/ce;->klm(Landroid/content/Context;)V

    :cond_0
    sget-object p0, Lcom/huawei/hms/analytics/ce;->lmn:Lcom/huawei/hms/analytics/ce;

    return-object p0
.end method


# virtual methods
.method public final lmn(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/database/APIEvent;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/analytics/database/APIEvent;

    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/analytics/ce;->klm:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/APIEvent;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/database/APIEvent;->toMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtil;->onNewEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    return-void
.end method
