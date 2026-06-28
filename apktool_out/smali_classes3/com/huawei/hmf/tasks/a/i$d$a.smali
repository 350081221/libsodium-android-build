.class final Lcom/huawei/hmf/tasks/a/i$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hmf/tasks/a/i$d;->onComplete(Lcom/huawei/hmf/tasks/Task;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/huawei/hmf/tasks/g<",
        "TTContinuationResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hmf/tasks/a/i$d;


# direct methods
.method constructor <init>(Lcom/huawei/hmf/tasks/a/i$d;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hmf/tasks/a/i$d$a;->a:Lcom/huawei/hmf/tasks/a/i$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/huawei/hmf/tasks/Task;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hmf/tasks/Task<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hmf/tasks/a/i$d$a;->a:Lcom/huawei/hmf/tasks/a/i$d;

    iget-object v0, v0, Lcom/huawei/hmf/tasks/a/i$d;->b:Lcom/huawei/hmf/tasks/a/i;

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->r()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/huawei/hmf/tasks/a/i;->A(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/huawei/hmf/tasks/a/i$d$a;->a:Lcom/huawei/hmf/tasks/a/i$d;

    iget-object p1, p1, Lcom/huawei/hmf/tasks/a/i$d;->b:Lcom/huawei/hmf/tasks/a/i;

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/a/i;->B()Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/hmf/tasks/a/i$d$a;->a:Lcom/huawei/hmf/tasks/a/i$d;

    iget-object v0, v0, Lcom/huawei/hmf/tasks/a/i$d;->b:Lcom/huawei/hmf/tasks/a/i;

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->q()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/huawei/hmf/tasks/a/i;->z(Ljava/lang/Exception;)V

    return-void
.end method
