.class public La1/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La1/h;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Intent;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:La1/h;


# direct methods
.method public constructor <init>(La1/h;Landroid/content/Intent;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, La1/h$c;->c:La1/h;

    iput-object p2, p0, La1/h$c;->a:Landroid/content/Intent;

    iput-object p3, p0, La1/h$c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, La1/h$c;->c:La1/h;

    .line 2
    .line 3
    invoke-static {v0}, La1/h;->l(La1/h;)Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La1/h$c;->c:La1/h;

    .line 10
    .line 11
    invoke-static {v0}, La1/h;->l(La1/h;)Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La1/h$c;->a:Landroid/content/Intent;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p0, La1/h$c;->c:La1/h;

    .line 22
    .line 23
    invoke-static {v0}, La1/h;->h(La1/h;)Ly0/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "biz"

    .line 28
    .line 29
    const-string v2, "ErrActNull2"

    .line 30
    .line 31
    const-string v3, ""

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, Li0/a;->i(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, La1/h$c;->c:La1/h;

    .line 37
    .line 38
    invoke-static {v0}, La1/h;->h(La1/h;)Ly0/a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ly0/a;->a()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, La1/h$c;->a:Landroid/content/Intent;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    iget-object v1, p0, La1/h$c;->c:La1/h;

    .line 56
    .line 57
    invoke-static {v1}, La1/h;->h(La1/h;)Ly0/a;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, "biz"

    .line 62
    .line 63
    const-string v3, "ErrActEx2"

    .line 64
    .line 65
    invoke-static {v1, v2, v3, v0}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, La1/h$c;->c:La1/h;

    .line 69
    .line 70
    invoke-static {v0}, La1/h;->l(La1/h;)Landroid/app/Activity;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, La1/h$c;->c:La1/h;

    .line 75
    .line 76
    invoke-static {v1}, La1/h;->h(La1/h;)Ly0/a;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "alipaySdk"

    .line 81
    .line 82
    const-string v3, "startActivityEx"

    .line 83
    .line 84
    invoke-static {v2, v3, v0, v1}, La1/n;->u(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ly0/a;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, La1/h$c;->b:Ljava/lang/Object;

    .line 88
    .line 89
    monitor-enter v0

    .line 90
    :try_start_1
    iget-object v1, p0, La1/h$c;->c:La1/h;

    .line 91
    .line 92
    const-string v2, "scheme_failed"

    .line 93
    .line 94
    invoke-static {v1, v2}, La1/h;->c(La1/h;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, La1/h$c;->b:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catchall_1
    move-exception v1

    .line 104
    :try_start_2
    iget-object v2, p0, La1/h$c;->c:La1/h;

    .line 105
    .line 106
    invoke-static {v2}, La1/h;->h(La1/h;)Ly0/a;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const-string v3, "biz"

    .line 111
    .line 112
    const-string v4, "BSAResultEx"

    .line 113
    .line 114
    invoke-static {v2, v3, v4, v1}, Li0/a;->e(Ly0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    monitor-exit v0

    .line 118
    :cond_1
    :goto_1
    return-void

    .line 119
    :catchall_2
    move-exception v1

    .line 120
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 121
    throw v1
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
.end method
