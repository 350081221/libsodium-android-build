.class public final Landroidx/compose/ui/graphics/colorspace/Lab;
.super Landroidx/compose/ui/graphics/colorspace/ColorSpace;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/colorspace/Lab$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010\u00a2\u0006\u0002\u0008\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010\u00a2\u0006\u0002\u0008\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\t\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/colorspace/Lab;",
        "Landroidx/compose/ui/graphics/colorspace/ColorSpace;",
        "name",
        "",
        "id",
        "",
        "(Ljava/lang/String;I)V",
        "isWideGamut",
        "",
        "()Z",
        "fromXyz",
        "",
        "v",
        "getMaxValue",
        "",
        "component",
        "getMinValue",
        "toXy",
        "",
        "v0",
        "v1",
        "v2",
        "toXy$ui_graphics_release",
        "toXyz",
        "toZ",
        "toZ$ui_graphics_release",
        "xyzaToColor",
        "Landroidx/compose/ui/graphics/Color;",
        "x",
        "y",
        "z",
        "a",
        "colorSpace",
        "xyzaToColor-JlNiLsg$ui_graphics_release",
        "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J",
        "Companion",
        "ui-graphics_release"
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
        "SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,141:1\n25#2,3:142\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:142,3\n*E\n"
    }
.end annotation


# static fields
.field private static final A:F = 0.008856452f

.field private static final B:F = 7.787037f

.field private static final C:F = 0.13793103f

.field public static final Companion:Landroidx/compose/ui/graphics/colorspace/Lab$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final D:F = 0.20689656f


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/graphics/colorspace/Lab$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/colorspace/Lab$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Landroidx/compose/ui/graphics/colorspace/Lab;->Companion:Landroidx/compose/ui/graphics/colorspace/Lab$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/ColorModel;->Companion:Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;->getLab-xdoWZVw()J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const/4 v6, 0x0

    .line 8
    move-object v1, p0

    .line 9
    move-object v2, p1

    .line 10
    move v5, p2

    .line 11
    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/w;)V

    .line 12
    .line 13
    .line 14
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
.method public fromXyz([F)[F
    .locals 15
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    .line 3
    .line 4
    sget-object v2, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 5
    .line 6
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    aget v3, v3, v0

    .line 11
    .line 12
    div-float/2addr v1, v3

    .line 13
    const/4 v3, 0x1

    .line 14
    aget v4, p1, v3

    .line 15
    .line 16
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    aget v5, v5, v3

    .line 21
    .line 22
    div-float/2addr v4, v5

    .line 23
    const/4 v5, 0x2

    .line 24
    aget v6, p1, v5

    .line 25
    .line 26
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    aget v2, v2, v5

    .line 31
    .line 32
    div-float/2addr v6, v2

    .line 33
    const v2, 0x3c111aa7

    .line 34
    .line 35
    .line 36
    cmpl-float v7, v1, v2

    .line 37
    .line 38
    const v8, 0x3eaaaaab

    .line 39
    .line 40
    .line 41
    const v9, 0x3e0d3dcb

    .line 42
    .line 43
    .line 44
    const v10, 0x40f92f68

    .line 45
    .line 46
    .line 47
    if-lez v7, :cond_0

    .line 48
    .line 49
    float-to-double v11, v1

    .line 50
    float-to-double v13, v8

    .line 51
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 52
    .line 53
    .line 54
    move-result-wide v11

    .line 55
    double-to-float v1, v11

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    mul-float/2addr v1, v10

    .line 58
    add-float/2addr v1, v9

    .line 59
    :goto_0
    cmpl-float v7, v4, v2

    .line 60
    .line 61
    if-lez v7, :cond_1

    .line 62
    .line 63
    float-to-double v11, v4

    .line 64
    float-to-double v13, v8

    .line 65
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 66
    .line 67
    .line 68
    move-result-wide v11

    .line 69
    double-to-float v4, v11

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    mul-float/2addr v4, v10

    .line 72
    add-float/2addr v4, v9

    .line 73
    :goto_1
    cmpl-float v2, v6, v2

    .line 74
    .line 75
    if-lez v2, :cond_2

    .line 76
    .line 77
    float-to-double v6, v6

    .line 78
    float-to-double v8, v8

    .line 79
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    double-to-float v2, v6

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    mul-float/2addr v6, v10

    .line 86
    add-float v2, v6, v9

    .line 87
    .line 88
    :goto_2
    const/high16 v6, 0x42e80000    # 116.0f

    .line 89
    .line 90
    mul-float/2addr v6, v4

    .line 91
    const/high16 v7, 0x41800000    # 16.0f

    .line 92
    .line 93
    sub-float/2addr v6, v7

    .line 94
    const/high16 v7, 0x43fa0000    # 500.0f

    .line 95
    .line 96
    sub-float/2addr v1, v4

    .line 97
    mul-float/2addr v1, v7

    .line 98
    const/high16 v7, 0x43480000    # 200.0f

    .line 99
    .line 100
    sub-float/2addr v4, v2

    .line 101
    mul-float/2addr v4, v7

    .line 102
    const/4 v2, 0x0

    .line 103
    const/high16 v7, 0x42c80000    # 100.0f

    .line 104
    .line 105
    invoke-static {v6, v2, v7}, Lkotlin/ranges/s;->H(FFF)F

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    aput v2, p1, v0

    .line 110
    .line 111
    const/high16 v0, -0x3d000000    # -128.0f

    .line 112
    .line 113
    const/high16 v2, 0x43000000    # 128.0f

    .line 114
    .line 115
    invoke-static {v1, v0, v2}, Lkotlin/ranges/s;->H(FFF)F

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    aput v1, p1, v3

    .line 120
    .line 121
    invoke-static {v4, v0, v2}, Lkotlin/ranges/s;->H(FFF)F

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    aput v0, p1, v5

    .line 126
    .line 127
    return-object p1
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
.end method

.method public getMaxValue(I)F
    .locals 0

    if-nez p1, :cond_0

    const/high16 p1, 0x42c80000    # 100.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x43000000    # 128.0f

    :goto_0
    return p1
.end method

.method public getMinValue(I)F
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 p1, -0x3d000000    # -128.0f

    :goto_0
    return p1
.end method

.method public isWideGamut()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toXy$ui_graphics_release(FFF)J
    .locals 4

    .line 1
    const/4 p3, 0x0

    .line 2
    const/high16 v0, 0x42c80000    # 100.0f

    .line 3
    .line 4
    invoke-static {p1, p3, v0}, Lkotlin/ranges/s;->H(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/high16 p3, -0x3d000000    # -128.0f

    .line 9
    .line 10
    const/high16 v0, 0x43000000    # 128.0f

    .line 11
    .line 12
    invoke-static {p2, p3, v0}, Lkotlin/ranges/s;->H(FFF)F

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/high16 p3, 0x41800000    # 16.0f

    .line 17
    .line 18
    add-float/2addr p1, p3

    .line 19
    const/high16 p3, 0x42e80000    # 116.0f

    .line 20
    .line 21
    div-float/2addr p1, p3

    .line 22
    const p3, 0x3b03126f    # 0.002f

    .line 23
    .line 24
    .line 25
    mul-float/2addr p2, p3

    .line 26
    add-float/2addr p2, p1

    .line 27
    const p3, 0x3e53dcb1

    .line 28
    .line 29
    .line 30
    cmpl-float v0, p2, p3

    .line 31
    .line 32
    const v1, 0x3e0d3dcb

    .line 33
    .line 34
    .line 35
    const v2, 0x3e038027

    .line 36
    .line 37
    .line 38
    if-lez v0, :cond_0

    .line 39
    .line 40
    mul-float v0, p2, p2

    .line 41
    .line 42
    mul-float/2addr v0, p2

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sub-float/2addr p2, v1

    .line 45
    mul-float v0, p2, v2

    .line 46
    .line 47
    :goto_0
    cmpl-float p2, p1, p3

    .line 48
    .line 49
    if-lez p2, :cond_1

    .line 50
    .line 51
    mul-float p2, p1, p1

    .line 52
    .line 53
    mul-float/2addr p2, p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sub-float/2addr p1, v1

    .line 56
    mul-float p2, p1, v2

    .line 57
    .line 58
    :goto_1
    sget-object p1, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    const/4 v1, 0x0

    .line 65
    aget p3, p3, v1

    .line 66
    .line 67
    mul-float/2addr v0, p3

    .line 68
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const/4 p3, 0x1

    .line 73
    aget p1, p1, p3

    .line 74
    .line 75
    mul-float/2addr p2, p1

    .line 76
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    int-to-long v0, p1

    .line 81
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    int-to-long p1, p1

    .line 86
    const/16 p3, 0x20

    .line 87
    .line 88
    shl-long/2addr v0, p3

    .line 89
    const-wide v2, 0xffffffffL

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    and-long/2addr p1, v2

    .line 95
    or-long/2addr p1, v0

    .line 96
    return-wide p1
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

.method public toXyz([F)[F
    .locals 10
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/high16 v3, 0x42c80000    # 100.0f

    .line 6
    .line 7
    invoke-static {v1, v2, v3}, Lkotlin/ranges/s;->H(FFF)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aput v1, p1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aget v2, p1, v1

    .line 15
    .line 16
    const/high16 v3, -0x3d000000    # -128.0f

    .line 17
    .line 18
    const/high16 v4, 0x43000000    # 128.0f

    .line 19
    .line 20
    invoke-static {v2, v3, v4}, Lkotlin/ranges/s;->H(FFF)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    aput v2, p1, v1

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    aget v5, p1, v2

    .line 28
    .line 29
    invoke-static {v5, v3, v4}, Lkotlin/ranges/s;->H(FFF)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    aput v3, p1, v2

    .line 34
    .line 35
    aget v4, p1, v0

    .line 36
    .line 37
    const/high16 v5, 0x41800000    # 16.0f

    .line 38
    .line 39
    add-float/2addr v4, v5

    .line 40
    const/high16 v5, 0x42e80000    # 116.0f

    .line 41
    .line 42
    div-float/2addr v4, v5

    .line 43
    aget v5, p1, v1

    .line 44
    .line 45
    const v6, 0x3b03126f    # 0.002f

    .line 46
    .line 47
    .line 48
    mul-float/2addr v5, v6

    .line 49
    add-float/2addr v5, v4

    .line 50
    const v6, 0x3ba3d70a    # 0.005f

    .line 51
    .line 52
    .line 53
    mul-float/2addr v3, v6

    .line 54
    sub-float v3, v4, v3

    .line 55
    .line 56
    const v6, 0x3e53dcb1

    .line 57
    .line 58
    .line 59
    cmpl-float v7, v5, v6

    .line 60
    .line 61
    const v8, 0x3e0d3dcb

    .line 62
    .line 63
    .line 64
    const v9, 0x3e038027

    .line 65
    .line 66
    .line 67
    if-lez v7, :cond_0

    .line 68
    .line 69
    mul-float v7, v5, v5

    .line 70
    .line 71
    mul-float/2addr v7, v5

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    sub-float/2addr v5, v8

    .line 74
    mul-float v7, v5, v9

    .line 75
    .line 76
    :goto_0
    cmpl-float v5, v4, v6

    .line 77
    .line 78
    if-lez v5, :cond_1

    .line 79
    .line 80
    mul-float v5, v4, v4

    .line 81
    .line 82
    mul-float/2addr v5, v4

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    sub-float/2addr v4, v8

    .line 85
    mul-float v5, v4, v9

    .line 86
    .line 87
    :goto_1
    cmpl-float v4, v3, v6

    .line 88
    .line 89
    if-lez v4, :cond_2

    .line 90
    .line 91
    mul-float v4, v3, v3

    .line 92
    .line 93
    mul-float/2addr v4, v3

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    sub-float/2addr v3, v8

    .line 96
    mul-float v4, v3, v9

    .line 97
    .line 98
    :goto_2
    sget-object v3, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 99
    .line 100
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    aget v6, v6, v0

    .line 105
    .line 106
    mul-float/2addr v7, v6

    .line 107
    aput v7, p1, v0

    .line 108
    .line 109
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    aget v0, v0, v1

    .line 114
    .line 115
    mul-float/2addr v5, v0

    .line 116
    aput v5, p1, v1

    .line 117
    .line 118
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    aget v0, v0, v2

    .line 123
    .line 124
    mul-float/2addr v4, v0

    .line 125
    aput v4, p1, v2

    .line 126
    .line 127
    return-object p1
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
.end method

.method public toZ$ui_graphics_release(FFF)F
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    const/high16 v0, 0x42c80000    # 100.0f

    .line 3
    .line 4
    invoke-static {p1, p2, v0}, Lkotlin/ranges/s;->H(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/high16 p2, -0x3d000000    # -128.0f

    .line 9
    .line 10
    const/high16 v0, 0x43000000    # 128.0f

    .line 11
    .line 12
    invoke-static {p3, p2, v0}, Lkotlin/ranges/s;->H(FFF)F

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/high16 p3, 0x41800000    # 16.0f

    .line 17
    .line 18
    add-float/2addr p1, p3

    .line 19
    const/high16 p3, 0x42e80000    # 116.0f

    .line 20
    .line 21
    div-float/2addr p1, p3

    .line 22
    const p3, 0x3ba3d70a    # 0.005f

    .line 23
    .line 24
    .line 25
    mul-float/2addr p2, p3

    .line 26
    sub-float/2addr p1, p2

    .line 27
    const p2, 0x3e53dcb1

    .line 28
    .line 29
    .line 30
    cmpl-float p2, p1, p2

    .line 31
    .line 32
    if-lez p2, :cond_0

    .line 33
    .line 34
    mul-float p2, p1, p1

    .line 35
    .line 36
    mul-float/2addr p2, p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const p2, 0x3e0d3dcb

    .line 39
    .line 40
    .line 41
    sub-float/2addr p1, p2

    .line 42
    const p2, 0x3e038027

    .line 43
    .line 44
    .line 45
    mul-float/2addr p2, p1

    .line 46
    :goto_0
    sget-object p1, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 p3, 0x2

    .line 53
    aget p1, p1, p3

    .line 54
    .line 55
    mul-float/2addr p2, p1

    .line 56
    return p2
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

.method public xyzaToColor-JlNiLsg$ui_graphics_release(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J
    .locals 9
    .param p5    # Landroidx/compose/ui/graphics/colorspace/ColorSpace;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    aget v1, v1, v2

    .line 9
    .line 10
    div-float/2addr p1, v1

    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    aget v1, v1, v2

    .line 17
    .line 18
    div-float/2addr p2, v1

    .line 19
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x2

    .line 24
    aget v0, v0, v1

    .line 25
    .line 26
    div-float/2addr p3, v0

    .line 27
    const v0, 0x3c111aa7

    .line 28
    .line 29
    .line 30
    cmpl-float v1, p1, v0

    .line 31
    .line 32
    const v2, 0x3eaaaaab

    .line 33
    .line 34
    .line 35
    const v3, 0x3e0d3dcb

    .line 36
    .line 37
    .line 38
    const v4, 0x40f92f68

    .line 39
    .line 40
    .line 41
    if-lez v1, :cond_0

    .line 42
    .line 43
    float-to-double v5, p1

    .line 44
    float-to-double v7, v2

    .line 45
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    double-to-float p1, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    mul-float/2addr p1, v4

    .line 52
    add-float/2addr p1, v3

    .line 53
    :goto_0
    cmpl-float v1, p2, v0

    .line 54
    .line 55
    if-lez v1, :cond_1

    .line 56
    .line 57
    float-to-double v5, p2

    .line 58
    float-to-double v7, v2

    .line 59
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    double-to-float p2, v5

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    mul-float/2addr p2, v4

    .line 66
    add-float/2addr p2, v3

    .line 67
    :goto_1
    cmpl-float v0, p3, v0

    .line 68
    .line 69
    if-lez v0, :cond_2

    .line 70
    .line 71
    float-to-double v0, p3

    .line 72
    float-to-double v2, v2

    .line 73
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    double-to-float p3, v0

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    mul-float/2addr p3, v4

    .line 80
    add-float/2addr p3, v3

    .line 81
    :goto_2
    const/high16 v0, 0x42e80000    # 116.0f

    .line 82
    .line 83
    mul-float/2addr v0, p2

    .line 84
    const/high16 v1, 0x41800000    # 16.0f

    .line 85
    .line 86
    sub-float/2addr v0, v1

    .line 87
    const/high16 v1, 0x43fa0000    # 500.0f

    .line 88
    .line 89
    sub-float/2addr p1, p2

    .line 90
    mul-float/2addr p1, v1

    .line 91
    const/high16 v1, 0x43480000    # 200.0f

    .line 92
    .line 93
    sub-float/2addr p2, p3

    .line 94
    mul-float/2addr p2, v1

    .line 95
    const/4 p3, 0x0

    .line 96
    const/high16 v1, 0x42c80000    # 100.0f

    .line 97
    .line 98
    invoke-static {v0, p3, v1}, Lkotlin/ranges/s;->H(FFF)F

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    const/high16 v0, -0x3d000000    # -128.0f

    .line 103
    .line 104
    const/high16 v1, 0x43000000    # 128.0f

    .line 105
    .line 106
    invoke-static {p1, v0, v1}, Lkotlin/ranges/s;->H(FFF)F

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-static {p2, v0, v1}, Lkotlin/ranges/s;->H(FFF)F

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    invoke-static {p3, p1, p2, p4, p5}, Landroidx/compose/ui/graphics/ColorKt;->Color(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    .line 115
    .line 116
    .line 117
    move-result-wide p1

    .line 118
    return-wide p1
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
