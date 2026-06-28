.class public final Lcom/yuanqi/master/mine/MineActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/master/mine/MineActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/yuanqi/master/mine/MineActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "mineViewModel",
        "Lcom/yuanqi/master/mine/MineViewModel;",
        "getMineViewModel",
        "()Lcom/yuanqi/master/mine/MineViewModel;",
        "mineViewModel$delegate",
        "Lkotlin/Lazy;",
        "backAccount",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "Companion",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nMineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineActivity.kt\ncom/yuanqi/master/mine/MineActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,104:1\n75#2,13:105\n*S KotlinDebug\n*F\n+ 1 MineActivity.kt\ncom/yuanqi/master/mine/MineActivity\n*L\n28#1:105,13\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lcom/yuanqi/master/mine/MineActivity$a;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final c:I

.field private static d:Lcom/yuanqi/master/mine/MineActivity;
    .annotation build Lp4/m;
    .end annotation
.end field


# instance fields
.field private final a:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/yuanqi/master/mine/MineActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yuanqi/master/mine/MineActivity$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/yuanqi/master/mine/MineActivity;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/yuanqi/master/mine/MineActivity$b;->INSTANCE:Lcom/yuanqi/master/mine/MineActivity$b;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/yuanqi/master/mine/MineActivity$e;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/yuanqi/master/mine/MineActivity$e;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 14
    .line 15
    const-class v2, Lcom/yuanqi/master/mine/MineViewModel;

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/jvm/internal/l1;->d(Ljava/lang/Class;)Lkotlin/reflect/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, Lcom/yuanqi/master/mine/MineActivity$f;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/yuanqi/master/mine/MineActivity$f;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Lcom/yuanqi/master/mine/MineActivity$g;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct {v4, v5, p0}, Lcom/yuanqi/master/mine/MineActivity$g;-><init>(Lv3/a;Landroidx/activity/ComponentActivity;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/d;Lv3/a;Lv3/a;Lv3/a;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/yuanqi/master/mine/MineActivity;->a:Lkotlin/d0;

    .line 36
    .line 37
    return-void
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
.end method

.method public static final synthetic C()Lcom/yuanqi/master/mine/MineActivity;
    .locals 1

    sget-object v0, Lcom/yuanqi/master/mine/MineActivity;->d:Lcom/yuanqi/master/mine/MineActivity;

    return-object v0
.end method

.method public static final synthetic D(Lcom/yuanqi/master/mine/MineActivity;)Lcom/yuanqi/master/mine/MineViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineActivity;->G()Lcom/yuanqi/master/mine/MineViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/yuanqi/master/mine/MineActivity;)V
    .locals 0

    sput-object p0, Lcom/yuanqi/master/mine/MineActivity;->d:Lcom/yuanqi/master/mine/MineActivity;

    return-void
.end method

.method private final G()Lcom/yuanqi/master/mine/MineViewModel;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineActivity;->a:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yuanqi/master/mine/MineViewModel;

    return-object v0
.end method


# virtual methods
.method public final F()V
    .locals 1

    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineActivity;->G()Lcom/yuanqi/master/mine/MineViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineViewModel;->e()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const-class v0, Lcom/yuanqi/master/mine/MineActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    sput-object p0, Lcom/yuanqi/master/mine/MineActivity;->d:Lcom/yuanqi/master/mine/MineActivity;

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineActivity;->G()Lcom/yuanqi/master/mine/MineViewModel;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, p0}, Lcom/yuanqi/master/mine/MineViewModel;->F(Landroid/app/Activity;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineActivity;->G()Lcom/yuanqi/master/mine/MineViewModel;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineViewModel;->t()Lkotlinx/coroutines/s0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lcom/yuanqi/master/mine/MineActivity$c;->INSTANCE:Lcom/yuanqi/master/mine/MineActivity$c;

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/yuanqi/master/mine/account/a;->n(Lkotlinx/coroutines/s0;Lv3/a;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lkotlin/jvm/internal/k1$h;

    .line 38
    .line 39
    invoke-direct {v0}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "screen"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/account/a;->c()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_0

    .line 61
    .line 62
    const-string p1, "/mine"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const-string p1, "/login"

    .line 66
    .line 67
    :goto_0
    iput-object p1, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 68
    .line 69
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v1, "register"

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineActivity;->G()Lcom/yuanqi/master/mine/MineViewModel;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Lcom/yuanqi/master/mine/MineViewModel;->S(Ljava/lang/Boolean;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v1, "isHomeToVip"

    .line 95
    .line 96
    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const/4 v1, 0x1

    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineActivity;->G()Lcom/yuanqi/master/mine/MineViewModel;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1, v1}, Lcom/yuanqi/master/mine/MineViewModel;->R(Z)V

    .line 108
    .line 109
    .line 110
    :cond_3
    new-instance p1, Lcom/yuanqi/master/mine/MineActivity$d;

    .line 111
    .line 112
    invoke-direct {p1, v0, p0}, Lcom/yuanqi/master/mine/MineActivity$d;-><init>(Lkotlin/jvm/internal/k1$h;Lcom/yuanqi/master/mine/MineActivity;)V

    .line 113
    .line 114
    .line 115
    const v0, 0x672aeaa3

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1, p1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const/4 v0, 0x0

    .line 123
    invoke-static {p0, v0, p1, v1, v0}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lv3/p;ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 127
    .line 128
    .line 129
    return-void
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

.method protected onRestart()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/mine/MineActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/mine/MineActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    const-class v0, Lcom/yuanqi/master/mine/MineActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
