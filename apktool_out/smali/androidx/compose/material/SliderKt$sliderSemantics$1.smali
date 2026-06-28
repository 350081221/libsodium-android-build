.class final Landroidx/compose/material/SliderKt$sliderSemantics$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt;->sliderSemantics(Landroidx/compose/ui/Modifier;FZLv3/l;Lv3/a;Lkotlin/ranges/f;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V",
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
.field final synthetic $coerced:F

.field final synthetic $enabled:Z

.field final synthetic $onValueChange:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Ljava/lang/Float;",
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

.field final synthetic $steps:I

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
.method constructor <init>(ZLkotlin/ranges/f;IFLv3/l;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;IF",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$enabled:Z

    iput-object p2, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$valueRange:Lkotlin/ranges/f;

    iput p3, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$steps:I

    iput p4, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$coerced:F

    iput-object p5, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$onValueChange:Lv3/l;

    iput-object p6, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$onValueChangeFinished:Lv3/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;

    invoke-virtual {p0, p1}, Landroidx/compose/material/SliderKt$sliderSemantics$1;->invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 7
    .param p1    # Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-boolean v0, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$enabled:Z

    if-nez v0, :cond_0

    invoke-static {p1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->disabled(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    .line 3
    :cond_0
    new-instance v0, Landroidx/compose/material/SliderKt$sliderSemantics$1$1;

    iget-object v2, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$valueRange:Lkotlin/ranges/f;

    iget v3, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$steps:I

    iget v4, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$coerced:F

    iget-object v5, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$onValueChange:Lv3/l;

    iget-object v6, p0, Landroidx/compose/material/SliderKt$sliderSemantics$1;->$onValueChangeFinished:Lv3/a;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroidx/compose/material/SliderKt$sliderSemantics$1$1;-><init>(Lkotlin/ranges/f;IFLv3/l;Lv3/a;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setProgress$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lv3/l;ILjava/lang/Object;)V

    return-void
.end method
