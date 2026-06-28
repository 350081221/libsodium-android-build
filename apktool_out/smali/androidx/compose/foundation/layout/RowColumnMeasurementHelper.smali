.class public final Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\'\u0012\u0008\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010\u0013\u001a\u000206\u0012\u0006\u0010;\u001a\u00020:\u0012\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020@0?\u0012\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0E\u00a2\u0006\u0004\u0008L\u0010MJ(\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J2\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\n\u0010\u0012\u001a\u00020\u0002*\u00020\tJ\n\u0010\u0013\u001a\u00020\u0002*\u00020\tJ0\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ&\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eR\u0017\u0010#\u001a\u00020\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0019\u0010(\u001a\u0004\u0018\u00010\'8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R\u001d\u00102\u001a\u0002018\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u0017\u0010\u0013\u001a\u0002068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u00107\u001a\u0004\u00088\u00109R\u0017\u0010;\u001a\u00020:8\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u001d\u0010A\u001a\u0008\u0012\u0004\u0012\u00020@0?8\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR\u001f\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0E8\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010IR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006N"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;",
        "",
        "",
        "mainAxisLayoutSize",
        "",
        "childrenMainAxisSize",
        "mainAxisPositions",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measureScope",
        "Landroidx/compose/ui/layout/Placeable;",
        "placeable",
        "Landroidx/compose/foundation/layout/RowColumnParentData;",
        "parentData",
        "crossAxisLayoutSize",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "layoutDirection",
        "beforeCrossAxisAlignmentLine",
        "getCrossAxisPosition",
        "mainAxisSize",
        "crossAxisSize",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "startIndex",
        "endIndex",
        "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;",
        "measureWithoutPlacing-_EkL_-Y",
        "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;",
        "measureWithoutPlacing",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "placeableScope",
        "measureResult",
        "crossAxisOffset",
        "Lkotlin/r2;",
        "placeHelper",
        "Landroidx/compose/foundation/layout/LayoutOrientation;",
        "orientation",
        "Landroidx/compose/foundation/layout/LayoutOrientation;",
        "getOrientation",
        "()Landroidx/compose/foundation/layout/LayoutOrientation;",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "getHorizontalArrangement",
        "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "getVerticalArrangement",
        "()Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "Landroidx/compose/ui/unit/Dp;",
        "arrangementSpacing",
        "F",
        "getArrangementSpacing-D9Ej5fM",
        "()F",
        "Landroidx/compose/foundation/layout/SizeMode;",
        "Landroidx/compose/foundation/layout/SizeMode;",
        "getCrossAxisSize",
        "()Landroidx/compose/foundation/layout/SizeMode;",
        "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "crossAxisAlignment",
        "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "getCrossAxisAlignment",
        "()Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "measurables",
        "Ljava/util/List;",
        "getMeasurables",
        "()Ljava/util/List;",
        "",
        "placeables",
        "[Landroidx/compose/ui/layout/Placeable;",
        "getPlaceables",
        "()[Landroidx/compose/ui/layout/Placeable;",
        "rowColumnParentData",
        "[Landroidx/compose/foundation/layout/RowColumnParentData;",
        "<init>",
        "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/w;)V",
        "foundation-layout_release"
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
        "SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n322#2:396\n322#2:397\n322#2:398\n321#2:399\n322#2:400\n321#2:401\n324#2:403\n322#2:404\n321#2:405\n322#2:406\n321#2:407\n324#2:408\n324#2:409\n323#2:410\n1#3:402\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n*L\n111#1:396\n143#1:397\n144#1:398\n146#1:399\n166#1:400\n167#1:401\n210#1:403\n219#1:404\n220#1:405\n243#1:406\n282#1:407\n284#1:408\n287#1:409\n292#1:410\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final arrangementSpacing:F

.field private final crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final measurables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final orientation:Landroidx/compose/foundation/layout/LayoutOrientation;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final placeables:[Landroidx/compose/ui/layout/Placeable;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/LayoutOrientation;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "F",
            "Landroidx/compose/foundation/layout/SizeMode;",
            "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;[",
            "Landroidx/compose/ui/layout/Placeable;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 9
    .line 10
    iput p4, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangementSpacing:F

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 15
    .line 16
    iput-object p7, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 19
    .line 20
    invoke-interface {p7}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    new-array p2, p1, [Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 25
    .line 26
    const/4 p3, 0x0

    .line 27
    :goto_0
    if-ge p3, p1, :cond_0

    .line 28
    .line 29
    iget-object p4, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    check-cast p4, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 36
    .line 37
    invoke-static {p4}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    aput-object p4, p2, p3

    .line 42
    .line 43
    add-int/lit8 p3, p3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iput-object p2, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 47
    .line 48
    return-void
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;-><init>(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;)V

    return-void
.end method

.method private final getCrossAxisPosition(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/RowColumnParentData;ILandroidx/compose/ui/unit/LayoutDirection;I)I
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnParentData;->getCrossAxisAlignment()Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-nez p2, :cond_1

    .line 8
    .line 9
    :cond_0
    iget-object p2, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-int/2addr p3, v0

    .line 16
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 17
    .line 18
    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    sget-object p4, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 23
    .line 24
    :cond_2
    invoke-virtual {p2, p3, p4, p1, p5}, Landroidx/compose/foundation/layout/CrossAxisAlignment;->align$foundation_layout_release(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
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

.method private final mainAxisPositions(I[I[ILandroidx/compose/ui/layout/MeasureScope;)[I
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Vertical:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p4, p1, p2, p3}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string p2, "null verticalArrangement in Column"

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p4}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    move-object v1, p4

    .line 36
    move v2, p1

    .line 37
    move-object v3, p2

    .line 38
    move-object v5, p3

    .line 39
    invoke-interface/range {v0 .. v5}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-object p3

    .line 43
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string p2, "null horizontalArrangement in Row"

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
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
.end method


# virtual methods
.method public final crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I
    .locals 2
    .param p1    # Landroidx/compose/ui/layout/Placeable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final getArrangementSpacing-D9Ej5fM()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangementSpacing:F

    return v0
.end method

.method public final getCrossAxisAlignment()Landroidx/compose/foundation/layout/CrossAxisAlignment;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    return-object v0
.end method

.method public final getCrossAxisSize()Landroidx/compose/foundation/layout/SizeMode;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

    return-object v0
.end method

.method public final getHorizontalArrangement()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    return-object v0
.end method

.method public final getMeasurables()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    return-object v0
.end method

.method public final getOrientation()Landroidx/compose/foundation/layout/LayoutOrientation;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    return-object v0
.end method

.method public final getPlaceables()[Landroidx/compose/ui/layout/Placeable;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    return-object v0
.end method

.method public final getVerticalArrangement()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-object v0
.end method

.method public final mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I
    .locals 2
    .param p1    # Landroidx/compose/ui/layout/Placeable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final measureWithoutPlacing-_EkL_-Y(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;
    .locals 45
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v6, p5

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 8
    .line 9
    move-wide/from16 v3, p2

    .line 10
    .line 11
    invoke-static {v3, v4, v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget v4, v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangementSpacing:F

    .line 16
    .line 17
    invoke-interface {v0, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    int-to-long v4, v4

    .line 22
    sub-int v15, v6, p4

    .line 23
    .line 24
    const/16 v16, 0x0

    .line 25
    .line 26
    move/from16 v11, p4

    .line 27
    .line 28
    move/from16 v9, v16

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v10, 0x0

    .line 33
    const/4 v12, 0x0

    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    const/16 v18, 0x0

    .line 37
    .line 38
    :goto_0
    const/16 v21, 0x1

    .line 39
    .line 40
    if-ge v11, v6, :cond_5

    .line 41
    .line 42
    iget-object v14, v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v14, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v14

    .line 48
    check-cast v14, Landroidx/compose/ui/layout/Measurable;

    .line 49
    .line 50
    iget-object v13, v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 51
    .line 52
    aget-object v22, v13, v11

    .line 53
    .line 54
    invoke-static/range {v22 .. v22}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    cmpl-float v23, v13, v16

    .line 59
    .line 60
    if-lez v23, :cond_0

    .line 61
    .line 62
    add-float/2addr v9, v13

    .line 63
    add-int/lit8 v10, v10, 0x1

    .line 64
    .line 65
    move/from16 v31, v9

    .line 66
    .line 67
    move/from16 v32, v10

    .line 68
    .line 69
    move/from16 v23, v11

    .line 70
    .line 71
    const-wide/16 v9, 0x0

    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_0
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    iget-object v12, v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 80
    .line 81
    aget-object v12, v12, v11

    .line 82
    .line 83
    if-nez v12, :cond_2

    .line 84
    .line 85
    const v12, 0x7fffffff

    .line 86
    .line 87
    .line 88
    if-ne v13, v12, :cond_1

    .line 89
    .line 90
    move/from16 v24, v9

    .line 91
    .line 92
    move/from16 v25, v10

    .line 93
    .line 94
    move/from16 v26, v13

    .line 95
    .line 96
    const v10, 0x7fffffff

    .line 97
    .line 98
    .line 99
    const-wide/16 v12, 0x0

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    move/from16 v24, v9

    .line 103
    .line 104
    move/from16 v25, v10

    .line 105
    .line 106
    int-to-long v9, v13

    .line 107
    sub-long/2addr v9, v7

    .line 108
    move/from16 v26, v13

    .line 109
    .line 110
    const-wide/16 v12, 0x0

    .line 111
    .line 112
    invoke-static {v9, v10, v12, v13}, Lkotlin/ranges/s;->v(JJ)J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    long-to-int v9, v9

    .line 117
    move v10, v9

    .line 118
    :goto_1
    const/16 v19, 0x0

    .line 119
    .line 120
    const/16 v20, 0x0

    .line 121
    .line 122
    const/16 v27, 0x8

    .line 123
    .line 124
    const/16 v28, 0x0

    .line 125
    .line 126
    move-wide/from16 v29, v7

    .line 127
    .line 128
    move-wide v7, v2

    .line 129
    move/from16 v31, v24

    .line 130
    .line 131
    const/4 v9, 0x0

    .line 132
    move/from16 v32, v25

    .line 133
    .line 134
    move/from16 v23, v11

    .line 135
    .line 136
    move/from16 v11, v19

    .line 137
    .line 138
    move-wide/from16 v24, v12

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    move/from16 v12, v20

    .line 142
    .line 143
    move/from16 v33, v26

    .line 144
    .line 145
    move/from16 v13, v27

    .line 146
    .line 147
    move-object v0, v14

    .line 148
    move-object/from16 v14, v28

    .line 149
    .line 150
    invoke-static/range {v7 .. v14}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->copy-yUG9Ft0$default(JIIIIILjava/lang/Object;)J

    .line 151
    .line 152
    .line 153
    move-result-wide v7

    .line 154
    iget-object v9, v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 155
    .line 156
    invoke-static {v7, v8, v9}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 157
    .line 158
    .line 159
    move-result-wide v7

    .line 160
    invoke-interface {v0, v7, v8}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    goto :goto_2

    .line 165
    :cond_2
    move-wide/from16 v29, v7

    .line 166
    .line 167
    move/from16 v31, v9

    .line 168
    .line 169
    move/from16 v32, v10

    .line 170
    .line 171
    move/from16 v23, v11

    .line 172
    .line 173
    move/from16 v33, v13

    .line 174
    .line 175
    :goto_2
    long-to-int v0, v4

    .line 176
    move/from16 v7, v33

    .line 177
    .line 178
    int-to-long v7, v7

    .line 179
    move-wide/from16 v13, v29

    .line 180
    .line 181
    sub-long/2addr v7, v13

    .line 182
    invoke-virtual {v1, v12}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    int-to-long v9, v9

    .line 187
    sub-long/2addr v7, v9

    .line 188
    const-wide/16 v9, 0x0

    .line 189
    .line 190
    invoke-static {v7, v8, v9, v10}, Lkotlin/ranges/s;->v(JJ)J

    .line 191
    .line 192
    .line 193
    move-result-wide v7

    .line 194
    long-to-int v7, v7

    .line 195
    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-virtual {v1, v12}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    add-int/2addr v7, v0

    .line 204
    int-to-long v7, v7

    .line 205
    add-long/2addr v7, v13

    .line 206
    invoke-virtual {v1, v12}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    move/from16 v13, v17

    .line 211
    .line 212
    invoke-static {v13, v11}, Ljava/lang/Math;->max(II)I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    if-nez v18, :cond_4

    .line 217
    .line 218
    invoke-static/range {v22 .. v22}, Landroidx/compose/foundation/layout/RowColumnImplKt;->isRelative(Landroidx/compose/foundation/layout/RowColumnParentData;)Z

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    if-eqz v13, :cond_3

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_3
    const/16 v21, 0x0

    .line 226
    .line 227
    :cond_4
    :goto_3
    iget-object v13, v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 228
    .line 229
    aput-object v12, v13, v23

    .line 230
    .line 231
    move v12, v0

    .line 232
    move/from16 v17, v11

    .line 233
    .line 234
    move/from16 v18, v21

    .line 235
    .line 236
    :goto_4
    add-int/lit8 v11, v23, 0x1

    .line 237
    .line 238
    move-object/from16 v0, p1

    .line 239
    .line 240
    move/from16 v9, v31

    .line 241
    .line 242
    move/from16 v10, v32

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_5
    move-wide v13, v7

    .line 247
    move/from16 v31, v9

    .line 248
    .line 249
    move v7, v10

    .line 250
    const-wide/16 v9, 0x0

    .line 251
    .line 252
    if-nez v7, :cond_6

    .line 253
    .line 254
    int-to-long v4, v12

    .line 255
    sub-long v7, v13, v4

    .line 256
    .line 257
    move-object v6, v1

    .line 258
    move/from16 p2, v15

    .line 259
    .line 260
    move/from16 v14, v17

    .line 261
    .line 262
    const/4 v12, 0x0

    .line 263
    goto/16 :goto_f

    .line 264
    .line 265
    :cond_6
    move/from16 v8, v31

    .line 266
    .line 267
    cmpl-float v0, v8, v16

    .line 268
    .line 269
    if-lez v0, :cond_7

    .line 270
    .line 271
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    const v12, 0x7fffffff

    .line 276
    .line 277
    .line 278
    if-eq v11, v12, :cond_7

    .line 279
    .line 280
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    goto :goto_5

    .line 285
    :cond_7
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 286
    .line 287
    .line 288
    move-result v11

    .line 289
    :goto_5
    add-int/lit8 v12, v7, -0x1

    .line 290
    .line 291
    int-to-long v9, v12

    .line 292
    mul-long/2addr v9, v4

    .line 293
    move-wide/from16 v19, v4

    .line 294
    .line 295
    int-to-long v4, v11

    .line 296
    sub-long/2addr v4, v13

    .line 297
    sub-long/2addr v4, v9

    .line 298
    move-wide/from16 v22, v9

    .line 299
    .line 300
    const-wide/16 v9, 0x0

    .line 301
    .line 302
    invoke-static {v4, v5, v9, v10}, Lkotlin/ranges/s;->v(JJ)J

    .line 303
    .line 304
    .line 305
    move-result-wide v4

    .line 306
    if-lez v0, :cond_8

    .line 307
    .line 308
    long-to-float v0, v4

    .line 309
    div-float/2addr v0, v8

    .line 310
    move v9, v0

    .line 311
    goto :goto_6

    .line 312
    :cond_8
    move/from16 v9, v16

    .line 313
    .line 314
    :goto_6
    move/from16 v0, p4

    .line 315
    .line 316
    move-wide/from16 v24, v4

    .line 317
    .line 318
    :goto_7
    const-string/jumbo v10, "weightedSize "

    .line 319
    .line 320
    .line 321
    const-string/jumbo v12, "weightUnitSpace "

    .line 322
    .line 323
    .line 324
    move/from16 p2, v15

    .line 325
    .line 326
    const-string/jumbo v15, "totalWeight "

    .line 327
    .line 328
    .line 329
    move-object/from16 v26, v10

    .line 330
    .line 331
    const-string v10, "remainingToTarget "

    .line 332
    .line 333
    move-object/from16 v27, v12

    .line 334
    .line 335
    const-string v12, "arrangementSpacingTotal "

    .line 336
    .line 337
    move/from16 v31, v8

    .line 338
    .line 339
    const-string v8, "fixedSpace "

    .line 340
    .line 341
    move-object/from16 v28, v15

    .line 342
    .line 343
    const-string/jumbo v15, "weightChildrenCount "

    .line 344
    .line 345
    .line 346
    move-wide/from16 v29, v4

    .line 347
    .line 348
    const-string v4, "arrangementSpacingPx "

    .line 349
    .line 350
    const-string v5, "targetSpace "

    .line 351
    .line 352
    move-object/from16 v32, v10

    .line 353
    .line 354
    const-string v10, "mainAxisMin "

    .line 355
    .line 356
    if-ge v0, v6, :cond_9

    .line 357
    .line 358
    iget-object v6, v1, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 359
    .line 360
    aget-object v6, v6, v0

    .line 361
    .line 362
    invoke-static {v6}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    mul-float v1, v9, v6

    .line 367
    .line 368
    :try_start_0
    invoke-static {v1}, Lkotlin/math/b;->L0(F)I

    .line 369
    .line 370
    .line 371
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 372
    int-to-long v4, v1

    .line 373
    sub-long v24, v24, v4

    .line 374
    .line 375
    add-int/lit8 v0, v0, 0x1

    .line 376
    .line 377
    move-object/from16 v1, p0

    .line 378
    .line 379
    move/from16 v15, p2

    .line 380
    .line 381
    move/from16 v6, p5

    .line 382
    .line 383
    move-wide/from16 v4, v29

    .line 384
    .line 385
    move/from16 v8, v31

    .line 386
    .line 387
    goto :goto_7

    .line 388
    :catch_0
    move-exception v0

    .line 389
    move-object/from16 v35, v0

    .line 390
    .line 391
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 392
    .line 393
    move-object/from16 p1, v0

    .line 394
    .line 395
    new-instance v0, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    move/from16 v33, v1

    .line 401
    .line 402
    const-string v1, "This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax "

    .line 403
    .line 404
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    move-wide/from16 v1, v19

    .line 434
    .line 435
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    move-wide/from16 v1, v22

    .line 454
    .line 455
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    move-object/from16 v1, v32

    .line 459
    .line 460
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    move-wide/from16 v1, v29

    .line 464
    .line 465
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    move-object/from16 v1, v28

    .line 469
    .line 470
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    move/from16 v1, v31

    .line 474
    .line 475
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    move-object/from16 v1, v27

    .line 479
    .line 480
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    const-string v1, "itemWeight "

    .line 487
    .line 488
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    move-object/from16 v6, v26

    .line 495
    .line 496
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    move/from16 v9, v33

    .line 500
    .line 501
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    move-object/from16 v1, p1

    .line 509
    .line 510
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    move-object/from16 v2, v35

    .line 514
    .line 515
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    throw v0

    .line 520
    :cond_9
    move-wide/from16 v36, v22

    .line 521
    .line 522
    move-wide/from16 v38, v29

    .line 523
    .line 524
    move-wide/from16 v29, v13

    .line 525
    .line 526
    move-wide/from16 v43, v19

    .line 527
    .line 528
    move-object/from16 v19, v12

    .line 529
    .line 530
    move-wide/from16 v12, v43

    .line 531
    .line 532
    move/from16 v1, p4

    .line 533
    .line 534
    move/from16 v6, p5

    .line 535
    .line 536
    move/from16 v14, v17

    .line 537
    .line 538
    const/4 v0, 0x0

    .line 539
    :goto_8
    if-ge v1, v6, :cond_10

    .line 540
    .line 541
    move-object/from16 v6, p0

    .line 542
    .line 543
    move-object/from16 v17, v8

    .line 544
    .line 545
    iget-object v8, v6, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 546
    .line 547
    aget-object v8, v8, v1

    .line 548
    .line 549
    if-nez v8, :cond_f

    .line 550
    .line 551
    iget-object v8, v6, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 552
    .line 553
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v8

    .line 557
    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    .line 558
    .line 559
    move/from16 v20, v7

    .line 560
    .line 561
    iget-object v7, v6, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 562
    .line 563
    aget-object v7, v7, v1

    .line 564
    .line 565
    move-object/from16 v22, v15

    .line 566
    .line 567
    invoke-static {v7}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    .line 568
    .line 569
    .line 570
    move-result v15

    .line 571
    cmpl-float v23, v15, v16

    .line 572
    .line 573
    if-lez v23, :cond_a

    .line 574
    .line 575
    move/from16 v23, v21

    .line 576
    .line 577
    goto :goto_9

    .line 578
    :cond_a
    const/16 v23, 0x0

    .line 579
    .line 580
    :goto_9
    if-eqz v23, :cond_e

    .line 581
    .line 582
    move-wide/from16 v40, v12

    .line 583
    .line 584
    invoke-static/range {v24 .. v25}, Lkotlin/math/b;->V(J)I

    .line 585
    .line 586
    .line 587
    move-result v12

    .line 588
    move-object v13, v4

    .line 589
    move-object/from16 v23, v5

    .line 590
    .line 591
    int-to-long v4, v12

    .line 592
    sub-long v24, v24, v4

    .line 593
    .line 594
    mul-float v4, v9, v15

    .line 595
    .line 596
    invoke-static {v4}, Lkotlin/math/b;->L0(F)I

    .line 597
    .line 598
    .line 599
    move-result v5

    .line 600
    add-int/2addr v5, v12

    .line 601
    move-object/from16 v33, v13

    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    invoke-static {v13, v5}, Ljava/lang/Math;->max(II)I

    .line 605
    .line 606
    .line 607
    move-result v5

    .line 608
    :try_start_1
    invoke-static {v7}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getFill(Landroidx/compose/foundation/layout/RowColumnParentData;)Z

    .line 609
    .line 610
    .line 611
    move-result v34
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3

    .line 612
    if-eqz v34, :cond_b

    .line 613
    .line 614
    const v13, 0x7fffffff

    .line 615
    .line 616
    .line 617
    if-eq v5, v13, :cond_b

    .line 618
    .line 619
    move v13, v5

    .line 620
    move/from16 v35, v12

    .line 621
    .line 622
    goto :goto_a

    .line 623
    :cond_b
    move/from16 v35, v12

    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    :goto_a
    :try_start_2
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 627
    .line 628
    .line 629
    move-result v12
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 630
    move/from16 v42, v4

    .line 631
    .line 632
    const/4 v4, 0x0

    .line 633
    :try_start_3
    invoke-static {v13, v5, v4, v12}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(IIII)J

    .line 634
    .line 635
    .line 636
    move-result-wide v12

    .line 637
    iget-object v4, v6, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 638
    .line 639
    invoke-static {v12, v13, v4}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 640
    .line 641
    .line 642
    move-result-wide v4
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 643
    invoke-interface {v8, v4, v5}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    invoke-virtual {v6, v4}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 648
    .line 649
    .line 650
    move-result v5

    .line 651
    add-int/2addr v0, v5

    .line 652
    invoke-virtual {v6, v4}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 653
    .line 654
    .line 655
    move-result v5

    .line 656
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    .line 657
    .line 658
    .line 659
    move-result v14

    .line 660
    if-nez v18, :cond_d

    .line 661
    .line 662
    invoke-static {v7}, Landroidx/compose/foundation/layout/RowColumnImplKt;->isRelative(Landroidx/compose/foundation/layout/RowColumnParentData;)Z

    .line 663
    .line 664
    .line 665
    move-result v5

    .line 666
    if-eqz v5, :cond_c

    .line 667
    .line 668
    goto :goto_b

    .line 669
    :cond_c
    const/4 v12, 0x0

    .line 670
    goto :goto_c

    .line 671
    :cond_d
    :goto_b
    move/from16 v12, v21

    .line 672
    .line 673
    :goto_c
    iget-object v5, v6, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 674
    .line 675
    aput-object v4, v5, v1

    .line 676
    .line 677
    move/from16 v18, v12

    .line 678
    .line 679
    move-object/from16 v7, v23

    .line 680
    .line 681
    move-object/from16 v15, v26

    .line 682
    .line 683
    move-object/from16 v26, v28

    .line 684
    .line 685
    move-wide/from16 v4, v29

    .line 686
    .line 687
    move-object/from16 v8, v33

    .line 688
    .line 689
    move-wide/from16 v12, v40

    .line 690
    .line 691
    move-object/from16 v29, v17

    .line 692
    .line 693
    move-object/from16 v28, v19

    .line 694
    .line 695
    move-object/from16 v30, v22

    .line 696
    .line 697
    move-object/from16 v17, v27

    .line 698
    .line 699
    move-object/from16 v27, v32

    .line 700
    .line 701
    move-wide/from16 v22, v38

    .line 702
    .line 703
    move/from16 v32, v20

    .line 704
    .line 705
    goto/16 :goto_e

    .line 706
    .line 707
    :catch_1
    move-exception v0

    .line 708
    goto :goto_d

    .line 709
    :catch_2
    move-exception v0

    .line 710
    move/from16 v42, v4

    .line 711
    .line 712
    goto :goto_d

    .line 713
    :catch_3
    move-exception v0

    .line 714
    move/from16 v42, v4

    .line 715
    .line 716
    move/from16 v35, v12

    .line 717
    .line 718
    :goto_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 719
    .line 720
    new-instance v4, Ljava/lang/StringBuilder;

    .line 721
    .line 722
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 723
    .line 724
    .line 725
    const-string v7, "This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax "

    .line 726
    .line 727
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 731
    .line 732
    .line 733
    move-result v7

    .line 734
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 741
    .line 742
    .line 743
    move-result v2

    .line 744
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    move-object/from16 v7, v23

    .line 748
    .line 749
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    move-object/from16 v8, v33

    .line 756
    .line 757
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    move-wide/from16 v12, v40

    .line 761
    .line 762
    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    move-object/from16 v2, v22

    .line 766
    .line 767
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    move/from16 v2, v20

    .line 771
    .line 772
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    move-object/from16 v2, v17

    .line 776
    .line 777
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    move-wide/from16 v2, v29

    .line 781
    .line 782
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    move-object/from16 v2, v19

    .line 786
    .line 787
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    move-wide/from16 v2, v36

    .line 791
    .line 792
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    move-object/from16 v2, v32

    .line 796
    .line 797
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    move-wide/from16 v2, v38

    .line 801
    .line 802
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    move-object/from16 v2, v28

    .line 806
    .line 807
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    move/from16 v2, v31

    .line 811
    .line 812
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    move-object/from16 v2, v27

    .line 816
    .line 817
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    const-string/jumbo v2, "weight "

    .line 824
    .line 825
    .line 826
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    move-object/from16 v15, v26

    .line 833
    .line 834
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 835
    .line 836
    .line 837
    move/from16 v9, v42

    .line 838
    .line 839
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    const-string v2, "remainderUnit "

    .line 843
    .line 844
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    move/from16 v2, v35

    .line 848
    .line 849
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    const-string v2, "childMainAxisSize "

    .line 853
    .line 854
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    throw v0

    .line 872
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 873
    .line 874
    const-string v1, "All weights <= 0 should have placeables"

    .line 875
    .line 876
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    throw v0

    .line 884
    :cond_f
    move-object v8, v4

    .line 885
    move-wide/from16 v22, v38

    .line 886
    .line 887
    move/from16 v43, v7

    .line 888
    .line 889
    move-object v7, v5

    .line 890
    move-wide/from16 v4, v29

    .line 891
    .line 892
    move-object/from16 v30, v15

    .line 893
    .line 894
    move-object/from16 v29, v17

    .line 895
    .line 896
    move-object/from16 v15, v26

    .line 897
    .line 898
    move-object/from16 v17, v27

    .line 899
    .line 900
    move-object/from16 v26, v28

    .line 901
    .line 902
    move-object/from16 v27, v32

    .line 903
    .line 904
    move/from16 v32, v43

    .line 905
    .line 906
    move-object/from16 v28, v19

    .line 907
    .line 908
    :goto_e
    move-wide/from16 v19, v36

    .line 909
    .line 910
    add-int/lit8 v1, v1, 0x1

    .line 911
    .line 912
    move/from16 v6, p5

    .line 913
    .line 914
    move-wide/from16 v36, v19

    .line 915
    .line 916
    move-wide/from16 v38, v22

    .line 917
    .line 918
    move-object/from16 v19, v28

    .line 919
    .line 920
    move-object/from16 v28, v26

    .line 921
    .line 922
    move-object/from16 v26, v15

    .line 923
    .line 924
    move-object/from16 v15, v30

    .line 925
    .line 926
    move-wide/from16 v43, v4

    .line 927
    .line 928
    move-object v5, v7

    .line 929
    move-object v4, v8

    .line 930
    move-object/from16 v8, v29

    .line 931
    .line 932
    move/from16 v7, v32

    .line 933
    .line 934
    move-wide/from16 v29, v43

    .line 935
    .line 936
    move-object/from16 v32, v27

    .line 937
    .line 938
    move-object/from16 v27, v17

    .line 939
    .line 940
    goto/16 :goto_8

    .line 941
    .line 942
    :cond_10
    move-object/from16 v6, p0

    .line 943
    .line 944
    move-wide/from16 v4, v29

    .line 945
    .line 946
    move-wide/from16 v19, v36

    .line 947
    .line 948
    int-to-long v0, v0

    .line 949
    add-long v7, v0, v19

    .line 950
    .line 951
    const-wide/16 v9, 0x0

    .line 952
    .line 953
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 954
    .line 955
    .line 956
    move-result v0

    .line 957
    int-to-long v0, v0

    .line 958
    sub-long v11, v0, v4

    .line 959
    .line 960
    invoke-static/range {v7 .. v12}, Lkotlin/ranges/s;->K(JJJ)J

    .line 961
    .line 962
    .line 963
    move-result-wide v0

    .line 964
    long-to-int v12, v0

    .line 965
    move-wide v7, v4

    .line 966
    :goto_f
    if-eqz v18, :cond_15

    .line 967
    .line 968
    move/from16 v4, p4

    .line 969
    .line 970
    move-object v9, v6

    .line 971
    const/4 v0, 0x0

    .line 972
    const/4 v1, 0x0

    .line 973
    move/from16 v6, p5

    .line 974
    .line 975
    :goto_10
    if-ge v4, v6, :cond_16

    .line 976
    .line 977
    iget-object v5, v9, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 978
    .line 979
    aget-object v5, v5, v4

    .line 980
    .line 981
    invoke-static {v5}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 982
    .line 983
    .line 984
    iget-object v10, v9, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 985
    .line 986
    aget-object v10, v10, v4

    .line 987
    .line 988
    invoke-static {v10}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getCrossAxisAlignment(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 989
    .line 990
    .line 991
    move-result-object v10

    .line 992
    if-eqz v10, :cond_11

    .line 993
    .line 994
    invoke-virtual {v10, v5}, Landroidx/compose/foundation/layout/CrossAxisAlignment;->calculateAlignmentLinePosition$foundation_layout_release(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;

    .line 995
    .line 996
    .line 997
    move-result-object v10

    .line 998
    goto :goto_11

    .line 999
    :cond_11
    const/4 v10, 0x0

    .line 1000
    :goto_11
    if-eqz v10, :cond_14

    .line 1001
    .line 1002
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1003
    .line 1004
    .line 1005
    move-result v11

    .line 1006
    const/high16 v13, -0x80000000

    .line 1007
    .line 1008
    if-eq v11, v13, :cond_12

    .line 1009
    .line 1010
    goto :goto_12

    .line 1011
    :cond_12
    const/4 v11, 0x0

    .line 1012
    :goto_12
    invoke-static {v0, v11}, Ljava/lang/Math;->max(II)I

    .line 1013
    .line 1014
    .line 1015
    move-result v0

    .line 1016
    invoke-virtual {v9, v5}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 1017
    .line 1018
    .line 1019
    move-result v11

    .line 1020
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1021
    .line 1022
    .line 1023
    move-result v10

    .line 1024
    if-eq v10, v13, :cond_13

    .line 1025
    .line 1026
    goto :goto_13

    .line 1027
    :cond_13
    invoke-virtual {v9, v5}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 1028
    .line 1029
    .line 1030
    move-result v10

    .line 1031
    :goto_13
    sub-int/2addr v11, v10

    .line 1032
    invoke-static {v1, v11}, Ljava/lang/Math;->max(II)I

    .line 1033
    .line 1034
    .line 1035
    move-result v1

    .line 1036
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 1037
    .line 1038
    goto :goto_10

    .line 1039
    :cond_15
    move-object v9, v6

    .line 1040
    move/from16 v6, p5

    .line 1041
    .line 1042
    const/4 v0, 0x0

    .line 1043
    const/4 v1, 0x0

    .line 1044
    :cond_16
    int-to-long v4, v12

    .line 1045
    add-long/2addr v7, v4

    .line 1046
    const-wide/16 v4, 0x0

    .line 1047
    .line 1048
    invoke-static {v7, v8, v4, v5}, Lkotlin/ranges/s;->v(JJ)J

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v4

    .line 1052
    long-to-int v4, v4

    .line 1053
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 1054
    .line 1055
    .line 1056
    move-result v5

    .line 1057
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 1058
    .line 1059
    .line 1060
    move-result v4

    .line 1061
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 1062
    .line 1063
    .line 1064
    move-result v5

    .line 1065
    const v7, 0x7fffffff

    .line 1066
    .line 1067
    .line 1068
    if-eq v5, v7, :cond_17

    .line 1069
    .line 1070
    iget-object v5, v9, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

    .line 1071
    .line 1072
    sget-object v7, Landroidx/compose/foundation/layout/SizeMode;->Expand:Landroidx/compose/foundation/layout/SizeMode;

    .line 1073
    .line 1074
    if-ne v5, v7, :cond_17

    .line 1075
    .line 1076
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 1077
    .line 1078
    .line 1079
    move-result v1

    .line 1080
    goto :goto_14

    .line 1081
    :cond_17
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 1082
    .line 1083
    .line 1084
    move-result v2

    .line 1085
    add-int/2addr v1, v0

    .line 1086
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 1087
    .line 1088
    .line 1089
    move-result v1

    .line 1090
    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    .line 1091
    .line 1092
    .line 1093
    move-result v1

    .line 1094
    :goto_14
    move v3, v1

    .line 1095
    move/from16 v1, p2

    .line 1096
    .line 1097
    new-array v2, v1, [I

    .line 1098
    .line 1099
    const/4 v12, 0x0

    .line 1100
    :goto_15
    if-ge v12, v1, :cond_18

    .line 1101
    .line 1102
    const/4 v5, 0x0

    .line 1103
    aput v5, v2, v12

    .line 1104
    .line 1105
    add-int/lit8 v12, v12, 0x1

    .line 1106
    .line 1107
    goto :goto_15

    .line 1108
    :cond_18
    const/4 v5, 0x0

    .line 1109
    new-array v7, v1, [I

    .line 1110
    .line 1111
    move v12, v5

    .line 1112
    :goto_16
    if-ge v12, v1, :cond_19

    .line 1113
    .line 1114
    iget-object v5, v9, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 1115
    .line 1116
    add-int v8, v12, p4

    .line 1117
    .line 1118
    aget-object v5, v5, v8

    .line 1119
    .line 1120
    invoke-static {v5}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v9, v5}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 1124
    .line 1125
    .line 1126
    move-result v5

    .line 1127
    aput v5, v7, v12

    .line 1128
    .line 1129
    add-int/lit8 v12, v12, 0x1

    .line 1130
    .line 1131
    goto :goto_16

    .line 1132
    :cond_19
    move-object/from16 v5, p1

    .line 1133
    .line 1134
    invoke-direct {v9, v4, v7, v2, v5}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisPositions(I[I[ILandroidx/compose/ui/layout/MeasureScope;)[I

    .line 1135
    .line 1136
    .line 1137
    move-result-object v8

    .line 1138
    new-instance v1, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;

    .line 1139
    .line 1140
    move-object v2, v1

    .line 1141
    move/from16 v5, p4

    .line 1142
    .line 1143
    move/from16 v6, p5

    .line 1144
    .line 1145
    move v7, v0

    .line 1146
    invoke-direct/range {v2 .. v8}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;-><init>(IIIII[I)V

    .line 1147
    .line 1148
    .line 1149
    return-object v1
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
.end method

.method public final placeHelper(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;ILandroidx/compose/ui/unit/LayoutDirection;)V
    .locals 11
    .param p1    # Landroidx/compose/ui/layout/Placeable$PlacementScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getStartIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getEndIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    :goto_0
    if-ge v0, v1, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 12
    .line 13
    aget-object v2, v2, v0

    .line 14
    .line 15
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getMainAxisPositions()[I

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    iget-object v3, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 29
    .line 30
    invoke-interface {v3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    instance-of v4, v3, Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    check-cast v3, Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v3, 0x0

    .line 42
    :goto_1
    move-object v5, v3

    .line 43
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getCrossAxisSize()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getBeforeCrossAxisAlignmentLine()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    move-object v3, p0

    .line 52
    move-object v4, v2

    .line 53
    move-object v7, p4

    .line 54
    invoke-direct/range {v3 .. v8}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->getCrossAxisPosition(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/RowColumnParentData;ILandroidx/compose/ui/unit/LayoutDirection;I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    add-int v6, v3, p3

    .line 59
    .line 60
    iget-object v3, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 61
    .line 62
    sget-object v4, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 63
    .line 64
    if-ne v3, v4, :cond_1

    .line 65
    .line 66
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getStartIndex()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    sub-int v3, v0, v3

    .line 71
    .line 72
    aget v5, v9, v3

    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x4

    .line 76
    const/4 v9, 0x0

    .line 77
    move-object v3, p1

    .line 78
    move-object v4, v2

    .line 79
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getStartIndex()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    sub-int v3, v0, v3

    .line 88
    .line 89
    aget v7, v9, v3

    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x4

    .line 93
    const/4 v10, 0x0

    .line 94
    move-object v3, p1

    .line 95
    move-object v4, v2

    .line 96
    move v5, v6

    .line 97
    move v6, v7

    .line 98
    move v7, v8

    .line 99
    move v8, v9

    .line 100
    move-object v9, v10

    .line 101
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    return-void
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
.end method
