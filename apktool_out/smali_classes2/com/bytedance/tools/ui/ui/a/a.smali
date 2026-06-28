.class public Lcom/bytedance/tools/ui/ui/a/a;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/tools/ui/ui/a/a$c;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/Button;

.field private d:Landroid/widget/Button;

.field private e:Landroid/view/View;

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field public k:Lcom/bytedance/tools/ui/ui/a/a$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    sget v0, Lcom/bytedance/tools/R$style;->o6:I

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lcom/bytedance/tools/ui/ui/a/a;->g:I

    .line 8
    .line 9
    iput p2, p0, Lcom/bytedance/tools/ui/ui/a/a;->f:I

    .line 10
    .line 11
    return-void
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

.method private d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->d:Landroid/widget/Button;

    .line 2
    .line 3
    new-instance v1, Lcom/bytedance/tools/ui/ui/a/a$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/bytedance/tools/ui/ui/a/a$a;-><init>(Lcom/bytedance/tools/ui/ui/a/a;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->c:Landroid/widget/Button;

    .line 12
    .line 13
    new-instance v1, Lcom/bytedance/tools/ui/ui/a/a$b;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/bytedance/tools/ui/ui/a/a$b;-><init>(Lcom/bytedance/tools/ui/ui/a/a;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private e()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->b:Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->b:Landroid/widget/TextView;

    .line 17
    .line 18
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/a/a;->h:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->b:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->b:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->d:Landroid/widget/Button;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->i:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->d:Landroid/widget/Button;

    .line 47
    .line 48
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/a/a;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->d:Landroid/widget/Button;

    .line 55
    .line 56
    const-string/jumbo v3, "\u786e\u5b9a"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->c:Landroid/widget/Button;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->j:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->c:Landroid/widget/Button;

    .line 75
    .line 76
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/a/a;->j:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->c:Landroid/widget/Button;

    .line 83
    .line 84
    const-string/jumbo v3, "\u53d6\u6d88"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->a:Landroid/widget/ImageView;

    .line 91
    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    iget v3, p0, Lcom/bytedance/tools/ui/ui/a/a;->g:I

    .line 95
    .line 96
    const/4 v4, -0x1

    .line 97
    if-eq v3, v4, :cond_6

    .line 98
    .line 99
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->a:Landroid/widget/ImageView;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    :cond_7
    :goto_3
    return-void
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

.method private f()V
    .locals 2

    .line 1
    sget v0, Lcom/bytedance/tools/R$id;->S1:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/Button;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->c:Landroid/widget/Button;

    .line 10
    .line 11
    sget v0, Lcom/bytedance/tools/R$id;->g2:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/Button;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->d:Landroid/widget/Button;

    .line 20
    .line 21
    sget v0, Lcom/bytedance/tools/R$id;->Z3:I

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->b:Landroid/widget/TextView;

    .line 30
    .line 31
    sget v0, Lcom/bytedance/tools/R$id;->g1:I

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/widget/ImageView;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->a:Landroid/widget/ImageView;

    .line 40
    .line 41
    iget v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->f:I

    .line 42
    .line 43
    if-lez v0, :cond_0

    .line 44
    .line 45
    sget v0, Lcom/bytedance/tools/R$id;->E0:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/view/ViewStub;

    .line 52
    .line 53
    iget v1, p0, Lcom/bytedance/tools/ui/ui/a/a;->f:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/view/ViewStub;->setLayoutResource(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->e:Landroid/view/View;

    .line 63
    .line 64
    :cond_0
    return-void
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
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/a/a;->e:Landroid/view/View;

    return-object v0
.end method

.method public b(Lcom/bytedance/tools/ui/ui/a/a$c;)Lcom/bytedance/tools/ui/ui/a/a;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/ui/a/a;->k:Lcom/bytedance/tools/ui/ui/a/a$c;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/bytedance/tools/ui/ui/a/a;
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/ui/a/a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public onBackPressed()V
    .locals 0

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Lcom/bytedance/tools/R$layout;->G:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/a/a;->f()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/a/a;->e()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/a/a;->d()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public show()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/a/a;->e()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
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
.end method
