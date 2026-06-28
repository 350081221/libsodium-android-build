.class final Lcom/bytedance/pangle/plugin/b$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/pangle/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/pangle/plugin/b;->a(Ljava/io/File;Ljava/lang/String;I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/StringBuffer;

.field final synthetic e:[Z


# direct methods
.method constructor <init>(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;[Z)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/pangle/plugin/b$2;->a:Ljava/io/File;

    iput-object p2, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    iput p3, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    iput-object p4, p0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    iput-object p5, p0, Lcom/bytedance/pangle/plugin/b$2;->e:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/plugin/b$2;->a:Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    .line 6
    .line 7
    iget-object v3, p0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/pangle/plugin/b;->b(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/bytedance/pangle/plugin/b$2;->a:Ljava/io/File;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget v3, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    .line 18
    .line 19
    iget-object v4, p0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    .line 20
    .line 21
    invoke-static {v1, v2, v3, v4}, Lcom/bytedance/pangle/plugin/b;->c(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/bytedance/pangle/plugin/b$2;->a:Ljava/io/File;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget v3, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    .line 29
    .line 30
    iget-object v4, p0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    .line 31
    .line 32
    invoke-static {v1, v2, v3, v4}, Lcom/bytedance/pangle/plugin/b;->d(Ljava/io/File;Ljava/lang/String;ILjava/lang/StringBuffer;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    .line 37
    .line 38
    iget v3, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    .line 39
    .line 40
    iget-object v4, p0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    .line 41
    .line 42
    invoke-static {v1, v2, v3, v4}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/StringBuffer;)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/bytedance/pangle/util/i;->f()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    invoke-static {}, Lcom/bytedance/pangle/util/i;->b()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v1, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    .line 60
    .line 61
    iget v3, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    .line 62
    .line 63
    iget-object v4, p0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    .line 64
    .line 65
    invoke-static {v1, v3, v0, v4}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/util/Map;Ljava/lang/StringBuffer;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/bytedance/pangle/plugin/b$2;->e:[Z

    .line 69
    .line 70
    iget-object v1, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    .line 71
    .line 72
    iget v3, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    .line 73
    .line 74
    iget-object v4, p0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    .line 75
    .line 76
    invoke-static {v1, v3, v2, v4}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;IZLjava/lang/StringBuffer;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    aput-boolean v1, v0, v2

    .line 81
    .line 82
    iget-object v0, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    .line 83
    .line 84
    iget v1, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    .line 85
    .line 86
    invoke-static {v0, v1}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 91
    new-array v3, v1, [Z

    .line 92
    .line 93
    aput-boolean v2, v3, v2

    .line 94
    .line 95
    const/4 v4, 0x2

    .line 96
    new-array v4, v4, [Lcom/bytedance/pangle/a/a$a;

    .line 97
    .line 98
    new-instance v5, Lcom/bytedance/pangle/plugin/b$2$1;

    .line 99
    .line 100
    invoke-direct {v5, p0, v0}, Lcom/bytedance/pangle/plugin/b$2$1;-><init>(Lcom/bytedance/pangle/plugin/b$2;Ljava/util/Map;)V

    .line 101
    .line 102
    .line 103
    aput-object v5, v4, v2

    .line 104
    .line 105
    new-instance v0, Lcom/bytedance/pangle/plugin/b$2$2;

    .line 106
    .line 107
    invoke-direct {v0, p0, v3}, Lcom/bytedance/pangle/plugin/b$2$2;-><init>(Lcom/bytedance/pangle/plugin/b$2;[Z)V

    .line 108
    .line 109
    .line 110
    aput-object v0, v4, v1

    .line 111
    .line 112
    invoke-static {v4}, Lcom/bytedance/pangle/a/a;->a([Lcom/bytedance/pangle/a/a$a;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/bytedance/pangle/plugin/b$2;->e:[Z

    .line 116
    .line 117
    iget-object v1, p0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    .line 118
    .line 119
    iget v4, p0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    .line 120
    .line 121
    aget-boolean v3, v3, v2

    .line 122
    .line 123
    iget-object v5, p0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    .line 124
    .line 125
    invoke-static {v1, v4, v3, v5}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;IZLjava/lang/StringBuffer;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    aput-boolean v1, v0, v2

    .line 130
    .line 131
    return-void
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
