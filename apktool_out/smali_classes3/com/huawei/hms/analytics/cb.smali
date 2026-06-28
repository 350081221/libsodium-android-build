.class public abstract Lcom/huawei/hms/analytics/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/core/transport/CallbackListener;


# instance fields
.field private final hij:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

.field protected ijk:Ljava/lang/String;

.field protected ikl:Lcom/huawei/hms/analytics/cc;

.field public final klm:Ljava/lang/String;

.field private final lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/analytics/cc;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/huawei/hms/analytics/cb;->hij:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

    iput-object p1, p0, Lcom/huawei/hms/analytics/cb;->ikl:Lcom/huawei/hms/analytics/cc;

    iput-object p2, p0, Lcom/huawei/hms/analytics/cb;->klm:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/cb;->lmn:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ikl()[Ljava/lang/String;
    .locals 5

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->n:Lcom/huawei/hms/analytics/ay;

    iget-object v0, v0, Lcom/huawei/hms/analytics/ay;->lmn:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/hms/analytics/cb;->ijk:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [Ljava/lang/String;

    return-object v0

    :cond_0
    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v4, v0, v1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/huawei/hms/analytics/cb;->lmn:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public klm()V
    .locals 2

    new-instance v0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/cb;->ikl()[Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setUrls([Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/cb;->klm:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setRequestMethod(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v1

    iget-object v1, v1, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-object v1, v1, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setContext(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/huawei/hms/analytics/cb;->lmn()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->setHttpHeaders(Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/cb;->lmn(Lcom/huawei/hms/analytics/core/transport/ITransportHandler;)V

    return-void
.end method

.method public lmn()Ljava/util/Map;
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

    return-object v1
.end method

.method public final lmn(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/cb;->ikl:Lcom/huawei/hms/analytics/cc;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/huawei/hms/analytics/cc;->klm:Ljava/lang/String;

    iget-object p1, p0, Lcom/huawei/hms/analytics/cb;->ikl:Lcom/huawei/hms/analytics/cc;

    invoke-static {p1}, Lcom/huawei/hms/analytics/cd;->lmn(Lcom/huawei/hms/analytics/cc;)V

    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/core/transport/ITransportHandler;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/cb;->hij:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->execute(Lcom/huawei/hms/analytics/core/transport/CallbackListener;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/huawei/hms/analytics/core/transport/ITransportHandler;->execute()Lcom/huawei/hms/analytics/core/transport/net/Response;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/cb;->hij:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

    invoke-interface {v0, p1}, Lcom/huawei/hms/analytics/core/transport/CallbackListener;->onSuccess(Lcom/huawei/hms/analytics/core/transport/net/Response;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/huawei/hms/analytics/cb;->hij:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

    invoke-interface {p1, v0}, Lcom/huawei/hms/analytics/core/transport/CallbackListener;->onFailure(I)V

    return-void
.end method
