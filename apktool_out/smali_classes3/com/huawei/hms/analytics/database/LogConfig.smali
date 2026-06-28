.class public Lcom/huawei/hms/analytics/database/LogConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ghi:Ljava/lang/String;

.field private hij:Ljava/lang/String;

.field private ijk:Ljava/lang/String;

.field private ikl:Ljava/lang/String;

.field private klm:Ljava/lang/String;

.field private lmn:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogConfig;->lmn:Ljava/lang/Long;

    iput-object p2, p0, Lcom/huawei/hms/analytics/database/LogConfig;->klm:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ikl:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ijk:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/hms/analytics/database/LogConfig;->hij:Ljava/lang/String;

    iput-object p6, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ghi:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogConfig;->lmn:Ljava/lang/Long;

    return-object v0
.end method

.method public getLogGroupId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ijk:Ljava/lang/String;

    return-object v0
.end method

.method public getLogStreamId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogConfig;->hij:Ljava/lang/String;

    return-object v0
.end method

.method public getLogTags()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ghi:Ljava/lang/String;

    return-object v0
.end method

.method public getProjectId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ikl:Ljava/lang/String;

    return-object v0
.end method

.method public getRegion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/database/LogConfig;->klm:Ljava/lang/String;

    return-object v0
.end method

.method public setId(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogConfig;->lmn:Ljava/lang/Long;

    return-void
.end method

.method public setLogGroupId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ijk:Ljava/lang/String;

    return-void
.end method

.method public setLogStreamId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogConfig;->hij:Ljava/lang/String;

    return-void
.end method

.method public setLogTags(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ghi:Ljava/lang/String;

    return-void
.end method

.method public setProjectId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogConfig;->ikl:Ljava/lang/String;

    return-void
.end method

.method public setRegion(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/database/LogConfig;->klm:Ljava/lang/String;

    return-void
.end method
