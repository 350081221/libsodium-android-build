.class final Lcom/yuanqi/master/addapp/home/j$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/j;->a(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V
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
        "SMAP\nLanguageSwitchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n25#2:177\n1116#3,6:178\n*S KotlinDebug\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2\n*L\n93#1:177\n93#1:178,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $localValue$delegate:Lcom/yuanqi/master/tools/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/yuanqi/master/tools/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Locale;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/j$b;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/j$b;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/j$b;->$localValue$delegate:Lcom/yuanqi/master/tools/x0;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/addapp/home/j$b;->invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 15
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

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move/from16 v2, p3

    const-string v3, "it"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0xe

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v3, v3, 0x5b

    const/16 v6, 0x12

    if-ne v3, v6, :cond_3

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

    const-string v6, "com.yuanqi.master.addapp.home.LanguageSwitchScreen.<anonymous> (LanguageSwitchScreen.kt:92)"

    const v7, 0x6393dfad

    invoke-static {v7, v2, v3, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    const v2, -0x1d58f75c

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 6
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x1

    if-ne v2, v3, :cond_5

    const/4 v2, 0x5

    new-array v2, v2, [Lkotlin/u0;

    const-string v3, "English"

    .line 7
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v3, v7}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    move-result-object v3

    const/4 v7, 0x0

    aput-object v3, v2, v7

    const-string v3, "\u7e41\u9ad4\u4e2d\u6587"

    .line 8
    sget-object v7, Ljava/util/Locale;->TRADITIONAL_CHINESE:Ljava/util/Locale;

    invoke-static {v3, v7}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    move-result-object v3

    aput-object v3, v2, v6

    const-string v3, "\u65e5\u672c\u8a9e"

    .line 9
    sget-object v7, Ljava/util/Locale;->JAPANESE:Ljava/util/Locale;

    invoke-static {v3, v7}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    move-result-object v3

    aput-object v3, v2, v5

    const-string v3, "\ud55c\uad6d \uc0ac\ub78c"

    .line 10
    sget-object v5, Ljava/util/Locale;->KOREAN:Ljava/util/Locale;

    invoke-static {v3, v5}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    move-result-object v3

    const/4 v5, 0x3

    aput-object v3, v2, v5

    const-string v3, "\u7b80\u4f53\u4e2d\u6587"

    .line 11
    sget-object v5, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    invoke-static {v3, v5}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    move-result-object v3

    aput-object v3, v2, v4

    .line 12
    invoke-static {v2}, Lkotlin/collections/x0;->j0([Lkotlin/u0;)Ljava/util/Map;

    move-result-object v2

    .line 13
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 14
    :cond_5
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 15
    check-cast v2, Ljava/util/Map;

    .line 16
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 17
    invoke-static {v3, v4, v6, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 18
    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 19
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v6

    .line 20
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v5

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 21
    new-instance v11, Lcom/yuanqi/master/addapp/home/j$b$a;

    iget-object v12, v0, Lcom/yuanqi/master/addapp/home/j$b;->$selectedLanguage$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v13, v0, Lcom/yuanqi/master/addapp/home/j$b;->$context:Landroid/content/Context;

    iget-object v14, v0, Lcom/yuanqi/master/addapp/home/j$b;->$localValue$delegate:Lcom/yuanqi/master/tools/x0;

    invoke-direct {v11, v2, v12, v13, v14}, Lcom/yuanqi/master/addapp/home/j$b$a;-><init>(Ljava/util/Map;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/yuanqi/master/tools/x0;)V

    const v12, 0x36000

    const/16 v13, 0xce

    move-object v2, v3

    move-object v3, v4

    move v4, v7

    move-object v7, v8

    move v8, v9

    move-object v9, v11

    move-object/from16 v10, p2

    move v11, v12

    move v12, v13

    invoke-static/range {v1 .. v12}, Landroidx/compose/foundation/lazy/LazyDslKt;->LazyColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLv3/l;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    :goto_3
    return-void
.end method
