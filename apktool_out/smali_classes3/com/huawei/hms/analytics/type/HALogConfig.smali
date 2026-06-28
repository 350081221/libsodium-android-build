.class public Lcom/huawei/hms/analytics/type/HALogConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private hij:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ijk:Ljava/lang/String;

.field private ikl:Ljava/lang/String;

.field private klm:Ljava/lang/String;

.field private lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/analytics/type/HALogConfig;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getRegion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->ijk:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getProjectId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->lmn:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getLogGroupId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->klm:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getLogStreamId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->ikl:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/type/HALogConfig;->getTags()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->hij:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->ijk:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->lmn:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->klm:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->ikl:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->hij:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getLogGroupId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->klm:Ljava/lang/String;

    return-object v0
.end method

.method public getLogStreamId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->ikl:Ljava/lang/String;

    return-object v0
.end method

.method public getProjectId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->lmn:Ljava/lang/String;

    return-object v0
.end method

.method public getRegion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->ijk:Ljava/lang/String;

    return-object v0
.end method

.method public getTags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->hij:Ljava/util/Map;

    return-object v0
.end method

.method public setLogGroupId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->klm:Ljava/lang/String;

    return-void
.end method

.method public setLogStreamId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->ikl:Ljava/lang/String;

    return-void
.end method

.method public setProjectId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->lmn:Ljava/lang/String;

    return-void
.end method

.method public setRegion(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->ijk:Ljava/lang/String;

    return-void
.end method

.method public setTags(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/hms/analytics/type/HALogConfig;->hij:Ljava/util/Map;

    return-void
.end method
