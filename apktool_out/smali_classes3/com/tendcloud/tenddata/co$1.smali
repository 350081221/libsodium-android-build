.class Lcom/tendcloud/tenddata/co$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/co;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/co;


# direct methods
.method constructor <init>(Lcom/tendcloud/tenddata/co;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/co$1;->this$0:Lcom/tendcloud/tenddata/co;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, Lcom/tendcloud/tenddata/a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Lcom/tendcloud/tenddata/a;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tendcloud/tenddata/co$1;->this$0:Lcom/tendcloud/tenddata/co;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/co;->a(Lcom/tendcloud/tenddata/co;Lcom/tendcloud/tenddata/a;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/co$1;->this$0:Lcom/tendcloud/tenddata/co;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/tendcloud/tenddata/co;->a(Lcom/tendcloud/tenddata/co;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :catchall_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
