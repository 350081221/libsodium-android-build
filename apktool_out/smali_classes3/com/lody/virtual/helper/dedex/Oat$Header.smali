.class public Lcom/lody/virtual/helper/dedex/Oat$Header;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Oat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Header"
.end annotation


# instance fields
.field final adler32_checksum_:I

.field artVersion:I

.field final dex_file_count_:I

.field final executable_offset_:I

.field final image_file_location_oat_checksum_:I

.field final image_file_location_oat_data_begin_:I

.field final image_patch_delta_:I

.field final instruction_set_:I

.field final instruction_set_features_:I

.field final interpreter_to_compiled_code_bridge_offset_:I

.field final interpreter_to_interpreter_bridge_offset_:I

.field final jni_dlsym_lookup_offset_:I

.field final key_value_store_:[C

.field final key_value_store_size_:I

.field final magic_:[C

.field portable_imt_conflict_trampoline_offset_:I

.field portable_resolution_trampoline_offset_:I

.field portable_to_interpreter_bridge_offset_:I

.field final quick_generic_jni_trampoline_offset_:I

.field final quick_imt_conflict_trampoline_offset_:I

.field final quick_resolution_trampoline_offset_:I

.field final quick_to_interpreter_bridge_offset_:I

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
    iput-object v1, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->magic_:[C

    .line 8
    .line 9
    new-array v0, v0, [C

    .line 10
    .line 11
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->version_:[C

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    aget-char v3, v1, v2

    .line 18
    .line 19
    const/16 v4, 0x6f

    .line 20
    .line 21
    const/4 v5, 0x2

    .line 22
    const/4 v6, 0x1

    .line 23
    if-ne v3, v4, :cond_1

    .line 24
    .line 25
    aget-char v3, v1, v6

    .line 26
    .line 27
    const/16 v4, 0x61

    .line 28
    .line 29
    if-ne v3, v4, :cond_1

    .line 30
    .line 31
    aget-char v3, v1, v5

    .line 32
    .line 33
    const/16 v4, 0x74

    .line 34
    .line 35
    if-ne v3, v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lcom/lody/virtual/helper/dedex/DataReader;->toInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->artVersion:I

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->adler32_checksum_:I

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->instruction_set_:I

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->instruction_set_features_:I

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->dex_file_count_:I

    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->executable_offset_:I

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->interpreter_to_interpreter_bridge_offset_:I

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->interpreter_to_compiled_code_bridge_offset_:I

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->jni_dlsym_lookup_offset_:I

    .line 98
    .line 99
    iget v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->artVersion:I

    .line 100
    .line 101
    const/16 v1, 0x34

    .line 102
    .line 103
    if-ge v0, v1, :cond_0

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->portable_imt_conflict_trampoline_offset_:I

    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->portable_resolution_trampoline_offset_:I

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->portable_to_interpreter_bridge_offset_:I

    .line 122
    .line 123
    :cond_0
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->quick_generic_jni_trampoline_offset_:I

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->quick_imt_conflict_trampoline_offset_:I

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->quick_resolution_trampoline_offset_:I

    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->quick_to_interpreter_bridge_offset_:I

    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->image_patch_delta_:I

    .line 152
    .line 153
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->image_file_location_oat_checksum_:I

    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->image_file_location_oat_data_begin_:I

    .line 164
    .line 165
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/DataReader;->readInt()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iput v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->key_value_store_size_:I

    .line 170
    .line 171
    new-array v0, v0, [C

    .line 172
    .line 173
    iput-object v0, p0, Lcom/lody/virtual/helper/dedex/Oat$Header;->key_value_store_:[C

    .line 174
    .line 175
    invoke-virtual {p1, v0}, Lcom/lody/virtual/helper/dedex/DataReader;->readBytes([C)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 180
    .line 181
    const/4 v0, 0x3

    .line 182
    new-array v0, v0, [Ljava/lang/Object;

    .line 183
    .line 184
    aget-char v3, v1, v2

    .line 185
    .line 186
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    aput-object v3, v0, v2

    .line 191
    .line 192
    aget-char v2, v1, v6

    .line 193
    .line 194
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    aput-object v2, v0, v6

    .line 199
    .line 200
    aget-char v1, v1, v5

    .line 201
    .line 202
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    aput-object v1, v0, v5

    .line 207
    .line 208
    const-string v1, "Invalid art magic %c%c%c"

    .line 209
    .line 210
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1
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
