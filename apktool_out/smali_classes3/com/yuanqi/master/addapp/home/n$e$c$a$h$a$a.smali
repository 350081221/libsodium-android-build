.class final Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$8$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n223#2,2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$8$1$1\n*L\n372#1:677,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

.field final synthetic $appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

.field final synthetic $indexList:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $it:I

.field final synthetic $scope:Lkotlinx/coroutines/s0;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;ILandroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/s0;Landroidx/compose/foundation/lazy/grid/LazyGridState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/Character;",
            ">;I",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lkotlinx/coroutines/s0;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$indexList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput p3, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$it:I

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$scope:Lkotlinx/coroutines/s0;

    iput-object p6, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 10

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppViewModel;->C()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$indexList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget v2, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$it:I

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Character;

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yuanqi/group/home/models/c;

    .line 7
    iget-object v3, v2, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->C()Landroidx/compose/runtime/MutableState;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 8
    iget-object v4, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$scope:Lkotlinx/coroutines/s0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a$a;

    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    const/4 v3, 0x0

    invoke-direct {v7, v0, v1, v2, v3}, Lcom/yuanqi/master/addapp/home/n$e$c$a$h$a$a$a;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/group/home/models/c;Lkotlin/coroutines/d;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void

    .line 9
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
