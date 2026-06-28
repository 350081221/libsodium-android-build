.class final Lcom/yuanqi/group/home/HomeViewModel$n;
.super Lkotlin/coroutines/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeViewModel;->g0()V
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
    c = "com.yuanqi.group.home.HomeViewModel$showGoUpdateDialog$1"
    f = "HomeViewModel.kt"
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
.field label:I

.field final synthetic this$0:Lcom/yuanqi/group/home/HomeViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeViewModel;Lkotlin/coroutines/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/group/home/HomeViewModel;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lcom/yuanqi/group/home/HomeViewModel$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/o;-><init>(ILkotlin/coroutines/d;)V

    return-void
.end method

.method public static synthetic h(Lcom/yuanqi/group/home/HomeViewModel;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/group/home/HomeViewModel$n;->invokeSuspend$lambda$1$lambda$0(Lcom/yuanqi/group/home/HomeViewModel;Landroid/view/View;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1$lambda$0(Lcom/yuanqi/group/home/HomeViewModel;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/yuanqi/group/home/HomeViewModel;->k(Lcom/yuanqi/group/home/HomeViewModel;)Lcom/yuanqi/master/tools/dialog/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object p1, Lcom/yuanqi/master/tools/v0;->a:Lcom/yuanqi/master/tools/v0;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p1, p0}, Lcom/yuanqi/master/tools/v0;->g(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;
    .locals 1
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

    new-instance p1, Lcom/yuanqi/group/home/HomeViewModel$n;

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    invoke-direct {p1, v0, p2}, Lcom/yuanqi/group/home/HomeViewModel$n;-><init>(Lcom/yuanqi/group/home/HomeViewModel;Lkotlin/coroutines/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s0;

    check-cast p2, Lkotlin/coroutines/d;

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/home/HomeViewModel$n;->invoke(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/group/home/HomeViewModel$n;->create(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/group/home/HomeViewModel$n;

    sget-object p2, Lkotlin/r2;->a:Lkotlin/r2;

    invoke-virtual {p1, p2}, Lcom/yuanqi/group/home/HomeViewModel$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_4

    .line 22
    .line 23
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/yuanqi/group/home/HomeViewModel;->k(Lcom/yuanqi/group/home/HomeViewModel;)Lcom/yuanqi/master/tools/dialog/b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "inflate(...)"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 65
    .line 66
    new-instance v1, Lcom/yuanqi/master/tools/dialog/b$a;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-direct {v1, v2}, Lcom/yuanqi/master/tools/dialog/b$a;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/yuanqi/master/tools/dialog/b$a;->a()Lcom/yuanqi/master/tools/dialog/b$a;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {p1}, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v1, v2}, Lcom/yuanqi/master/tools/dialog/b$a;->k(Landroid/view/View;)Lcom/yuanqi/master/tools/dialog/b$a;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-virtual {v1, v2}, Lcom/yuanqi/master/tools/dialog/b$a;->i(Z)Lcom/yuanqi/master/tools/dialog/b$a;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    sget-object v2, Lcom/yuanqi/master/tools/c1;->a:Lcom/yuanqi/master/tools/c1$a;

    .line 93
    .line 94
    iget-object v3, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 95
    .line 96
    invoke-virtual {v3}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const/high16 v4, 0x43960000    # 300.0f

    .line 101
    .line 102
    invoke-virtual {v2, v3, v4}, Lcom/yuanqi/master/tools/c1$a;->c(Landroid/content/Context;F)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const/4 v3, -0x2

    .line 107
    invoke-virtual {v1, v2, v3}, Lcom/yuanqi/master/tools/dialog/b$a;->t(II)Lcom/yuanqi/master/tools/dialog/b$a;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1}, Lcom/yuanqi/master/tools/dialog/b$a;->b()Lcom/yuanqi/master/tools/dialog/b;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {v0, v1}, Lcom/yuanqi/group/home/HomeViewModel;->n(Lcom/yuanqi/group/home/HomeViewModel;Lcom/yuanqi/master/tools/dialog/b;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 119
    .line 120
    iget-object v1, p1, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->ivWarn:Landroid/widget/ImageView;

    .line 121
    .line 122
    const/16 v2, 0x8

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    iget-object v1, p1, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->tvTitle:Landroid/widget/TextView;

    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    const v3, 0x7f120270

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, p1, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->tvContent:Landroid/widget/TextView;

    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const v3, 0x7f1200e9

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, p1, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->tvContent:Landroid/widget/TextView;

    .line 168
    .line 169
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 174
    .line 175
    .line 176
    iget-object v1, p1, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->btnRefuse:Lcom/google/android/material/button/MaterialButton;

    .line 177
    .line 178
    const/4 v2, 0x4

    .line 179
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 180
    .line 181
    .line 182
    iget-object v1, p1, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->btnConfirm:Lcom/google/android/material/button/MaterialButton;

    .line 183
    .line 184
    const-string v3, "\u53bb\u66f4\u65b0"

    .line 185
    .line 186
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    .line 188
    .line 189
    iget-object v1, p1, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->ivClose:Landroid/widget/ImageView;

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 192
    .line 193
    .line 194
    iget-object p1, p1, Lcom/yqtech/multiapp/databinding/DialogBaseTipBinding;->btnConfirm:Lcom/google/android/material/button/MaterialButton;

    .line 195
    .line 196
    new-instance v1, Lcom/yuanqi/group/home/n0;

    .line 197
    .line 198
    invoke-direct {v1, v0}, Lcom/yuanqi/group/home/n0;-><init>(Lcom/yuanqi/group/home/HomeViewModel;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    :cond_1
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 205
    .line 206
    invoke-static {p1}, Lcom/yuanqi/group/home/HomeViewModel;->k(Lcom/yuanqi/group/home/HomeViewModel;)Lcom/yuanqi/master/tools/dialog/b;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    if-eqz p1, :cond_2

    .line 211
    .line 212
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    goto :goto_0

    .line 221
    :cond_2
    const/4 p1, 0x0

    .line 222
    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-nez p1, :cond_3

    .line 230
    .line 231
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel$n;->this$0:Lcom/yuanqi/group/home/HomeViewModel;

    .line 232
    .line 233
    invoke-static {p1}, Lcom/yuanqi/group/home/HomeViewModel;->k(Lcom/yuanqi/group/home/HomeViewModel;)Lcom/yuanqi/master/tools/dialog/b;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    if-eqz p1, :cond_3

    .line 238
    .line 239
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 240
    .line 241
    .line 242
    :cond_3
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 243
    .line 244
    return-object p1

    .line 245
    :cond_4
    :goto_1
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 246
    .line 247
    return-object p1

    .line 248
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 249
    .line 250
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 251
    .line 252
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p1
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
