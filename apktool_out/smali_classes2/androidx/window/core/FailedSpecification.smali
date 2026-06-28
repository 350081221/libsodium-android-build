.class final Landroidx/window/core/FailedSpecification;
.super Landroidx/window/core/SpecificationComputer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/window/core/FailedSpecification$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/window/core/SpecificationComputer<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008$\u0010%J/\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008H\u0016J\u0011\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\r\u001a\u00028\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u000cR\u0017\u0010\u0010\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Landroidx/window/core/FailedSpecification;",
        "",
        "T",
        "Landroidx/window/core/SpecificationComputer;",
        "",
        "message",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/u;",
        "condition",
        "require",
        "compute",
        "()Ljava/lang/Object;",
        "value",
        "Ljava/lang/Object;",
        "getValue",
        "tag",
        "Ljava/lang/String;",
        "getTag",
        "()Ljava/lang/String;",
        "getMessage",
        "Landroidx/window/core/Logger;",
        "logger",
        "Landroidx/window/core/Logger;",
        "getLogger",
        "()Landroidx/window/core/Logger;",
        "Landroidx/window/core/SpecificationComputer$VerificationMode;",
        "verificationMode",
        "Landroidx/window/core/SpecificationComputer$VerificationMode;",
        "getVerificationMode",
        "()Landroidx/window/core/SpecificationComputer$VerificationMode;",
        "Landroidx/window/core/WindowStrictModeException;",
        "exception",
        "Landroidx/window/core/WindowStrictModeException;",
        "getException",
        "()Landroidx/window/core/WindowStrictModeException;",
        "<init>",
        "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroidx/window/core/Logger;Landroidx/window/core/SpecificationComputer$VerificationMode;)V",
        "window_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final exception:Landroidx/window/core/WindowStrictModeException;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final logger:Landroidx/window/core/Logger;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final message:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final tag:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final verificationMode:Landroidx/window/core/SpecificationComputer$VerificationMode;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroidx/window/core/Logger;Landroidx/window/core/SpecificationComputer$VerificationMode;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/window/core/Logger;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/window/core/SpecificationComputer$VerificationMode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/window/core/Logger;",
            "Landroidx/window/core/SpecificationComputer$VerificationMode;",
            ")V"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "value"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "tag"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "message"

    .line 13
    .line 14
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "logger"

    .line 18
    .line 19
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string/jumbo v0, "verificationMode"

    .line 23
    .line 24
    .line 25
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/window/core/SpecificationComputer;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Landroidx/window/core/FailedSpecification;->value:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object p2, p0, Landroidx/window/core/FailedSpecification;->tag:Ljava/lang/String;

    .line 34
    .line 35
    iput-object p3, p0, Landroidx/window/core/FailedSpecification;->message:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p4, p0, Landroidx/window/core/FailedSpecification;->logger:Landroidx/window/core/Logger;

    .line 38
    .line 39
    iput-object p5, p0, Landroidx/window/core/FailedSpecification;->verificationMode:Landroidx/window/core/SpecificationComputer$VerificationMode;

    .line 40
    .line 41
    new-instance p2, Landroidx/window/core/WindowStrictModeException;

    .line 42
    .line 43
    invoke-virtual {p0, p1, p3}, Landroidx/window/core/SpecificationComputer;->createMessage(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p2, p1}, Landroidx/window/core/WindowStrictModeException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string p3, "stackTrace"

    .line 55
    .line 56
    invoke-static {p1, p3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p3, 0x2

    .line 60
    invoke-static {p1, p3}, Lkotlin/collections/l;->l9([Ljava/lang/Object;I)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/util/Collection;

    .line 65
    .line 66
    const/4 p3, 0x0

    .line 67
    new-array p3, p3, [Ljava/lang/StackTraceElement;

    .line 68
    .line 69
    invoke-interface {p1, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_0

    .line 74
    .line 75
    check-cast p1, [Ljava/lang/StackTraceElement;

    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, Landroidx/window/core/FailedSpecification;->exception:Landroidx/window/core/WindowStrictModeException;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    const-string p2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 86
    .line 87
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1
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
.end method


# virtual methods
.method public compute()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->verificationMode:Landroidx/window/core/SpecificationComputer$VerificationMode;

    .line 2
    .line 3
    sget-object v1, Landroidx/window/core/FailedSpecification$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Lkotlin/j0;

    .line 22
    .line 23
    invoke-direct {v0}, Lkotlin/j0;-><init>()V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->logger:Landroidx/window/core/Logger;

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/window/core/FailedSpecification;->tag:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/window/core/FailedSpecification;->value:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/window/core/FailedSpecification;->message:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v2, v3}, Landroidx/window/core/SpecificationComputer;->createMessage(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v0, v1, v2}, Landroidx/window/core/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    const/4 v0, 0x0

    .line 43
    return-object v0

    .line 44
    :cond_2
    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->exception:Landroidx/window/core/WindowStrictModeException;

    .line 45
    .line 46
    throw v0
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
.end method

.method public final getException()Landroidx/window/core/WindowStrictModeException;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->exception:Landroidx/window/core/WindowStrictModeException;

    return-object v0
.end method

.method public final getLogger()Landroidx/window/core/Logger;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->logger:Landroidx/window/core/Logger;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public final getVerificationMode()Landroidx/window/core/SpecificationComputer$VerificationMode;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/window/core/FailedSpecification;->verificationMode:Landroidx/window/core/SpecificationComputer$VerificationMode;

    return-object v0
.end method

.method public require(Ljava/lang/String;Lv3/l;)Landroidx/window/core/SpecificationComputer;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv3/l<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroidx/window/core/SpecificationComputer<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "condition"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
