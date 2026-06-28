.class public final Landroidx/compose/foundation/text/selection/HandlePositionProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/PopupPositionProvider;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/selection/HandlePositionProvider$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/HandlePositionProvider;",
        "Landroidx/compose/ui/window/PopupPositionProvider;",
        "handleReferencePoint",
        "Landroidx/compose/foundation/text/selection/HandleReferencePoint;",
        "positionProvider",
        "Landroidx/compose/foundation/text/selection/OffsetProvider;",
        "(Landroidx/compose/foundation/text/selection/HandleReferencePoint;Landroidx/compose/foundation/text/selection/OffsetProvider;)V",
        "prevPosition",
        "Landroidx/compose/ui/geometry/Offset;",
        "J",
        "calculatePosition",
        "Landroidx/compose/ui/unit/IntOffset;",
        "anchorBounds",
        "Landroidx/compose/ui/unit/IntRect;",
        "windowSize",
        "Landroidx/compose/ui/unit/IntSize;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "popupContentSize",
        "calculatePosition-llwVHH4",
        "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J",
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,327:1\n265#2:328\n179#3:329\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n*L\n276#1:328\n287#1:329\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final handleReferencePoint:Landroidx/compose/foundation/text/selection/HandleReferencePoint;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final positionProvider:Landroidx/compose/foundation/text/selection/OffsetProvider;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private prevPosition:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text/selection/HandleReferencePoint;Landroidx/compose/foundation/text/selection/OffsetProvider;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text/selection/HandleReferencePoint;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text/selection/OffsetProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/HandlePositionProvider;->handleReferencePoint:Landroidx/compose/foundation/text/selection/HandleReferencePoint;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text/selection/HandlePositionProvider;->positionProvider:Landroidx/compose/foundation/text/selection/OffsetProvider;

    .line 7
    .line 8
    sget-object p1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Landroidx/compose/foundation/text/selection/HandlePositionProvider;->prevPosition:J

    .line 15
    .line 16
    return-void
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
.end method


# virtual methods
.method public calculatePosition-llwVHH4(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J
    .locals 1
    .param p1    # Landroidx/compose/ui/unit/IntRect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object p2, p0, Landroidx/compose/foundation/text/selection/HandlePositionProvider;->positionProvider:Landroidx/compose/foundation/text/selection/OffsetProvider;

    .line 2
    .line 3
    invoke-interface {p2}, Landroidx/compose/foundation/text/selection/OffsetProvider;->provide-F1C5BW0()J

    .line 4
    .line 5
    .line 6
    move-result-wide p2

    .line 7
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-wide p2, p0, Landroidx/compose/foundation/text/selection/HandlePositionProvider;->prevPosition:J

    .line 15
    .line 16
    :goto_0
    iput-wide p2, p0, Landroidx/compose/foundation/text/selection/HandlePositionProvider;->prevPosition:J

    .line 17
    .line 18
    iget-object p4, p0, Landroidx/compose/foundation/text/selection/HandlePositionProvider;->handleReferencePoint:Landroidx/compose/foundation/text/selection/HandleReferencePoint;

    .line 19
    .line 20
    sget-object v0, Landroidx/compose/foundation/text/selection/HandlePositionProvider$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 21
    .line 22
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    aget p4, v0, p4

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    if-eq p4, v0, :cond_3

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    if-eq p4, v0, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    if-ne p4, v0, :cond_1

    .line 36
    .line 37
    invoke-static {p5, p6}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Lkotlin/j0;

    .line 43
    .line 44
    invoke-direct {p1}, Lkotlin/j0;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p5, p6}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 49
    .line 50
    .line 51
    move-result p4

    .line 52
    div-int/2addr p4, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const/4 p4, 0x0

    .line 55
    :goto_1
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 56
    .line 57
    .line 58
    move-result p5

    .line 59
    invoke-static {p5}, Lkotlin/math/b;->L0(F)I

    .line 60
    .line 61
    .line 62
    move-result p5

    .line 63
    invoke-static {p2, p3}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-static {p2}, Lkotlin/math/b;->L0(F)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-static {p5, p2}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 72
    .line 73
    .line 74
    move-result-wide p2

    .line 75
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntRect;->getLeft()I

    .line 76
    .line 77
    .line 78
    move-result p5

    .line 79
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 80
    .line 81
    .line 82
    move-result p6

    .line 83
    add-int/2addr p5, p6

    .line 84
    sub-int/2addr p5, p4

    .line 85
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntRect;->getTop()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    add-int/2addr p1, p2

    .line 94
    invoke-static {p5, p1}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 95
    .line 96
    .line 97
    move-result-wide p1

    .line 98
    return-wide p1
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
