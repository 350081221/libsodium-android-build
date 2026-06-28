.class public Lcom/lody/virtual/helper/dedex/Oat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;,
        Lcom/lody/virtual/helper/dedex/Oat$Header;,
        Lcom/lody/virtual/helper/dedex/Oat$InstructionSet;,
        Lcom/lody/virtual/helper/dedex/Oat$Version;
    }
.end annotation


# static fields
.field public static final SECTION_RODATA:Ljava/lang/String; = ".rodata"


# instance fields
.field public final dexFiles:[Lcom/lody/virtual/helper/dedex/Dex;

.field public final header:Lcom/lody/virtual/helper/dedex/Oat$Header;

.field public final oatDexFiles:[Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;

.field public final oatPosition:J

.field public final srcFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/lody/virtual/helper/dedex/DataReader;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->position()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-long v0, v0

    .line 9
    iput-wide v0, p0, Lcom/lody/virtual/helper/dedex/Oat;->oatPosition:J

    .line 10
    .line 11
    const-wide/16 v2, 0x1000

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-nez v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->getFile()Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Oat;->srcFile:Ljava/io/File;

    .line 22
    .line 23
    new-instance v0, Lcom/lody/virtual/helper/dedex/Oat$Header;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Lcom/lody/virtual/helper/dedex/Oat$Header;-><init>(Lcom/lody/virtual/helper/dedex/DataReader;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Oat;->header:Lcom/lody/virtual/helper/dedex/Oat$Header;

    .line 29
    .line 30
    iget v0, v0, Lcom/lody/virtual/helper/dedex/Oat$Header;->dex_file_count_:I

    .line 31
    .line 32
    new-array v1, v0, [Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;

    .line 33
    .line 34
    iput-object v1, p0, Lcom/lody/virtual/helper/dedex/Oat;->oatDexFiles:[Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;

    .line 35
    .line 36
    new-array v0, v0, [Lcom/lody/virtual/helper/dedex/Dex;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Oat;->dexFiles:[Lcom/lody/virtual/helper/dedex/Dex;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    :goto_0
    iget-object v1, p0, Lcom/lody/virtual/helper/dedex/Oat;->oatDexFiles:[Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;

    .line 42
    .line 43
    array-length v1, v1

    .line 44
    if-ge v0, v1, :cond_3

    .line 45
    .line 46
    new-instance v1, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/lody/virtual/helper/dedex/Oat;->header:Lcom/lody/virtual/helper/dedex/Oat$Header;

    .line 49
    .line 50
    iget v2, v2, Lcom/lody/virtual/helper/dedex/Oat$Header;->artVersion:I

    .line 51
    .line 52
    invoke-direct {v1, p1, v2}, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;-><init>(Lcom/lody/virtual/helper/dedex/DataReader;I)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lcom/lody/virtual/helper/dedex/Oat;->oatDexFiles:[Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;

    .line 56
    .line 57
    aput-object v1, v2, v0

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->position()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    int-to-long v2, v2

    .line 64
    iget-object v4, v1, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_pointer_:Ljava/io/File;

    .line 65
    .line 66
    if-eqz v4, :cond_0

    .line 67
    .line 68
    new-instance v5, Lcom/lody/virtual/helper/dedex/DataReader;

    .line 69
    .line 70
    invoke-direct {v5, v4}, Lcom/lody/virtual/helper/dedex/DataReader;-><init>(Ljava/io/File;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v5}, Lcom/lody/virtual/helper/dedex/DataReader;->addAssociatedReader(Lcom/lody/virtual/helper/dedex/DataReader;)V

    .line 74
    .line 75
    .line 76
    iget v1, v1, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_offset_:I

    .line 77
    .line 78
    int-to-long v6, v1

    .line 79
    invoke-virtual {v5, v6, v7}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 80
    .line 81
    .line 82
    new-instance v1, Lcom/lody/virtual/helper/dedex/Dex;

    .line 83
    .line 84
    invoke-direct {v1, v5}, Lcom/lody/virtual/helper/dedex/Dex;-><init>(Lcom/lody/virtual/helper/dedex/DataReader;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_0
    iget-wide v4, p0, Lcom/lody/virtual/helper/dedex/Oat;->oatPosition:J

    .line 89
    .line 90
    iget v1, v1, Lcom/lody/virtual/helper/dedex/Oat$OatDexFile;->dex_file_offset_:I

    .line 91
    .line 92
    int-to-long v6, v1

    .line 93
    add-long/2addr v4, v6

    .line 94
    invoke-virtual {p1, v4, v5}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 95
    .line 96
    .line 97
    new-instance v1, Lcom/lody/virtual/helper/dedex/Dex;

    .line 98
    .line 99
    invoke-direct {v1, p1}, Lcom/lody/virtual/helper/dedex/Dex;-><init>(Lcom/lody/virtual/helper/dedex/DataReader;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    iget-object v4, p0, Lcom/lody/virtual/helper/dedex/Oat;->dexFiles:[Lcom/lody/virtual/helper/dedex/Dex;

    .line 103
    .line 104
    aput-object v1, v4, v0

    .line 105
    .line 106
    iget-object v4, p0, Lcom/lody/virtual/helper/dedex/Oat;->header:Lcom/lody/virtual/helper/dedex/Oat$Header;

    .line 107
    .line 108
    iget v4, v4, Lcom/lody/virtual/helper/dedex/Oat$Header;->artVersion:I

    .line 109
    .line 110
    sget-object v5, Lcom/lody/virtual/helper/dedex/Oat$Version;->N_70:Lcom/lody/virtual/helper/dedex/Oat$Version;

    .line 111
    .line 112
    iget v5, v5, Lcom/lody/virtual/helper/dedex/Oat$Version;->oat:I

    .line 113
    .line 114
    if-ge v4, v5, :cond_1

    .line 115
    .line 116
    iget-object v1, v1, Lcom/lody/virtual/helper/dedex/Dex;->header:Lcom/lody/virtual/helper/dedex/Dex$Header;

    .line 117
    .line 118
    iget v1, v1, Lcom/lody/virtual/helper/dedex/Dex$Header;->class_defs_size_:I

    .line 119
    .line 120
    mul-int/lit8 v1, v1, 0x4

    .line 121
    .line 122
    int-to-long v4, v1

    .line 123
    add-long/2addr v2, v4

    .line 124
    invoke-virtual {p1, v2, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->previewInt()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    const/16 v2, 0xff

    .line 132
    .line 133
    if-le v1, v2, :cond_2

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_1
    invoke-virtual {p1, v2, v3}, Lcom/lody/virtual/helper/dedex/DataReader;->seek(J)V

    .line 140
    .line 141
    .line 142
    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_3
    return-void

    .line 146
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 147
    .line 148
    new-instance v2, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v3, "Strange oat position "

    .line 154
    .line 155
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p1
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


# virtual methods
.method public getArtVersion()I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/helper/dedex/Oat;->header:Lcom/lody/virtual/helper/dedex/Oat$Header;

    iget v0, v0, Lcom/lody/virtual/helper/dedex/Oat$Header;->artVersion:I

    return v0
.end method
