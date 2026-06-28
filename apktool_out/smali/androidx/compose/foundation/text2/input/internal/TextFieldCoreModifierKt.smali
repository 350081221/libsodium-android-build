.class public final Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a.\u0010\n\u001a\u00020\u000b*\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u001a\u000c\u0010\u0013\u001a\u00020\u0005*\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "DefaultCursorThickness",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "cursorAnimationSpec",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "",
        "isSpecified",
        "",
        "Landroidx/compose/ui/graphics/Brush;",
        "(Landroidx/compose/ui/graphics/Brush;)Z",
        "getCursorRectInScroller",
        "Landroidx/compose/ui/geometry/Rect;",
        "Landroidx/compose/ui/unit/Density;",
        "cursorOffset",
        "",
        "textLayoutResult",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "rtl",
        "textFieldWidth",
        "roundToNext",
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
        "SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,584:1\n652#2:585\n154#3:586\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt\n*L\n535#1:585\n529#1:586\n*E\n"
    }
.end annotation


# static fields
.field private static final DefaultCursorThickness:F

.field private static final cursorAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt$cursorAnimationSpec$1;->INSTANCE:Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt$cursorAnimationSpec$1;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/animation/core/AnimationSpecKt;->keyframes(Lv3/l;)Landroidx/compose/animation/core/KeyframesSpec;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const/4 v5, 0x6

    .line 11
    const/4 v6, 0x0

    .line 12
    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/core/AnimationSpecKt;->infiniteRepeatable-9IiC70o$default(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JILjava/lang/Object;)Landroidx/compose/animation/core/InfiniteRepeatableSpec;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;->cursorAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    int-to-float v0, v0

    .line 20
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput v0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;->DefaultCursorThickness:F

    .line 25
    .line 26
    return-void
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
.end method

.method public static final synthetic access$getCursorAnimationSpec$p()Landroidx/compose/animation/core/AnimationSpec;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;->cursorAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    return-object v0
.end method

.method public static final synthetic access$getCursorRectInScroller(Landroidx/compose/ui/unit/Density;ILandroidx/compose/ui/text/TextLayoutResult;ZI)Landroidx/compose/ui/geometry/Rect;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;->getCursorRectInScroller(Landroidx/compose/ui/unit/Density;ILandroidx/compose/ui/text/TextLayoutResult;ZI)Landroidx/compose/ui/geometry/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isSpecified(Landroidx/compose/ui/graphics/Brush;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;->isSpecified(Landroidx/compose/ui/graphics/Brush;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$roundToNext(F)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;->roundToNext(F)F

    move-result p0

    return p0
.end method

.method private static final getCursorRectInScroller(Landroidx/compose/ui/unit/Density;ILandroidx/compose/ui/text/TextLayoutResult;ZI)Landroidx/compose/ui/geometry/Rect;
    .locals 7

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Lkotlin/ranges/l;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v2, v1}, Lkotlin/ranges/l;-><init>(II)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/ranges/s;->J(ILkotlin/ranges/g;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {p2, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    :cond_0
    sget-object p1, Landroidx/compose/ui/geometry/Rect;->Companion:Landroidx/compose/ui/geometry/Rect$Companion;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Rect$Companion;->getZero()Landroidx/compose/ui/geometry/Rect;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_1
    move-object v0, p1

    .line 38
    sget p1, Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt;->DefaultCursorThickness:F

    .line 39
    .line 40
    invoke-interface {p0, p1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    int-to-float p1, p4

    .line 47
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    sub-float/2addr p1, p2

    .line 52
    int-to-float p2, p0

    .line 53
    sub-float/2addr p1, p2

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    :goto_0
    move v1, p1

    .line 60
    if-eqz p3, :cond_3

    .line 61
    .line 62
    int-to-float p0, p4

    .line 63
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    sub-float/2addr p0, p1

    .line 68
    move v3, p0

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    int-to-float p0, p0

    .line 75
    add-float/2addr p1, p0

    .line 76
    move v3, p1

    .line 77
    :goto_1
    const/4 v2, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    const/16 v5, 0xa

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/geometry/Rect;->copy$default(Landroidx/compose/ui/geometry/Rect;FFFFILjava/lang/Object;)Landroidx/compose/ui/geometry/Rect;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
.end method

.method private static final isSpecified(Landroidx/compose/ui/graphics/Brush;)Z
    .locals 6

    .line 1
    instance-of v0, p0, Landroidx/compose/ui/graphics/SolidColor;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    check-cast p0, Landroidx/compose/ui/graphics/SolidColor;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/SolidColor;->getValue-0d7_KjU()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    sget-object p0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    cmp-long p0, v2, v4

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    move p0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p0, v0

    .line 26
    :goto_0
    if-nez p0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v0

    .line 30
    :cond_2
    :goto_1
    return v1
    .line 31
    .line 32
.end method

.method private static final roundToNext(F)F
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    cmpl-float v0, p0, v0

    .line 16
    .line 17
    if-lez v0, :cond_1

    .line 18
    .line 19
    float-to-double v0, p0

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    float-to-double v0, p0

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    :goto_0
    double-to-float p0, v0

    .line 31
    :cond_2
    :goto_1
    return p0
    .line 32
.end method
