.class public final Lcom/huawei/hms/analytics/br;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/framework/config/DeviceAttributeCollector;


# instance fields
.field fgh:Ljava/lang/String;

.field ghi:Ljava/lang/String;

.field hij:Ljava/lang/String;

.field ijk:Ljava/lang/String;

.field ikl:Ljava/lang/String;

.field klm:Ljava/lang/String;

.field lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/analytics/br;->lmn:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/br;->klm:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/br;->ikl:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/br;->ijk:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/br;->hij:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final doCollector()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "aaid"

    iget-object v2, p0, Lcom/huawei/hms/analytics/br;->lmn:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "oaid"

    iget-object v2, p0, Lcom/huawei/hms/analytics/br;->klm:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "oaid_source"

    iget-object v2, p0, Lcom/huawei/hms/analytics/br;->hij:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "userid"

    iget-object v2, p0, Lcom/huawei/hms/analytics/br;->ikl:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "wxunionid"

    iget-object v2, p0, Lcom/huawei/hms/analytics/br;->ghi:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "wxopenid"

    iget-object v2, p0, Lcom/huawei/hms/analytics/br;->fgh:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "events_global_properties"

    iget-object v2, p0, Lcom/huawei/hms/analytics/br;->ijk:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "OpennessDeviceGathering"

    const-string v2, "doCollector JSONException"

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
