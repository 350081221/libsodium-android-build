.class public final Lcom/huawei/hms/analytics/cl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/framework/config/ICallback;


# instance fields
.field private ikl:Z

.field public klm:Z

.field public lmn:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/cl;->lmn:Z

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/cl;->ikl:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/cl;->klm:Z

    return-void
.end method

.method private static klm(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v1, ""

    const-string v2, "global_v2"

    const-string v3, "camp_evt"

    invoke-static {v0, v2, v3, v1}, Lcom/huawei/hms/analytics/dl;->klm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-nez v5, :cond_0

    return-void

    :cond_0
    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_2

    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    const-string v9, "f"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {p0, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, "t"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/huawei/hms/analytics/dc;->klm(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    invoke-virtual {v1, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p0

    if-nez p0, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p0, p0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v2, v0}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p0

    if-eq p0, v5, :cond_4

    const/4 p0, 0x2

    new-array p0, p0, [Ljava/lang/Object;

    aput-object v3, p0, v6

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    aput-object v1, p0, v4

    invoke-static {v0, v2, p0}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-void

    :catch_0
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p0

    iget-object p0, p0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p0, p0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v2, v0}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method private static lmn(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {v1}, Lcom/huawei/hms/analytics/core/storage/Event;->getPushEvtFlag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private lmn(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/cl;->lmn:Z

    if-eqz v0, :cond_0

    invoke-static {p3}, Lcom/huawei/hms/analytics/cl;->lmn(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/analytics/cl;->klm(Ljava/util/List;)V

    :cond_0
    const/16 v0, 0xc8

    if-eq p1, v0, :cond_3

    const/4 p1, -0x2

    if-eq p2, p1, :cond_3

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/cl;->isStopEvent()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/cl;->isNeedStorage()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/storage/Event;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object p2

    iget-object p2, p2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object p2, p2, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string p3, "stop_v2_1"

    const-string v0, "stop_event"

    invoke-static {p2, p3, v0, p1}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-boolean p1, p0, Lcom/huawei/hms/analytics/cl;->lmn:Z

    if-eqz p1, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object p1

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {p2}, Lcom/huawei/hms/analytics/core/storage/Event;->getServiceTag()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/huawei/hms/analytics/bh;->klm(Ljava/util/List;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final isAAIDChanged(Ljava/lang/String;Z)Z
    .locals 3

    const-string v0, "_openness_config_tag"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Lcom/huawei/hms/analytics/cy;->lmn()Lcom/huawei/hms/analytics/cy;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v2, v2, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/analytics/cy;->klm(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-boolean v1, v0, Lcom/huawei/hms/analytics/at;->p:Z

    const-string v0, "aaid is changed,then reset"

    const-string v1, "ReportRingback"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/huawei/hms/analytics/fgh;->lmn()Lcom/huawei/hms/analytics/fgh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hms/analytics/fgh;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/bh;

    move-result-object p1

    instance-of v0, p1, Lcom/huawei/hms/analytics/ijk;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/huawei/hms/analytics/ijk;

    invoke-virtual {p1, p2}, Lcom/huawei/hms/analytics/ijk;->klm(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "reset analytics exception: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final isNeedStorage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/cl;->klm:Z

    return v0
.end method

.method public final isStopEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/cl;->ikl:Z

    return v0
.end method

.method public final onResult(IJILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJI",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation

    const-string v0, "report callback"

    const-string v1, "ReportRingback"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/analytics/dg;->ghi(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "do not enable APIEvt in debug model"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p5, :cond_6

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    invoke-direct {p0, p1, p4, p5}, Lcom/huawei/hms/analytics/cl;->lmn(IILjava/util/List;)V

    return-void

    :cond_2
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_3

    :try_start_0
    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    invoke-static {}, Lcom/huawei/hms/analytics/bo;->ikl()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/analytics/bc;->lmn(Landroid/content/Context;)Lcom/huawei/hms/analytics/bc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bc;->ikl()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lcom/huawei/hms/analytics/bo;->lmn()Lcom/huawei/hms/analytics/bo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/bo;->ijk()V
    :try_end_0
    .catch Lcom/huawei/hms/analytics/bc$lmn; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "checkLocalKeyRefresh, DBException, init DB error"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    invoke-direct {p0, p1, p4, p5}, Lcom/huawei/hms/analytics/cl;->lmn(IILjava/util/List;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p2

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/huawei/hms/analytics/core/storage/Event;

    invoke-virtual {p4}, Lcom/huawei/hms/analytics/core/storage/Event;->getEvtId()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Integer;

    const/4 v2, 0x1

    if-eqz p5, :cond_4

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p5

    add-int/2addr v2, p5

    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-interface {p2, p4, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    const-string p3, "ITransportHandler#execute()"

    invoke-static {p2, p3, v0, v1, p1}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/util/Map;Ljava/lang/String;JI)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final setStopEventReport(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/cl;->ikl:Z

    return-void
.end method
