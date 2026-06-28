.class Lcom/huawei/agconnect/credential/obs/l$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/credential/obs/l;->a(Lcom/huawei/agconnect/AGConnectInstance;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/agconnect/AGConnectInstance;

.field final synthetic b:Lcom/huawei/agconnect/credential/obs/l;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/credential/obs/l;Lcom/huawei/agconnect/AGConnectInstance;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/l$1;->b:Lcom/huawei/agconnect/credential/obs/l;

    iput-object p2, p0, Lcom/huawei/agconnect/credential/obs/l$1;->a:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "AGCHost"

    const-string v1, "getCachedHostAsync#start"

    invoke-static {v0, v1}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/agconnect/credential/obs/ag;

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/l$1;->a:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-direct {v0, v1}, Lcom/huawei/agconnect/credential/obs/ag;-><init>(Lcom/huawei/agconnect/AGConnectInstance;)V

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/l$1;->b:Lcom/huawei/agconnect/credential/obs/l;

    invoke-static {v1}, Lcom/huawei/agconnect/credential/obs/l;->a(Lcom/huawei/agconnect/credential/obs/l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/credential/obs/ag;->a(Ljava/lang/String;)V

    new-instance v1, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;

    invoke-direct {v1}, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;-><init>()V

    iget-object v2, p0, Lcom/huawei/agconnect/credential/obs/l$1;->a:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;->app(Lcom/huawei/agconnect/AGConnectInstance;)Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;->clientToken(Z)Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/agconnect/common/api/BackendService$Options$Builder;->build()Lcom/huawei/agconnect/common/api/BackendService$Options;

    move-result-object v1

    const/4 v2, 0x1

    const-class v3, Lcom/huawei/agconnect/credential/obs/ah;

    invoke-static {v0, v2, v3, v1}, Lcom/huawei/agconnect/common/api/BackendService;->sendRequest(Lcom/huawei/agconnect/common/api/BaseRequest;ILjava/lang/Class;Lcom/huawei/agconnect/common/api/BackendService$Options;)Lcom/huawei/hmf/tasks/Task;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hmf/tasks/l;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/huawei/agconnect/credential/obs/l$1$1;

    invoke-direct {v2, p0}, Lcom/huawei/agconnect/credential/obs/l$1$1;-><init>(Lcom/huawei/agconnect/credential/obs/l$1;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hmf/tasks/Task;->f(Ljava/util/concurrent/Executor;Lcom/huawei/hmf/tasks/g;)Lcom/huawei/hmf/tasks/Task;

    return-void
.end method
