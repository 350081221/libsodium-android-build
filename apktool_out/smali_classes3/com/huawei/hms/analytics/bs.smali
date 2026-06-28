.class public final Lcom/huawei/hms/analytics/bs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;


# instance fields
.field private ikl:Ljava/lang/String;

.field private klm:Ljava/lang/String;

.field private lmn:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/bs;->lmn:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/huawei/hms/analytics/bs;->klm:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/bs;->ikl:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final doCollector()Lorg/json/JSONObject;
    .locals 6

    iget-object v0, p0, Lcom/huawei/hms/analytics/bs;->lmn:Lorg/json/JSONObject;

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v1, v1, Lcom/huawei/hms/analytics/ay;->ikl:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hms/analytics/bs;->klm:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/at;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :try_start_0
    iget-object v3, p0, Lcom/huawei/hms/analytics/bs;->lmn:Lorg/json/JSONObject;

    const-string v4, "productid"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, ""

    if-nez v1, :cond_0

    move-object v1, v5

    :cond_0
    :try_start_1
    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/huawei/hms/analytics/bs;->lmn:Lorg/json/JSONObject;

    const-string v3, "pubkey_version"

    if-nez v2, :cond_1

    move-object v2, v5

    :cond_1
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "_openness_config_tag"

    iget-object v2, p0, Lcom/huawei/hms/analytics/bs;->ikl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "AGC_TAG"

    iget-object v2, p0, Lcom/huawei/hms/analytics/bs;->ikl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    const-string v1, "CN"

    iget-object v2, p0, Lcom/huawei/hms/analytics/bs;->klm:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/huawei/hms/analytics/bs;->lmn:Lorg/json/JSONObject;

    const-string v2, "wxappid"

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->u:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "OpennessHeaderGathering"

    const-string v1, "doCollector JSONException"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/bs;->lmn:Lorg/json/JSONObject;

    return-object v0

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method
