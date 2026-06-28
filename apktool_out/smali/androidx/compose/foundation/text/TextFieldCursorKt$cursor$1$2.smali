.class final Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $cursorAlpha:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $cursorBrush:Landroidx/compose/ui/graphics/Brush;

.field final synthetic $offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

.field final synthetic $state:Landroidx/compose/foundation/text/TextFieldState;

.field final synthetic $value:Landroidx/compose/ui/text/input/TextFieldValue;


# direct methods
.method constructor <init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/graphics/Brush;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Landroidx/compose/ui/text/input/OffsetMapping;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Landroidx/compose/foundation/text/TextFieldState;",
            "Landroidx/compose/ui/graphics/Brush;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$cursorAlpha:Landroidx/compose/animation/core/Animatable;

    iput-object p2, p0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    iput-object p3, p0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    iput-object p4, p0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$state:Landroidx/compose/foundation/text/TextFieldState;

    iput-object p5, p0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$cursorBrush:Landroidx/compose/ui/graphics/Brush;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->invoke(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 18
    .param p1    # Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object/from16 v0, p0

    .line 2
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 3
    iget-object v1, v0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$cursorAlpha:Landroidx/compose/animation/core/Animatable;

    invoke-virtual {v1}, Landroidx/compose/animation/core/Animatable;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lkotlin/ranges/s;->H(FFF)F

    move-result v13

    cmpg-float v1, v13, v3

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_3

    .line 4
    iget-object v1, v0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$offsetMapping:Landroidx/compose/ui/text/input/OffsetMapping;

    .line 5
    iget-object v2, v0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$value:Landroidx/compose/ui/text/input/TextFieldValue;

    invoke-virtual {v2}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/text/input/OffsetMapping;->originalToTransformed(I)I

    move-result v1

    .line 6
    iget-object v2, v0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$state:Landroidx/compose/foundation/text/TextFieldState;

    invoke-virtual {v2}, Landroidx/compose/foundation/text/TextFieldState;->getLayoutResult()Landroidx/compose/foundation/text/TextLayoutResultProxy;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroidx/compose/foundation/text/TextLayoutResultProxy;->getValue()Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    if-nez v1, :cond_2

    .line 7
    :cond_1
    new-instance v1, Landroidx/compose/ui/geometry/Rect;

    invoke-direct {v1, v3, v3, v3, v3}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 8
    :cond_2
    invoke-static {}, Landroidx/compose/foundation/text/TextFieldCursorKt;->getDefaultCursorThickness()F

    move-result v2

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v10

    .line 9
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v2

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float v4, v10, v4

    add-float/2addr v2, v4

    .line 10
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v5

    sub-float/2addr v5, v4

    invoke-static {v2, v5}, Lkotlin/ranges/s;->A(FF)F

    move-result v2

    .line 11
    invoke-static {v2, v4}, Lkotlin/ranges/s;->t(FF)F

    move-result v2

    .line 12
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v6

    .line 13
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v1

    invoke-static {v2, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v8

    .line 14
    iget-object v5, v0, Landroidx/compose/foundation/text/TextFieldCursorKt$cursor$1$2;->$cursorBrush:Landroidx/compose/ui/graphics/Brush;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1b0

    const/16 v17, 0x0

    move-object/from16 v4, p1

    .line 15
    invoke-static/range {v4 .. v17}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-1RTmtNc$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    :cond_3
    return-void
.end method
