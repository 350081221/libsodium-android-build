.class final Lcom/yuanqi/group/home/HomeActivity$r;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity;->onResume()V
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
.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$r;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeActivity$r;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$r;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeActivity;->w0()Lcom/yuanqi/group/home/HomeViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeViewModel;->G()Lkotlinx/coroutines/s0;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcom/yuanqi/group/home/HomeActivity$r$a;

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$r;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lcom/yuanqi/group/home/HomeActivity$r$a;-><init>(Lcom/yuanqi/group/home/HomeActivity;Lkotlin/coroutines/d;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method
