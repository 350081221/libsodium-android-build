.class public final Lcom/android/dx/TypeId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final BOOLEAN:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final BYTE:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation
.end field

.field public static final CHAR:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public static final DOUBLE:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLOAT:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final INT:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final LONG:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final OBJECT:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final PRIMITIVE_TO_TYPE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/android/dx/TypeId<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static final SHORT:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation
.end field

.field public static final STRING:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final VOID:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final constant:Lcom/android/dx/rop/cst/CstType;

.field final name:Ljava/lang/String;

.field final ropType:Lcom/android/dx/rop/type/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/android/dx/TypeId;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/type/Type;->BOOLEAN:Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/android/dx/TypeId;->BOOLEAN:Lcom/android/dx/TypeId;

    .line 9
    .line 10
    new-instance v1, Lcom/android/dx/TypeId;

    .line 11
    .line 12
    sget-object v2, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/android/dx/TypeId;->BYTE:Lcom/android/dx/TypeId;

    .line 18
    .line 19
    new-instance v2, Lcom/android/dx/TypeId;

    .line 20
    .line 21
    sget-object v3, Lcom/android/dx/rop/type/Type;->CHAR:Lcom/android/dx/rop/type/Type;

    .line 22
    .line 23
    invoke-direct {v2, v3}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 24
    .line 25
    .line 26
    sput-object v2, Lcom/android/dx/TypeId;->CHAR:Lcom/android/dx/TypeId;

    .line 27
    .line 28
    new-instance v3, Lcom/android/dx/TypeId;

    .line 29
    .line 30
    sget-object v4, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 31
    .line 32
    invoke-direct {v3, v4}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 33
    .line 34
    .line 35
    sput-object v3, Lcom/android/dx/TypeId;->DOUBLE:Lcom/android/dx/TypeId;

    .line 36
    .line 37
    new-instance v4, Lcom/android/dx/TypeId;

    .line 38
    .line 39
    sget-object v5, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 40
    .line 41
    invoke-direct {v4, v5}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 42
    .line 43
    .line 44
    sput-object v4, Lcom/android/dx/TypeId;->FLOAT:Lcom/android/dx/TypeId;

    .line 45
    .line 46
    new-instance v5, Lcom/android/dx/TypeId;

    .line 47
    .line 48
    sget-object v6, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 49
    .line 50
    invoke-direct {v5, v6}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 51
    .line 52
    .line 53
    sput-object v5, Lcom/android/dx/TypeId;->INT:Lcom/android/dx/TypeId;

    .line 54
    .line 55
    new-instance v6, Lcom/android/dx/TypeId;

    .line 56
    .line 57
    sget-object v7, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 58
    .line 59
    invoke-direct {v6, v7}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 60
    .line 61
    .line 62
    sput-object v6, Lcom/android/dx/TypeId;->LONG:Lcom/android/dx/TypeId;

    .line 63
    .line 64
    new-instance v7, Lcom/android/dx/TypeId;

    .line 65
    .line 66
    sget-object v8, Lcom/android/dx/rop/type/Type;->SHORT:Lcom/android/dx/rop/type/Type;

    .line 67
    .line 68
    invoke-direct {v7, v8}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 69
    .line 70
    .line 71
    sput-object v7, Lcom/android/dx/TypeId;->SHORT:Lcom/android/dx/TypeId;

    .line 72
    .line 73
    new-instance v8, Lcom/android/dx/TypeId;

    .line 74
    .line 75
    sget-object v9, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 76
    .line 77
    invoke-direct {v8, v9}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 78
    .line 79
    .line 80
    sput-object v8, Lcom/android/dx/TypeId;->VOID:Lcom/android/dx/TypeId;

    .line 81
    .line 82
    new-instance v9, Lcom/android/dx/TypeId;

    .line 83
    .line 84
    sget-object v10, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 85
    .line 86
    invoke-direct {v9, v10}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 87
    .line 88
    .line 89
    sput-object v9, Lcom/android/dx/TypeId;->OBJECT:Lcom/android/dx/TypeId;

    .line 90
    .line 91
    new-instance v9, Lcom/android/dx/TypeId;

    .line 92
    .line 93
    sget-object v10, Lcom/android/dx/rop/type/Type;->STRING:Lcom/android/dx/rop/type/Type;

    .line 94
    .line 95
    invoke-direct {v9, v10}, Lcom/android/dx/TypeId;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 96
    .line 97
    .line 98
    sput-object v9, Lcom/android/dx/TypeId;->STRING:Lcom/android/dx/TypeId;

    .line 99
    .line 100
    new-instance v9, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 103
    .line 104
    .line 105
    sput-object v9, Lcom/android/dx/TypeId;->PRIMITIVE_TO_TYPE:Ljava/util/Map;

    .line 106
    .line 107
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    invoke-interface {v9, v10, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 113
    .line 114
    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    invoke-interface {v9, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    invoke-interface {v9, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 128
    .line 129
    invoke-interface {v9, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 133
    .line 134
    invoke-interface {v9, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 138
    .line 139
    invoke-interface {v9, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 143
    .line 144
    invoke-interface {v9, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 148
    .line 149
    invoke-interface {v9, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    return-void
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

.method constructor <init>(Lcom/android/dx/rop/type/Type;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/android/dx/TypeId;-><init>(Ljava/lang/String;Lcom/android/dx/rop/type/Type;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/android/dx/rop/type/Type;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 3
    iput-object p1, p0, Lcom/android/dx/TypeId;->name:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 5
    invoke-static {p2}, Lcom/android/dx/rop/cst/CstType;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstType;

    move-result-object p1

    iput-object p1, p0, Lcom/android/dx/TypeId;->constant:Lcom/android/dx/rop/cst/CstType;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 6
    throw p1
.end method

.method public static get(Ljava/lang/Class;)Lcom/android/dx/TypeId;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/android/dx/TypeId<",
            "TT;>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/android/dx/TypeId;->PRIMITIVE_TO_TYPE:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/android/dx/TypeId;

    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x4c

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    move-result-object p0

    return-object p0
.end method

.method public static get(Ljava/lang/String;)Lcom/android/dx/TypeId;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lcom/android/dx/TypeId<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/TypeId;

    invoke-static {p0}, Lcom/android/dx/rop/type/Type;->internReturnType(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/android/dx/TypeId;-><init>(Ljava/lang/String;Lcom/android/dx/rop/type/Type;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/TypeId;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/android/dx/TypeId;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/android/dx/TypeId;->name:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/TypeId;->name:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    return p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public varargs getConstructor([Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/android/dx/TypeId<",
            "*>;)",
            "Lcom/android/dx/MethodId<",
            "TT;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/android/dx/MethodId;

    sget-object v1, Lcom/android/dx/TypeId;->VOID:Lcom/android/dx/TypeId;

    new-instance v2, Lcom/android/dx/TypeList;

    invoke-direct {v2, p1}, Lcom/android/dx/TypeList;-><init>([Lcom/android/dx/TypeId;)V

    const-string p1, "<init>"

    invoke-direct {v0, p0, v1, p1, v2}, Lcom/android/dx/MethodId;-><init>(Lcom/android/dx/TypeId;Lcom/android/dx/TypeId;Ljava/lang/String;Lcom/android/dx/TypeList;)V

    return-object v0
.end method

.method public getField(Lcom/android/dx/TypeId;Ljava/lang/String;)Lcom/android/dx/FieldId;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/TypeId<",
            "TV;>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/android/dx/FieldId<",
            "TT;TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/android/dx/FieldId;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/dx/FieldId;-><init>(Lcom/android/dx/TypeId;Lcom/android/dx/TypeId;Ljava/lang/String;)V

    return-object v0
.end method

.method public varargs getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/TypeId<",
            "TR;>;",
            "Ljava/lang/String;",
            "[",
            "Lcom/android/dx/TypeId<",
            "*>;)",
            "Lcom/android/dx/MethodId<",
            "TT;TR;>;"
        }
    .end annotation

    new-instance v0, Lcom/android/dx/MethodId;

    new-instance v1, Lcom/android/dx/TypeList;

    invoke-direct {v1, p3}, Lcom/android/dx/TypeList;-><init>([Lcom/android/dx/TypeId;)V

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/android/dx/MethodId;-><init>(Lcom/android/dx/TypeId;Lcom/android/dx/TypeId;Ljava/lang/String;Lcom/android/dx/TypeList;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/TypeId;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getStaticInitializer()Lcom/android/dx/MethodId;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/dx/MethodId<",
            "TT;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/android/dx/MethodId;

    sget-object v1, Lcom/android/dx/TypeId;->VOID:Lcom/android/dx/TypeId;

    new-instance v2, Lcom/android/dx/TypeList;

    const/4 v3, 0x0

    new-array v3, v3, [Lcom/android/dx/TypeId;

    invoke-direct {v2, v3}, Lcom/android/dx/TypeList;-><init>([Lcom/android/dx/TypeId;)V

    const-string v3, "<clinit>"

    invoke-direct {v0, p0, v1, v3, v2}, Lcom/android/dx/MethodId;-><init>(Lcom/android/dx/TypeId;Lcom/android/dx/TypeId;Ljava/lang/String;Lcom/android/dx/TypeList;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/TypeId;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/TypeId;->name:Ljava/lang/String;

    return-object v0
.end method
