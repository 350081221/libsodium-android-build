.class final Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
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
.field final synthetic $historyList:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lv2/c;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/yuanqi/master/location/HistoryActivity;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/location/HistoryActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lv2/c;",
            ">;",
            "Lcom/yuanqi/master/location/HistoryActivity;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a;->$historyList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p2, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
    .locals 8
    .param p1    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a;->$historyList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a$a;

    iget-object v1, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a;->$historyList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v5, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    invoke-direct {v0, v1, v5}, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a$a;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/location/HistoryActivity;)V

    const v1, -0x7346e059

    const/4 v5, 0x1

    invoke-static {v1, v5, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/lazy/LazyListScope;->items$default(Landroidx/compose/foundation/lazy/LazyListScope;ILv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    return-void
.end method
