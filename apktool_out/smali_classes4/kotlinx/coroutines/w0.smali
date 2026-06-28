.class public final Lkotlinx/coroutines/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0008\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0081\u0008\"\u0014\u0010\u0008\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0007\"\u0014\u0010\u000c\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0007\"\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0007\"\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0007\"\u001a\u0010\u0013\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0011\u001a\u0004\u0008\t\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0011\u001a\u0004\u0008\r\u0010\u0012\"\u001a\u0010\u0017\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u000b\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkotlin/r2;",
        "f",
        "Lkotlin/Function0;",
        "",
        "value",
        "a",
        "",
        "Ljava/lang/String;",
        "DEBUG_PROPERTY_NAME",
        "b",
        "STACKTRACE_RECOVERY_PROPERTY_NAME",
        "c",
        "DEBUG_PROPERTY_VALUE_AUTO",
        "d",
        "DEBUG_PROPERTY_VALUE_ON",
        "e",
        "DEBUG_PROPERTY_VALUE_OFF",
        "Z",
        "()Z",
        "ASSERTIONS_ENABLED",
        "g",
        "DEBUG",
        "h",
        "RECOVER_STACK_TRACES",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "i",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "()Ljava/util/concurrent/atomic/AtomicLong;",
        "COROUTINE_ID",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "kotlinx.coroutines.debug"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final b:Ljava/lang/String; = "kotlinx.coroutines.stacktrace.recovery"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final c:Ljava/lang/String; = "auto"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final d:Ljava/lang/String; = "on"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final e:Ljava/lang/String; = "off"
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final f:Z = false

.field private static final g:Z

.field private static final h:Z

.field private static final i:Ljava/util/concurrent/atomic/AtomicLong;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "kotlinx.coroutines.debug"

    .line 2
    .line 3
    invoke-static {v0}, Lkotlinx/coroutines/internal/w0;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    const/16 v4, 0xddf

    .line 18
    .line 19
    if-eq v3, v4, :cond_1

    .line 20
    .line 21
    const v4, 0x1ad6f

    .line 22
    .line 23
    .line 24
    if-eq v3, v4, :cond_0

    .line 25
    .line 26
    const v4, 0x2dddaf

    .line 27
    .line 28
    .line 29
    if-ne v3, v4, :cond_3

    .line 30
    .line 31
    const-string v3, "auto"

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const-string v3, "off"

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string v3, "on"

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const-string v3, ""

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    :goto_0
    move v0, v1

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v3, "System property \'kotlinx.coroutines.debug\' has unrecognized value \'"

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const/16 v0, 0x27

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :cond_4
    :goto_1
    move v0, v2

    .line 101
    :goto_2
    sput-boolean v0, Lkotlinx/coroutines/w0;->g:Z

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    const-string v0, "kotlinx.coroutines.stacktrace.recovery"

    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlinx/coroutines/internal/w0;->f(Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    move v1, v2

    .line 115
    :goto_3
    sput-boolean v1, Lkotlinx/coroutines/w0;->h:Z

    .line 116
    .line 117
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 118
    .line 119
    const-wide/16 v1, 0x0

    .line 120
    .line 121
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 122
    .line 123
    .line 124
    sput-object v0, Lkotlinx/coroutines/w0;->i:Ljava/util/concurrent/atomic/AtomicLong;

    .line 125
    .line 126
    return-void
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
.end method

.method private static final a(Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/internal/f;
    .end annotation

    return-void
.end method

.method public static final b()Z
    .locals 1

    sget-boolean v0, Lkotlinx/coroutines/w0;->f:Z

    return v0
.end method

.method public static final c()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlinx/coroutines/w0;->i:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method

.method public static final d()Z
    .locals 1

    sget-boolean v0, Lkotlinx/coroutines/w0;->g:Z

    return v0
.end method

.method public static final e()Z
    .locals 1

    sget-boolean v0, Lkotlinx/coroutines/w0;->h:Z

    return v0
.end method

.method public static final f()V
    .locals 3

    sget-object v0, Lkotlinx/coroutines/w0;->i:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method
