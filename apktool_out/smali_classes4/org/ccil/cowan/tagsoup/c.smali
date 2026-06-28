.class public Lorg/ccil/cowan/tagsoup/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Ljava/util/Hashtable;

.field private static b:Lorg/ccil/cowan/tagsoup/l;

.field private static c:Lorg/ccil/cowan/tagsoup/h;

.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/Hashtable;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    const-string v2, "--nocdata"

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 16
    .line 17
    const-string v2, "--files"

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 23
    .line 24
    const-string v2, "--reuse"

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 30
    .line 31
    const-string v2, "--nons"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 37
    .line 38
    const-string v2, "--nobogons"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 44
    .line 45
    const-string v2, "--any"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 51
    .line 52
    const-string v2, "--emptybogons"

    .line 53
    .line 54
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 58
    .line 59
    const-string v2, "--norootbogons"

    .line 60
    .line 61
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 65
    .line 66
    const-string v2, "--pyxin"

    .line 67
    .line 68
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 72
    .line 73
    const-string v2, "--lexical"

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 79
    .line 80
    const-string v2, "--pyx"

    .line 81
    .line 82
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 86
    .line 87
    const-string v2, "--html"

    .line 88
    .line 89
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 93
    .line 94
    const-string v2, "--method="

    .line 95
    .line 96
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 100
    .line 101
    const-string v2, "--doctype-public="

    .line 102
    .line 103
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 107
    .line 108
    const-string v2, "--doctype-system="

    .line 109
    .line 110
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 114
    .line 115
    const-string v2, "--output-encoding="

    .line 116
    .line 117
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 121
    .line 122
    const-string v2, "--omit-xml-declaration"

    .line 123
    .line 124
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 128
    .line 129
    const-string v2, "--encoding="

    .line 130
    .line 131
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 135
    .line 136
    const-string v2, "--help"

    .line 137
    .line 138
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 142
    .line 143
    const-string v2, "--version"

    .line 144
    .line 145
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 149
    .line 150
    const-string v2, "--nodefaults"

    .line 151
    .line 152
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 156
    .line 157
    const-string v2, "--nocolons"

    .line 158
    .line 159
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 163
    .line 164
    const-string v2, "--norestart"

    .line 165
    .line 166
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 170
    .line 171
    const-string v2, "--ignorable"

    .line 172
    .line 173
    invoke-virtual {v0, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    const/4 v0, 0x0

    .line 177
    sput-object v0, Lorg/ccil/cowan/tagsoup/c;->b:Lorg/ccil/cowan/tagsoup/l;

    .line 178
    .line 179
    sput-object v0, Lorg/ccil/cowan/tagsoup/c;->c:Lorg/ccil/cowan/tagsoup/h;

    .line 180
    .line 181
    sput-object v0, Lorg/ccil/cowan/tagsoup/c;->d:Ljava/lang/String;

    .line 182
    .line 183
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/io/Writer;)Lorg/xml/sax/ContentHandler;
    .locals 5

    .line 1
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 2
    .line 3
    const-string v1, "--pyx"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lorg/ccil/cowan/tagsoup/j;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lorg/ccil/cowan/tagsoup/j;-><init>(Ljava/io/Writer;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Lorg/ccil/cowan/tagsoup/p;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lorg/ccil/cowan/tagsoup/p;-><init>(Ljava/io/Writer;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 23
    .line 24
    const-string v1, "--html"

    .line 25
    .line 26
    invoke-static {p0, v1}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const-string v1, "yes"

    .line 31
    .line 32
    const-string v2, "omit-xml-declaration"

    .line 33
    .line 34
    const-string v3, "method"

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    const-string p0, "html"

    .line 39
    .line 40
    invoke-virtual {v0, v3, p0}, Lorg/ccil/cowan/tagsoup/p;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2, v1}, Lorg/ccil/cowan/tagsoup/p;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 47
    .line 48
    const-string v4, "--method="

    .line 49
    .line 50
    invoke-static {p0, v4}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 57
    .line 58
    invoke-virtual {p0, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0, v3, p0}, Lorg/ccil/cowan/tagsoup/p;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 70
    .line 71
    const-string v3, "--doctype-public="

    .line 72
    .line 73
    invoke-static {p0, v3}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 80
    .line 81
    invoke-virtual {p0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Ljava/lang/String;

    .line 86
    .line 87
    if-eqz p0, :cond_3

    .line 88
    .line 89
    const-string v3, "doctype-public"

    .line 90
    .line 91
    invoke-virtual {v0, v3, p0}, Lorg/ccil/cowan/tagsoup/p;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 95
    .line 96
    const-string v3, "--doctype-system="

    .line 97
    .line 98
    invoke-static {p0, v3}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_4

    .line 103
    .line 104
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 105
    .line 106
    invoke-virtual {p0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ljava/lang/String;

    .line 111
    .line 112
    if-eqz p0, :cond_4

    .line 113
    .line 114
    const-string v3, "doctype-system"

    .line 115
    .line 116
    invoke-virtual {v0, v3, p0}, Lorg/ccil/cowan/tagsoup/p;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 120
    .line 121
    const-string v3, "--output-encoding="

    .line 122
    .line 123
    invoke-static {p0, v3}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-eqz p0, :cond_5

    .line 128
    .line 129
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 130
    .line 131
    invoke-virtual {p0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Ljava/lang/String;

    .line 136
    .line 137
    sput-object p0, Lorg/ccil/cowan/tagsoup/c;->d:Ljava/lang/String;

    .line 138
    .line 139
    if-eqz p0, :cond_5

    .line 140
    .line 141
    const-string v3, "encoding"

    .line 142
    .line 143
    invoke-virtual {v0, v3, p0}, Lorg/ccil/cowan/tagsoup/p;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 147
    .line 148
    const-string v3, "--omit-xml-declaration"

    .line 149
    .line 150
    invoke-static {p0, v3}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_6

    .line 155
    .line 156
    invoke-virtual {v0, v2, v1}, Lorg/ccil/cowan/tagsoup/p;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_6
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->c:Lorg/ccil/cowan/tagsoup/h;

    .line 160
    .line 161
    invoke-virtual {p0}, Lorg/ccil/cowan/tagsoup/o;->g()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    const-string v1, ""

    .line 166
    .line 167
    invoke-virtual {v0, p0, v1}, Lorg/ccil/cowan/tagsoup/p;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object v0
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
.end method

.method private static b()V
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v1, "usage: java -jar tagsoup-*.jar "

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 9
    .line 10
    const-string v1, " [ "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 31
    .line 32
    const-string v2, "| "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v2, "="

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 57
    .line 58
    const-string v2, "?"

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 64
    .line 65
    const-string v2, " "

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 73
    .line 74
    const-string v1, "]*"

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
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
.end method

.method private static c(Ljava/util/Hashtable;[Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_4

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/16 v4, 0x2d

    .line 13
    .line 14
    if-eq v3, v4, :cond_0

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_0
    const/16 v3, 0x3d

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, -0x1

    .line 24
    if-eq v3, v4, :cond_1

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v2, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v4, 0x0

    .line 42
    :goto_1
    invoke-virtual {p0, v2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    if-nez v4, :cond_2

    .line 49
    .line 50
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-virtual {p0, v2, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 61
    .line 62
    const-string v4, "Unknown option "

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    .line 74
    .line 75
    .line 76
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    :goto_3
    return v1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static d(Ljava/util/Hashtable;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    if-eq p0, p1, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
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
.end method

.method public static e([Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lorg/ccil/cowan/tagsoup/c;->c(Ljava/util/Hashtable;[Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 8
    .line 9
    const-string v2, "--help"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lorg/ccil/cowan/tagsoup/c;->b()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 22
    .line 23
    const-string v2, "--version"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 32
    .line 33
    const-string v0, "TagSoup version 1.2.1"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    array-length v1, p0

    .line 40
    if-ne v1, v0, :cond_2

    .line 41
    .line 42
    const-string p0, ""

    .line 43
    .line 44
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 45
    .line 46
    invoke-static {p0, v0}, Lorg/ccil/cowan/tagsoup/c;->f(Ljava/lang/String;Ljava/io/OutputStream;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_2
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 52
    .line 53
    const-string v2, "--files"

    .line 54
    .line 55
    invoke-static {v1, v2}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const-string v2, "src: "

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    :goto_0
    array-length v1, p0

    .line 64
    if-ge v0, v1, :cond_6

    .line 65
    .line 66
    aget-object v1, p0, v0

    .line 67
    .line 68
    const/16 v3, 0x2e

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    const/4 v4, -0x1

    .line 75
    const-string v5, ".xhtml"

    .line 76
    .line 77
    if-ne v3, v4, :cond_3

    .line 78
    .line 79
    new-instance v3, Ljava/lang/StringBuffer;

    .line 80
    .line 81
    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_4

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuffer;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 107
    .line 108
    .line 109
    const-string v4, "_"

    .line 110
    .line 111
    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    goto :goto_1

    .line 119
    :cond_4
    new-instance v4, Ljava/lang/StringBuffer;

    .line 120
    .line 121
    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 122
    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    invoke-virtual {v1, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :goto_1
    sget-object v4, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 140
    .line 141
    new-instance v5, Ljava/lang/StringBuffer;

    .line 142
    .line 143
    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 150
    .line 151
    .line 152
    const-string v6, " dst: "

    .line 153
    .line 154
    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v4, Ljava/io/FileOutputStream;

    .line 168
    .line 169
    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v4}, Lorg/ccil/cowan/tagsoup/c;->f(Ljava/lang/String;Ljava/io/OutputStream;)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v0, v0, 0x1

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_5
    :goto_2
    array-length v1, p0

    .line 179
    if-ge v0, v1, :cond_6

    .line 180
    .line 181
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 182
    .line 183
    new-instance v3, Ljava/lang/StringBuffer;

    .line 184
    .line 185
    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 189
    .line 190
    .line 191
    aget-object v4, p0, v0

    .line 192
    .line 193
    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    aget-object v1, p0, v0

    .line 204
    .line 205
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 206
    .line 207
    invoke-static {v1, v3}, Lorg/ccil/cowan/tagsoup/c;->f(Ljava/lang/String;Ljava/io/OutputStream;)V

    .line 208
    .line 209
    .line 210
    add-int/lit8 v0, v0, 0x1

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_6
    :goto_3
    return-void
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
.end method

.method private static f(Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 2
    .line 3
    const-string v1, "--reuse"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->b:Lorg/ccil/cowan/tagsoup/l;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lorg/ccil/cowan/tagsoup/l;

    .line 16
    .line 17
    invoke-direct {v0}, Lorg/ccil/cowan/tagsoup/l;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lorg/ccil/cowan/tagsoup/c;->b:Lorg/ccil/cowan/tagsoup/l;

    .line 21
    .line 22
    :cond_0
    sget-object v0, Lorg/ccil/cowan/tagsoup/c;->b:Lorg/ccil/cowan/tagsoup/l;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v0, Lorg/ccil/cowan/tagsoup/l;

    .line 26
    .line 27
    invoke-direct {v0}, Lorg/ccil/cowan/tagsoup/l;-><init>()V

    .line 28
    .line 29
    .line 30
    :goto_0
    new-instance v1, Lorg/ccil/cowan/tagsoup/h;

    .line 31
    .line 32
    invoke-direct {v1}, Lorg/ccil/cowan/tagsoup/h;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lorg/ccil/cowan/tagsoup/c;->c:Lorg/ccil/cowan/tagsoup/h;

    .line 36
    .line 37
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/properties/schema"

    .line 38
    .line 39
    invoke-interface {v0, v2, v1}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 43
    .line 44
    const-string v2, "--nocdata"

    .line 45
    .line 46
    invoke-static {v1, v2}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    const-string v1, "http://www.ccil.org/~cowan/tagsoup/features/cdata-elements"

    .line 54
    .line 55
    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    :cond_2
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 59
    .line 60
    const-string v3, "--nons"

    .line 61
    .line 62
    invoke-static {v1, v3}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 69
    .line 70
    const-string v3, "--html"

    .line 71
    .line 72
    invoke-static {v1, v3}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    :cond_3
    const-string v1, "http://xml.org/sax/features/namespaces"

    .line 79
    .line 80
    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    :cond_4
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 84
    .line 85
    const-string v3, "--nobogons"

    .line 86
    .line 87
    invoke-static {v1, v3}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const/4 v3, 0x1

    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    const-string v1, "http://www.ccil.org/~cowan/tagsoup/features/ignore-bogons"

    .line 95
    .line 96
    invoke-interface {v0, v1, v3}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    :cond_5
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 100
    .line 101
    const-string v4, "--any"

    .line 102
    .line 103
    invoke-static {v1, v4}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const-string v4, "http://www.ccil.org/~cowan/tagsoup/features/bogons-empty"

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-interface {v0, v4, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 116
    .line 117
    const-string v5, "--emptybogons"

    .line 118
    .line 119
    invoke-static {v1, v5}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    invoke-interface {v0, v4, v3}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    :cond_7
    :goto_1
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 129
    .line 130
    const-string v4, "--norootbogons"

    .line 131
    .line 132
    invoke-static {v1, v4}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_8

    .line 137
    .line 138
    const-string v1, "http://www.ccil.org/~cowan/tagsoup/features/root-bogons"

    .line 139
    .line 140
    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 141
    .line 142
    .line 143
    :cond_8
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 144
    .line 145
    const-string v4, "--nodefaults"

    .line 146
    .line 147
    invoke-static {v1, v4}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_9

    .line 152
    .line 153
    const-string v1, "http://www.ccil.org/~cowan/tagsoup/features/default-attributes"

    .line 154
    .line 155
    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 156
    .line 157
    .line 158
    :cond_9
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 159
    .line 160
    const-string v4, "--nocolons"

    .line 161
    .line 162
    invoke-static {v1, v4}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_a

    .line 167
    .line 168
    const-string v1, "http://www.ccil.org/~cowan/tagsoup/features/translate-colons"

    .line 169
    .line 170
    invoke-interface {v0, v1, v3}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 171
    .line 172
    .line 173
    :cond_a
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 174
    .line 175
    const-string v4, "--norestart"

    .line 176
    .line 177
    invoke-static {v1, v4}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_b

    .line 182
    .line 183
    const-string v1, "http://www.ccil.org/~cowan/tagsoup/features/restart-elements"

    .line 184
    .line 185
    invoke-interface {v0, v1, v2}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 186
    .line 187
    .line 188
    :cond_b
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 189
    .line 190
    const-string v2, "--ignorable"

    .line 191
    .line 192
    invoke-static {v1, v2}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_c

    .line 197
    .line 198
    const-string v1, "http://www.ccil.org/~cowan/tagsoup/features/ignorable-whitespace"

    .line 199
    .line 200
    invoke-interface {v0, v1, v3}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 201
    .line 202
    .line 203
    :cond_c
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 204
    .line 205
    const-string v2, "--pyxin"

    .line 206
    .line 207
    invoke-static {v1, v2}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_d

    .line 212
    .line 213
    new-instance v1, Lorg/ccil/cowan/tagsoup/i;

    .line 214
    .line 215
    invoke-direct {v1}, Lorg/ccil/cowan/tagsoup/i;-><init>()V

    .line 216
    .line 217
    .line 218
    const-string v2, "http://www.ccil.org/~cowan/tagsoup/properties/scanner"

    .line 219
    .line 220
    invoke-interface {v0, v2, v1}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_d
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->d:Ljava/lang/String;

    .line 224
    .line 225
    if-nez v1, :cond_e

    .line 226
    .line 227
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 228
    .line 229
    invoke-direct {v1, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_e
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 234
    .line 235
    sget-object v2, Lorg/ccil/cowan/tagsoup/c;->d:Ljava/lang/String;

    .line 236
    .line 237
    invoke-direct {v1, p1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :goto_2
    invoke-static {v1}, Lorg/ccil/cowan/tagsoup/c;->a(Ljava/io/Writer;)Lorg/xml/sax/ContentHandler;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-interface {v0, p1}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    .line 245
    .line 246
    .line 247
    sget-object v1, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 248
    .line 249
    const-string v2, "--lexical"

    .line 250
    .line 251
    invoke-static {v1, v2}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_f

    .line 256
    .line 257
    instance-of v1, p1, Lorg/xml/sax/ext/LexicalHandler;

    .line 258
    .line 259
    if-eqz v1, :cond_f

    .line 260
    .line 261
    const-string v1, "http://xml.org/sax/properties/lexical-handler"

    .line 262
    .line 263
    invoke-interface {v0, v1, p1}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_f
    new-instance p1, Lorg/xml/sax/InputSource;

    .line 267
    .line 268
    invoke-direct {p1}, Lorg/xml/sax/InputSource;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string v1, ""

    .line 272
    .line 273
    if-eq p0, v1, :cond_10

    .line 274
    .line 275
    invoke-virtual {p1, p0}, Lorg/xml/sax/InputSource;->setSystemId(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_10
    sget-object p0, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 280
    .line 281
    invoke-virtual {p1, p0}, Lorg/xml/sax/InputSource;->setByteStream(Ljava/io/InputStream;)V

    .line 282
    .line 283
    .line 284
    :goto_3
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 285
    .line 286
    const-string v1, "--encoding="

    .line 287
    .line 288
    invoke-static {p0, v1}, Lorg/ccil/cowan/tagsoup/c;->d(Ljava/util/Hashtable;Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    if-eqz p0, :cond_11

    .line 293
    .line 294
    sget-object p0, Lorg/ccil/cowan/tagsoup/c;->a:Ljava/util/Hashtable;

    .line 295
    .line 296
    invoke-virtual {p0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    check-cast p0, Ljava/lang/String;

    .line 301
    .line 302
    if-eqz p0, :cond_11

    .line 303
    .line 304
    invoke-virtual {p1, p0}, Lorg/xml/sax/InputSource;->setEncoding(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    :cond_11
    invoke-interface {v0, p1}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V

    .line 308
    .line 309
    .line 310
    return-void
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
.end method
