.class final Landroidx/compose/foundation/ClickablePointerInputNode;
.super Landroidx/compose/foundation/AbstractClickablePointerInputNode;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0094@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J$\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/foundation/ClickablePointerInputNode;",
        "Landroidx/compose/foundation/AbstractClickablePointerInputNode;",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "Lkotlin/r2;",
        "pointerInput",
        "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "",
        "enabled",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "Lkotlin/Function0;",
        "onClick",
        "update",
        "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;",
        "interactionData",
        "<init>",
        "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickablePointerInputNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1070:1\n157#2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickablePointerInputNode\n*L\n980#1:1071\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;)V
    .locals 6
    .param p2    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/AbstractClickableNode$InteractionData;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/AbstractClickablePointerInputNode;-><init>(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;Lkotlin/jvm/internal/w;)V

    return-void
.end method


# virtual methods
.method protected pointerInput(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickablePointerInputNode;->getInteractionData()Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Landroidx/compose/ui/input/pointer/PointerInputScope;->getSize-YbymL2g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntSizeKt;->getCenter-ozmzZPI(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    int-to-float v3, v3

    .line 18
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-float v1, v1

    .line 23
    invoke-static {v3, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-virtual {v0, v1, v2}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->setCentreOffset-k-4lQ0M(J)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroidx/compose/foundation/ClickablePointerInputNode$pointerInput$2;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/ClickablePointerInputNode$pointerInput$2;-><init>(Landroidx/compose/foundation/ClickablePointerInputNode;Lkotlin/coroutines/d;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Landroidx/compose/foundation/ClickablePointerInputNode$pointerInput$3;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Landroidx/compose/foundation/ClickablePointerInputNode$pointerInput$3;-><init>(Landroidx/compose/foundation/ClickablePointerInputNode;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0, v1, p2}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->detectTapAndPress(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/q;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-ne p1, p2, :cond_0

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 53
    .line 54
    return-object p1
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

.method public final update(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;)V
    .locals 0
    .param p2    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/AbstractClickablePointerInputNode;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p3}, Landroidx/compose/foundation/AbstractClickablePointerInputNode;->setOnClick(Lv3/a;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Landroidx/compose/foundation/AbstractClickablePointerInputNode;->setInteractionSource(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
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
