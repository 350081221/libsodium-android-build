.class Lcom/huawei/agconnect/credential/obs/ad$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/credential/obs/ad;->getTokens(Z)Lcom/huawei/hmf/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/huawei/hmf/tasks/k;

.field final synthetic c:Lcom/huawei/agconnect/credential/obs/ad;


# direct methods
.method constructor <init>(Lcom/huawei/agconnect/credential/obs/ad;ZLcom/huawei/hmf/tasks/k;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->c:Lcom/huawei/agconnect/credential/obs/ad;

    iput-boolean p2, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->a:Z

    iput-object p3, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->b:Lcom/huawei/hmf/tasks/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->c:Lcom/huawei/agconnect/credential/obs/ad;

    iget-boolean v1, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->a:Z

    invoke-static {v0, v1}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->b:Lcom/huawei/hmf/tasks/k;

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->c:Lcom/huawei/agconnect/credential/obs/ad;

    invoke-static {v1}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;)Lcom/huawei/agconnect/credential/obs/ab;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hmf/tasks/k;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->c:Lcom/huawei/agconnect/credential/obs/ad;

    iget-object v1, p0, Lcom/huawei/agconnect/credential/obs/ad$1;->b:Lcom/huawei/hmf/tasks/k;

    invoke-static {v0, v1}, Lcom/huawei/agconnect/credential/obs/ad;->a(Lcom/huawei/agconnect/credential/obs/ad;Lcom/huawei/hmf/tasks/k;)V

    :goto_0
    return-void
.end method
