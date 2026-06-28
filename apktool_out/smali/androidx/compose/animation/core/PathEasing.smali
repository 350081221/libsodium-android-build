.class public final Landroidx/compose/animation/core/PathEasing;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/animation/core/Easing;


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/animation/core/PathEasing;",
        "Landroidx/compose/animation/core/Easing;",
        "path",
        "Landroidx/compose/ui/graphics/Path;",
        "(Landroidx/compose/ui/graphics/Path;)V",
        "offsetX",
        "",
        "offsetY",
        "transform",
        "",
        "fraction",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final offsetX:[F
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final offsetY:[F
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/graphics/Path;)V
    .locals 7
    .param p1    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPathMeasure_androidKt;->PathMeasure()Landroidx/compose/ui/graphics/PathMeasure;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, p1, v1}, Landroidx/compose/ui/graphics/PathMeasure;->setPath(Landroidx/compose/ui/graphics/Path;Z)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Landroidx/compose/ui/graphics/PathMeasure;->getLength()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v2, 0x0

    .line 17
    cmpl-float v3, p1, v2

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-lez v3, :cond_0

    .line 21
    .line 22
    move v3, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v1

    .line 25
    :goto_0
    if-eqz v3, :cond_6

    .line 26
    .line 27
    const v3, 0x3b03126f    # 0.002f

    .line 28
    .line 29
    .line 30
    div-float v3, p1, v3

    .line 31
    .line 32
    float-to-int v3, v3

    .line 33
    add-int/2addr v3, v4

    .line 34
    new-array v4, v3, [F

    .line 35
    .line 36
    move v5, v1

    .line 37
    :goto_1
    if-ge v5, v3, :cond_1

    .line 38
    .line 39
    aput v2, v4, v5

    .line 40
    .line 41
    add-int/lit8 v5, v5, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iput-object v4, p0, Landroidx/compose/animation/core/PathEasing;->offsetX:[F

    .line 45
    .line 46
    new-array v4, v3, [F

    .line 47
    .line 48
    move v5, v1

    .line 49
    :goto_2
    if-ge v5, v3, :cond_2

    .line 50
    .line 51
    aput v2, v4, v5

    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iput-object v4, p0, Landroidx/compose/animation/core/PathEasing;->offsetY:[F

    .line 57
    .line 58
    :goto_3
    if-ge v1, v3, :cond_5

    .line 59
    .line 60
    int-to-float v2, v1

    .line 61
    mul-float/2addr v2, p1

    .line 62
    add-int/lit8 v4, v3, -0x1

    .line 63
    .line 64
    int-to-float v4, v4

    .line 65
    div-float/2addr v2, v4

    .line 66
    invoke-interface {v0, v2}, Landroidx/compose/ui/graphics/PathMeasure;->getPosition-tuRUvjQ(F)J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    iget-object v2, p0, Landroidx/compose/animation/core/PathEasing;->offsetX:[F

    .line 71
    .line 72
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    aput v6, v2, v1

    .line 77
    .line 78
    iget-object v2, p0, Landroidx/compose/animation/core/PathEasing;->offsetY:[F

    .line 79
    .line 80
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    aput v4, v2, v1

    .line 85
    .line 86
    if-lez v1, :cond_4

    .line 87
    .line 88
    iget-object v2, p0, Landroidx/compose/animation/core/PathEasing;->offsetX:[F

    .line 89
    .line 90
    aget v4, v2, v1

    .line 91
    .line 92
    add-int/lit8 v5, v1, -0x1

    .line 93
    .line 94
    aget v2, v2, v5

    .line 95
    .line 96
    cmpg-float v2, v4, v2

    .line 97
    .line 98
    if-ltz v2, :cond_3

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    const-string v0, "Path needs to be continuously increasing"

    .line 104
    .line 105
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_4
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    return-void

    .line 113
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    const-string v0, "Path cannot be zero in length. Ensure that supplied Path starts at [0,0] and ends at [1,1]"

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1
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
.end method


# virtual methods
.method public transform(F)F
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gtz v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v1, p1, v0

    .line 10
    .line 11
    if-ltz v1, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    iget-object v2, p0, Landroidx/compose/animation/core/PathEasing;->offsetX:[F

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x6

    .line 19
    const/4 v7, 0x0

    .line 20
    move v3, p1

    .line 21
    invoke-static/range {v2 .. v7}, Lkotlin/collections/l;->I([FFIIILjava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-lez v0, :cond_2

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/animation/core/PathEasing;->offsetY:[F

    .line 28
    .line 29
    aget p1, p1, v0

    .line 30
    .line 31
    return p1

    .line 32
    :cond_2
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Landroidx/compose/animation/core/PathEasing;->offsetX:[F

    .line 37
    .line 38
    array-length v2, v1

    .line 39
    add-int/lit8 v2, v2, -0x1

    .line 40
    .line 41
    if-lt v0, v2, :cond_3

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/compose/animation/core/PathEasing;->offsetY:[F

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/collections/l;->uh([F)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_3
    add-int/lit8 v2, v0, 0x1

    .line 51
    .line 52
    aget v3, v1, v2

    .line 53
    .line 54
    aget v1, v1, v0

    .line 55
    .line 56
    sub-float/2addr v3, v1

    .line 57
    sub-float/2addr p1, v1

    .line 58
    div-float/2addr p1, v3

    .line 59
    iget-object v1, p0, Landroidx/compose/animation/core/PathEasing;->offsetY:[F

    .line 60
    .line 61
    aget v0, v1, v0

    .line 62
    .line 63
    aget v1, v1, v2

    .line 64
    .line 65
    sub-float/2addr v1, v0

    .line 66
    mul-float/2addr p1, v1

    .line 67
    add-float/2addr v0, p1

    .line 68
    return v0
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
.end method
