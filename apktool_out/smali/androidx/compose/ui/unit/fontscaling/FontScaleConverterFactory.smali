.class public final Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0011\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008&\u0010!J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0005H\u0002J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J&\u0010\u0013\u001a\u00020\u000f2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0082\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0008\u001a\u00020\u0005H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u0005H\u0007R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R.\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u001a\u0010\u001b\u0012\u0004\u0008 \u0010!\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u0019\u00a8\u0006\'"
    }
    d2 = {
        "Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;",
        "",
        "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;",
        "start",
        "end",
        "",
        "interpolationPoint",
        "createInterpolatedTableBetween",
        "fontScale",
        "",
        "getKey",
        "key",
        "getScaleFromKey",
        "scaleKey",
        "fontScaleConverter",
        "Lkotlin/r2;",
        "put",
        "Landroidx/collection/SparseArrayCompat;",
        "table",
        "putInto",
        "get",
        "",
        "isNonLinearFontScalingActive",
        "forScale",
        "SCALE_KEY_MULTIPLIER",
        "F",
        "sLookupTables",
        "Landroidx/collection/SparseArrayCompat;",
        "getSLookupTables",
        "()Landroidx/collection/SparseArrayCompat;",
        "setSLookupTables",
        "(Landroidx/collection/SparseArrayCompat;)V",
        "getSLookupTables$annotations",
        "()V",
        "",
        "LOOKUP_TABLES_WRITE_LOCK",
        "[Ljava/lang/Object;",
        "sMinScaleBeforeCurvesApplied",
        "<init>",
        "ui-unit_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final LOOKUP_TABLES_WRITE_LOCK:[Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SCALE_KEY_MULTIPLIER:F = 100.0f

.field private static volatile sLookupTables:Landroidx/collection/SparseArrayCompat;
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/SparseArrayCompat<",
            "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static sMinScaleBeforeCurvesApplied:F


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    new-instance v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->INSTANCE:Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;

    .line 7
    .line 8
    new-instance v1, Landroidx/collection/SparseArrayCompat;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    invoke-direct {v1, v3, v4, v2}, Landroidx/collection/SparseArrayCompat;-><init>(IILkotlin/jvm/internal/w;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 17
    .line 18
    new-array v1, v3, [Ljava/lang/Object;

    .line 19
    .line 20
    sput-object v1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->LOOKUP_TABLES_WRITE_LOCK:[Ljava/lang/Object;

    .line 21
    .line 22
    const v2, 0x3f866666    # 1.05f

    .line 23
    .line 24
    .line 25
    sput v2, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sMinScaleBeforeCurvesApplied:F

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    sget-object v2, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 29
    .line 30
    new-instance v5, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;

    .line 31
    .line 32
    const/16 v6, 0x9

    .line 33
    .line 34
    new-array v7, v6, [F

    .line 35
    .line 36
    const/high16 v8, 0x41000000    # 8.0f

    .line 37
    .line 38
    aput v8, v7, v3

    .line 39
    .line 40
    const/high16 v9, 0x41200000    # 10.0f

    .line 41
    .line 42
    aput v9, v7, v4

    .line 43
    .line 44
    const/high16 v10, 0x41400000    # 12.0f

    .line 45
    .line 46
    const/4 v11, 0x2

    .line 47
    aput v10, v7, v11

    .line 48
    .line 49
    const/high16 v12, 0x41600000    # 14.0f

    .line 50
    .line 51
    const/4 v13, 0x3

    .line 52
    aput v12, v7, v13

    .line 53
    .line 54
    const/high16 v14, 0x41900000    # 18.0f

    .line 55
    .line 56
    const/4 v15, 0x4

    .line 57
    aput v14, v7, v15

    .line 58
    .line 59
    const/high16 v16, 0x41a00000    # 20.0f

    .line 60
    .line 61
    const/16 v17, 0x5

    .line 62
    .line 63
    aput v16, v7, v17

    .line 64
    .line 65
    const/high16 v18, 0x41c00000    # 24.0f

    .line 66
    .line 67
    const/16 v19, 0x6

    .line 68
    .line 69
    aput v18, v7, v19

    .line 70
    .line 71
    const/high16 v20, 0x41f00000    # 30.0f

    .line 72
    .line 73
    const/16 v21, 0x7

    .line 74
    .line 75
    aput v20, v7, v21

    .line 76
    .line 77
    const/high16 v22, 0x42c80000    # 100.0f

    .line 78
    .line 79
    const/16 v23, 0x8

    .line 80
    .line 81
    aput v22, v7, v23

    .line 82
    .line 83
    new-array v14, v6, [F

    .line 84
    .line 85
    const v25, 0x41133333    # 9.2f

    .line 86
    .line 87
    .line 88
    aput v25, v14, v3

    .line 89
    .line 90
    const/high16 v25, 0x41380000    # 11.5f

    .line 91
    .line 92
    aput v25, v14, v4

    .line 93
    .line 94
    const v25, 0x415ccccd    # 13.8f

    .line 95
    .line 96
    .line 97
    aput v25, v14, v11

    .line 98
    .line 99
    const v25, 0x41833333    # 16.4f

    .line 100
    .line 101
    .line 102
    aput v25, v14, v13

    .line 103
    .line 104
    const v25, 0x419e6666    # 19.8f

    .line 105
    .line 106
    .line 107
    aput v25, v14, v15

    .line 108
    .line 109
    const v25, 0x41ae6666    # 21.8f

    .line 110
    .line 111
    .line 112
    aput v25, v14, v17

    .line 113
    .line 114
    const v25, 0x41c9999a    # 25.2f

    .line 115
    .line 116
    .line 117
    aput v25, v14, v19

    .line 118
    .line 119
    aput v20, v14, v21

    .line 120
    .line 121
    aput v22, v14, v23

    .line 122
    .line 123
    invoke-direct {v5, v7, v14}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;-><init>([F[F)V

    .line 124
    .line 125
    .line 126
    const v7, 0x3f933333    # 1.15f

    .line 127
    .line 128
    .line 129
    invoke-direct {v0, v2, v7, v5}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->putInto(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V

    .line 130
    .line 131
    .line 132
    sget-object v2, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 133
    .line 134
    new-instance v5, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;

    .line 135
    .line 136
    new-array v7, v6, [F

    .line 137
    .line 138
    aput v8, v7, v3

    .line 139
    .line 140
    aput v9, v7, v4

    .line 141
    .line 142
    aput v10, v7, v11

    .line 143
    .line 144
    aput v12, v7, v13

    .line 145
    .line 146
    const/high16 v14, 0x41900000    # 18.0f

    .line 147
    .line 148
    aput v14, v7, v15

    .line 149
    .line 150
    aput v16, v7, v17

    .line 151
    .line 152
    aput v18, v7, v19

    .line 153
    .line 154
    aput v20, v7, v21

    .line 155
    .line 156
    aput v22, v7, v23

    .line 157
    .line 158
    new-array v14, v6, [F

    .line 159
    .line 160
    const v25, 0x41266666    # 10.4f

    .line 161
    .line 162
    .line 163
    aput v25, v14, v3

    .line 164
    .line 165
    const/high16 v25, 0x41500000    # 13.0f

    .line 166
    .line 167
    aput v25, v14, v4

    .line 168
    .line 169
    const v25, 0x4179999a    # 15.6f

    .line 170
    .line 171
    .line 172
    aput v25, v14, v11

    .line 173
    .line 174
    const v25, 0x41966666    # 18.8f

    .line 175
    .line 176
    .line 177
    aput v25, v14, v13

    .line 178
    .line 179
    const v25, 0x41accccd    # 21.6f

    .line 180
    .line 181
    .line 182
    aput v25, v14, v15

    .line 183
    .line 184
    const v26, 0x41bccccd    # 23.6f

    .line 185
    .line 186
    .line 187
    aput v26, v14, v17

    .line 188
    .line 189
    const v26, 0x41d33333    # 26.4f

    .line 190
    .line 191
    .line 192
    aput v26, v14, v19

    .line 193
    .line 194
    aput v20, v14, v21

    .line 195
    .line 196
    aput v22, v14, v23

    .line 197
    .line 198
    invoke-direct {v5, v7, v14}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;-><init>([F[F)V

    .line 199
    .line 200
    .line 201
    const v7, 0x3fa66666    # 1.3f

    .line 202
    .line 203
    .line 204
    invoke-direct {v0, v2, v7, v5}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->putInto(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V

    .line 205
    .line 206
    .line 207
    sget-object v2, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 208
    .line 209
    new-instance v5, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;

    .line 210
    .line 211
    new-array v7, v6, [F

    .line 212
    .line 213
    aput v8, v7, v3

    .line 214
    .line 215
    aput v9, v7, v4

    .line 216
    .line 217
    aput v10, v7, v11

    .line 218
    .line 219
    aput v12, v7, v13

    .line 220
    .line 221
    const/high16 v14, 0x41900000    # 18.0f

    .line 222
    .line 223
    aput v14, v7, v15

    .line 224
    .line 225
    aput v16, v7, v17

    .line 226
    .line 227
    aput v18, v7, v19

    .line 228
    .line 229
    aput v20, v7, v21

    .line 230
    .line 231
    aput v22, v7, v23

    .line 232
    .line 233
    new-array v14, v6, [F

    .line 234
    .line 235
    aput v10, v14, v3

    .line 236
    .line 237
    const/high16 v26, 0x41700000    # 15.0f

    .line 238
    .line 239
    aput v26, v14, v4

    .line 240
    .line 241
    const/high16 v24, 0x41900000    # 18.0f

    .line 242
    .line 243
    aput v24, v14, v11

    .line 244
    .line 245
    const/high16 v26, 0x41b00000    # 22.0f

    .line 246
    .line 247
    aput v26, v14, v13

    .line 248
    .line 249
    aput v18, v14, v15

    .line 250
    .line 251
    const/high16 v26, 0x41d00000    # 26.0f

    .line 252
    .line 253
    aput v26, v14, v17

    .line 254
    .line 255
    const/high16 v27, 0x41e00000    # 28.0f

    .line 256
    .line 257
    aput v27, v14, v19

    .line 258
    .line 259
    aput v20, v14, v21

    .line 260
    .line 261
    aput v22, v14, v23

    .line 262
    .line 263
    invoke-direct {v5, v7, v14}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;-><init>([F[F)V

    .line 264
    .line 265
    .line 266
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 267
    .line 268
    invoke-direct {v0, v2, v7, v5}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->putInto(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V

    .line 269
    .line 270
    .line 271
    sget-object v2, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 272
    .line 273
    new-instance v5, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;

    .line 274
    .line 275
    new-array v7, v6, [F

    .line 276
    .line 277
    aput v8, v7, v3

    .line 278
    .line 279
    aput v9, v7, v4

    .line 280
    .line 281
    aput v10, v7, v11

    .line 282
    .line 283
    aput v12, v7, v13

    .line 284
    .line 285
    const/high16 v14, 0x41900000    # 18.0f

    .line 286
    .line 287
    aput v14, v7, v15

    .line 288
    .line 289
    aput v16, v7, v17

    .line 290
    .line 291
    aput v18, v7, v19

    .line 292
    .line 293
    aput v20, v7, v21

    .line 294
    .line 295
    aput v22, v7, v23

    .line 296
    .line 297
    new-array v14, v6, [F

    .line 298
    .line 299
    const v27, 0x41666666    # 14.4f

    .line 300
    .line 301
    .line 302
    aput v27, v14, v3

    .line 303
    .line 304
    const/high16 v24, 0x41900000    # 18.0f

    .line 305
    .line 306
    aput v24, v14, v4

    .line 307
    .line 308
    aput v25, v14, v11

    .line 309
    .line 310
    const v25, 0x41c33333    # 24.4f

    .line 311
    .line 312
    .line 313
    aput v25, v14, v13

    .line 314
    .line 315
    const v25, 0x41dccccd    # 27.6f

    .line 316
    .line 317
    .line 318
    aput v25, v14, v15

    .line 319
    .line 320
    const v25, 0x41f66666    # 30.8f

    .line 321
    .line 322
    .line 323
    aput v25, v14, v17

    .line 324
    .line 325
    const v25, 0x42033333    # 32.8f

    .line 326
    .line 327
    .line 328
    aput v25, v14, v19

    .line 329
    .line 330
    const v25, 0x420b3333    # 34.8f

    .line 331
    .line 332
    .line 333
    aput v25, v14, v21

    .line 334
    .line 335
    aput v22, v14, v23

    .line 336
    .line 337
    invoke-direct {v5, v7, v14}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;-><init>([F[F)V

    .line 338
    .line 339
    .line 340
    const v7, 0x3fe66666    # 1.8f

    .line 341
    .line 342
    .line 343
    invoke-direct {v0, v2, v7, v5}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->putInto(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V

    .line 344
    .line 345
    .line 346
    sget-object v2, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 347
    .line 348
    new-instance v5, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;

    .line 349
    .line 350
    new-array v7, v6, [F

    .line 351
    .line 352
    aput v8, v7, v3

    .line 353
    .line 354
    aput v9, v7, v4

    .line 355
    .line 356
    aput v10, v7, v11

    .line 357
    .line 358
    aput v12, v7, v13

    .line 359
    .line 360
    const/high16 v8, 0x41900000    # 18.0f

    .line 361
    .line 362
    aput v8, v7, v15

    .line 363
    .line 364
    aput v16, v7, v17

    .line 365
    .line 366
    aput v18, v7, v19

    .line 367
    .line 368
    aput v20, v7, v21

    .line 369
    .line 370
    aput v22, v7, v23

    .line 371
    .line 372
    new-array v6, v6, [F

    .line 373
    .line 374
    const/high16 v8, 0x41800000    # 16.0f

    .line 375
    .line 376
    aput v8, v6, v3

    .line 377
    .line 378
    aput v16, v6, v4

    .line 379
    .line 380
    aput v18, v6, v11

    .line 381
    .line 382
    aput v26, v6, v13

    .line 383
    .line 384
    aput v20, v6, v15

    .line 385
    .line 386
    const/high16 v8, 0x42080000    # 34.0f

    .line 387
    .line 388
    aput v8, v6, v17

    .line 389
    .line 390
    const/high16 v8, 0x42100000    # 36.0f

    .line 391
    .line 392
    aput v8, v6, v19

    .line 393
    .line 394
    const/high16 v8, 0x42180000    # 38.0f

    .line 395
    .line 396
    aput v8, v6, v21

    .line 397
    .line 398
    aput v22, v6, v23

    .line 399
    .line 400
    invoke-direct {v5, v7, v6}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;-><init>([F[F)V

    .line 401
    .line 402
    .line 403
    const/high16 v6, 0x40000000    # 2.0f

    .line 404
    .line 405
    invoke-direct {v0, v2, v6, v5}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->putInto(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V

    .line 406
    .line 407
    .line 408
    sget-object v2, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 409
    .line 410
    monitor-exit v1

    .line 411
    sget-object v1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 412
    .line 413
    invoke-virtual {v1, v3}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    invoke-direct {v0, v1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->getScaleFromKey(I)F

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    const v1, 0x3ca3d70a    # 0.02f

    .line 422
    .line 423
    .line 424
    sub-float/2addr v0, v1

    .line 425
    sput v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sMinScaleBeforeCurvesApplied:F

    .line 426
    .line 427
    const/high16 v1, 0x3f800000    # 1.0f

    .line 428
    .line 429
    cmpl-float v0, v0, v1

    .line 430
    .line 431
    if-lez v0, :cond_0

    .line 432
    .line 433
    move v3, v4

    .line 434
    :cond_0
    if-eqz v3, :cond_1

    .line 435
    .line 436
    sput v23, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->$stable:I

    .line 437
    .line 438
    return-void

    .line 439
    :cond_1
    const-string v0, "You should only apply non-linear scaling to font scales > 1"

    .line 440
    .line 441
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    throw v1

    .line 451
    :catchall_0
    move-exception v0

    .line 452
    monitor-exit v1

    .line 453
    throw v0
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createInterpolatedTableBetween(Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;
    .locals 7

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    new-array v2, v0, [F

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v0, :cond_0

    .line 12
    .line 13
    aget v4, v1, v3

    .line 14
    .line 15
    invoke-interface {p1, v4}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;->convertSpToDp(F)F

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-interface {p2, v4}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;->convertSpToDp(F)F

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    sget-object v6, Landroidx/compose/ui/unit/fontscaling/MathUtils;->INSTANCE:Landroidx/compose/ui/unit/fontscaling/MathUtils;

    .line 24
    .line 25
    invoke-virtual {v6, v5, v4, p3}, Landroidx/compose/ui/unit/fontscaling/MathUtils;->lerp(FFF)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    aput v4, v2, v3

    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;

    .line 35
    .line 36
    invoke-direct {p1, v1, v2}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;-><init>([F[F)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :array_0
    .array-data 4
        0x41000000    # 8.0f
        0x41200000    # 10.0f
        0x41400000    # 12.0f
        0x41600000    # 14.0f
        0x41900000    # 18.0f
        0x41a00000    # 20.0f
        0x41c00000    # 24.0f
        0x41f00000    # 30.0f
        0x42c80000    # 100.0f
    .end array-data
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
.end method

.method private final get(F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;
    .locals 1

    sget-object v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    invoke-direct {p0, p1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->getKey(F)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;

    return-object p1
.end method

.method private final getKey(F)I
    .locals 1

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public static synthetic getSLookupTables$annotations()V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    return-void
.end method

.method private final getScaleFromKey(I)F
    .locals 1

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    return p1
.end method

.method private final put(FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->LOOKUP_TABLES_WRITE_LOCK:[Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/collection/SparseArrayCompat;->clone()Landroidx/collection/SparseArrayCompat;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->INSTANCE:Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;

    .line 11
    .line 12
    invoke-direct {v2, v1, p1, p2}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->putInto(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 16
    .line 17
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0

    .line 23
    throw p1
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

.method private final putInto(Landroidx/collection/SparseArrayCompat;FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/SparseArrayCompat<",
            "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;",
            ">;F",
            "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->getKey(F)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Landroidx/collection/SparseArrayCompat;->put(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final forScale(F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;
    .locals 9
    .annotation build Landroidx/annotation/AnyThread;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->isNonLinearFontScalingActive(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    sget-object v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->INSTANCE:Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->get(F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    sget-object v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 19
    .line 20
    invoke-direct {p0, p1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->getKey(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ltz v0, :cond_2

    .line 29
    .line 30
    sget-object p1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_2
    const/4 v1, 0x1

    .line 40
    add-int/2addr v0, v1

    .line 41
    neg-int v0, v0

    .line 42
    sub-int/2addr v0, v1

    .line 43
    add-int/lit8 v2, v0, 0x1

    .line 44
    .line 45
    if-ltz v0, :cond_4

    .line 46
    .line 47
    sget-object v3, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 48
    .line 49
    invoke-virtual {v3}, Landroidx/collection/SparseArrayCompat;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-lt v2, v3, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    sget-object v1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-direct {p0, v1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->getScaleFromKey(I)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    sget-object v1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-direct {p0, v1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->getScaleFromKey(I)F

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    sget-object v3, Landroidx/compose/ui/unit/fontscaling/MathUtils;->INSTANCE:Landroidx/compose/ui/unit/fontscaling/MathUtils;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    const/high16 v5, 0x3f800000    # 1.0f

    .line 80
    .line 81
    move v8, p1

    .line 82
    invoke-virtual/range {v3 .. v8}, Landroidx/compose/ui/unit/fontscaling/MathUtils;->constrainedMap(FFFFF)F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    sget-object v3, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;

    .line 93
    .line 94
    sget-object v3, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    .line 95
    .line 96
    invoke-virtual {v3, v2}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;

    .line 101
    .line 102
    invoke-direct {p0, v0, v2, v1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->createInterpolatedTableBetween(Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->put(FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    :goto_0
    new-instance v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;

    .line 111
    .line 112
    new-array v2, v1, [F

    .line 113
    .line 114
    const/high16 v3, 0x3f800000    # 1.0f

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    aput v3, v2, v4

    .line 118
    .line 119
    new-array v1, v1, [F

    .line 120
    .line 121
    aput p1, v1, v4

    .line 122
    .line 123
    invoke-direct {v0, v2, v1}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;-><init>([F[F)V

    .line 124
    .line 125
    .line 126
    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->put(FLandroidx/compose/ui/unit/fontscaling/FontScaleConverter;)V

    .line 127
    .line 128
    .line 129
    :goto_1
    return-object v0
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
.end method

.method public final getSLookupTables()Landroidx/collection/SparseArrayCompat;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/SparseArrayCompat<",
            "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    return-object v0
.end method

.method public final isNonLinearFontScalingActive(F)Z
    .locals 1
    .annotation build Landroidx/annotation/AnyThread;
    .end annotation

    sget v0, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sMinScaleBeforeCurvesApplied:F

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final setSLookupTables(Landroidx/collection/SparseArrayCompat;)V
    .locals 0
    .param p1    # Landroidx/collection/SparseArrayCompat;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/SparseArrayCompat<",
            "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;",
            ">;)V"
        }
    .end annotation

    sput-object p1, Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;->sLookupTables:Landroidx/collection/SparseArrayCompat;

    return-void
.end method
