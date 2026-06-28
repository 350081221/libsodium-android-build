.class final Lcom/yuanqi/master/addapp/home/n$e$b$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/n$e$b;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $scope:Lkotlinx/coroutines/s0;

.field final synthetic $selectAppList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lkotlinx/coroutines/s0;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lkotlinx/coroutines/s0;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/navigation/NavHostController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$selectAppList:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$scope:Lkotlinx/coroutines/s0;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$navController:Landroidx/navigation/NavHostController;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/n$e$b$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$selectAppList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$scope:Lkotlinx/coroutines/s0;

    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcom/yuanqi/master/addapp/home/n$e$b$a$a;

    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v5, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$selectAppList:Ljava/util/ArrayList;

    iget-object v6, p0, Lcom/yuanqi/master/addapp/home/n$e$b$a;->$navController:Landroidx/navigation/NavHostController;

    const/4 v7, 0x0

    invoke-direct {v4, v0, v5, v6, v7}, Lcom/yuanqi/master/addapp/home/n$e$b$a$a;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Ljava/util/ArrayList;Landroidx/navigation/NavHostController;Lkotlin/coroutines/d;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method
