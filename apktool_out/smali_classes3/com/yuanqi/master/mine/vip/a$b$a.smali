.class final Lcom/yuanqi/master/mine/vip/a$b$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/vip/a$b;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

.field final synthetic $navController:Landroidx/navigation/NavHostController;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/mine/MineViewModel;Landroidx/navigation/NavHostController;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/mine/vip/a$b$a;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/mine/vip/a$b$a;->$navController:Landroidx/navigation/NavHostController;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/mine/vip/a$b$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/mine/vip/a$b$a;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineViewModel;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/mine/vip/a$b$a;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/mine/MineViewModel;->R(Z)V

    .line 4
    sget-object v0, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/mine/vip/a$b$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-virtual {v0}, Landroidx/navigation/NavController;->popBackStack()Z

    :cond_1
    :goto_0
    return-void
.end method
