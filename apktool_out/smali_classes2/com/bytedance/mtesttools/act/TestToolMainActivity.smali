.class public Lcom/bytedance/mtesttools/act/TestToolMainActivity;
.super Lcom/bytedance/mtesttools/a/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# instance fields
.field c:Landroid/widget/ExpandableListView;

.field d:Lcom/bytedance/mtesttools/d/a;

.field e:Landroid/widget/TextView;

.field f:Landroid/widget/TextView;

.field g:Landroid/widget/TextView;

.field h:Landroid/widget/TextView;

.field i:Landroid/widget/RelativeLayout;

.field j:Landroid/widget/TextView;

.field k:Landroid/widget/TextView;

.field l:Landroid/widget/TextView;

.field m:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bytedance/mtesttools/a/a;-><init>()V

    return-void
.end method

.method private e()V
    .locals 0

    invoke-static {}, Lk1/a;->j()V

    return-void
.end method

.method private f()V
    .locals 0

    invoke-static {}, Lk1/a;->k()V

    return-void
.end method

.method private g()V
    .locals 4

    .line 1
    new-instance v0, Lcom/bytedance/mtesttools/d/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/mtesttools/d/a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->d:Lcom/bytedance/mtesttools/d/a;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setGroupIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setChildDivider(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 25
    .line 26
    new-instance v1, Lcom/bytedance/mtesttools/act/TestToolMainActivity$a;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity$a;-><init>(Lcom/bytedance/mtesttools/act/TestToolMainActivity;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 35
    .line 36
    new-instance v1, Lcom/bytedance/mtesttools/act/TestToolMainActivity$b;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity$b;-><init>(Lcom/bytedance/mtesttools/act/TestToolMainActivity;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->d:Lcom/bytedance/mtesttools/d/a;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget v1, Lcom/bytedance/tools/R$layout;->T0:I

    .line 56
    .line 57
    iget-object v2, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget v1, Lcom/bytedance/tools/R$id;->O1:I

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Landroid/widget/TextView;

    .line 71
    .line 72
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->e:Landroid/widget/TextView;

    .line 73
    .line 74
    sget v1, Lcom/bytedance/tools/R$id;->T3:I

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Landroid/widget/TextView;

    .line 81
    .line 82
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->f:Landroid/widget/TextView;

    .line 83
    .line 84
    sget v1, Lcom/bytedance/tools/R$id;->M0:I

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Landroid/widget/TextView;

    .line 91
    .line 92
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->g:Landroid/widget/TextView;

    .line 93
    .line 94
    sget v1, Lcom/bytedance/tools/R$id;->x0:I

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Landroid/widget/TextView;

    .line 101
    .line 102
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->h:Landroid/widget/TextView;

    .line 103
    .line 104
    sget v1, Lcom/bytedance/tools/R$id;->K:I

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 111
    .line 112
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->i:Landroid/widget/RelativeLayout;

    .line 113
    .line 114
    sget v1, Lcom/bytedance/tools/R$id;->O:I

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Landroid/widget/TextView;

    .line 121
    .line 122
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->j:Landroid/widget/TextView;

    .line 123
    .line 124
    sget v1, Lcom/bytedance/tools/R$id;->F:I

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Landroid/widget/TextView;

    .line 131
    .line 132
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->k:Landroid/widget/TextView;

    .line 133
    .line 134
    sget v1, Lcom/bytedance/tools/R$id;->j3:I

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Landroid/widget/TextView;

    .line 141
    .line 142
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->l:Landroid/widget/TextView;

    .line 143
    .line 144
    sget v1, Lcom/bytedance/tools/R$id;->K1:I

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Landroid/widget/TextView;

    .line 151
    .line 152
    iput-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->m:Landroid/widget/TextView;

    .line 153
    .line 154
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    return-void
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

.method private h()V
    .locals 1

    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private i()V
    .locals 4

    .line 1
    invoke-static {}, Lk1/a;->f()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->e:Landroid/widget/TextView;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "Android "

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lk1/a;->i()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {}, Lk1/a;->h()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    iget-object v2, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->f:Landroid/widget/TextView;

    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, " "

    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-static {p0}, Lk1/h;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    invoke-static {p0}, Lk1/a;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_1

    .line 91
    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v2, "OAID\uff1a\n"

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_0

    .line 110
    :cond_1
    const-string/jumbo v0, "\u6682\u65e0"

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v2, "IMEI\uff1a\n"

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :goto_0
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->g:Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lk1/a;->b()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const/4 v1, 0x0

    .line 141
    if-eqz v0, :cond_3

    .line 142
    .line 143
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->h:Landroid/widget/TextView;

    .line 144
    .line 145
    const-string/jumbo v2, "\u5df2\u5230\u8fbe"

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->h:Landroid/widget/TextView;

    .line 152
    .line 153
    const/4 v2, 0x1

    .line 154
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->h:Landroid/widget/TextView;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->h:Landroid/widget/TextView;

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->h:Landroid/widget/TextView;

    .line 169
    .line 170
    const-string/jumbo v1, "\u672a\u5230\u8fbe"

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    .line 176
    :goto_1
    return-void
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

.method private j()V
    .locals 5

    .line 1
    invoke-static {p0}, Lk1/h;->b(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->j:Landroid/widget/TextView;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lk1/f;->a()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, " \u5bb6\u5e7f\u544a\u7f51\u7edc"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lk1/h;->a:Ljava/util/Map;

    .line 31
    .line 32
    invoke-static {v0}, Lk1/f;->f(Ljava/util/Map;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sget-object v1, Lk1/h;->a:Ljava/util/Map;

    .line 37
    .line 38
    invoke-static {v1}, Lk1/f;->i(Ljava/util/Map;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sget-object v2, Lk1/h;->a:Ljava/util/Map;

    .line 43
    .line 44
    invoke-static {p0, v2}, Lk1/f;->d(Landroid/content/Context;Ljava/util/Map;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v4, 0x0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->k:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->k:Landroid/widget/TextView;

    .line 58
    .line 59
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setSelected(Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->k:Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 66
    .line 67
    .line 68
    :goto_0
    if-eqz v1, :cond_1

    .line 69
    .line 70
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->l:Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->l:Landroid/widget/TextView;

    .line 76
    .line 77
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setSelected(Z)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->l:Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 84
    .line 85
    .line 86
    :goto_1
    if-eqz v2, :cond_2

    .line 87
    .line 88
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->m:Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->m:Landroid/widget/TextView;

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setSelected(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->m:Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 102
    .line 103
    .line 104
    :goto_2
    invoke-static {}, Lk1/h;->i()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->d:Lcom/bytedance/mtesttools/d/a;

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Lcom/bytedance/mtesttools/d/a;->d(Ljava/util/List;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->d:Lcom/bytedance/mtesttools/d/a;

    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/bytedance/mtesttools/d/a;->getGroupCount()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_3

    .line 120
    .line 121
    return-void

    .line 122
    :cond_3
    :goto_3
    if-ge v4, v0, :cond_4

    .line 123
    .line 124
    iget-object v1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 125
    .line 126
    invoke-virtual {v1, v4}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 v4, v4, 0x1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    return-void
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

.method private k()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-class v2, Lcom/bytedance/mtesttools/act/AdnMainActivity;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method protected c()I
    .locals 1

    sget v0, Lcom/bytedance/tools/R$layout;->D0:I

    return v0
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
    const/16 v0, 0x21

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
    const-string p1, "rit_id"

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
    iget-object p3, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->d:Lcom/bytedance/mtesttools/d/a;

    .line 27
    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p3, p1, p2}, Lcom/bytedance/mtesttools/d/a;->c(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
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
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/bytedance/tools/R$id;->K:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->k()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->e()V

    .line 16
    .line 17
    .line 18
    sget p1, Lcom/bytedance/tools/R$id;->x:I

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Landroid/widget/ExpandableListView;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->c:Landroid/widget/ExpandableListView;

    .line 27
    .line 28
    const-string/jumbo p1, "\u7a7f\u5c71\u7532\u805a\u5408\u6d4b\u8bd5\u5de5\u5177"

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, p1, v0}, Lcom/bytedance/mtesttools/a/a;->d(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->g()V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->h()V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->i()V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->j()V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 48
    .line 49
    .line 50
    return-void
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
.end method

.method protected onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/bytedance/mtesttools/act/TestToolMainActivity;->f()V

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
