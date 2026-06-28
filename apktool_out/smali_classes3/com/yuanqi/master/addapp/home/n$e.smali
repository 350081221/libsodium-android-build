.class final Lcom/yuanqi/master/addapp/home/n$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/n;->b(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;II)V
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
        "SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,676:1\n154#2:677\n154#2:712\n69#3,5:678\n74#3:711\n78#3:717\n79#4,11:683\n92#4:716\n456#5,8:694\n464#5,3:708\n467#5,3:713\n3737#6,6:702\n81#7:718\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1\n*L\n434#1:677\n439#1:712\n432#1:678,5\n432#1:711\n432#1:717\n432#1:683,11\n432#1:716\n432#1:694,8\n432#1:708,3\n432#1:713,3\n432#1:702,6\n431#1:718\n*E\n"
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

.field final synthetic $boxSize:F

.field final synthetic $context:Landroid/content/Context;

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

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $scope:Lkotlinx/coroutines/s0;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/s0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroid/content/Context;FLandroidx/compose/runtime/snapshots/SnapshotStateList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/navigation/NavHostController;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lkotlinx/coroutines/s0;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Landroid/content/Context;",
            "F",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/Character;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/n$e;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e;->$navController:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/n$e;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/n$e;->$scope:Lkotlinx/coroutines/s0;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/n$e;->$gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iput-object p6, p0, Lcom/yuanqi/master/addapp/home/n$e;->$context:Landroid/content/Context;

    iput p7, p0, Lcom/yuanqi/master/addapp/home/n$e;->$boxSize:F

    iput-object p8, p0, Lcom/yuanqi/master/addapp/home/n$e;->$indexList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda$0(Lcom/airbnb/lottie/compose/LottieCompositionResult;)Lcom/airbnb/lottie/k;
    .locals 0

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/k;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/home/n$e;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 25
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

    move-object/from16 v15, p1

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

    goto/16 :goto_2

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous> (SelectAppScreen.kt:139)"

    const v4, -0x6f4b070b

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    new-instance v2, Lcom/yuanqi/master/addapp/home/n$e$a;

    iget-object v3, v0, Lcom/yuanqi/master/addapp/home/n$e;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v4, v0, Lcom/yuanqi/master/addapp/home/n$e;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v2, v3, v4}, Lcom/yuanqi/master/addapp/home/n$e$a;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;)V

    const v3, 0x5dbfc9b1

    const/4 v4, 0x1

    invoke-static {v15, v3, v4, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 5
    new-instance v6, Lcom/yuanqi/master/addapp/home/n$e$b;

    iget-object v7, v0, Lcom/yuanqi/master/addapp/home/n$e;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v8, v0, Lcom/yuanqi/master/addapp/home/n$e;->$scope:Lkotlinx/coroutines/s0;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/n$e;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v10, v0, Lcom/yuanqi/master/addapp/home/n$e;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v6, v7, v8, v9, v10}, Lcom/yuanqi/master/addapp/home/n$e$b;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/s0;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;)V

    const v7, -0x1c99ca32

    invoke-static {v15, v7, v4, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    .line 6
    new-instance v13, Lcom/yuanqi/master/addapp/home/n$e$c;

    iget-object v14, v0, Lcom/yuanqi/master/addapp/home/n$e;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v12, v0, Lcom/yuanqi/master/addapp/home/n$e;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v10, v0, Lcom/yuanqi/master/addapp/home/n$e;->$gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iget-object v11, v0, Lcom/yuanqi/master/addapp/home/n$e;->$context:Landroid/content/Context;

    iget v8, v0, Lcom/yuanqi/master/addapp/home/n$e;->$boxSize:F

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/n$e;->$scope:Lkotlinx/coroutines/s0;

    iget-object v7, v0, Lcom/yuanqi/master/addapp/home/n$e;->$indexList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-object/from16 v16, v13

    move-object/from16 v17, v14

    move-object/from16 v18, v12

    move-object/from16 v19, v10

    move-object/from16 v20, v11

    move/from16 v21, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v7

    invoke-direct/range {v16 .. v23}, Lcom/yuanqi/master/addapp/home/n$e$c;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroid/content/Context;FLkotlinx/coroutines/s0;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V

    const v7, 0xd1b0406

    invoke-static {v15, v7, v4, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v12

    const v14, 0x30006030

    const/16 v16, 0x1ed

    move-object v4, v5

    move-object v5, v6

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v13, p1

    move/from16 v15, v16

    .line 7
    invoke-static/range {v1 .. v15}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 8
    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/n$e;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->E()Landroidx/compose/runtime/MutableState;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_7

    const v1, 0x7f110004

    .line 9
    invoke-static {v1}, Lcom/airbnb/lottie/compose/i$e;->b(I)I

    move-result v1

    invoke-static {v1}, Lcom/airbnb/lottie/compose/i$e;->a(I)Lcom/airbnb/lottie/compose/i$e;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    const/16 v9, 0x3e

    move-object/from16 v7, p1

    invoke-static/range {v1 .. v9}, Lcom/airbnb/lottie/compose/r;->v(Lcom/airbnb/lottie/compose/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;

    move-result-object v1

    .line 10
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v3, 0xc8

    int-to-float v3, v3

    .line 11
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 12
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 13
    invoke-static {}, Lcom/yuanqi/master/theme/b;->g()J

    move-result-wide v5

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 14
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v4

    const v5, 0x2bb5b5d7

    move-object/from16 v15, p1

    .line 15
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    .line 16
    invoke-static {v4, v6, v15, v5}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v4

    const v5, -0x4ee9b9da

    .line 17
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 18
    invoke-static {v15, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 19
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v7

    .line 20
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    move-result-object v9

    .line 21
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    move-result-object v3

    .line 22
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v10

    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    if-nez v10, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 23
    :cond_3
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 24
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v10

    if-eqz v10, :cond_4

    .line 25
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    goto :goto_1

    .line 26
    :cond_4
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 27
    :goto_1
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .line 28
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    move-result-object v10

    invoke-static {v9, v4, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 29
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    move-result-object v4

    invoke-static {v9, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 30
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    move-result-object v4

    .line 31
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    .line 32
    :cond_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 33
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 34
    :cond_6
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v4

    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v4, v15, v5}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    .line 35
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 36
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    const/16 v3, 0x64

    int-to-float v3, v3

    .line 37
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 38
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1}, Lcom/yuanqi/master/addapp/home/n$e;->invoke$lambda$0(Lcom/airbnb/lottie/compose/LottieCompositionResult;)Lcom/airbnb/lottie/k;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x38

    const/16 v23, 0x0

    const v24, 0xffffc

    move-object/from16 v21, p1

    .line 39
    invoke-static/range {v1 .. v24}, Lcom/airbnb/lottie/compose/d;->b(Lcom/airbnb/lottie/k;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/g;FIZZZLcom/airbnb/lottie/j1;ZZLcom/airbnb/lottie/compose/k;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/a;Landroidx/compose/runtime/Composer;III)V

    .line 40
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 41
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 42
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 43
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 44
    :cond_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_8
    :goto_2
    return-void
.end method
