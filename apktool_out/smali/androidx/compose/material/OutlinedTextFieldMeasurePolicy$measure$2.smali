.class final Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V",
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
.field final synthetic $borderPlaceable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic $height:I

.field final synthetic $labelPlaceable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic $leadingPlaceable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic $placeholderPlaceable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic $textFieldPlaceable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic $this_measure:Landroidx/compose/ui/layout/MeasureScope;

.field final synthetic $trailingPlaceable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic $width:I

.field final synthetic this$0:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;


# direct methods
.method constructor <init>(IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;Landroidx/compose/ui/layout/MeasureScope;)V
    .locals 0

    iput p1, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$height:I

    iput p2, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$width:I

    iput-object p3, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$leadingPlaceable:Landroidx/compose/ui/layout/Placeable;

    iput-object p4, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$trailingPlaceable:Landroidx/compose/ui/layout/Placeable;

    iput-object p5, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$textFieldPlaceable:Landroidx/compose/ui/layout/Placeable;

    iput-object p6, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$labelPlaceable:Landroidx/compose/ui/layout/Placeable;

    iput-object p7, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$placeholderPlaceable:Landroidx/compose/ui/layout/Placeable;

    iput-object p8, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$borderPlaceable:Landroidx/compose/ui/layout/Placeable;

    iput-object p9, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->this$0:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    iput-object p10, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$this_measure:Landroidx/compose/ui/layout/MeasureScope;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 14
    .param p1    # Landroidx/compose/ui/layout/Placeable$PlacementScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget v1, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$height:I

    .line 3
    iget v2, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$width:I

    .line 4
    iget-object v3, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$leadingPlaceable:Landroidx/compose/ui/layout/Placeable;

    .line 5
    iget-object v4, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$trailingPlaceable:Landroidx/compose/ui/layout/Placeable;

    .line 6
    iget-object v5, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$textFieldPlaceable:Landroidx/compose/ui/layout/Placeable;

    .line 7
    iget-object v6, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$labelPlaceable:Landroidx/compose/ui/layout/Placeable;

    .line 8
    iget-object v7, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$placeholderPlaceable:Landroidx/compose/ui/layout/Placeable;

    .line 9
    iget-object v8, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$borderPlaceable:Landroidx/compose/ui/layout/Placeable;

    .line 10
    iget-object v0, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->this$0:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    invoke-static {v0}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->access$getAnimationProgress$p(Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;)F

    move-result v9

    .line 11
    iget-object v0, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->this$0:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    invoke-static {v0}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->access$getSingleLine$p(Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;)Z

    move-result v10

    .line 12
    iget-object v0, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$this_measure:Landroidx/compose/ui/layout/MeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v11

    .line 13
    iget-object v0, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->$this_measure:Landroidx/compose/ui/layout/MeasureScope;

    invoke-interface {v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v12

    .line 14
    iget-object v0, p0, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy$measure$2;->this$0:Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;

    invoke-static {v0}, Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;->access$getPaddingValues$p(Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v13

    move-object v0, p1

    .line 15
    invoke-static/range {v0 .. v13}, Landroidx/compose/material/OutlinedTextFieldKt;->access$place(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V

    return-void
.end method
