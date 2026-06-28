.class final Lcom/yuanqi/master/manager/e$b$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/e$b;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/foundation/layout/RowScope;",
        "invoke",
        "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"
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
        "SMAP\nManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,351:1\n154#2:352\n154#2:353\n83#3,3:354\n1116#4,6:357\n*S KotlinDebug\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$2$1\n*L\n141#1:352\n142#1:353\n145#1:354,3\n145#1:357,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $angle$delegate:Landroidx/compose/runtime/MutableFloatState;

.field final synthetic $clickCount$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showLocation$delegate:Lcom/yuanqi/master/tools/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showOverlay$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/tools/x0;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/manager/e$b$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/yuanqi/master/manager/e$b$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    iput-object p3, p0, Lcom/yuanqi/master/manager/e$b$a;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    iput-object p4, p0, Lcom/yuanqi/master/manager/e$b$a;->$showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/yuanqi/master/manager/e$b$a;->$showOverlay$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/RowScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/manager/e$b$a;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
    .locals 38
    .param p1    # Landroidx/compose/foundation/layout/RowScope;
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

    move-object/from16 v8, p2

    move/from16 v1, p3

    const-string v2, "$this$CustomTopBar"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x51

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_3

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.yuanqi.master.manager.ManagerScreen.<anonymous>.<anonymous> (ManagerScreen.kt:136)"

    const v4, 0x20490f0e

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x7f0f0013

    const/4 v2, 0x6

    .line 5
    invoke-static {v1, v8, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v1

    const-string v2, ""

    .line 6
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v3, 0xa

    int-to-float v3, v3

    .line 7
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    const/4 v13, 0x0

    const/16 v14, 0xb

    const/4 v15, 0x0

    .line 8
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x1c

    int-to-float v4, v4

    .line 9
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 10
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 11
    iget-object v3, v0, Lcom/yuanqi/master/manager/e$b$a;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    invoke-static {v3}, Lcom/yuanqi/master/manager/e;->r(Landroidx/compose/runtime/MutableFloatState;)F

    move-result v18

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const v30, 0x1feff

    const/16 v31, 0x0

    invoke-static/range {v9 .. v31}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer-Ap8cVGQ$default(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJIILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v32

    .line 12
    sget-object v3, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    invoke-virtual {v3}, Lcom/yuanqi/master/mine/account/a;->k()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v0, Lcom/yuanqi/master/manager/e$b$a;->$showOverlay$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v3}, Lcom/yuanqi/master/manager/e;->v(Landroidx/compose/runtime/MutableState;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v3

    goto :goto_1

    :cond_3
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v3

    :goto_1
    move-wide/from16 v33, v3

    const/16 v35, 0x0

    const/16 v36, 0x2

    const/16 v37, 0x0

    invoke-static/range {v32 .. v37}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x4

    new-array v4, v3, [Ljava/lang/Object;

    .line 13
    iget-object v5, v0, Lcom/yuanqi/master/manager/e$b$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    iget-object v7, v0, Lcom/yuanqi/master/manager/e$b$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    const/4 v13, 0x1

    aput-object v7, v4, v13

    iget-object v13, v0, Lcom/yuanqi/master/manager/e$b$a;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    const/4 v14, 0x2

    aput-object v13, v4, v14

    iget-object v14, v0, Lcom/yuanqi/master/manager/e$b$a;->$showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v15, 0x3

    aput-object v14, v4, v15

    const v15, -0x21de6e89

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    move v15, v6

    :goto_2
    if-ge v6, v3, :cond_4

    .line 14
    aget-object v3, v4, v6

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v15, v3

    add-int/lit8 v6, v6, 0x1

    const/4 v3, 0x4

    goto :goto_2

    .line 15
    :cond_4
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v15, :cond_5

    .line 16
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_6

    .line 17
    :cond_5
    new-instance v3, Lcom/yuanqi/master/manager/e$b$a$a;

    invoke-direct {v3, v5, v7, v13, v14}, Lcom/yuanqi/master/manager/e$b$a$a;-><init>(Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/tools/x0;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;)V

    .line 18
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 19
    :cond_6
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-object v13, v3

    check-cast v13, Lv3/a;

    const/4 v14, 0x7

    const/4 v15, 0x0

    .line 20
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    .line 21
    invoke-static {v3, v4}, Landroidx/compose/ui/ZIndexModifierKt;->zIndex(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x38

    const/16 v10, 0x78

    move-object/from16 v8, p2

    .line 22
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    :goto_3
    return-void
.end method
