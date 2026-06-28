.class Lcom/android/dx/DexMaker$TypeDeclaration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/DexMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "TypeDeclaration"
.end annotation


# instance fields
.field private classDefItem:Lcom/android/dx/dex/file/ClassDefItem;

.field private declared:Z

.field private final fields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/android/dx/FieldId;",
            "Lcom/android/dx/DexMaker$FieldDeclaration;",
            ">;"
        }
    .end annotation
.end field

.field private flags:I

.field private interfaces:Lcom/android/dx/TypeList;

.field private final methods:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/android/dx/MethodId;",
            "Lcom/android/dx/DexMaker$MethodDeclaration;",
            ">;"
        }
    .end annotation
.end field

.field private sourceFile:Ljava/lang/String;

.field private supertype:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "*>;"
        }
    .end annotation
.end field

.field private final type:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/android/dx/TypeId;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/TypeId<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->fields:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->methods:Ljava/util/Map;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->type:Lcom/android/dx/TypeId;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method static synthetic access$000(Lcom/android/dx/DexMaker$TypeDeclaration;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->declared:Z

    return p0
.end method

.method static synthetic access$002(Lcom/android/dx/DexMaker$TypeDeclaration;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->declared:Z

    return p1
.end method

.method static synthetic access$102(Lcom/android/dx/DexMaker$TypeDeclaration;I)I
    .locals 0

    iput p1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->flags:I

    return p1
.end method

.method static synthetic access$200(Lcom/android/dx/DexMaker$TypeDeclaration;)Lcom/android/dx/TypeId;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->supertype:Lcom/android/dx/TypeId;

    return-object p0
.end method

.method static synthetic access$202(Lcom/android/dx/DexMaker$TypeDeclaration;Lcom/android/dx/TypeId;)Lcom/android/dx/TypeId;
    .locals 0

    iput-object p1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->supertype:Lcom/android/dx/TypeId;

    return-object p1
.end method

.method static synthetic access$302(Lcom/android/dx/DexMaker$TypeDeclaration;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->sourceFile:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$400(Lcom/android/dx/DexMaker$TypeDeclaration;)Lcom/android/dx/TypeList;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->interfaces:Lcom/android/dx/TypeList;

    return-object p0
.end method

.method static synthetic access$402(Lcom/android/dx/DexMaker$TypeDeclaration;Lcom/android/dx/TypeList;)Lcom/android/dx/TypeList;
    .locals 0

    iput-object p1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->interfaces:Lcom/android/dx/TypeList;

    return-object p1
.end method

.method static synthetic access$500(Lcom/android/dx/DexMaker$TypeDeclaration;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->methods:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$700(Lcom/android/dx/DexMaker$TypeDeclaration;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->fields:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method toClassDefItem()Lcom/android/dx/dex/file/ClassDefItem;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->declared:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    new-instance v0, Lcom/android/dx/dex/DexOptions;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/android/dx/dex/DexOptions;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0xd

    .line 11
    .line 12
    iput v1, v0, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->type:Lcom/android/dx/TypeId;

    .line 15
    .line 16
    iget-object v3, v1, Lcom/android/dx/TypeId;->constant:Lcom/android/dx/rop/cst/CstType;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->classDefItem:Lcom/android/dx/dex/file/ClassDefItem;

    .line 19
    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    new-instance v1, Lcom/android/dx/dex/file/ClassDefItem;

    .line 23
    .line 24
    iget v4, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->flags:I

    .line 25
    .line 26
    iget-object v2, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->supertype:Lcom/android/dx/TypeId;

    .line 27
    .line 28
    iget-object v5, v2, Lcom/android/dx/TypeId;->constant:Lcom/android/dx/rop/cst/CstType;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->interfaces:Lcom/android/dx/TypeList;

    .line 31
    .line 32
    iget-object v6, v2, Lcom/android/dx/TypeList;->ropTypes:Lcom/android/dx/rop/type/StdTypeList;

    .line 33
    .line 34
    new-instance v7, Lcom/android/dx/rop/cst/CstString;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->sourceFile:Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {v7, v2}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object v2, v1

    .line 42
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/dex/file/ClassDefItem;-><init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstString;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->classDefItem:Lcom/android/dx/dex/file/ClassDefItem;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->methods:Ljava/util/Map;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Lcom/android/dx/DexMaker$MethodDeclaration;

    .line 68
    .line 69
    invoke-virtual {v2, v0}, Lcom/android/dx/DexMaker$MethodDeclaration;->toEncodedMethod(Lcom/android/dx/dex/DexOptions;)Lcom/android/dx/dex/file/EncodedMethod;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v2}, Lcom/android/dx/DexMaker$MethodDeclaration;->isDirect()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_0

    .line 78
    .line 79
    iget-object v2, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->classDefItem:Lcom/android/dx/dex/file/ClassDefItem;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Lcom/android/dx/dex/file/ClassDefItem;->addDirectMethod(Lcom/android/dx/dex/file/EncodedMethod;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iget-object v2, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->classDefItem:Lcom/android/dx/dex/file/ClassDefItem;

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Lcom/android/dx/dex/file/ClassDefItem;->addVirtualMethod(Lcom/android/dx/dex/file/EncodedMethod;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    iget-object v0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->fields:Ljava/util/Map;

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Lcom/android/dx/DexMaker$FieldDeclaration;

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/android/dx/DexMaker$FieldDeclaration;->toEncodedField()Lcom/android/dx/dex/file/EncodedField;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1}, Lcom/android/dx/DexMaker$FieldDeclaration;->isStatic()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_2

    .line 122
    .line 123
    iget-object v3, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->classDefItem:Lcom/android/dx/dex/file/ClassDefItem;

    .line 124
    .line 125
    invoke-static {v1}, Lcom/android/dx/DexMaker$FieldDeclaration;->access$800(Lcom/android/dx/DexMaker$FieldDeclaration;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v1}, Lcom/android/dx/Constants;->getConstant(Ljava/lang/Object;)Lcom/android/dx/rop/cst/TypedConstant;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v3, v2, v1}, Lcom/android/dx/dex/file/ClassDefItem;->addStaticField(Lcom/android/dx/dex/file/EncodedField;Lcom/android/dx/rop/cst/Constant;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    iget-object v1, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->classDefItem:Lcom/android/dx/dex/file/ClassDefItem;

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Lcom/android/dx/dex/file/ClassDefItem;->addInstanceField(Lcom/android/dx/dex/file/EncodedField;)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    iget-object v0, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->classDefItem:Lcom/android/dx/dex/file/ClassDefItem;

    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v2, "Undeclared type "

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v2, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->type:Lcom/android/dx/TypeId;

    .line 159
    .line 160
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v2, " declares members: "

    .line 164
    .line 165
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v2, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->fields:Ljava/util/Map;

    .line 169
    .line 170
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v2, " "

    .line 178
    .line 179
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object v2, p0, Lcom/android/dx/DexMaker$TypeDeclaration;->methods:Ljava/util/Map;

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
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
