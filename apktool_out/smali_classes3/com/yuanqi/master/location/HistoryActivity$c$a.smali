.class final Lcom/yuanqi/master/location/HistoryActivity$c$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/HistoryActivity$c;->invoke(Landroidx/compose/runtime/Composer;I)V
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity$onCreate$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,141:1\n74#2:142\n25#3:143\n1116#4,6:144\n*S KotlinDebug\n*F\n+ 1 HistoryActivity.kt\ncom/yuanqi/master/location/HistoryActivity$onCreate$1$1\n*L\n66#1:142\n68#1:143\n68#1:144,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yuanqi/master/location/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/location/HistoryActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/location/HistoryActivity$c$a;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_1

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.yuanqi.master.location.HistoryActivity.onCreate.<anonymous>.<anonymous> (HistoryActivity.kt:65)"

    const v4, -0x3e8bd588

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    .line 5
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    .line 6
    check-cast v1, Landroid/content/Context;

    .line 7
    iget-object v2, v0, Lcom/yuanqi/master/location/HistoryActivity$c$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    const v3, -0x1d58f75c

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 8
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 9
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_3

    .line 10
    invoke-static {v2}, Lcom/yuanqi/master/location/HistoryActivity;->C(Lcom/yuanqi/master/location/HistoryActivity;)Lcom/yuanqi/master/location/HistoryViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yuanqi/master/location/HistoryViewModel;->b()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v3

    .line 11
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 12
    :cond_3
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 13
    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 14
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v4, Lcom/yuanqi/master/location/HistoryActivity$c$a$a;

    iget-object v5, v0, Lcom/yuanqi/master/location/HistoryActivity$c$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Lcom/yuanqi/master/location/HistoryActivity$c$a$a;-><init>(Lcom/yuanqi/master/location/HistoryActivity;Lkotlin/coroutines/d;)V

    const/16 v5, 0x46

    invoke-static {v2, v4, v13, v5}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 15
    sget-object v2, Lcom/yuanqi/master/location/HistoryActivity$c$a$b;->INSTANCE:Lcom/yuanqi/master/location/HistoryActivity$c$a$b;

    const/16 v4, 0x30

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v5, v2, v13, v4, v6}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLv3/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x0

    .line 16
    new-instance v4, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;

    iget-object v5, v0, Lcom/yuanqi/master/location/HistoryActivity$c$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    invoke-direct {v4, v3, v5, v1}, Lcom/yuanqi/master/location/HistoryActivity$c$a$c;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/location/HistoryActivity;Landroid/content/Context;)V

    const v1, 0xa7e423c

    invoke-static {v13, v1, v6, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v14, 0x0

    .line 17
    new-instance v1, Lcom/yuanqi/master/location/HistoryActivity$c$a$d;

    iget-object v12, v0, Lcom/yuanqi/master/location/HistoryActivity$c$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    invoke-direct {v1, v3, v12}, Lcom/yuanqi/master/location/HistoryActivity$c$a$d;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/location/HistoryActivity;)V

    const v3, 0x5640fd47

    invoke-static {v13, v3, v6, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v12

    const v16, 0x30000030

    const/16 v17, 0x1fd

    move-object v1, v2

    move-object v2, v4

    move-object v3, v5

    move-object v4, v7

    move-object v5, v8

    move v6, v9

    move-wide v7, v10

    move-wide v9, v14

    const/4 v11, 0x0

    move-object/from16 v13, p1

    move/from16 v14, v16

    move/from16 v15, v17

    .line 18
    invoke-static/range {v1 .. v15}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    :goto_1
    return-void
.end method
