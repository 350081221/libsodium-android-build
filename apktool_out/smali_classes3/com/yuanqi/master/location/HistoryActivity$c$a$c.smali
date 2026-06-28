.class final Lcom/yuanqi/master/location/HistoryActivity$c$a$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/HistoryActivity$c$a;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "(Landroidx/compose/runtime/Composer;I)V"
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
.method constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/location/HistoryActivity;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lv2/c;",
            ">;",
            "Lcom/yuanqi/master/location/HistoryActivity;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;->$historyList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p2, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    iput-object p3, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;->$context:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HistoryActivity.kt:80)"

    const v2, 0xa7e423c

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const-string v3, "\u5386\u53f2\u8bb0\u5f55"

    new-instance p2, Lcom/yuanqi/master/location/HistoryActivity$c$a$c$a;

    iget-object v0, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;->$historyList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v1, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    iget-object v2, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;->$context:Landroid/content/Context;

    invoke-direct {p2, v0, v1, v2}, Lcom/yuanqi/master/location/HistoryActivity$c$a$c$a;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/location/HistoryActivity;Landroid/content/Context;)V

    const v0, 0x4bd1e4c1    # 2.751117E7f

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    sget-object v5, Lcom/yuanqi/master/location/HistoryActivity$c$a$c$b;->INSTANCE:Lcom/yuanqi/master/location/HistoryActivity$c$a$c$b;

    const/16 v7, 0x1b6

    const/4 v8, 0x0

    move-object v6, p1

    invoke-static/range {v3 .. v8}, Lcom/yuanqi/master/tools/a;->f(Ljava/lang/String;Lv3/q;Lv3/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    :goto_1
    return-void
.end method
