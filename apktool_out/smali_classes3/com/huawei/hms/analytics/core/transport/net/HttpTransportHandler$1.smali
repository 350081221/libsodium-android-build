.class final Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->execute(Lcom/huawei/hms/analytics/core/transport/CallbackListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

.field final synthetic b:Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;


# direct methods
.method constructor <init>(Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;Lcom/huawei/hms/analytics/core/transport/CallbackListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;->b:Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;

    iput-object p2, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;->a:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;->a:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;->b:Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler;->execute()Lcom/huawei/hms/analytics/core/transport/net/Response;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v1

    const/16 v2, 0xc8

    if-eq v2, v1, :cond_0

    iget-object v1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;->a:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

    invoke-virtual {v0}, Lcom/huawei/hms/analytics/core/transport/net/Response;->getHttpCode()I

    move-result v0

    invoke-interface {v1, v0}, Lcom/huawei/hms/analytics/core/transport/CallbackListener;->onFailure(I)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/huawei/hms/analytics/core/transport/net/HttpTransportHandler$1;->a:Lcom/huawei/hms/analytics/core/transport/CallbackListener;

    invoke-interface {v1, v0}, Lcom/huawei/hms/analytics/core/transport/CallbackListener;->onSuccess(Lcom/huawei/hms/analytics/core/transport/net/Response;)V

    :cond_1
    return-void
.end method
