.class final Lretrofit2/RequestFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit2/RequestFactory$Builder;
    }
.end annotation


# instance fields
.field private final baseUrl:Lokhttp3/HttpUrl;

.field private final contentType:Lokhttp3/MediaType;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final hasBody:Z

.field private final headers:Lokhttp3/Headers;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final httpMethod:Ljava/lang/String;

.field private final isFormEncoded:Z

.field final isKotlinSuspendFunction:Z

.field private final isMultipart:Z

.field private final method:Ljava/lang/reflect/Method;

.field private final parameterHandlers:[Lretrofit2/ParameterHandler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lretrofit2/ParameterHandler<",
            "*>;"
        }
    .end annotation
.end field

.field private final relativeUrl:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lretrofit2/RequestFactory$Builder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lretrofit2/RequestFactory$Builder;->method:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object v0, p0, Lretrofit2/RequestFactory;->method:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    iget-object v0, p1, Lretrofit2/RequestFactory$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 9
    .line 10
    iget-object v0, v0, Lretrofit2/Retrofit;->baseUrl:Lokhttp3/HttpUrl;

    .line 11
    .line 12
    iput-object v0, p0, Lretrofit2/RequestFactory;->baseUrl:Lokhttp3/HttpUrl;

    .line 13
    .line 14
    iget-object v0, p1, Lretrofit2/RequestFactory$Builder;->httpMethod:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lretrofit2/RequestFactory;->httpMethod:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, p1, Lretrofit2/RequestFactory$Builder;->relativeUrl:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lretrofit2/RequestFactory;->relativeUrl:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, p1, Lretrofit2/RequestFactory$Builder;->headers:Lokhttp3/Headers;

    .line 23
    .line 24
    iput-object v0, p0, Lretrofit2/RequestFactory;->headers:Lokhttp3/Headers;

    .line 25
    .line 26
    iget-object v0, p1, Lretrofit2/RequestFactory$Builder;->contentType:Lokhttp3/MediaType;

    .line 27
    .line 28
    iput-object v0, p0, Lretrofit2/RequestFactory;->contentType:Lokhttp3/MediaType;

    .line 29
    .line 30
    iget-boolean v0, p1, Lretrofit2/RequestFactory$Builder;->hasBody:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lretrofit2/RequestFactory;->hasBody:Z

    .line 33
    .line 34
    iget-boolean v0, p1, Lretrofit2/RequestFactory$Builder;->isFormEncoded:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lretrofit2/RequestFactory;->isFormEncoded:Z

    .line 37
    .line 38
    iget-boolean v0, p1, Lretrofit2/RequestFactory$Builder;->isMultipart:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lretrofit2/RequestFactory;->isMultipart:Z

    .line 41
    .line 42
    iget-object v0, p1, Lretrofit2/RequestFactory$Builder;->parameterHandlers:[Lretrofit2/ParameterHandler;

    .line 43
    .line 44
    iput-object v0, p0, Lretrofit2/RequestFactory;->parameterHandlers:[Lretrofit2/ParameterHandler;

    .line 45
    .line 46
    iget-boolean p1, p1, Lretrofit2/RequestFactory$Builder;->isKotlinSuspendFunction:Z

    .line 47
    .line 48
    iput-boolean p1, p0, Lretrofit2/RequestFactory;->isKotlinSuspendFunction:Z

    .line 49
    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method static parseAnnotations(Lretrofit2/Retrofit;Ljava/lang/reflect/Method;)Lretrofit2/RequestFactory;
    .locals 1

    new-instance v0, Lretrofit2/RequestFactory$Builder;

    invoke-direct {v0, p0, p1}, Lretrofit2/RequestFactory$Builder;-><init>(Lretrofit2/Retrofit;Ljava/lang/reflect/Method;)V

    invoke-virtual {v0}, Lretrofit2/RequestFactory$Builder;->build()Lretrofit2/RequestFactory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method create([Ljava/lang/Object;)Lokhttp3/Request;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lretrofit2/RequestFactory;->parameterHandlers:[Lretrofit2/ParameterHandler;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    array-length v2, v0

    .line 5
    if-ne v1, v2, :cond_3

    .line 6
    .line 7
    new-instance v2, Lretrofit2/RequestBuilder;

    .line 8
    .line 9
    iget-object v4, p0, Lretrofit2/RequestFactory;->httpMethod:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lretrofit2/RequestFactory;->baseUrl:Lokhttp3/HttpUrl;

    .line 12
    .line 13
    iget-object v6, p0, Lretrofit2/RequestFactory;->relativeUrl:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lretrofit2/RequestFactory;->headers:Lokhttp3/Headers;

    .line 16
    .line 17
    iget-object v8, p0, Lretrofit2/RequestFactory;->contentType:Lokhttp3/MediaType;

    .line 18
    .line 19
    iget-boolean v9, p0, Lretrofit2/RequestFactory;->hasBody:Z

    .line 20
    .line 21
    iget-boolean v10, p0, Lretrofit2/RequestFactory;->isFormEncoded:Z

    .line 22
    .line 23
    iget-boolean v11, p0, Lretrofit2/RequestFactory;->isMultipart:Z

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    invoke-direct/range {v3 .. v11}, Lretrofit2/RequestBuilder;-><init>(Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/MediaType;ZZZ)V

    .line 27
    .line 28
    .line 29
    iget-boolean v3, p0, Lretrofit2/RequestFactory;->isKotlinSuspendFunction:Z

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    add-int/lit8 v1, v1, -0x1

    .line 34
    .line 35
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    :goto_0
    if-ge v4, v1, :cond_1

    .line 42
    .line 43
    aget-object v5, p1, v4

    .line 44
    .line 45
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    aget-object v5, v0, v4

    .line 49
    .line 50
    aget-object v6, p1, v4

    .line 51
    .line 52
    invoke-virtual {v5, v2, v6}, Lretrofit2/ParameterHandler;->apply(Lretrofit2/RequestBuilder;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v2}, Lretrofit2/RequestBuilder;->get()Lokhttp3/Request$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v0, Lretrofit2/Invocation;

    .line 63
    .line 64
    iget-object v1, p0, Lretrofit2/RequestFactory;->method:Ljava/lang/reflect/Method;

    .line 65
    .line 66
    invoke-direct {v0, v1, v3}, Lretrofit2/Invocation;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    const-class v1, Lretrofit2/Invocation;

    .line 70
    .line 71
    invoke-virtual {p1, v1, v0}, Lokhttp3/Request$Builder;->tag(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    instance-of v0, p1, Lokhttp3/Request$Builder;

    .line 76
    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :goto_1
    return-object p1

    .line 89
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v3, "Argument count ("

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ") doesn\'t match expected count ("

    .line 105
    .line 106
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    array-length v0, v0

    .line 110
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v0, ")"

    .line 114
    .line 115
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1
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
.end method
