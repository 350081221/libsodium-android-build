.class public final Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/State;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/core/InfiniteTransition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "TransitionAnimationState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Landroidx/compose/animation/core/AnimationVector;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/compose/runtime/State<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0086\u0004\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0004BC\u0008\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008B\u0010CJ-\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0013R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0019\"\u0004\u0008\u001d\u0010\u001bR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R+\u0010-\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00008V@PX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010\u0019\"\u0004\u0008,\u0010\u001bR0\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00078\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u00100RB\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R\u0016\u0010?\u001a\u0002088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010:R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010A\u00a8\u0006D"
    }
    d2 = {
        "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;",
        "T",
        "Landroidx/compose/animation/core/AnimationVector;",
        "V",
        "Landroidx/compose/runtime/State;",
        "initialValue",
        "targetValue",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "animationSpec",
        "Lkotlin/r2;",
        "updateValues$animation_core_release",
        "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V",
        "updateValues",
        "",
        "playTimeNanos",
        "onPlayTimeChanged$animation_core_release",
        "(J)V",
        "onPlayTimeChanged",
        "skipToEnd$animation_core_release",
        "()V",
        "skipToEnd",
        "reset$animation_core_release",
        "reset",
        "Ljava/lang/Object;",
        "getInitialValue$animation_core_release",
        "()Ljava/lang/Object;",
        "setInitialValue$animation_core_release",
        "(Ljava/lang/Object;)V",
        "getTargetValue$animation_core_release",
        "setTargetValue$animation_core_release",
        "Landroidx/compose/animation/core/TwoWayConverter;",
        "typeConverter",
        "Landroidx/compose/animation/core/TwoWayConverter;",
        "getTypeConverter",
        "()Landroidx/compose/animation/core/TwoWayConverter;",
        "",
        "label",
        "Ljava/lang/String;",
        "getLabel",
        "()Ljava/lang/String;",
        "<set-?>",
        "value$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getValue",
        "setValue$animation_core_release",
        "value",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "getAnimationSpec",
        "()Landroidx/compose/animation/core/AnimationSpec;",
        "Landroidx/compose/animation/core/TargetBasedAnimation;",
        "animation",
        "Landroidx/compose/animation/core/TargetBasedAnimation;",
        "getAnimation",
        "()Landroidx/compose/animation/core/TargetBasedAnimation;",
        "setAnimation$animation_core_release",
        "(Landroidx/compose/animation/core/TargetBasedAnimation;)V",
        "",
        "isFinished",
        "Z",
        "isFinished$animation_core_release",
        "()Z",
        "setFinished$animation_core_release",
        "(Z)V",
        "startOnTheNextFrame",
        "playTimeNanosOffset",
        "J",
        "<init>",
        "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V",
        "animation-core_release"
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
        "SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n81#2:365\n107#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"
    }
.end annotation


# instance fields
.field private animation:Landroidx/compose/animation/core/TargetBasedAnimation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/TargetBasedAnimation<",
            "TT;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private animationSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private initialValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private isFinished:Z

.field private final label:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private playTimeNanosOffset:J

.field private startOnTheNextFrame:Z

.field private targetValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/animation/core/InfiniteTransition;

.field private final typeConverter:Landroidx/compose/animation/core/TwoWayConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final value$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V
    .locals 8
    .param p3    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/animation/core/TwoWayConverter;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->this$0:Landroidx/compose/animation/core/InfiniteTransition;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->initialValue:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->targetValue:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->typeConverter:Landroidx/compose/animation/core/TwoWayConverter;

    .line 11
    .line 12
    iput-object p6, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->label:Ljava/lang/String;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 p3, 0x2

    .line 16
    invoke-static {p2, p1, p3, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 21
    .line 22
    iput-object p5, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 23
    .line 24
    new-instance p1, Landroidx/compose/animation/core/TargetBasedAnimation;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 27
    .line 28
    iget-object v3, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->initialValue:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v4, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->targetValue:Ljava/lang/Object;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/16 v6, 0x10

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v0, p1

    .line 37
    move-object v2, p4

    .line 38
    invoke-direct/range {v0 .. v7}, Landroidx/compose/animation/core/TargetBasedAnimation;-><init>(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;ILkotlin/jvm/internal/w;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animation:Landroidx/compose/animation/core/TargetBasedAnimation;

    .line 42
    .line 43
    return-void
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
.end method


# virtual methods
.method public final getAnimation()Landroidx/compose/animation/core/TargetBasedAnimation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/TargetBasedAnimation<",
            "TT;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animation:Landroidx/compose/animation/core/TargetBasedAnimation;

    return-object v0
.end method

.method public final getAnimationSpec()Landroidx/compose/animation/core/AnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    return-object v0
.end method

.method public final getInitialValue$animation_core_release()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->initialValue:Ljava/lang/Object;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getTargetValue$animation_core_release()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->targetValue:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTypeConverter()Landroidx/compose/animation/core/TwoWayConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->typeConverter:Landroidx/compose/animation/core/TwoWayConverter;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final isFinished$animation_core_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->isFinished:Z

    return v0
.end method

.method public final onPlayTimeChanged$animation_core_release(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->this$0:Landroidx/compose/animation/core/InfiniteTransition;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Landroidx/compose/animation/core/InfiniteTransition;->access$setRefreshChildNeeded(Landroidx/compose/animation/core/InfiniteTransition;Z)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->startOnTheNextFrame:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput-boolean v1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->startOnTheNextFrame:Z

    .line 12
    .line 13
    iput-wide p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->playTimeNanosOffset:J

    .line 14
    .line 15
    :cond_0
    iget-wide v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->playTimeNanosOffset:J

    .line 16
    .line 17
    sub-long/2addr p1, v0

    .line 18
    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animation:Landroidx/compose/animation/core/TargetBasedAnimation;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Landroidx/compose/animation/core/TargetBasedAnimation;->getValueFromNanos(J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->setValue$animation_core_release(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animation:Landroidx/compose/animation/core/TargetBasedAnimation;

    .line 28
    .line 29
    invoke-interface {v0, p1, p2}, Landroidx/compose/animation/core/Animation;->isFinishedFromNanos(J)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput-boolean p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->isFinished:Z

    .line 34
    .line 35
    return-void
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
.end method

.method public final reset$animation_core_release()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->startOnTheNextFrame:Z

    return-void
.end method

.method public final setAnimation$animation_core_release(Landroidx/compose/animation/core/TargetBasedAnimation;)V
    .locals 0
    .param p1    # Landroidx/compose/animation/core/TargetBasedAnimation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/TargetBasedAnimation<",
            "TT;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animation:Landroidx/compose/animation/core/TargetBasedAnimation;

    return-void
.end method

.method public final setFinished$animation_core_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->isFinished:Z

    return-void
.end method

.method public final setInitialValue$animation_core_release(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->initialValue:Ljava/lang/Object;

    return-void
.end method

.method public final setTargetValue$animation_core_release(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->targetValue:Ljava/lang/Object;

    return-void
.end method

.method public setValue$animation_core_release(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->value$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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
.end method

.method public final skipToEnd$animation_core_release()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animation:Landroidx/compose/animation/core/TargetBasedAnimation;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/animation/core/TargetBasedAnimation;->getTargetValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->setValue$animation_core_release(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->startOnTheNextFrame:Z

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final updateValues$animation_core_release(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V
    .locals 9
    .param p3    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->initialValue:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->targetValue:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 6
    .line 7
    new-instance v8, Landroidx/compose/animation/core/TargetBasedAnimation;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->typeConverter:Landroidx/compose/animation/core/TwoWayConverter;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/16 v6, 0x10

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v0, v8

    .line 16
    move-object v1, p3

    .line 17
    move-object v3, p1

    .line 18
    move-object v4, p2

    .line 19
    invoke-direct/range {v0 .. v7}, Landroidx/compose/animation/core/TargetBasedAnimation;-><init>(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;ILkotlin/jvm/internal/w;)V

    .line 20
    .line 21
    .line 22
    iput-object v8, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->animation:Landroidx/compose/animation/core/TargetBasedAnimation;

    .line 23
    .line 24
    iget-object p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->this$0:Landroidx/compose/animation/core/InfiniteTransition;

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    invoke-static {p1, p2}, Landroidx/compose/animation/core/InfiniteTransition;->access$setRefreshChildNeeded(Landroidx/compose/animation/core/InfiniteTransition;Z)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    iput-boolean p1, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->isFinished:Z

    .line 32
    .line 33
    iput-boolean p2, p0, Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;->startOnTheNextFrame:Z

    .line 34
    .line 35
    return-void
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
.end method
