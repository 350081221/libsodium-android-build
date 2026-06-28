.class final Lcom/yuanqi/master/mine/account/g$i;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/account/g;->b(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $code:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $phone:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/navigation/NavHostController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/mine/MineViewModel;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/navigation/NavHostController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/mine/account/g$i;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/mine/account/g$i;->$phone:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/yuanqi/master/mine/account/g$i;->$code:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/yuanqi/master/mine/account/g$i;->$navController:Landroidx/navigation/NavHostController;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/mine/account/g$i;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/mine/account/g$i;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/mine/account/g$i;->$phone:Landroidx/compose/runtime/MutableState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/yuanqi/master/mine/account/g$i;->$code:Landroidx/compose/runtime/MutableState;

    invoke-interface {v2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 4
    new-instance v3, Lcom/yuanqi/master/mine/account/g$i$a;

    iget-object v4, p0, Lcom/yuanqi/master/mine/account/g$i;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    iget-object v5, p0, Lcom/yuanqi/master/mine/account/g$i;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v3, v4, v5}, Lcom/yuanqi/master/mine/account/g$i$a;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Landroidx/navigation/NavHostController;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/yuanqi/master/mine/MineViewModel;->H(Ljava/lang/String;Ljava/lang/String;Lv3/a;)V

    return-void
.end method
