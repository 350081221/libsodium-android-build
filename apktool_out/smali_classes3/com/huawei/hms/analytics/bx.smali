.class public final Lcom/huawei/hms/analytics/bx;
.super Lcom/huawei/hms/analytics/cb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/bx$lmn;
    }
.end annotation


# instance fields
.field public lmn:Lcom/huawei/hms/analytics/bx$lmn;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const-string v0, "GETInstanceEventRequest#execute"

    invoke-static {v0}, Lcom/huawei/hms/analytics/cd;->lmn(Ljava/lang/String;)Lcom/huawei/hms/analytics/cc;

    move-result-object v0

    const-string v1, "GET"

    const-string v2, "/analytics/api/events/online"

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/huawei/hms/analytics/cb;-><init>(Lcom/huawei/hms/analytics/cc;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final klm()V
    .locals 0

    invoke-super {p0}, Lcom/huawei/hms/analytics/cb;->klm()V

    return-void
.end method

.method public final onFailure(I)V
    .locals 2

    const-string v0, "GET instance event exception,errorCode: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "InstanceRequest"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/huawei/hms/analytics/cb;->lmn(I)V

    return-void
.end method

.method public final onSuccess(Lcom/huawei/hms/analytics/core/transport/net/Response;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/cb;->ikl:Lcom/huawei/hms/analytics/cc;

    const-string v1, "0"

    iput-object v1, v0, Lcom/huawei/hms/analytics/cc;->lmn:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/analytics/cb;->lmn(I)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get instance events result code : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InstanceRequest"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getContent()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "instance events config is empty"

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lcom/huawei/hms/analytics/at;->r:Lcom/huawei/hms/analytics/av;

    iget-object p1, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    const-string v0, "instance_event_info"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "global_v2"

    invoke-static {p1, v1, v0}, Lcom/huawei/hms/analytics/dl;->lmn(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, v0, Lcom/huawei/hms/analytics/at;->ghi:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/hms/analytics/ca;->lmn(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hms/analytics/av;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iput-object p1, v0, Lcom/huawei/hms/analytics/at;->r:Lcom/huawei/hms/analytics/av;

    iget-boolean p1, p1, Lcom/huawei/hms/analytics/av;->ghi:Z

    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, Lcom/huawei/hms/analytics/bx;->lmn:Lcom/huawei/hms/analytics/bx$lmn;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lcom/huawei/hms/analytics/bx$lmn;->lmn()V

    :cond_3
    return-void
.end method
