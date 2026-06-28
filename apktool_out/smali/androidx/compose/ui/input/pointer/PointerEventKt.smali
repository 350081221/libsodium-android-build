.class public final Landroidx/compose/ui/input/pointer/PointerEventKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0011\u0010\t\u001a\u00020\u0008*\u00020\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0008*\u00020\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\n\u001a\u001d\u0010\r\u001a\u00020\u0008*\u00020\u00002\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u000c\u0010\u000f\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u000c\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u000c\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\u000c\u0010\u0013\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\u000c\u0010\u0014\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\u001e\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "",
        "changedToDown",
        "changedToDownIgnoreConsumed",
        "changedToUp",
        "changedToUpIgnoreConsumed",
        "positionChanged",
        "positionChangedIgnoreConsumed",
        "Landroidx/compose/ui/geometry/Offset;",
        "positionChange",
        "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J",
        "positionChangeIgnoreConsumed",
        "ignoreConsumed",
        "positionChangeInternal",
        "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J",
        "positionChangeConsumed",
        "anyChangeConsumed",
        "Lkotlin/r2;",
        "consumeDownChange",
        "consumePositionChange",
        "consumeAllChanges",
        "Landroidx/compose/ui/unit/IntSize;",
        "size",
        "isOutOfBounds-O0kMr_c",
        "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z",
        "isOutOfBounds",
        "Landroidx/compose/ui/geometry/Size;",
        "extendedTouchPadding",
        "isOutOfBounds-jwHxaWs",
        "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final anyChangeConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 0
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Partial consumption has been deprecated. Use isConsumed instead"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "isConsumed"
            imports = {}
        .end subannotation
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result p0

    return p0
.end method

.method public static final changedToDown(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 1
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPressed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final changedToDownIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 1
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPressed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 1
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 1
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final consumeAllChanges(Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 0
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Use consume() instead"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "consume()"
            imports = {}
        .end subannotation
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    return-void
.end method

.method public static final consumeDownChange(Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 2
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Partial consumption has been deprecated. Use consume() instead."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "if (pressed != previousPressed) consume()"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPressed()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final consumePositionChange(Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 4
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Partial consumption has been deprecated. Use consume() instead."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "if (positionChange() != Offset.Zero) consume()"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChange(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final isOutOfBounds-O0kMr_c(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z
    .locals 3
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Use isOutOfBounds() that supports minimum touch target"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "this.isOutOfBounds(size, extendedTouchPadding)"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 p2, 0x0

    .line 22
    cmpg-float v2, p0, p2

    .line 23
    .line 24
    if-ltz v2, :cond_1

    .line 25
    .line 26
    int-to-float v1, v1

    .line 27
    cmpl-float p0, p0, v1

    .line 28
    .line 29
    if-gtz p0, :cond_1

    .line 30
    .line 31
    cmpg-float p0, v0, p2

    .line 32
    .line 33
    if-ltz p0, :cond_1

    .line 34
    .line 35
    int-to-float p0, p1

    .line 36
    cmpl-float p0, v0, p0

    .line 37
    .line 38
    if-lez p0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 44
    :goto_1
    return p0
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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

.method public static final isOutOfBounds-jwHxaWs(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z
    .locals 4
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getTouch-T8wyACA()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/input/pointer/PointerEventKt;->isOutOfBounds-O0kMr_c(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    neg-float v1, v1

    .line 39
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-float v2, v2

    .line 44
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    add-float/2addr v2, v3

    .line 49
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    neg-float v3, v3

    .line 54
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    int-to-float p1, p1

    .line 59
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    add-float/2addr p1, p2

    .line 64
    cmpg-float p2, p0, v1

    .line 65
    .line 66
    if-ltz p2, :cond_2

    .line 67
    .line 68
    cmpl-float p0, p0, v2

    .line 69
    .line 70
    if-gtz p0, :cond_2

    .line 71
    .line 72
    cmpg-float p0, v0, v3

    .line 73
    .line 74
    if-ltz p0, :cond_2

    .line 75
    .line 76
    cmpl-float p0, v0, p1

    .line 77
    .line 78
    if-lez p0, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const/4 p0, 0x0

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 84
    :goto_1
    return p0
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public static final positionChange(Landroidx/compose/ui/input/pointer/PointerInputChange;)J
    .locals 2
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeInternal(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final positionChangeConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 0
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        message = "Partial consumption has been deprecated. Use isConsumed instead"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "isConsumed"
            imports = {}
        .end subannotation
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result p0

    return p0
.end method

.method public static final positionChangeIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)J
    .locals 2
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeInternal(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final positionChangeInternal(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    :cond_0
    return-wide v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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

.method static synthetic positionChangeInternal$default(Landroidx/compose/ui/input/pointer/PointerInputChange;ZILjava/lang/Object;)J
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeInternal(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final positionChanged(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 4
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeInternal(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J

    move-result-wide v0

    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final positionChangedIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 5
    .param p0    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeInternal(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J

    move-result-wide v1

    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    move-result p0

    xor-int/2addr p0, v0

    return p0
.end method
