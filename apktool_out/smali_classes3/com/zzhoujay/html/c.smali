.class Lcom/zzhoujay/html/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/xml/sax/ContentHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zzhoujay/html/c$m;,
        Lcom/zzhoujay/html/c$b;,
        Lcom/zzhoujay/html/c$p;,
        Lcom/zzhoujay/html/c$k;,
        Lcom/zzhoujay/html/c$c;,
        Lcom/zzhoujay/html/c$j;,
        Lcom/zzhoujay/html/c$l;,
        Lcom/zzhoujay/html/c$i;,
        Lcom/zzhoujay/html/c$h;,
        Lcom/zzhoujay/html/c$g;,
        Lcom/zzhoujay/html/c$s;,
        Lcom/zzhoujay/html/c$t;,
        Lcom/zzhoujay/html/c$e;,
        Lcom/zzhoujay/html/c$o;,
        Lcom/zzhoujay/html/c$q;,
        Lcom/zzhoujay/html/c$d;,
        Lcom/zzhoujay/html/c$r;,
        Lcom/zzhoujay/html/c$u;,
        Lcom/zzhoujay/html/c$n;,
        Lcom/zzhoujay/html/c$f;
    }
.end annotation


# static fields
.field private static final i:Ljava/lang/String; = "HtmlToSpannedConverter"

.field private static final j:[F

.field private static final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static l:Ljava/util/regex/Pattern;

.field private static m:Ljava/util/regex/Pattern;

.field private static n:Ljava/util/regex/Pattern;

.field private static o:Ljava/util/regex/Pattern;

.field private static p:Ljava/util/regex/Pattern;

.field private static q:Ljava/util/regex/Pattern;

.field private static r:Ljava/util/regex/Pattern;

.field private static s:Ljava/util/regex/Pattern;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lorg/xml/sax/XMLReader;

.field private c:Landroid/text/SpannableStringBuilder;

.field private d:Landroid/text/Html$ImageGetter;

.field private e:Landroid/text/Html$TagHandler;

.field private f:I

.field private g:Z

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zzhoujay/html/c;->j:[F

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/zzhoujay/html/c;->k:Ljava/util/Map;

    .line 15
    .line 16
    const v1, -0x565657

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "darkgray"

    .line 24
    .line 25
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const v2, -0x7f7f80

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "gray"

    .line 36
    .line 37
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const v3, -0x2c2c2d

    .line 41
    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v4, "lightgray"

    .line 48
    .line 49
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    const-string v4, "darkgrey"

    .line 53
    .line 54
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-string v1, "grey"

    .line 58
    .line 59
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const-string v1, "lightgrey"

    .line 63
    .line 64
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    const v1, -0xff8000

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-string v2, "green"

    .line 75
    .line 76
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :array_0
    .array-data 4
        0x3fc00000    # 1.5f
        0x3fb33333    # 1.4f
        0x3fa66666    # 1.3f
        0x3f99999a    # 1.2f
        0x3f8ccccd    # 1.1f
        0x3f800000    # 1.0f
    .end array-data
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

.method constructor <init>(Ljava/lang/String;Landroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;Lorg/ccil/cowan/tagsoup/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/html/c;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, Landroid/text/SpannableStringBuilder;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/zzhoujay/html/c;->d:Landroid/text/Html$ImageGetter;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/zzhoujay/html/c;->e:Landroid/text/Html$TagHandler;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/zzhoujay/html/c;->b:Lorg/xml/sax/XMLReader;

    .line 18
    .line 19
    iput p5, p0, Lcom/zzhoujay/html/c;->f:I

    .line 20
    .line 21
    return-void
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
.end method

.method private static A()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/html/c;->o:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "(?:\\s+|\\A|;\\s*)text-decoration\\s*:\\s*(\\S*)\\b"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zzhoujay/html/c;->o:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/zzhoujay/html/c;->o:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static B()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/html/c;->s:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "(?:\\s+|\\A|;\\s*)text-indent\\s*:\\s*(\\d*)px\\b"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zzhoujay/html/c;->s:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/zzhoujay/html/c;->s:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static C(Landroid/text/Editable;)V
    .locals 1

    const/16 v0, 0xa

    invoke-interface {p0, v0}, Landroid/text/Editable;->append(C)Landroid/text/Editable;

    return-void
.end method

.method private D(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "br"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/zzhoujay/html/c;->C(Landroid/text/Editable;)V

    .line 12
    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    const-string v0, "p"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/zzhoujay/html/c;->h(Landroid/text/Editable;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zzhoujay/html/c;->e(Landroid/text/Editable;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_1
    const-string v0, "ul"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/zzhoujay/html/c;->h(Landroid/text/Editable;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/zzhoujay/html/c;->e(Landroid/text/Editable;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :cond_2
    const-string v0, "li"

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 65
    .line 66
    invoke-static {p1}, Lcom/zzhoujay/html/c;->k(Landroid/text/Editable;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_3
    const-string v0, "div"

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 80
    .line 81
    invoke-static {p1}, Lcom/zzhoujay/html/c;->h(Landroid/text/Editable;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 85
    .line 86
    invoke-static {p1}, Lcom/zzhoujay/html/c;->e(Landroid/text/Editable;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :cond_4
    const-string v0, "span"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 100
    .line 101
    invoke-static {p1}, Lcom/zzhoujay/html/c;->h(Landroid/text/Editable;)V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_1

    .line 105
    .line 106
    :cond_5
    const-string v0, "strong"

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    const-class v1, Lcom/zzhoujay/html/c$f;

    .line 113
    .line 114
    const/4 v2, 0x1

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 118
    .line 119
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 120
    .line 121
    invoke-direct {v0, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :cond_6
    const-string v0, "b"

    .line 130
    .line 131
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_7

    .line 136
    .line 137
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 138
    .line 139
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 140
    .line 141
    invoke-direct {v0, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :cond_7
    const-string v0, "em"

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    const-class v1, Lcom/zzhoujay/html/c$n;

    .line 156
    .line 157
    const/4 v3, 0x2

    .line 158
    if-eqz v0, :cond_8

    .line 159
    .line 160
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 161
    .line 162
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 163
    .line 164
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_1

    .line 171
    .line 172
    :cond_8
    const-string v0, "cite"

    .line 173
    .line 174
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_9

    .line 179
    .line 180
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 181
    .line 182
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 183
    .line 184
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_1

    .line 191
    .line 192
    :cond_9
    const-string v0, "dfn"

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_a

    .line 199
    .line 200
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 201
    .line 202
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 203
    .line 204
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :cond_a
    const-string v0, "i"

    .line 213
    .line 214
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_b

    .line 219
    .line 220
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 221
    .line 222
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 223
    .line 224
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :cond_b
    const-string v0, "big"

    .line 233
    .line 234
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_c

    .line 239
    .line 240
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 241
    .line 242
    new-instance v0, Landroid/text/style/RelativeSizeSpan;

    .line 243
    .line 244
    const/high16 v1, 0x3fa00000    # 1.25f

    .line 245
    .line 246
    invoke-direct {v0, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 247
    .line 248
    .line 249
    const-class v1, Lcom/zzhoujay/html/c$d;

    .line 250
    .line 251
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :cond_c
    const-string v0, "small"

    .line 257
    .line 258
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_d

    .line 263
    .line 264
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 265
    .line 266
    new-instance v0, Landroid/text/style/RelativeSizeSpan;

    .line 267
    .line 268
    const v1, 0x3f4ccccd    # 0.8f

    .line 269
    .line 270
    .line 271
    invoke-direct {v0, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 272
    .line 273
    .line 274
    const-class v1, Lcom/zzhoujay/html/c$q;

    .line 275
    .line 276
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :cond_d
    const-string v0, "font"

    .line 282
    .line 283
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_e

    .line 288
    .line 289
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 290
    .line 291
    invoke-static {p1}, Lcom/zzhoujay/html/c;->i(Landroid/text/Editable;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_1

    .line 295
    .line 296
    :cond_e
    const-string v0, "blockquote"

    .line 297
    .line 298
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_f

    .line 303
    .line 304
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 305
    .line 306
    invoke-static {p1}, Lcom/zzhoujay/html/c;->f(Landroid/text/Editable;)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_1

    .line 310
    .line 311
    :cond_f
    const-string v0, "tt"

    .line 312
    .line 313
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_10

    .line 318
    .line 319
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 320
    .line 321
    new-instance v0, Landroid/text/style/TypefaceSpan;

    .line 322
    .line 323
    const-string v1, "monospace"

    .line 324
    .line 325
    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    const-class v1, Lcom/zzhoujay/html/c$o;

    .line 329
    .line 330
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :cond_10
    const-string v0, "a"

    .line 336
    .line 337
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_11

    .line 342
    .line 343
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 344
    .line 345
    invoke-static {p1}, Lcom/zzhoujay/html/c;->d(Landroid/text/Editable;)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_1

    .line 349
    .line 350
    :cond_11
    const-string v0, "u"

    .line 351
    .line 352
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_12

    .line 357
    .line 358
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 359
    .line 360
    new-instance v0, Landroid/text/style/UnderlineSpan;

    .line 361
    .line 362
    invoke-direct {v0}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 363
    .line 364
    .line 365
    const-class v1, Lcom/zzhoujay/html/c$u;

    .line 366
    .line 367
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_1

    .line 371
    .line 372
    :cond_12
    const-string v0, "del"

    .line 373
    .line 374
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    const-class v1, Lcom/zzhoujay/html/c$r;

    .line 379
    .line 380
    if-eqz v0, :cond_13

    .line 381
    .line 382
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 383
    .line 384
    new-instance v0, Landroid/text/style/StrikethroughSpan;

    .line 385
    .line 386
    invoke-direct {v0}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    goto/16 :goto_1

    .line 393
    .line 394
    :cond_13
    const-string v0, "s"

    .line 395
    .line 396
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_14

    .line 401
    .line 402
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 403
    .line 404
    new-instance v0, Landroid/text/style/StrikethroughSpan;

    .line 405
    .line 406
    invoke-direct {v0}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 407
    .line 408
    .line 409
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_1

    .line 413
    .line 414
    :cond_14
    const-string v0, "strike"

    .line 415
    .line 416
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-eqz v0, :cond_15

    .line 421
    .line 422
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 423
    .line 424
    new-instance v0, Landroid/text/style/StrikethroughSpan;

    .line 425
    .line 426
    invoke-direct {v0}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_1

    .line 433
    .line 434
    :cond_15
    const-string v0, "sup"

    .line 435
    .line 436
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-eqz v0, :cond_16

    .line 441
    .line 442
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 443
    .line 444
    new-instance v0, Landroid/text/style/SuperscriptSpan;

    .line 445
    .line 446
    invoke-direct {v0}, Landroid/text/style/SuperscriptSpan;-><init>()V

    .line 447
    .line 448
    .line 449
    const-class v1, Lcom/zzhoujay/html/c$t;

    .line 450
    .line 451
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_1

    .line 455
    .line 456
    :cond_16
    const-string v0, "sub"

    .line 457
    .line 458
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_17

    .line 463
    .line 464
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 465
    .line 466
    new-instance v0, Landroid/text/style/SubscriptSpan;

    .line 467
    .line 468
    invoke-direct {v0}, Landroid/text/style/SubscriptSpan;-><init>()V

    .line 469
    .line 470
    .line 471
    const-class v1, Lcom/zzhoujay/html/c$s;

    .line 472
    .line 473
    invoke-static {p1, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    goto :goto_1

    .line 477
    :cond_17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    const/4 v1, 0x0

    .line 482
    if-ne v0, v3, :cond_18

    .line 483
    .line 484
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    invoke-static {v0}, Ljava/lang/Character;->toLowerCase(C)C

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    const/16 v3, 0x68

    .line 493
    .line 494
    if-ne v0, v3, :cond_18

    .line 495
    .line 496
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    const/16 v3, 0x31

    .line 501
    .line 502
    if-lt v0, v3, :cond_18

    .line 503
    .line 504
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    const/16 v2, 0x36

    .line 509
    .line 510
    if-gt v0, v2, :cond_18

    .line 511
    .line 512
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 513
    .line 514
    invoke-static {p1}, Lcom/zzhoujay/html/c;->j(Landroid/text/Editable;)V

    .line 515
    .line 516
    .line 517
    goto :goto_1

    .line 518
    :cond_18
    const-string v0, "code"

    .line 519
    .line 520
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_1a

    .line 525
    .line 526
    iget-boolean p1, p0, Lcom/zzhoujay/html/c;->h:Z

    .line 527
    .line 528
    if-eqz p1, :cond_19

    .line 529
    .line 530
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 531
    .line 532
    invoke-static {p1}, Lcom/zzhoujay/html/c;->g(Landroid/text/Editable;)V

    .line 533
    .line 534
    .line 535
    goto :goto_0

    .line 536
    :cond_19
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 537
    .line 538
    new-instance v0, Lb3/b;

    .line 539
    .line 540
    invoke-direct {v0}, Lb3/b;-><init>()V

    .line 541
    .line 542
    .line 543
    const-class v2, Lcom/zzhoujay/html/c$h;

    .line 544
    .line 545
    invoke-static {p1, v2, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :goto_0
    iput-boolean v1, p0, Lcom/zzhoujay/html/c;->g:Z

    .line 549
    .line 550
    goto :goto_1

    .line 551
    :cond_1a
    const-string v0, "pre"

    .line 552
    .line 553
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    if-eqz v0, :cond_1b

    .line 558
    .line 559
    iput-boolean v1, p0, Lcom/zzhoujay/html/c;->h:Z

    .line 560
    .line 561
    goto :goto_1

    .line 562
    :cond_1b
    iget-object v0, p0, Lcom/zzhoujay/html/c;->e:Landroid/text/Html$TagHandler;

    .line 563
    .line 564
    if-eqz v0, :cond_1c

    .line 565
    .line 566
    iget-object v2, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 567
    .line 568
    iget-object v3, p0, Lcom/zzhoujay/html/c;->b:Lorg/xml/sax/XMLReader;

    .line 569
    .line 570
    invoke-interface {v0, v1, p1, v2, v3}, Landroid/text/Html$TagHandler;->handleTag(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V

    .line 571
    .line 572
    .line 573
    :cond_1c
    :goto_1
    return-void
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
.end method

.method private E(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 5

    .line 1
    const-string v0, "br"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_0
    const-string v0, "p"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/zzhoujay/html/c;->x()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {p1, p2, v0}, Lcom/zzhoujay/html/c;->I(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 29
    .line 30
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/html/c;->K(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_1
    const-string v0, "ul"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/zzhoujay/html/c;->v()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {p1, p2, v0}, Lcom/zzhoujay/html/c;->I(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/html/c;->K(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_2
    const-string v0, "li"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 68
    .line 69
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/html/c;->O(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_3
    const-string v0, "div"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 83
    .line 84
    invoke-direct {p0}, Lcom/zzhoujay/html/c;->t()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-static {p1, p2, v0}, Lcom/zzhoujay/html/c;->I(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 92
    .line 93
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/html/c;->K(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :cond_4
    const-string v0, "span"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 107
    .line 108
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/html/c;->K(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_5
    const-string v0, "strong"

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    const/4 v1, 0x0

    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 123
    .line 124
    new-instance p2, Lcom/zzhoujay/html/c$f;

    .line 125
    .line 126
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$f;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :cond_6
    const-string v0, "b"

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_7

    .line 141
    .line 142
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 143
    .line 144
    new-instance p2, Lcom/zzhoujay/html/c$f;

    .line 145
    .line 146
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$f;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_7
    const-string v0, "em"

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_8

    .line 161
    .line 162
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 163
    .line 164
    new-instance p2, Lcom/zzhoujay/html/c$n;

    .line 165
    .line 166
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$n;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 167
    .line 168
    .line 169
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_8
    const-string v0, "cite"

    .line 175
    .line 176
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_9

    .line 181
    .line 182
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 183
    .line 184
    new-instance p2, Lcom/zzhoujay/html/c$n;

    .line 185
    .line 186
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$n;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 187
    .line 188
    .line 189
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :cond_9
    const-string v0, "dfn"

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_a

    .line 201
    .line 202
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 203
    .line 204
    new-instance p2, Lcom/zzhoujay/html/c$n;

    .line 205
    .line 206
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$n;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 207
    .line 208
    .line 209
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_a
    const-string v0, "i"

    .line 215
    .line 216
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_b

    .line 221
    .line 222
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 223
    .line 224
    new-instance p2, Lcom/zzhoujay/html/c$n;

    .line 225
    .line 226
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$n;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 227
    .line 228
    .line 229
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_b
    const-string v0, "big"

    .line 235
    .line 236
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_c

    .line 241
    .line 242
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 243
    .line 244
    new-instance p2, Lcom/zzhoujay/html/c$d;

    .line 245
    .line 246
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$d;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 247
    .line 248
    .line 249
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_c
    const-string v0, "small"

    .line 255
    .line 256
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_d

    .line 261
    .line 262
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 263
    .line 264
    new-instance p2, Lcom/zzhoujay/html/c$q;

    .line 265
    .line 266
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$q;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 267
    .line 268
    .line 269
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_d
    const-string v0, "font"

    .line 275
    .line 276
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_e

    .line 281
    .line 282
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 283
    .line 284
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/html/c;->L(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_e
    const-string v0, "blockquote"

    .line 290
    .line 291
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_f

    .line 296
    .line 297
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 298
    .line 299
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/html/c;->J(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_0

    .line 303
    .line 304
    :cond_f
    const-string v0, "tt"

    .line 305
    .line 306
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_10

    .line 311
    .line 312
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 313
    .line 314
    new-instance p2, Lcom/zzhoujay/html/c$o;

    .line 315
    .line 316
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$o;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 317
    .line 318
    .line 319
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :cond_10
    const-string v0, "a"

    .line 325
    .line 326
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_11

    .line 331
    .line 332
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 333
    .line 334
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->H(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :cond_11
    const-string v0, "u"

    .line 340
    .line 341
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-eqz v0, :cond_12

    .line 346
    .line 347
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 348
    .line 349
    new-instance p2, Lcom/zzhoujay/html/c$u;

    .line 350
    .line 351
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$u;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 352
    .line 353
    .line 354
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :cond_12
    const-string v0, "del"

    .line 360
    .line 361
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_13

    .line 366
    .line 367
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 368
    .line 369
    new-instance p2, Lcom/zzhoujay/html/c$r;

    .line 370
    .line 371
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$r;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 372
    .line 373
    .line 374
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    goto/16 :goto_0

    .line 378
    .line 379
    :cond_13
    const-string v0, "s"

    .line 380
    .line 381
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_14

    .line 386
    .line 387
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 388
    .line 389
    new-instance p2, Lcom/zzhoujay/html/c$r;

    .line 390
    .line 391
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$r;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 392
    .line 393
    .line 394
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    goto/16 :goto_0

    .line 398
    .line 399
    :cond_14
    const-string v0, "strike"

    .line 400
    .line 401
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    if-eqz v0, :cond_15

    .line 406
    .line 407
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 408
    .line 409
    new-instance p2, Lcom/zzhoujay/html/c$r;

    .line 410
    .line 411
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$r;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 412
    .line 413
    .line 414
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :cond_15
    const-string v0, "sup"

    .line 420
    .line 421
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_16

    .line 426
    .line 427
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 428
    .line 429
    new-instance p2, Lcom/zzhoujay/html/c$t;

    .line 430
    .line 431
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$t;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 432
    .line 433
    .line 434
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :cond_16
    const-string v0, "sub"

    .line 440
    .line 441
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_17

    .line 446
    .line 447
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 448
    .line 449
    new-instance p2, Lcom/zzhoujay/html/c$s;

    .line 450
    .line 451
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$s;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 452
    .line 453
    .line 454
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_0

    .line 458
    .line 459
    :cond_17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    const/4 v2, 0x2

    .line 464
    const/4 v3, 0x1

    .line 465
    if-ne v0, v2, :cond_18

    .line 466
    .line 467
    const/4 v0, 0x0

    .line 468
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    invoke-static {v0}, Ljava/lang/Character;->toLowerCase(C)C

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    const/16 v2, 0x68

    .line 477
    .line 478
    if-ne v0, v2, :cond_18

    .line 479
    .line 480
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    const/16 v2, 0x31

    .line 485
    .line 486
    if-lt v0, v2, :cond_18

    .line 487
    .line 488
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    const/16 v4, 0x36

    .line 493
    .line 494
    if-gt v0, v4, :cond_18

    .line 495
    .line 496
    iget-object v0, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 497
    .line 498
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 499
    .line 500
    .line 501
    move-result p1

    .line 502
    sub-int/2addr p1, v2

    .line 503
    invoke-direct {p0, v0, p2, p1}, Lcom/zzhoujay/html/c;->M(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V

    .line 504
    .line 505
    .line 506
    goto :goto_0

    .line 507
    :cond_18
    const-string v0, "img"

    .line 508
    .line 509
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-eqz v0, :cond_19

    .line 514
    .line 515
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 516
    .line 517
    iget-object v0, p0, Lcom/zzhoujay/html/c;->d:Landroid/text/Html$ImageGetter;

    .line 518
    .line 519
    invoke-static {p1, p2, v0}, Lcom/zzhoujay/html/c;->N(Landroid/text/Editable;Lorg/xml/sax/Attributes;Landroid/text/Html$ImageGetter;)V

    .line 520
    .line 521
    .line 522
    goto :goto_0

    .line 523
    :cond_19
    const-string p2, "code"

    .line 524
    .line 525
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 526
    .line 527
    .line 528
    move-result p2

    .line 529
    if-eqz p2, :cond_1b

    .line 530
    .line 531
    iget-boolean p1, p0, Lcom/zzhoujay/html/c;->h:Z

    .line 532
    .line 533
    if-eqz p1, :cond_1a

    .line 534
    .line 535
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 536
    .line 537
    invoke-static {p1, v3}, Lcom/zzhoujay/html/c;->a(Landroid/text/Editable;I)V

    .line 538
    .line 539
    .line 540
    :cond_1a
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 541
    .line 542
    new-instance p2, Lcom/zzhoujay/html/c$h;

    .line 543
    .line 544
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$h;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 545
    .line 546
    .line 547
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    iput-boolean v3, p0, Lcom/zzhoujay/html/c;->g:Z

    .line 551
    .line 552
    goto :goto_0

    .line 553
    :cond_1b
    const-string p2, "pre"

    .line 554
    .line 555
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 556
    .line 557
    .line 558
    move-result p2

    .line 559
    if-eqz p2, :cond_1c

    .line 560
    .line 561
    iput-boolean v3, p0, Lcom/zzhoujay/html/c;->h:Z

    .line 562
    .line 563
    goto :goto_0

    .line 564
    :cond_1c
    iget-object p2, p0, Lcom/zzhoujay/html/c;->e:Landroid/text/Html$TagHandler;

    .line 565
    .line 566
    if-eqz p2, :cond_1d

    .line 567
    .line 568
    iget-object v0, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 569
    .line 570
    iget-object v1, p0, Lcom/zzhoujay/html/c;->b:Lorg/xml/sax/XMLReader;

    .line 571
    .line 572
    invoke-interface {p2, v3, p1, v0, v1}, Landroid/text/Html$TagHandler;->handleTag(ZLjava/lang/String;Landroid/text/Editable;Lorg/xml/sax/XMLReader;)V

    .line 573
    .line 574
    .line 575
    :cond_1d
    :goto_0
    return-void
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
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
.end method

.method private static varargs F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-interface {p0, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0, p1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    array-length v1, p2

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_0

    .line 17
    .line 18
    aget-object v3, p2, v2

    .line 19
    .line 20
    const/16 v4, 0x21

    .line 21
    .line 22
    invoke-interface {p0, v3, v0, p1, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
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
.end method

.method private static G(Landroid/text/Editable;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    invoke-interface {p0, p1, v0, v0, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method private static H(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "href"

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lcom/zzhoujay/html/c$l;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/zzhoujay/html/c$l;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
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
.end method

.method private static I(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    if-lez p2, :cond_0

    .line 5
    .line 6
    invoke-static {p0, p2}, Lcom/zzhoujay/html/c;->a(Landroid/text/Editable;I)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/zzhoujay/html/c$p;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Lcom/zzhoujay/html/c$p;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const-string p2, ""

    .line 18
    .line 19
    const-string v0, "style"

    .line 20
    .line 21
    invoke-interface {p1, p2, v0}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_4

    .line 26
    .line 27
    invoke-static {}, Lcom/zzhoujay/html/c;->z()Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x1

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {p2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const-string v0, "start"

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    new-instance p2, Lcom/zzhoujay/html/c$b;

    .line 55
    .line 56
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 57
    .line 58
    invoke-direct {p2, v0}, Lcom/zzhoujay/html/c$b;-><init>(Landroid/text/Layout$Alignment;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string v0, "center"

    .line 66
    .line 67
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    new-instance p2, Lcom/zzhoujay/html/c$b;

    .line 74
    .line 75
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 76
    .line 77
    invoke-direct {p2, v0}, Lcom/zzhoujay/html/c$b;-><init>(Landroid/text/Layout$Alignment;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const-string v0, "end"

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_3

    .line 91
    .line 92
    new-instance p2, Lcom/zzhoujay/html/c$b;

    .line 93
    .line 94
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 95
    .line 96
    invoke-direct {p2, v0}, Lcom/zzhoujay/html/c$b;-><init>(Landroid/text/Layout$Alignment;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_0
    invoke-static {}, Lcom/zzhoujay/html/c;->B()Ljava/util/regex/Pattern;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_4

    .line 115
    .line 116
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    new-instance p2, Lcom/zzhoujay/html/c$m;

    .line 129
    .line 130
    const/4 v0, 0x0

    .line 131
    invoke-direct {p2, p1, v0}, Lcom/zzhoujay/html/c$m;-><init>(ILcom/zzhoujay/html/c$a;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    .line 137
    :catch_0
    :cond_4
    return-void
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
.end method

.method private J(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zzhoujay/html/c;->s()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2, v0}, Lcom/zzhoujay/html/c;->I(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V

    .line 6
    .line 7
    .line 8
    new-instance p2, Lcom/zzhoujay/html/c$e;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p2, v0}, Lcom/zzhoujay/html/c$e;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
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
.end method

.method private K(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "style"

    .line 4
    .line 5
    invoke-interface {p2, v0, v1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_4

    .line 10
    .line 11
    invoke-static {}, Lcom/zzhoujay/html/c;->n()Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, -0x1

    .line 24
    const/4 v3, 0x1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->p(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eq v0, v2, :cond_0

    .line 36
    .line 37
    new-instance v1, Lcom/zzhoujay/html/c$j;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lcom/zzhoujay/html/c$j;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v1}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-static {}, Lcom/zzhoujay/html/c;->m()Ljava/util/regex/Pattern;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->p(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eq v0, v2, :cond_1

    .line 68
    .line 69
    new-instance v1, Lcom/zzhoujay/html/c$c;

    .line 70
    .line 71
    invoke-direct {v1, v0}, Lcom/zzhoujay/html/c$c;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v1}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-static {}, Lcom/zzhoujay/html/c;->A()Ljava/util/regex/Pattern;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {p2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    const/16 v0, 0x3b

    .line 96
    .line 97
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-lez v0, :cond_2

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    :cond_2
    const-string v0, "line-through"

    .line 113
    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/4 v1, 0x0

    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    new-instance p2, Lcom/zzhoujay/html/c$r;

    .line 122
    .line 123
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$r;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    const-string v0, "underline"

    .line 131
    .line 132
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_4

    .line 137
    .line 138
    new-instance p2, Lcom/zzhoujay/html/c$u;

    .line 139
    .line 140
    invoke-direct {p2, v1}, Lcom/zzhoujay/html/c$u;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 141
    .line 142
    .line 143
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_4
    :goto_0
    return-void
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
.end method

.method private L(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V
    .locals 3

    .line 1
    const-string v0, "color"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-interface {p2, v1, v0}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "face"

    .line 10
    .line 11
    invoke-interface {p2, v1, v2}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->p(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, -0x1

    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Lcom/zzhoujay/html/c$j;

    .line 29
    .line 30
    const/high16 v2, -0x1000000

    .line 31
    .line 32
    or-int/2addr v0, v2

    .line 33
    invoke-direct {v1, v0}, Lcom/zzhoujay/html/c$j;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    new-instance v0, Lcom/zzhoujay/html/c$i;

    .line 46
    .line 47
    invoke-direct {v0, p2}, Lcom/zzhoujay/html/c$i;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
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
.end method

.method private M(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zzhoujay/html/c;->u()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2, v0}, Lcom/zzhoujay/html/c;->I(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V

    .line 6
    .line 7
    .line 8
    new-instance p2, Lcom/zzhoujay/html/c$k;

    .line 9
    .line 10
    invoke-direct {p2, p3}, Lcom/zzhoujay/html/c$k;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
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
.end method

.method private static N(Landroid/text/Editable;Lorg/xml/sax/Attributes;Landroid/text/Html$ImageGetter;)V
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "src"

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-interface {p2, p1}, Landroid/text/Html$ImageGetter;->getDrawable(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p2, 0x0

    .line 17
    :goto_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    .line 20
    .line 21
    const v0, -0x333334

    .line 22
    .line 23
    .line 24
    invoke-direct {p2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    const/16 v1, 0x64

    .line 29
    .line 30
    invoke-virtual {p2, v0, v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const-string v1, "\ufffc"

    .line 38
    .line 39
    invoke-interface {p0, v1}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 40
    .line 41
    .line 42
    new-instance v1, Landroid/text/style/ImageSpan;

    .line 43
    .line 44
    invoke-direct {v1, p2, p1}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/16 p2, 0x21

    .line 52
    .line 53
    invoke-interface {p0, v1, v0, p1, p2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 54
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
.end method

.method private O(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zzhoujay/html/c;->w()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2, v0}, Lcom/zzhoujay/html/c;->I(Landroid/text/Editable;Lorg/xml/sax/Attributes;I)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/zzhoujay/html/c$g;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lcom/zzhoujay/html/c$g;-><init>(Lcom/zzhoujay/html/c$a;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lcom/zzhoujay/html/c;->G(Landroid/text/Editable;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1, p2}, Lcom/zzhoujay/html/c;->K(Landroid/text/Editable;Lorg/xml/sax/Attributes;)V

    .line 18
    .line 19
    .line 20
    return-void
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
.end method

.method private static a(Landroid/text/Editable;I)V
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ltz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0xa

    .line 18
    .line 19
    if-ne v2, v3, :cond_1

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    if-ge v1, p1, :cond_2

    .line 27
    .line 28
    const-string v0, "\n"

    .line 29
    .line 30
    invoke-interface {p0, v0}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    return-void
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
.end method

.method private static c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    new-array v0, v0, [Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    aput-object p2, v0, v1

    .line 15
    .line 16
    invoke-static {p0, p1, v0}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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
.end method

.method private static d(Landroid/text/Editable;)V
    .locals 4

    .line 1
    const-class v0, Lcom/zzhoujay/html/c$l;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zzhoujay/html/c$l;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, v0, Lcom/zzhoujay/html/c$l;->a:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v2, Landroid/text/style/URLSpan;

    .line 19
    .line 20
    iget-object v3, v0, Lcom/zzhoujay/html/c$l;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v2, v3}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v2, v1, v3

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
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
.end method

.method private static e(Landroid/text/Editable;)V
    .locals 6

    .line 1
    const-class v0, Lcom/zzhoujay/html/c$p;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zzhoujay/html/c$p;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zzhoujay/html/c$p;->a(Lcom/zzhoujay/html/c$p;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {p0, v1}, Lcom/zzhoujay/html/c;->a(Landroid/text/Editable;I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const-class v0, Lcom/zzhoujay/html/c$m;

    .line 22
    .line 23
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/zzhoujay/html/c$m;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-array v3, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    new-instance v4, Lb3/c;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/zzhoujay/html/c$m;->a(Lcom/zzhoujay/html/c$m;)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-direct {v4, v5}, Lb3/c;-><init>(I)V

    .line 42
    .line 43
    .line 44
    aput-object v4, v3, v1

    .line 45
    .line 46
    invoke-static {p0, v0, v3}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    const-class v0, Lcom/zzhoujay/html/c$b;

    .line 50
    .line 51
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lcom/zzhoujay/html/c$b;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    new-array v2, v2, [Ljava/lang/Object;

    .line 60
    .line 61
    new-instance v3, Landroid/text/style/AlignmentSpan$Standard;

    .line 62
    .line 63
    invoke-static {v0}, Lcom/zzhoujay/html/c$b;->a(Lcom/zzhoujay/html/c$b;)Landroid/text/Layout$Alignment;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-direct {v3, v4}, Landroid/text/style/AlignmentSpan$Standard;-><init>(Landroid/text/Layout$Alignment;)V

    .line 68
    .line 69
    .line 70
    aput-object v3, v2, v1

    .line 71
    .line 72
    invoke-static {p0, v0, v2}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
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
.end method

.method private static f(Landroid/text/Editable;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/zzhoujay/html/c;->e(Landroid/text/Editable;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zzhoujay/html/style/ZQuoteSpan;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zzhoujay/html/style/ZQuoteSpan;-><init>()V

    .line 7
    .line 8
    .line 9
    const-class v1, Lcom/zzhoujay/html/c$e;

    .line 10
    .line 11
    invoke-static {p0, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method private static g(Landroid/text/Editable;)V
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zzhoujay/html/c$h;

    .line 5
    .line 6
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zzhoujay/html/c$h;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0, v0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-interface {p0, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {p0, v0}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lb3/a;

    .line 30
    .line 31
    invoke-direct {v0, v3}, Lb3/a;-><init>(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    const/16 v4, 0x21

    .line 35
    .line 36
    invoke-interface {p0, v0, v1, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroid/text/style/URLSpan;

    .line 40
    .line 41
    new-instance v5, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v6, "code://"

    .line 47
    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-direct {v0, v3}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, v0, v1, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 62
    .line 63
    .line 64
    const-string v0, "${code}\n"

    .line 65
    .line 66
    invoke-interface {p0, v1, v2, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 67
    .line 68
    .line 69
    :cond_0
    return-void
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
.end method

.method private static h(Landroid/text/Editable;)V
    .locals 6

    .line 1
    const-class v0, Lcom/zzhoujay/html/c$u;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zzhoujay/html/c$u;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-array v3, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v4, Landroid/text/style/UnderlineSpan;

    .line 16
    .line 17
    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 18
    .line 19
    .line 20
    aput-object v4, v3, v1

    .line 21
    .line 22
    invoke-static {p0, v0, v3}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const-class v0, Lcom/zzhoujay/html/c$r;

    .line 26
    .line 27
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/zzhoujay/html/c$r;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-array v3, v2, [Ljava/lang/Object;

    .line 36
    .line 37
    new-instance v4, Landroid/text/style/StrikethroughSpan;

    .line 38
    .line 39
    invoke-direct {v4}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 40
    .line 41
    .line 42
    aput-object v4, v3, v1

    .line 43
    .line 44
    invoke-static {p0, v0, v3}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    const-class v0, Lcom/zzhoujay/html/c$c;

    .line 48
    .line 49
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/zzhoujay/html/c$c;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    new-array v3, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    .line 60
    .line 61
    invoke-static {v0}, Lcom/zzhoujay/html/c$c;->a(Lcom/zzhoujay/html/c$c;)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-direct {v4, v5}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 66
    .line 67
    .line 68
    aput-object v4, v3, v1

    .line 69
    .line 70
    invoke-static {p0, v0, v3}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    const-class v0, Lcom/zzhoujay/html/c$j;

    .line 74
    .line 75
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lcom/zzhoujay/html/c$j;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    new-array v2, v2, [Ljava/lang/Object;

    .line 84
    .line 85
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 86
    .line 87
    invoke-static {v0}, Lcom/zzhoujay/html/c$j;->a(Lcom/zzhoujay/html/c$j;)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 92
    .line 93
    .line 94
    aput-object v3, v2, v1

    .line 95
    .line 96
    invoke-static {p0, v0, v2}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    return-void
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
.end method

.method private static i(Landroid/text/Editable;)V
    .locals 6

    .line 1
    const-class v0, Lcom/zzhoujay/html/c$i;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zzhoujay/html/c$i;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-array v3, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v4, Landroid/text/style/TypefaceSpan;

    .line 16
    .line 17
    iget-object v5, v0, Lcom/zzhoujay/html/c$i;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {v4, v5}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    aput-object v4, v3, v1

    .line 23
    .line 24
    invoke-static {p0, v0, v3}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    const-class v0, Lcom/zzhoujay/html/c$j;

    .line 28
    .line 29
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/zzhoujay/html/c$j;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    new-array v2, v2, [Ljava/lang/Object;

    .line 38
    .line 39
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 40
    .line 41
    invoke-static {v0}, Lcom/zzhoujay/html/c$j;->a(Lcom/zzhoujay/html/c$j;)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 46
    .line 47
    .line 48
    aput-object v3, v2, v1

    .line 49
    .line 50
    invoke-static {p0, v0, v2}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
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
.end method

.method private static j(Landroid/text/Editable;)V
    .locals 5

    .line 1
    const-class v0, Lcom/zzhoujay/html/c$k;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/zzhoujay/html/c;->q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zzhoujay/html/c$k;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    .line 15
    .line 16
    sget-object v3, Lcom/zzhoujay/html/c;->j:[F

    .line 17
    .line 18
    invoke-static {v0}, Lcom/zzhoujay/html/c$k;->a(Lcom/zzhoujay/html/c$k;)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    aget v3, v3, v4

    .line 23
    .line 24
    invoke-direct {v2, v3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    aput-object v2, v1, v3

    .line 29
    .line 30
    new-instance v2, Landroid/text/style/StyleSpan;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 34
    .line 35
    .line 36
    aput-object v2, v1, v3

    .line 37
    .line 38
    invoke-static {p0, v0, v1}, Lcom/zzhoujay/html/c;->F(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-static {p0}, Lcom/zzhoujay/html/c;->e(Landroid/text/Editable;)V

    .line 42
    .line 43
    .line 44
    return-void
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
.end method

.method private static k(Landroid/text/Editable;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/zzhoujay/html/c;->h(Landroid/text/Editable;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/zzhoujay/html/c;->e(Landroid/text/Editable;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/zzhoujay/html/style/ZBulletSpan;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/zzhoujay/html/style/ZBulletSpan;-><init>()V

    .line 10
    .line 11
    .line 12
    const-class v1, Lcom/zzhoujay/html/c$g;

    .line 13
    .line 14
    invoke-static {p0, v1, v0}, Lcom/zzhoujay/html/c;->c(Landroid/text/Editable;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
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
.end method

.method private static l()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/html/c;->q:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "^\\s*rgba\\(\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*,\\s*([\\d.]+)\\b"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zzhoujay/html/c;->q:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/zzhoujay/html/c;->q:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static m()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/html/c;->n:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "(?:\\s+|\\A|;\\s*)background(?:-color)?\\s*:\\s*(.*)\\b"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zzhoujay/html/c;->n:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/zzhoujay/html/c;->n:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static n()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/html/c;->m:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "(?:\\s+|\\A|;\\s*)color\\s*:\\s*(.*)\\b"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zzhoujay/html/c;->m:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/zzhoujay/html/c;->m:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static o()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/html/c;->r:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "^\\s*(#[A-Za-z0-9]{6,8})"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zzhoujay/html/c;->r:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/zzhoujay/html/c;->r:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private p(Ljava/lang/String;)I
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-static {}, Lcom/zzhoujay/html/c;->o()Ljava/util/regex/Pattern;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return p1

    .line 25
    :catch_0
    :cond_0
    const/4 v1, 0x3

    .line 26
    const/4 v2, 0x2

    .line 27
    :try_start_1
    invoke-static {}, Lcom/zzhoujay/html/c;->y()Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-static {v4, v5, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 78
    .line 79
    .line 80
    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 81
    return p1

    .line 82
    :catch_1
    :cond_1
    :try_start_2
    invoke-static {}, Lcom/zzhoujay/html/c;->l()Ljava/util/regex/Pattern;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    const/4 v4, 0x4

    .line 133
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    const/high16 v4, 0x437f0000    # 255.0f

    .line 146
    .line 147
    mul-float/2addr v3, v4

    .line 148
    float-to-int v3, v3

    .line 149
    invoke-static {v3, v0, v2, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 150
    .line 151
    .line 152
    move-result p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 153
    return p1

    .line 154
    :catch_2
    :cond_2
    iget v0, p0, Lcom/zzhoujay/html/c;->f:I

    .line 155
    .line 156
    const/16 v1, 0x100

    .line 157
    .line 158
    and-int/2addr v0, v1

    .line 159
    if-ne v0, v1, :cond_3

    .line 160
    .line 161
    sget-object v0, Lcom/zzhoujay/html/c;->k:Ljava/util/Map;

    .line 162
    .line 163
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 164
    .line 165
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Ljava/lang/Integer;

    .line 174
    .line 175
    if-eqz v0, :cond_3

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    return p1

    .line 182
    :cond_3
    invoke-static {p1}, Lcom/zzhoujay/html/d;->b(Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    const/4 v0, -0x1

    .line 187
    if-eq p1, v0, :cond_4

    .line 188
    .line 189
    return p1

    .line 190
    :cond_4
    const/high16 p1, -0x1000000

    .line 191
    .line 192
    return p1
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
.end method

.method private static q(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/text/Spanned;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {p0, v1, v0, p1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    array-length p1, p0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    array-length p1, p0

    .line 16
    add-int/lit8 p1, p1, -0x1

    .line 17
    .line 18
    aget-object p0, p0, p1

    .line 19
    .line 20
    return-object p0
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
.end method

.method private r(I)I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/html/c;->f:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x2

    return p1
.end method

.method private s()I
    .locals 1

    const/16 v0, 0x20

    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->r(I)I

    move-result v0

    return v0
.end method

.method private t()I
    .locals 1

    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->r(I)I

    move-result v0

    return v0
.end method

.method private u()I
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->r(I)I

    move-result v0

    return v0
.end method

.method private v()I
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->r(I)I

    move-result v0

    return v0
.end method

.method private w()I
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->r(I)I

    move-result v0

    return v0
.end method

.method private x()I
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/zzhoujay/html/c;->r(I)I

    move-result v0

    return v0
.end method

.method private static y()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/html/c;->p:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "^\\s*rgb\\(\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\b"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zzhoujay/html/c;->p:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/zzhoujay/html/c;->p:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static z()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/html/c;->l:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "(?:\\s+|\\A|;\\s*)text-align\\s*:\\s*(\\S*)\\b"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/zzhoujay/html/c;->l:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/zzhoujay/html/c;->l:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method b()Landroid/text/Spanned;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/html/c;->b:Lorg/xml/sax/XMLReader;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/zzhoujay/html/c;->b:Lorg/xml/sax/XMLReader;

    .line 7
    .line 8
    new-instance v1, Lorg/xml/sax/InputSource;

    .line 9
    .line 10
    new-instance v2, Ljava/io/StringReader;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/zzhoujay/html/c;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const-class v2, Landroid/text/style/ParagraphStyle;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v0, v3, v1, v2}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    array-length v1, v0

    .line 37
    :goto_0
    if-ge v3, v1, :cond_2

    .line 38
    .line 39
    aget-object v2, v0, v3

    .line 40
    .line 41
    iget-object v4, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 42
    .line 43
    invoke-virtual {v4, v2}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iget-object v5, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 48
    .line 49
    invoke-virtual {v5, v2}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    add-int/lit8 v6, v5, -0x2

    .line 54
    .line 55
    if-ltz v6, :cond_0

    .line 56
    .line 57
    iget-object v7, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 58
    .line 59
    add-int/lit8 v8, v5, -0x1

    .line 60
    .line 61
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const/16 v8, 0xa

    .line 66
    .line 67
    if-ne v7, v8, :cond_0

    .line 68
    .line 69
    iget-object v7, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 70
    .line 71
    invoke-virtual {v7, v6}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-ne v6, v8, :cond_0

    .line 76
    .line 77
    add-int/lit8 v5, v5, -0x1

    .line 78
    .line 79
    :cond_0
    if-ne v5, v4, :cond_1

    .line 80
    .line 81
    iget-object v4, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 82
    .line 83
    invoke-virtual {v4, v2}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    iget-object v6, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 88
    .line 89
    const/16 v7, 0x33

    .line 90
    .line 91
    invoke-virtual {v6, v2, v4, v5, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 92
    .line 93
    .line 94
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iget-object v0, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 98
    .line 99
    return-object v0

    .line 100
    :catch_0
    move-exception v0

    .line 101
    new-instance v1, Ljava/lang/RuntimeException;

    .line 102
    .line 103
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw v1

    .line 107
    :catch_1
    move-exception v0

    .line 108
    new-instance v1, Ljava/lang/RuntimeException;

    .line 109
    .line 110
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    throw v1
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
.end method

.method public characters([CII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/zzhoujay/html/c;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    :goto_0
    if-ge v1, p3, :cond_6

    .line 23
    .line 24
    add-int v2, v1, p2

    .line 25
    .line 26
    aget-char v2, p1, v2

    .line 27
    .line 28
    const/16 v3, 0xa

    .line 29
    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    if-eq v2, v4, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_4

    .line 46
    .line 47
    iget-object v2, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    move v2, v3

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    iget-object v5, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 58
    .line 59
    add-int/lit8 v2, v2, -0x1

    .line 60
    .line 61
    invoke-virtual {v5, v2}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    :goto_2
    if-eq v2, v4, :cond_5

    .line 73
    .line 74
    if-eq v2, v3, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    :cond_5
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    iget-object p1, p0, Lcom/zzhoujay/html/c;->c:Landroid/text/SpannableStringBuilder;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 85
    .line 86
    .line 87
    return-void
    .line 88
    .line 89
    .line 90
.end method

.method public endDocument()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/zzhoujay/html/c;->D(Ljava/lang/String;)V

    return-void
.end method

.method public endPrefixMapping(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public ignorableWhitespace([CII)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public processingInstruction(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public setDocumentLocator(Lorg/xml/sax/Locator;)V
    .locals 0

    return-void
.end method

.method public skippedEntity(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public startDocument()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    invoke-direct {p0, p2, p4}, Lcom/zzhoujay/html/c;->E(Ljava/lang/String;Lorg/xml/sax/Attributes;)V

    return-void
.end method

.method public startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method
