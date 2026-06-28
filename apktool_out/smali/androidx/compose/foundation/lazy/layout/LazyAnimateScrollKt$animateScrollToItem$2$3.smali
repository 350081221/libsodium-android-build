.class final Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/animation/core/AnimationScope<",
        "Ljava/lang/Float;",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        ">;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Landroidx/compose/animation/core/AnimationScope;",
        "",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/animation/core/AnimationScope;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n41#2,4:318\n41#2,4:322\n41#2,4:326\n41#2,4:330\n41#2,4:334\n41#2,4:338\n41#2,4:342\n41#2,4:346\n41#2,4:350\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n*L\n195#1:318,4\n201#1:322,4\n204#1:326,4\n212#1:330,4\n217#1:334,4\n228#1:338,4\n240#1:342,4\n253#1:346,4\n264#1:350,4\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

.field final synthetic $anim:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/animation/core/AnimationState<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $boundDistancePx:F

.field final synthetic $forward:Z

.field final synthetic $index:I

.field final synthetic $loop:Lkotlin/jvm/internal/k1$a;

.field final synthetic $loops:Lkotlin/jvm/internal/k1$f;

.field final synthetic $numOfItemsForTeleport:I

.field final synthetic $prevValue:Lkotlin/jvm/internal/k1$e;

.field final synthetic $scrollOffset:I

.field final synthetic $target:F

.field final synthetic $this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IFLkotlin/jvm/internal/k1$e;Landroidx/compose/foundation/gestures/ScrollScope;Lkotlin/jvm/internal/k1$a;ZFLkotlin/jvm/internal/k1$f;IILkotlin/jvm/internal/k1$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;",
            "IF",
            "Lkotlin/jvm/internal/k1$e;",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "Lkotlin/jvm/internal/k1$a;",
            "ZF",
            "Lkotlin/jvm/internal/k1$f;",
            "II",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/animation/core/AnimationState<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iput p2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    iput p3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$target:F

    iput-object p4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$prevValue:Lkotlin/jvm/internal/k1$e;

    iput-object p5, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

    iput-object p6, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$loop:Lkotlin/jvm/internal/k1$a;

    iput-boolean p7, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$forward:Z

    iput p8, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$boundDistancePx:F

    iput-object p9, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$loops:Lkotlin/jvm/internal/k1$f;

    iput p10, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$numOfItemsForTeleport:I

    iput p11, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$scrollOffset:I

    iput-object p12, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$anim:Lkotlin/jvm/internal/k1$h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/animation/core/AnimationScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->invoke(Landroidx/compose/animation/core/AnimationScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/core/AnimationScope;)V
    .locals 7
    .param p1    # Landroidx/compose/animation/core/AnimationScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/AnimationScope<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    invoke-static {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    .line 3
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$target:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    .line 4
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$target:F

    invoke-static {v0, v2}, Lkotlin/ranges/s;->A(FF)F

    move-result v0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$target:F

    invoke-static {v0, v2}, Lkotlin/ranges/s;->t(FF)F

    move-result v0

    .line 6
    :goto_0
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$prevValue:Lkotlin/jvm/internal/k1$e;

    iget v2, v2, Lkotlin/jvm/internal/k1$e;->element:F

    sub-float/2addr v0, v2

    .line 7
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

    invoke-interface {v2, v0}, Landroidx/compose/foundation/gestures/ScrollScope;->scrollBy(F)F

    move-result v2

    .line 8
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    invoke-static {v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    .line 9
    :cond_1
    iget-boolean v3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$forward:Z

    iget-object v4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v5, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    iget v6, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$scrollOffset:I

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->access$invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;II)Z

    move-result v3

    if-nez v3, :cond_7

    cmpg-float v2, v0, v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    if-nez v2, :cond_3

    .line 10
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    .line 11
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$loop:Lkotlin/jvm/internal/k1$a;

    iput-boolean v1, p1, Lkotlin/jvm/internal/k1$a;->element:Z

    return-void

    .line 12
    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$prevValue:Lkotlin/jvm/internal/k1$e;

    iget v3, v2, Lkotlin/jvm/internal/k1$e;->element:F

    add-float/2addr v3, v0

    iput v3, v2, Lkotlin/jvm/internal/k1$e;->element:F

    .line 13
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$forward:Z

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$boundDistancePx:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    .line 15
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    goto :goto_2

    .line 16
    :cond_4
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$boundDistancePx:F

    neg-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_5

    .line 17
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    .line 18
    :cond_5
    :goto_2
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$forward:Z

    const/4 v2, 0x2

    if-eqz v0, :cond_6

    .line 19
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$loops:Lkotlin/jvm/internal/k1$f;

    iget v0, v0, Lkotlin/jvm/internal/k1$f;->element:I

    if-lt v0, v2, :cond_7

    .line 20
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    invoke-interface {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getLastVisibleItemIndex()I

    move-result v2

    sub-int/2addr v0, v2

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$numOfItemsForTeleport:I

    if-le v0, v2, :cond_7

    .line 21
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

    .line 22
    iget v4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    sub-int/2addr v4, v2

    .line 23
    invoke-interface {v0, v3, v4, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->snapToItem(Landroidx/compose/foundation/gestures/ScrollScope;II)V

    goto :goto_3

    .line 24
    :cond_6
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$loops:Lkotlin/jvm/internal/k1$f;

    iget v0, v0, Lkotlin/jvm/internal/k1$f;->element:I

    if-lt v0, v2, :cond_7

    .line 25
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getFirstVisibleItemIndex()I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    sub-int/2addr v0, v2

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$numOfItemsForTeleport:I

    if-le v0, v3, :cond_7

    .line 26
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget-object v4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

    add-int/2addr v2, v3

    invoke-interface {v0, v4, v2, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->snapToItem(Landroidx/compose/foundation/gestures/ScrollScope;II)V

    .line 27
    :cond_7
    :goto_3
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$forward:Z

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    iget v4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$scrollOffset:I

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2;->access$invokeSuspend$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;II)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 28
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$scrollOffset:I

    .line 29
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$$this$scroll:Landroidx/compose/foundation/gestures/ScrollScope;

    iget v4, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    invoke-interface {v0, v3, v4, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->snapToItem(Landroidx/compose/foundation/gestures/ScrollScope;II)V

    .line 30
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$loop:Lkotlin/jvm/internal/k1$a;

    iput-boolean v1, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 31
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    return-void

    .line 32
    :cond_8
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    invoke-static {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;I)Z

    move-result p1

    if-nez p1, :cond_9

    return-void

    .line 33
    :cond_9
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$index:I

    invoke-interface {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->getVisibleItemScrollOffset(I)I

    move-result p1

    .line 34
    new-instance v0, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3;->$anim:Lkotlin/jvm/internal/k1$h;

    iget-object v1, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/animation/core/AnimationState;

    invoke-direct {v0, p1, v1}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;-><init>(ILandroidx/compose/animation/core/AnimationState;)V

    throw v0
.end method
