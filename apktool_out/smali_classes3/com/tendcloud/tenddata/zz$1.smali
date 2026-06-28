.class final Lcom/tendcloud/tenddata/zz$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/zz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/cp;->a()Lcom/tendcloud/tenddata/cp;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/tendcloud/tenddata/co;->a()Lcom/tendcloud/tenddata/co;

    .line 5
    .line 6
    .line 7
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    instance-of v0, p1, Lcom/tendcloud/tenddata/zz$a;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lcom/tendcloud/tenddata/zz$a;

    .line 16
    .line 17
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    :catchall_0
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
.end method
