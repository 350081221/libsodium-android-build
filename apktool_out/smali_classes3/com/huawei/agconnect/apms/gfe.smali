.class public Lcom/huawei/agconnect/apms/gfe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final abc:Ljava/lang/Object;

.field public bcd:J

.field public cde:Ljava/lang/String;

.field public def:Ljava/lang/String;

.field public efg:Ljava/lang/String;

.field public fgh:Ljava/lang/String;

.field public ghi:J

.field public hij:Ljava/lang/String;

.field public ijk:Ljava/lang/String;

.field public jkl:I

.field public klm:J

.field public lmn:I

.field public mno:I

.field public nop:I

.field public opq:I

.field public pqr:I

.field public qrs:J

.field public rst:I

.field public stu:I

.field public tsr:Ljava/lang/String;

.field public tuv:I

.field public uts:Lorg/json/JSONArray;

.field public uvw:I

.field public vut:I

.field public vwx:J

.field public wvu:Ljava/lang/String;

.field public wxy:I

.field public xwv:Ljava/lang/String;

.field public xyz:I

.field public yxw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/p;",
            ">;"
        }
    .end annotation
.end field

.field public yza:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/huawei/agconnect/apms/o;",
            ">;"
        }
    .end annotation
.end field

.field public zab:I

.field public zyx:I


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/fed;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->abc:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->bcd:Ljava/lang/String;

    .line 12
    .line 13
    const/16 v1, 0x3f

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gez v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x3b

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-gez v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->def()Lcom/huawei/agconnect/apms/o;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/huawei/agconnect/apms/o;->abc()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    iget v2, p1, Lcom/huawei/agconnect/apms/fed;->yxw:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    iput v2, p1, Lcom/huawei/agconnect/apms/fed;->yxw:I

    .line 50
    .line 51
    :cond_1
    iget v2, p1, Lcom/huawei/agconnect/apms/fed;->tsr:I

    .line 52
    .line 53
    add-int/lit8 v2, v2, -0x1

    .line 54
    .line 55
    iget v3, p1, Lcom/huawei/agconnect/apms/fed;->uts:I

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    if-ne v2, v3, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iget-object v2, p1, Lcom/huawei/agconnect/apms/fed;->srq:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move v3, v4

    .line 68
    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Lcom/huawei/agconnect/apms/p;

    .line 79
    .line 80
    if-nez v5, :cond_4

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    iget-boolean v5, v5, Lcom/huawei/agconnect/apms/p;->jkl:Z

    .line 84
    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    iput v3, p1, Lcom/huawei/agconnect/apms/fed;->uts:I

    .line 91
    .line 92
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->abc()V

    .line 93
    .line 94
    .line 95
    iget-object v2, p1, Lcom/huawei/agconnect/apms/fed;->hij:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_6

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->abc()V

    .line 104
    .line 105
    .line 106
    :cond_6
    iget-object v2, p1, Lcom/huawei/agconnect/apms/fed;->ijk:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_8

    .line 113
    .line 114
    iget-object v2, p1, Lcom/huawei/agconnect/apms/fed;->hij:Ljava/lang/String;

    .line 115
    .line 116
    sget-object v3, Lcom/huawei/agconnect/apms/edc;->bcd:Ljava/util/concurrent/ConcurrentHashMap;

    .line 117
    .line 118
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/lang/String;

    .line 123
    .line 124
    if-nez v2, :cond_7

    .line 125
    .line 126
    const-string v2, ""

    .line 127
    .line 128
    :cond_7
    iput-object v2, p1, Lcom/huawei/agconnect/apms/fed;->ijk:Ljava/lang/String;

    .line 129
    .line 130
    :cond_8
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->cde:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->cde:Ljava/lang/String;

    .line 137
    .line 138
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->def:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->def:Ljava/lang/String;

    .line 141
    .line 142
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->efg:Ljava/lang/String;

    .line 143
    .line 144
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->efg:Ljava/lang/String;

    .line 145
    .line 146
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->fgh:Ljava/lang/String;

    .line 147
    .line 148
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/fed;->fgh:J

    .line 149
    .line 150
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/gfe;->ghi:J

    .line 151
    .line 152
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/fed;->xyz:J

    .line 153
    .line 154
    const-wide/16 v2, -0x1

    .line 155
    .line 156
    cmp-long v4, v0, v2

    .line 157
    .line 158
    if-nez v4, :cond_9

    .line 159
    .line 160
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/fed;->klm:J

    .line 161
    .line 162
    :cond_9
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/gfe;->bcd:J

    .line 163
    .line 164
    iget-wide v4, p1, Lcom/huawei/agconnect/apms/fed;->lmn:J

    .line 165
    .line 166
    cmp-long v6, v4, v0

    .line 167
    .line 168
    if-lez v6, :cond_a

    .line 169
    .line 170
    sub-long/2addr v4, v0

    .line 171
    long-to-int v0, v4

    .line 172
    int-to-long v2, v0

    .line 173
    :cond_a
    iput-wide v2, p0, Lcom/huawei/agconnect/apms/gfe;->klm:J

    .line 174
    .line 175
    iget-boolean v0, p1, Lcom/huawei/agconnect/apms/fed;->mlk:Z

    .line 176
    .line 177
    if-eqz v0, :cond_d

    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->def()Lcom/huawei/agconnect/apms/o;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-nez v0, :cond_b

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_b
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/o;->abc()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_c

    .line 191
    .line 192
    :goto_2
    const-wide/16 v0, 0x0

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_c
    iget v1, v0, Lcom/huawei/agconnect/apms/o;->cde:I

    .line 196
    .line 197
    iget v0, v0, Lcom/huawei/agconnect/apms/o;->bcd:I

    .line 198
    .line 199
    sub-int/2addr v1, v0

    .line 200
    int-to-long v0, v1

    .line 201
    :goto_3
    add-long/2addr v2, v0

    .line 202
    iput-wide v2, p0, Lcom/huawei/agconnect/apms/gfe;->klm:J

    .line 203
    .line 204
    :cond_d
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->jkl:I

    .line 205
    .line 206
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->jkl:I

    .line 207
    .line 208
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->rqp:Ljava/lang/String;

    .line 209
    .line 210
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->xwv:Ljava/lang/String;

    .line 211
    .line 212
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/fed;->qrs:J

    .line 213
    .line 214
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/gfe;->qrs:J

    .line 215
    .line 216
    iget-wide v0, p1, Lcom/huawei/agconnect/apms/fed;->vwx:J

    .line 217
    .line 218
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/gfe;->vwx:J

    .line 219
    .line 220
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->hij:Ljava/lang/String;

    .line 221
    .line 222
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->hij:Ljava/lang/String;

    .line 223
    .line 224
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->wxy:I

    .line 225
    .line 226
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->lmn:I

    .line 227
    .line 228
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->ijk:Ljava/lang/String;

    .line 229
    .line 230
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->ijk:Ljava/lang/String;

    .line 231
    .line 232
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->wvu:Ljava/util/List;

    .line 233
    .line 234
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->yza:Ljava/util/List;

    .line 235
    .line 236
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->yxw:I

    .line 237
    .line 238
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->wxy:I

    .line 239
    .line 240
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->xwv:I

    .line 241
    .line 242
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->xyz:I

    .line 243
    .line 244
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->srq:Ljava/util/List;

    .line 245
    .line 246
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->yxw:Ljava/util/List;

    .line 247
    .line 248
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->uts:I

    .line 249
    .line 250
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->zab:I

    .line 251
    .line 252
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->tsr:I

    .line 253
    .line 254
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->zyx:I

    .line 255
    .line 256
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->mno:I

    .line 257
    .line 258
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->mno:I

    .line 259
    .line 260
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->nop:I

    .line 261
    .line 262
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->nop:I

    .line 263
    .line 264
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->opq:I

    .line 265
    .line 266
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->opq:I

    .line 267
    .line 268
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->pqr:I

    .line 269
    .line 270
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->pqr:I

    .line 271
    .line 272
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->rst:I

    .line 273
    .line 274
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->rst:I

    .line 275
    .line 276
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->stu:I

    .line 277
    .line 278
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->stu:I

    .line 279
    .line 280
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->tuv:I

    .line 281
    .line 282
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->tuv:I

    .line 283
    .line 284
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->uvw:I

    .line 285
    .line 286
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->uvw:I

    .line 287
    .line 288
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    .line 289
    .line 290
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->wvu:Ljava/lang/String;

    .line 291
    .line 292
    iget v0, p1, Lcom/huawei/agconnect/apms/fed;->ghi:I

    .line 293
    .line 294
    iput v0, p0, Lcom/huawei/agconnect/apms/gfe;->vut:I

    .line 295
    .line 296
    iget-object v0, p1, Lcom/huawei/agconnect/apms/fed;->kji:Lorg/json/JSONArray;

    .line 297
    .line 298
    iput-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->uts:Lorg/json/JSONArray;

    .line 299
    .line 300
    iget-object p1, p1, Lcom/huawei/agconnect/apms/fed;->jih:Ljava/lang/String;

    .line 301
    .line 302
    iput-object p1, p0, Lcom/huawei/agconnect/apms/gfe;->tsr:Ljava/lang/String;

    .line 303
    .line 304
    return-void
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


# virtual methods
.method public abc()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/gfe;->vwx:J

    return-wide v0
.end method

.method public abc(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->abc:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iput-object p1, p0, Lcom/huawei/agconnect/apms/gfe;->xwv:Ljava/lang/String;

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public bcd()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/agconnect/apms/gfe;->qrs:J

    return-wide v0
.end method

.method public cde()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->abc:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/gfe;->xwv:Ljava/lang/String;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
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
.end method

.method public def()I
    .locals 1

    iget v0, p0, Lcom/huawei/agconnect/apms/gfe;->stu:I

    return v0
.end method

.method public efg()I
    .locals 1

    iget v0, p0, Lcom/huawei/agconnect/apms/gfe;->rst:I

    return v0
.end method

.method public fgh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->ijk:Ljava/lang/String;

    return-object v0
.end method

.method public ghi()I
    .locals 1

    iget v0, p0, Lcom/huawei/agconnect/apms/gfe;->jkl:I

    return v0
.end method

.method public hij()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/gfe;->cde:Ljava/lang/String;

    return-object v0
.end method
