.class public Lcom/yuanqi/master/tools/guide/core/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final o:Ljava/lang/String; = "listener_fragment"


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Landroidx/fragment/app/Fragment;

.field private c:Ly2/b;

.field private d:Ly2/e;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:I

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuanqi/master/tools/guide/model/a;",
            ">;"
        }
    .end annotation
.end field

.field private i:I

.field private j:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

.field private k:Landroid/widget/FrameLayout;

.field private l:Landroid/content/SharedPreferences;

.field private m:I

.field private n:Z


# direct methods
.method public constructor <init>(Lcom/yuanqi/master/tools/guide/core/a;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->m:I

    .line 6
    .line 7
    iget-object v1, p1, Lcom/yuanqi/master/tools/guide/core/a;->a:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->a:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object v2, p1, Lcom/yuanqi/master/tools/guide/core/a;->b:Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    iput-object v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->b:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    iget-object v2, p1, Lcom/yuanqi/master/tools/guide/core/a;->g:Ly2/b;

    .line 16
    .line 17
    iput-object v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->c:Ly2/b;

    .line 18
    .line 19
    iget-object v2, p1, Lcom/yuanqi/master/tools/guide/core/a;->h:Ly2/e;

    .line 20
    .line 21
    iput-object v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->d:Ly2/e;

    .line 22
    .line 23
    iget-object v2, p1, Lcom/yuanqi/master/tools/guide/core/a;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-object v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->e:Ljava/lang/String;

    .line 26
    .line 27
    iget-boolean v2, p1, Lcom/yuanqi/master/tools/guide/core/a;->d:Z

    .line 28
    .line 29
    iput-boolean v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->f:Z

    .line 30
    .line 31
    iget-object v2, p1, Lcom/yuanqi/master/tools/guide/core/a;->i:Ljava/util/List;

    .line 32
    .line 33
    iput-object v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->h:Ljava/util/List;

    .line 34
    .line 35
    iget v2, p1, Lcom/yuanqi/master/tools/guide/core/a;->f:I

    .line 36
    .line 37
    iput v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->g:I

    .line 38
    .line 39
    iget-object p1, p1, Lcom/yuanqi/master/tools/guide/core/a;->e:Landroid/view/View;

    .line 40
    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    const p1, 0x1020002

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_0
    instance-of v1, p1, Landroid/widget/FrameLayout;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    check-cast p1, Landroid/widget/FrameLayout;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/b;->k:Landroid/widget/FrameLayout;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance v1, Landroid/widget/FrameLayout;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->a:Landroid/app/Activity;

    .line 62
    .line 63
    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Landroid/view/ViewGroup;

    .line 71
    .line 72
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iput v3, p0, Lcom/yuanqi/master/tools/guide/core/b;->m:I

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    iget v3, p0, Lcom/yuanqi/master/tools/guide/core/b;->m:I

    .line 82
    .line 83
    if-ltz v3, :cond_2

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v2, v1, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 101
    .line 102
    invoke-direct {v2, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    iput-object v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->k:Landroid/widget/FrameLayout;

    .line 109
    .line 110
    :goto_1
    iget-object p1, p0, Lcom/yuanqi/master/tools/guide/core/b;->a:Landroid/app/Activity;

    .line 111
    .line 112
    const-string v0, "NewbieGuide"

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/core/b;->l:Landroid/content/SharedPreferences;

    .line 120
    .line 121
    return-void
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

.method static synthetic a(Lcom/yuanqi/master/tools/guide/core/b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/tools/guide/core/b;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Lcom/yuanqi/master/tools/guide/core/b;I)I
    .locals 0

    iput p1, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    return p1
.end method

.method static synthetic c(Lcom/yuanqi/master/tools/guide/core/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/tools/guide/core/b;->q()V

    return-void
.end method

.method static synthetic d(Lcom/yuanqi/master/tools/guide/core/b;)Ly2/b;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/tools/guide/core/b;->c:Ly2/b;

    return-object p0
.end method

.method static synthetic e(Lcom/yuanqi/master/tools/guide/core/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/tools/guide/core/b;->i()V

    return-void
.end method

.method static synthetic f(Lcom/yuanqi/master/tools/guide/core/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/tools/guide/core/b;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic g(Lcom/yuanqi/master/tools/guide/core/b;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/tools/guide/core/b;->l:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method static synthetic h(Lcom/yuanqi/master/tools/guide/core/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/tools/guide/core/b;->r()V

    return-void
.end method

.method private i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->b:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/yuanqi/master/tools/guide/core/b;->j(Landroidx/fragment/app/Fragment;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->b:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "listener_fragment"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    new-instance v2, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;

    .line 25
    .line 26
    invoke-direct {v2}, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 38
    .line 39
    .line 40
    :cond_0
    new-instance v0, Lcom/yuanqi/master/tools/guide/core/b$d;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Lcom/yuanqi/master/tools/guide/core/b$d;-><init>(Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0}, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;->b(Lcom/yuanqi/master/tools/guide/lifecycle/a;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
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

.method private j(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const-string v1, "mChildFragmentManager"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception p1

    .line 19
    new-instance v0, Ljava/lang/RuntimeException;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :catch_1
    move-exception p1

    .line 26
    new-instance v0, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v0
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
.end method

.method private m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->b:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "listener_fragment"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/yuanqi/master/tools/guide/lifecycle/ListenerFragment;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
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
.end method

.method private q()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->h:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/yuanqi/master/tools/guide/model/a;

    .line 10
    .line 11
    new-instance v1, Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->a:Landroid/app/Activity;

    .line 14
    .line 15
    invoke-direct {v1, v2, v0, p0}, Lcom/yuanqi/master/tools/guide/core/GuideLayout;-><init>(Landroid/content/Context;Lcom/yuanqi/master/tools/guide/model/a;Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/yuanqi/master/tools/guide/core/b$c;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/yuanqi/master/tools/guide/core/b$c;-><init>(Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/yuanqi/master/tools/guide/core/GuideLayout;->setOnGuideLayoutDismissListener(Lcom/yuanqi/master/tools/guide/core/GuideLayout$e;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->k:Landroid/widget/FrameLayout;

    .line 27
    .line 28
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 29
    .line 30
    const/4 v3, -0x1

    .line 31
    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->j:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->d:Ly2/e;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    .line 44
    .line 45
    invoke-interface {v0, v1}, Ly2/e;->a(I)V

    .line 46
    .line 47
    .line 48
    :cond_0
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->n:Z

    .line 50
    .line 51
    return-void
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

.method private r()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->h:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    iput v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/yuanqi/master/tools/guide/core/b;->q()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->c:Ly2/b;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {v0, p0}, Ly2/b;->b(Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-direct {p0}, Lcom/yuanqi/master/tools/guide/core/b;->m()V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->n:Z

    .line 35
    .line 36
    :goto_0
    return-void
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
.end method


# virtual methods
.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->n:Z

    return v0
.end method

.method public l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->j:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->j:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/yuanqi/master/tools/guide/core/b;->j:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    instance-of v2, v0, Landroid/widget/FrameLayout;

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Landroid/view/ViewGroup;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 40
    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iget v4, p0, Lcom/yuanqi/master/tools/guide/core/b;->m:I

    .line 45
    .line 46
    if-lez v4, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v2, v3, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v2, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->c:Ly2/b;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-interface {v0, p0}, Ly2/b;->b(Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    const/4 v0, 0x0

    .line 71
    iput-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->j:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 72
    .line 73
    :cond_3
    iput-boolean v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->n:Z

    .line 74
    .line 75
    return-void
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

.method public n()V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/yuanqi/master/tools/guide/core/b;->o(Ljava/lang/String;)V

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->l:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public p()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->l:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->e:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-boolean v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->f:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->g:I

    .line 15
    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->n:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v1, 0x1

    .line 25
    iput-boolean v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->n:Z

    .line 26
    .line 27
    iget-object v1, p0, Lcom/yuanqi/master/tools/guide/core/b;->k:Landroid/widget/FrameLayout;

    .line 28
    .line 29
    new-instance v2, Lcom/yuanqi/master/tools/guide/core/b$a;

    .line 30
    .line 31
    invoke-direct {v2, p0, v0}, Lcom/yuanqi/master/tools/guide/core/b$a;-><init>(Lcom/yuanqi/master/tools/guide/core/b;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 35
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

.method public s(I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->h:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    if-gt p1, v0, :cond_2

    .line 12
    .line 13
    iget v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    .line 14
    .line 15
    if-ne v0, p1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    .line 19
    .line 20
    iget-object p1, p0, Lcom/yuanqi/master/tools/guide/core/b;->j:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    new-instance v0, Lcom/yuanqi/master/tools/guide/core/b$b;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/yuanqi/master/tools/guide/core/b$b;-><init>(Lcom/yuanqi/master/tools/guide/core/b;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lcom/yuanqi/master/tools/guide/core/GuideLayout;->setOnGuideLayoutDismissListener(Lcom/yuanqi/master/tools/guide/core/GuideLayout$e;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/yuanqi/master/tools/guide/core/b;->j:Lcom/yuanqi/master/tools/guide/core/GuideLayout;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/yuanqi/master/tools/guide/core/GuideLayout;->h()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-direct {p0}, Lcom/yuanqi/master/tools/guide/core/b;->q()V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    :cond_2
    new-instance v0, Ljava/security/InvalidParameterException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v2, "The Guide page position is out of range. current:"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, ", range: [ 0, "

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/yuanqi/master/tools/guide/core/b;->h:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p1, " )"

    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v0, p1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
    .line 84
    .line 85
.end method

.method public t()V
    .locals 1

    iget v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/yuanqi/master/tools/guide/core/b;->i:I

    invoke-virtual {p0, v0}, Lcom/yuanqi/master/tools/guide/core/b;->s(I)V

    return-void
.end method
