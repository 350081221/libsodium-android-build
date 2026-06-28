.class final synthetic Landroidx/compose/material/SliderKt$RangeSlider$2$2;
.super Lkotlin/jvm/internal/h0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt$RangeSlider$2;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/h0;",
        "Lv3/l<",
        "Ljava/lang/Float;",
        "Ljava/lang/Float;",
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
.field final synthetic $maxPx:Lkotlin/jvm/internal/k1$e;

.field final synthetic $minPx:Lkotlin/jvm/internal/k1$e;

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
.method constructor <init>(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/internal/k1$e;",
            "Lkotlin/jvm/internal/k1$e;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$2;->$valueRange:Lkotlin/ranges/f;

    iput-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$2;->$minPx:Lkotlin/jvm/internal/k1$e;

    iput-object p3, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$2;->$maxPx:Lkotlin/jvm/internal/k1$e;

    const/4 v1, 0x1

    const-class v2, Lkotlin/jvm/internal/l0$a;

    const-string v3, "scaleToOffset"

    const-string v4, "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/h0;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(F)Ljava/lang/Float;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$2;->$valueRange:Lkotlin/ranges/f;

    iget-object v1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$2;->$minPx:Lkotlin/jvm/internal/k1$e;

    iget-object v2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2$2;->$maxPx:Lkotlin/jvm/internal/k1$e;

    invoke-static {v0, v1, v2, p1}, Landroidx/compose/material/SliderKt$RangeSlider$2;->access$invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/material/SliderKt$RangeSlider$2$2;->invoke(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
