.class final Lcom/yuanqi/master/start/StartActivity$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/start/StartActivity$a;->onAnimationEnd(Landroid/animation/Animator;)V
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
.field final synthetic this$0:Lcom/yuanqi/master/start/StartActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/start/StartActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/start/StartActivity$a$a;->this$0:Lcom/yuanqi/master/start/StartActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/start/StartActivity$a$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/start/StartActivity$a$a;->this$0:Lcom/yuanqi/master/start/StartActivity;

    invoke-static {v0}, Lcom/yuanqi/master/start/StartActivity;->E(Lcom/yuanqi/master/start/StartActivity;)V

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/start/StartActivity$a$a;->this$0:Lcom/yuanqi/master/start/StartActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/umeng/commonsdk/UMConfigure;->submitPolicyGrantResult(Landroid/content/Context;Z)V

    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/start/StartActivity$a$a;->this$0:Lcom/yuanqi/master/start/StartActivity;

    invoke-static {v0}, Lcom/yuanqi/master/start/StartActivity;->D(Lcom/yuanqi/master/start/StartActivity;)V

    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/start/StartActivity$a$a;->this$0:Lcom/yuanqi/master/start/StartActivity;

    invoke-static {v0, v1}, Lcom/yuanqi/master/start/StartActivity;->H(Lcom/yuanqi/master/start/StartActivity;I)V

    .line 6
    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/t0;->a(Lkotlin/coroutines/g;)Lkotlinx/coroutines/s0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/yuanqi/master/start/StartActivity$a$a$a;

    iget-object v0, p0, Lcom/yuanqi/master/start/StartActivity$a$a;->this$0:Lcom/yuanqi/master/start/StartActivity;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lcom/yuanqi/master/start/StartActivity$a$a$a;-><init>(Lcom/yuanqi/master/start/StartActivity;Lkotlin/coroutines/d;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method
