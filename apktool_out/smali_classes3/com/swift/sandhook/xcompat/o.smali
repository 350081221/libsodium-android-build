.class public Lcom/swift/sandhook/xcompat/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile addInstMethod:Ljava/lang/reflect/Method;

.field private static volatile specMethod:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static MD5(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "MD5"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/math/BigInteger;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, v2, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 22
    .line 23
    .line 24
    const/16 v0, 0x20

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-object p0

    .line 31
    :catch_0
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 33
    .line 34
    .line 35
    return-object p0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
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

.method public static addInstruction(Lcom/android/dx/Code;Lcom/android/dx/rop/code/Insn;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/swift/sandhook/xcompat/o;->addInstMethod:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    const-class v0, Lcom/android/dx/Code;

    .line 8
    .line 9
    const-string v3, "addInstruction"

    .line 10
    .line 11
    new-array v4, v2, [Ljava/lang/Class;

    .line 12
    .line 13
    const-class v5, Lcom/android/dx/rop/code/Insn;

    .line 14
    .line 15
    aput-object v5, v4, v1

    .line 16
    .line 17
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/swift/sandhook/xcompat/o;->addInstMethod:Ljava/lang/reflect/Method;

    .line 22
    .line 23
    sget-object v0, Lcom/swift/sandhook/xcompat/o;->addInstMethod:Ljava/lang/reflect/Method;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lcom/swift/sandhook/xcompat/o;->addInstMethod:Ljava/lang/reflect/Method;

    .line 34
    .line 35
    new-array v2, v2, [Ljava/lang/Object;

    .line 36
    .line 37
    aput-object p1, v2, v1

    .line 38
    .line 39
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :catch_1
    move-exception p0

    .line 44
    goto :goto_1

    .line 45
    :catch_2
    move-exception p0

    .line 46
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 47
    .line 48
    .line 49
    :goto_2
    return-void
    .line 50
.end method

.method public static autoBoxIfNecessary(Lcom/android/dx/Code;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Code;",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/android/dx/Local;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/Local;->getType()Lcom/android/dx/TypeId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/android/dx/TypeId;->BOOLEAN:Lcom/android/dx/TypeId;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    const-string v5, "valueOf"

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const-class v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-array v2, v4, [Lcom/android/dx/TypeId;

    .line 24
    .line 25
    aput-object v1, v2, v3

    .line 26
    .line 27
    invoke-virtual {v0, v0, v5, v2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-array v1, v4, [Lcom/android/dx/Local;

    .line 32
    .line 33
    aput-object p2, v1, v3

    .line 34
    .line 35
    invoke-virtual {p0, v0, p1, v1}, Lcom/android/dx/Code;->invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_0
    sget-object v1, Lcom/android/dx/TypeId;->BYTE:Lcom/android/dx/TypeId;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    const-class v0, Ljava/lang/Byte;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-array v2, v4, [Lcom/android/dx/TypeId;

    .line 55
    .line 56
    aput-object v1, v2, v3

    .line 57
    .line 58
    invoke-virtual {v0, v0, v5, v2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-array v1, v4, [Lcom/android/dx/Local;

    .line 63
    .line 64
    aput-object p2, v1, v3

    .line 65
    .line 66
    invoke-virtual {p0, v0, p1, v1}, Lcom/android/dx/Code;->invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_1
    sget-object v1, Lcom/android/dx/TypeId;->CHAR:Lcom/android/dx/TypeId;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    const-class v0, Ljava/lang/Character;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-array v2, v4, [Lcom/android/dx/TypeId;

    .line 86
    .line 87
    aput-object v1, v2, v3

    .line 88
    .line 89
    invoke-virtual {v0, v0, v5, v2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-array v1, v4, [Lcom/android/dx/Local;

    .line 94
    .line 95
    aput-object p2, v1, v3

    .line 96
    .line 97
    invoke-virtual {p0, v0, p1, v1}, Lcom/android/dx/Code;->invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :cond_2
    sget-object v1, Lcom/android/dx/TypeId;->DOUBLE:Lcom/android/dx/TypeId;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    const-class v0, Ljava/lang/Double;

    .line 111
    .line 112
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-array v2, v4, [Lcom/android/dx/TypeId;

    .line 117
    .line 118
    aput-object v1, v2, v3

    .line 119
    .line 120
    invoke-virtual {v0, v0, v5, v2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-array v1, v4, [Lcom/android/dx/Local;

    .line 125
    .line 126
    aput-object p2, v1, v3

    .line 127
    .line 128
    invoke-virtual {p0, v0, p1, v1}, Lcom/android/dx/Code;->invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_3
    sget-object v1, Lcom/android/dx/TypeId;->FLOAT:Lcom/android/dx/TypeId;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_4

    .line 140
    .line 141
    const-class v0, Ljava/lang/Float;

    .line 142
    .line 143
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    new-array v2, v4, [Lcom/android/dx/TypeId;

    .line 148
    .line 149
    aput-object v1, v2, v3

    .line 150
    .line 151
    invoke-virtual {v0, v0, v5, v2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    new-array v1, v4, [Lcom/android/dx/Local;

    .line 156
    .line 157
    aput-object p2, v1, v3

    .line 158
    .line 159
    invoke-virtual {p0, v0, p1, v1}, Lcom/android/dx/Code;->invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_4
    sget-object v1, Lcom/android/dx/TypeId;->INT:Lcom/android/dx/TypeId;

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_5

    .line 170
    .line 171
    const-class v0, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    new-array v2, v4, [Lcom/android/dx/TypeId;

    .line 178
    .line 179
    aput-object v1, v2, v3

    .line 180
    .line 181
    invoke-virtual {v0, v0, v5, v2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    new-array v1, v4, [Lcom/android/dx/Local;

    .line 186
    .line 187
    aput-object p2, v1, v3

    .line 188
    .line 189
    invoke-virtual {p0, v0, p1, v1}, Lcom/android/dx/Code;->invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 190
    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_5
    sget-object v1, Lcom/android/dx/TypeId;->LONG:Lcom/android/dx/TypeId;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_6

    .line 200
    .line 201
    const-class v0, Ljava/lang/Long;

    .line 202
    .line 203
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    new-array v2, v4, [Lcom/android/dx/TypeId;

    .line 208
    .line 209
    aput-object v1, v2, v3

    .line 210
    .line 211
    invoke-virtual {v0, v0, v5, v2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    new-array v1, v4, [Lcom/android/dx/Local;

    .line 216
    .line 217
    aput-object p2, v1, v3

    .line 218
    .line 219
    invoke-virtual {p0, v0, p1, v1}, Lcom/android/dx/Code;->invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 220
    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_6
    sget-object v1, Lcom/android/dx/TypeId;->SHORT:Lcom/android/dx/TypeId;

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_7

    .line 230
    .line 231
    const-class v0, Ljava/lang/Short;

    .line 232
    .line 233
    invoke-static {v0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-array v2, v4, [Lcom/android/dx/TypeId;

    .line 238
    .line 239
    aput-object v1, v2, v3

    .line 240
    .line 241
    invoke-virtual {v0, v0, v5, v2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-array v1, v4, [Lcom/android/dx/Local;

    .line 246
    .line 247
    aput-object p2, v1, v3

    .line 248
    .line 249
    invoke-virtual {p0, v0, p1, v1}, Lcom/android/dx/Code;->invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 250
    .line 251
    .line 252
    goto :goto_0

    .line 253
    :cond_7
    sget-object v1, Lcom/android/dx/TypeId;->VOID:Lcom/android/dx/TypeId;

    .line 254
    .line 255
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_8

    .line 260
    .line 261
    const/4 p2, 0x0

    .line 262
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto :goto_0

    .line 266
    :cond_8
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/Code;->move(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 267
    .line 268
    .line 269
    :goto_0
    return-void
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
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
.end method

.method public static autoUnboxIfNecessary(Lcom/android/dx/Code;Lcom/android/dx/Local;Lcom/android/dx/Local;Ljava/util/Map;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Code;",
            "Lcom/android/dx/Local;",
            "Lcom/android/dx/Local;",
            "Ljava/util/Map<",
            "Lcom/android/dx/TypeId;",
            "Lcom/android/dx/Local;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/Local;->getType()Lcom/android/dx/TypeId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/android/dx/TypeId;->BOOLEAN:Lcom/android/dx/TypeId;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const-string p4, "Ljava/lang/Boolean;"

    .line 15
    .line 16
    invoke-static {p4}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    check-cast p3, Lcom/android/dx/Local;

    .line 25
    .line 26
    invoke-virtual {p0, p3, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 27
    .line 28
    .line 29
    new-array p2, v3, [Lcom/android/dx/TypeId;

    .line 30
    .line 31
    const-string v0, "booleanValue"

    .line 32
    .line 33
    invoke-virtual {p4, v1, v0, p2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    new-array p4, v3, [Lcom/android/dx/Local;

    .line 38
    .line 39
    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/android/dx/Code;->invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :cond_0
    sget-object v1, Lcom/android/dx/TypeId;->BYTE:Lcom/android/dx/TypeId;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    const-string p4, "Ljava/lang/Byte;"

    .line 53
    .line 54
    invoke-static {p4}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    check-cast p3, Lcom/android/dx/Local;

    .line 63
    .line 64
    invoke-virtual {p0, p3, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 65
    .line 66
    .line 67
    new-array p2, v3, [Lcom/android/dx/TypeId;

    .line 68
    .line 69
    const-string v0, "byteValue"

    .line 70
    .line 71
    invoke-virtual {p4, v1, v0, p2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    new-array p4, v3, [Lcom/android/dx/Local;

    .line 76
    .line 77
    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/android/dx/Code;->invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :cond_1
    sget-object v1, Lcom/android/dx/TypeId;->CHAR:Lcom/android/dx/TypeId;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    const-string p4, "Ljava/lang/Character;"

    .line 91
    .line 92
    invoke-static {p4}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    check-cast p3, Lcom/android/dx/Local;

    .line 101
    .line 102
    invoke-virtual {p0, p3, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 103
    .line 104
    .line 105
    new-array p2, v3, [Lcom/android/dx/TypeId;

    .line 106
    .line 107
    const-string v0, "charValue"

    .line 108
    .line 109
    invoke-virtual {p4, v1, v0, p2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    new-array p4, v3, [Lcom/android/dx/Local;

    .line 114
    .line 115
    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/android/dx/Code;->invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_2
    sget-object v1, Lcom/android/dx/TypeId;->DOUBLE:Lcom/android/dx/TypeId;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_3

    .line 127
    .line 128
    const-string p4, "Ljava/lang/Double;"

    .line 129
    .line 130
    invoke-static {p4}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 131
    .line 132
    .line 133
    move-result-object p4

    .line 134
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    check-cast p3, Lcom/android/dx/Local;

    .line 139
    .line 140
    invoke-virtual {p0, p3, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 141
    .line 142
    .line 143
    new-array p2, v3, [Lcom/android/dx/TypeId;

    .line 144
    .line 145
    const-string v0, "doubleValue"

    .line 146
    .line 147
    invoke-virtual {p4, v1, v0, p2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    new-array p4, v3, [Lcom/android/dx/Local;

    .line 152
    .line 153
    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/android/dx/Code;->invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_3
    sget-object v1, Lcom/android/dx/TypeId;->FLOAT:Lcom/android/dx/TypeId;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_4

    .line 165
    .line 166
    const-string p4, "Ljava/lang/Float;"

    .line 167
    .line 168
    invoke-static {p4}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    check-cast p3, Lcom/android/dx/Local;

    .line 177
    .line 178
    invoke-virtual {p0, p3, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 179
    .line 180
    .line 181
    new-array p2, v3, [Lcom/android/dx/TypeId;

    .line 182
    .line 183
    const-string v0, "floatValue"

    .line 184
    .line 185
    invoke-virtual {p4, v1, v0, p2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    new-array p4, v3, [Lcom/android/dx/Local;

    .line 190
    .line 191
    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/android/dx/Code;->invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_4
    sget-object v1, Lcom/android/dx/TypeId;->INT:Lcom/android/dx/TypeId;

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_5

    .line 203
    .line 204
    const-string p4, "Ljava/lang/Integer;"

    .line 205
    .line 206
    invoke-static {p4}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 207
    .line 208
    .line 209
    move-result-object p4

    .line 210
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    check-cast p3, Lcom/android/dx/Local;

    .line 215
    .line 216
    invoke-virtual {p0, p3, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 217
    .line 218
    .line 219
    new-array p2, v3, [Lcom/android/dx/TypeId;

    .line 220
    .line 221
    const-string v0, "intValue"

    .line 222
    .line 223
    invoke-virtual {p4, v1, v0, p2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    new-array p4, v3, [Lcom/android/dx/Local;

    .line 228
    .line 229
    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/android/dx/Code;->invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 230
    .line 231
    .line 232
    goto :goto_0

    .line 233
    :cond_5
    sget-object v1, Lcom/android/dx/TypeId;->LONG:Lcom/android/dx/TypeId;

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_6

    .line 240
    .line 241
    const-string p4, "Ljava/lang/Long;"

    .line 242
    .line 243
    invoke-static {p4}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 244
    .line 245
    .line 246
    move-result-object p4

    .line 247
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p3

    .line 251
    check-cast p3, Lcom/android/dx/Local;

    .line 252
    .line 253
    invoke-virtual {p0, p3, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 254
    .line 255
    .line 256
    new-array p2, v3, [Lcom/android/dx/TypeId;

    .line 257
    .line 258
    const-string v0, "longValue"

    .line 259
    .line 260
    invoke-virtual {p4, v1, v0, p2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    new-array p4, v3, [Lcom/android/dx/Local;

    .line 265
    .line 266
    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/android/dx/Code;->invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 267
    .line 268
    .line 269
    goto :goto_0

    .line 270
    :cond_6
    sget-object v1, Lcom/android/dx/TypeId;->SHORT:Lcom/android/dx/TypeId;

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-eqz v2, :cond_7

    .line 277
    .line 278
    const-string p4, "Ljava/lang/Short;"

    .line 279
    .line 280
    invoke-static {p4}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 281
    .line 282
    .line 283
    move-result-object p4

    .line 284
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p3

    .line 288
    check-cast p3, Lcom/android/dx/Local;

    .line 289
    .line 290
    invoke-virtual {p0, p3, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 291
    .line 292
    .line 293
    new-array p2, v3, [Lcom/android/dx/TypeId;

    .line 294
    .line 295
    const-string v0, "shortValue"

    .line 296
    .line 297
    invoke-virtual {p4, v1, v0, p2}, Lcom/android/dx/TypeId;->getMethod(Lcom/android/dx/TypeId;Ljava/lang/String;[Lcom/android/dx/TypeId;)Lcom/android/dx/MethodId;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    new-array p4, v3, [Lcom/android/dx/Local;

    .line 302
    .line 303
    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/android/dx/Code;->invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 304
    .line 305
    .line 306
    goto :goto_0

    .line 307
    :cond_7
    sget-object p3, Lcom/android/dx/TypeId;->VOID:Lcom/android/dx/TypeId;

    .line 308
    .line 309
    invoke-virtual {v0, p3}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p3

    .line 313
    if-eqz p3, :cond_8

    .line 314
    .line 315
    const/4 p2, 0x0

    .line 316
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    goto :goto_0

    .line 320
    :cond_8
    if-eqz p4, :cond_9

    .line 321
    .line 322
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/Code;->cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 323
    .line 324
    .line 325
    goto :goto_0

    .line 326
    :cond_9
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/Code;->move(Lcom/android/dx/Local;Lcom/android/dx/Local;)V

    .line 327
    .line 328
    .line 329
    :goto_0
    return-void
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
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
.end method

.method public static createResultLocals(Lcom/android/dx/Code;)Ljava/util/Map;
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Code;",
            ")",
            "Ljava/util/Map<",
            "Lcom/android/dx/TypeId;",
            "Lcom/android/dx/Local;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lcom/android/dx/TypeId;->BOOLEAN:Lcom/android/dx/TypeId;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/android/dx/TypeId;->BYTE:Lcom/android/dx/TypeId;

    .line 15
    .line 16
    invoke-virtual {v0, v4}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    sget-object v6, Lcom/android/dx/TypeId;->CHAR:Lcom/android/dx/TypeId;

    .line 21
    .line 22
    invoke-virtual {v0, v6}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    sget-object v8, Lcom/android/dx/TypeId;->DOUBLE:Lcom/android/dx/TypeId;

    .line 27
    .line 28
    invoke-virtual {v0, v8}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    sget-object v10, Lcom/android/dx/TypeId;->FLOAT:Lcom/android/dx/TypeId;

    .line 33
    .line 34
    invoke-virtual {v0, v10}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    sget-object v12, Lcom/android/dx/TypeId;->INT:Lcom/android/dx/TypeId;

    .line 39
    .line 40
    invoke-virtual {v0, v12}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    sget-object v14, Lcom/android/dx/TypeId;->LONG:Lcom/android/dx/TypeId;

    .line 45
    .line 46
    invoke-virtual {v0, v14}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 47
    .line 48
    .line 49
    move-result-object v15

    .line 50
    move-object/from16 v16, v14

    .line 51
    .line 52
    sget-object v14, Lcom/android/dx/TypeId;->SHORT:Lcom/android/dx/TypeId;

    .line 53
    .line 54
    move-object/from16 v17, v12

    .line 55
    .line 56
    invoke-virtual {v0, v14}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    move-object/from16 v18, v14

    .line 61
    .line 62
    sget-object v14, Lcom/android/dx/TypeId;->VOID:Lcom/android/dx/TypeId;

    .line 63
    .line 64
    move-object/from16 v19, v10

    .line 65
    .line 66
    invoke-virtual {v0, v14}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    move-object/from16 v20, v14

    .line 71
    .line 72
    sget-object v14, Lcom/android/dx/TypeId;->OBJECT:Lcom/android/dx/TypeId;

    .line 73
    .line 74
    move-object/from16 v21, v8

    .line 75
    .line 76
    invoke-virtual {v0, v14}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    const-string v22, "Ljava/lang/Boolean;"

    .line 81
    .line 82
    move-object/from16 v23, v14

    .line 83
    .line 84
    invoke-static/range {v22 .. v22}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    invoke-virtual {v0, v14}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    const-string v24, "Ljava/lang/Byte;"

    .line 93
    .line 94
    move-object/from16 v25, v6

    .line 95
    .line 96
    invoke-static/range {v24 .. v24}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v0, v6}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    const-string v26, "Ljava/lang/Character;"

    .line 105
    .line 106
    move-object/from16 v27, v4

    .line 107
    .line 108
    invoke-static/range {v26 .. v26}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v0, v4}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const-string v28, "Ljava/lang/Double;"

    .line 117
    .line 118
    move-object/from16 v29, v1

    .line 119
    .line 120
    invoke-static/range {v28 .. v28}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v30, "Ljava/lang/Float;"

    .line 129
    .line 130
    move-object/from16 v31, v2

    .line 131
    .line 132
    invoke-static/range {v30 .. v30}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v0, v2}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const-string v32, "Ljava/lang/Integer;"

    .line 141
    .line 142
    move-object/from16 v33, v2

    .line 143
    .line 144
    invoke-static/range {v32 .. v32}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v0, v2}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    const-string v34, "Ljava/lang/Long;"

    .line 153
    .line 154
    move-object/from16 v35, v2

    .line 155
    .line 156
    invoke-static/range {v34 .. v34}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v0, v2}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const-string v36, "Ljava/lang/Short;"

    .line 165
    .line 166
    move-object/from16 v37, v2

    .line 167
    .line 168
    invoke-static/range {v36 .. v36}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v0, v2}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-string v38, "Ljava/lang/Void;"

    .line 177
    .line 178
    move-object/from16 v39, v2

    .line 179
    .line 180
    invoke-static/range {v38 .. v38}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v0, v2}, Lcom/android/dx/Code;->newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    move-object/from16 v40, v2

    .line 189
    .line 190
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-virtual {v0, v3, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    const/4 v2, 0x0

    .line 196
    move-object/from16 v41, v3

    .line 197
    .line 198
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v0, v5, v3}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v0, v7, v3}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    const-wide/16 v42, 0x0

    .line 213
    .line 214
    invoke-static/range {v42 .. v43}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {v0, v9, v3}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    const/4 v3, 0x0

    .line 222
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {v0, v11, v3}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v0, v13, v3}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    const-wide/16 v42, 0x0

    .line 237
    .line 238
    invoke-static/range {v42 .. v43}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {v0, v15, v3}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v0, v12, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    const/4 v2, 0x0

    .line 253
    invoke-virtual {v0, v10, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v8, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v14, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v6, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v4, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v1, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    move-object/from16 v3, v33

    .line 272
    .line 273
    invoke-virtual {v0, v3, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    move-object/from16 v3, v35

    .line 277
    .line 278
    invoke-virtual {v0, v3, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    move-object/from16 v3, v37

    .line 282
    .line 283
    invoke-virtual {v0, v3, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    move-object/from16 v3, v39

    .line 287
    .line 288
    invoke-virtual {v0, v3, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    move-object/from16 v3, v40

    .line 292
    .line 293
    invoke-virtual {v0, v3, v2}, Lcom/android/dx/Code;->loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v0, v29

    .line 297
    .line 298
    move-object/from16 v2, v31

    .line 299
    .line 300
    move-object/from16 v3, v41

    .line 301
    .line 302
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-object/from16 v2, v27

    .line 306
    .line 307
    invoke-virtual {v0, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-object/from16 v2, v25

    .line 311
    .line 312
    invoke-virtual {v0, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-object/from16 v2, v21

    .line 316
    .line 317
    invoke-virtual {v0, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-object/from16 v2, v19

    .line 321
    .line 322
    invoke-virtual {v0, v2, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-object/from16 v2, v17

    .line 326
    .line 327
    invoke-virtual {v0, v2, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-object/from16 v2, v16

    .line 331
    .line 332
    invoke-virtual {v0, v2, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v18

    .line 336
    .line 337
    invoke-virtual {v0, v2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-object/from16 v2, v20

    .line 341
    .line 342
    invoke-virtual {v0, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-object/from16 v2, v23

    .line 346
    .line 347
    invoke-virtual {v0, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    invoke-static/range {v22 .. v22}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-virtual {v0, v2, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    invoke-static/range {v24 .. v24}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v0, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    invoke-static/range {v26 .. v26}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    invoke-static/range {v28 .. v28}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    invoke-static/range {v30 .. v30}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    move-object/from16 v2, v33

    .line 383
    .line 384
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    invoke-static/range {v32 .. v32}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    move-object/from16 v2, v35

    .line 392
    .line 393
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    invoke-static/range {v34 .. v34}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    move-object/from16 v2, v37

    .line 401
    .line 402
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    invoke-static/range {v36 .. v36}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    move-object/from16 v2, v39

    .line 410
    .line 411
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    invoke-static/range {v38 .. v38}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    move-object/from16 v2, v40

    .line 419
    .line 420
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    return-object v0
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
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
.end method

.method public static getObjTypeIdIfPrimitive(Lcom/android/dx/TypeId;)Lcom/android/dx/TypeId;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/TypeId;->BOOLEAN:Lcom/android/dx/TypeId;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "Ljava/lang/Boolean;"

    .line 10
    .line 11
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Lcom/android/dx/TypeId;->BYTE:Lcom/android/dx/TypeId;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-string p0, "Ljava/lang/Byte;"

    .line 25
    .line 26
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    sget-object v0, Lcom/android/dx/TypeId;->CHAR:Lcom/android/dx/TypeId;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-string p0, "Ljava/lang/Character;"

    .line 40
    .line 41
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    sget-object v0, Lcom/android/dx/TypeId;->DOUBLE:Lcom/android/dx/TypeId;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    const-string p0, "Ljava/lang/Double;"

    .line 55
    .line 56
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_3
    sget-object v0, Lcom/android/dx/TypeId;->FLOAT:Lcom/android/dx/TypeId;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    const-string p0, "Ljava/lang/Float;"

    .line 70
    .line 71
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    sget-object v0, Lcom/android/dx/TypeId;->INT:Lcom/android/dx/TypeId;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    const-string p0, "Ljava/lang/Integer;"

    .line 85
    .line 86
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_5
    sget-object v0, Lcom/android/dx/TypeId;->LONG:Lcom/android/dx/TypeId;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    const-string p0, "Ljava/lang/Long;"

    .line 100
    .line 101
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_6
    sget-object v0, Lcom/android/dx/TypeId;->SHORT:Lcom/android/dx/TypeId;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    const-string p0, "Ljava/lang/Short;"

    .line 115
    .line 116
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :cond_7
    sget-object v0, Lcom/android/dx/TypeId;->VOID:Lcom/android/dx/TypeId;

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    const-string p0, "Ljava/lang/Void;"

    .line 130
    .line 131
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/String;)Lcom/android/dx/TypeId;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    :cond_8
    return-object p0
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
.end method

.method public static moveException(Lcom/android/dx/Code;Lcom/android/dx/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Code;",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/type/Type;->THROWABLE:Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/android/dx/rop/code/Rops;->opMoveException(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/swift/sandhook/xcompat/o;->spec(Lcom/android/dx/Local;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v3, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1, v3}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, Lcom/swift/sandhook/xcompat/o;->addInstruction(Lcom/android/dx/Code;Lcom/android/dx/rop/code/Insn;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static returnRightValue(Lcom/android/dx/Code;Ljava/lang/Class;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Code;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lcom/android/dx/Local;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/dx/Local;

    invoke-virtual {p0, p1}, Lcom/android/dx/Code;->returnValue(Lcom/android/dx/Local;)V

    return-void
.end method

.method public static spec(Lcom/android/dx/Local;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;)",
            "Lcom/android/dx/rop/code/RegisterSpec;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/swift/sandhook/xcompat/o;->specMethod:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    const-class v0, Lcom/android/dx/Local;

    .line 7
    .line 8
    const-string v2, "spec"

    .line 9
    .line 10
    new-array v3, v1, [Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lcom/swift/sandhook/xcompat/o;->specMethod:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    sget-object v0, Lcom/swift/sandhook/xcompat/o;->specMethod:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lcom/swift/sandhook/xcompat/o;->specMethod:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lcom/android/dx/rop/code/RegisterSpec;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 38
    .line 39
    return-object p0

    .line 40
    :catch_1
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :catch_2
    move-exception p0

    .line 43
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
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
