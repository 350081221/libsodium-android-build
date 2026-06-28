.class final Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a;->invoke(Landroidx/compose/runtime/Composer;I)V
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
        "SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,447:1\n154#2:448\n154#2:449\n154#2:450\n154#2:451\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1$1\n*L\n187#1:448\n202#1:449\n203#1:450\n216#1:451\n*E\n"
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

.field final synthetic $lastClickTime:Lkotlin/jvm/internal/k1$g;

.field final synthetic $navController:Landroidx/navigation/NavHostController;

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
.method constructor <init>(Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$g;ILandroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/addapp/AddAppViewModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/jvm/internal/k1$g;",
            "I",
            "Landroidx/compose/ui/platform/SoftwareKeyboardController;",
            "Landroidx/navigation/NavHostController;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$searchStr:Lkotlin/jvm/internal/k1$h;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$lastClickTime:Lkotlin/jvm/internal/k1$g;

    iput p3, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$CLICK_INTERVAL:I

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$navController:Landroidx/navigation/NavHostController;

    iput-object p6, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p7, p0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
    .locals 73
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

    move-object/from16 v14, p2

    move/from16 v1, p3

    const-string v2, "$this$TopAppBar"

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

    goto/16 :goto_1

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:186)"

    const v4, -0x3d1b826c

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v1, 0x8

    int-to-float v1, v1

    .line 5
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 6
    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v13, 0x6

    invoke-static {v1, v14, v13}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v1, 0x7f0f0004

    .line 7
    invoke-static {v1, v14, v13}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v1

    const-string v2, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 8
    new-instance v9, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;

    iget-object v3, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$lastClickTime:Lkotlin/jvm/internal/k1$g;

    iget v4, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$CLICK_INTERVAL:I

    iget-object v5, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$softKeyboard:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iget-object v10, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v9, v3, v4, v5, v10}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$a;-><init>(Lkotlin/jvm/internal/k1$g;ILandroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/navigation/NavHostController;)V

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v5, v12

    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 9
    invoke-static {}, Lcom/yuanqi/master/theme/b;->L()J

    move-result-wide v4

    const/16 v7, 0xc38

    const/4 v8, 0x0

    move-object/from16 v6, p2

    .line 10
    invoke-static/range {v1 .. v8}, Landroidx/compose/material3/IconKt;->Icon-ww6aTOc(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/16 v1, 0x12

    int-to-float v1, v1

    .line 11
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 12
    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v14, v13}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/16 v1, 0x32

    int-to-float v1, v1

    .line 13
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 14
    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v51

    .line 15
    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$searchStr:Lkotlin/jvm/internal/k1$h;

    iget-object v1, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/runtime/MutableState;

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v49, v1

    check-cast v49, Ljava/lang/String;

    .line 16
    new-instance v15, Landroidx/compose/ui/text/TextStyle;

    move-object/from16 v54, v15

    const-wide/16 v16, 0x0

    const/16 v1, 0xc

    .line 17
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v18

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v45, 0xfffffd

    const/16 v46, 0x0

    .line 18
    invoke-direct/range {v15 .. v46}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/w;)V

    const/16 v1, 0x19

    int-to-float v1, v1

    .line 19
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 20
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v67

    .line 21
    sget-object v1, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    .line 22
    invoke-static {}, Lcom/yuanqi/master/theme/b;->l()J

    move-result-wide v6

    .line 23
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v12

    .line 24
    invoke-static {}, Lcom/yuanqi/master/theme/b;->j()J

    move-result-wide v32

    .line 25
    invoke-static {}, Lcom/yuanqi/master/theme/b;->j()J

    move-result-wide v8

    .line 26
    invoke-static {}, Lcom/yuanqi/master/theme/b;->S()J

    move-result-wide v40

    .line 27
    invoke-static {}, Lcom/yuanqi/master/theme/b;->j()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v15, 0x0

    move-wide v14, v15

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const-wide/16 v42, 0x0

    const v45, 0x30d86

    const/high16 v46, 0x30030000

    const/16 v47, 0x30

    const v48, 0x177fd2

    move-object/from16 v44, p2

    .line 28
    invoke-virtual/range {v1 .. v48}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v68

    .line 29
    new-instance v1, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;

    move-object/from16 v50, v1

    iget-object v2, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$searchStr:Lkotlin/jvm/internal/k1$h;

    iget-object v3, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$appshowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v4, v0, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-direct {v1, v2, v3, v4}, Lcom/yuanqi/master/addapp/home/SearchScreenKt$h$a$a$b;-><init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/yuanqi/master/addapp/AddAppViewModel;)V

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v55, 0x0

    .line 30
    sget-object v1, Lcom/yuanqi/master/addapp/home/g;->a:Lcom/yuanqi/master/addapp/home/g;

    invoke-virtual {v1}, Lcom/yuanqi/master/addapp/home/g;->a()Lv3/p;

    move-result-object v56

    invoke-virtual {v1}, Lcom/yuanqi/master/addapp/home/g;->b()Lv3/p;

    move-result-object v57

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x1

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const v70, 0x6c30180

    const/16 v71, 0x6000

    const v72, 0x3be58

    move-object/from16 v69, p2

    .line 31
    invoke-static/range {v49 .. v72}, Landroidx/compose/material/TextFieldKt;->TextField(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    :goto_1
    return-void
.end method
