.class final Lcom/efs/sdk/pa/a/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/pa/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/efs/sdk/pa/a/a;


# direct methods
.method constructor <init>(Lcom/efs/sdk/pa/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/efs/sdk/pa/a/a;->f:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 13
    .line 14
    iget-wide v3, v2, Lcom/efs/sdk/pa/a/a;->j:J

    .line 15
    .line 16
    sub-long/2addr v0, v3

    .line 17
    iget-wide v3, v2, Lcom/efs/sdk/pa/a/a;->k:J

    .line 18
    .line 19
    cmp-long v3, v0, v3

    .line 20
    .line 21
    if-lez v3, :cond_1

    .line 22
    .line 23
    iget-object v2, v2, Lcom/efs/sdk/pa/a/a;->h:Lcom/efs/sdk/pa/PAANRListener;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v2, v0}, Lcom/efs/sdk/pa/PAANRListener;->unexcept(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 35
    .line 36
    iget-boolean v0, v0, Lcom/efs/sdk/pa/a/a;->a:Z

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    iput-wide v1, v0, Lcom/efs/sdk/pa/a/a;->i:J

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    iput-boolean v1, v0, Lcom/efs/sdk/pa/a/a;->a:Z

    .line 48
    .line 49
    iget-object v0, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 50
    .line 51
    iget-object v1, v0, Lcom/efs/sdk/pa/a/a;->b:Landroid/os/Handler;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/efs/sdk/pa/a/a;->n:Ljava/lang/Runnable;

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-object v0, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 60
    .line 61
    iget-wide v1, v0, Lcom/efs/sdk/pa/a/a;->i:J

    .line 62
    .line 63
    const-wide/16 v3, 0x1

    .line 64
    .line 65
    add-long/2addr v1, v3

    .line 66
    iput-wide v1, v0, Lcom/efs/sdk/pa/a/a;->i:J

    .line 67
    .line 68
    iget-boolean v0, v0, Lcom/efs/sdk/pa/a/a;->a:Z

    .line 69
    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    iget-object v0, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 73
    .line 74
    iget-wide v1, v0, Lcom/efs/sdk/pa/a/a;->i:J

    .line 75
    .line 76
    iget-wide v3, v0, Lcom/efs/sdk/pa/a/a;->e:J

    .line 77
    .line 78
    cmp-long v5, v1, v3

    .line 79
    .line 80
    if-ltz v5, :cond_4

    .line 81
    .line 82
    cmp-long v1, v1, v3

    .line 83
    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    iget-boolean v2, v0, Lcom/efs/sdk/pa/a/a;->l:Z

    .line 92
    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    iget-object v2, v0, Lcom/efs/sdk/pa/a/a;->c:Ljava/lang/Thread;

    .line 96
    .line 97
    invoke-static {v2}, Lcom/efs/sdk/pa/a/a;->a(Ljava/lang/Thread;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    invoke-static {v1}, Lcom/efs/sdk/pa/a/a;->a(Ljava/lang/StringBuilder;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    :goto_0
    iget-object v2, v0, Lcom/efs/sdk/pa/a/a;->h:Lcom/efs/sdk/pa/PAANRListener;

    .line 112
    .line 113
    if-eqz v2, :cond_4

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-lez v2, :cond_4

    .line 120
    .line 121
    iget-object v0, v0, Lcom/efs/sdk/pa/a/a;->h:Lcom/efs/sdk/pa/PAANRListener;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-interface {v0, v1}, Lcom/efs/sdk/pa/PAANRListener;->anrStack(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 131
    .line 132
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v1

    .line 136
    iput-wide v1, v0, Lcom/efs/sdk/pa/a/a;->j:J

    .line 137
    .line 138
    iget-object v0, p0, Lcom/efs/sdk/pa/a/a$1;->a:Lcom/efs/sdk/pa/a/a;

    .line 139
    .line 140
    iget-object v1, v0, Lcom/efs/sdk/pa/a/a;->g:Landroid/os/Handler;

    .line 141
    .line 142
    iget-object v2, v0, Lcom/efs/sdk/pa/a/a;->m:Ljava/lang/Runnable;

    .line 143
    .line 144
    iget-wide v3, v0, Lcom/efs/sdk/pa/a/a;->d:J

    .line 145
    .line 146
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 147
    .line 148
    .line 149
    return-void
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
.end method
