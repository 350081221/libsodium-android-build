.class public final Landroidx/compose/foundation/pager/PagerMeasureResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/pager/PagerLayoutInfo;
.implements Landroidx/compose/ui/layout/MeasureResult;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0007\n\u0002\u0008\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010*\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00103\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u00020\u0007\u0012\u0006\u0010N\u001a\u00020\u0002\u0012\u0006\u0010;\u001a\u00020\u0007\u00a2\u0006\u0004\u0008O\u0010PJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0010\u001a\u0004\u0008\u0016\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0010\u001a\u0004\u0008\u001d\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0010\u001a\u0004\u0008\u001f\u0010\u0012R\u001a\u0010 \u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001a\u0010$\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u0010\u001a\u0004\u0008%\u0010\u0012R\u0019\u0010&\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0019\u0010*\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010\'\u001a\u0004\u0008+\u0010)R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\"\u00103\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00083\u0010\u0010\u001a\u0004\u00084\u0010\u0012\"\u0004\u00085\u00106R\"\u00107\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00087\u0010!\u001a\u0004\u00088\u0010#\"\u0004\u00089\u0010:R\u0017\u0010;\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010!\u001a\u0004\u0008<\u0010#R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00050=8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010@R\u0014\u0010C\u001a\u00020\u00058\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010\u0012R\u0014\u0010E\u001a\u00020\u00058\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010\u0012R\u001a\u0010I\u001a\u00020F8VX\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010HR\u0014\u0010K\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010\u0012R\u0011\u0010M\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010#\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006Q"
    }
    d2 = {
        "Landroidx/compose/foundation/pager/PagerMeasureResult;",
        "Landroidx/compose/foundation/pager/PagerLayoutInfo;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Lkotlin/r2;",
        "placeChildren",
        "",
        "delta",
        "",
        "tryToApplyScrollWithoutRemeasure",
        "",
        "Landroidx/compose/foundation/pager/MeasuredPage;",
        "visiblePagesInfo",
        "Ljava/util/List;",
        "getVisiblePagesInfo",
        "()Ljava/util/List;",
        "pageSize",
        "I",
        "getPageSize",
        "()I",
        "pageSpacing",
        "getPageSpacing",
        "afterContentPadding",
        "getAfterContentPadding",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "orientation",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "getOrientation",
        "()Landroidx/compose/foundation/gestures/Orientation;",
        "viewportStartOffset",
        "getViewportStartOffset",
        "viewportEndOffset",
        "getViewportEndOffset",
        "reverseLayout",
        "Z",
        "getReverseLayout",
        "()Z",
        "beyondBoundsPageCount",
        "getBeyondBoundsPageCount",
        "firstVisiblePage",
        "Landroidx/compose/foundation/pager/MeasuredPage;",
        "getFirstVisiblePage",
        "()Landroidx/compose/foundation/pager/MeasuredPage;",
        "currentPage",
        "getCurrentPage",
        "",
        "currentPageOffsetFraction",
        "F",
        "getCurrentPageOffsetFraction",
        "()F",
        "setCurrentPageOffsetFraction",
        "(F)V",
        "firstVisiblePageScrollOffset",
        "getFirstVisiblePageScrollOffset",
        "setFirstVisiblePageScrollOffset",
        "(I)V",
        "canScrollForward",
        "getCanScrollForward",
        "setCanScrollForward",
        "(Z)V",
        "remeasureNeeded",
        "getRemeasureNeeded",
        "",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "getAlignmentLines",
        "()Ljava/util/Map;",
        "alignmentLines",
        "getHeight",
        "height",
        "getWidth",
        "width",
        "Landroidx/compose/ui/unit/IntSize;",
        "getViewportSize-YbymL2g",
        "()J",
        "viewportSize",
        "getBeforeContentPadding",
        "beforeContentPadding",
        "getCanScrollBackward",
        "canScrollBackward",
        "measureResult",
        "<init>",
        "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/ui/layout/MeasureResult;Z)V",
        "foundation_release"
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
        "SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,120:1\n33#2,6:121\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n107#1:121,6\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

.field private final afterContentPadding:I

.field private final beyondBoundsPageCount:I

.field private canScrollForward:Z

.field private final currentPage:Landroidx/compose/foundation/pager/MeasuredPage;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private currentPageOffsetFraction:F

.field private final firstVisiblePage:Landroidx/compose/foundation/pager/MeasuredPage;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private firstVisiblePageScrollOffset:I

.field private final orientation:Landroidx/compose/foundation/gestures/Orientation;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final pageSize:I

.field private final pageSpacing:I

.field private final remeasureNeeded:Z

.field private final reverseLayout:Z

.field private final viewportEndOffset:I

.field private final viewportStartOffset:I

.field private final visiblePagesInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/ui/layout/MeasureResult;Z)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/gestures/Orientation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/foundation/pager/MeasuredPage;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/foundation/pager/MeasuredPage;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/ui/layout/MeasureResult;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;III",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "IIZI",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            "FIZ",
            "Landroidx/compose/ui/layout/MeasureResult;",
            "Z)V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    move-object v1, p1

    .line 6
    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->visiblePagesInfo:Ljava/util/List;

    .line 7
    .line 8
    move v1, p2

    .line 9
    iput v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->pageSize:I

    .line 10
    .line 11
    move v1, p3

    .line 12
    iput v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->pageSpacing:I

    .line 13
    .line 14
    move v1, p4

    .line 15
    iput v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->afterContentPadding:I

    .line 16
    .line 17
    move-object v1, p5

    .line 18
    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 19
    .line 20
    move v1, p6

    .line 21
    iput v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->viewportStartOffset:I

    .line 22
    .line 23
    move v1, p7

    .line 24
    iput v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->viewportEndOffset:I

    .line 25
    .line 26
    move v1, p8

    .line 27
    iput-boolean v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->reverseLayout:Z

    .line 28
    .line 29
    move v1, p9

    .line 30
    iput v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->beyondBoundsPageCount:I

    .line 31
    .line 32
    move-object v1, p10

    .line 33
    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePage:Landroidx/compose/foundation/pager/MeasuredPage;

    .line 34
    .line 35
    move-object v1, p11

    .line 36
    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPage:Landroidx/compose/foundation/pager/MeasuredPage;

    .line 37
    .line 38
    move v1, p12

    .line 39
    iput v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPageOffsetFraction:F

    .line 40
    .line 41
    move v1, p13

    .line 42
    iput v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePageScrollOffset:I

    .line 43
    .line 44
    move/from16 v1, p14

    .line 45
    .line 46
    iput-boolean v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->canScrollForward:Z

    .line 47
    .line 48
    move/from16 v1, p16

    .line 49
    .line 50
    iput-boolean v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->remeasureNeeded:Z

    .line 51
    .line 52
    move-object/from16 v1, p15

    .line 53
    .line 54
    iput-object v1, v0, Landroidx/compose/foundation/pager/PagerMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    .line 55
    .line 56
    return-void
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
.end method


# virtual methods
.method public getAfterContentPadding()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->afterContentPadding:I

    return v0
.end method

.method public getAlignmentLines()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getAlignmentLines()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getBeforeContentPadding()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getViewportStartOffset()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public getBeyondBoundsPageCount()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->beyondBoundsPageCount:I

    return v0
.end method

.method public final getCanScrollBackward()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePage:Landroidx/compose/foundation/pager/MeasuredPage;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePageScrollOffset:I

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final getCanScrollForward()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->canScrollForward:Z

    return v0
.end method

.method public final getCurrentPage()Landroidx/compose/foundation/pager/MeasuredPage;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPage:Landroidx/compose/foundation/pager/MeasuredPage;

    return-object v0
.end method

.method public final getCurrentPageOffsetFraction()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPageOffsetFraction:F

    return v0
.end method

.method public final getFirstVisiblePage()Landroidx/compose/foundation/pager/MeasuredPage;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePage:Landroidx/compose/foundation/pager/MeasuredPage;

    return-object v0
.end method

.method public final getFirstVisiblePageScrollOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePageScrollOffset:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v0

    return v0
.end method

.method public getOrientation()Landroidx/compose/foundation/gestures/Orientation;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    return-object v0
.end method

.method public getPageSize()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->pageSize:I

    return v0
.end method

.method public getPageSpacing()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->pageSpacing:I

    return v0
.end method

.method public final getRemeasureNeeded()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->remeasureNeeded:Z

    return v0
.end method

.method public getReverseLayout()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->reverseLayout:Z

    return v0
.end method

.method public getViewportEndOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->viewportEndOffset:I

    return v0
.end method

.method public getViewportSize-YbymL2g()J
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public getViewportStartOffset()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->viewportStartOffset:I

    return v0
.end method

.method public getVisiblePagesInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->visiblePagesInfo:Ljava/util/List;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v0

    return v0
.end method

.method public placeChildren()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->$$delegate_0:Landroidx/compose/ui/layout/MeasureResult;

    invoke-interface {v0}, Landroidx/compose/ui/layout/MeasureResult;->placeChildren()V

    return-void
.end method

.method public final setCanScrollForward(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->canScrollForward:Z

    return-void
.end method

.method public final setCurrentPageOffsetFraction(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPageOffsetFraction:F

    return-void
.end method

.method public final setFirstVisiblePageScrollOffset(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePageScrollOffset:I

    return-void
.end method

.method public final tryToApplyScrollWithoutRemeasure(I)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getPageSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getPageSpacing()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    iget-boolean v1, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->remeasureNeeded:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v1, :cond_8

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getVisiblePagesInfo()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_8

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePage:Landroidx/compose/foundation/pager/MeasuredPage;

    .line 26
    .line 27
    if-eqz v1, :cond_8

    .line 28
    .line 29
    iget v1, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePageScrollOffset:I

    .line 30
    .line 31
    sub-int/2addr v1, p1

    .line 32
    const/4 v3, 0x1

    .line 33
    if-ltz v1, :cond_0

    .line 34
    .line 35
    if-ge v1, v0, :cond_0

    .line 36
    .line 37
    move v1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v2

    .line 40
    :goto_0
    if-nez v1, :cond_1

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_1
    if-eqz v0, :cond_2

    .line 45
    .line 46
    int-to-float v1, p1

    .line 47
    int-to-float v4, v0

    .line 48
    div-float/2addr v1, v4

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v1, 0x0

    .line 51
    :goto_1
    iget v4, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPageOffsetFraction:F

    .line 52
    .line 53
    sub-float/2addr v4, v1

    .line 54
    iget-object v5, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPage:Landroidx/compose/foundation/pager/MeasuredPage;

    .line 55
    .line 56
    if-eqz v5, :cond_8

    .line 57
    .line 58
    const/high16 v5, 0x3f000000    # 0.5f

    .line 59
    .line 60
    cmpl-float v5, v4, v5

    .line 61
    .line 62
    if-gez v5, :cond_8

    .line 63
    .line 64
    const/high16 v5, -0x41000000    # -0.5f

    .line 65
    .line 66
    cmpg-float v4, v4, v5

    .line 67
    .line 68
    if-gtz v4, :cond_3

    .line 69
    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getVisiblePagesInfo()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Landroidx/compose/foundation/pager/MeasuredPage;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getVisiblePagesInfo()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v5}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Landroidx/compose/foundation/pager/MeasuredPage;

    .line 91
    .line 92
    if-gez p1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v4}, Landroidx/compose/foundation/pager/MeasuredPage;->getOffset()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    add-int/2addr v4, v0

    .line 99
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getViewportStartOffset()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    sub-int/2addr v4, v6

    .line 104
    invoke-virtual {v5}, Landroidx/compose/foundation/pager/MeasuredPage;->getOffset()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    add-int/2addr v5, v0

    .line 109
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getViewportEndOffset()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    sub-int/2addr v5, v0

    .line 114
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    neg-int v4, p1

    .line 119
    if-le v0, v4, :cond_5

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getViewportStartOffset()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-virtual {v4}, Landroidx/compose/foundation/pager/MeasuredPage;->getOffset()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    sub-int/2addr v0, v4

    .line 131
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getViewportEndOffset()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    invoke-virtual {v5}, Landroidx/compose/foundation/pager/MeasuredPage;->getOffset()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    sub-int/2addr v4, v5

    .line 140
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-le v0, p1, :cond_5

    .line 145
    .line 146
    :goto_2
    move v0, v3

    .line 147
    goto :goto_3

    .line 148
    :cond_5
    move v0, v2

    .line 149
    :goto_3
    if-eqz v0, :cond_8

    .line 150
    .line 151
    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPageOffsetFraction:F

    .line 152
    .line 153
    sub-float/2addr v0, v1

    .line 154
    iput v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->currentPageOffsetFraction:F

    .line 155
    .line 156
    iget v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePageScrollOffset:I

    .line 157
    .line 158
    sub-int/2addr v0, p1

    .line 159
    iput v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->firstVisiblePageScrollOffset:I

    .line 160
    .line 161
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getVisiblePagesInfo()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    :goto_4
    if-ge v2, v1, :cond_6

    .line 170
    .line 171
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    check-cast v4, Landroidx/compose/foundation/pager/MeasuredPage;

    .line 176
    .line 177
    invoke-virtual {v4, p1}, Landroidx/compose/foundation/pager/MeasuredPage;->applyScrollDelta(I)V

    .line 178
    .line 179
    .line 180
    add-int/lit8 v2, v2, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    iget-boolean v0, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->canScrollForward:Z

    .line 184
    .line 185
    if-nez v0, :cond_7

    .line 186
    .line 187
    if-lez p1, :cond_7

    .line 188
    .line 189
    iput-boolean v3, p0, Landroidx/compose/foundation/pager/PagerMeasureResult;->canScrollForward:Z

    .line 190
    .line 191
    :cond_7
    move v2, v3

    .line 192
    :cond_8
    :goto_5
    return v2
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
