.class public Lorg/osmdroid/views/overlay/simplefastpoint/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/simplefastpoint/a$b;,
        Lorg/osmdroid/views/overlay/simplefastpoint/a$c;,
        Lorg/osmdroid/views/overlay/simplefastpoint/a$a;
    }
.end annotation


# instance fields
.field protected a:Landroid/graphics/Paint;

.field protected b:Landroid/graphics/Paint;

.field protected c:Landroid/graphics/Paint;

.field protected d:F

.field protected e:F

.field protected f:Z

.field protected g:I

.field protected h:Lorg/osmdroid/views/overlay/simplefastpoint/a$b;

.field protected i:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

.field protected j:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

.field protected k:I

.field protected l:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x40a00000    # 5.0f

    .line 5
    .line 6
    iput v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->d:F

    .line 7
    .line 8
    const/high16 v1, 0x41500000    # 13.0f

    .line 9
    .line 10
    iput v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->e:F

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->f:Z

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    iput v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    .line 18
    .line 19
    sget-object v1, Lorg/osmdroid/views/overlay/simplefastpoint/a$b;->MAXIMUM_OPTIMIZATION:Lorg/osmdroid/views/overlay/simplefastpoint/a$b;

    .line 20
    .line 21
    iput-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->h:Lorg/osmdroid/views/overlay/simplefastpoint/a$b;

    .line 22
    .line 23
    sget-object v1, Lorg/osmdroid/views/overlay/simplefastpoint/a$c;->SQUARE:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

    .line 24
    .line 25
    iput-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->i:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

    .line 26
    .line 27
    sget-object v1, Lorg/osmdroid/views/overlay/simplefastpoint/a$a;->ZOOM_THRESHOLD:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    .line 28
    .line 29
    iput-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->j:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    .line 30
    .line 31
    const/16 v1, 0xfa

    .line 32
    .line 33
    iput v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->k:I

    .line 34
    .line 35
    const/16 v1, 0xb

    .line 36
    .line 37
    iput v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->l:I

    .line 38
    .line 39
    new-instance v1, Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->a:Landroid/graphics/Paint;

    .line 45
    .line 46
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->a:Landroid/graphics/Paint;

    .line 52
    .line 53
    const-string v2, "#ff7700"

    .line 54
    .line 55
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->b:Landroid/graphics/Paint;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->b:Landroid/graphics/Paint;

    .line 73
    .line 74
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->b:Landroid/graphics/Paint;

    .line 80
    .line 81
    const-string v1, "#ffff00"

    .line 82
    .line 83
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Landroid/graphics/Paint;

    .line 91
    .line 92
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    .line 96
    .line 97
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    .line 103
    .line 104
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    .line 112
    .line 113
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    .line 119
    .line 120
    const/high16 v1, 0x41c00000    # 24.0f

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 123
    .line 124
    .line 125
    return-void
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
.end method

.method public static d()Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 1

    new-instance v0, Lorg/osmdroid/views/overlay/simplefastpoint/a;

    invoke-direct {v0}, Lorg/osmdroid/views/overlay/simplefastpoint/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lorg/osmdroid/views/overlay/simplefastpoint/a$b;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->h:Lorg/osmdroid/views/overlay/simplefastpoint/a$b;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->d:F

    return v0
.end method

.method public e()Lorg/osmdroid/views/overlay/simplefastpoint/a$a;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->j:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->k:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->l:I

    return v0
.end method

.method public h()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->a:Landroid/graphics/Paint;

    return-object v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->e:F

    return v0
.end method

.method public j()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->b:Landroid/graphics/Paint;

    return-object v0
.end method

.method public k()Lorg/osmdroid/views/overlay/simplefastpoint/a$c;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->i:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

    return-object v0
.end method

.method public l()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->f:Z

    return v0
.end method

.method public n(Lorg/osmdroid/views/overlay/simplefastpoint/a$b;)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->h:Lorg/osmdroid/views/overlay/simplefastpoint/a$b;

    return-object p0
.end method

.method public o(I)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->g:I

    return-object p0
.end method

.method public p(Z)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->f:Z

    return-object p0
.end method

.method public q(Lorg/osmdroid/views/overlay/simplefastpoint/a$a;)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->j:Lorg/osmdroid/views/overlay/simplefastpoint/a$a;

    return-object p0
.end method

.method public r(I)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->k:I

    return-object p0
.end method

.method public s(I)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->l:I

    return-object p0
.end method

.method public t(Landroid/graphics/Paint;)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->a:Landroid/graphics/Paint;

    return-object p0
.end method

.method public u(F)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->d:F

    return-object p0
.end method

.method public v(Landroid/graphics/Paint;)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->b:Landroid/graphics/Paint;

    return-object p0
.end method

.method public w(F)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->e:F

    return-object p0
.end method

.method public x(Lorg/osmdroid/views/overlay/simplefastpoint/a$c;)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->i:Lorg/osmdroid/views/overlay/simplefastpoint/a$c;

    return-object p0
.end method

.method public y(Landroid/graphics/Paint;)Lorg/osmdroid/views/overlay/simplefastpoint/a;
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/simplefastpoint/a;->c:Landroid/graphics/Paint;

    return-object p0
.end method
