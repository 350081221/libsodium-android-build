.class final Lcom/yuanqi/group/home/HomeViewModel$o$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeViewModel$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic this$0:Lcom/yuanqi/group/home/HomeViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeViewModel;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$o$b;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    iput-object p2, p0, Lcom/yuanqi/group/home/HomeViewModel$o$b;->$context:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeViewModel$o$b;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel$o$b;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeViewModel;->d(Lcom/yuanqi/group/home/HomeViewModel;)V

    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel$o$b;->$context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/yuanqi/group/home/HomeViewModel$o$b;->$context:Landroid/content/Context;

    const-class v3, Lcom/yuanqi/master/mine/MineActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    sget-object v2, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    invoke-virtual {v2}, Lcom/yuanqi/master/mine/account/a;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "screen"

    const-string v3, "/mine/buyVip"

    .line 5
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    :cond_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
