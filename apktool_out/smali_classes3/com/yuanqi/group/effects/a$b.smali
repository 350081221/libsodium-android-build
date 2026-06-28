.class Lcom/yuanqi/group/effects/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/effects/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field a:F

.field b:I

.field c:F

.field d:F

.field e:F

.field f:F

.field g:F

.field h:F

.field i:F

.field j:F

.field k:F

.field l:F

.field m:F

.field n:F

.field final synthetic o:Lcom/yuanqi/group/effects/a;


# direct methods
.method private constructor <init>(Lcom/yuanqi/group/effects/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/effects/a$b;->o:Lcom/yuanqi/group/effects/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/yuanqi/group/effects/a;Lcom/yuanqi/group/effects/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/yuanqi/group/effects/a$b;-><init>(Lcom/yuanqi/group/effects/a;)V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 9

    .line 1
    const v0, 0x3fb33333    # 1.4f

    .line 2
    .line 3
    .line 4
    div-float/2addr p1, v0

    .line 5
    iget v1, p0, Lcom/yuanqi/group/effects/a$b;->m:F

    .line 6
    .line 7
    cmpg-float v2, p1, v1

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-ltz v2, :cond_2

    .line 11
    .line 12
    iget v2, p0, Lcom/yuanqi/group/effects/a$b;->n:F

    .line 13
    .line 14
    const/high16 v4, 0x3f800000    # 1.0f

    .line 15
    .line 16
    sub-float v5, v4, v2

    .line 17
    .line 18
    cmpl-float v5, p1, v5

    .line 19
    .line 20
    if-lez v5, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sub-float/2addr p1, v1

    .line 24
    sub-float v1, v4, v1

    .line 25
    .line 26
    sub-float/2addr v1, v2

    .line 27
    div-float/2addr p1, v1

    .line 28
    mul-float/2addr v0, p1

    .line 29
    const v1, 0x3f333333    # 0.7f

    .line 30
    .line 31
    .line 32
    cmpl-float v2, p1, v1

    .line 33
    .line 34
    if-ltz v2, :cond_1

    .line 35
    .line 36
    sub-float/2addr p1, v1

    .line 37
    const v1, 0x3e99999a    # 0.3f

    .line 38
    .line 39
    .line 40
    div-float v3, p1, v1

    .line 41
    .line 42
    :cond_1
    sub-float/2addr v4, v3

    .line 43
    iput v4, p0, Lcom/yuanqi/group/effects/a$b;->a:F

    .line 44
    .line 45
    iget p1, p0, Lcom/yuanqi/group/effects/a$b;->j:F

    .line 46
    .line 47
    mul-float/2addr p1, v0

    .line 48
    iget v1, p0, Lcom/yuanqi/group/effects/a$b;->f:F

    .line 49
    .line 50
    add-float/2addr v1, p1

    .line 51
    iput v1, p0, Lcom/yuanqi/group/effects/a$b;->c:F

    .line 52
    .line 53
    iget v1, p0, Lcom/yuanqi/group/effects/a$b;->g:F

    .line 54
    .line 55
    float-to-double v1, v1

    .line 56
    iget v3, p0, Lcom/yuanqi/group/effects/a$b;->l:F

    .line 57
    .line 58
    float-to-double v3, v3

    .line 59
    float-to-double v5, p1

    .line 60
    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 61
    .line 62
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    mul-double/2addr v3, v5

    .line 67
    sub-double/2addr v1, v3

    .line 68
    double-to-float v1, v1

    .line 69
    iget v2, p0, Lcom/yuanqi/group/effects/a$b;->k:F

    .line 70
    .line 71
    mul-float/2addr p1, v2

    .line 72
    sub-float/2addr v1, p1

    .line 73
    iput v1, p0, Lcom/yuanqi/group/effects/a$b;->d:F

    .line 74
    .line 75
    invoke-static {}, Lcom/yuanqi/group/effects/a;->a()F

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iget v1, p0, Lcom/yuanqi/group/effects/a$b;->h:F

    .line 80
    .line 81
    invoke-static {}, Lcom/yuanqi/group/effects/a;->a()F

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    sub-float/2addr v1, v2

    .line 86
    mul-float/2addr v1, v0

    .line 87
    add-float/2addr p1, v1

    .line 88
    iput p1, p0, Lcom/yuanqi/group/effects/a$b;->e:F

    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    :goto_0
    iput v3, p0, Lcom/yuanqi/group/effects/a$b;->a:F

    .line 92
    .line 93
    return-void
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
.end method
