.class public final Lcom/huawei/hms/analytics/cq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final lmn:Ljava/nio/charset/Charset;


# instance fields
.field private ijk:Z

.field private ikl:Ljava/lang/String;

.field private klm:Lcom/huawei/hms/analytics/cn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/cq;->lmn:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/analytics/cn;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/cq;->klm:Lcom/huawei/hms/analytics/cn;

    iput-object p2, p0, Lcom/huawei/hms/analytics/cq;->ikl:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/huawei/hms/analytics/cq;->ijk:Z

    return-void
.end method

.method private ijk()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, v2, Lcom/huawei/hms/analytics/ay;->klm:Ljava/lang/String;

    const-string v3, "App-Id"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "App-Ver"

    iget-object v3, v0, Lcom/huawei/hms/analytics/at;->klm:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, v2, Lcom/huawei/hms/analytics/ay;->ikl:Ljava/lang/String;

    const-string v3, "x-hasdk-productid"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v2, v2, Lcom/huawei/hms/analytics/ay;->ijk:Ljava/lang/String;

    const-string v3, "x-hasdk-resourceid"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "x-hasdk-token"

    iget-object v3, v0, Lcom/huawei/hms/analytics/at;->hij:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ay;->fgh:Ljava/lang/String;

    const-string v2, "x-hasdk-clientid"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Sdk-Ver"

    const-string v2, "6.7.0.300"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Device-Type"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Sdk-Name"

    const-string v2, "hianalytics"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "servicetag"

    const-string v2, "_openness_log_tag"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/huawei/hms/analytics/cq;->klm:Lcom/huawei/hms/analytics/cn;

    iget-object v0, v0, Lcom/huawei/hms/analytics/cn;->fgh:Ljava/lang/String;

    const-string v2, "x-hasdk-log-region"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method private ikl()[Ljava/lang/String;
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ay;->lmn:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/hms/analytics/cq;->ikl:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    const-string v2, "{url}"

    aget-object v3, v0, v1

    const-string v4, "{url}/common/hmshimaintqrt"

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private klm()V
    .locals 2

    invoke-static {}, Lcom/huawei/hms/analytics/be;->lmn()Lcom/huawei/hms/analytics/be;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/analytics/cq;->klm:Lcom/huawei/hms/analytics/cn;

    iget-object v1, v1, Lcom/huawei/hms/analytics/cn;->klm:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/analytics/be;->lmn(Ljava/util/List;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/cq;->klm:Lcom/huawei/hms/analytics/cn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cn;->ikl()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hms/analytics/be;->lmn()Lcom/huawei/hms/analytics/be;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/be;->ijk()V

    iget-object v0, p0, Lcom/huawei/hms/analytics/cq;->klm:Lcom/huawei/hms/analytics/cn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cn;->hij()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 6

    const-string v0, "start report"

    const-string v1, "LgEvtSend"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/cq;->klm:Lcom/huawei/hms/analytics/cn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cn;->klm()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/huawei/hms/analytics/cq;->klm:Lcom/huawei/hms/analytics/cn;

    iget-object v2, v2, Lcom/huawei/hms/analytics/cn;->hij:Ljava/lang/String;

    new-instance v3, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;

    invoke-direct {v3}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;-><init>()V

    invoke-direct {p0}, Lcom/huawei/hms/analytics/cq;->ikl()[Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setUrls([Ljava/lang/String;)V

    const-string v4, "POST"

    invoke-interface {v3, v4}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setRequestMethod(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v4

    iget-object v4, v4, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v4, v4, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-interface {v3, v4}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setContext(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/huawei/hms/analytics/cq;->ijk()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setHttpHeaders(Ljava/util/Map;)V

    sget-object v4, Lcom/huawei/hms/analytics/cq;->lmn:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/analytics/dm;->lmn([B)[B

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setReportData([B)V

    invoke-interface {v3}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->execute()Lcom/huawei/hms/analytics/core/transport/net/Response;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v0

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "log evts PostRequest, resultCode: %d ,reqID:"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v2, 0xc8

    if-eq v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hms/analytics/cq;->ijk:Z

    if-eqz v0, :cond_1

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/hms/analytics/cq;->klm()V
    :try_end_0
    .catch Lcom/huawei/hms/analytics/bc$lmn; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "log db init failed"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/analytics/cq;->klm:Lcom/huawei/hms/analytics/cn;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/cn;->ijk()V

    return-void
.end method
