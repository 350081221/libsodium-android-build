.class public final Landroidx/navigation/NavDeepLinkBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;,
        Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u000223B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008-\u0010.B\u0011\u0008\u0010\u0012\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u0008-\u00101J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0002J\u0008\u0010\u0008\u001a\u00020\u0006H\u0002J\u0018\u0010\u000c\u001a\u00020\u00002\u0010\u0010\u000b\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\n0\tJ\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u001e\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u001e\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u001c\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00162\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u0010\u0010\u001a\u001a\u00020\u00002\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\u00a8\u00064"
    }
    d2 = {
        "Landroidx/navigation/NavDeepLinkBuilder;",
        "",
        "",
        "destId",
        "Landroidx/navigation/NavDestination;",
        "findDestination",
        "Lkotlin/r2;",
        "verifyAllDestinations",
        "fillInIntent",
        "Ljava/lang/Class;",
        "Landroid/app/Activity;",
        "activityClass",
        "setComponentName",
        "Landroid/content/ComponentName;",
        "componentName",
        "navGraphId",
        "setGraph",
        "Landroidx/navigation/NavGraph;",
        "navGraph",
        "Landroid/os/Bundle;",
        "args",
        "setDestination",
        "",
        "destRoute",
        "addDestination",
        "route",
        "setArguments",
        "Landroidx/core/app/TaskStackBuilder;",
        "createTaskStackBuilder",
        "Landroid/app/PendingIntent;",
        "createPendingIntent",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Landroid/content/Intent;",
        "intent",
        "Landroid/content/Intent;",
        "graph",
        "Landroidx/navigation/NavGraph;",
        "",
        "Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;",
        "destinations",
        "Ljava/util/List;",
        "globalArgs",
        "Landroid/os/Bundle;",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroidx/navigation/NavController;",
        "navController",
        "(Landroidx/navigation/NavController;)V",
        "DeepLinkDestination",
        "PermissiveNavigatorProvider",
        "navigation-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final destinations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private globalArgs:Landroid/os/Bundle;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private graph:Landroidx/navigation/NavGraph;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final intent:Landroid/content/Intent;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->context:Landroid/content/Context;

    .line 2
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    :cond_1
    :goto_0
    const p1, 0x10008000

    .line 6
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 7
    iput-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->intent:Landroid/content/Intent;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroidx/navigation/NavController;)V
    .locals 1
    .param p1    # Landroidx/navigation/NavController;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Landroidx/navigation/NavController;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/navigation/NavDeepLinkBuilder;-><init>(Landroid/content/Context;)V

    .line 10
    invoke-virtual {p1}, Landroidx/navigation/NavController;->getGraph()Landroidx/navigation/NavGraph;

    move-result-object p1

    iput-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    return-void
.end method

.method public static synthetic addDestination$default(Landroidx/navigation/NavDeepLinkBuilder;ILandroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/navigation/NavDeepLinkBuilder;->addDestination(ILandroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addDestination$default(Landroidx/navigation/NavDeepLinkBuilder;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/navigation/NavDeepLinkBuilder;->addDestination(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p0

    return-object p0
.end method

.method private final fillInIntent()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;

    .line 29
    .line 30
    invoke-virtual {v4}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;->getDestinationId()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v4}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;->getArguments()Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-direct {p0, v5}, Landroidx/navigation/NavDeepLinkBuilder;->findDestination(I)Landroidx/navigation/NavDestination;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    invoke-virtual {v6, v3}, Landroidx/navigation/NavDestination;->buildDeepLinkIds(Landroidx/navigation/NavDestination;)[I

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    array-length v5, v3

    .line 49
    const/4 v7, 0x0

    .line 50
    :goto_1
    if-ge v7, v5, :cond_0

    .line 51
    .line 52
    aget v8, v3, v7

    .line 53
    .line 54
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    add-int/lit8 v7, v7, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    move-object v3, v6

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    sget-object v0, Landroidx/navigation/NavDestination;->Companion:Landroidx/navigation/NavDestination$Companion;

    .line 70
    .line 71
    iget-object v1, p0, Landroidx/navigation/NavDeepLinkBuilder;->context:Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v5}, Landroidx/navigation/NavDestination$Companion;->getDisplayName(Landroid/content/Context;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v3, "Navigation destination "

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, " cannot be found in the navigation graph "

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    :cond_2
    invoke-static {v0}, Lkotlin/collections/u;->R5(Ljava/util/Collection;)[I

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v2, p0, Landroidx/navigation/NavDeepLinkBuilder;->intent:Landroid/content/Intent;

    .line 115
    .line 116
    const-string v3, "android-support-nav:controller:deepLinkIds"

    .line 117
    .line 118
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->intent:Landroid/content/Intent;

    .line 122
    .line 123
    const-string v2, "android-support-nav:controller:deepLinkArgs"

    .line 124
    .line 125
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 126
    .line 127
    .line 128
    return-void
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
.end method

.method private final findDestination(I)Landroidx/navigation/NavDestination;
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lkotlin/collections/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/collections/k;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lkotlin/collections/k;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lkotlin/collections/k;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Lkotlin/collections/k;->removeFirst()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroidx/navigation/NavDestination;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/navigation/NavDestination;->getId()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ne v2, p1, :cond_1

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_1
    instance-of v2, v1, Landroidx/navigation/NavGraph;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    check-cast v1, Landroidx/navigation/NavGraph;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/navigation/NavGraph;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Landroidx/navigation/NavDestination;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Lkotlin/collections/k;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 p1, 0x0

    .line 60
    return-object p1
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
.end method

.method public static synthetic setDestination$default(Landroidx/navigation/NavDeepLinkBuilder;ILandroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/navigation/NavDeepLinkBuilder;->setDestination(ILandroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic setDestination$default(Landroidx/navigation/NavDeepLinkBuilder;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/navigation/NavDeepLinkBuilder;->setDestination(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p0

    return-object p0
.end method

.method private final verifyAllDestinations()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
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
    check-cast v1, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;->getDestinationId()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {p0, v1}, Landroidx/navigation/NavDeepLinkBuilder;->findDestination(I)Landroidx/navigation/NavDestination;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Landroidx/navigation/NavDestination;->Companion:Landroidx/navigation/NavDestination$Companion;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/navigation/NavDeepLinkBuilder;->context:Landroid/content/Context;

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Landroidx/navigation/NavDestination$Companion;->getDisplayName(Landroid/content/Context;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "Navigation destination "

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, " cannot be found in the navigation graph "

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v1

    .line 71
    :cond_1
    return-void
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
.end method


# virtual methods
.method public final addDestination(I)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Landroidx/navigation/NavDeepLinkBuilder;->addDestination$default(Landroidx/navigation/NavDeepLinkBuilder;ILandroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final addDestination(ILandroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    new-instance v1, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;

    invoke-direct {v1, p1, p2}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;-><init>(ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0}, Landroidx/navigation/NavDeepLinkBuilder;->verifyAllDestinations()V

    :cond_0
    return-object p0
.end method

.method public final addDestination(Ljava/lang/String;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Landroidx/navigation/NavDeepLinkBuilder;->addDestination$default(Landroidx/navigation/NavDeepLinkBuilder;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final addDestination(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    new-instance v1, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;

    sget-object v2, Landroidx/navigation/NavDestination;->Companion:Landroidx/navigation/NavDestination$Companion;

    invoke-virtual {v2, p1}, Landroidx/navigation/NavDestination$Companion;->createRoute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-direct {v1, p1, p2}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;-><init>(ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    if-eqz p1, :cond_0

    .line 6
    invoke-direct {p0}, Landroidx/navigation/NavDeepLinkBuilder;->verifyAllDestinations()V

    :cond_0
    return-object p0
.end method

.method public final createPendingIntent()Landroid/app/PendingIntent;
    .locals 6
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->globalArgs:Landroid/os/Bundle;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    move v3, v1

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    mul-int/lit8 v3, v3, 0x1f

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v4, v1

    .line 41
    :goto_1
    add-int/2addr v3, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v3, v1

    .line 44
    :cond_2
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_5

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;->getDestinationId()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    mul-int/lit8 v3, v3, 0x1f

    .line 67
    .line 68
    add-int/2addr v3, v4

    .line 69
    invoke-virtual {v2}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;->getArguments()Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_3

    .line 88
    .line 89
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    mul-int/lit8 v3, v3, 0x1f

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    goto :goto_3

    .line 108
    :cond_4
    move v5, v1

    .line 109
    :goto_3
    add-int/2addr v3, v5

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    invoke-virtual {p0}, Landroidx/navigation/NavDeepLinkBuilder;->createTaskStackBuilder()Landroidx/core/app/TaskStackBuilder;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const/high16 v1, 0xc000000

    .line 116
    .line 117
    invoke-virtual {v0, v3, v1}, Landroidx/core/app/TaskStackBuilder;->getPendingIntent(II)Landroid/app/PendingIntent;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-object v0
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
.end method

.method public final createTaskStackBuilder()Landroidx/core/app/TaskStackBuilder;
    .locals 6
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    .line 6
    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/navigation/NavDeepLinkBuilder;->fillInIntent()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->context:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v0}, Landroidx/core/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroidx/core/app/TaskStackBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Landroid/content/Intent;

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/navigation/NavDeepLinkBuilder;->intent:Landroid/content/Intent;

    .line 29
    .line 30
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroidx/core/app/TaskStackBuilder;->addNextIntentWithParentStack(Landroid/content/Intent;)Landroidx/core/app/TaskStackBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "create(context)\n        \u2026rentStack(Intent(intent))"

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/core/app/TaskStackBuilder;->getIntentCount()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x0

    .line 47
    :goto_0
    if-ge v2, v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroidx/core/app/TaskStackBuilder;->editIntentAt(I)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    const-string v4, "android-support-nav:controller:deepLinkIntent"

    .line 56
    .line 57
    iget-object v5, p0, Landroidx/navigation/NavDeepLinkBuilder;->intent:Landroid/content/Intent;

    .line 58
    .line 59
    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-object v0

    .line 66
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v1, "You must call setDestination() or addDestination() before constructing the deep link"

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v1, "You must call setGraph() before constructing the deep link"

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0
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
.end method

.method public final setArguments(Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->globalArgs:Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->intent:Landroid/content/Intent;

    .line 4
    .line 5
    const-string v1, "android-support-nav:controller:deepLinkExtras"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    return-object p0
    .line 11
    .line 12
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
.end method

.method public final setComponentName(Landroid/content/ComponentName;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 1
    .param p1    # Landroid/content/ComponentName;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->intent:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    return-object p0
.end method

.method public final setComponentName(Ljava/lang/Class;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;)",
            "Landroidx/navigation/NavDeepLinkBuilder;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const-string v0, "activityClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Landroidx/navigation/NavDeepLinkBuilder;->context:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroidx/navigation/NavDeepLinkBuilder;->setComponentName(Landroid/content/ComponentName;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final setDestination(I)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Landroidx/navigation/NavDeepLinkBuilder;->setDestination$default(Landroidx/navigation/NavDeepLinkBuilder;ILandroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final setDestination(ILandroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    new-instance v1, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;

    invoke-direct {v1, p1, p2}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;-><init>(ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    if-eqz p1, :cond_0

    .line 4
    invoke-direct {p0}, Landroidx/navigation/NavDeepLinkBuilder;->verifyAllDestinations()V

    :cond_0
    return-object p0
.end method

.method public final setDestination(Ljava/lang/String;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const-string v0, "destRoute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Landroidx/navigation/NavDeepLinkBuilder;->setDestination$default(Landroidx/navigation/NavDeepLinkBuilder;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final setDestination(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/i;
    .end annotation

    const-string v0, "destRoute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    iget-object v0, p0, Landroidx/navigation/NavDeepLinkBuilder;->destinations:Ljava/util/List;

    new-instance v1, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;

    sget-object v2, Landroidx/navigation/NavDestination;->Companion:Landroidx/navigation/NavDestination$Companion;

    invoke-virtual {v2, p1}, Landroidx/navigation/NavDestination$Companion;->createRoute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-direct {v1, p1, p2}, Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;-><init>(ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    if-eqz p1, :cond_0

    .line 8
    invoke-direct {p0}, Landroidx/navigation/NavDeepLinkBuilder;->verifyAllDestinations()V

    :cond_0
    return-object p0
.end method

.method public final setGraph(I)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/NavigationRes;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Landroidx/navigation/NavInflater;

    iget-object v1, p0, Landroidx/navigation/NavDeepLinkBuilder;->context:Landroid/content/Context;

    new-instance v2, Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;

    invoke-direct {v2}, Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;-><init>()V

    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavInflater;-><init>(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V

    invoke-virtual {v0, p1}, Landroidx/navigation/NavInflater;->inflate(I)Landroidx/navigation/NavGraph;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/navigation/NavDeepLinkBuilder;->setGraph(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDeepLinkBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final setGraph(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDeepLinkBuilder;
    .locals 1
    .param p1    # Landroidx/navigation/NavGraph;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "navGraph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Landroidx/navigation/NavDeepLinkBuilder;->graph:Landroidx/navigation/NavGraph;

    .line 3
    invoke-direct {p0}, Landroidx/navigation/NavDeepLinkBuilder;->verifyAllDestinations()V

    return-object p0
.end method
