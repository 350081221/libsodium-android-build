.class final Lcom/yuanqi/master/mine/account/b$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/account/b;->a(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V
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
        "SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt$AccountScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n36#2:262\n36#2:269\n36#2:276\n1116#3,6:263\n1116#3,6:270\n1116#3,6:277\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt$AccountScreen$2\n*L\n239#1:262\n241#1:269\n249#1:276\n239#1:263,6\n241#1:270,6\n249#1:277,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $showConfirm:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showDelete:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/navigation/NavHostController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/yuanqi/master/mine/MineViewModel;",
            "Landroidx/navigation/NavHostController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/mine/account/b$b;->$showConfirm:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/yuanqi/master/mine/account/b$b;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/master/mine/account/b$b;->$showDelete:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/yuanqi/master/mine/account/b$b;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    iput-object p5, p0, Lcom/yuanqi/master/mine/account/b$b;->$navController:Landroidx/navigation/NavHostController;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/mine/account/b$b;->invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 24
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

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move/from16 v1, p3

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v1, 0xe

    if-nez v3, :cond_1

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v3, v3, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    .line 2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_3

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.yuanqi.master.mine.account.AccountScreen.<anonymous> (AccountScreen.kt:80)"

    const v5, 0x714719df

    invoke-static {v5, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    new-instance v8, Lcom/yuanqi/master/mine/account/b$b$a;

    iget-object v3, v0, Lcom/yuanqi/master/mine/account/b$b;->$showDelete:Landroidx/compose/runtime/MutableState;

    iget-object v4, v0, Lcom/yuanqi/master/mine/account/b$b;->$showConfirm:Landroidx/compose/runtime/MutableState;

    iget-object v5, v0, Lcom/yuanqi/master/mine/account/b$b;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    iget-object v6, v0, Lcom/yuanqi/master/mine/account/b$b;->$navController:Landroidx/navigation/NavHostController;

    move-object v1, v8

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/yuanqi/master/mine/account/b$b$a;-><init>(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/navigation/NavHostController;)V

    const v1, 0x2e1ebce6

    const/4 v2, 0x1

    invoke-static {v7, v1, v2, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lcom/yuanqi/master/tools/a;->h(Lv3/q;Landroidx/compose/runtime/Composer;I)V

    const v1, -0x7a33eada

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    iget-object v1, v0, Lcom/yuanqi/master/mine/account/b$b;->$showConfirm:Landroidx/compose/runtime/MutableState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const v2, 0x44faf204

    if-eqz v1, :cond_9

    .line 6
    sget-object v8, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 7
    iget-object v9, v0, Lcom/yuanqi/master/mine/account/b$b;->$context:Landroid/content/Context;

    const v1, 0x7f1202cb

    .line 8
    invoke-virtual {v9, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v1, "getString(...)"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "\u9000\u51fa\u540e\uff0c\u65e0\u6cd5\u6b63\u5e38\u4f7f\u7528\u3002\u60a8\u786e\u5b9a\u8981\u9000\u51fa\u5417\uff1f"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 9
    iget-object v1, v0, Lcom/yuanqi/master/mine/account/b$b;->$showConfirm:Landroidx/compose/runtime/MutableState;

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 10
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .line 11
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    .line 12
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_6

    .line 13
    :cond_5
    new-instance v4, Lcom/yuanqi/master/mine/account/b$b$b;

    invoke-direct {v4, v1}, Lcom/yuanqi/master/mine/account/b$b$b;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 14
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_6
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-object/from16 v20, v4

    check-cast v20, Lv3/a;

    .line 16
    iget-object v1, v0, Lcom/yuanqi/master/mine/account/b$b;->$showConfirm:Landroidx/compose/runtime/MutableState;

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 17
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .line 18
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    .line 19
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_8

    .line 20
    :cond_7
    new-instance v4, Lcom/yuanqi/master/mine/account/b$b$c;

    invoke-direct {v4, v1}, Lcom/yuanqi/master/mine/account/b$b$c;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 21
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 22
    :cond_8
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-object/from16 v21, v4

    check-cast v21, Lv3/a;

    const/16 v22, 0x7d8

    const/16 v23, 0x0

    .line 23
    invoke-static/range {v8 .. v23}, Lcom/yuanqi/master/tools/o0;->Y(Lcom/yuanqi/master/tools/o0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLv3/a;Lv3/a;Lv3/a;Lv3/a;ILjava/lang/Object;)V

    :cond_9
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 24
    iget-object v1, v0, Lcom/yuanqi/master/mine/account/b$b;->$showDelete:Landroidx/compose/runtime/MutableState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 25
    sget-object v1, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    iget-object v3, v0, Lcom/yuanqi/master/mine/account/b$b;->$context:Landroid/content/Context;

    iget-object v4, v0, Lcom/yuanqi/master/mine/account/b$b;->$showDelete:Landroidx/compose/runtime/MutableState;

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 26
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 27
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_a

    .line 28
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_b

    .line 29
    :cond_a
    new-instance v5, Lcom/yuanqi/master/mine/account/b$b$d;

    invoke-direct {v5, v4}, Lcom/yuanqi/master/mine/account/b$b$d;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 30
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 31
    :cond_b
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v5, Lv3/a;

    .line 32
    new-instance v2, Lcom/yuanqi/master/mine/account/b$b$e;

    iget-object v4, v0, Lcom/yuanqi/master/mine/account/b$b;->$showDelete:Landroidx/compose/runtime/MutableState;

    iget-object v6, v0, Lcom/yuanqi/master/mine/account/b$b;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-direct {v2, v4, v6}, Lcom/yuanqi/master/mine/account/b$b$e;-><init>(Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/mine/MineViewModel;)V

    invoke-virtual {v1, v3, v5, v2}, Lcom/yuanqi/master/tools/o0;->h0(Landroid/content/Context;Lv3/a;Lv3/a;)V

    :cond_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    :goto_3
    return-void
.end method
