.class final Landroidx/compose/ui/node/LayerPositionalProperties;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0000R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0016\u0010\u000c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000bR\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/ui/node/LayerPositionalProperties;",
        "",
        "other",
        "Lkotlin/r2;",
        "copyFrom",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
        "scope",
        "",
        "hasSameValuesAs",
        "",
        "scaleX",
        "F",
        "scaleY",
        "translationX",
        "translationY",
        "rotationX",
        "rotationY",
        "rotationZ",
        "cameraDistance",
        "Landroidx/compose/ui/graphics/TransformOrigin;",
        "transformOrigin",
        "J",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private cameraDistance:F

.field private rotationX:F

.field private rotationY:F

.field private rotationZ:F

.field private scaleX:F

.field private scaleY:F

.field private transformOrigin:J

.field private translationX:F

.field private translationY:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 7
    .line 8
    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 9
    .line 10
    const/high16 v0, 0x41000000    # 8.0f

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 13
    .line 14
    sget-object v0, Landroidx/compose/ui/graphics/TransformOrigin;->Companion:Landroidx/compose/ui/graphics/TransformOrigin$Companion;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/TransformOrigin$Companion;->getCenter-SzJe1aQ()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    .line 21
    .line 22
    return-void
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
.end method


# virtual methods
.method public final copyFrom(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 10
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getScaleX()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 11
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getScaleY()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 12
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getTranslationX()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    .line 13
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getTranslationY()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    .line 14
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getRotationX()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    .line 15
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getRotationY()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    .line 16
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getRotationZ()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    .line 17
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getCameraDistance()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 18
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getTransformOrigin-SzJe1aQ()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    return-void
.end method

.method public final copyFrom(Landroidx/compose/ui/node/LayerPositionalProperties;)V
    .locals 2
    .param p1    # Landroidx/compose/ui/node/LayerPositionalProperties;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 2
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 3
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    .line 4
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    .line 5
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    .line 6
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    .line 7
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    .line 8
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 9
    iget-wide v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    iput-wide v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    return-void
.end method

.method public final hasSameValuesAs(Landroidx/compose/ui/node/LayerPositionalProperties;)Z
    .locals 7
    .param p1    # Landroidx/compose/ui/node/LayerPositionalProperties;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 2
    .line 3
    iget v1, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 4
    .line 5
    cmpg-float v0, v0, v1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_8

    .line 15
    .line 16
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 17
    .line 18
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 19
    .line 20
    cmpg-float v0, v0, v3

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    move v0, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v0, v2

    .line 27
    :goto_1
    if-eqz v0, :cond_8

    .line 28
    .line 29
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    .line 30
    .line 31
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    .line 32
    .line 33
    cmpg-float v0, v0, v3

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    move v0, v1

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v0, v2

    .line 40
    :goto_2
    if-eqz v0, :cond_8

    .line 41
    .line 42
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    .line 43
    .line 44
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    .line 45
    .line 46
    cmpg-float v0, v0, v3

    .line 47
    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    move v0, v1

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move v0, v2

    .line 53
    :goto_3
    if-eqz v0, :cond_8

    .line 54
    .line 55
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    .line 56
    .line 57
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    .line 58
    .line 59
    cmpg-float v0, v0, v3

    .line 60
    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    move v0, v1

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move v0, v2

    .line 66
    :goto_4
    if-eqz v0, :cond_8

    .line 67
    .line 68
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    .line 69
    .line 70
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    .line 71
    .line 72
    cmpg-float v0, v0, v3

    .line 73
    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    move v0, v1

    .line 77
    goto :goto_5

    .line 78
    :cond_5
    move v0, v2

    .line 79
    :goto_5
    if-eqz v0, :cond_8

    .line 80
    .line 81
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    .line 82
    .line 83
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    .line 84
    .line 85
    cmpg-float v0, v0, v3

    .line 86
    .line 87
    if-nez v0, :cond_6

    .line 88
    .line 89
    move v0, v1

    .line 90
    goto :goto_6

    .line 91
    :cond_6
    move v0, v2

    .line 92
    :goto_6
    if-eqz v0, :cond_8

    .line 93
    .line 94
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 95
    .line 96
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 97
    .line 98
    cmpg-float v0, v0, v3

    .line 99
    .line 100
    if-nez v0, :cond_7

    .line 101
    .line 102
    move v0, v1

    .line 103
    goto :goto_7

    .line 104
    :cond_7
    move v0, v2

    .line 105
    :goto_7
    if-eqz v0, :cond_8

    .line 106
    .line 107
    iget-wide v3, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    .line 108
    .line 109
    iget-wide v5, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    .line 110
    .line 111
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/TransformOrigin;->equals-impl0(JJ)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    goto :goto_8

    .line 118
    :cond_8
    move v1, v2

    .line 119
    :goto_8
    return v1
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
.end method
