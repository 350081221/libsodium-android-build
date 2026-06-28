.class public Lcom/bytedance/mtesttools/act/AdRitDetailActivity;
.super Lcom/bytedance/mtesttools/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# instance fields
.field c:Landroid/widget/ListView;

.field d:Lcom/bytedance/mtesttools/d/b;

.field e:Landroid/widget/TextView;

.field f:Landroid/widget/TextView;

.field g:Lj1/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bytedance/mtesttools/a/a;-><init>()V

    return-void
.end method

.method private e()V
    .locals 4

    .line 1
    new-instance v0, Lcom/bytedance/mtesttools/d/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/mtesttools/d/b;-><init>(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->d:Lcom/bytedance/mtesttools/d/b;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->c:Landroid/widget/ListView;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget v1, Lcom/bytedance/tools/R$layout;->U0:I

    .line 18
    .line 19
    iget-object v2, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->c:Landroid/widget/ListView;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget v1, Lcom/bytedance/tools/R$id;->b3:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/widget/TextView;

    .line 33
    .line 34
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->e:Landroid/widget/TextView;

    .line 35
    .line 36
    sget v1, Lcom/bytedance/tools/R$id;->D:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroid/widget/TextView;

    .line 43
    .line 44
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->f:Landroid/widget/TextView;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->c:Landroid/widget/ListView;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->e:Landroid/widget/TextView;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->g:Lj1/e;

    .line 54
    .line 55
    invoke-virtual {v1}, Lj1/e;->b()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->f:Landroid/widget/TextView;

    .line 63
    .line 64
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->g:Lj1/e;

    .line 65
    .line 66
    invoke-virtual {v1}, Lj1/e;->c()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v1}, Lcom/bytedance/mtesttools/a/b;->a(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->d:Lcom/bytedance/mtesttools/d/b;

    .line 78
    .line 79
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->g:Lj1/e;

    .line 80
    .line 81
    invoke-virtual {v1}, Lj1/e;->d()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Lcom/bytedance/mtesttools/d/b;->d(Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    return-void
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
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->c:Landroid/widget/ListView;

    new-instance v1, Lcom/bytedance/mtesttools/act/AdRitDetailActivity$a;

    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/act/AdRitDetailActivity$a;-><init>(Lcom/bytedance/mtesttools/act/AdRitDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method


# virtual methods
.method protected c()I
    .locals 1

    sget v0, Lcom/bytedance/tools/R$layout;->w0:I

    return v0
.end method

.method public finish()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->d:Lcom/bytedance/mtesttools/d/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/content/Intent;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->g:Lj1/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lj1/e;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "rit_id"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->d:Lcom/bytedance/mtesttools/d/b;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/bytedance/mtesttools/d/b;->a()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const-string v2, "load_status"

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x16

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    if-ne p2, p1, :cond_0

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    const-string p1, "slot_id"

    .line 14
    .line 15
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "load_status"

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p3, p2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {p1, p2}, Lk1/h;->e(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    iget-object p3, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->d:Lcom/bytedance/mtesttools/d/b;

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    invoke-virtual {p3, p1, p2}, Lcom/bytedance/mtesttools/d/b;->c(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    :cond_0
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, p1}, Lcom/bytedance/mtesttools/a/a;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    sget p1, Lcom/bytedance/tools/R$id;->B3:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/widget/ListView;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->c:Landroid/widget/ListView;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "rit_config"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lj1/e;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->g:Lj1/e;

    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    const-string/jumbo p1, "\u6682\u65e0\u6570\u636e\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1}, Lk1/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->finish()V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    const-string/jumbo p1, "\u5e7f\u544a\u4f4d\u8be6\u60c5"

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-virtual {p0, p1, v0}, Lcom/bytedance/mtesttools/a/a;->d(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->e()V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/AdRitDetailActivity;->f()V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 68
    .line 69
    .line 70
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method protected onRestart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
