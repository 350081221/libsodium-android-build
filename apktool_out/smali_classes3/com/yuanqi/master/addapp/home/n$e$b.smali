.class final Lcom/yuanqi/master/addapp/home/n$e$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/n$e;->invoke(Landroidx/compose/runtime/Composer;I)V
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
        "SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n766#2:677\n857#2,2:678\n154#3:680\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$2\n*L\n144#1:677\n144#1:678,2\n150#1:680\n*E\n"
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

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $scope:Lkotlinx/coroutines/s0;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/s0;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lkotlinx/coroutines/s0;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/navigation/NavHostController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/n$e$b;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/n$e$b;->$scope:Lkotlinx/coroutines/s0;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/n$e$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/n$e$b;->$navController:Landroidx/navigation/NavHostController;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/addapp/home/n$e$b;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 30
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

    goto/16 :goto_5

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous>.<anonymous> (SelectAppScreen.kt:142)"

    const v4, -0x1c99ca32

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v2, v0, Lcom/yuanqi/master/addapp/home/n$e$b;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 6
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/yuanqi/group/home/models/c;

    .line 8
    iget v7, v7, Lcom/yuanqi/group/home/models/c;->f:I

    if-lez v7, :cond_4

    goto :goto_2

    :cond_4
    move v5, v6

    :goto_2
    if-eqz v5, :cond_3

    .line 9
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_5
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {}, Lcom/yuanqi/master/theme/b;->T()J

    move-result-wide v2

    goto :goto_3

    :cond_6
    invoke-static {}, Lcom/yuanqi/master/theme/b;->m()J

    move-result-wide v2

    :goto_3
    move-wide v8, v2

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, Lcom/yuanqi/master/theme/b;->i()J

    move-result-wide v2

    goto :goto_4

    :cond_7
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v2

    .line 13
    :goto_4
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v4, 0x11

    int-to-float v4, v4

    .line 14
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v13

    const/4 v14, 0x0

    const/16 v15, 0xb

    const/16 v16, 0x0

    .line 15
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    .line 16
    sget v16, Landroidx/compose/material3/ButtonDefaults;->$stable:I

    or-int/lit8 v6, v16, 0x0

    shl-int/lit8 v17, v6, 0xc

    const/16 v18, 0xe

    move-object/from16 v16, p1

    .line 17
    invoke-virtual/range {v7 .. v18}, Landroidx/compose/material3/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;

    move-result-object v21

    new-instance v6, Lcom/yuanqi/master/addapp/home/n$e$b$a;

    iget-object v7, v0, Lcom/yuanqi/master/addapp/home/n$e$b;->$scope:Lkotlinx/coroutines/s0;

    iget-object v8, v0, Lcom/yuanqi/master/addapp/home/n$e$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/n$e$b;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v6, v1, v7, v8, v9}, Lcom/yuanqi/master/addapp/home/n$e$b$a;-><init>(Ljava/util/ArrayList;Lkotlinx/coroutines/s0;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;)V

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    .line 18
    new-instance v1, Lcom/yuanqi/master/addapp/home/n$e$b$b;

    invoke-direct {v1, v2, v3}, Lcom/yuanqi/master/addapp/home/n$e$b$b;-><init>(J)V

    const v2, 0x396553de

    move-object/from16 v3, p1

    invoke-static {v3, v2, v5, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v26

    const v28, 0x30000030

    const/16 v29, 0x1ec

    move-object/from16 v17, v6

    move-object/from16 v18, v4

    move-object/from16 v27, p1

    .line 19
    invoke-static/range {v17 .. v29}, Landroidx/compose/material3/ButtonKt;->Button(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_8
    :goto_5
    return-void
.end method
