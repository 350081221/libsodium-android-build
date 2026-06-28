.class public Landroidx/compose/ui/text/android/style/SkewXSpan;
.super Landroid/text/style/MetricAffectingSpan;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u0008\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/style/SkewXSpan;",
        "Landroid/text/style/MetricAffectingSpan;",
        "Landroid/text/TextPaint;",
        "textPaint",
        "Lkotlin/r2;",
        "updateDrawState",
        "updateMeasureState",
        "",
        "skewX",
        "F",
        "getSkewX",
        "()F",
        "<init>",
        "(F)V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final skewX:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    iput p1, p0, Landroidx/compose/ui/text/android/style/SkewXSpan;->skewX:F

    return-void
.end method


# virtual methods
.method public final getSkewX()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/text/android/style/SkewXSpan;->skewX:F

    return v0
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget v0, p0, Landroidx/compose/ui/text/android/style/SkewXSpan;->skewX:F

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSkewX(F)V

    return-void
.end method

.method public updateMeasureState(Landroid/text/TextPaint;)V
    .locals 2
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget v0, p0, Landroidx/compose/ui/text/android/style/SkewXSpan;->skewX:F

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSkewX(F)V

    return-void
.end method
