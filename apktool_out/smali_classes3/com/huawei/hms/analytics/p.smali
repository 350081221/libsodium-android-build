.class public final Lcom/huawei/hms/analytics/p;
.super Lcom/huawei/hms/common/HuaweiApi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/common/HuaweiApi<",
        "Lcom/huawei/hms/api/Api$ApiOptions$NoOptions;",
        ">;"
    }
.end annotation


# static fields
.field private static final lmn:Lcom/huawei/hms/analytics/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/n;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/n;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/p;->lmn:Lcom/huawei/hms/analytics/n;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Lcom/huawei/hms/api/Api;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/huawei/hms/api/Api;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/huawei/hms/api/Api$ApiOptions$NoOptions;

    invoke-direct {v1}, Lcom/huawei/hms/api/Api$ApiOptions$NoOptions;-><init>()V

    sget-object v2, Lcom/huawei/hms/analytics/p;->lmn:Lcom/huawei/hms/analytics/n;

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/huawei/hms/common/HuaweiApi;-><init>(Landroid/content/Context;Lcom/huawei/hms/api/Api;Lcom/huawei/hms/api/Api$ApiOptions;Lcom/huawei/hms/common/internal/AbstractClientBuilder;)V

    return-void
.end method


# virtual methods
.method public final lmn()Lcom/huawei/hmf/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/huawei/hmf/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    const-string v2, "method"

    const-string v3, "setKitEnable"

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "pkg_name"

    iget-object v3, v1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "3rd_aaid"

    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hms/analytics/cy;->klm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "app_id"

    iget-object v3, v1, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v3, v3, Lcom/huawei/hms/analytics/ay;->klm:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "enable_collect"

    iget-boolean v3, v1, Lcom/huawei/hms/analytics/at;->fgh:Z

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "_restriction_enabled"

    iget-boolean v3, v1, Lcom/huawei/hms/analytics/at;->efg:Z

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "_restriction_shared"

    iget-boolean v3, v1, Lcom/huawei/hms/analytics/at;->def:Z

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "_region"

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    const-string v3, "_openness_config_tag"

    invoke-virtual {v1, v3}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "HiAnalyticsClientWatchable"

    const-string v2, "unableCollect build json failed. "

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    new-instance v1, Lcom/huawei/hms/analytics/u;

    const-string v2, "hianalytics.analyticsInvokeService"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/huawei/hms/analytics/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/huawei/hms/common/HuaweiApi;->doWrite(Lcom/huawei/hms/common/internal/TaskApiCall;)Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    return-object v0
.end method
