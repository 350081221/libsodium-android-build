.class public final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "calculateSelectionMagnifierCenterAndroid",
        "Landroidx/compose/ui/geometry/Offset;",
        "textFieldState",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "selectionState",
        "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
        "textLayoutState",
        "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;",
        "magnifierSize",
        "Landroidx/compose/ui/unit/IntSize;",
        "calculateSelectionMagnifierCenterAndroid-hUlJWOE",
        "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;J)J",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"
    }
.end annotation


# direct methods
.method public static final calculateSelectionMagnifierCenterAndroid-hUlJWOE(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;J)J
    .locals 6
    .param p0    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/internal/TextLayoutState;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getHandleDragPosition-F1C5BW0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->isUnspecified-k-4lQ0M(J)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_a

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    move v2, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 p1, -0x1

    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    move p0, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    aget p0, v2, p0

    .line 53
    .line 54
    :goto_1
    if-eq p0, p1, :cond_9

    .line 55
    .line 56
    const/4 p1, 0x2

    .line 57
    if-eq p0, v3, :cond_4

    .line 58
    .line 59
    if-eq p0, p1, :cond_4

    .line 60
    .line 61
    const/4 v2, 0x3

    .line 62
    if-ne p0, v2, :cond_3

    .line 63
    .line 64
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    new-instance p0, Lkotlin/j0;

    .line 70
    .line 71
    invoke-direct {p0}, Lkotlin/j0;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_4
    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    :goto_2
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-nez v2, :cond_5

    .line 84
    .line 85
    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    return-wide p0

    .line 92
    :cond_5
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {v2, p0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineForOffset(I)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    invoke-virtual {v2, p0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineLeft(I)F

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v2, p0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineRight(I)F

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-static {v0, v4, v1}, Lkotlin/ranges/s;->H(FFF)F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    sub-float/2addr v0, v1

    .line 121
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    div-int/2addr p3, p1

    .line 130
    int-to-float p3, p3

    .line 131
    cmpl-float p3, v0, p3

    .line 132
    .line 133
    if-lez p3, :cond_6

    .line 134
    .line 135
    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 136
    .line 137
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 138
    .line 139
    .line 140
    move-result-wide p0

    .line 141
    return-wide p0

    .line 142
    :cond_6
    invoke-virtual {v2, p0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineTop(I)F

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    invoke-virtual {v2, p0}, Landroidx/compose/ui/text/TextLayoutResult;->getLineBottom(I)F

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    sub-float/2addr p0, p3

    .line 151
    int-to-float p1, p1

    .line 152
    div-float/2addr p0, p1

    .line 153
    add-float/2addr p0, p3

    .line 154
    invoke-static {v1, p0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 155
    .line 156
    .line 157
    move-result-wide p0

    .line 158
    invoke-virtual {p2}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getTextLayoutNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    if-eqz p3, :cond_8

    .line 163
    .line 164
    invoke-interface {p3}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    .line 165
    .line 166
    .line 167
    move-result p4

    .line 168
    if-eqz p4, :cond_7

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    const/4 p3, 0x0

    .line 172
    :goto_3
    if-eqz p3, :cond_8

    .line 173
    .line 174
    invoke-static {p3}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->visibleBounds(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-static {p0, p1, p3}, Landroidx/compose/foundation/text2/input/internal/TextLayoutStateKt;->coerceIn-3MmeM6k(JLandroidx/compose/ui/geometry/Rect;)J

    .line 179
    .line 180
    .line 181
    move-result-wide p0

    .line 182
    :cond_8
    invoke-static {p2, p0, p1}, Landroidx/compose/foundation/text2/input/internal/TextLayoutStateKt;->fromTextLayoutToCore-Uv8p0NA(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;J)J

    .line 183
    .line 184
    .line 185
    move-result-wide p0

    .line 186
    return-wide p0

    .line 187
    :cond_9
    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 188
    .line 189
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 190
    .line 191
    .line 192
    move-result-wide p0

    .line 193
    return-wide p0

    .line 194
    :cond_a
    :goto_4
    sget-object p0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 195
    .line 196
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 197
    .line 198
    .line 199
    move-result-wide p0

    .line 200
    return-wide p0
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
