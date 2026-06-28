.class Lcom/huawei/agconnect/common/api/HaConnector$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/common/api/HaConnector$1;->onNetWorkReady()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/agconnect/common/api/HaConnector$1;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/common/api/HaConnector$1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/common/api/HaConnector$1$2;->this$1:Lcom/huawei/agconnect/common/api/HaConnector$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector$1$2;->this$1:Lcom/huawei/agconnect/common/api/HaConnector$1;

    iget-object v0, v0, Lcom/huawei/agconnect/common/api/HaConnector$1;->this$0:Lcom/huawei/agconnect/common/api/HaConnector;

    invoke-static {v0}, Lcom/huawei/agconnect/common/api/HaConnector;->access$200(Lcom/huawei/agconnect/common/api/HaConnector;)Lcom/huawei/agconnect/credential/obs/ak;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "HaConnector"

    const-string v1, "Auto onReport"

    invoke-static {v0, v1}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/HaConnector$1$2;->this$1:Lcom/huawei/agconnect/common/api/HaConnector$1;

    iget-object v0, v0, Lcom/huawei/agconnect/common/api/HaConnector$1;->this$0:Lcom/huawei/agconnect/common/api/HaConnector;

    invoke-static {v0}, Lcom/huawei/agconnect/common/api/HaConnector;->access$200(Lcom/huawei/agconnect/common/api/HaConnector;)Lcom/huawei/agconnect/credential/obs/ak;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/agconnect/credential/obs/ak;->a()V

    :cond_0
    return-void
.end method
