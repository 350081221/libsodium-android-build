.class final Lcom/huawei/agconnect/credential/obs/p$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/credential/obs/p;->b(Lcom/huawei/agconnect/common/api/BaseRequest;ILjava/lang/Class;Lcom/huawei/agconnect/common/api/BackendService$Options;)Lcom/huawei/hmf/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/agconnect/common/api/RequestThrottle$Throttle;

.field final synthetic b:Lcom/huawei/hmf/tasks/k;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/common/api/RequestThrottle$Throttle;Lcom/huawei/hmf/tasks/k;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/p$5;->a:Lcom/huawei/agconnect/common/api/RequestThrottle$Throttle;

    iput-object p2, p0, Lcom/huawei/agconnect/credential/obs/p$5;->b:Lcom/huawei/hmf/tasks/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/p$5;->a:Lcom/huawei/agconnect/common/api/RequestThrottle$Throttle;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/common/api/RequestThrottle$Throttle;->checkFail(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/p$5;->a:Lcom/huawei/agconnect/common/api/RequestThrottle$Throttle;

    invoke-virtual {v0}, Lcom/huawei/agconnect/common/api/RequestThrottle$Throttle;->addForFail()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/p$5;->b:Lcom/huawei/hmf/tasks/k;

    invoke-virtual {v0, p1}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    return-void
.end method
