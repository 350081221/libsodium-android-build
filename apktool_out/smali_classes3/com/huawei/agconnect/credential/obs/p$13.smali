.class final Lcom/huawei/agconnect/credential/obs/p$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/credential/obs/p;->c(Lcom/huawei/agconnect/common/api/BaseRequest;ILjava/lang/Class;Lcom/huawei/hmf/tasks/k;Lcom/huawei/agconnect/common/api/BackendService$Options;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/huawei/hmf/tasks/i<",
        "TRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hmf/tasks/k;


# direct methods
.method constructor <init>(Lcom/huawei/hmf/tasks/k;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/p$13;->a:Lcom/huawei/hmf/tasks/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRsp;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/p$13;->a:Lcom/huawei/hmf/tasks/k;

    invoke-virtual {v0, p1}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    return-void
.end method
