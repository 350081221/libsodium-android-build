.class final Landroidx/compose/material3/SliderKt$RangeSlider$11;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SliderKt;->RangeSlider(Lkotlin/ranges/f;Lv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;Lv3/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Lv3/q;Lv3/q;ILandroidx/compose/runtime/Composer;III)V
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$changed1:I

.field final synthetic $$default:I

.field final synthetic $colors:Landroidx/compose/material3/SliderColors;

.field final synthetic $enabled:Z

.field final synthetic $endInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $endThumb:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/material3/RangeSliderState;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onValueChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onValueChangeFinished:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $startInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $startThumb:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/material3/RangeSliderState;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $steps:I

.field final synthetic $track:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Landroidx/compose/material3/RangeSliderState;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $value:Lkotlin/ranges/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $valueRange:Lkotlin/ranges/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/ranges/f;Lv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;Lv3/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Lv3/q;Lv3/q;IIII)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/l<",
            "-",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/SliderColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material3/RangeSliderState;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material3/RangeSliderState;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material3/RangeSliderState;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;IIII)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$value:Lkotlin/ranges/f;

    move-object v1, p2

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$onValueChange:Lv3/l;

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$modifier:Landroidx/compose/ui/Modifier;

    move v1, p4

    iput-boolean v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$enabled:Z

    move-object v1, p5

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$valueRange:Lkotlin/ranges/f;

    move-object v1, p6

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$onValueChangeFinished:Lv3/a;

    move-object v1, p7

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$colors:Landroidx/compose/material3/SliderColors;

    move-object v1, p8

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$startInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object v1, p9

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$endInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object v1, p10

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$startThumb:Lv3/q;

    move-object v1, p11

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$endThumb:Lv3/q;

    move-object v1, p12

    iput-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$track:Lv3/q;

    move v1, p13

    iput v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$steps:I

    move/from16 v1, p14

    iput v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$$changed:I

    move/from16 v1, p15

    iput v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$$changed1:I

    move/from16 v1, p16

    iput v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$$default:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SliderKt$RangeSlider$11;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    iget-object v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$value:Lkotlin/ranges/f;

    iget-object v2, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$onValueChange:Lv3/l;

    iget-object v3, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v4, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$enabled:Z

    iget-object v5, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$valueRange:Lkotlin/ranges/f;

    iget-object v6, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$onValueChangeFinished:Lv3/a;

    iget-object v7, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$colors:Landroidx/compose/material3/SliderColors;

    iget-object v8, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$startInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v9, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$endInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iget-object v10, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$startThumb:Lv3/q;

    iget-object v11, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$endThumb:Lv3/q;

    iget-object v12, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$track:Lv3/q;

    iget v13, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$steps:I

    iget v15, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$$changed:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v15

    move-object/from16 p1, v1

    iget v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$$changed1:I

    invoke-static {v1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    iget v1, v0, Landroidx/compose/material3/SliderKt$RangeSlider$11;->$$default:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, Landroidx/compose/material3/SliderKt;->RangeSlider(Lkotlin/ranges/f;Lv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;Lv3/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Lv3/q;Lv3/q;ILandroidx/compose/runtime/Composer;III)V

    return-void
.end method
