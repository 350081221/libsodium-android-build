.class final Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/BorderModifierNode;-><init>(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/draw/CacheDrawScope;",
        "Landroidx/compose/ui/draw/DrawResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/draw/DrawResult;",
        "Landroidx/compose/ui/draw/CacheDrawScope;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/foundation/BorderModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/BorderModifierNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;
    .locals 15
    .param p1    # Landroidx/compose/ui/draw/CacheDrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    move-object v0, p0

    move-object/from16 v2, p1

    .line 2
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getWidth-D9Ej5fM()F

    move-result v1

    invoke-interface {v2, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v1

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ltz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Size;->getMinDimension-impl(J)F

    move-result v1

    cmpl-float v1, v1, v3

    if-lez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v5

    :goto_0
    if-nez v1, :cond_1

    .line 3
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/BorderKt;->access$drawContentWithoutBorder(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v1

    goto/16 :goto_3

    .line 4
    :cond_1
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getWidth-D9Ej5fM()F

    move-result v1

    sget-object v3, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/unit/Dp$Companion;->getHairline-D9Ej5fM()F

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getWidth-D9Ej5fM()F

    move-result v1

    invoke-interface {v2, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v1

    float-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v1, v6

    .line 5
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Size;->getMinDimension-impl(J)F

    move-result v3

    const/4 v6, 0x2

    int-to-float v6, v6

    div-float/2addr v3, v6

    float-to-double v7, v3

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v3, v7

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v10

    div-float v1, v10, v6

    .line 6
    invoke-static {v1, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v7

    .line 7
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v11

    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v1

    sub-float/2addr v1, v10

    .line 8
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v11

    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v3

    sub-float/2addr v3, v10

    .line 9
    invoke-static {v1, v3}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v11

    mul-float/2addr v6, v10

    .line 10
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v13

    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Size;->getMinDimension-impl(J)F

    move-result v1

    cmpl-float v1, v6, v1

    if-lez v1, :cond_3

    move v9, v4

    goto :goto_2

    :cond_3
    move v9, v5

    .line 11
    :goto_2
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getShape()Landroidx/compose/ui/graphics/Shape;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/draw/CacheDrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v5

    invoke-interface {v1, v3, v4, v5, v2}, Landroidx/compose/ui/graphics/Shape;->createOutline-Pq9zytI(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;

    move-result-object v1

    .line 12
    instance-of v3, v1, Landroidx/compose/ui/graphics/Outline$Generic;

    if-eqz v3, :cond_4

    .line 13
    iget-object v3, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    .line 14
    invoke-virtual {v3}, Landroidx/compose/foundation/BorderModifierNode;->getBrush()Landroidx/compose/ui/graphics/Brush;

    move-result-object v4

    .line 15
    move-object v5, v1

    check-cast v5, Landroidx/compose/ui/graphics/Outline$Generic;

    move-object v1, v3

    move-object/from16 v2, p1

    move-object v3, v4

    move-object v4, v5

    move v5, v9

    move v6, v10

    .line 16
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/BorderModifierNode;->access$drawGenericBorder(Landroidx/compose/foundation/BorderModifierNode;Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v1

    goto :goto_3

    .line 17
    :cond_4
    instance-of v3, v1, Landroidx/compose/ui/graphics/Outline$Rounded;

    if-eqz v3, :cond_5

    .line 18
    iget-object v3, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    .line 19
    invoke-virtual {v3}, Landroidx/compose/foundation/BorderModifierNode;->getBrush()Landroidx/compose/ui/graphics/Brush;

    move-result-object v4

    .line 20
    move-object v5, v1

    check-cast v5, Landroidx/compose/ui/graphics/Outline$Rounded;

    move-object v1, v3

    move-object/from16 v2, p1

    move-object v3, v4

    move-object v4, v5

    move-wide v5, v7

    move-wide v7, v11

    .line 21
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/BorderModifierNode;->access$drawRoundRectBorder-JqoCqck(Landroidx/compose/foundation/BorderModifierNode;Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v1

    goto :goto_3

    .line 22
    :cond_5
    instance-of v1, v1, Landroidx/compose/ui/graphics/Outline$Rectangle;

    if-eqz v1, :cond_6

    .line 23
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getBrush()Landroidx/compose/ui/graphics/Brush;

    move-result-object v3

    move-object/from16 v1, p1

    move-object v2, v3

    move-wide v3, v7

    move-wide v5, v11

    move v7, v9

    move v8, v10

    .line 24
    invoke-static/range {v1 .. v8}, Landroidx/compose/foundation/BorderKt;->access$drawRectBorder-NsqcLGU(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v1

    :goto_3
    return-object v1

    :cond_6
    new-instance v1, Lkotlin/j0;

    invoke-direct {v1}, Lkotlin/j0;-><init>()V

    throw v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/draw/CacheDrawScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->invoke(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object p1

    return-object p1
.end method
