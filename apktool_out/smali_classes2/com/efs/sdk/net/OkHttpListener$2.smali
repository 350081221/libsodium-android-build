.class final Lcom/efs/sdk/net/OkHttpListener$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/net/OkHttpListener;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/efs/sdk/net/a/c;

.field final synthetic b:Lcom/efs/sdk/net/a/d;

.field final synthetic c:Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

.field final synthetic d:Lcom/efs/sdk/net/OkHttpListener;


# direct methods
.method constructor <init>(Lcom/efs/sdk/net/OkHttpListener;Lcom/efs/sdk/net/a/c;Lcom/efs/sdk/net/a/d;Lcom/efs/sdk/base/protocol/record/EfsJSONLog;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/net/OkHttpListener$2;->d:Lcom/efs/sdk/net/OkHttpListener;

    iput-object p2, p0, Lcom/efs/sdk/net/OkHttpListener$2;->a:Lcom/efs/sdk/net/a/c;

    iput-object p3, p0, Lcom/efs/sdk/net/OkHttpListener$2;->b:Lcom/efs/sdk/net/a/d;

    iput-object p4, p0, Lcom/efs/sdk/net/OkHttpListener$2;->c:Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/efs/sdk/net/NetManager;->getNetConfigManager()Lcom/efs/sdk/net/NetConfigManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/efs/sdk/net/NetConfigManager;->getNetRequestBodyCollectState()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/efs/sdk/net/OkHttpListener$2;->a:Lcom/efs/sdk/net/a/c;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/efs/sdk/net/a/c;->g:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, ""

    .line 22
    .line 23
    iget-object v1, p0, Lcom/efs/sdk/net/OkHttpListener$2;->b:Lcom/efs/sdk/net/a/d;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/efs/sdk/net/a/d;->E:Ljava/util/Map;

    .line 26
    .line 27
    sget-object v2, Lcom/efs/sdk/net/a/d;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/efs/sdk/net/OkHttpListener$2;->b:Lcom/efs/sdk/net/a/d;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/efs/sdk/net/a/d;->E:Ljava/util/Map;

    .line 38
    .line 39
    sget-object v1, Lcom/efs/sdk/net/a/d;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getAppid()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getSecret()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lcom/efs/sdk/net/b/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v1, p0, Lcom/efs/sdk/net/OkHttpListener$2;->c:Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

    .line 88
    .line 89
    const-string/jumbo v2, "wk_bd"

    .line 90
    .line 91
    .line 92
    iget-object v3, p0, Lcom/efs/sdk/net/OkHttpListener$2;->a:Lcom/efs/sdk/net/a/c;

    .line 93
    .line 94
    iget-object v3, v3, Lcom/efs/sdk/net/a/c;->g:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v3, v0}, Lcom/efs/sdk/net/b/a;->a([B[B)[B

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lcom/efs/sdk/net/b/a;->a([B)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v1, v2, v0}, Lcom/efs/sdk/base/protocol/record/AbsRecordLog;->put(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 118
    .line 119
    .line 120
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/efs/sdk/net/OkHttpListener$2;->b:Lcom/efs/sdk/net/a/d;

    .line 121
    .line 122
    iget-object v1, p0, Lcom/efs/sdk/net/OkHttpListener$2;->a:Lcom/efs/sdk/net/a/c;

    .line 123
    .line 124
    iget-object v2, p0, Lcom/efs/sdk/net/OkHttpListener$2;->c:Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

    .line 125
    .line 126
    invoke-static {v0, v1, v2}, Lcom/efs/sdk/net/OkHttpListener;->a(Lcom/efs/sdk/net/a/d;Lcom/efs/sdk/net/a/c;Lcom/efs/sdk/base/protocol/record/EfsJSONLog;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 132
    .line 133
    .line 134
    return-void
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
