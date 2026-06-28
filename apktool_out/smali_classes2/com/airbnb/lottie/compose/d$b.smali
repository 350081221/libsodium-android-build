.class final Lcom/airbnb/lottie/compose/d$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/compose/d;->c(Lcom/airbnb/lottie/k;Lv3/a;Landroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/j1;ZLcom/airbnb/lottie/compose/k;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/a;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "invoke"
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
        "SMAP\nLottieAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimation.kt\ncom/airbnb/lottie/compose/LottieAnimationKt$LottieAnimation$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,236:1\n245#2:237\n*S KotlinDebug\n*F\n+ 1 LottieAnimation.kt\ncom/airbnb/lottie/compose/LottieAnimationKt$LottieAnimation$2\n*L\n103#1:237\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $alignment:Landroidx/compose/ui/Alignment;

.field final synthetic $applyOpacityToLayers:Z

.field final synthetic $asyncUpdates:Lcom/airbnb/lottie/a;

.field final synthetic $bounds:Landroid/graphics/Rect;

.field final synthetic $clipTextToBoundingBox:Z

.field final synthetic $clipToCompositionBounds:Z

.field final synthetic $composition:Lcom/airbnb/lottie/k;

.field final synthetic $contentScale:Landroidx/compose/ui/layout/ContentScale;

.field final synthetic $drawable:Lcom/airbnb/lottie/x0;

.field final synthetic $dynamicProperties:Lcom/airbnb/lottie/compose/k;

.field final synthetic $enableMergePaths:Z

.field final synthetic $fontMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $maintainOriginalImageBounds:Z

.field final synthetic $matrix:Landroid/graphics/Matrix;

.field final synthetic $outlineMasksAndMattes:Z

.field final synthetic $progress:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $renderMode:Lcom/airbnb/lottie/j1;

.field final synthetic $setDynamicProperties$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/airbnb/lottie/compose/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/graphics/Rect;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;Landroid/graphics/Matrix;Lcom/airbnb/lottie/x0;ZLcom/airbnb/lottie/j1;Lcom/airbnb/lottie/a;Lcom/airbnb/lottie/k;Ljava/util/Map;Lcom/airbnb/lottie/compose/k;ZZZZZLv3/a;Landroidx/compose/runtime/MutableState;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Landroidx/compose/ui/layout/ContentScale;",
            "Landroidx/compose/ui/Alignment;",
            "Landroid/graphics/Matrix;",
            "Lcom/airbnb/lottie/x0;",
            "Z",
            "Lcom/airbnb/lottie/j1;",
            "Lcom/airbnb/lottie/a;",
            "Lcom/airbnb/lottie/k;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Landroid/graphics/Typeface;",
            ">;",
            "Lcom/airbnb/lottie/compose/k;",
            "ZZZZZ",
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/airbnb/lottie/compose/k;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$bounds:Landroid/graphics/Rect;

    move-object v1, p2

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    move-object v1, p3

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$alignment:Landroidx/compose/ui/Alignment;

    move-object v1, p4

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$matrix:Landroid/graphics/Matrix;

    move-object v1, p5

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$drawable:Lcom/airbnb/lottie/x0;

    move v1, p6

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$b;->$enableMergePaths:Z

    move-object v1, p7

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$renderMode:Lcom/airbnb/lottie/j1;

    move-object v1, p8

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$asyncUpdates:Lcom/airbnb/lottie/a;

    move-object v1, p9

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$composition:Lcom/airbnb/lottie/k;

    move-object v1, p10

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$fontMap:Ljava/util/Map;

    move-object v1, p11

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$dynamicProperties:Lcom/airbnb/lottie/compose/k;

    move v1, p12

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$b;->$outlineMasksAndMattes:Z

    move v1, p13

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$b;->$applyOpacityToLayers:Z

    move/from16 v1, p14

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$b;->$maintainOriginalImageBounds:Z

    move/from16 v1, p15

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$b;->$clipToCompositionBounds:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Lcom/airbnb/lottie/compose/d$b;->$clipTextToBoundingBox:Z

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$progress:Lv3/a;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$setDynamicProperties$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/compose/d$b;->invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 29
    .param p1    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "$this$Canvas"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, v0, Lcom/airbnb/lottie/compose/d$b;->$bounds:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/airbnb/lottie/compose/d$b;->$contentScale:Landroidx/compose/ui/layout/ContentScale;

    iget-object v4, v0, Lcom/airbnb/lottie/compose/d$b;->$alignment:Landroidx/compose/ui/Alignment;

    iget-object v10, v0, Lcom/airbnb/lottie/compose/d$b;->$matrix:Landroid/graphics/Matrix;

    iget-object v11, v0, Lcom/airbnb/lottie/compose/d$b;->$drawable:Lcom/airbnb/lottie/x0;

    iget-boolean v12, v0, Lcom/airbnb/lottie/compose/d$b;->$enableMergePaths:Z

    iget-object v13, v0, Lcom/airbnb/lottie/compose/d$b;->$renderMode:Lcom/airbnb/lottie/j1;

    iget-object v14, v0, Lcom/airbnb/lottie/compose/d$b;->$asyncUpdates:Lcom/airbnb/lottie/a;

    iget-object v15, v0, Lcom/airbnb/lottie/compose/d$b;->$composition:Lcom/airbnb/lottie/k;

    iget-object v9, v0, Lcom/airbnb/lottie/compose/d$b;->$fontMap:Ljava/util/Map;

    iget-object v7, v0, Lcom/airbnb/lottie/compose/d$b;->$dynamicProperties:Lcom/airbnb/lottie/compose/k;

    iget-boolean v8, v0, Lcom/airbnb/lottie/compose/d$b;->$outlineMasksAndMattes:Z

    iget-boolean v5, v0, Lcom/airbnb/lottie/compose/d$b;->$applyOpacityToLayers:Z

    iget-boolean v6, v0, Lcom/airbnb/lottie/compose/d$b;->$maintainOriginalImageBounds:Z

    iget-boolean v2, v0, Lcom/airbnb/lottie/compose/d$b;->$clipToCompositionBounds:Z

    move/from16 v16, v2

    iget-boolean v2, v0, Lcom/airbnb/lottie/compose/d$b;->$clipTextToBoundingBox:Z

    move/from16 v17, v2

    iget-object v2, v0, Lcom/airbnb/lottie/compose/d$b;->$progress:Lv3/a;

    move-object/from16 v18, v2

    iget-object v2, v0, Lcom/airbnb/lottie/compose/d$b;->$setDynamicProperties$delegate:Landroidx/compose/runtime/MutableState;

    .line 3
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v19

    .line 4
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    move/from16 v20, v5

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v5, v5

    move/from16 v21, v6

    invoke-static {v0, v5}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v5

    .line 5
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v22

    invoke-static/range {v22 .. v23}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v0

    invoke-static {v0}, Lkotlin/math/b;->L0(F)I

    move-result v0

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v22

    invoke-static/range {v22 .. v23}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v22

    move-object/from16 v23, v7

    invoke-static/range {v22 .. v22}, Lkotlin/math/b;->L0(F)I

    move-result v7

    invoke-static {v0, v7}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide v24

    move v0, v8

    .line 6
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v7

    invoke-interface {v3, v5, v6, v7, v8}, Landroidx/compose/ui/layout/ContentScale;->computeScaleFactor-H7hwNQA(JJ)J

    move-result-wide v7

    .line 7
    invoke-static {v5, v6, v7, v8}, Lcom/airbnb/lottie/compose/d;->j(JJ)J

    move-result-wide v5

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v3

    move/from16 v22, v0

    move/from16 v0, v20

    move-object/from16 v20, v1

    move/from16 v1, v21

    move-wide/from16 v26, v7

    move-object/from16 v1, v23

    move/from16 v28, v22

    move/from16 v22, v0

    move/from16 v0, v28

    move-wide/from16 v7, v24

    move/from16 v23, v0

    move-object v0, v9

    move-object v9, v3

    invoke-interface/range {v4 .. v9}, Landroidx/compose/ui/Alignment;->align-KFBX0sM(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    move-result-wide v3

    .line 8
    invoke-virtual {v10}, Landroid/graphics/Matrix;->reset()V

    .line 9
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v10, v5, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 10
    invoke-static/range {v26 .. v27}, Landroidx/compose/ui/layout/ScaleFactor;->getScaleX-impl(J)F

    move-result v3

    invoke-static/range {v26 .. v27}, Landroidx/compose/ui/layout/ScaleFactor;->getScaleY-impl(J)F

    move-result v4

    invoke-virtual {v10, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 11
    invoke-virtual {v11, v12}, Lcom/airbnb/lottie/x0;->H(Z)V

    .line 12
    invoke-virtual {v11, v13}, Lcom/airbnb/lottie/x0;->x1(Lcom/airbnb/lottie/j1;)V

    .line 13
    invoke-virtual {v11, v14}, Lcom/airbnb/lottie/x0;->Y0(Lcom/airbnb/lottie/a;)V

    .line 14
    invoke-virtual {v11, v15}, Lcom/airbnb/lottie/x0;->b1(Lcom/airbnb/lottie/k;)Z

    .line 15
    invoke-virtual {v11, v0}, Lcom/airbnb/lottie/x0;->e1(Ljava/util/Map;)V

    .line 16
    invoke-static {v2}, Lcom/airbnb/lottie/compose/d;->g(Landroidx/compose/runtime/MutableState;)Lcom/airbnb/lottie/compose/k;

    move-result-object v0

    if-eq v1, v0, :cond_2

    .line 17
    invoke-static {v2}, Lcom/airbnb/lottie/compose/d;->g(Landroidx/compose/runtime/MutableState;)Lcom/airbnb/lottie/compose/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v11}, Lcom/airbnb/lottie/compose/k;->b(Lcom/airbnb/lottie/x0;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 18
    invoke-virtual {v1, v11}, Lcom/airbnb/lottie/compose/k;->a(Lcom/airbnb/lottie/x0;)V

    .line 19
    :cond_1
    invoke-static {v2, v1}, Lcom/airbnb/lottie/compose/d;->h(Landroidx/compose/runtime/MutableState;Lcom/airbnb/lottie/compose/k;)V

    :cond_2
    move/from16 v0, v23

    .line 20
    invoke-virtual {v11, v0}, Lcom/airbnb/lottie/x0;->u1(Z)V

    move/from16 v0, v22

    .line 21
    invoke-virtual {v11, v0}, Lcom/airbnb/lottie/x0;->X0(Z)V

    move/from16 v0, v21

    .line 22
    invoke-virtual {v11, v0}, Lcom/airbnb/lottie/x0;->j1(Z)V

    move/from16 v0, v16

    .line 23
    invoke-virtual {v11, v0}, Lcom/airbnb/lottie/x0;->a1(Z)V

    move/from16 v0, v17

    .line 24
    invoke-virtual {v11, v0}, Lcom/airbnb/lottie/x0;->Z0(Z)V

    .line 25
    invoke-interface/range {v18 .. v18}, Lv3/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {v11, v0}, Lcom/airbnb/lottie/x0;->w1(F)V

    .line 26
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Rect;->height()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v11, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 27
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/graphics/AndroidCanvas_androidKt;->getNativeCanvas(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v11, v0, v10}, Lcom/airbnb/lottie/x0;->F(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    return-void
.end method
