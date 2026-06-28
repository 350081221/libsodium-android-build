.class final Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0003J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\rH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\rH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u000f\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;",
        "",
        "()V",
        "calculateTransformedText",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;",
        "untransformedText",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "codepointTransformation",
        "Landroidx/compose/foundation/text2/input/CodepointTransformation;",
        "mapFromTransformed",
        "Landroidx/compose/ui/text/TextRange;",
        "range",
        "mapping",
        "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;",
        "mapFromTransformed-xdX6-G0",
        "(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J",
        "mapToTransformed",
        "mapToTransformed-xdX6-G0",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$calculateTransformedText(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/CodepointTransformation;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->calculateTransformedText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/CodepointTransformation;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$mapFromTransformed-xdX6-G0(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->mapFromTransformed-xdX6-G0(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$mapToTransformed-xdX6-G0(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->mapToTransformed-xdX6-G0(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J

    move-result-wide p0

    return-wide p0
.end method

.method private final calculateTransformedText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/CodepointTransformation;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;
    .locals 6
    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v0}, Landroidx/compose/foundation/text2/input/CodepointTransformationKt;->toVisualText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 v1, 0x0

    .line 11
    if-ne p2, p1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-direct {p0, v2, v3, v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->mapToTransformed-xdX6-G0(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getCompositionInChars-MzsxiRA()Landroidx/compose/ui/text/TextRange;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-static {}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->access$getCompanion$p()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p1, v4, v5, v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;->mapToTransformed-xdX6-G0(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_1
    invoke-static {p2, v2, v3, v1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->TextFieldCharSequence-3r_uNRQ(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;

    .line 49
    .line 50
    invoke-direct {p2, p1, v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;-><init>(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)V

    .line 51
    .line 52
    .line 53
    return-object p2
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method private final mapFromTransformed-xdX6-G0(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J
    .locals 5
    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p3, v0}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapFromDest--jx7JFs(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    move-wide v2, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {p3, v2}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapFromDest--jx7JFs(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    :goto_0
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getReversed-impl(J)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-static {v0, p3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {p3, v0}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    :goto_1
    return-wide p1
    .line 65
.end method

.method private final mapToTransformed-xdX6-G0(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J
    .locals 5
    .annotation runtime Lu3/m;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p3, v0}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapFromSource--jx7JFs(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    move-wide v2, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {p3, v2}, Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;->mapFromSource--jx7JFs(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    :goto_0
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getReversed-impl(J)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-static {v0, p3}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {p3, v0}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    :goto_1
    return-wide p1
    .line 65
.end method
