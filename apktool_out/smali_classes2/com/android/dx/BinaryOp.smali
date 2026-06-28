.class public abstract enum Lcom/android/dx/BinaryOp;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/dx/BinaryOp;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/dx/BinaryOp;

.field public static final enum ADD:Lcom/android/dx/BinaryOp;

.field public static final enum AND:Lcom/android/dx/BinaryOp;

.field public static final enum DIVIDE:Lcom/android/dx/BinaryOp;

.field public static final enum MULTIPLY:Lcom/android/dx/BinaryOp;

.field public static final enum OR:Lcom/android/dx/BinaryOp;

.field public static final enum REMAINDER:Lcom/android/dx/BinaryOp;

.field public static final enum SHIFT_LEFT:Lcom/android/dx/BinaryOp;

.field public static final enum SHIFT_RIGHT:Lcom/android/dx/BinaryOp;

.field public static final enum SUBTRACT:Lcom/android/dx/BinaryOp;

.field public static final enum UNSIGNED_SHIFT_RIGHT:Lcom/android/dx/BinaryOp;

.field public static final enum XOR:Lcom/android/dx/BinaryOp;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/android/dx/BinaryOp$1;

    .line 2
    .line 3
    const-string v1, "ADD"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/android/dx/BinaryOp$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/android/dx/BinaryOp;->ADD:Lcom/android/dx/BinaryOp;

    .line 10
    .line 11
    new-instance v1, Lcom/android/dx/BinaryOp$2;

    .line 12
    .line 13
    const-string v3, "SUBTRACT"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lcom/android/dx/BinaryOp$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/android/dx/BinaryOp;->SUBTRACT:Lcom/android/dx/BinaryOp;

    .line 20
    .line 21
    new-instance v3, Lcom/android/dx/BinaryOp$3;

    .line 22
    .line 23
    const-string v5, "MULTIPLY"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lcom/android/dx/BinaryOp$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/android/dx/BinaryOp;->MULTIPLY:Lcom/android/dx/BinaryOp;

    .line 30
    .line 31
    new-instance v5, Lcom/android/dx/BinaryOp$4;

    .line 32
    .line 33
    const-string v7, "DIVIDE"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lcom/android/dx/BinaryOp$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lcom/android/dx/BinaryOp;->DIVIDE:Lcom/android/dx/BinaryOp;

    .line 40
    .line 41
    new-instance v7, Lcom/android/dx/BinaryOp$5;

    .line 42
    .line 43
    const-string v9, "REMAINDER"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lcom/android/dx/BinaryOp$5;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lcom/android/dx/BinaryOp;->REMAINDER:Lcom/android/dx/BinaryOp;

    .line 50
    .line 51
    new-instance v9, Lcom/android/dx/BinaryOp$6;

    .line 52
    .line 53
    const-string v11, "AND"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lcom/android/dx/BinaryOp$6;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lcom/android/dx/BinaryOp;->AND:Lcom/android/dx/BinaryOp;

    .line 60
    .line 61
    new-instance v11, Lcom/android/dx/BinaryOp$7;

    .line 62
    .line 63
    const-string v13, "OR"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v13, v14}, Lcom/android/dx/BinaryOp$7;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Lcom/android/dx/BinaryOp;->OR:Lcom/android/dx/BinaryOp;

    .line 70
    .line 71
    new-instance v13, Lcom/android/dx/BinaryOp$8;

    .line 72
    .line 73
    const-string v15, "XOR"

    .line 74
    .line 75
    const/4 v14, 0x7

    .line 76
    invoke-direct {v13, v15, v14}, Lcom/android/dx/BinaryOp$8;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v13, Lcom/android/dx/BinaryOp;->XOR:Lcom/android/dx/BinaryOp;

    .line 80
    .line 81
    new-instance v15, Lcom/android/dx/BinaryOp$9;

    .line 82
    .line 83
    const-string v14, "SHIFT_LEFT"

    .line 84
    .line 85
    const/16 v12, 0x8

    .line 86
    .line 87
    invoke-direct {v15, v14, v12}, Lcom/android/dx/BinaryOp$9;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v15, Lcom/android/dx/BinaryOp;->SHIFT_LEFT:Lcom/android/dx/BinaryOp;

    .line 91
    .line 92
    new-instance v14, Lcom/android/dx/BinaryOp$10;

    .line 93
    .line 94
    const-string v12, "SHIFT_RIGHT"

    .line 95
    .line 96
    const/16 v10, 0x9

    .line 97
    .line 98
    invoke-direct {v14, v12, v10}, Lcom/android/dx/BinaryOp$10;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v14, Lcom/android/dx/BinaryOp;->SHIFT_RIGHT:Lcom/android/dx/BinaryOp;

    .line 102
    .line 103
    new-instance v12, Lcom/android/dx/BinaryOp$11;

    .line 104
    .line 105
    const-string v10, "UNSIGNED_SHIFT_RIGHT"

    .line 106
    .line 107
    const/16 v8, 0xa

    .line 108
    .line 109
    invoke-direct {v12, v10, v8}, Lcom/android/dx/BinaryOp$11;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    sput-object v12, Lcom/android/dx/BinaryOp;->UNSIGNED_SHIFT_RIGHT:Lcom/android/dx/BinaryOp;

    .line 113
    .line 114
    const/16 v10, 0xb

    .line 115
    .line 116
    new-array v10, v10, [Lcom/android/dx/BinaryOp;

    .line 117
    .line 118
    aput-object v0, v10, v2

    .line 119
    .line 120
    aput-object v1, v10, v4

    .line 121
    .line 122
    aput-object v3, v10, v6

    .line 123
    .line 124
    const/4 v0, 0x3

    .line 125
    aput-object v5, v10, v0

    .line 126
    .line 127
    const/4 v0, 0x4

    .line 128
    aput-object v7, v10, v0

    .line 129
    .line 130
    const/4 v0, 0x5

    .line 131
    aput-object v9, v10, v0

    .line 132
    .line 133
    const/4 v0, 0x6

    .line 134
    aput-object v11, v10, v0

    .line 135
    .line 136
    const/4 v0, 0x7

    .line 137
    aput-object v13, v10, v0

    .line 138
    .line 139
    const/16 v0, 0x8

    .line 140
    .line 141
    aput-object v15, v10, v0

    .line 142
    .line 143
    const/16 v0, 0x9

    .line 144
    .line 145
    aput-object v14, v10, v0

    .line 146
    .line 147
    aput-object v12, v10, v8

    .line 148
    .line 149
    sput-object v10, Lcom/android/dx/BinaryOp;->$VALUES:[Lcom/android/dx/BinaryOp;

    .line 150
    .line 151
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/android/dx/BinaryOp$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/android/dx/BinaryOp;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/android/dx/BinaryOp;
    .locals 1

    const-class v0, Lcom/android/dx/BinaryOp;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/android/dx/BinaryOp;

    return-object p0
.end method

.method public static values()[Lcom/android/dx/BinaryOp;
    .locals 1

    sget-object v0, Lcom/android/dx/BinaryOp;->$VALUES:[Lcom/android/dx/BinaryOp;

    invoke-virtual {v0}, [Lcom/android/dx/BinaryOp;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/android/dx/BinaryOp;

    return-object v0
.end method


# virtual methods
.method abstract rop(Lcom/android/dx/rop/type/TypeList;)Lcom/android/dx/rop/code/Rop;
.end method
