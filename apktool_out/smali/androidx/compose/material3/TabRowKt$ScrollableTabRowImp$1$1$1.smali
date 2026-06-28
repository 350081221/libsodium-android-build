.class final Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
        "SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1223:1\n256#2,3:1224\n33#2,4:1227\n259#2,2:1231\n38#2:1233\n261#2:1234\n33#2,4:1235\n38#2:1241\n256#2,3:1242\n33#2,4:1245\n259#2,2:1249\n38#2:1251\n261#2:1252\n92#3:1239\n58#3:1240\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1\n*L\n882#1:1224,3\n882#1:1227,4\n882#1:1231,2\n882#1:1233\n882#1:1234\n894#1:1235,4\n894#1:1241\n906#1:1242,3\n906#1:1245,4\n906#1:1249,2\n906#1:1251\n906#1:1252\n901#1:1239\n901#1:1240\n*E\n"
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

.field final synthetic $edgePadding:F

.field final synthetic $indicator:Lv3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/q<",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scrollableTabData:Landroidx/compose/material3/ScrollableTabData;

.field final synthetic $selectedTabIndex:I

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
.method constructor <init>(FLv3/p;Lv3/p;Landroidx/compose/material3/ScrollableTabData;ILv3/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
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
            "Landroidx/compose/material3/ScrollableTabData;",
            "I",
            "Lv3/q<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$edgePadding:F

    iput-object p2, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$tabs:Lv3/p;

    iput-object p3, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$divider:Lv3/p;

    iput-object p4, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$scrollableTabData:Landroidx/compose/material3/ScrollableTabData;

    iput p5, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$selectedTabIndex:I

    iput-object p6, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$indicator:Lv3/q;

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

    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 19
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
    move-object/from16 v14, p1

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/material3/TabRowKt;->access$getScrollableTabRowMinimumTabWidth$p()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {v14, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget v1, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$edgePadding:F

    .line 14
    .line 15
    invoke-interface {v14, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 16
    .line 17
    .line 18
    move-result v10

    .line 19
    sget-object v1, Landroidx/compose/material3/TabSlots;->Tabs:Landroidx/compose/material3/TabSlots;

    .line 20
    .line 21
    iget-object v2, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$tabs:Lv3/p;

    .line 22
    .line 23
    invoke-interface {v14, v1, v2}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lv3/p;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v11, 0x0

    .line 28
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    move v5, v11

    .line 37
    :goto_0
    if-ge v5, v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const v7, 0x7fffffff

    .line 50
    .line 51
    .line 52
    invoke-interface {v6, v7}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v15

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v8, 0x2

    .line 73
    const/4 v9, 0x0

    .line 74
    move-wide/from16 v2, p2

    .line 75
    .line 76
    move v6, v15

    .line 77
    move v7, v15

    .line 78
    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    new-instance v4, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    new-instance v8, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    move v6, v11

    .line 97
    :goto_1
    if-ge v6, v5, :cond_1

    .line 98
    .line 99
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    check-cast v7, Landroidx/compose/ui/layout/Measurable;

    .line 104
    .line 105
    invoke-interface {v7, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    invoke-interface {v7, v12}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    invoke-static {v7, v12}, Ljava/lang/Math;->min(II)I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    invoke-interface {v14, v7}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    invoke-static {}, Landroidx/compose/material3/TabKt;->getHorizontalTextPadding()F

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    const/4 v13, 0x2

    .line 134
    int-to-float v13, v13

    .line 135
    mul-float/2addr v12, v13

    .line 136
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    sub-float/2addr v7, v12

    .line 141
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    add-int/lit8 v6, v6, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_1
    mul-int/lit8 v1, v10, 0x2

    .line 159
    .line 160
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    :goto_2
    if-ge v11, v2, :cond_2

    .line 169
    .line 170
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    check-cast v3, Landroidx/compose/ui/layout/Placeable;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    add-int/2addr v1, v3

    .line 185
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    add-int/lit8 v11, v11, 0x1

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v16

    .line 196
    const/16 v17, 0x0

    .line 197
    .line 198
    new-instance v18, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1$2;

    .line 199
    .line 200
    iget-object v5, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$divider:Lv3/p;

    .line 201
    .line 202
    iget-object v6, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$scrollableTabData:Landroidx/compose/material3/ScrollableTabData;

    .line 203
    .line 204
    iget v7, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$selectedTabIndex:I

    .line 205
    .line 206
    iget-object v13, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1;->$indicator:Lv3/q;

    .line 207
    .line 208
    move-object/from16 v1, v18

    .line 209
    .line 210
    move v2, v10

    .line 211
    move-object v3, v4

    .line 212
    move-object/from16 v4, p1

    .line 213
    .line 214
    move-wide/from16 v9, p2

    .line 215
    .line 216
    move/from16 v11, v16

    .line 217
    .line 218
    move v12, v15

    .line 219
    invoke-direct/range {v1 .. v13}, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1$2;-><init>(ILjava/util/List;Landroidx/compose/ui/layout/SubcomposeMeasureScope;Lv3/p;Landroidx/compose/material3/ScrollableTabData;ILjava/util/List;JIILv3/q;)V

    .line 220
    .line 221
    .line 222
    const/4 v6, 0x4

    .line 223
    const/4 v7, 0x0

    .line 224
    move-object/from16 v1, p1

    .line 225
    .line 226
    move/from16 v2, v16

    .line 227
    .line 228
    move v3, v15

    .line 229
    move-object/from16 v4, v17

    .line 230
    .line 231
    move-object/from16 v5, v18

    .line 232
    .line 233
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    return-object v1
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
