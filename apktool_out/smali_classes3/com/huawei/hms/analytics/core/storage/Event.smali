.class public Lcom/huawei/hms/analytics/core/storage/Event;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field private static final TAG:Ljava/lang/String; = "EventBean"


# instance fields
.field private associationid:Ljava/lang/String;

.field private content:Ljava/lang/String;

.field private evtid:Ljava/lang/String;

.field private evttime:Ljava/lang/String;

.field private evttype:Ljava/lang/String;

.field private id:Ljava/lang/Long;

.field private pid:Ljava/lang/String;

.field private pushEvtFlag:Ljava/lang/String;

.field private serviceTag:Ljava/lang/String;

.field private sessionName:Ljava/lang/String;

.field private sessionid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->id:Ljava/lang/Long;

    iput-object p2, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evtid:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttype:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hms/analytics/core/storage/Event;->content:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttime:Ljava/lang/String;

    iput-object p6, p0, Lcom/huawei/hms/analytics/core/storage/Event;->serviceTag:Ljava/lang/String;

    iput-object p7, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionid:Ljava/lang/String;

    iput-object p8, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionName:Ljava/lang/String;

    iput-object p9, p0, Lcom/huawei/hms/analytics/core/storage/Event;->associationid:Ljava/lang/String;

    iput-object p10, p0, Lcom/huawei/hms/analytics/core/storage/Event;->pid:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public clone()Lcom/huawei/hms/analytics/core/storage/Event;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/analytics/core/storage/Event;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/core/storage/Event;->clone()Lcom/huawei/hms/analytics/core/storage/Event;

    move-result-object v0

    return-object v0
.end method

.method public formJson(Lorg/json/JSONObject;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "event"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evtid:Ljava/lang/String;

    const-string v0, "eventtime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttime:Ljava/lang/String;

    const-string v0, "type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttype:Ljava/lang/String;

    const-string v0, "properties"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->content:Ljava/lang/String;

    const-string v0, "first_session_event"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionid:Ljava/lang/String;

    const-string v0, "event_session_name"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionName:Ljava/lang/String;

    const-string v0, "id"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->associationid:Ljava/lang/String;

    const-string v0, "pid"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->pid:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public getAssociationid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->associationid:Ljava/lang/String;

    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getEvtId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evtid:Ljava/lang/String;

    return-object v0
.end method

.method public getEvtTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttime:Ljava/lang/String;

    return-object v0
.end method

.method public getEvtType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttype:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->id:Ljava/lang/Long;

    return-object v0
.end method

.method public getPid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->pid:Ljava/lang/String;

    return-object v0
.end method

.method public getPushEvtFlag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->pushEvtFlag:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->serviceTag:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionName:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionid:Ljava/lang/String;

    return-object v0
.end method

.method public setAssociationid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->associationid:Ljava/lang/String;

    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->content:Ljava/lang/String;

    return-void
.end method

.method public setEvtId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evtid:Ljava/lang/String;

    return-void
.end method

.method public setEvtTime(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttime:Ljava/lang/String;

    return-void
.end method

.method public setEvtType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttype:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->id:Ljava/lang/Long;

    return-void
.end method

.method public setPid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->pid:Ljava/lang/String;

    return-void
.end method

.method public setPushEvtFlag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->pushEvtFlag:Ljava/lang/String;

    return-void
.end method

.method public setServiceTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->serviceTag:Ljava/lang/String;

    return-void
.end method

.method public setSessionName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionName:Ljava/lang/String;

    return-void
.end method

.method public setSessionid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionid:Ljava/lang/String;

    return-void
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 6

    const-string v0, "EventBean"

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "type"

    iget-object v4, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttype:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "eventtime"

    iget-object v4, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evttime:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "event"

    iget-object v4, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evtid:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "id"

    iget-object v4, p0, Lcom/huawei/hms/analytics/core/storage/Event;->associationid:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "pid"

    iget-object v4, p0, Lcom/huawei/hms/analytics/core/storage/Event;->pid:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "event_session_name"

    iget-object v4, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionName:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "first_session_event"

    iget-object v4, p0, Lcom/huawei/hms/analytics/core/storage/Event;->sessionid:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/huawei/hms/analytics/core/storage/Event;->content:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "properties"

    new-instance v4, Lorg/json/JSONObject;

    iget-object v5, p0, Lcom/huawei/hms/analytics/core/storage/Event;->content:Ljava/lang/String;

    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "content is empty: evtId:"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/hms/analytics/core/storage/Event;->evtid:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    const-string v1, "event put params JSONException"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v2

    :goto_1
    return-object v1
.end method
