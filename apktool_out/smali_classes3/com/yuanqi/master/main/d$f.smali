.class final Lcom/yuanqi/master/main/d$f;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/main/d;->b(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "invoke",
        "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"
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
        "SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,349:1\n154#2:350\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2\n*L\n124#1:350\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $mainViewModel:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/main/MainViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/main/d$f;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/PaddingValues;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/main/d$f;->invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .param p1    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "it"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    const/4 v4, 0x2

    if-nez v3, :cond_1

    move-object/from16 v3, p2

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    move v5, v2

    :goto_1
    and-int/lit8 v5, v5, 0x5b

    const/16 v6, 0x12

    if-ne v5, v6, :cond_3

    .line 2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_3

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, -0x1

    const-string v6, "com.yuanqi.master.main.MainScreen.<anonymous> (MainScreen.kt:118)"

    const v7, 0x7ea97f66

    invoke-static {v7, v2, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 5
    :cond_4
    iget-object v2, v0, Lcom/yuanqi/master/main/d$f;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    invoke-virtual {v2}, Lcom/yuanqi/master/main/MainViewModel;->J()Landroidx/compose/foundation/lazy/grid/LazyGridState;

    move-result-object v7

    .line 6
    new-instance v5, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;

    sget-object v2, Lcom/yuanqi/master/config/a;->g:Lcom/yuanqi/master/config/a$b;

    invoke-virtual {v2}, Lcom/yuanqi/master/config/a$b;->a()Lcom/yuanqi/master/config/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yuanqi/master/config/a;->c()Landroidx/compose/runtime/MutableState;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-direct {v5, v2}, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;-><init>(I)V

    .line 7
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 8
    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0xa

    int-to-float v2, v2

    .line 9
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 10
    invoke-static {v1, v2, v6, v4, v8}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 11
    new-instance v14, Lcom/yuanqi/master/main/d$f$a;

    iget-object v1, v0, Lcom/yuanqi/master/main/d$f;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    invoke-direct {v14, v1}, Lcom/yuanqi/master/main/d$f$a;-><init>(Lcom/yuanqi/master/main/MainViewModel;)V

    const/16 v16, 0x0

    const/16 v17, 0x1f8

    move-object/from16 v15, p2

    invoke-static/range {v5 .. v17}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V

    .line 12
    iget-object v1, v0, Lcom/yuanqi/master/main/d$f;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    invoke-virtual {v1}, Lcom/yuanqi/master/main/MainViewModel;->N()Landroidx/compose/runtime/MutableState;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13
    sget-object v5, Lcom/yuanqi/master/main/d$f$b;->INSTANCE:Lcom/yuanqi/master/main/d$f$b;

    const/4 v6, 0x0

    sget-object v1, Lcom/yuanqi/master/main/b;->a:Lcom/yuanqi/master/main/b;

    invoke-virtual {v1}, Lcom/yuanqi/master/main/b;->i()Lv3/p;

    move-result-object v7

    const/16 v9, 0x186

    const/4 v10, 0x2

    move-object/from16 v8, p2

    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lv3/a;Landroidx/compose/ui/window/DialogProperties;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    :cond_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    :goto_3
    return-void
.end method
