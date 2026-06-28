.class final Lcom/huawei/hmf/tasks/a/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hmf/tasks/a/i;->p(Ljava/util/concurrent/Executor;Lcom/huawei/hmf/tasks/d;)Lcom/huawei/hmf/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/huawei/hmf/tasks/g<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hmf/tasks/d;

.field final synthetic b:Lcom/huawei/hmf/tasks/a/i;

.field final synthetic c:Lcom/huawei/hmf/tasks/a/i;


# direct methods
.method constructor <init>(Lcom/huawei/hmf/tasks/a/i;Lcom/huawei/hmf/tasks/d;Lcom/huawei/hmf/tasks/a/i;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hmf/tasks/a/i$d;->c:Lcom/huawei/hmf/tasks/a/i;

    iput-object p2, p0, Lcom/huawei/hmf/tasks/a/i$d;->a:Lcom/huawei/hmf/tasks/d;

    iput-object p3, p0, Lcom/huawei/hmf/tasks/a/i$d;->b:Lcom/huawei/hmf/tasks/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/huawei/hmf/tasks/Task;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hmf/tasks/Task<",
            "TTResult;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hmf/tasks/a/i$d;->a:Lcom/huawei/hmf/tasks/d;

    invoke-interface {v0, p1}, Lcom/huawei/hmf/tasks/d;->a(Lcom/huawei/hmf/tasks/Task;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/hmf/tasks/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/huawei/hmf/tasks/a/i$d;->b:Lcom/huawei/hmf/tasks/a/i;

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Continuation returned null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/huawei/hmf/tasks/a/i;->z(Ljava/lang/Exception;)V

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/hmf/tasks/a/i$d$a;

    invoke-direct {v0, p0}, Lcom/huawei/hmf/tasks/a/i$d$a;-><init>(Lcom/huawei/hmf/tasks/a/i$d;)V

    invoke-virtual {p1, v0}, Lcom/huawei/hmf/tasks/Task;->e(Lcom/huawei/hmf/tasks/g;)Lcom/huawei/hmf/tasks/Task;

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/huawei/hmf/tasks/a/i$d;->b:Lcom/huawei/hmf/tasks/a/i;

    invoke-virtual {v0, p1}, Lcom/huawei/hmf/tasks/a/i;->z(Ljava/lang/Exception;)V

    return-void
.end method
