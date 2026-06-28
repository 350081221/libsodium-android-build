.class public Lcom/lody/virtual/helper/dedex/Dex$Header;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Dex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Header"
.end annotation


# static fields
.field static final MAGIC_COMPACT_DEX:Ljava/lang/String; = "cdex"

.field static final MAGIC_DEX:Ljava/lang/String; = "dex"


# instance fields
.field final checksum_:I

.field final class_defs_off_:I

.field final class_defs_size_:I

.field public final data_off_:I

.field final data_size_:I

.field final endian_tag_:I

.field final field_ids_off_:I

.field final field_ids_size_:I

.field public final file_size_:I

.field public final header_size_:I

.field final isCompactDex:Z

.field final link_off_:I

.field final link_size_:I

.field final magic:Ljava/lang/String;

.field final magic_:[C

.field final map_off_:I

.field final method_ids_off_:I

.field final method_ids_size_:I

.field final proto_ids_off_:I

.field final proto_ids_size_:I

.field final signature_:[B

.field final string_ids_off_:I

.field final string_ids_size_:I

.field final type_ids_off_:I

.field final type_ids_size_:I

.field final version:Ljava/lang/String;

.field final version_:[C


# direct methods
.method public constructor <init>(Lcom/lody/virtual/helper/dedex/DataReader;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [C

    .line 6
    .line 7
    iput-object v1, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->magic_:[C

    .line 8
    .line 9
    new-array v0, v0, [C

    .line 10
    .line 11
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->version_:[C

    .line 12
    .line 13
    const/16 v2, 0x14

    .line 14
    .line 15
    new-array v2, v2, [B

    .line 16
    .line 17
    iput-object v2, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->signature_:[B

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {v3, v1}, Ljava/lang/String;-><init>([C)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->magic:Ljava/lang/String;

    .line 32
    .line 33
    const-string v3, "cdex"

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iput-boolean v3, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->isCompactDex:Z

    .line 40
    .line 41
    const-string v4, "dex"

    .line 42
    .line 43
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x1

    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 55
    .line 56
    new-array v0, v6, [Ljava/lang/Object;

    .line 57
    .line 58
    aput-object v1, v0, v5

    .line 59
    .line 60
    const-string v1, "Invalid dex magic \'%s\'"

    .line 61
    .line 62
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->version:Ljava/lang/String;

    .line 83
    .line 84
    if-nez v3, :cond_3

    .line 85
    .line 86
    const-string v1, "035"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-ltz v1, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 96
    .line 97
    new-array v1, v6, [Ljava/lang/Object;

    .line 98
    .line 99
    aput-object v0, v1, v5

    .line 100
    .line 101
    const-string v0, "Invalid dex version \'%s\'"

    .line 102
    .line 103
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->checksum_:I

    .line 116
    .line 117
    invoke-virtual {p1, v2}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->file_size_:I

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->header_size_:I

    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->endian_tag_:I

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->link_size_:I

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->link_off_:I

    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->map_off_:I

    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->string_ids_size_:I

    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->string_ids_off_:I

    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->type_ids_size_:I

    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->type_ids_off_:I

    .line 179
    .line 180
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->proto_ids_size_:I

    .line 185
    .line 186
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->proto_ids_off_:I

    .line 191
    .line 192
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->field_ids_size_:I

    .line 197
    .line 198
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->field_ids_off_:I

    .line 203
    .line 204
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->method_ids_size_:I

    .line 209
    .line 210
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->method_ids_off_:I

    .line 215
    .line 216
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->class_defs_size_:I

    .line 221
    .line 222
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->class_defs_off_:I

    .line 227
    .line 228
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->data_size_:I

    .line 233
    .line 234
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    iput p1, p0, Lcom/lody/virtual/helper/dedex/Dex$Header;->data_off_:I

    .line 239
    .line 240
    return-void
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
