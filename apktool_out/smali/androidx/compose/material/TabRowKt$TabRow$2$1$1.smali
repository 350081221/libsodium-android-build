.class final Landroidx/compose/material/TabRowKt$TabRow$2$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TabRowKt$TabRow$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke-0kLqBqw",
        "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,521:1\n151#2,3:522\n33#2,4:525\n154#2,2:529\n38#2:531\n156#2:532\n171#2,13:533\n92#3:546\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n*L\n160#1:522,3\n160#1:525,4\n160#1:529,2\n160#1:531\n160#1:532\n164#1:533,13\n167#1:546\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $divider:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $indicator:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $tabs:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lv3/p;Lv3/p;Lv3/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$tabs:Lv3/p;

    iput-object p2, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$divider:Lv3/p;

    iput-object p3, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$indicator:Lv3/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    check-cast p2, Landroidx/compose/ui/unit/Constraints;

    invoke-virtual {p2}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 20
    .param p1    # Landroidx/compose/ui/layout/SubcomposeMeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 6
    .line 7
    .line 8
    move-result v13

    .line 9
    sget-object v1, Landroidx/compose/material/TabSlots;->Tabs:Landroidx/compose/material/TabSlots;

    .line 10
    .line 11
    iget-object v2, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$tabs:Lv3/p;

    .line 12
    .line 13
    invoke-interface {v12, v1, v2}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lv3/p;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    div-int v11, v13, v2

    .line 22
    .line 23
    new-instance v14, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v15

    .line 36
    const/4 v10, 0x0

    .line 37
    move v9, v10

    .line 38
    :goto_0
    if-ge v9, v15, :cond_0

    .line 39
    .line 40
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    move-object v8, v3

    .line 45
    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    const/16 v17, 0xc

    .line 51
    .line 52
    const/16 v18, 0x0

    .line 53
    .line 54
    move-wide/from16 v3, p2

    .line 55
    .line 56
    move v5, v11

    .line 57
    move v6, v11

    .line 58
    move-object/from16 v19, v8

    .line 59
    .line 60
    move/from16 v8, v16

    .line 61
    .line 62
    move/from16 v16, v9

    .line 63
    .line 64
    move/from16 v9, v17

    .line 65
    .line 66
    move-object/from16 v17, v1

    .line 67
    .line 68
    move v1, v10

    .line 69
    move-object/from16 v10, v18

    .line 70
    .line 71
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    move-object/from16 v5, v19

    .line 76
    .line 77
    invoke-interface {v5, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v14, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    add-int/lit8 v9, v16, 0x1

    .line 85
    .line 86
    move v10, v1

    .line 87
    move-object/from16 v1, v17

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move v1, v10

    .line 91
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const/4 v4, 0x0

    .line 96
    if-eqz v3, :cond_1

    .line 97
    .line 98
    move-object v3, v4

    .line 99
    goto :goto_2

    .line 100
    :cond_1
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-object v5, v3

    .line 105
    check-cast v5, Landroidx/compose/ui/layout/Placeable;

    .line 106
    .line 107
    invoke-virtual {v5}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    invoke-static {v14}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    const/4 v7, 0x1

    .line 116
    if-gt v7, v6, :cond_3

    .line 117
    .line 118
    :goto_1
    invoke-interface {v14, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    move-object v9, v8

    .line 123
    check-cast v9, Landroidx/compose/ui/layout/Placeable;

    .line 124
    .line 125
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-ge v5, v9, :cond_2

    .line 130
    .line 131
    move-object v3, v8

    .line 132
    move v5, v9

    .line 133
    :cond_2
    if-eq v7, v6, :cond_3

    .line 134
    .line 135
    add-int/lit8 v7, v7, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    :goto_2
    check-cast v3, Landroidx/compose/ui/layout/Placeable;

    .line 139
    .line 140
    if-eqz v3, :cond_4

    .line 141
    .line 142
    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    move v15, v3

    .line 147
    goto :goto_3

    .line 148
    :cond_4
    move v15, v1

    .line 149
    :goto_3
    new-instance v10, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 152
    .line 153
    .line 154
    :goto_4
    if-ge v1, v2, :cond_5

    .line 155
    .line 156
    new-instance v3, Landroidx/compose/material/TabPosition;

    .line 157
    .line 158
    invoke-interface {v12, v11}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    int-to-float v6, v1

    .line 163
    mul-float/2addr v5, v6

    .line 164
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    invoke-interface {v12, v11}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    invoke-direct {v3, v5, v6, v4}, Landroidx/compose/material/TabPosition;-><init>(FFLkotlin/jvm/internal/w;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    add-int/lit8 v1, v1, 0x1

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_5
    const/16 v16, 0x0

    .line 182
    .line 183
    new-instance v17, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;

    .line 184
    .line 185
    iget-object v4, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$divider:Lv3/p;

    .line 186
    .line 187
    iget-object v9, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$indicator:Lv3/q;

    .line 188
    .line 189
    move-object/from16 v1, v17

    .line 190
    .line 191
    move-object v2, v14

    .line 192
    move-object/from16 v3, p1

    .line 193
    .line 194
    move v5, v11

    .line 195
    move-wide/from16 v6, p2

    .line 196
    .line 197
    move v8, v15

    .line 198
    move v11, v13

    .line 199
    invoke-direct/range {v1 .. v11}, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;-><init>(Ljava/util/List;Landroidx/compose/ui/layout/SubcomposeMeasureScope;Lv3/p;IJILv3/q;Ljava/util/List;I)V

    .line 200
    .line 201
    .line 202
    const/4 v6, 0x4

    .line 203
    const/4 v7, 0x0

    .line 204
    move-object/from16 v1, p1

    .line 205
    .line 206
    move v2, v13

    .line 207
    move v3, v15

    .line 208
    move-object/from16 v4, v16

    .line 209
    .line 210
    move-object/from16 v5, v17

    .line 211
    .line 212
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    return-object v1
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
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method
