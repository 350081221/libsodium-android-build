.class public Landroidx/collection/SparseArrayCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0019\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\t\u0008\u0016\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0013\u0008\u0007\u0012\u0008\u0008\u0002\u00106\u001a\u00020\u0004\u00a2\u0006\u0004\u00087\u00108J\u000e\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\tJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\u000c\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\tJ\'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\n2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u0000H\u0016J!\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\tJ\u0008\u0010\u0012\u001a\u00020\u0004H\u0016J\u0008\u0010\u001d\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0007J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0008\u0010\'\u001a\u00020\nH\u0016J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008(\u0010\u0019J\u0008\u0010*\u001a\u00020)H\u0016R\u0016\u0010+\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0016\u0010.\u001a\u00020-8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u001e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r008\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0016\u0010\u0012\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u00103R\u0011\u0010\u001d\u001a\u00020\u000f8G\u00a2\u0006\u0006\u001a\u0004\u00084\u00105\u00a8\u00069"
    }
    d2 = {
        "Landroidx/collection/SparseArrayCompat;",
        "E",
        "",
        "clone",
        "",
        "key",
        "get",
        "(I)Ljava/lang/Object;",
        "defaultValue",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "Lkotlin/r2;",
        "delete",
        "remove",
        "",
        "value",
        "",
        "index",
        "removeAt",
        "size",
        "removeAtRange",
        "replace",
        "oldValue",
        "newValue",
        "(ILjava/lang/Object;Ljava/lang/Object;)Z",
        "put",
        "(ILjava/lang/Object;)V",
        "other",
        "putAll",
        "putIfAbsent",
        "isEmpty",
        "keyAt",
        "valueAt",
        "setValueAt",
        "indexOfKey",
        "indexOfValue",
        "(Ljava/lang/Object;)I",
        "containsKey",
        "containsValue",
        "(Ljava/lang/Object;)Z",
        "clear",
        "append",
        "",
        "toString",
        "garbage",
        "Z",
        "",
        "keys",
        "[I",
        "",
        "values",
        "[Ljava/lang/Object;",
        "I",
        "getIsEmpty",
        "()Z",
        "initialCapacity",
        "<init>",
        "(I)V",
        "collection"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"
    }
.end annotation


# instance fields
.field public synthetic garbage:Z
    .annotation build Lu3/e;
    .end annotation
.end field

.field public synthetic keys:[I
    .annotation build Lu3/e;
    .end annotation
.end field

.field public synthetic size:I
    .annotation build Lu3/e;
    .end annotation
.end field

.field public synthetic values:[Ljava/lang/Object;
    .annotation build Lu3/e;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation build Lu3/i;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/collection/SparseArrayCompat;-><init>(IILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .annotation build Lu3/i;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_INTS:[I

    iput-object p1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 3
    sget-object p1, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    move-result p1

    .line 5
    new-array v0, p1, [I

    iput-object v0, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 6
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0xa

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Landroidx/collection/SparseArrayCompat;-><init>(I)V

    return-void
.end method


# virtual methods
.method public append(ILjava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 6
    .line 7
    add-int/lit8 v2, v0, -0x1

    .line 8
    .line 9
    aget v1, v1, v2

    .line 10
    .line 11
    if-gt p1, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Landroidx/collection/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-boolean v1, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 22
    .line 23
    array-length v1, v1

    .line 24
    if-lt v0, v1, :cond_1

    .line 25
    .line 26
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget v0, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 32
    .line 33
    array-length v1, v1

    .line 34
    if-lt v0, v1, :cond_2

    .line 35
    .line 36
    add-int/lit8 v1, v0, 0x1

    .line 37
    .line 38
    invoke-static {v1}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 43
    .line 44
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, "copyOf(this, newSize)"

    .line 49
    .line 50
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 54
    .line 55
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 56
    .line 57
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 65
    .line 66
    :cond_2
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 67
    .line 68
    aput p1, v1, v0

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 71
    .line 72
    aput-object p2, p1, v0

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    iput v0, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 77
    .line 78
    :goto_0
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
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
.end method

.method public clear()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v0, :cond_0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    aput-object v4, v1, v3

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iput v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 16
    .line 17
    iput-boolean v2, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 18
    .line 19
    return-void
.end method

.method public clone()Landroidx/collection/SparseArrayCompat;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/SparseArrayCompat<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/collection/SparseArrayCompat;

    .line 3
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 4
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/collection/SparseArrayCompat;->clone()Landroidx/collection/SparseArrayCompat;

    move-result-object v0

    return-object v0
.end method

.method public containsKey(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object v3, v3, v2

    .line 17
    .line 18
    if-ne v3, p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    const/4 v2, -0x1

    .line 25
    :goto_1
    if-ltz v2, :cond_3

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    :cond_3
    return v1
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public delete(I)V
    .locals 0
    .annotation runtime Lkotlin/k;
        message = "Alias for remove(int)."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "remove(key)"
            imports = {}
        .end subannotation
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->remove(I)V

    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/collection/SparseArrayCompatKt;->commonGet(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .line 2
    invoke-static {p0, p1, p2}, Landroidx/collection/SparseArrayCompatKt;->commonGet(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getIsEmpty()Z
    .locals 1
    .annotation build Lu3/h;
        name = "getIsEmpty"
    .end annotation

    invoke-virtual {p0}, Landroidx/collection/SparseArrayCompat;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public indexOfKey(I)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 9
    .line 10
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public indexOfValue(Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)I"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_2

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 14
    .line 15
    aget-object v2, v2, v1

    .line 16
    .line 17
    if-ne v2, p1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 v1, -0x1

    .line 24
    :goto_1
    return v1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/collection/SparseArrayCompat;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public keyAt(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 9
    .line 10
    aget p1, v0, p1

    .line 11
    .line 12
    return p1
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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public put(ILjava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 2
    .line 3
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 12
    .line 13
    aput-object p2, p1, v0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    not-int v0, v0

    .line 18
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 19
    .line 20
    if-ge v0, v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 23
    .line 24
    aget-object v1, v1, v0

    .line 25
    .line 26
    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 33
    .line 34
    aput p1, v1, v0

    .line 35
    .line 36
    iget-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 37
    .line 38
    aput-object p2, p1, v0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-boolean v1, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 48
    .line 49
    array-length v2, v2

    .line 50
    if-lt v1, v2, :cond_2

    .line 51
    .line 52
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 56
    .line 57
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 58
    .line 59
    invoke-static {v0, v1, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    not-int v0, v0

    .line 64
    :cond_2
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 65
    .line 66
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 67
    .line 68
    array-length v2, v2

    .line 69
    if-lt v1, v2, :cond_3

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    invoke-static {v1}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 78
    .line 79
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v3, "copyOf(this, newSize)"

    .line 84
    .line 85
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 89
    .line 90
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iput-object v1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 100
    .line 101
    :cond_3
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 102
    .line 103
    sub-int v2, v1, v0

    .line 104
    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 108
    .line 109
    add-int/lit8 v3, v0, 0x1

    .line 110
    .line 111
    invoke-static {v2, v2, v3, v0, v1}, Lkotlin/collections/l;->z0([I[IIII)[I

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 115
    .line 116
    iget v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 117
    .line 118
    invoke-static {v1, v1, v3, v0, v2}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    :cond_4
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 122
    .line 123
    aput p1, v1, v0

    .line 124
    .line 125
    iget-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 126
    .line 127
    aput-object p2, p1, v0

    .line 128
    .line 129
    iget p1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 130
    .line 131
    add-int/lit8 p1, p1, 0x1

    .line 132
    .line 133
    iput p1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 134
    .line 135
    :goto_0
    return-void
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
.end method

.method public putAll(Landroidx/collection/SparseArrayCompat;)V
    .locals 8
    .param p1    # Landroidx/collection/SparseArrayCompat;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/SparseArrayCompat<",
            "+TE;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "other"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/collection/SparseArrayCompat;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_5

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1, v1}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 22
    .line 23
    iget v5, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 24
    .line 25
    invoke-static {v4, v5, v2}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-ltz v4, :cond_0

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 32
    .line 33
    aput-object v3, v2, v4

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_0
    not-int v4, v4

    .line 38
    iget v5, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 39
    .line 40
    if-ge v4, v5, :cond_1

    .line 41
    .line 42
    iget-object v5, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 43
    .line 44
    aget-object v5, v5, v4

    .line 45
    .line 46
    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    if-ne v5, v6, :cond_1

    .line 51
    .line 52
    iget-object v5, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 53
    .line 54
    aput v2, v5, v4

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 57
    .line 58
    aput-object v3, v2, v4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-boolean v5, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 62
    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    iget v5, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 66
    .line 67
    iget-object v6, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 68
    .line 69
    array-length v6, v6

    .line 70
    if-lt v5, v6, :cond_2

    .line 71
    .line 72
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 73
    .line 74
    .line 75
    iget-object v4, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 76
    .line 77
    iget v5, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 78
    .line 79
    invoke-static {v4, v5, v2}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    not-int v4, v4

    .line 84
    :cond_2
    iget v5, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 85
    .line 86
    iget-object v6, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 87
    .line 88
    array-length v6, v6

    .line 89
    if-lt v5, v6, :cond_3

    .line 90
    .line 91
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    invoke-static {v5}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    iget-object v6, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 98
    .line 99
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    const-string v7, "copyOf(this, newSize)"

    .line 104
    .line 105
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iput-object v6, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 109
    .line 110
    iget-object v6, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-static {v5, v7}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iput-object v5, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 120
    .line 121
    :cond_3
    iget v5, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 122
    .line 123
    sub-int v6, v5, v4

    .line 124
    .line 125
    if-eqz v6, :cond_4

    .line 126
    .line 127
    iget-object v6, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 128
    .line 129
    add-int/lit8 v7, v4, 0x1

    .line 130
    .line 131
    invoke-static {v6, v6, v7, v4, v5}, Lkotlin/collections/l;->z0([I[IIII)[I

    .line 132
    .line 133
    .line 134
    iget-object v5, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 135
    .line 136
    iget v6, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 137
    .line 138
    invoke-static {v5, v5, v7, v4, v6}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :cond_4
    iget-object v5, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 142
    .line 143
    aput v2, v5, v4

    .line 144
    .line 145
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 146
    .line 147
    aput-object v3, v2, v4

    .line 148
    .line 149
    iget v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 150
    .line 151
    add-int/lit8 v2, v2, 0x1

    .line 152
    .line 153
    iput v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 154
    .line 155
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_5
    return-void
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
.end method

.method public putIfAbsent(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/collection/SparseArrayCompatKt;->commonGet(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 8
    .line 9
    iget v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 10
    .line 11
    invoke-static {v1, v2, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ltz v1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 18
    .line 19
    aput-object p2, p1, v1

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    not-int v1, v1

    .line 24
    iget v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 25
    .line 26
    if-ge v1, v2, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 29
    .line 30
    aget-object v2, v2, v1

    .line 31
    .line 32
    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 39
    .line 40
    aput p1, v2, v1

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 43
    .line 44
    aput-object p2, p1, v1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-boolean v2, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    iget v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 52
    .line 53
    iget-object v3, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 54
    .line 55
    array-length v3, v3

    .line 56
    if-lt v2, v3, :cond_2

    .line 57
    .line 58
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 62
    .line 63
    iget v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 64
    .line 65
    invoke-static {v1, v2, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    not-int v1, v1

    .line 70
    :cond_2
    iget v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 71
    .line 72
    iget-object v3, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 73
    .line 74
    array-length v3, v3

    .line 75
    if-lt v2, v3, :cond_3

    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    invoke-static {v2}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    iget-object v3, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 84
    .line 85
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    const-string v4, "copyOf(this, newSize)"

    .line 90
    .line 91
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v3, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 95
    .line 96
    iget-object v3, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 97
    .line 98
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iput-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 106
    .line 107
    :cond_3
    iget v2, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 108
    .line 109
    sub-int v3, v2, v1

    .line 110
    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    iget-object v3, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 114
    .line 115
    add-int/lit8 v4, v1, 0x1

    .line 116
    .line 117
    invoke-static {v3, v3, v4, v1, v2}, Lkotlin/collections/l;->z0([I[IIII)[I

    .line 118
    .line 119
    .line 120
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 121
    .line 122
    iget v3, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 123
    .line 124
    invoke-static {v2, v2, v4, v1, v3}, Lkotlin/collections/l;->B0([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_4
    iget-object v2, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 128
    .line 129
    aput p1, v2, v1

    .line 130
    .line 131
    iget-object p1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 132
    .line 133
    aput-object p2, p1, v1

    .line 134
    .line 135
    iget p1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 136
    .line 137
    add-int/lit8 p1, p1, 0x1

    .line 138
    .line 139
    iput p1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 140
    .line 141
    :cond_5
    :goto_0
    return-object v0
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
.end method

.method public remove(I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/collection/SparseArrayCompatKt;->commonRemove(Landroidx/collection/SparseArrayCompat;I)V

    return-void
.end method

.method public remove(ILjava/lang/Object;)Z
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    .line 4
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->removeAt(I)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public removeAt(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    aput-object v1, v0, p1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public removeAtRange(II)V
    .locals 1

    .line 1
    add-int v0, p1, p2

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    :goto_0
    if-ge p1, p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->removeAt(I)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
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
.end method

.method public replace(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 3
    aput-object p2, v0, p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public replace(ILjava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;TE;)Z"
        }
    .end annotation

    .line 4
    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    .line 5
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v0, v0, p1

    .line 6
    invoke-static {v0, p2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 7
    iget-object p2, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p3, p2, p1

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setValueAt(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 9
    .line 10
    aput-object p2, v0, p1

    .line 11
    .line 12
    return-void
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
.end method

.method public size()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 9
    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/collection/SparseArrayCompat;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-string/jumbo v0, "{}"

    .line 8
    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 14
    .line 15
    mul-int/lit8 v1, v1, 0x1c

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x7b

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    if-ge v2, v1, :cond_3

    .line 29
    .line 30
    if-lez v2, :cond_1

    .line 31
    .line 32
    const-string v3, ", "

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0, v2}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 v3, 0x3d

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v2}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eq v3, p0, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const-string v3, "(this Map)"

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/16 v1, 0x7d

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "buffer.toString()"

    .line 77
    .line 78
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_2
    return-object v0
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public valueAt(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object p1, v0, p1

    .line 11
    .line 12
    return-object p1
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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
