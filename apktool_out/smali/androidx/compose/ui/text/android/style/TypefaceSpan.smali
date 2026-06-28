.class public final Landroidx/compose/ui/text/android/style/TypefaceSpan;
.super Landroid/text/style/MetricAffectingSpan;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/text/android/style/TypefaceSpan;",
        "Landroid/text/style/MetricAffectingSpan;",
        "Landroid/graphics/Paint;",
        "paint",
        "Lkotlin/r2;",
        "updateTypeface",
        "Landroid/text/TextPaint;",
        "ds",
        "updateDrawState",
        "updateMeasureState",
        "Landroid/graphics/Typeface;",
        "typeface",
        "Landroid/graphics/Typeface;",
        "getTypeface",
        "()Landroid/graphics/Typeface;",
        "<init>",
        "(Landroid/graphics/Typeface;)V",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final typeface:Landroid/graphics/Typeface;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;)V
    .locals 0
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/text/android/style/TypefaceSpan;->typeface:Landroid/graphics/Typeface;

    return-void
.end method

.method private final updateTypeface(Landroid/graphics/Paint;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/text/android/style/TypefaceSpan;->typeface:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final getTypeface()Landroid/graphics/Typeface;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/text/android/style/TypefaceSpan;->typeface:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 0
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/ui/text/android/style/TypefaceSpan;->updateTypeface(Landroid/graphics/Paint;)V

    return-void
.end method

.method public updateMeasureState(Landroid/text/TextPaint;)V
    .locals 0
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/ui/text/android/style/TypefaceSpan;->updateTypeface(Landroid/graphics/Paint;)V

    return-void
.end method
