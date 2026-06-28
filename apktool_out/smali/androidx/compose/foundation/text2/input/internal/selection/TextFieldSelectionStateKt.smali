.class public final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0016\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\"\u0014\u0010\u000c\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/text/TextRange;",
        "reverse-5zc-tL8",
        "(J)J",
        "reverse",
        "Lkotlin/Function0;",
        "",
        "text",
        "Lkotlin/r2;",
        "logDebug",
        "",
        "DEBUG",
        "Z",
        "DEBUG_TAG",
        "Ljava/lang/String;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final DEBUG_TAG:Ljava/lang/String; = "TextFieldSelectionState"
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public static final synthetic access$logDebug(Lv3/a;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->logDebug(Lv3/a;)V

    return-void
.end method

.method public static final synthetic access$reverse-5zc-tL8(J)J
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->reverse-5zc-tL8(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final logDebug(Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method private static final reverse-5zc-tL8(J)J
    .locals 1

    invoke-static {p0, p1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v0

    invoke-static {p0, p1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result p0

    invoke-static {v0, p0}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide p0

    return-wide p0
.end method
