.class public Lcom/huawei/hms/analytics/database/LogEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private hij:Ljava/lang/String;

.field private ijk:Ljava/lang/String;

.field private ikl:Ljava/lang/Long;

.field private klm:Ljava/lang/String;

.field private lmn:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogEvent;->lmn:Ljava/lang/Long;

    iput-object p2, p0, Lcom/huawei/hms/analytics/database/LogEvent;->klm:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/database/LogEvent;->ikl:Ljava/lang/Long;

    iput-object p4, p0, Lcom/huawei/hms/analytics/database/LogEvent;->ijk:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/hms/analytics/database/LogEvent;->hij:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getConfigId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogEvent;->ikl:Ljava/lang/Long;

    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogEvent;->ijk:Ljava/lang/String;

    return-object v0
.end method

.method public getEventId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogEvent;->hij:Ljava/lang/String;

    return-object v0
.end method

.method public getEvtTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogEvent;->klm:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogEvent;->lmn:Ljava/lang/Long;

    return-object v0
.end method

.method public setConfigId(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogEvent;->ikl:Ljava/lang/Long;

    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogEvent;->ijk:Ljava/lang/String;

    return-void
.end method

.method public setEventId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogEvent;->hij:Ljava/lang/String;

    return-void
.end method

.method public setEvtTime(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogEvent;->klm:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogEvent;->lmn:Ljava/lang/Long;

    return-void
.end method
