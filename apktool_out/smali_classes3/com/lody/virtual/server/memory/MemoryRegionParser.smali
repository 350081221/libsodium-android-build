.class public Lcom/lody/virtual/server/memory/MemoryRegionParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MAPS_LINE_PATTERN:Ljava/util/regex/Pattern;

.field public static final PATTERN:Ljava/lang/String; = "([0-9a-f]+)-([0-9a-f]+)\\s([r-])([w-])([x-])([sp])\\s([0-9a-f]+)\\s([0-9a-f]+):([0-9a-f]+)\\s(\\d+)\\s?(.*)"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "([0-9a-f]+)-([0-9a-f]+)\\s([r-])([w-])([x-])([sp])\\s([0-9a-f]+)\\s([0-9a-f]+):([0-9a-f]+)\\s(\\d+)\\s?(.*)"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/lody/virtual/server/memory/MemoryRegionParser;->MAPS_LINE_PATTERN:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getMemoryRegions(I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/lody/virtual/server/memory/MappedMemoryRegion;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/BufferedReader;

    .line 7
    .line 8
    new-instance v2, Ljava/io/FileReader;

    .line 9
    .line 10
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    new-array v4, v4, [Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    aput-object p0, v4, v5

    .line 21
    .line 22
    const-string p0, "/proc/%d/maps"

    .line 23
    .line 24
    invoke-static {v3, p0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-static {p0}, Lcom/lody/virtual/server/memory/MemoryRegionParser;->parseMapLine(Ljava/lang/String;)Lcom/lody/virtual/server/memory/MappedMemoryRegion;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-boolean v2, p0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->isReadable:Z

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    iget-boolean v2, p0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->isWritable:Z

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    iget-object v2, p0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->description:Ljava/lang/String;

    .line 53
    .line 54
    const-string v3, "(deleted)"

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_0

    .line 61
    .line 62
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    return-object v0
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method private static parseHex(Ljava/lang/String;)J
    .locals 2

    const/16 v0, 0x10

    invoke-static {p0, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    return-wide v0
.end method

.method private static parseMapLine(Ljava/lang/String;)Lcom/lody/virtual/server/memory/MappedMemoryRegion;
    .locals 24

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/lody/virtual/server/memory/MemoryRegionParser;->MAPS_LINE_PATTERN:Ljava/util/regex/Pattern;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->groupCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x2

    .line 24
    const/16 v5, 0xb

    .line 25
    .line 26
    if-ne v0, v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/lody/virtual/server/memory/MemoryRegionParser;->parseHex(Ljava/lang/String;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v7

    .line 36
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lcom/lody/virtual/server/memory/MemoryRegionParser;->parseHex(Ljava/lang/String;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v9

    .line 44
    const/4 v0, 0x3

    .line 45
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "r"

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    const/4 v0, 0x4

    .line 56
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v2, "w"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    const/4 v0, 0x5

    .line 67
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v2, "x"

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    const/4 v0, 0x6

    .line 78
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v2, "s"

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    const/4 v0, 0x7

    .line 89
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lcom/lody/virtual/server/memory/MemoryRegionParser;->parseHex(Ljava/lang/String;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v15

    .line 97
    const/16 v0, 0x8

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lcom/lody/virtual/server/memory/MemoryRegionParser;->parseHex(Ljava/lang/String;)J

    .line 104
    .line 105
    .line 106
    move-result-wide v17

    .line 107
    const/16 v0, 0x9

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Lcom/lody/virtual/server/memory/MemoryRegionParser;->parseHex(Ljava/lang/String;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v19

    .line 117
    const/16 v0, 0xa

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Lcom/lody/virtual/server/memory/MemoryRegionParser;->parseHex(Ljava/lang/String;)J

    .line 124
    .line 125
    .line 126
    move-result-wide v21

    .line 127
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v23

    .line 131
    new-instance v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;

    .line 132
    .line 133
    move-object v6, v0

    .line 134
    invoke-direct/range {v6 .. v23}, Lcom/lody/virtual/server/memory/MappedMemoryRegion;-><init>(JJZZZZJJJJLjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_0
    new-instance v0, Ljava/lang/InternalError;

    .line 139
    .line 140
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 141
    .line 142
    new-array v2, v2, [Ljava/lang/Object;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->groupCount()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    aput-object v1, v2, v3

    .line 153
    .line 154
    const/16 v1, 0xc

    .line 155
    .line 156
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    aput-object v1, v2, v4

    .line 161
    .line 162
    const-string v1, "Invalid group count: Found %d, but expected %d"

    .line 163
    .line 164
    invoke-static {v5, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-direct {v0, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 173
    .line 174
    new-array v2, v4, [Ljava/lang/Object;

    .line 175
    .line 176
    aput-object v0, v2, v3

    .line 177
    .line 178
    const-string v0, "The provided line does not match the pattern for /proc/$pid/maps lines. Given: %s"

    .line 179
    .line 180
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v1
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
