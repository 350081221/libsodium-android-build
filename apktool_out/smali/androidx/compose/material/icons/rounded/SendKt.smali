.class public final Landroidx/compose/material/icons/rounded/SendKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_send",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Send",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSend$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getSend",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/rounded/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n212#2,12:57\n233#2,18:70\n253#2:107\n174#3:69\n705#4,2:88\n717#4,2:90\n719#4,11:96\n72#5,4:92\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/rounded/SendKt\n*L\n35#1:57,12\n36#1:70,18\n36#1:107\n35#1:69\n36#1:88,2\n36#1:90,2\n36#1:96,11\n36#1:92,4\n*E\n"
    }
.end annotation


# static fields
.field private static _send:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSend(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30
    .param p0    # Landroidx/compose/material/icons/Icons$Rounded;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SendKt;->_send:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    const-string v2, "Rounded.Send"

    .line 10
    .line 11
    const/4 v10, 0x0

    .line 12
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 13
    .line 14
    move-object v13, v1

    .line 15
    const/high16 v0, 0x41c00000    # 24.0f

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/16 v11, 0x60

    .line 33
    .line 34
    const/4 v12, 0x0

    .line 35
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/w;)V

    .line 36
    .line 37
    .line 38
    const/high16 v18, 0x3f800000    # 1.0f

    .line 39
    .line 40
    const/high16 v20, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 43
    .line 44
    .line 45
    move-result v15

    .line 46
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 47
    .line 48
    move-object/from16 v17, v0

    .line 49
    .line 50
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/w;)V

    .line 58
    .line 59
    .line 60
    const/16 v19, 0x0

    .line 61
    .line 62
    const/high16 v21, 0x3f800000    # 1.0f

    .line 63
    .line 64
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 67
    .line 68
    .line 69
    move-result v22

    .line 70
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 73
    .line 74
    .line 75
    move-result v23

    .line 76
    const/high16 v24, 0x3f800000    # 1.0f

    .line 77
    .line 78
    const-string v16, ""

    .line 79
    .line 80
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const v0, 0x41a33333    # 20.4f

    .line 86
    .line 87
    .line 88
    const v8, 0x4059999a    # 3.4f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v8, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x418b999a    # 17.45f

    .line 95
    .line 96
    .line 97
    const v1, -0x3f10a3d7    # -7.48f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v1, 0x3f4f5c29    # 0.81f

    .line 104
    .line 105
    .line 106
    const v2, -0x414ccccd    # -0.35f

    .line 107
    .line 108
    .line 109
    const v3, 0x3f4f5c29    # 0.81f

    .line 110
    .line 111
    .line 112
    const v4, -0x404147ae    # -1.49f

    .line 113
    .line 114
    .line 115
    const/4 v5, 0x0

    .line 116
    const v6, -0x40147ae1    # -1.84f

    .line 117
    .line 118
    .line 119
    move-object v0, v7

    .line 120
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x40666666    # 3.6f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v8, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v1, -0x40d70a3d    # -0.66f

    .line 130
    .line 131
    .line 132
    const v2, -0x416b851f    # -0.29f

    .line 133
    .line 134
    .line 135
    const v3, -0x404e147b    # -1.39f

    .line 136
    .line 137
    .line 138
    const v4, 0x3e4ccccd    # 0.2f

    .line 139
    .line 140
    .line 141
    const v5, -0x404e147b    # -1.39f

    .line 142
    .line 143
    .line 144
    const v6, 0x3f68f5c3    # 0.91f

    .line 145
    .line 146
    .line 147
    move-object v0, v7

    .line 148
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, 0x40000000    # 2.0f

    .line 152
    .line 153
    const v1, 0x4111eb85    # 9.12f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/4 v1, 0x0

    .line 160
    const/high16 v2, 0x3f000000    # 0.5f

    .line 161
    .line 162
    const v3, 0x3ebd70a4    # 0.37f

    .line 163
    .line 164
    .line 165
    const v4, 0x3f6e147b    # 0.93f

    .line 166
    .line 167
    .line 168
    const v5, 0x3f5eb852    # 0.87f

    .line 169
    .line 170
    .line 171
    const v6, 0x3f7d70a4    # 0.99f

    .line 172
    .line 173
    .line 174
    move-object v0, v7

    .line 175
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x41880000    # 17.0f

    .line 179
    .line 180
    const/high16 v1, 0x41400000    # 12.0f

    .line 181
    .line 182
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x4037ae14    # 2.87f

    .line 186
    .line 187
    .line 188
    const v1, 0x415e147b    # 13.88f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v1, -0x41000000    # -0.5f

    .line 195
    .line 196
    const v2, 0x3d8f5c29    # 0.07f

    .line 197
    .line 198
    .line 199
    const v3, -0x40a147ae    # -0.87f

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x3f000000    # 0.5f

    .line 203
    .line 204
    const v5, -0x40a147ae    # -0.87f

    .line 205
    .line 206
    .line 207
    const/high16 v6, 0x3f800000    # 1.0f

    .line 208
    .line 209
    move-object v0, v7

    .line 210
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x3c23d70a    # 0.01f

    .line 214
    .line 215
    .line 216
    const v1, 0x4093851f    # 4.61f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/4 v1, 0x0

    .line 223
    const v2, 0x3f35c28f    # 0.71f

    .line 224
    .line 225
    .line 226
    const v3, 0x3f3ae148    # 0.73f

    .line 227
    .line 228
    .line 229
    const v4, 0x3f99999a    # 1.2f

    .line 230
    .line 231
    .line 232
    const v5, 0x3fb1eb85    # 1.39f

    .line 233
    .line 234
    .line 235
    const v6, 0x3f68f5c3    # 0.91f

    .line 236
    .line 237
    .line 238
    move-object v0, v7

    .line 239
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v14

    .line 249
    const/16 v25, 0x0

    .line 250
    .line 251
    const/16 v26, 0x0

    .line 252
    .line 253
    const/16 v27, 0x0

    .line 254
    .line 255
    const/16 v28, 0x3800

    .line 256
    .line 257
    const/16 v29, 0x0

    .line 258
    .line 259
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    sput-object v0, Landroidx/compose/material/icons/rounded/SendKt;->_send:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 268
    .line 269
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    return-object v0
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

.method public static synthetic getSend$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/k;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.Send"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "Icons.AutoMirrored.Rounded.Send"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.Send"
            }
        .end subannotation
    .end annotation

    return-void
.end method
