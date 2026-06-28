.class Lcom/huawei/agconnect/credential/obs/l$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hmf/tasks/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/credential/obs/l$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/huawei/hmf/tasks/g<",
        "Lcom/huawei/agconnect/credential/obs/ah;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/agconnect/credential/obs/l$1;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/credential/obs/l$1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/l$1$1;->a:Lcom/huawei/agconnect/credential/obs/l$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/huawei/hmf/tasks/Task;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/huawei/hmf/tasks/Task<",
            "Lcom/huawei/agconnect/credential/obs/ah;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const v1, 0x2a301

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const v1, 0x15180

    add-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "default ttl="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AGCHost"

    invoke-static {v2, v1}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hmf/tasks/Task;->r()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/huawei/agconnect/credential/obs/ah;

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/l$1$1;->a:Lcom/huawei/agconnect/credential/obs/l$1;

    iget-object v3, v1, Lcom/huawei/agconnect/credential/obs/l$1;->b:Lcom/huawei/agconnect/credential/obs/l;

    iget-object v1, v1, Lcom/huawei/agconnect/credential/obs/l$1;->a:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-static {v3, v1, p1}, Lcom/huawei/agconnect/credential/obs/l;->a(Lcom/huawei/agconnect/credential/obs/l;Lcom/huawei/agconnect/AGConnectInstance;Lcom/huawei/agconnect/credential/obs/ah;)V

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/agconnect/credential/obs/ah;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "parse ttl failed, use default instead"

    invoke-static {v2, p1}, Lcom/huawei/agconnect/common/api/Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/huawei/agconnect/credential/obs/l$1$1;->a:Lcom/huawei/agconnect/credential/obs/l$1;

    iget-object v1, p1, Lcom/huawei/agconnect/credential/obs/l$1;->b:Lcom/huawei/agconnect/credential/obs/l;

    iget-object p1, p1, Lcom/huawei/agconnect/credential/obs/l$1;->a:Lcom/huawei/agconnect/AGConnectInstance;

    invoke-virtual {p1}, Lcom/huawei/agconnect/AGConnectInstance;->getIdentifier()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v0, p1}, Lcom/huawei/agconnect/credential/obs/l;->a(Lcom/huawei/agconnect/credential/obs/l;ILjava/lang/String;)V

    return-void
.end method
