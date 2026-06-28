.class final Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b;->invoke(Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic $appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $scope:Lkotlinx/coroutines/s0;

.field final synthetic $searchStr:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

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
.method constructor <init>(Ljava/util/ArrayList;Lkotlinx/coroutines/s0;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroid/content/Context;Lkotlin/jvm/internal/k1$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lkotlinx/coroutines/s0;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$selectAppList:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$scope:Lkotlinx/coroutines/s0;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$context:Landroid/content/Context;

    iput-object p6, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$searchStr:Lkotlin/jvm/internal/k1$h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 10

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$selectAppList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$scope:Lkotlinx/coroutines/s0;

    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a$a;

    iget-object v5, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v6, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v7, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$context:Landroid/content/Context;

    iget-object v8, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a;->$searchStr:Lkotlin/jvm/internal/k1$h;

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b$a$a;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroid/content/Context;Lkotlin/jvm/internal/k1$h;Lkotlin/coroutines/d;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method
