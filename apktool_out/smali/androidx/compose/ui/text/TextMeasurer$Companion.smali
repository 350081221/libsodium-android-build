.class public final Landroidx/compose/ui/text/TextMeasurer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/text/TextMeasurer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/text/TextMeasurer$Companion;",
        "",
        "()V",
        "layout",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "textLayoutInput",
        "Landroidx/compose/ui/text/TextLayoutInput;",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/text/TextMeasurer$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$layout(Landroidx/compose/ui/text/TextMeasurer$Companion;Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/text/TextMeasurer$Companion;->layout(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;

    move-result-object p0

    return-object p0
.end method

.method private final layout(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 17

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v0, v2}, Landroidx/compose/ui/text/TextStyleKt;->resolveDefaults(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/TextStyle;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getDensity()Landroidx/compose/ui/unit/Density;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getFontFamilyResolver()Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getPlaceholders()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v7, Landroidx/compose/ui/text/MultiParagraphIntrinsics;

    .line 30
    .line 31
    move-object v0, v7

    .line 32
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/text/MultiParagraphIntrinsics;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getConstraints-msEJaDk()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getSoftWrap()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v3, 0x1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getOverflow-gIe3tQ8()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sget-object v4, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 56
    .line 57
    invoke-virtual {v4}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-static {v1, v4}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v1, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    :goto_0
    move v1, v3

    .line 71
    :goto_1
    if-eqz v1, :cond_2

    .line 72
    .line 73
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getConstraints-msEJaDk()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/Constraints;->getHasBoundedWidth-impl(J)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getConstraints-msEJaDk()J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const v1, 0x7fffffff

    .line 93
    .line 94
    .line 95
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getSoftWrap()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_3

    .line 100
    .line 101
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getOverflow-gIe3tQ8()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    sget-object v5, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 106
    .line 107
    invoke-virtual {v5}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    invoke-static {v4, v5}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_3

    .line 116
    .line 117
    move v2, v3

    .line 118
    :cond_3
    if-eqz v2, :cond_4

    .line 119
    .line 120
    move v10, v3

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getMaxLines()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    move v10, v2

    .line 127
    :goto_3
    if-ne v0, v1, :cond_5

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/text/MultiParagraphIntrinsics;->getMaxIntrinsicWidth()F

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-static {v2}, Landroidx/compose/ui/text/ParagraphKt;->ceilToInt(F)I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    invoke-static {v2, v0, v1}, Lkotlin/ranges/s;->I(III)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    :goto_4
    move v12, v1

    .line 143
    new-instance v2, Landroidx/compose/ui/text/MultiParagraph;

    .line 144
    .line 145
    const/4 v11, 0x0

    .line 146
    const/4 v13, 0x0

    .line 147
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getConstraints-msEJaDk()J

    .line 148
    .line 149
    .line 150
    move-result-wide v0

    .line 151
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    const/4 v15, 0x5

    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    invoke-static/range {v11 .. v16}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getOverflow-gIe3tQ8()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    sget-object v1, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 167
    .line 168
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    invoke-static {v0, v1}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    const/4 v12, 0x0

    .line 177
    move-object v6, v2

    .line 178
    invoke-direct/range {v6 .. v12}, Landroidx/compose/ui/text/MultiParagraph;-><init>(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/w;)V

    .line 179
    .line 180
    .line 181
    new-instance v6, Landroidx/compose/ui/text/TextLayoutResult;

    .line 182
    .line 183
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/text/TextLayoutInput;->getConstraints-msEJaDk()J

    .line 184
    .line 185
    .line 186
    move-result-wide v0

    .line 187
    invoke-virtual {v2}, Landroidx/compose/ui/text/MultiParagraph;->getWidth()F

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    float-to-double v3, v3

    .line 192
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 193
    .line 194
    .line 195
    move-result-wide v3

    .line 196
    double-to-float v3, v3

    .line 197
    float-to-int v3, v3

    .line 198
    invoke-virtual {v2}, Landroidx/compose/ui/text/MultiParagraph;->getHeight()F

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    float-to-double v4, v4

    .line 203
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 204
    .line 205
    .line 206
    move-result-wide v4

    .line 207
    double-to-float v4, v4

    .line 208
    float-to-int v4, v4

    .line 209
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    .line 210
    .line 211
    .line 212
    move-result-wide v3

    .line 213
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/ui/unit/ConstraintsKt;->constrain-4WqzIAM(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v3

    .line 217
    const/4 v5, 0x0

    .line 218
    move-object v0, v6

    .line 219
    move-object/from16 v1, p1

    .line 220
    .line 221
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/text/TextLayoutResult;-><init>(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/w;)V

    .line 222
    .line 223
    .line 224
    return-object v6
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
