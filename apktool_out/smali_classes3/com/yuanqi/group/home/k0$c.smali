.class final Lcom/yuanqi/group/home/k0$c;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/k0;->R(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/o;",
        "Lv3/p<",
        "Lkotlinx/coroutines/s0;",
        "Lkotlin/coroutines/d<",
        "-",
        "Lkotlin/r2;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.yuanqi.group.home.HomePresenterImpl$launchApp$1"
    f = "HomePresenterImpl.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $packageName:Ljava/lang/String;

.field final synthetic $userId:I

.field label:I

.field final synthetic this$0:Lcom/yuanqi/group/home/k0;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/yuanqi/group/home/k0;ILkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/yuanqi/group/home/k0;",
            "I",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/group/home/k0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/group/home/k0$c;->$packageName:Ljava/lang/String;

    iput-object p2, p0, Lcom/yuanqi/group/home/k0$c;->this$0:Lcom/yuanqi/group/home/k0;

    iput p3, p0, Lcom/yuanqi/group/home/k0$c;->$userId:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/d<",
            "*>;)",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Lcom/yuanqi/group/home/k0$c;

    iget-object v0, p0, Lcom/yuanqi/group/home/k0$c;->$packageName:Ljava/lang/String;

    iget-object v1, p0, Lcom/yuanqi/group/home/k0$c;->this$0:Lcom/yuanqi/group/home/k0;

    iget v2, p0, Lcom/yuanqi/group/home/k0$c;->$userId:I

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/yuanqi/group/home/k0$c;-><init>(Ljava/lang/String;Lcom/yuanqi/group/home/k0;ILkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/home/k0$c;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lkotlinx/coroutines/s0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/s0;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/home/k0$c;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/group/home/k0$c;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/group/home/k0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/yuanqi/group/home/k0$c;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/yuanqi/group/home/k0$c;->$packageName:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/lody/virtual/client/core/VirtualCore;->isRunInExtProcess(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-static {}, Lcom/lody/virtual/client/core/VirtualCore;->get()Lcom/lody/virtual/client/core/VirtualCore;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/lody/virtual/client/core/VirtualCore;->isExtPackageInstalled()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x0

    .line 32
    const/4 v1, 0x2

    .line 33
    const/4 v2, 0x0

    .line 34
    const-string v3, "getString(...)"

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    iget-object p1, p0, Lcom/yuanqi/group/home/k0$c;->this$0:Lcom/yuanqi/group/home/k0;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/yuanqi/group/home/k0;->D(Lcom/yuanqi/group/home/k0;)Landroid/app/Activity;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const v4, 0x7f1200fc

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v2, v1, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_0
    invoke-static {}, Lcom/lody/virtual/server/extension/VExtPackageAccessor;->hasExtPackageBootPermission()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_1

    .line 65
    .line 66
    iget-object p1, p0, Lcom/yuanqi/group/home/k0$c;->this$0:Lcom/yuanqi/group/home/k0;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/yuanqi/group/home/k0;->D(Lcom/yuanqi/group/home/k0;)Landroid/app/Activity;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const v4, 0x7f12021d

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v2, v1, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_1
    new-instance p1, Landroid/content/Intent;

    .line 89
    .line 90
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 91
    .line 92
    .line 93
    new-instance v0, Landroid/content/ComponentName;

    .line 94
    .line 95
    sget-object v1, Lcom/lody/virtual/client/stub/StubManifest;->EXT_PACKAGE_NAME:Ljava/lang/String;

    .line 96
    .line 97
    const-class v2, Lcom/lody/virtual/client/stub/ExtLaunchAppActivity;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    const/high16 v0, 0x10000000

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 112
    .line 113
    .line 114
    const-string v0, "_VA_|_userid_"

    .line 115
    .line 116
    iget v1, p0, Lcom/yuanqi/group/home/k0$c;->$userId:I

    .line 117
    .line 118
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 119
    .line 120
    .line 121
    const-string v0, "_VA_|_package_"

    .line 122
    .line 123
    iget-object v1, p0, Lcom/yuanqi/group/home/k0$c;->$packageName:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/yuanqi/group/home/k0$c;->this$0:Lcom/yuanqi/group/home/k0;

    .line 129
    .line 130
    invoke-static {v0}, Lcom/yuanqi/group/home/k0;->D(Lcom/yuanqi/group/home/k0;)Landroid/app/Activity;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_2
    invoke-static {}, Lcom/lody/virtual/client/ipc/VActivityManager;->get()Lcom/lody/virtual/client/ipc/VActivityManager;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget v0, p0, Lcom/yuanqi/group/home/k0$c;->$userId:I

    .line 143
    .line 144
    iget-object v1, p0, Lcom/yuanqi/group/home/k0$c;->$packageName:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p1, v0, v1}, Lcom/lody/virtual/client/ipc/VActivityManager;->launchApp(ILjava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    :goto_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 150
    .line 151
    return-object p1

    .line 152
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 155
    .line 156
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1
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
