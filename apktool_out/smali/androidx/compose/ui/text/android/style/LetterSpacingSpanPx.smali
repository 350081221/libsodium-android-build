.class public final Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;
.super Landroid/text/style/MetricAffectingSpan;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;",
        "Landroid/text/style/MetricAffectingSpan;",
        "Landroid/text/TextPaint;",
        "Lkotlin/r2;",
        "updatePaint",
        "textPaint",
        "updateDrawState",
        "updateMeasureState",
        "",
        "letterSpacing",
        "F",
        "getLetterSpacing",
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
.field private final letterSpacing:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0
    .param p1    # F
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param

    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    iput p1, p0, Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;->letterSpacing:F

    return-void
.end method

.method private final updatePaint(Landroid/text/TextPaint;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextScaleX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-float/2addr v0, v1

    .line 10
    const/4 v1, 0x0

    .line 11
    cmpg-float v1, v0, v1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget v1, p0, Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;->letterSpacing:F

    .line 21
    .line 22
    div-float/2addr v1, v0

    .line 23
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public final getLetterSpacing()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;->letterSpacing:F

    return v0
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 0
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;->updatePaint(Landroid/text/TextPaint;)V

    return-void
.end method

.method public updateMeasureState(Landroid/text/TextPaint;)V
    .locals 0
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;->updatePaint(Landroid/text/TextPaint;)V

    return-void
.end method
