.class public Lcom/tendcloud/tenddata/cc$b;
.super Lcom/tendcloud/tenddata/by$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/cc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/cc;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/cc;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/cc$b;->this$0:Lcom/tendcloud/tenddata/cc;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/by$a;-><init>()V

    return-void
.end method


# virtual methods
.method public callback(IJZFDLjava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "SSSS"

    aput-object v2, v0, v1

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OAIDLimitCallback.callback("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p6, p7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    return-void
.end method

.method public callback(ILandroid/os/Bundle;)V
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "SSSS-AdvertisingIdPlatform"

    aput-object v3, v1, v2

    .line 2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "OAIDCallBack handleResult retCode="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " retInfo= "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v1, v5

    invoke-static {v1}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    if-nez p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/cc$b;->this$0:Lcom/tendcloud/tenddata/cc;

    iget-object p1, p1, Lcom/tendcloud/tenddata/cc;->a:Lcom/tendcloud/tenddata/cb$a;

    if-eqz p1, :cond_2

    const-string p1, "oa_id_limit_state"

    .line 4
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    .line 5
    iget-object p2, p0, Lcom/tendcloud/tenddata/cc$b;->this$0:Lcom/tendcloud/tenddata/cc;

    iget-object p2, p2, Lcom/tendcloud/tenddata/cc;->a:Lcom/tendcloud/tenddata/cb$a;

    iput-boolean p1, p2, Lcom/tendcloud/tenddata/cb$a;->isLimit:Z

    new-array p2, v0, [Ljava/lang/String;

    aput-object v3, p2, v2

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OAIDLimitCallback handleResult success  isLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v5

    invoke-static {p2}, Lcom/tendcloud/tenddata/h;->iForInternal([Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-array p2, v0, [Ljava/lang/String;

    aput-object v3, p2, v2

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OAIDLimitCallback handleResult error retCode= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v5

    invoke-static {p2}, Lcom/tendcloud/tenddata/h;->eForInternal([Ljava/lang/String;)V

    .line 8
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/cc$b;->this$0:Lcom/tendcloud/tenddata/cc;

    iget-object p1, p1, Lcom/tendcloud/tenddata/cc;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
