.class Lcom/huawei/agconnect/credential/obs/ad$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/hmf/tasks/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/huawei/hmf/tasks/g<",
        "Lcom/huawei/agconnect/credential/obs/z;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hmf/tasks/k;

.field final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field final synthetic c:Lcom/huawei/agconnect/credential/obs/ad;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/credential/obs/ad;Lcom/huawei/hmf/tasks/k;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    iput-object p2, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->a:Lcom/huawei/hmf/tasks/k;

    iput-object p3, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/huawei/hmf/tasks/Task;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hmf/tasks/Task<",
            "Lcom/huawei/agconnect/credential/obs/z;",
            ">;)V"
        }
    .end annotation

    const-string v0, "CredentialsProviderImpl"

    const-string v1, "onComplete"

    invoke-static {v0, v1}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->v()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->a:Lcom/huawei/hmf/tasks/k;

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->q()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->r()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/agconnect/credential/obs/z;

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/z;->getRet()Lcom/huawei/agconnect/credential/obs/aa;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/z;->getRet()Lcom/huawei/agconnect/credential/obs/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/aa;->getCode()I

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/huawei/agconnect/exception/AGCServerException;

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/z;->getRet()Lcom/huawei/agconnect/credential/obs/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/agconnect/credential/obs/aa;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/z;->getRet()Lcom/huawei/agconnect/credential/obs/aa;

    move-result-object p1

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/aa;->getCode()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/huawei/agconnect/exception/AGCServerException;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->a:Lcom/huawei/hmf/tasks/k;

    invoke-virtual {p1, v0}, Lcom/huawei/hmf/tasks/k;->c(Ljava/lang/Exception;)V

    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    new-instance v1, Lcom/huawei/agconnect/credential/obs/ab;

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/z;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/z;->getExpiresIn()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lcom/huawei/agconnect/credential/obs/ab;-><init>(Ljava/lang/String;J)V

    invoke-static {v0, v1}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;Lcom/huawei/agconnect/credential/obs/ab;)Lcom/huawei/agconnect/credential/obs/ab;

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/ac;->a()Lcom/huawei/agconnect/credential/obs/ac;

    move-result-object p1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {v0}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;)Lcom/huawei/agconnect/credential/obs/ab;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {v1}, Lcom/huawei/agconnect/credential/obs/ad;->b(Lcom/huawei/agconnect/credential/obs/ad;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/huawei/agconnect/credential/obs/ac;->a(Lcom/huawei/agconnect/credential/obs/ab;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/ac;->a()Lcom/huawei/agconnect/credential/obs/ac;

    move-result-object p1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {v0}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;)Lcom/huawei/agconnect/credential/obs/ab;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {v1}, Lcom/huawei/agconnect/credential/obs/ad;->b(Lcom/huawei/agconnect/credential/obs/ad;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/huawei/agconnect/credential/obs/ac;->b(Lcom/huawei/agconnect/credential/obs/ab;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/agconnect/credential/obs/ac;->a()Lcom/huawei/agconnect/credential/obs/ac;

    move-result-object p1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {v0}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;)Lcom/huawei/agconnect/credential/obs/ab;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {v1}, Lcom/huawei/agconnect/credential/obs/ad;->b(Lcom/huawei/agconnect/credential/obs/ad;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/huawei/agconnect/credential/obs/ac;->c(Lcom/huawei/agconnect/credential/obs/ab;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;J)J

    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->a:Lcom/huawei/hmf/tasks/k;

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$2;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {v0}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;)Lcom/huawei/agconnect/credential/obs/ab;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    return-void
.end method
