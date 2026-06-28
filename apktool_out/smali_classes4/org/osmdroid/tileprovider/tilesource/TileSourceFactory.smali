.class public Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BASE_OVERLAY_NL:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final CLOUDMADESMALLTILES:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final CLOUDMADESTANDARDTILES:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final ChartbundleENRH:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final ChartbundleENRL:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final ChartbundleWAC:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final DEFAULT_TILE_SOURCE:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final FIETS_OVERLAY_NL:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final HIKEBIKEMAP:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final MAPNIK:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final OPEN_SEAMAP:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final OpenTopo:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final PUBLIC_TRANSPORT:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final ROADS_OVERLAY_NL:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final USGS_SAT:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final USGS_TOPO:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field public static final WIKIMEDIA:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

.field private static mTileSources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/tileprovider/tilesource/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 29

    .line 1
    new-instance v9, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 2
    .line 3
    const-string v1, "Mapnik"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x13

    .line 7
    .line 8
    const/16 v4, 0x100

    .line 9
    .line 10
    const-string v5, ".png"

    .line 11
    .line 12
    const-string v0, "https://tile.openstreetmap.org/"

    .line 13
    .line 14
    filled-new-array {v0}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    const-string v7, "\u00a9 OpenStreetMap contributors"

    .line 19
    .line 20
    new-instance v8, Lorg/osmdroid/tileprovider/tilesource/j;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    const/16 v10, 0xf

    .line 24
    .line 25
    invoke-direct {v8, v0, v10}, Lorg/osmdroid/tileprovider/tilesource/j;-><init>(II)V

    .line 26
    .line 27
    .line 28
    move-object v0, v9

    .line 29
    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lorg/osmdroid/tileprovider/tilesource/j;)V

    .line 30
    .line 31
    .line 32
    sput-object v9, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->MAPNIK:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 33
    .line 34
    new-instance v0, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 35
    .line 36
    const-string v12, "Wikimedia"

    .line 37
    .line 38
    const/4 v13, 0x1

    .line 39
    const/16 v14, 0x13

    .line 40
    .line 41
    const/16 v15, 0x100

    .line 42
    .line 43
    const-string v16, ".png"

    .line 44
    .line 45
    const-string v1, "https://maps.wikimedia.org/osm-intl/"

    .line 46
    .line 47
    filled-new-array {v1}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v17

    .line 51
    const-string v18, "Wikimedia maps | Map data \u00a9 OpenStreetMap contributors"

    .line 52
    .line 53
    new-instance v1, Lorg/osmdroid/tileprovider/tilesource/j;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-direct {v1, v2, v10}, Lorg/osmdroid/tileprovider/tilesource/j;-><init>(II)V

    .line 57
    .line 58
    .line 59
    move-object v11, v0

    .line 60
    move-object/from16 v19, v1

    .line 61
    .line 62
    invoke-direct/range {v11 .. v19}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lorg/osmdroid/tileprovider/tilesource/j;)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->WIKIMEDIA:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 66
    .line 67
    new-instance v1, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 68
    .line 69
    const-string v20, "OSMPublicTransport"

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    const/16 v22, 0x11

    .line 74
    .line 75
    const/16 v23, 0x100

    .line 76
    .line 77
    const-string v24, ".png"

    .line 78
    .line 79
    const-string v2, "http://openptmap.org/tiles/"

    .line 80
    .line 81
    filled-new-array {v2}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v25

    .line 85
    const-string v26, "\u00a9 OpenStreetMap contributors"

    .line 86
    .line 87
    move-object/from16 v19, v1

    .line 88
    .line 89
    invoke-direct/range {v19 .. v26}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sput-object v1, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->PUBLIC_TRANSPORT:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 93
    .line 94
    sput-object v9, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->DEFAULT_TILE_SOURCE:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 95
    .line 96
    new-instance v10, Lorg/osmdroid/tileprovider/tilesource/b;

    .line 97
    .line 98
    const-string v3, "CloudMadeStandardTiles"

    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    const/16 v5, 0x12

    .line 102
    .line 103
    const/16 v6, 0x100

    .line 104
    .line 105
    const-string v7, ".png"

    .line 106
    .line 107
    const-string v11, "http://a.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"

    .line 108
    .line 109
    const-string v12, "http://b.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"

    .line 110
    .line 111
    const-string v13, "http://c.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"

    .line 112
    .line 113
    filled-new-array {v11, v12, v13}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    move-object v2, v10

    .line 118
    invoke-direct/range {v2 .. v8}, Lorg/osmdroid/tileprovider/tilesource/b;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sput-object v10, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->CLOUDMADESTANDARDTILES:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 122
    .line 123
    new-instance v2, Lorg/osmdroid/tileprovider/tilesource/b;

    .line 124
    .line 125
    const-string v15, "CloudMadeSmallTiles"

    .line 126
    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    const/16 v17, 0x15

    .line 130
    .line 131
    const/16 v18, 0x40

    .line 132
    .line 133
    const-string v19, ".png"

    .line 134
    .line 135
    filled-new-array {v11, v12, v13}, [Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v20

    .line 139
    move-object v14, v2

    .line 140
    invoke-direct/range {v14 .. v20}, Lorg/osmdroid/tileprovider/tilesource/b;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    sput-object v2, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->CLOUDMADESMALLTILES:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 144
    .line 145
    new-instance v2, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 146
    .line 147
    const-string v22, "Fiets"

    .line 148
    .line 149
    const/16 v23, 0x3

    .line 150
    .line 151
    const/16 v24, 0x12

    .line 152
    .line 153
    const/16 v25, 0x100

    .line 154
    .line 155
    const-string v26, ".png"

    .line 156
    .line 157
    const-string v3, "https://overlay.openstreetmap.nl/openfietskaart-overlay/"

    .line 158
    .line 159
    filled-new-array {v3}, [Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v27

    .line 163
    const-string v28, "\u00a9 OpenStreetMap contributors"

    .line 164
    .line 165
    move-object/from16 v21, v2

    .line 166
    .line 167
    invoke-direct/range {v21 .. v28}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    sput-object v2, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->FIETS_OVERLAY_NL:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 171
    .line 172
    new-instance v2, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 173
    .line 174
    const-string v11, "BaseNL"

    .line 175
    .line 176
    const/4 v12, 0x0

    .line 177
    const/16 v13, 0x12

    .line 178
    .line 179
    const/16 v14, 0x100

    .line 180
    .line 181
    const-string v15, ".png"

    .line 182
    .line 183
    const-string v3, "https://overlay.openstreetmap.nl/basemap/"

    .line 184
    .line 185
    filled-new-array {v3}, [Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v16

    .line 189
    move-object v10, v2

    .line 190
    invoke-direct/range {v10 .. v16}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    sput-object v2, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->BASE_OVERLAY_NL:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 194
    .line 195
    new-instance v2, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 196
    .line 197
    const-string v18, "RoadsNL"

    .line 198
    .line 199
    const/16 v19, 0x0

    .line 200
    .line 201
    const/16 v20, 0x12

    .line 202
    .line 203
    const/16 v21, 0x100

    .line 204
    .line 205
    const-string v22, ".png"

    .line 206
    .line 207
    const-string v3, "https://overlay.openstreetmap.nl/roads/"

    .line 208
    .line 209
    filled-new-array {v3}, [Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v23

    .line 213
    const-string v24, "\u00a9 OpenStreetMap contributors"

    .line 214
    .line 215
    move-object/from16 v17, v2

    .line 216
    .line 217
    invoke-direct/range {v17 .. v24}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    sput-object v2, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->ROADS_OVERLAY_NL:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 221
    .line 222
    new-instance v2, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 223
    .line 224
    const-string v11, "HikeBikeMap"

    .line 225
    .line 226
    const-string v15, ".png"

    .line 227
    .line 228
    const-string v3, "https://tiles.wmflabs.org/hikebike/"

    .line 229
    .line 230
    filled-new-array {v3}, [Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v16

    .line 234
    move-object v10, v2

    .line 235
    invoke-direct/range {v10 .. v16}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    sput-object v2, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->HIKEBIKEMAP:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 239
    .line 240
    new-instance v3, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 241
    .line 242
    const-string v18, "OpenSeaMap"

    .line 243
    .line 244
    const/16 v19, 0x3

    .line 245
    .line 246
    const-string v22, ".png"

    .line 247
    .line 248
    const-string v4, "https://tiles.openseamap.org/seamark/"

    .line 249
    .line 250
    filled-new-array {v4}, [Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v23

    .line 254
    const-string v24, "OpenSeaMap"

    .line 255
    .line 256
    move-object/from16 v17, v3

    .line 257
    .line 258
    invoke-direct/range {v17 .. v24}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    sput-object v3, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->OPEN_SEAMAP:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 262
    .line 263
    new-instance v3, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory$a;

    .line 264
    .line 265
    const-string v11, "USGS National Map Topo"

    .line 266
    .line 267
    const/16 v13, 0xf

    .line 268
    .line 269
    const-string v15, ""

    .line 270
    .line 271
    const-string v4, "https://basemap.nationalmap.gov/arcgis/rest/services/USGSTopo/MapServer/tile/"

    .line 272
    .line 273
    filled-new-array {v4}, [Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v16

    .line 277
    const-string v17, "USGS"

    .line 278
    .line 279
    move-object v10, v3

    .line 280
    invoke-direct/range {v10 .. v17}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory$a;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    sput-object v3, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->USGS_TOPO:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 284
    .line 285
    new-instance v4, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory$b;

    .line 286
    .line 287
    const-string v19, "USGS National Map Sat"

    .line 288
    .line 289
    const/16 v20, 0x0

    .line 290
    .line 291
    const/16 v21, 0xf

    .line 292
    .line 293
    const/16 v22, 0x100

    .line 294
    .line 295
    const-string v23, ""

    .line 296
    .line 297
    const-string v5, "https://basemap.nationalmap.gov/arcgis/rest/services/USGSImageryTopo/MapServer/tile/"

    .line 298
    .line 299
    filled-new-array {v5}, [Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v24

    .line 303
    const-string v25, "USGS"

    .line 304
    .line 305
    move-object/from16 v18, v4

    .line 306
    .line 307
    invoke-direct/range {v18 .. v25}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory$b;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    sput-object v4, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->USGS_SAT:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 311
    .line 312
    new-instance v5, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 313
    .line 314
    const-string v11, "ChartbundleWAC"

    .line 315
    .line 316
    const/4 v12, 0x4

    .line 317
    const/16 v13, 0xc

    .line 318
    .line 319
    const-string v15, ".png?type=google"

    .line 320
    .line 321
    const-string v6, "https://wms.chartbundle.com/tms/v1.0/wac/"

    .line 322
    .line 323
    filled-new-array {v6}, [Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v16

    .line 327
    const-string v17, "chartbundle.com"

    .line 328
    .line 329
    move-object v10, v5

    .line 330
    invoke-direct/range {v10 .. v17}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    sput-object v5, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->ChartbundleWAC:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 334
    .line 335
    new-instance v6, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 336
    .line 337
    const-string v19, "ChartbundleENRH"

    .line 338
    .line 339
    const/16 v20, 0x4

    .line 340
    .line 341
    const/16 v21, 0xc

    .line 342
    .line 343
    const-string v23, ".png?type=google"

    .line 344
    .line 345
    const-string v7, "https://wms.chartbundle.com/tms/v1.0/enrh/"

    .line 346
    .line 347
    const-string v8, "chartbundle.com"

    .line 348
    .line 349
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v24

    .line 353
    move-object/from16 v18, v6

    .line 354
    .line 355
    invoke-direct/range {v18 .. v24}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    sput-object v6, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->ChartbundleENRH:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 359
    .line 360
    new-instance v7, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 361
    .line 362
    const-string v11, "ChartbundleENRL"

    .line 363
    .line 364
    const-string v15, ".png?type=google"

    .line 365
    .line 366
    const-string v10, "https://wms.chartbundle.com/tms/v1.0/enrl/"

    .line 367
    .line 368
    filled-new-array {v10, v8}, [Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v16

    .line 372
    move-object v10, v7

    .line 373
    invoke-direct/range {v10 .. v16}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    sput-object v7, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->ChartbundleENRL:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 377
    .line 378
    new-instance v8, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;

    .line 379
    .line 380
    const-string v18, "OpenTopoMap"

    .line 381
    .line 382
    const/16 v19, 0x0

    .line 383
    .line 384
    const/16 v20, 0x11

    .line 385
    .line 386
    const/16 v21, 0x100

    .line 387
    .line 388
    const-string v22, ".png"

    .line 389
    .line 390
    const-string v10, "https://b.tile.opentopomap.org/"

    .line 391
    .line 392
    const-string v11, "https://c.tile.opentopomap.org/"

    .line 393
    .line 394
    const-string v12, "https://a.tile.opentopomap.org/"

    .line 395
    .line 396
    filled-new-array {v12, v10, v11}, [Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v23

    .line 400
    const-string v24, "Kartendaten: \u00a9 OpenStreetMap-Mitwirkende, SRTM | Kartendarstellung: \u00a9 OpenTopoMap (CC-BY-SA)"

    .line 401
    .line 402
    move-object/from16 v17, v8

    .line 403
    .line 404
    invoke-direct/range {v17 .. v24}, Lorg/osmdroid/tileprovider/tilesource/XYTileSource;-><init>(Ljava/lang/String;IIILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    sput-object v8, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->OpenTopo:Lorg/osmdroid/tileprovider/tilesource/OnlineTileSourceBase;

    .line 408
    .line 409
    new-instance v10, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 412
    .line 413
    .line 414
    sput-object v10, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 415
    .line 416
    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    sget-object v9, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 420
    .line 421
    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 425
    .line 426
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 430
    .line 431
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 435
    .line 436
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 440
    .line 441
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 445
    .line 446
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 450
    .line 451
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 455
    .line 456
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 460
    .line 461
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V
    .locals 1

    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static containsTileSource(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 18
    .line 19
    invoke-interface {v1}, Lorg/osmdroid/tileprovider/tilesource/e;->name()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return p0
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
.end method

.method public static getTileSource(I)Lorg/osmdroid/tileprovider/tilesource/e;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 5
    invoke-interface {v1}, Lorg/osmdroid/tileprovider/tilesource/e;->ordinal()I

    move-result v2

    if-ne v2, p0, :cond_0

    return-object v1

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No tile source at position: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getTileSource(Ljava/lang/String;)Lorg/osmdroid/tileprovider/tilesource/e;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 2
    invoke-interface {v1}, Lorg/osmdroid/tileprovider/tilesource/e;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No such tile source: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getTileSources()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/osmdroid/tileprovider/tilesource/e;",
            ">;"
        }
    .end annotation

    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    return-object v0
.end method

.method public static removeTileSources(Ljava/lang/String;)I
    .locals 3

    .line 1
    sget-object v0, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ltz v0, :cond_1

    .line 11
    .line 12
    sget-object v2, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 19
    .line 20
    invoke-interface {v2}, Lorg/osmdroid/tileprovider/tilesource/e;->name()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    sget-object v2, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->mTileSources:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return v1
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
.end method
