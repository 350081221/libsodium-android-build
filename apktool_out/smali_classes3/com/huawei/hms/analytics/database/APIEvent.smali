.class public Lcom/huawei/hms/analytics/database/APIEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private code:Ljava/lang/String;

.field private costTime:Ljava/lang/String;

.field private errorCode:Ljava/lang/String;

.field private eventCnt:Ljava/lang/String;

.field private eventId:Ljava/lang/String;

.field private id:Ljava/lang/Long;

.field private name:Ljava/lang/String;

.field private result:Ljava/lang/String;

.field private timestamp:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->id:Ljava/lang/Long;

    iput-object p2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->code:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/database/APIEvent;->timestamp:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hms/analytics/database/APIEvent;->type:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/hms/analytics/database/APIEvent;->name:Ljava/lang/String;

    iput-object p6, p0, Lcom/huawei/hms/analytics/database/APIEvent;->result:Ljava/lang/String;

    iput-object p7, p0, Lcom/huawei/hms/analytics/database/APIEvent;->errorCode:Ljava/lang/String;

    iput-object p8, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventId:Ljava/lang/String;

    iput-object p9, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventCnt:Ljava/lang/String;

    iput-object p10, p0, Lcom/huawei/hms/analytics/database/APIEvent;->costTime:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->code:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->timestamp:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/database/APIEvent;->type:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hms/analytics/database/APIEvent;->name:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/hms/analytics/database/APIEvent;->result:Ljava/lang/String;

    iput-object p6, p0, Lcom/huawei/hms/analytics/database/APIEvent;->errorCode:Ljava/lang/String;

    iput-object p7, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventId:Ljava/lang/String;

    iput-object p8, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventCnt:Ljava/lang/String;

    iput-object p9, p0, Lcom/huawei/hms/analytics/database/APIEvent;->costTime:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->code:Ljava/lang/String;

    return-object v0
.end method

.method public getCostTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->costTime:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->errorCode:Ljava/lang/String;

    return-object v0
.end method

.method public getEventCnt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventCnt:Ljava/lang/String;

    return-object v0
.end method

.method public getEventId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventId:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->id:Ljava/lang/Long;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getResult()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->result:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/APIEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setCode(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->code:Ljava/lang/String;

    return-void
.end method

.method public setCostTime(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->costTime:Ljava/lang/String;

    return-void
.end method

.method public setErrorCode(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->errorCode:Ljava/lang/String;

    return-void
.end method

.method public setEventCnt(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventCnt:Ljava/lang/String;

    return-void
.end method

.method public setEventId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventId:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->id:Ljava/lang/Long;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->name:Ljava/lang/String;

    return-void
.end method

.method public setResult(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->result:Ljava/lang/String;

    return-void
.end method

.method public setTimestamp(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->timestamp:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/APIEvent;->type:Ljava/lang/String;

    return-void
.end method

.method public toMap()Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "service"

    const-string v2, "AnalyticsKit"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "id"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->code:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "timestamp"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->timestamp:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "api_type"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->type:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "api_name"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->name:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "result"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->result:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "error_code"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->errorCode:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "event_id"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "event_cnt"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->eventCnt:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "cost_time"

    iget-object v2, p0, Lcom/huawei/hms/analytics/database/APIEvent;->costTime:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
