.class final Lcom/yuanqi/group/home/HomeActivity$m;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity;->M0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Boolean;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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
.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$m;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/yuanqi/group/home/HomeActivity$m;->invoke$lambda$0(Lcom/yuanqi/group/home/HomeActivity;)V

    return-void
.end method

.method private static final invoke$lambda$0(Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "homeBinding"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v0, v1

    .line 19
    :cond_0
    iget-object v0, v0, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->homeLauncher:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-gtz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, Lcom/yuanqi/group/home/HomeActivity;->b0(Lcom/yuanqi/group/home/HomeActivity;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v0, "No child views available."

    .line 32
    .line 33
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-static {p0}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object v1, v0

    .line 48
    :goto_0
    iget-object v0, v1, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->homeLauncher:Landroidx/recyclerview/widget/RecyclerView;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    invoke-static {p0}, Lx2/a;->b(Landroid/app/Activity;)Lcom/yuanqi/master/tools/guide/core/a;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const-string v3, "guide_long_press"

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Lcom/yuanqi/master/tools/guide/core/a;->f(Ljava/lang/String;)Lcom/yuanqi/master/tools/guide/core/a;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v3, Lcom/yuanqi/group/home/HomeActivity$m$a;

    .line 84
    .line 85
    invoke-direct {v3, p0}, Lcom/yuanqi/group/home/HomeActivity$m$a;-><init>(Lcom/yuanqi/group/home/HomeActivity;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, Lcom/yuanqi/master/tools/guide/core/a;->g(Ly2/b;)Lcom/yuanqi/master/tools/guide/core/a;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {}, Lcom/yuanqi/master/tools/guide/model/a;->D()Lcom/yuanqi/master/tools/guide/model/a;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget-object v3, Lcom/yuanqi/master/tools/guide/model/b$a;->RECTANGLE:Lcom/yuanqi/master/tools/guide/model/b$a;

    .line 97
    .line 98
    invoke-virtual {v2, v0, v3}, Lcom/yuanqi/master/tools/guide/model/a;->h(Landroid/view/View;Lcom/yuanqi/master/tools/guide/model/b$a;)Lcom/yuanqi/master/tools/guide/model/a;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const v2, 0x7f0c00e4

    .line 103
    .line 104
    .line 105
    new-array v1, v1, [I

    .line 106
    .line 107
    invoke-virtual {v0, v2, v1}, Lcom/yuanqi/master/tools/guide/model/a;->I(I[I)Lcom/yuanqi/master/tools/guide/model/a;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p0, v0}, Lcom/yuanqi/master/tools/guide/core/a;->a(Lcom/yuanqi/master/tools/guide/model/a;)Lcom/yuanqi/master/tools/guide/core/a;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Lcom/yuanqi/master/tools/guide/core/a;->j()Lcom/yuanqi/master/tools/guide/core/b;

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-static {p0}, Lcom/yuanqi/group/home/HomeActivity;->b0(Lcom/yuanqi/group/home/HomeActivity;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    const-string v0, "The view is not showing in the window or is not visible."

    .line 124
    .line 125
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    :goto_1
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
    .line 378
    .line 379
    .line 380
    .line 381
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/HomeActivity$m;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 2

    .line 2
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$m;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->a0(Lcom/yuanqi/group/home/HomeActivity;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$m;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->W(Lcom/yuanqi/group/home/HomeActivity;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$m;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {p1}, Lcom/yuanqi/group/home/HomeActivity;->V(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "homeBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;->homeLauncher:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$m;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    new-instance v1, Lcom/yuanqi/group/home/q;

    invoke-direct {v1, v0}, Lcom/yuanqi/group/home/q;-><init>(Lcom/yuanqi/group/home/HomeActivity;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
