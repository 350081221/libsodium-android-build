.class final Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/SearchScreenKt;->b(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;II)V
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
        "SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,447:1\n50#2:448\n49#2:449\n1116#3,6:450\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5\n*L\n314#1:448\n314#1:449\n314#1:450,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $CLICK_INTERVAL:I

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

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

.field final synthetic $lastClickTime:Lkotlin/jvm/internal/k1$g;

.field final synthetic $navController:Landroidx/navigation/NavHostController;

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

.field final synthetic $softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;


# direct methods
.method constructor <init>(Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$g;ILandroidx/navigation/NavHostController;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/addapp/AddAppViewModel;Lkotlinx/coroutines/s0;Landroid/content/Context;Landroidx/compose/foundation/lazy/grid/LazyGridState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Landroidx/compose/ui/platform/SoftwareKeyboardController;",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/jvm/internal/k1$g;",
            "I",
            "Landroidx/navigation/NavHostController;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Lkotlinx/coroutines/s0;",
            "Landroid/content/Context;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$searchStr:Lkotlin/jvm/internal/k1$h;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$lastClickTime:Lkotlin/jvm/internal/k1$g;

    iput p5, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$CLICK_INTERVAL:I

    iput-object p6, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$navController:Landroidx/navigation/NavHostController;

    iput-object p7, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p8, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p9, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$scope:Lkotlinx/coroutines/s0;

    iput-object p10, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$context:Landroid/content/Context;

    iput-object p11, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 24
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

    goto/16 :goto_1

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous> (SearchScreen.kt:147)"

    const v4, 0x1e5af21

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    invoke-static {v1, v2}, Landroidx/compose/ui/focus/FocusRequesterModifierKt;->focusRequester(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v7

    .line 5
    new-instance v2, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a;

    iget-object v3, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$searchStr:Lkotlin/jvm/internal/k1$h;

    iget-object v4, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$lastClickTime:Lkotlin/jvm/internal/k1$g;

    iget v5, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$CLICK_INTERVAL:I

    iget-object v6, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$navController:Landroidx/navigation/NavHostController;

    iget-object v10, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v11, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    invoke-direct/range {v16 .. v23}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a;-><init>(Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$g;ILandroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/addapp/AddAppViewModel;)V

    const v3, -0x62da71b

    const/4 v14, 0x1

    invoke-static {v15, v3, v14, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 6
    new-instance v5, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b;

    iget-object v6, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$scope:Lkotlinx/coroutines/s0;

    iget-object v10, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v11, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$context:Landroid/content/Context;

    iget-object v12, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$searchStr:Lkotlin/jvm/internal/k1$h;

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v18, v9

    move-object/from16 v19, v10

    move-object/from16 v20, v11

    move-object/from16 v21, v12

    invoke-direct/range {v16 .. v21}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$b;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/s0;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;Lkotlin/jvm/internal/k1$h;)V

    const v6, 0x7bf60ea8

    invoke-static {v15, v6, v14, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    .line 7
    new-instance v12, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$c;

    iget-object v13, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$searchStr:Lkotlin/jvm/internal/k1$h;

    iget-object v11, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$gridState:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iget-object v10, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v6, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    move-object/from16 v18, v11

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move-object/from16 v21, v6

    invoke-direct/range {v16 .. v21}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$c;-><init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V

    const v6, 0x73173d70

    invoke-static {v15, v6, v14, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v12

    const v16, 0x30186030

    const/16 v17, 0x1ac

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v13, p1

    move/from16 v14, v16

    move/from16 v15, v17

    .line 8
    invoke-static/range {v1 .. v15}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 9
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iget-object v3, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    const v4, 0x1e7b2b64

    move-object/from16 v5, p1

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 10
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    .line 11
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_3

    .line 12
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_4

    .line 13
    :cond_3
    new-instance v6, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$d;

    const/4 v4, 0x0

    invoke-direct {v6, v2, v3, v4}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$d;-><init>(Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lkotlin/coroutines/d;)V

    .line 14
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_4
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v6, Lv3/p;

    const/16 v2, 0x46

    .line 16
    invoke-static {v1, v6, v5, v2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 17
    new-instance v1, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$e;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$e;-><init>(Landroidx/navigation/NavHostController;)V

    const/4 v2, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v4, v1, v5, v2, v3}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLv3/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    :goto_1
    return-void
.end method
