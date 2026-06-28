.class public final Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/PopupPositionProvider;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J2\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u00020\t8\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;",
        "Landroidx/compose/ui/window/PopupPositionProvider;",
        "Landroidx/compose/ui/unit/IntRect;",
        "anchorBounds",
        "Landroidx/compose/ui/unit/IntSize;",
        "windowSize",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "layoutDirection",
        "popupContentSize",
        "Landroidx/compose/ui/unit/IntOffset;",
        "calculatePosition-llwVHH4",
        "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J",
        "calculatePosition",
        "Landroidx/compose/ui/Alignment;",
        "alignment",
        "Landroidx/compose/ui/Alignment;",
        "getAlignment",
        "()Landroidx/compose/ui/Alignment;",
        "offset",
        "J",
        "getOffset-nOcc-ac",
        "()J",
        "<init>",
        "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/w;)V",
        "ui_release"
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
        "SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,89:1\n92#2:90\n86#2:91\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n73#1:90\n83#1:91\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final alignment:Landroidx/compose/ui/Alignment;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final offset:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/ui/Alignment;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;->alignment:Landroidx/compose/ui/Alignment;

    .line 5
    .line 6
    iput-wide p2, p0, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;->offset:J

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;-><init>(Landroidx/compose/ui/Alignment;J)V

    return-void
.end method


# virtual methods
.method public calculatePosition-llwVHH4(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J
    .locals 8
    .param p1    # Landroidx/compose/ui/unit/IntRect;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;->alignment:Landroidx/compose/ui/Alignment;

    .line 2
    .line 3
    sget-object p2, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntRect;->getSize-YbymL2g()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    move-object v5, p4

    .line 14
    invoke-interface/range {v0 .. v5}, Landroidx/compose/ui/Alignment;->align-KFBX0sM(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object v2, p0, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;->alignment:Landroidx/compose/ui/Alignment;

    .line 19
    .line 20
    invoke-virtual {p2}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    move-wide v5, p5

    .line 25
    move-object v7, p4

    .line 26
    invoke-interface/range {v2 .. v7}, Landroidx/compose/ui/Alignment;->align-KFBX0sM(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p2

    .line 30
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 31
    .line 32
    .line 33
    move-result p5

    .line 34
    neg-int p5, p5

    .line 35
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    neg-int p2, p2

    .line 40
    invoke-static {p5, p2}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 41
    .line 42
    .line 43
    move-result-wide p2

    .line 44
    iget-wide p5, p0, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;->offset:J

    .line 45
    .line 46
    invoke-static {p5, p6}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 47
    .line 48
    .line 49
    move-result p5

    .line 50
    sget-object p6, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 51
    .line 52
    if-ne p4, p6, :cond_0

    .line 53
    .line 54
    const/4 p4, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 p4, -0x1

    .line 57
    :goto_0
    mul-int/2addr p5, p4

    .line 58
    iget-wide v2, p0, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;->offset:J

    .line 59
    .line 60
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    invoke-static {p5, p4}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 65
    .line 66
    .line 67
    move-result-wide p4

    .line 68
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntRect;->getTopLeft-nOcc-ac()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 77
    .line 78
    .line 79
    move-result p6

    .line 80
    add-int/2addr p1, p6

    .line 81
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 82
    .line 83
    .line 84
    move-result p6

    .line 85
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    add-int/2addr p6, v0

    .line 90
    invoke-static {p1, p6}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 99
    .line 100
    .line 101
    move-result p6

    .line 102
    add-int/2addr p1, p6

    .line 103
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 104
    .line 105
    .line 106
    move-result p6

    .line 107
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    add-int/2addr p6, p2

    .line 112
    invoke-static {p1, p6}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 113
    .line 114
    .line 115
    move-result-wide p1

    .line 116
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    invoke-static {p4, p5}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 121
    .line 122
    .line 123
    move-result p6

    .line 124
    add-int/2addr p3, p6

    .line 125
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-static {p4, p5}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    add-int/2addr p1, p2

    .line 134
    invoke-static {p3, p1}, Landroidx/compose/ui/unit/IntOffsetKt;->IntOffset(II)J

    .line 135
    .line 136
    .line 137
    move-result-wide p1

    .line 138
    return-wide p1
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

.method public final getAlignment()Landroidx/compose/ui/Alignment;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;->alignment:Landroidx/compose/ui/Alignment;

    return-object v0
.end method

.method public final getOffset-nOcc-ac()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;->offset:J

    return-wide v0
.end method
