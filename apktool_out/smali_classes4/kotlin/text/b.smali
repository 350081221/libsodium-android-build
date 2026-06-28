.class public final enum Lkotlin/text/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/text/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/text/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0019\u0008\u0086\u0081\u0002\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkotlin/text/CharDirectionality;",
        "",
        "value",
        "",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "UNDEFINED",
        "LEFT_TO_RIGHT",
        "RIGHT_TO_LEFT",
        "RIGHT_TO_LEFT_ARABIC",
        "EUROPEAN_NUMBER",
        "EUROPEAN_NUMBER_SEPARATOR",
        "EUROPEAN_NUMBER_TERMINATOR",
        "ARABIC_NUMBER",
        "COMMON_NUMBER_SEPARATOR",
        "NONSPACING_MARK",
        "BOUNDARY_NEUTRAL",
        "PARAGRAPH_SEPARATOR",
        "SEGMENT_SEPARATOR",
        "WHITESPACE",
        "OTHER_NEUTRALS",
        "LEFT_TO_RIGHT_EMBEDDING",
        "LEFT_TO_RIGHT_OVERRIDE",
        "RIGHT_TO_LEFT_EMBEDDING",
        "RIGHT_TO_LEFT_OVERRIDE",
        "POP_DIRECTIONAL_FORMAT",
        "Companion",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/a;

.field private static final synthetic $VALUES:[Lkotlin/text/b;

.field public static final enum ARABIC_NUMBER:Lkotlin/text/b;

.field public static final enum BOUNDARY_NEUTRAL:Lkotlin/text/b;

.field public static final enum COMMON_NUMBER_SEPARATOR:Lkotlin/text/b;

.field public static final Companion:Lkotlin/text/b$b;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final enum EUROPEAN_NUMBER:Lkotlin/text/b;

.field public static final enum EUROPEAN_NUMBER_SEPARATOR:Lkotlin/text/b;

.field public static final enum EUROPEAN_NUMBER_TERMINATOR:Lkotlin/text/b;

.field public static final enum LEFT_TO_RIGHT:Lkotlin/text/b;

.field public static final enum LEFT_TO_RIGHT_EMBEDDING:Lkotlin/text/b;

.field public static final enum LEFT_TO_RIGHT_OVERRIDE:Lkotlin/text/b;

.field public static final enum NONSPACING_MARK:Lkotlin/text/b;

.field public static final enum OTHER_NEUTRALS:Lkotlin/text/b;

.field public static final enum PARAGRAPH_SEPARATOR:Lkotlin/text/b;

.field public static final enum POP_DIRECTIONAL_FORMAT:Lkotlin/text/b;

.field public static final enum RIGHT_TO_LEFT:Lkotlin/text/b;

.field public static final enum RIGHT_TO_LEFT_ARABIC:Lkotlin/text/b;

.field public static final enum RIGHT_TO_LEFT_EMBEDDING:Lkotlin/text/b;

.field public static final enum RIGHT_TO_LEFT_OVERRIDE:Lkotlin/text/b;

.field public static final enum SEGMENT_SEPARATOR:Lkotlin/text/b;

.field public static final enum UNDEFINED:Lkotlin/text/b;

.field public static final enum WHITESPACE:Lkotlin/text/b;

.field private static final directionalityMap$delegate:Lkotlin/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/d0<",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lkotlin/text/b;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lkotlin/text/b;
    .locals 3

    const/16 v0, 0x14

    new-array v0, v0, [Lkotlin/text/b;

    const/4 v1, 0x0

    sget-object v2, Lkotlin/text/b;->UNDEFINED:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lkotlin/text/b;->LEFT_TO_RIGHT:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lkotlin/text/b;->RIGHT_TO_LEFT:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lkotlin/text/b;->RIGHT_TO_LEFT_ARABIC:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lkotlin/text/b;->EUROPEAN_NUMBER:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lkotlin/text/b;->EUROPEAN_NUMBER_SEPARATOR:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lkotlin/text/b;->EUROPEAN_NUMBER_TERMINATOR:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lkotlin/text/b;->ARABIC_NUMBER:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lkotlin/text/b;->COMMON_NUMBER_SEPARATOR:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lkotlin/text/b;->NONSPACING_MARK:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lkotlin/text/b;->BOUNDARY_NEUTRAL:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lkotlin/text/b;->PARAGRAPH_SEPARATOR:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lkotlin/text/b;->SEGMENT_SEPARATOR:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lkotlin/text/b;->WHITESPACE:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lkotlin/text/b;->OTHER_NEUTRALS:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lkotlin/text/b;->LEFT_TO_RIGHT_EMBEDDING:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lkotlin/text/b;->LEFT_TO_RIGHT_OVERRIDE:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lkotlin/text/b;->RIGHT_TO_LEFT_EMBEDDING:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lkotlin/text/b;->RIGHT_TO_LEFT_OVERRIDE:Lkotlin/text/b;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lkotlin/text/b;->POP_DIRECTIONAL_FORMAT:Lkotlin/text/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/text/b;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "UNDEFINED"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v2, v3, v1}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lkotlin/text/b;->UNDEFINED:Lkotlin/text/b;

    .line 11
    .line 12
    new-instance v0, Lkotlin/text/b;

    .line 13
    .line 14
    const-string v1, "LEFT_TO_RIGHT"

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lkotlin/text/b;->LEFT_TO_RIGHT:Lkotlin/text/b;

    .line 21
    .line 22
    new-instance v0, Lkotlin/text/b;

    .line 23
    .line 24
    const-string v1, "RIGHT_TO_LEFT"

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lkotlin/text/b;->RIGHT_TO_LEFT:Lkotlin/text/b;

    .line 31
    .line 32
    new-instance v0, Lkotlin/text/b;

    .line 33
    .line 34
    const-string v1, "RIGHT_TO_LEFT_ARABIC"

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lkotlin/text/b;->RIGHT_TO_LEFT_ARABIC:Lkotlin/text/b;

    .line 41
    .line 42
    new-instance v0, Lkotlin/text/b;

    .line 43
    .line 44
    const-string v1, "EUROPEAN_NUMBER"

    .line 45
    .line 46
    const/4 v3, 0x4

    .line 47
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lkotlin/text/b;->EUROPEAN_NUMBER:Lkotlin/text/b;

    .line 51
    .line 52
    new-instance v0, Lkotlin/text/b;

    .line 53
    .line 54
    const-string v1, "EUROPEAN_NUMBER_SEPARATOR"

    .line 55
    .line 56
    const/4 v2, 0x5

    .line 57
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lkotlin/text/b;->EUROPEAN_NUMBER_SEPARATOR:Lkotlin/text/b;

    .line 61
    .line 62
    new-instance v0, Lkotlin/text/b;

    .line 63
    .line 64
    const-string v1, "EUROPEAN_NUMBER_TERMINATOR"

    .line 65
    .line 66
    const/4 v3, 0x6

    .line 67
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lkotlin/text/b;->EUROPEAN_NUMBER_TERMINATOR:Lkotlin/text/b;

    .line 71
    .line 72
    new-instance v0, Lkotlin/text/b;

    .line 73
    .line 74
    const-string v1, "ARABIC_NUMBER"

    .line 75
    .line 76
    const/4 v2, 0x7

    .line 77
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Lkotlin/text/b;->ARABIC_NUMBER:Lkotlin/text/b;

    .line 81
    .line 82
    new-instance v0, Lkotlin/text/b;

    .line 83
    .line 84
    const-string v1, "COMMON_NUMBER_SEPARATOR"

    .line 85
    .line 86
    const/16 v3, 0x8

    .line 87
    .line 88
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lkotlin/text/b;->COMMON_NUMBER_SEPARATOR:Lkotlin/text/b;

    .line 92
    .line 93
    new-instance v0, Lkotlin/text/b;

    .line 94
    .line 95
    const-string v1, "NONSPACING_MARK"

    .line 96
    .line 97
    const/16 v2, 0x9

    .line 98
    .line 99
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 100
    .line 101
    .line 102
    sput-object v0, Lkotlin/text/b;->NONSPACING_MARK:Lkotlin/text/b;

    .line 103
    .line 104
    new-instance v0, Lkotlin/text/b;

    .line 105
    .line 106
    const-string v1, "BOUNDARY_NEUTRAL"

    .line 107
    .line 108
    const/16 v3, 0xa

    .line 109
    .line 110
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 111
    .line 112
    .line 113
    sput-object v0, Lkotlin/text/b;->BOUNDARY_NEUTRAL:Lkotlin/text/b;

    .line 114
    .line 115
    new-instance v0, Lkotlin/text/b;

    .line 116
    .line 117
    const-string v1, "PARAGRAPH_SEPARATOR"

    .line 118
    .line 119
    const/16 v2, 0xb

    .line 120
    .line 121
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 122
    .line 123
    .line 124
    sput-object v0, Lkotlin/text/b;->PARAGRAPH_SEPARATOR:Lkotlin/text/b;

    .line 125
    .line 126
    new-instance v0, Lkotlin/text/b;

    .line 127
    .line 128
    const-string v1, "SEGMENT_SEPARATOR"

    .line 129
    .line 130
    const/16 v3, 0xc

    .line 131
    .line 132
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 133
    .line 134
    .line 135
    sput-object v0, Lkotlin/text/b;->SEGMENT_SEPARATOR:Lkotlin/text/b;

    .line 136
    .line 137
    new-instance v0, Lkotlin/text/b;

    .line 138
    .line 139
    const-string v1, "WHITESPACE"

    .line 140
    .line 141
    const/16 v2, 0xd

    .line 142
    .line 143
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 144
    .line 145
    .line 146
    sput-object v0, Lkotlin/text/b;->WHITESPACE:Lkotlin/text/b;

    .line 147
    .line 148
    new-instance v0, Lkotlin/text/b;

    .line 149
    .line 150
    const-string v1, "OTHER_NEUTRALS"

    .line 151
    .line 152
    const/16 v3, 0xe

    .line 153
    .line 154
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 155
    .line 156
    .line 157
    sput-object v0, Lkotlin/text/b;->OTHER_NEUTRALS:Lkotlin/text/b;

    .line 158
    .line 159
    new-instance v0, Lkotlin/text/b;

    .line 160
    .line 161
    const-string v1, "LEFT_TO_RIGHT_EMBEDDING"

    .line 162
    .line 163
    const/16 v2, 0xf

    .line 164
    .line 165
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 166
    .line 167
    .line 168
    sput-object v0, Lkotlin/text/b;->LEFT_TO_RIGHT_EMBEDDING:Lkotlin/text/b;

    .line 169
    .line 170
    new-instance v0, Lkotlin/text/b;

    .line 171
    .line 172
    const-string v1, "LEFT_TO_RIGHT_OVERRIDE"

    .line 173
    .line 174
    const/16 v3, 0x10

    .line 175
    .line 176
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 177
    .line 178
    .line 179
    sput-object v0, Lkotlin/text/b;->LEFT_TO_RIGHT_OVERRIDE:Lkotlin/text/b;

    .line 180
    .line 181
    new-instance v0, Lkotlin/text/b;

    .line 182
    .line 183
    const-string v1, "RIGHT_TO_LEFT_EMBEDDING"

    .line 184
    .line 185
    const/16 v2, 0x11

    .line 186
    .line 187
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 188
    .line 189
    .line 190
    sput-object v0, Lkotlin/text/b;->RIGHT_TO_LEFT_EMBEDDING:Lkotlin/text/b;

    .line 191
    .line 192
    new-instance v0, Lkotlin/text/b;

    .line 193
    .line 194
    const-string v1, "RIGHT_TO_LEFT_OVERRIDE"

    .line 195
    .line 196
    const/16 v3, 0x12

    .line 197
    .line 198
    invoke-direct {v0, v1, v3, v2}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 199
    .line 200
    .line 201
    sput-object v0, Lkotlin/text/b;->RIGHT_TO_LEFT_OVERRIDE:Lkotlin/text/b;

    .line 202
    .line 203
    new-instance v0, Lkotlin/text/b;

    .line 204
    .line 205
    const-string v1, "POP_DIRECTIONAL_FORMAT"

    .line 206
    .line 207
    const/16 v2, 0x13

    .line 208
    .line 209
    invoke-direct {v0, v1, v2, v3}, Lkotlin/text/b;-><init>(Ljava/lang/String;II)V

    .line 210
    .line 211
    .line 212
    sput-object v0, Lkotlin/text/b;->POP_DIRECTIONAL_FORMAT:Lkotlin/text/b;

    .line 213
    .line 214
    invoke-static {}, Lkotlin/text/b;->$values()[Lkotlin/text/b;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    sput-object v0, Lkotlin/text/b;->$VALUES:[Lkotlin/text/b;

    .line 219
    .line 220
    new-instance v1, Lkotlin/text/b$b;

    .line 221
    .line 222
    const/4 v2, 0x0

    .line 223
    invoke-direct {v1, v2}, Lkotlin/text/b$b;-><init>(Lkotlin/jvm/internal/w;)V

    .line 224
    .line 225
    .line 226
    sput-object v1, Lkotlin/text/b;->Companion:Lkotlin/text/b$b;

    .line 227
    .line 228
    sget-object v1, Lkotlin/text/b$a;->INSTANCE:Lkotlin/text/b$a;

    .line 229
    .line 230
    invoke-static {v1}, Lkotlin/e0;->c(Lv3/a;)Lkotlin/d0;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    sput-object v1, Lkotlin/text/b;->directionalityMap$delegate:Lkotlin/d0;

    .line 235
    .line 236
    invoke-static {v0}, Lkotlin/enums/b;->b([Ljava/lang/Enum;)Lkotlin/enums/a;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    sput-object v0, Lkotlin/text/b;->$ENTRIES:Lkotlin/enums/a;

    .line 241
    .line 242
    return-void
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
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lkotlin/text/b;->value:I

    return-void
.end method

.method public static final synthetic access$getDirectionalityMap$delegate$cp()Lkotlin/d0;
    .locals 1

    sget-object v0, Lkotlin/text/b;->directionalityMap$delegate:Lkotlin/d0;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/a<",
            "Lkotlin/text/b;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlin/text/b;->$ENTRIES:Lkotlin/enums/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/text/b;
    .locals 1

    const-class v0, Lkotlin/text/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/text/b;

    return-object p0
.end method

.method public static values()[Lkotlin/text/b;
    .locals 1

    sget-object v0, Lkotlin/text/b;->$VALUES:[Lkotlin/text/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/text/b;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lkotlin/text/b;->value:I

    return v0
.end method
