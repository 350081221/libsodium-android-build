.class public final Landroidx/compose/ui/graphics/vector/PathParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000c\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\u0008J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0002H\u0082\u0008J\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0014\u0010\u0013\u001a\u00020\u00002\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010J\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0017\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0018j\u0008\u0012\u0004\u0012\u00020\u0011`\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/vector/PathParser;",
        "",
        "",
        "dataCount",
        "Lkotlin/r2;",
        "resizeNodeData",
        "",
        "cmd",
        "",
        "args",
        "count",
        "addNodes",
        "clear",
        "",
        "pathData",
        "parsePathString",
        "",
        "Landroidx/compose/ui/graphics/vector/PathNode;",
        "nodes",
        "addPathNodes",
        "toNodes",
        "Landroidx/compose/ui/graphics/Path;",
        "target",
        "toPath",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "Ljava/util/ArrayList;",
        "nodeData",
        "[F",
        "<init>",
        "()V",
        "ui-graphics_release"
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
        "SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 JvmFastFloatParser.jvm.kt\nandroidx/compose/ui/graphics/vector/JvmFastFloatParser_jvmKt\n*L\n1#1,555:1\n132#1,6:559\n150#1,2:565\n49#2:556\n50#2:557\n22#3:558\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n115#1:559,6\n123#1:565,2\n109#1:556\n110#1:557\n110#1:558\n*E\n"
    }
.end annotation


# instance fields
.field private nodeData:[F
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final nodes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodes:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v0, 0x40

    .line 12
    .line 13
    new-array v0, v0, [F

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodeData:[F

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
.end method

.method private final addNodes(C[FI)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodes:Ljava/util/ArrayList;

    invoke-static {p1, v0, p2, p3}, Landroidx/compose/ui/graphics/vector/PathNodeKt;->addPathNodes(CLjava/util/ArrayList;[FI)V

    return-void
.end method

.method private final resizeNodeData(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodeData:[F

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    mul-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    new-array p1, p1, [F

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodeData:[F

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, p1, v2, v2, v1}, Lkotlin/collections/l;->y0([F[FIII)[F

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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
.end method

.method public static synthetic toPath$default(Landroidx/compose/ui/graphics/vector/PathParser;Landroidx/compose/ui/graphics/Path;ILjava/lang/Object;)Landroidx/compose/ui/graphics/Path;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/graphics/vector/PathParser;->toPath(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addPathNodes(Ljava/util/List;)Landroidx/compose/ui/graphics/vector/PathParser;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;)",
            "Landroidx/compose/ui/graphics/vector/PathParser;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodes:Ljava/util/ArrayList;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final parsePathString(Ljava/lang/String;)Landroidx/compose/ui/graphics/vector/PathParser;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodes:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    const/16 v3, 0x20

    .line 13
    .line 14
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-static {v4, v3}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-gtz v4, :cond_0

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :goto_1
    if-le v0, v2, :cond_1

    .line 30
    .line 31
    add-int/lit8 v4, v0, -0x1

    .line 32
    .line 33
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v4, v3}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-gtz v4, :cond_1

    .line 42
    .line 43
    add-int/lit8 v0, v0, -0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v4, v1

    .line 47
    :goto_2
    if-ge v2, v0, :cond_c

    .line 48
    .line 49
    :goto_3
    add-int/lit8 v5, v2, 0x1

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    or-int/lit8 v6, v2, 0x20

    .line 56
    .line 57
    add-int/lit8 v7, v6, -0x61

    .line 58
    .line 59
    add-int/lit8 v8, v6, -0x7a

    .line 60
    .line 61
    mul-int/2addr v7, v8

    .line 62
    if-gtz v7, :cond_2

    .line 63
    .line 64
    const/16 v7, 0x65

    .line 65
    .line 66
    if-eq v6, v7, :cond_2

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_2
    if-lt v5, v0, :cond_b

    .line 70
    .line 71
    move v2, v1

    .line 72
    :goto_4
    if-eqz v2, :cond_a

    .line 73
    .line 74
    or-int/lit8 v6, v2, 0x20

    .line 75
    .line 76
    const/16 v7, 0x7a

    .line 77
    .line 78
    if-eq v6, v7, :cond_9

    .line 79
    .line 80
    move v4, v1

    .line 81
    :goto_5
    if-ge v5, v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l0;->t(II)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-gtz v6, :cond_3

    .line 92
    .line 93
    add-int/lit8 v5, v5, 0x1

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_3
    invoke-static {p1, v5, v0}, Landroidx/compose/ui/graphics/vector/FastFloatParserKt;->nextFloat(Ljava/lang/String;II)J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    ushr-long v7, v5, v3

    .line 101
    .line 102
    long-to-int v7, v7

    .line 103
    const-wide v8, 0xffffffffL

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    and-long/2addr v5, v8

    .line 109
    long-to-int v5, v5

    .line 110
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-nez v6, :cond_5

    .line 119
    .line 120
    iget-object v6, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodeData:[F

    .line 121
    .line 122
    add-int/lit8 v8, v4, 0x1

    .line 123
    .line 124
    aput v5, v6, v4

    .line 125
    .line 126
    array-length v4, v6

    .line 127
    if-lt v8, v4, :cond_4

    .line 128
    .line 129
    mul-int/lit8 v4, v8, 0x2

    .line 130
    .line 131
    new-array v4, v4, [F

    .line 132
    .line 133
    iput-object v4, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodeData:[F

    .line 134
    .line 135
    array-length v9, v6

    .line 136
    invoke-static {v6, v4, v1, v1, v9}, Lkotlin/collections/l;->y0([F[FIII)[F

    .line 137
    .line 138
    .line 139
    :cond_4
    move v4, v8

    .line 140
    :cond_5
    :goto_6
    if-ge v7, v0, :cond_6

    .line 141
    .line 142
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    const/16 v8, 0x2c

    .line 147
    .line 148
    if-ne v6, v8, :cond_6

    .line 149
    .line 150
    add-int/lit8 v7, v7, 0x1

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_6
    if-ge v7, v0, :cond_8

    .line 154
    .line 155
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_7

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_7
    move v5, v7

    .line 163
    goto :goto_5

    .line 164
    :cond_8
    :goto_7
    move v5, v7

    .line 165
    :cond_9
    iget-object v6, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodeData:[F

    .line 166
    .line 167
    iget-object v7, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodes:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-static {v2, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathNodeKt;->addPathNodes(CLjava/util/ArrayList;[FI)V

    .line 170
    .line 171
    .line 172
    :cond_a
    move v2, v5

    .line 173
    goto :goto_2

    .line 174
    :cond_b
    move v2, v5

    .line 175
    goto :goto_3

    .line 176
    :cond_c
    return-object p0
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

.method public final toNodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final toPath(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;
    .locals 1
    .param p1    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/PathParser;->nodes:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Landroidx/compose/ui/graphics/vector/PathParserKt;->toPath(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;

    move-result-object p1

    return-object p1
.end method
