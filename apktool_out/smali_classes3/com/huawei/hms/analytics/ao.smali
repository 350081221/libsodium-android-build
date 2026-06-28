.class public final Lcom/huawei/hms/analytics/ao;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ghi:Ljava/lang/String;

.field private hij:Ljava/lang/String;

.field private ijk:Ljava/lang/String;

.field private ikl:Ljava/lang/String;

.field klm:Ljava/lang/String;

.field lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "activityId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/hms/analytics/ao;->ikl:Ljava/lang/String;

    const-string v1, "nodeId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/hms/analytics/ao;->ijk:Ljava/lang/String;

    const-string v1, "source"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/hms/analytics/ao;->hij:Ljava/lang/String;

    const-string v1, "medium"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/huawei/hms/analytics/ao;->ghi:Ljava/lang/String;

    const-string v1, "endTime"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/ao;->lmn:Ljava/lang/String;

    iput-object p1, p0, Lcom/huawei/hms/analytics/ao;->klm:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final lmn()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "aid"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ao;->ikl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "nid"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ao;->ijk:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "s"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ao;->hij:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "m"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ao;->ghi:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "t"

    iget-object v2, p0, Lcom/huawei/hms/analytics/ao;->lmn:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method
