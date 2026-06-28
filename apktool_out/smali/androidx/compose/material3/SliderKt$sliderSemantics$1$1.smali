.class final Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SliderKt$sliderSemantics$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Float;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "targetValue",
        "",
        "invoke",
        "(F)Ljava/lang/Boolean;"
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
.field final synthetic $state:Landroidx/compose/material3/SliderState;


# direct methods
.method constructor <init>(Landroidx/compose/material3/SliderState;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(F)Ljava/lang/Boolean;
    .locals 10
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->getValueRange()Lkotlin/ranges/f;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    .line 3
    iget-object v1, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v1}, Landroidx/compose/material3/SliderState;->getValueRange()Lkotlin/ranges/f;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    .line 4
    invoke-static {p1, v0, v1}, Lkotlin/ranges/s;->H(FFF)F

    move-result p1

    .line 5
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->getSteps()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_2

    .line 6
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->getSteps()I

    move-result v0

    add-int/2addr v0, v2

    if-ltz v0, :cond_2

    move v4, p1

    move v5, v4

    move v3, v1

    .line 7
    :goto_0
    iget-object v6, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v6}, Landroidx/compose/material3/SliderState;->getValueRange()Lkotlin/ranges/f;

    move-result-object v6

    invoke-interface {v6}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    .line 8
    iget-object v7, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v7}, Landroidx/compose/material3/SliderState;->getValueRange()Lkotlin/ranges/f;

    move-result-object v7

    invoke-interface {v7}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    int-to-float v8, v3

    .line 9
    iget-object v9, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v9}, Landroidx/compose/material3/SliderState;->getSteps()I

    move-result v9

    add-int/2addr v9, v2

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 10
    invoke-static {v6, v7, v8}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result v6

    sub-float v7, v6, p1

    .line 11
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v8

    cmpg-float v8, v8, v4

    if-gtz v8, :cond_0

    .line 12
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v4

    move v5, v6

    :cond_0
    if-eq v3, v0, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move p1, v5

    .line 13
    :cond_2
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->getValue()F

    move-result v0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    goto :goto_3

    .line 14
    :cond_4
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->getValue()F

    move-result v0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_5

    move v1, v2

    :cond_5
    if-nez v1, :cond_7

    .line 15
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->getOnValueChange$material3_release()Lv3/l;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 16
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0}, Landroidx/compose/material3/SliderState;->getOnValueChange$material3_release()Lv3/l;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 17
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 18
    :cond_6
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {v0, p1}, Landroidx/compose/material3/SliderState;->setValue(F)V

    .line 19
    :cond_7
    :goto_2
    iget-object p1, p0, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->$state:Landroidx/compose/material3/SliderState;

    invoke-virtual {p1}, Landroidx/compose/material3/SliderState;->getOnValueChangeFinished()Lv3/a;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    :cond_8
    move v1, v2

    .line 20
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/material3/SliderKt$sliderSemantics$1$1;->invoke(F)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
