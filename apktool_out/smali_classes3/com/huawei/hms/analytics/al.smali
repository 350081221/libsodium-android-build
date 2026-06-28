.class public final Lcom/huawei/hms/analytics/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/al$lmn;
    }
.end annotation


# instance fields
.field private ghi:Ljava/lang/String;

.field private hij:Ljava/lang/String;

.field private ijk:Ljava/lang/String;

.field private ikl:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

.field private klm:Lcom/huawei/hms/analytics/instance/CallBack;

.field private lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;Ljava/lang/String;Lcom/huawei/hms/analytics/instance/CallBack;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/huawei/hms/analytics/al;->lmn:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    iput-object p1, p0, Lcom/huawei/hms/analytics/al;->ikl:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    return-void
.end method

.method static synthetic klm(Lcom/huawei/hms/analytics/al;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/huawei/hms/analytics/al;->ijk:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic lmn(Lcom/huawei/hms/analytics/al;)Lcom/huawei/hms/analytics/instance/CallBack;
    .locals 0

    iget-object p0, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    return-object p0
.end method

.method private lmn()[B
    .locals 7

    const-string v0, "ReportOaidTask"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/al;->ikl:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    invoke-interface {v1}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getAppId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/analytics/al;->ijk:Ljava/lang/String;

    const-string v3, ""

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "protocol_version"

    const-string v6, "1"

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "compress_mode"

    const-string v6, "0"

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "serviceid"

    const-string v6, "hmshioperqrt"

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "appid"

    invoke-virtual {v4, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "chifer"

    invoke-virtual {v4, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "timestamp"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "servicetag"

    iget-object v3, p0, Lcom/huawei/hms/analytics/al;->lmn:Ljava/lang/String;

    invoke-virtual {v4, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "requestid"

    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/huawei/hms/analytics/al;->ikl:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    const-string v2, "oper"

    invoke-interface {v1, v2, v4}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->getEvtCustomHeader(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {v1}, Lcom/huawei/hms/analytics/framework/config/EvtHeaderAttributeCollector;->doCollector()Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "wxappid"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    const-string v4, "header"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "aaid"

    iget-object v5, p0, Lcom/huawei/hms/analytics/al;->ghi:Ljava/lang/String;

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "oaid"

    iget-object v5, p0, Lcom/huawei/hms/analytics/al;->hij:Ljava/lang/String;

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "oaid_source"

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v5

    iget-object v5, v5, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v5, v5, Lcom/huawei/hms/analytics/at;->i:Ljava/lang/String;

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "events_common"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "event"

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "get body error:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :catch_0
    const-string v1, "get body json exception"

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 9

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    const-string v1, "ReportOaidTask"

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v2, p0, Lcom/huawei/hms/analytics/al;->lmn:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/ar;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/au;

    move-result-object v0

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/au;->ikl:Z

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->lmn:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/analytics/ba;->klm(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/hms/analytics/al;->lmn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " not init"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, -0x65

    invoke-interface {v0, v2, v1}, Lcom/huawei/hms/analytics/instance/CallBack;->onResult(ILjava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, p0, Lcom/huawei/hms/analytics/al;->lmn:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/ay;->lmn(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "CN"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Region is not CN"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    const/16 v1, -0x6f

    const-string v2, "region invalid"

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/analytics/instance/CallBack;->onResult(ILjava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->ikl:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    invoke-interface {v0, v8}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->setRegion(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->ikl:Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;

    invoke-interface {v0}, Lcom/huawei/hms/analytics/framework/config/ICollectorConfig;->syncOaid()V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->j:Ljava/lang/String;

    const-string v2, "false"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    const-string v0, "oaidTracking is off"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    const/16 v4, -0x71

    :goto_0
    invoke-interface {v3, v4, v0}, Lcom/huawei/hms/analytics/instance/CallBack;->onResult(ILjava/lang/String;)V

    goto :goto_2

    :cond_3
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->i:Ljava/lang/String;

    const-string v3, "oaid"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "gaid"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "oaidsoure is not oaid or gaid"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    const/16 v4, -0x73

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/al;->hij:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cy;->klm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/al;->ghi:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->hij:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->ghi:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const-string v0, "oaid is null or aaid is null"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    const/16 v4, -0x72

    goto :goto_0

    :goto_2
    if-eqz v2, :cond_7

    return-void

    :cond_7
    invoke-static {}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->getInstance()Lcom/huawei/hms/analytics/core/crypto/RandomUtil;

    move-result-object v0

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/core/crypto/RandomUtil;->generateSecureRandomStr(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/al;->ijk:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "reqID:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/hms/analytics/al;->ijk:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/hms/analytics/al$lmn;

    const-string v2, "ReportOaidRequst#execute"

    invoke-static {v2}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v5

    const-string v6, "POST"

    const-string v7, "/ext-api/rest/v1/user/events"

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/huawei/hms/analytics/al$lmn;-><init>(Lcom/huawei/hms/analytics/al;Lcom/huawei/hms/analytics/cc;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/hms/analytics/al;->lmn()[B

    move-result-object v2

    array-length v3, v2

    if-gtz v3, :cond_8

    const-string v0, "body object is null or body size is 0"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    const/16 v1, -0x70

    const-string v2, "body is empty"

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/analytics/instance/CallBack;->onResult(ILjava/lang/String;)V

    return-void

    :cond_8
    new-instance v1, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;

    invoke-direct {v1}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cb;->ikl()[Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setUrls([Ljava/lang/String;)V

    iget-object v3, v0, Lcom/huawei/hms/analytics/cb;->klm:Ljava/lang/String;

    invoke-interface {v1, v3}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setRequestMethod(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setReportData([B)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setContext(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cb;->lmn()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setHttpHeaders(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/cb;->lmn(Lcom/huawei/hms/analytics/core/transport/ITransportHandler;)V

    return-void

    :cond_9
    :goto_3
    const-string v0, "The Analytics Kit is disabled"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/al;->klm:Lcom/huawei/hms/analytics/instance/CallBack;

    const/16 v1, -0x6e

    const-string v2, "analytics closed"

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/analytics/instance/CallBack;->onResult(ILjava/lang/String;)V

    return-void
.end method
