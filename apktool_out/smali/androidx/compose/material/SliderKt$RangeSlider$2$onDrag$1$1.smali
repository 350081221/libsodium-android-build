.class final Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt$RangeSlider$2;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Float;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "isStart",
        "",
        "offset",
        "Lkotlin/r2;",
        "invoke",
        "(ZF)V",
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
.field final synthetic $maxPx:Lkotlin/jvm/internal/k1$e;

.field final synthetic $minPx:Lkotlin/jvm/internal/k1$e;

.field final synthetic $onValueChangeState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lv3/l<",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $rawOffsetEnd:Landroidx/compose/runtime/MutableFloatState;

.field final synthetic $rawOffsetStart:Landroidx/compose/runtime/MutableFloatState;

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
.method constructor <init>(Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Landroidx/compose/runtime/State;Lkotlin/ranges/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/internal/k1$e;",
            "Lkotlin/jvm/internal/k1$e;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/l<",
            "-",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/r2;",
            ">;>;",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetStart:Landroidx/compose/runtime/MutableFloatState;

    iput-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetEnd:Landroidx/compose/runtime/MutableFloatState;

    iput-object p3, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$value:Lkotlin/ranges/f;

    iput-object p4, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$minPx:Lkotlin/jvm/internal/k1$e;

    iput-object p5, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$maxPx:Lkotlin/jvm/internal/k1$e;

    iput-object p6, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$onValueChangeState:Landroidx/compose/runtime/State;

    iput-object p7, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$valueRange:Lkotlin/ranges/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->invoke(ZF)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(ZF)V
    .locals 3

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetStart:Landroidx/compose/runtime/MutableFloatState;

    invoke-interface {p1}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result v0

    add-float/2addr v0, p2

    invoke-interface {p1, v0}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 3
    iget-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetEnd:Landroidx/compose/runtime/MutableFloatState;

    iget-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$valueRange:Lkotlin/ranges/f;

    iget-object v0, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$minPx:Lkotlin/jvm/internal/k1$e;

    iget-object v1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$maxPx:Lkotlin/jvm/internal/k1$e;

    iget-object v2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$value:Lkotlin/ranges/f;

    invoke-interface {v2}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/material/SliderKt$RangeSlider$2;->access$invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F

    move-result p2

    invoke-interface {p1, p2}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 4
    iget-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetEnd:Landroidx/compose/runtime/MutableFloatState;

    invoke-interface {p1}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result p1

    .line 5
    iget-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetStart:Landroidx/compose/runtime/MutableFloatState;

    invoke-interface {p2}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result p2

    iget-object v0, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$minPx:Lkotlin/jvm/internal/k1$e;

    iget v0, v0, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {p2, v0, p1}, Lkotlin/ranges/s;->H(FFF)F

    move-result p2

    .line 6
    invoke-static {p2, p1}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetEnd:Landroidx/compose/runtime/MutableFloatState;

    invoke-interface {p1}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result v0

    add-float/2addr v0, p2

    invoke-interface {p1, v0}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 8
    iget-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetStart:Landroidx/compose/runtime/MutableFloatState;

    iget-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$valueRange:Lkotlin/ranges/f;

    iget-object v0, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$minPx:Lkotlin/jvm/internal/k1$e;

    iget-object v1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$maxPx:Lkotlin/jvm/internal/k1$e;

    iget-object v2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$value:Lkotlin/ranges/f;

    invoke-interface {v2}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/material/SliderKt$RangeSlider$2;->access$invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F

    move-result p2

    invoke-interface {p1, p2}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 9
    iget-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetStart:Landroidx/compose/runtime/MutableFloatState;

    invoke-interface {p1}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result p1

    .line 10
    iget-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$rawOffsetEnd:Landroidx/compose/runtime/MutableFloatState;

    invoke-interface {p2}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result p2

    iget-object v0, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$maxPx:Lkotlin/jvm/internal/k1$e;

    iget v0, v0, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {p2, p1, v0}, Lkotlin/ranges/s;->H(FFF)F

    move-result p2

    .line 11
    invoke-static {p1, p2}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    move-result-object p1

    .line 12
    :goto_0
    iget-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$onValueChangeState:Landroidx/compose/runtime/State;

    invoke-interface {p2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv3/l;

    iget-object v0, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$minPx:Lkotlin/jvm/internal/k1$e;

    iget-object v1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$maxPx:Lkotlin/jvm/internal/k1$e;

    iget-object v2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;->$valueRange:Lkotlin/ranges/f;

    invoke-static {v0, v1, v2, p1}, Landroidx/compose/material/SliderKt$RangeSlider$2;->access$invoke$scaleToUserValue(Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lkotlin/ranges/f;Lkotlin/ranges/f;)Lkotlin/ranges/f;

    move-result-object p1

    invoke-interface {p2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
