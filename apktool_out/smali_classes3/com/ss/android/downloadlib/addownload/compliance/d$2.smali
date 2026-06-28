.class Lcom/ss/android/downloadlib/addownload/compliance/d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/downloadlib/g/c$a;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/compliance/d;->a(JJLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ss/android/downloadlib/g/c$a<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Lcom/ss/android/downloadlib/addownload/compliance/d;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/compliance/d;Ljava/lang/String;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/d$2;->d:Lcom/ss/android/downloadlib/addownload/compliance/d;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/compliance/d$2;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/ss/android/downloadlib/addownload/compliance/d$2;->b:J

    iput-wide p5, p0, Lcom/ss/android/downloadlib/addownload/compliance/d$2;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/compliance/d$2;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0, p1, v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(ZILjava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/i;

    .line 7
    .line 8
    .line 9
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    new-array v0, v0, [Ljava/io/Closeable;

    .line 13
    .line 14
    aput-object v1, v0, p1

    .line 15
    .line 16
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    :try_start_1
    new-instance v3, Ljava/io/BufferedInputStream;

    .line 21
    .line 22
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/network/i;->a()Ljava/io/InputStream;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->available()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v3, v2}, Ljava/io/InputStream;->mark(I)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    .line 37
    .line 38
    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 42
    .line 43
    invoke-static {v3, v1, v2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 44
    .line 45
    .line 46
    iget v4, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 47
    .line 48
    iget v5, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 49
    .line 50
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/k;->a()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    const/high16 v7, 0x42700000    # 60.0f

    .line 55
    .line 56
    invoke-static {v6, v7}, Lcom/ss/android/downloadlib/g/m;->a(Landroid/content/Context;F)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    invoke-static {v6, v6, v2}, Lcom/ss/android/downloadlib/addownload/compliance/d;->a(IILandroid/graphics/BitmapFactory$Options;)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    iput v6, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 65
    .line 66
    iput-boolean p1, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/io/InputStream;->reset()V

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v1, v2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v6, Lorg/json/JSONObject;

    .line 76
    .line 77
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 78
    .line 79
    .line 80
    :try_start_3
    const-string v7, "ttdownloader_type"

    .line 81
    .line 82
    const-string v8, "load_bitmap"

    .line 83
    .line 84
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    const-string v7, "bm_original_w"

    .line 88
    .line 89
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    const-string v4, "bm_original_h"

    .line 97
    .line 98
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v6, v4, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const-string v4, "bm_bytes"

    .line 106
    .line 107
    if-nez v2, :cond_1

    .line 108
    .line 109
    const/4 v5, -0x1

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getByteCount()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    :goto_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v6, v4, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catch_0
    move-exception v4

    .line 124
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 125
    .line 126
    .line 127
    :goto_1
    invoke-static {}, Lcom/ss/android/downloadlib/d/a;->a()Lcom/ss/android/downloadlib/d/a;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    const-string v5, "ttd_pref_monitor"

    .line 132
    .line 133
    iget-wide v7, p0, Lcom/ss/android/downloadlib/addownload/compliance/d$2;->b:J

    .line 134
    .line 135
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/ss/android/downloadlib/d/a;->a(Ljava/lang/String;Lorg/json/JSONObject;J)V

    .line 136
    .line 137
    .line 138
    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/compliance/d$2;->d:Lcom/ss/android/downloadlib/addownload/compliance/d;

    .line 139
    .line 140
    iget-wide v5, p0, Lcom/ss/android/downloadlib/addownload/compliance/d$2;->c:J

    .line 141
    .line 142
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v4, v5, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 147
    .line 148
    .line 149
    new-array v0, v0, [Ljava/io/Closeable;

    .line 150
    .line 151
    aput-object v3, v0, p1

    .line 152
    .line 153
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :catch_1
    move-exception v2

    .line 158
    goto :goto_2

    .line 159
    :catchall_0
    move-exception v2

    .line 160
    move-object v3, v1

    .line 161
    move-object v1, v2

    .line 162
    goto :goto_4

    .line 163
    :catch_2
    move-exception v2

    .line 164
    move-object v3, v1

    .line 165
    :goto_2
    :try_start_5
    invoke-static {}, Lcom/ss/android/downloadlib/e/c;->a()Lcom/ss/android/downloadlib/e/c;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    const-string v5, "BitmapCache loadBitmap"

    .line 170
    .line 171
    invoke-virtual {v4, v2, v5}, Lcom/ss/android/downloadlib/e/c;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 172
    .line 173
    .line 174
    new-array v0, v0, [Ljava/io/Closeable;

    .line 175
    .line 176
    aput-object v3, v0, p1

    .line 177
    .line 178
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 179
    .line 180
    .line 181
    :goto_3
    return-object v1

    .line 182
    :catchall_1
    move-exception v1

    .line 183
    :goto_4
    new-array v0, v0, [Ljava/io/Closeable;

    .line 184
    .line 185
    aput-object v3, v0, p1

    .line 186
    .line 187
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 188
    .line 189
    .line 190
    throw v1
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
