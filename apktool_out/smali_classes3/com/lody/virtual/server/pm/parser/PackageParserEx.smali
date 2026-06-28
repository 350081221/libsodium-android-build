.class public Lcom/lody/virtual/server/pm/parser/PackageParserEx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final GET_SIGNING_CERTIFICATES:I = 0x8000000

.field public static final ORG_APACHE_HTTP_LEGACY:Ljava/lang/String; = "org.apache.http.legacy"

.field private static final TAG:Ljava/lang/String; = "PackageParserEx"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addOwner(Lcom/lody/virtual/server/pm/parser/VPackage;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

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
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 18
    .line 19
    iput-object p0, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 20
    .line 21
    iget-object v2, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->intents:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityIntentInfo;

    .line 38
    .line 39
    iput-object v1, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityIntentInfo;->activity:Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;

    .line 59
    .line 60
    iput-object p0, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 61
    .line 62
    iget-object v2, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->intents:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceIntentInfo;

    .line 79
    .line 80
    iput-object v1, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceIntentInfo;->service:Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 100
    .line 101
    iput-object p0, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 102
    .line 103
    iget-object v2, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->intents:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_4

    .line 114
    .line 115
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityIntentInfo;

    .line 120
    .line 121
    iput-object v1, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityIntentInfo;->activity:Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 141
    .line 142
    iput-object p0, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 143
    .line 144
    iget-object v2, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->intents:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_6

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderIntentInfo;

    .line 161
    .line 162
    iput-object v1, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderIntentInfo;->provider:Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_7
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->instrumentation:Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage$InstrumentationComponent;

    .line 182
    .line 183
    iput-object p0, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_8
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_9

    .line 197
    .line 198
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;

    .line 203
    .line 204
    iput-object p0, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_9
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->permissionGroups:Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_a

    .line 218
    .line 219
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;

    .line 224
    .line 225
    iput-object p0, v1, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_a
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v0}, Lcom/lody/virtual/GmsSupport;->isGoogleService(Ljava/lang/String;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_b

    .line 235
    .line 236
    const/16 v0, 0xc

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_b
    const/4 v0, 0x4

    .line 240
    :goto_7
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 241
    .line 242
    iget v1, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 243
    .line 244
    or-int/2addr v0, v1

    .line 245
    iput v0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 246
    .line 247
    return-void
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

.method private static buildPackageCache(Landroid/content/pm/PackageParser$Package;)Lcom/lody/virtual/server/pm/parser/VPackage;
    .locals 5

    .line 1
    new-instance v0, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/lody/virtual/server/pm/parser/VPackage;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->activities:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->services:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->receivers:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 44
    .line 45
    new-instance v1, Ljava/util/ArrayList;

    .line 46
    .line 47
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->providers:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 57
    .line 58
    new-instance v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->instrumentation:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->instrumentation:Ljava/util/ArrayList;

    .line 70
    .line 71
    new-instance v1, Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->permissions:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 83
    .line 84
    new-instance v1, Ljava/util/ArrayList;

    .line 85
    .line 86
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->permissionGroups:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->permissionGroups:Ljava/util/ArrayList;

    .line 96
    .line 97
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->activities:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_0

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Landroid/content/pm/PackageParser$Activity;

    .line 114
    .line 115
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 116
    .line 117
    new-instance v4, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 118
    .line 119
    invoke-direct {v4, v2}, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;-><init>(Landroid/content/pm/PackageParser$Activity;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->services:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_1

    .line 137
    .line 138
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Landroid/content/pm/PackageParser$Service;

    .line 143
    .line 144
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 145
    .line 146
    new-instance v4, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;

    .line 147
    .line 148
    invoke-direct {v4, v2}, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;-><init>(Landroid/content/pm/PackageParser$Service;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_1
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->receivers:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_2

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Landroid/content/pm/PackageParser$Activity;

    .line 172
    .line 173
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 174
    .line 175
    new-instance v4, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 176
    .line 177
    invoke-direct {v4, v2}, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;-><init>(Landroid/content/pm/PackageParser$Activity;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->providers:Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_3

    .line 195
    .line 196
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Landroid/content/pm/PackageParser$Provider;

    .line 201
    .line 202
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 203
    .line 204
    new-instance v4, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 205
    .line 206
    invoke-direct {v4, v2}, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;-><init>(Landroid/content/pm/PackageParser$Provider;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_3
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->instrumentation:Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_4

    .line 224
    .line 225
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    check-cast v2, Landroid/content/pm/PackageParser$Instrumentation;

    .line 230
    .line 231
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->instrumentation:Ljava/util/ArrayList;

    .line 232
    .line 233
    new-instance v4, Lcom/lody/virtual/server/pm/parser/VPackage$InstrumentationComponent;

    .line 234
    .line 235
    invoke-direct {v4, v2}, Lcom/lody/virtual/server/pm/parser/VPackage$InstrumentationComponent;-><init>(Landroid/content/pm/PackageParser$Instrumentation;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_4
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->permissions:Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_5

    .line 253
    .line 254
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    check-cast v2, Landroid/content/pm/PackageParser$Permission;

    .line 259
    .line 260
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 261
    .line 262
    new-instance v4, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;

    .line 263
    .line 264
    invoke-direct {v4, v2}, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;-><init>(Landroid/content/pm/PackageParser$Permission;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_5
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->permissionGroups:Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-eqz v2, :cond_6

    .line 282
    .line 283
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    check-cast v2, Landroid/content/pm/PackageParser$PermissionGroup;

    .line 288
    .line 289
    iget-object v3, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->permissionGroups:Ljava/util/ArrayList;

    .line 290
    .line 291
    new-instance v4, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;

    .line 292
    .line 293
    invoke-direct {v4, v2}, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;-><init>(Landroid/content/pm/PackageParser$PermissionGroup;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 301
    .line 302
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->requestedPermissions:Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->requestedPermissions:Ljava/util/ArrayList;

    .line 312
    .line 313
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->requestedPermissions:Ljava/util/ArrayList;

    .line 314
    .line 315
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 316
    .line 317
    .line 318
    sget-object v1, Lmirror/android/content/pm/PackageParser$Package;->protectedBroadcasts:Lmirror/RefObject;

    .line 319
    .line 320
    if-eqz v1, :cond_7

    .line 321
    .line 322
    invoke-virtual {v1, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    check-cast v1, Ljava/util/List;

    .line 327
    .line 328
    if-eqz v1, :cond_7

    .line 329
    .line 330
    new-instance v2, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 333
    .line 334
    .line 335
    iput-object v2, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->protectedBroadcasts:Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 338
    .line 339
    .line 340
    :cond_7
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 341
    .line 342
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 343
    .line 344
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-eqz v1, :cond_9

    .line 349
    .line 350
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 351
    .line 352
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 353
    .line 354
    iget-object v2, v1, Landroid/content/pm/PackageParser$SigningDetails;->pastSigningCertificates:[Landroid/content/pm/Signature;

    .line 355
    .line 356
    if-eqz v2, :cond_8

    .line 357
    .line 358
    array-length v3, v2

    .line 359
    if-lez v3, :cond_8

    .line 360
    .line 361
    const/4 v1, 0x1

    .line 362
    new-array v1, v1, [Landroid/content/pm/Signature;

    .line 363
    .line 364
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 365
    .line 366
    const/4 v3, 0x0

    .line 367
    aget-object v2, v2, v3

    .line 368
    .line 369
    aput-object v2, v1, v3

    .line 370
    .line 371
    goto :goto_7

    .line 372
    :cond_8
    iget-object v1, v1, Landroid/content/pm/PackageParser$SigningDetails;->signatures:[Landroid/content/pm/Signature;

    .line 373
    .line 374
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_9
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->mSignatures:[Landroid/content/pm/Signature;

    .line 378
    .line 379
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 380
    .line 381
    :goto_7
    invoke-static {v0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->fixSignatureAsSystem(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 382
    .line 383
    .line 384
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->mAppMetaData:Landroid/os/Bundle;

    .line 385
    .line 386
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mAppMetaData:Landroid/os/Bundle;

    .line 387
    .line 388
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->packageName:Ljava/lang/String;

    .line 389
    .line 390
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 391
    .line 392
    iget v1, p0, Landroid/content/pm/PackageParser$Package;->mPreferredOrder:I

    .line 393
    .line 394
    iput v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mPreferredOrder:I

    .line 395
    .line 396
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->mVersionName:Ljava/lang/String;

    .line 397
    .line 398
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mVersionName:Ljava/lang/String;

    .line 399
    .line 400
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->mSharedUserId:Ljava/lang/String;

    .line 401
    .line 402
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSharedUserId:Ljava/lang/String;

    .line 403
    .line 404
    iget v1, p0, Landroid/content/pm/PackageParser$Package;->mSharedUserLabel:I

    .line 405
    .line 406
    iput v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSharedUserLabel:I

    .line 407
    .line 408
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->usesLibraries:Ljava/util/ArrayList;

    .line 409
    .line 410
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 411
    .line 412
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 413
    .line 414
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 415
    .line 416
    iget v1, p0, Landroid/content/pm/PackageParser$Package;->mVersionCode:I

    .line 417
    .line 418
    iput v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->mVersionCode:I

    .line 419
    .line 420
    iget-object v1, p0, Landroid/content/pm/PackageParser$Package;->configPreferences:Ljava/util/ArrayList;

    .line 421
    .line 422
    iput-object v1, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->configPreferences:Ljava/util/ArrayList;

    .line 423
    .line 424
    iget-object p0, p0, Landroid/content/pm/PackageParser$Package;->reqFeatures:Ljava/util/ArrayList;

    .line 425
    .line 426
    iput-object p0, v0, Lcom/lody/virtual/server/pm/parser/VPackage;->reqFeatures:Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-static {v0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->addOwner(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->updatePackageApache(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 432
    .line 433
    .line 434
    return-object v0
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

.method private static buildSignature(Landroid/content/pm/PackageParser$Package;[Landroid/content/pm/Signature;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lmirror/android/content/pm/PackageParser$Package;->mSigningDetails:Lmirror/RefObject;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lmirror/RefObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v0, Lmirror/android/content/pm/PackageParser$SigningDetails;->pastSigningCertificates:Lmirror/RefObject;

    .line 14
    .line 15
    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    sget-object v0, Lmirror/android/content/pm/PackageParser$SigningDetails;->signatures:Lmirror/RefObject;

    .line 19
    .line 20
    invoke-virtual {v0, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Landroid/content/pm/PackageParser$Package;->mSignatures:[Landroid/content/pm/Signature;

    .line 25
    .line 26
    :goto_0
    return-void
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

.method private static checkUseInstalledOrHidden(Lcom/lody/virtual/server/pm/PackageUserState;I)Z
    .locals 1

    iget-boolean v0, p0, Lcom/lody/virtual/server/pm/PackageUserState;->installed:Z

    if-eqz v0, :cond_0

    iget-boolean p0, p0, Lcom/lody/virtual/server/pm/PackageUserState;->hidden:Z

    if-eqz p0, :cond_1

    :cond_0
    and-int/lit16 p0, p1, 0x2000

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static fixSignatureAsSystem(Lcom/lody/virtual/server/pm/parser/VPackage;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/lody/virtual/client/core/SettingConfig;->isOutsideAppInfoPriority(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/lody/virtual/client/core/VirtualCore;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 22
    .line 23
    const v2, 0x8000040

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    :catchall_0
    :cond_0
    return-void
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

.method public static generateActivityInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ActivityInfo;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p2, p1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->checkUseInstalledOrHidden(Lcom/lody/virtual/server/pm/PackageUserState;I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    new-instance v0, Landroid/content/pm/ActivityInfo;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Landroid/content/pm/ActivityInfo;-><init>(Landroid/content/pm/ActivityInfo;)V

    .line 17
    .line 18
    .line 19
    and-int/lit16 v1, p1, 0x80

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->metaData:Landroid/os/Bundle;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iput-object v1, v0, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    .line 28
    .line 29
    :cond_2
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static {v1, v2, p3}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->isEnabledLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iput-boolean v1, v0, Landroid/content/pm/ActivityInfo;->enabled:Z

    .line 37
    .line 38
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 39
    .line 40
    invoke-static {p0, p1, p2, p3, p4}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateApplicationInfo(Lcom/lody/virtual/server/pm/parser/VPackage;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ApplicationInfo;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p0, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 45
    .line 46
    return-object v0
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

.method public static generateApplicationInfo(Lcom/lody/virtual/server/pm/parser/VPackage;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ApplicationInfo;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p2, p1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->checkUseInstalledOrHidden(Lcom/lody/virtual/server/pm/PackageUserState;I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    new-instance p2, Landroid/content/pm/ApplicationInfo;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 15
    .line 16
    invoke-direct {p2, v0}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    .line 17
    .line 18
    .line 19
    and-int/lit16 p1, p1, 0x80

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mAppMetaData:Landroid/os/Bundle;

    .line 24
    .line 25
    iput-object p0, p2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 26
    .line 27
    :cond_2
    invoke-static {p2, p3, p4}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->initApplicationAsUser(Landroid/content/pm/ApplicationInfo;IZ)V

    .line 28
    .line 29
    .line 30
    return-object p2
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

.method public static generateInstrumentationInfo(Lcom/lody/virtual/server/pm/parser/VPackage$InstrumentationComponent;I)Landroid/content/pm/InstrumentationInfo;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    and-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$InstrumentationComponent;->info:Landroid/content/pm/InstrumentationInfo;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    new-instance p1, Landroid/content/pm/InstrumentationInfo;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$InstrumentationComponent;->info:Landroid/content/pm/InstrumentationInfo;

    .line 15
    .line 16
    invoke-direct {p1, v0}, Landroid/content/pm/InstrumentationInfo;-><init>(Landroid/content/pm/InstrumentationInfo;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->metaData:Landroid/os/Bundle;

    .line 20
    .line 21
    iput-object p0, p1, Landroid/content/pm/InstrumentationInfo;->metaData:Landroid/os/Bundle;

    .line 22
    .line 23
    return-object p1
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

.method public static generatePackageInfo(Lcom/lody/virtual/server/pm/parser/VPackage;Lcom/lody/virtual/server/pm/PackageSetting;IJJLcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/PackageInfo;
    .locals 5

    .line 1
    invoke-static {p7, p2}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->checkUseInstalledOrHidden(Lcom/lody/virtual/server/pm/PackageUserState;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->readSignature(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    new-instance v0, Landroid/content/pm/PackageInfo;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v2, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 28
    .line 29
    iget v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mVersionCode:I

    .line 30
    .line 31
    iput v2, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 32
    .line 33
    iget v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSharedUserLabel:I

    .line 34
    .line 35
    iput v2, v0, Landroid/content/pm/PackageInfo;->sharedUserLabel:I

    .line 36
    .line 37
    iget-object v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mVersionName:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v2, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSharedUserId:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v2, v0, Landroid/content/pm/PackageInfo;->sharedUserId:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p0, p2, p7, p8, p9}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateApplicationInfo(Lcom/lody/virtual/server/pm/parser/VPackage;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ApplicationInfo;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iput-object v2, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 50
    .line 51
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v4, 0x1a

    .line 54
    .line 55
    if-lt v3, v4, :cond_2

    .line 56
    .line 57
    invoke-static {v2}, Lcom/lody/virtual/server/pm/a;->a(Landroid/content/pm/ApplicationInfo;)[Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput-object v2, v0, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    .line 62
    .line 63
    :cond_2
    iput-wide p3, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 64
    .line 65
    iput-wide p5, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 66
    .line 67
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->requestedPermissions:Ljava/util/ArrayList;

    .line 68
    .line 69
    if-eqz p3, :cond_3

    .line 70
    .line 71
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-nez p3, :cond_3

    .line 76
    .line 77
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->requestedPermissions:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    new-array p3, p3, [Ljava/lang/String;

    .line 84
    .line 85
    iget-object p4, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->requestedPermissions:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 91
    .line 92
    :cond_3
    and-int/lit16 p3, p2, 0x100

    .line 93
    .line 94
    if-eqz p3, :cond_4

    .line 95
    .line 96
    sget-object p3, Lcom/lody/virtual/helper/compat/PackageParserCompat;->GIDS:[I

    .line 97
    .line 98
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->gids:[I

    .line 99
    .line 100
    :cond_4
    and-int/lit16 p3, p2, 0x4000

    .line 101
    .line 102
    const/4 p4, 0x0

    .line 103
    if-eqz p3, :cond_8

    .line 104
    .line 105
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->configPreferences:Ljava/util/ArrayList;

    .line 106
    .line 107
    if-eqz p3, :cond_5

    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    goto :goto_0

    .line 114
    :cond_5
    move p3, p4

    .line 115
    :goto_0
    if-lez p3, :cond_6

    .line 116
    .line 117
    new-array p3, p3, [Landroid/content/pm/ConfigurationInfo;

    .line 118
    .line 119
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->configPreferences:[Landroid/content/pm/ConfigurationInfo;

    .line 120
    .line 121
    iget-object p5, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->configPreferences:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_6
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->reqFeatures:Ljava/util/ArrayList;

    .line 127
    .line 128
    if-eqz p3, :cond_7

    .line 129
    .line 130
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    goto :goto_1

    .line 135
    :cond_7
    move p3, p4

    .line 136
    :goto_1
    if-lez p3, :cond_8

    .line 137
    .line 138
    new-array p3, p3, [Landroid/content/pm/FeatureInfo;

    .line 139
    .line 140
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->reqFeatures:[Landroid/content/pm/FeatureInfo;

    .line 141
    .line 142
    iget-object p5, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->reqFeatures:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    :cond_8
    and-int/lit8 p3, p2, 0x1

    .line 148
    .line 149
    if-eqz p3, :cond_b

    .line 150
    .line 151
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result p3

    .line 157
    if-lez p3, :cond_b

    .line 158
    .line 159
    new-array p5, p3, [Landroid/content/pm/ActivityInfo;

    .line 160
    .line 161
    move p6, p4

    .line 162
    move v2, p6

    .line 163
    :goto_2
    if-ge p6, p3, :cond_a

    .line 164
    .line 165
    iget-object v3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->activities:Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-virtual {v3, p6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 172
    .line 173
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 174
    .line 175
    invoke-virtual {p1, v4, p2, p8}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_9

    .line 180
    .line 181
    invoke-static {v3, p2, p7, p8, p9}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateActivityInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ActivityInfo;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    iget-object v4, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 186
    .line 187
    iput-object v4, v3, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 188
    .line 189
    add-int/lit8 v4, v2, 0x1

    .line 190
    .line 191
    aput-object v3, p5, v2

    .line 192
    .line 193
    move v2, v4

    .line 194
    :cond_9
    add-int/lit8 p6, p6, 0x1

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_a
    invoke-static {p5, v2}, Lcom/lody/virtual/helper/utils/ArrayUtils;->trimToSize([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    check-cast p3, [Landroid/content/pm/ActivityInfo;

    .line 202
    .line 203
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    .line 204
    .line 205
    :cond_b
    and-int/lit8 p3, p2, 0x2

    .line 206
    .line 207
    if-eqz p3, :cond_e

    .line 208
    .line 209
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result p3

    .line 215
    if-lez p3, :cond_e

    .line 216
    .line 217
    new-array p5, p3, [Landroid/content/pm/ActivityInfo;

    .line 218
    .line 219
    move p6, p4

    .line 220
    move v2, p6

    .line 221
    :goto_3
    if-ge p6, p3, :cond_d

    .line 222
    .line 223
    iget-object v3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->receivers:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v3, p6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;

    .line 230
    .line 231
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;->info:Landroid/content/pm/ActivityInfo;

    .line 232
    .line 233
    invoke-virtual {p1, v4, p2, p8}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-eqz v4, :cond_c

    .line 238
    .line 239
    invoke-static {v3, p2, p7, p8, p9}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateActivityInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ActivityComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ActivityInfo;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    iget-object v4, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 244
    .line 245
    iput-object v4, v3, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 246
    .line 247
    add-int/lit8 v4, v2, 0x1

    .line 248
    .line 249
    aput-object v3, p5, v2

    .line 250
    .line 251
    move v2, v4

    .line 252
    :cond_c
    add-int/lit8 p6, p6, 0x1

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_d
    invoke-static {p5, v2}, Lcom/lody/virtual/helper/utils/ArrayUtils;->trimToSize([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p3

    .line 259
    check-cast p3, [Landroid/content/pm/ActivityInfo;

    .line 260
    .line 261
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    .line 262
    .line 263
    :cond_e
    and-int/lit8 p3, p2, 0x4

    .line 264
    .line 265
    if-eqz p3, :cond_11

    .line 266
    .line 267
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 270
    .line 271
    .line 272
    move-result p3

    .line 273
    if-lez p3, :cond_11

    .line 274
    .line 275
    new-array p5, p3, [Landroid/content/pm/ServiceInfo;

    .line 276
    .line 277
    move p6, p4

    .line 278
    move v2, p6

    .line 279
    :goto_4
    if-ge p6, p3, :cond_10

    .line 280
    .line 281
    iget-object v3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->services:Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-virtual {v3, p6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;

    .line 288
    .line 289
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;->info:Landroid/content/pm/ServiceInfo;

    .line 290
    .line 291
    invoke-virtual {p1, v4, p2, p8}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    if-eqz v4, :cond_f

    .line 296
    .line 297
    invoke-static {v3, p2, p7, p8, p9}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateServiceInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ServiceInfo;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    iget-object v4, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 302
    .line 303
    iput-object v4, v3, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 304
    .line 305
    add-int/lit8 v4, v2, 0x1

    .line 306
    .line 307
    aput-object v3, p5, v2

    .line 308
    .line 309
    move v2, v4

    .line 310
    :cond_f
    add-int/lit8 p6, p6, 0x1

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_10
    invoke-static {p5, v2}, Lcom/lody/virtual/helper/utils/ArrayUtils;->trimToSize([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p3

    .line 317
    check-cast p3, [Landroid/content/pm/ServiceInfo;

    .line 318
    .line 319
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 320
    .line 321
    :cond_11
    and-int/lit8 p3, p2, 0x8

    .line 322
    .line 323
    if-eqz p3, :cond_14

    .line 324
    .line 325
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 328
    .line 329
    .line 330
    move-result p3

    .line 331
    if-lez p3, :cond_14

    .line 332
    .line 333
    new-array p5, p3, [Landroid/content/pm/ProviderInfo;

    .line 334
    .line 335
    move p6, p4

    .line 336
    move v2, p6

    .line 337
    :goto_5
    if-ge p6, p3, :cond_13

    .line 338
    .line 339
    iget-object v3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->providers:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {v3, p6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    check-cast v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;

    .line 346
    .line 347
    iget-object v4, v3, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 348
    .line 349
    invoke-virtual {p1, v4, p2, p8}, Lcom/lody/virtual/server/pm/PackageSetting;->isEnabledAndMatchLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-eqz v4, :cond_12

    .line 354
    .line 355
    invoke-static {v3, p2, p7, p8, p9}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateProviderInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ProviderInfo;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    iget-object v4, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 360
    .line 361
    iput-object v4, v3, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 362
    .line 363
    add-int/lit8 v4, v2, 0x1

    .line 364
    .line 365
    aput-object v3, p5, v2

    .line 366
    .line 367
    move v2, v4

    .line 368
    :cond_12
    add-int/lit8 p6, p6, 0x1

    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_13
    invoke-static {p5, v2}, Lcom/lody/virtual/helper/utils/ArrayUtils;->trimToSize([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    check-cast p1, [Landroid/content/pm/ProviderInfo;

    .line 376
    .line 377
    iput-object p1, v0, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    .line 378
    .line 379
    :cond_14
    and-int/lit8 p1, p2, 0x10

    .line 380
    .line 381
    if-eqz p1, :cond_15

    .line 382
    .line 383
    iget-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->instrumentation:Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 386
    .line 387
    .line 388
    move-result p1

    .line 389
    if-lez p1, :cond_15

    .line 390
    .line 391
    new-array p3, p1, [Landroid/content/pm/InstrumentationInfo;

    .line 392
    .line 393
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->instrumentation:[Landroid/content/pm/InstrumentationInfo;

    .line 394
    .line 395
    move p3, p4

    .line 396
    :goto_6
    if-ge p3, p1, :cond_15

    .line 397
    .line 398
    iget-object p5, v0, Landroid/content/pm/PackageInfo;->instrumentation:[Landroid/content/pm/InstrumentationInfo;

    .line 399
    .line 400
    iget-object p6, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->instrumentation:Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-virtual {p6, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p6

    .line 406
    check-cast p6, Lcom/lody/virtual/server/pm/parser/VPackage$InstrumentationComponent;

    .line 407
    .line 408
    invoke-static {p6, p2}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateInstrumentationInfo(Lcom/lody/virtual/server/pm/parser/VPackage$InstrumentationComponent;I)Landroid/content/pm/InstrumentationInfo;

    .line 409
    .line 410
    .line 411
    move-result-object p6

    .line 412
    aput-object p6, p5, p3

    .line 413
    .line 414
    add-int/lit8 p3, p3, 0x1

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_15
    and-int/lit16 p1, p2, 0x1000

    .line 418
    .line 419
    if-eqz p1, :cond_1a

    .line 420
    .line 421
    iget-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 424
    .line 425
    .line 426
    move-result p1

    .line 427
    if-lez p1, :cond_16

    .line 428
    .line 429
    new-array p3, p1, [Landroid/content/pm/PermissionInfo;

    .line 430
    .line 431
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    .line 432
    .line 433
    move p3, p4

    .line 434
    :goto_7
    if-ge p3, p1, :cond_16

    .line 435
    .line 436
    iget-object p5, v0, Landroid/content/pm/PackageInfo;->permissions:[Landroid/content/pm/PermissionInfo;

    .line 437
    .line 438
    iget-object p6, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->permissions:Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-virtual {p6, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object p6

    .line 444
    check-cast p6, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;

    .line 445
    .line 446
    invoke-static {p6, p2}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generatePermissionInfo(Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;I)Landroid/content/pm/PermissionInfo;

    .line 447
    .line 448
    .line 449
    move-result-object p6

    .line 450
    aput-object p6, p5, p3

    .line 451
    .line 452
    add-int/lit8 p3, p3, 0x1

    .line 453
    .line 454
    goto :goto_7

    .line 455
    :cond_16
    iget-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->requestedPermissions:Ljava/util/ArrayList;

    .line 456
    .line 457
    if-nez p1, :cond_17

    .line 458
    .line 459
    move p1, p4

    .line 460
    goto :goto_8

    .line 461
    :cond_17
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 462
    .line 463
    .line 464
    move-result p1

    .line 465
    :goto_8
    if-lez p1, :cond_1a

    .line 466
    .line 467
    new-array p3, p1, [Ljava/lang/String;

    .line 468
    .line 469
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 470
    .line 471
    new-array p3, p1, [I

    .line 472
    .line 473
    iput-object p3, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 474
    .line 475
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/server/pm/VAppManagerService;->get()Lcom/lody/virtual/server/pm/VAppManagerService;

    .line 476
    .line 477
    .line 478
    move-result-object p3

    .line 479
    iget-object p5, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {p3, p5}, Lcom/lody/virtual/server/pm/VAppManagerService;->isRunInExtProcess(Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result p3

    .line 485
    sget-object p3, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 486
    .line 487
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 488
    .line 489
    .line 490
    move-result-object p5

    .line 491
    invoke-virtual {p5}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 492
    .line 493
    .line 494
    move-result-object p5

    .line 495
    invoke-virtual {p5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 496
    .line 497
    .line 498
    move-result-object p5

    .line 499
    const/16 p6, 0x1000

    .line 500
    .line 501
    invoke-virtual {p5, p3, p6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 502
    .line 503
    .line 504
    move-result-object p3

    .line 505
    iget-object p5, p3, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 506
    .line 507
    invoke-static {p5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 511
    :try_start_1
    iget-object v1, p3, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 512
    .line 513
    goto :goto_a

    .line 514
    :catch_0
    move-exception p3

    .line 515
    goto :goto_9

    .line 516
    :catch_1
    move-exception p3

    .line 517
    move-object p5, v1

    .line 518
    :goto_9
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 519
    .line 520
    .line 521
    :goto_a
    move p3, p4

    .line 522
    :goto_b
    if-ge p3, p1, :cond_1a

    .line 523
    .line 524
    iget-object p6, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->requestedPermissions:Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-virtual {p6, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object p6

    .line 530
    check-cast p6, Ljava/lang/String;

    .line 531
    .line 532
    iget-object p7, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 533
    .line 534
    aput-object p6, p7, p3

    .line 535
    .line 536
    if-nez p5, :cond_18

    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_18
    invoke-interface {p5, p6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 540
    .line 541
    .line 542
    move-result p6

    .line 543
    if-ltz p6, :cond_19

    .line 544
    .line 545
    iget-object p7, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 546
    .line 547
    aget p6, v1, p6

    .line 548
    .line 549
    aput p6, p7, p3

    .line 550
    .line 551
    goto :goto_c

    .line 552
    :cond_19
    iget-object p6, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    .line 553
    .line 554
    const/4 p7, -0x1

    .line 555
    aput p7, p6, p3

    .line 556
    .line 557
    :goto_c
    add-int/lit8 p3, p3, 0x1

    .line 558
    .line 559
    goto :goto_b

    .line 560
    :cond_1a
    and-int/lit8 p1, p2, 0x40

    .line 561
    .line 562
    if-eqz p1, :cond_1d

    .line 563
    .line 564
    iget-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 565
    .line 566
    if-eqz p1, :cond_1b

    .line 567
    .line 568
    array-length p3, p1

    .line 569
    goto :goto_d

    .line 570
    :cond_1b
    move p3, p4

    .line 571
    :goto_d
    if-lez p3, :cond_1c

    .line 572
    .line 573
    new-array p5, p3, [Landroid/content/pm/Signature;

    .line 574
    .line 575
    iput-object p5, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 576
    .line 577
    invoke-static {p1, p4, p5, p4, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 578
    .line 579
    .line 580
    goto :goto_e

    .line 581
    :cond_1c
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual {p1, p3}, Lcom/lody/virtual/client/core/SettingConfig;->isOutsideAppInfoPriority(Ljava/lang/String;)Z

    .line 588
    .line 589
    .line 590
    move-result p1

    .line 591
    if-eqz p1, :cond_1d

    .line 592
    .line 593
    :try_start_2
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->getHostPackageManager()Lcom/lody/virtual/client/env/HostPackageManager;

    .line 598
    .line 599
    .line 600
    move-result-object p1

    .line 601
    iget-object p3, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 602
    .line 603
    const-wide/16 p5, 0x40

    .line 604
    .line 605
    invoke-virtual {p1, p3, p5, p6}, Lcom/lody/virtual/client/env/HostPackageManager;->getPackageInfo(Ljava/lang/String;J)Landroid/content/pm/PackageInfo;

    .line 606
    .line 607
    .line 608
    move-result-object p1

    .line 609
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 610
    .line 611
    iput-object p1, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 612
    .line 613
    goto :goto_e

    .line 614
    :catch_2
    move-exception p1

    .line 615
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 616
    .line 617
    .line 618
    :cond_1d
    :goto_e
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 619
    .line 620
    .line 621
    move-result p1

    .line 622
    if-eqz p1, :cond_20

    .line 623
    .line 624
    const/high16 p1, 0x8000000

    .line 625
    .line 626
    and-int/2addr p1, p2

    .line 627
    if-eqz p1, :cond_20

    .line 628
    .line 629
    iget-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 630
    .line 631
    const/4 p2, 0x1

    .line 632
    if-eqz p1, :cond_1f

    .line 633
    .line 634
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isTiramisu()Z

    .line 635
    .line 636
    .line 637
    move-result p1

    .line 638
    if-eqz p1, :cond_1e

    .line 639
    .line 640
    iget-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 641
    .line 642
    invoke-static {p1}, Lmirror/android/content/pm/SigningInfoT;->createSigningInfo(Landroid/content/pm/PackageParser$SigningDetails;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object p1

    .line 646
    sget-object p2, Lmirror/android/content/pm/PackageInfoPie;->signingInfo:Lmirror/RefObject;

    .line 647
    .line 648
    invoke-virtual {p2, v0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    goto :goto_f

    .line 652
    :cond_1e
    sget-object p1, Lmirror/android/content/pm/PackageInfoPie;->signingInfo:Lmirror/RefObject;

    .line 653
    .line 654
    sget-object p3, Lmirror/android/content/pm/SigningInfo;->ctor:Lmirror/RefConstructor;

    .line 655
    .line 656
    new-array p2, p2, [Ljava/lang/Object;

    .line 657
    .line 658
    iget-object p5, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 659
    .line 660
    aput-object p5, p2, p4

    .line 661
    .line 662
    invoke-virtual {p3, p2}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object p2

    .line 666
    invoke-virtual {p1, v0, p2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    :goto_f
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 670
    .line 671
    iget-object p0, p0, Landroid/content/pm/PackageParser$SigningDetails;->signatures:[Landroid/content/pm/Signature;

    .line 672
    .line 673
    iput-object p0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 674
    .line 675
    goto :goto_10

    .line 676
    :cond_1f
    iget-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 677
    .line 678
    if-eqz p1, :cond_20

    .line 679
    .line 680
    new-instance p1, Landroid/content/pm/PackageParser$SigningDetails;

    .line 681
    .line 682
    invoke-direct {p1}, Landroid/content/pm/PackageParser$SigningDetails;-><init>()V

    .line 683
    .line 684
    .line 685
    sget-object p3, Lmirror/android/content/pm/PackageParser$SigningDetails;->pastSigningCertificates:Lmirror/RefObject;

    .line 686
    .line 687
    iget-object p5, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 688
    .line 689
    invoke-virtual {p3, p1, p5}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    sget-object p3, Lmirror/android/content/pm/PackageParser$SigningDetails;->signatures:Lmirror/RefObject;

    .line 693
    .line 694
    iget-object p5, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 695
    .line 696
    invoke-virtual {p3, p1, p5}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    sget-object p3, Lmirror/android/content/pm/PackageInfoPie;->signingInfo:Lmirror/RefObject;

    .line 700
    .line 701
    sget-object p5, Lmirror/android/content/pm/SigningInfo;->ctor:Lmirror/RefConstructor;

    .line 702
    .line 703
    new-array p2, p2, [Ljava/lang/Object;

    .line 704
    .line 705
    aput-object p1, p2, p4

    .line 706
    .line 707
    invoke-virtual {p5, p2}, Lmirror/RefConstructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object p1

    .line 711
    invoke-virtual {p3, v0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 715
    .line 716
    iget-object p0, p0, Landroid/content/pm/PackageParser$SigningDetails;->signatures:[Landroid/content/pm/Signature;

    .line 717
    .line 718
    iput-object p0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 719
    .line 720
    :cond_20
    :goto_10
    new-instance p0, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 721
    .line 722
    invoke-direct {p0}, Lcom/lody/virtual/server/pm/parser/VPackage;-><init>()V

    .line 723
    .line 724
    .line 725
    iget-object p1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 726
    .line 727
    iput-object p1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 728
    .line 729
    invoke-static {p0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->fixSignatureAsSystem(Lcom/lody/virtual/server/pm/parser/VPackage;)V

    .line 730
    .line 731
    .line 732
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 733
    .line 734
    if-eqz p0, :cond_21

    .line 735
    .line 736
    iput-object p0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 737
    .line 738
    :cond_21
    return-object v0
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
.end method

.method public static generatePermissionGroupInfo(Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;I)Landroid/content/pm/PermissionGroupInfo;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    and-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;->info:Landroid/content/pm/PermissionGroupInfo;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    new-instance p1, Landroid/content/pm/PermissionGroupInfo;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionGroupComponent;->info:Landroid/content/pm/PermissionGroupInfo;

    .line 15
    .line 16
    invoke-direct {p1, v0}, Landroid/content/pm/PermissionGroupInfo;-><init>(Landroid/content/pm/PermissionGroupInfo;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->metaData:Landroid/os/Bundle;

    .line 20
    .line 21
    iput-object p0, p1, Landroid/content/pm/PermissionGroupInfo;->metaData:Landroid/os/Bundle;

    .line 22
    .line 23
    return-object p1
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

.method public static generatePermissionInfo(Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;I)Landroid/content/pm/PermissionInfo;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    and-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;->info:Landroid/content/pm/PermissionInfo;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    new-instance p1, Landroid/content/pm/PermissionInfo;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$PermissionComponent;->info:Landroid/content/pm/PermissionInfo;

    .line 15
    .line 16
    invoke-direct {p1, v0}, Landroid/content/pm/PermissionInfo;-><init>(Landroid/content/pm/PermissionInfo;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->metaData:Landroid/os/Bundle;

    .line 20
    .line 21
    iput-object p0, p1, Landroid/content/pm/PermissionInfo;->metaData:Landroid/os/Bundle;

    .line 22
    .line 23
    return-object p1
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

.method public static generateProviderInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ProviderInfo;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p2, p1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->checkUseInstalledOrHidden(Lcom/lody/virtual/server/pm/PackageUserState;I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    new-instance v1, Landroid/content/pm/ProviderInfo;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 15
    .line 16
    invoke-direct {v1, v2}, Landroid/content/pm/ProviderInfo;-><init>(Landroid/content/pm/ProviderInfo;)V

    .line 17
    .line 18
    .line 19
    and-int/lit16 v2, p1, 0x80

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    iget-object v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->metaData:Landroid/os/Bundle;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    iput-object v2, v1, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;

    .line 28
    .line 29
    :cond_2
    and-int/lit16 v2, p1, 0x800

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    iput-object v0, v1, Landroid/content/pm/ProviderInfo;->uriPermissionPatterns:[Landroid/os/PatternMatcher;

    .line 34
    .line 35
    :cond_3
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$ProviderComponent;->info:Landroid/content/pm/ProviderInfo;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {v0, v2, p3}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->isEnabledLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput-boolean v0, v1, Landroid/content/pm/ProviderInfo;->enabled:Z

    .line 43
    .line 44
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 45
    .line 46
    invoke-static {p0, p1, p2, p3, p4}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateApplicationInfo(Lcom/lody/virtual/server/pm/parser/VPackage;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ApplicationInfo;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iput-object p0, v1, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 51
    .line 52
    return-object v1
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

.method public static generateServiceInfo(Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ServiceInfo;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p2, p1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->checkUseInstalledOrHidden(Lcom/lody/virtual/server/pm/PackageUserState;I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    new-instance v0, Landroid/content/pm/ServiceInfo;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;->info:Landroid/content/pm/ServiceInfo;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Landroid/content/pm/ServiceInfo;-><init>(Landroid/content/pm/ServiceInfo;)V

    .line 17
    .line 18
    .line 19
    and-int/lit16 v1, p1, 0x80

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->metaData:Landroid/os/Bundle;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iput-object v1, v0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 28
    .line 29
    :cond_2
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage$ServiceComponent;->info:Landroid/content/pm/ServiceInfo;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static {v1, v2, p3}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->isEnabledLPr(Landroid/content/pm/ComponentInfo;II)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iput-boolean v1, v0, Landroid/content/pm/ServiceInfo;->enabled:Z

    .line 37
    .line 38
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage$Component;->owner:Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 39
    .line 40
    invoke-static {p0, p1, p2, p3, p4}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->generateApplicationInfo(Lcom/lody/virtual/server/pm/parser/VPackage;ILcom/lody/virtual/server/pm/PackageUserState;IZ)Landroid/content/pm/ApplicationInfo;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p0, v0, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 45
    .line 46
    return-object v0
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

.method private static initApplicationAsUser(Landroid/content/pm/ApplicationInfo;IZ)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/server/pm/PackageCacheManager;->getSetting(Ljava/lang/String;)Lcom/lody/virtual/server/pm/PackageSetting;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/lody/virtual/server/pm/PackageCacheManager;->get(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v0, :cond_10

    .line 14
    .line 15
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getConfig()Lcom/lody/virtual/client/core/SettingConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    :try_start_0
    iget-object v5, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, v5}, Lcom/lody/virtual/client/core/SettingConfig;->isOutsideAppInfoPriority(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Lcom/lody/virtual/client/core/VirtualCore;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v6, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v5, v6, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 40
    .line 41
    .line 42
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :catchall_0
    :cond_0
    if-eqz p2, :cond_2

    .line 44
    .line 45
    iget-boolean v5, v0, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 46
    .line 47
    if-nez v5, :cond_2

    .line 48
    .line 49
    iget-object v5, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v5}, Lcom/lody/virtual/os/VEnvironment;->getPackageFileExt(Ljava/lang/String;)Ljava/io/File;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    iput-object v5, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 60
    .line 61
    iput-object v5, p0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v5, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v5}, Lcom/lody/virtual/os/VEnvironment;->getDataAppLibDirectoryExt(Ljava/lang/String;)Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    new-instance v6, Ljava/io/File;

    .line 70
    .line 71
    iget-object v7, v0, Lcom/lody/virtual/server/pm/PackageSetting;->primaryCpuAbi:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v7}, Lcom/lody/virtual/client/env/VirtualRuntime;->getInstructionSet(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-direct {v6, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    iput-object v6, p0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v6, v0, Lcom/lody/virtual/server/pm/PackageSetting;->secondaryCpuAbi:Ljava/lang/String;

    .line 87
    .line 88
    if-eqz v6, :cond_1

    .line 89
    .line 90
    new-instance v6, Ljava/io/File;

    .line 91
    .line 92
    iget-object v7, v0, Lcom/lody/virtual/server/pm/PackageSetting;->secondaryCpuAbi:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v7}, Lcom/lody/virtual/client/env/VirtualRuntime;->getInstructionSet(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-direct {v6, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    sget-object v5, Lmirror/android/content/pm/ApplicationInfoL;->secondaryNativeLibraryDir:Lmirror/RefObject;

    .line 102
    .line 103
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-virtual {v5, p0, v6}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :cond_1
    iget-object v5, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v5}, Lcom/lody/virtual/os/VEnvironment;->getDataAppPackageDirectoryExt(Ljava/lang/String;)Ljava/io/File;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    sget-object v6, Lmirror/android/content/pm/ApplicationInfoL;->scanSourceDir:Lmirror/RefObject;

    .line 121
    .line 122
    invoke-virtual {v6, p0, v5}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    sget-object v6, Lmirror/android/content/pm/ApplicationInfoL;->scanPublicSourceDir:Lmirror/RefObject;

    .line 126
    .line 127
    invoke-virtual {v6, p0, v5}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :cond_2
    iget-boolean v5, v0, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 131
    .line 132
    const/16 v6, 0x1a

    .line 133
    .line 134
    if-nez v5, :cond_6

    .line 135
    .line 136
    iget-object v5, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->splitNames:Ljava/util/ArrayList;

    .line 137
    .line 138
    if-eqz v5, :cond_6

    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-nez v5, :cond_6

    .line 145
    .line 146
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 147
    .line 148
    if-lt v5, v6, :cond_3

    .line 149
    .line 150
    iget-object v5, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->splitNames:Ljava/util/ArrayList;

    .line 151
    .line 152
    new-array v7, v3, [Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, [Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {p0, v5}, Lcom/lody/virtual/server/pm/b;->a(Landroid/content/pm/ApplicationInfo;[Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    iget-object v7, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->splitNames:Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v8, :cond_5

    .line 179
    .line 180
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    check-cast v8, Ljava/lang/String;

    .line 185
    .line 186
    if-eqz p2, :cond_4

    .line 187
    .line 188
    iget-object v9, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v9, v8}, Lcom/lody/virtual/os/VEnvironment;->getSplitPackageFileExt(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    goto :goto_1

    .line 195
    :cond_4
    iget-object v9, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v9, v8}, Lcom/lody/virtual/os/VEnvironment;->getSplitPackageFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    :goto_1
    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_5
    iget-object v7, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 210
    .line 211
    new-array v8, v3, [Ljava/lang/String;

    .line 212
    .line 213
    invoke-interface {v5, v8}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    check-cast v8, [Ljava/lang/String;

    .line 218
    .line 219
    iput-object v8, v7, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    .line 220
    .line 221
    iget-object v7, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 222
    .line 223
    new-array v3, v3, [Ljava/lang/String;

    .line 224
    .line 225
    invoke-interface {v5, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, [Ljava/lang/String;

    .line 230
    .line 231
    iput-object v3, v7, Landroid/content/pm/ApplicationInfo;->splitPublicSourceDirs:[Ljava/lang/String;

    .line 232
    .line 233
    :cond_6
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 234
    .line 235
    if-lt v3, v6, :cond_7

    .line 236
    .line 237
    if-eqz v4, :cond_7

    .line 238
    .line 239
    iget-boolean v0, v0, Lcom/lody/virtual/server/pm/PackageSetting;->dynamic:Z

    .line 240
    .line 241
    if-eqz v0, :cond_7

    .line 242
    .line 243
    invoke-static {v4}, Lcom/lody/virtual/server/pm/a;->a(Landroid/content/pm/ApplicationInfo;)[Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {p0, v0}, Lcom/lody/virtual/server/pm/b;->a(Landroid/content/pm/ApplicationInfo;[Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    sget-object v0, Lmirror/android/content/pm/ApplicationInfoO;->splitDependencies:Lmirror/RefObject;

    .line 251
    .line 252
    invoke-static {v0, v4}, Lcom/lody/virtual/helper/utils/RefObjUtil;->getRefObjectValue(Lmirror/RefObject;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, Landroid/util/SparseArray;

    .line 257
    .line 258
    sget-object v3, Lmirror/android/content/pm/ApplicationInfoO;->splitDependencies:Lmirror/RefObject;

    .line 259
    .line 260
    invoke-static {v3, p0}, Lcom/lody/virtual/helper/utils/RefObjUtil;->getRefObjectValue(Lmirror/RefObject;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    check-cast v3, Landroid/util/SparseArray;

    .line 265
    .line 266
    if-eqz v0, :cond_7

    .line 267
    .line 268
    if-nez v3, :cond_7

    .line 269
    .line 270
    sget-object v3, Lmirror/android/content/pm/ApplicationInfoO;->splitDependencies:Lmirror/RefObject;

    .line 271
    .line 272
    invoke-static {v3, p0, v0}, Lcom/lody/virtual/helper/utils/RefObjUtil;->setRefObjectValue(Lmirror/RefObject;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_7
    if-eqz p2, :cond_8

    .line 276
    .line 277
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 278
    .line 279
    invoke-static {p1, v0}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    goto :goto_2

    .line 288
    :cond_8
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 289
    .line 290
    invoke-static {p1, v0}, Lcom/lody/virtual/os/VEnvironment;->getDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    :goto_2
    iput-object v0, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 299
    .line 300
    if-eqz p2, :cond_9

    .line 301
    .line 302
    iget-object p2, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 303
    .line 304
    invoke-static {p1, p2}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserPackageDirectoryExt(ILjava/lang/String;)Ljava/io/File;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    goto :goto_3

    .line 313
    :cond_9
    iget-object p2, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 314
    .line 315
    invoke-static {p1, p2}, Lcom/lody/virtual/os/VEnvironment;->getDeDataUserPackageDirectory(ILjava/lang/String;)Ljava/io/File;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    :goto_3
    sget-object p2, Lmirror/android/content/pm/ApplicationInfoN;->deviceEncryptedDataDir:Lmirror/RefObject;

    .line 324
    .line 325
    if-eqz p2, :cond_a

    .line 326
    .line 327
    invoke-virtual {p2, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_a
    sget-object p2, Lmirror/android/content/pm/ApplicationInfoN;->credentialEncryptedDataDir:Lmirror/RefObject;

    .line 331
    .line 332
    if-eqz p2, :cond_b

    .line 333
    .line 334
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {p2, p0, v0}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    :cond_b
    sget-object p2, Lmirror/android/content/pm/ApplicationInfoN;->deviceProtectedDataDir:Lmirror/RefObject;

    .line 340
    .line 341
    if-eqz p2, :cond_c

    .line 342
    .line 343
    invoke-virtual {p2, p0, p1}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    :cond_c
    sget-object p1, Lmirror/android/content/pm/ApplicationInfoN;->credentialProtectedDataDir:Lmirror/RefObject;

    .line 347
    .line 348
    if-eqz p1, :cond_d

    .line 349
    .line 350
    iget-object p2, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {p1, p0, p2}, Lmirror/RefObject;->set(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    :cond_d
    invoke-virtual {v2}, Lcom/lody/virtual/client/core/SettingConfig;->isEnableIORedirect()Z

    .line 356
    .line 357
    .line 358
    move-result p1

    .line 359
    if-eqz p1, :cond_f

    .line 360
    .line 361
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->getContext()Landroid/content/Context;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-static {p1}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->isVAppCalling(Landroid/content/Context;)Z

    .line 370
    .line 371
    .line 372
    move-result p1

    .line 373
    if-eqz p1, :cond_f

    .line 374
    .line 375
    iget-object p1, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 376
    .line 377
    invoke-virtual {v2, p1}, Lcom/lody/virtual/client/core/SettingConfig;->isUseRealDataDir(Ljava/lang/String;)Z

    .line 378
    .line 379
    .line 380
    move-result p1

    .line 381
    if-eqz p1, :cond_e

    .line 382
    .line 383
    new-instance p1, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 386
    .line 387
    .line 388
    const-string p2, "/data/user/0/"

    .line 389
    .line 390
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    iget-object p2, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    const-string p2, "/"

    .line 399
    .line 400
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    iput-object p1, p0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 408
    .line 409
    :cond_e
    iget-object p1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v2, p1, p0}, Lcom/lody/virtual/client/core/SettingConfig;->isUseRealApkPath(Ljava/lang/String;Landroid/content/pm/ApplicationInfo;)Z

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    if-eqz p1, :cond_f

    .line 416
    .line 417
    iget-object p1, v1, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {p1}, Lcom/lody/virtual/os/VEnvironment;->getPackageFileStub(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    iput-object p1, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 424
    .line 425
    iput-object p1, p0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 426
    .line 427
    :cond_f
    return-void

    .line 428
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 429
    .line 430
    new-instance p2, Ljava/lang/StringBuilder;

    .line 431
    .line 432
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 433
    .line 434
    .line 435
    const-string v0, "failed to getSetting for:"

    .line 436
    .line 437
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 441
    .line 442
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw p1
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

.method public static initApplicationInfoBase(Lcom/lody/virtual/server/pm/PackageSetting;Lcom/lody/virtual/server/pm/parser/VPackage;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 2
    .line 3
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p1, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p1, Landroid/content/pm/ApplicationInfo;->enabled:Z

    .line 17
    .line 18
    iget v0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->appId:I

    .line 19
    .line 20
    iput v0, p1, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 21
    .line 22
    iget-object p0, p0, Lcom/lody/virtual/server/pm/PackageSetting;->packageName:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0, v0}, Lcom/lody/virtual/client/fixer/ComponentFixer;->fixComponentClassName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iput-object p0, p1, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    .line 31
    .line 32
    return-void
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

.method public static isEnabledLPr(Landroid/content/pm/ComponentInfo;II)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/lody/virtual/helper/utils/ComponentUtils;->toComponentName(Landroid/content/pm/ComponentInfo;)Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Lcom/lody/virtual/server/pm/ComponentStateManager;->user(I)Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2, p1}, Lcom/lody/virtual/server/pm/ComponentStateManager$UserComponentState;->get(Landroid/content/ComponentName;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-boolean p0, p0, Landroid/content/pm/ComponentInfo;->enabled:Z

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x2

    .line 19
    const/4 p2, 0x0

    .line 20
    if-ne p1, p0, :cond_1

    .line 21
    .line 22
    return p2

    .line 23
    :cond_1
    const/4 p0, 0x4

    .line 24
    if-ne p1, p0, :cond_2

    .line 25
    .line 26
    return p2

    .line 27
    :cond_2
    const/4 p0, 0x3

    .line 28
    if-ne p1, p0, :cond_3

    .line 29
    .line 30
    return p2

    .line 31
    :cond_3
    const/4 p0, 0x1

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
.end method

.method private static isLibraryPresent(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1
    if-eqz p1, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    return v0

    .line 52
    :cond_3
    const/4 p0, 0x0

    .line 53
    return p0
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
.end method

.method private static isVAppCalling(Landroid/content/Context;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "activity"

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/app/ActivityManager;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 38
    .line 39
    iget v3, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 40
    .line 41
    if-ne v3, v1, :cond_0

    .line 42
    .line 43
    iget-object p0, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    :goto_0
    const/4 v1, 0x0

    .line 48
    if-nez p0, :cond_2

    .line 49
    .line 50
    return v1

    .line 51
    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    return v1

    .line 58
    :cond_3
    sget-object v0, Lcom/lody/virtual/client/env/Constants;->SERVER_PROCESS_NAME:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    return v1

    .line 67
    :cond_4
    sget-object v0, Lcom/lody/virtual/client/env/Constants;->HELPER_PROCESS_NAME:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    return v1

    .line 76
    :cond_5
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, p0}, Lcom/lody/virtual/client/ipc/VActivityManager;->isAppProcess(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_6

    .line 85
    .line 86
    const/4 p0, 0x1

    .line 87
    return p0

    .line 88
    :cond_6
    return v1
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
.end method

.method public static parsePackage(Ljava/io/File;)Lcom/lody/virtual/server/pm/parser/VPackage;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/lody/virtual/helper/compat/PackageParserCompat;->createParser(Ljava/io/File;)Landroid/content/pm/PackageParser;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isQ()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Landroid/content/pm/PackageParser$CallbackImpl;

    .line 12
    .line 13
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->getPM()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2}, Landroid/content/pm/PackageParser$CallbackImpl;-><init>(Landroid/content/pm/PackageManager;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageParser;->setCallback(Landroid/content/pm/PackageParser$Callback;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    invoke-static {v0, p0, v1}, Lcom/lody/virtual/helper/compat/PackageParserCompat;->parsePackage(Landroid/content/pm/PackageParser;Ljava/io/File;I)Landroid/content/pm/PackageParser$Package;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->requestedPermissions:Ljava/util/ArrayList;

    .line 29
    .line 30
    const-string v3, "android.permission.FAKE_PACKAGE_SIGNATURE"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-object v2, p0, Landroid/content/pm/PackageParser$Package;->mAppMetaData:Landroid/os/Bundle;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    const-string v4, "fake-signature"

    .line 44
    .line 45
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, Landroid/content/pm/PackageParser$Package;->mAppMetaData:Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-array v2, v3, [Landroid/content/pm/Signature;

    .line 58
    .line 59
    new-instance v3, Landroid/content/pm/Signature;

    .line 60
    .line 61
    invoke-direct {v3, v0}, Landroid/content/pm/Signature;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    aput-object v3, v2, v1

    .line 65
    .line 66
    invoke-static {p0, v2}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->buildSignature(Landroid/content/pm/PackageParser$Package;[Landroid/content/pm/Signature;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->TAG:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v3, "Using fake-signature feature on : "

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v3, p0, Landroid/content/pm/PackageParser$Package;->packageName:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-array v1, v1, [Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {v0, v2, v1}, Lcom/lody/virtual/helper/utils/VLog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_2

    .line 101
    .line 102
    const/16 v3, 0x10

    .line 103
    .line 104
    :cond_2
    invoke-static {v0, p0, v3}, Lcom/lody/virtual/helper/compat/PackageParserCompat;->collectCertificates(Landroid/content/pm/PackageParser;Landroid/content/pm/PackageParser$Package;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 110
    .line 111
    .line 112
    :goto_0
    invoke-static {p0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->buildPackageCache(Landroid/content/pm/PackageParser$Package;)Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
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
.end method

.method public static readPackageCache(Ljava/lang/String;)Lcom/lody/virtual/server/pm/parser/VPackage;
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-static {p0}, Lcom/lody/virtual/os/VEnvironment;->getPackageCacheFile(Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v1, Ljava/io/FileInputStream;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lcom/lody/virtual/helper/utils/FileUtils;->toByteArray(Ljava/io/InputStream;)[B

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 19
    .line 20
    .line 21
    array-length v1, p0

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, p0, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const/4 v1, 0x4

    .line 34
    if-ne p0, v1, :cond_0

    .line 35
    .line 36
    new-instance p0, Lcom/lody/virtual/server/pm/parser/VPackage;

    .line 37
    .line 38
    invoke-direct {p0, v0}, Lcom/lody/virtual/server/pm/parser/VPackage;-><init>(Landroid/os/Parcel;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->addOwner(Lcom/lody/virtual/server/pm/parser/VPackage;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v1, "Invalid version."

    .line 51
    .line 52
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception p0

    .line 59
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return-object p0

    .line 67
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 68
    .line 69
    .line 70
    throw p0
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

.method public static readSignature(Lcom/lody/virtual/server/pm/parser/VPackage;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getSignatureFile(Ljava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lcom/lody/virtual/helper/utils/FileUtils;->toByteArray(Ljava/io/InputStream;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 28
    .line 29
    .line 30
    array-length v2, v0

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v1, v0, v3, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/lody/virtual/helper/compat/BuildCompat;->isPie()Z

    .line 39
    .line 40
    .line 41
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :try_start_1
    sget-object v0, Lmirror/android/content/pm/PackageParser$SigningDetails;->CREATOR:Lmirror/RefStaticObject;

    .line 45
    .line 46
    invoke-virtual {v0}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/os/Parcelable$Creator;

    .line 51
    .line 52
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/content/pm/PackageParser$SigningDetails;

    .line 57
    .line 58
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 59
    .line 60
    iget-object v2, v0, Landroid/content/pm/PackageParser$SigningDetails;->pastSigningCertificates:[Landroid/content/pm/Signature;

    .line 61
    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    array-length v4, v2

    .line 65
    if-lez v4, :cond_1

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    new-array v0, v0, [Landroid/content/pm/Signature;

    .line 69
    .line 70
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 71
    .line 72
    aget-object v2, v2, v3

    .line 73
    .line 74
    aput-object v2, v0, v3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iget-object v0, v0, Landroid/content/pm/PackageParser$SigningDetails;->signatures:[Landroid/content/pm/Signature;

    .line 78
    .line 79
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catch_0
    move-exception v0

    .line 83
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 91
    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    :cond_3
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Landroid/content/pm/Signature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, [Landroid/content/pm/Signature;

    .line 104
    .line 105
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    goto :goto_2

    .line 113
    :catch_1
    move-exception p0

    .line 114
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    .line 116
    .line 117
    :cond_4
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 122
    .line 123
    .line 124
    throw p0
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
.end method

.method public static savePackageCache(Lcom/lody/virtual/server/pm/parser/VPackage;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getPackageCacheFile(Ljava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v0}, Lcom/lody/virtual/os/VEnvironment;->getSignatureFile(Ljava/lang/String;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const/4 v4, 0x4

    .line 34
    const/4 v5, 0x0

    .line 35
    :try_start_0
    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v3, v5}, Lcom/lody/virtual/server/pm/parser/VPackage;->writeToParcel(Landroid/os/Parcel;I)V

    .line 39
    .line 40
    .line 41
    new-instance v4, Ljava/io/FileOutputStream;

    .line 42
    .line 43
    invoke-direct {v4, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/os/Parcel;->marshall()[B

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v4, v1}, Ljava/io/FileOutputStream;->write([B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_6

    .line 59
    :catch_0
    move-exception v1

    .line 60
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSignatures:[Landroid/content/pm/Signature;

    .line 67
    .line 68
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->mSigningDetails:Landroid/content/pm/PackageParser$SigningDetails;

    .line 69
    .line 70
    if-nez p0, :cond_2

    .line 71
    .line 72
    move-object v3, v1

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object v3, p0

    .line 75
    :goto_1
    if-eqz v3, :cond_5

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-nez v4, :cond_3

    .line 88
    .line 89
    sget-object v4, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->TAG:Ljava/lang/String;

    .line 90
    .line 91
    new-instance v6, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v7, "Unable to delete the signatures of "

    .line 97
    .line 98
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-array v6, v5, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v4, v0, v6}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :try_start_2
    instance-of v3, v3, Landroid/content/pm/PackageParser$SigningDetails;

    .line 118
    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    sget-object v1, Lmirror/android/content/pm/PackageParser$SigningDetails;->writeToParcel:Lmirror/RefMethod;

    .line 122
    .line 123
    const/4 v3, 0x2

    .line 124
    new-array v3, v3, [Ljava/lang/Object;

    .line 125
    .line 126
    aput-object v0, v3, v5

    .line 127
    .line 128
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    const/4 v5, 0x1

    .line 133
    aput-object v4, v3, v5

    .line 134
    .line 135
    invoke-virtual {v1, p0, v3}, Lmirror/RefMethod;->call(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    invoke-virtual {v0, v1, v5}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 140
    .line 141
    .line 142
    :goto_2
    invoke-static {v0, v2}, Lcom/lody/virtual/helper/utils/FileUtils;->writeParcelToFile(Landroid/os/Parcel;Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catchall_1
    move-exception p0

    .line 147
    goto :goto_4

    .line 148
    :catch_1
    move-exception p0

    .line 149
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 150
    .line 151
    .line 152
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 157
    .line 158
    .line 159
    throw p0

    .line 160
    :cond_5
    :goto_5
    return-void

    .line 161
    :goto_6
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 162
    .line 163
    .line 164
    throw p0
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

.method private static updatePackageApache(Lcom/lody/virtual/server/pm/parser/VPackage;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 29
    .line 30
    const/16 v2, 0x1c

    .line 31
    .line 32
    if-ge v0, v2, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 37
    .line 38
    const-string v3, "org.apache.http.legacy"

    .line 39
    .line 40
    invoke-static {v0, v2, v3}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->isLibraryPresent(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesOptionalLibraries:Ljava/util/ArrayList;

    .line 58
    .line 59
    const-string v3, "android.test.base"

    .line 60
    .line 61
    invoke-static {v0, v2, v3}, Lcom/lody/virtual/server/pm/parser/PackageParserEx;->isLibraryPresent(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    iget-object p0, p0, Lcom/lody/virtual/server/pm/parser/VPackage;->usesLibraries:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {p0, v1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    return-void
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
