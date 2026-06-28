.class final Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/ProgressIndicatorKt;->LinearProgressIndicator-_5eSR-E(Lv3/a;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V",
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
.field final synthetic $coercedProgress:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $color:J

.field final synthetic $strokeCap:I

.field final synthetic $trackColor:J


# direct methods
.method constructor <init>(JILv3/a;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;J)V"
        }
    .end annotation

    iput-wide p1, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$trackColor:J

    iput p3, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$strokeCap:I

    iput-object p4, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$coercedProgress:Lv3/a;

    iput-wide p5, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$color:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 9
    .param p1    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v7

    .line 3
    iget-wide v0, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$trackColor:J

    iget v2, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$strokeCap:I

    invoke-static {p1, v0, v1, v7, v2}, Landroidx/compose/material3/ProgressIndicatorKt;->access$drawLinearIndicatorTrack-AZGd3zU(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V

    const/4 v3, 0x0

    .line 4
    iget-object v0, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$coercedProgress:Lv3/a;

    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v4

    iget-wide v5, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$color:J

    iget v8, p0, Landroidx/compose/material3/ProgressIndicatorKt$LinearProgressIndicator$2$1;->$strokeCap:I

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/material3/ProgressIndicatorKt;->access$drawLinearIndicator-qYKTg0g(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V

    return-void
.end method
