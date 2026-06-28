.class public Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/Button;

.field private h:Landroid/widget/RadioGroup;

.field private i:Lcom/bytedance/tools/ui/view/d;

.field private j:Lcom/bytedance/tools/ui/view/a;

.field private k:Lcom/bytedance/tools/c/d;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/tools/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private m:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private C()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "rit_info"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lcom/bytedance/tools/c/d;->b(Ljava/lang/String;)Lcom/bytedance/tools/c/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p0, v0}, Lcom/bytedance/tools/c/d;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/tools/c/d;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 28
    .line 29
    const-string v1, "test_tool_slot_info_detail"

    .line 30
    .line 31
    iget-object v0, v0, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {p0, v1, v0, v2, v2}, Lcom/bytedance/tools/d/j;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method private D(I)V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/RadioGroup;->clearCheck()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->i:Lcom/bytedance/tools/ui/view/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/view/d;->h()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->j:Lcom/bytedance/tools/ui/view/a;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/view/a;->e()V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    move v1, v0

    .line 21
    :goto_0
    iget-object v2, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v1, v2, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lcom/bytedance/tools/ui/view/c;

    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ne v3, p1, :cond_1

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v3, v0

    .line 46
    :goto_1
    invoke-virtual {v2, v3}, Lcom/bytedance/tools/ui/view/c;->setChecked(Z)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-void
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

.method static synthetic E(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->M()V

    return-void
.end method

.method static synthetic F(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->D(I)V

    return-void
.end method

.method static synthetic G(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;I)I
    .locals 0

    iput p1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->m:I

    return p1
.end method

.method static synthetic H(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;)Landroid/widget/Button;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->f:Landroid/widget/Button;

    return-object p0
.end method

.method private I()V
    .locals 2

    .line 1
    sget v0, Lcom/bytedance/tools/R$id;->f4:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    const-string/jumbo v1, "\u4ee3\u7801\u4f4d\u68c0\u6d4b\u8be6\u60c5\u9875"

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Lcom/bytedance/tools/d/i;->a(Landroidx/appcompat/app/AppCompatActivity;Landroidx/appcompat/widget/Toolbar;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget v0, Lcom/bytedance/tools/R$id;->a3:I

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/widget/TextView;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->a:Landroid/widget/TextView;

    .line 24
    .line 25
    sget v0, Lcom/bytedance/tools/R$id;->O2:I

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/widget/TextView;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->b:Landroid/widget/TextView;

    .line 34
    .line 35
    sget v0, Lcom/bytedance/tools/R$id;->P2:I

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/TextView;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->c:Landroid/widget/TextView;

    .line 44
    .line 45
    sget v0, Lcom/bytedance/tools/R$id;->M2:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/widget/TextView;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->d:Landroid/widget/TextView;

    .line 54
    .line 55
    sget v0, Lcom/bytedance/tools/R$id;->I2:I

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Landroid/widget/TextView;

    .line 62
    .line 63
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->e:Landroid/widget/TextView;

    .line 64
    .line 65
    sget v0, Lcom/bytedance/tools/R$id;->S2:I

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroid/widget/Button;

    .line 72
    .line 73
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->f:Landroid/widget/Button;

    .line 74
    .line 75
    sget v0, Lcom/bytedance/tools/R$id;->V2:I

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Landroid/widget/Button;

    .line 82
    .line 83
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->g:Landroid/widget/Button;

    .line 84
    .line 85
    sget v0, Lcom/bytedance/tools/R$id;->T2:I

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Landroid/widget/RadioGroup;

    .line 92
    .line 93
    iput-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 94
    .line 95
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->f:Landroid/widget/Button;

    .line 96
    .line 97
    new-instance v1, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$a;

    .line 98
    .line 99
    invoke-direct {v1, p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$a;-><init>(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->g:Landroid/widget/Button;

    .line 106
    .line 107
    new-instance v1, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$b;

    .line 108
    .line 109
    invoke-direct {v1, p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$b;-><init>(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 116
    .line 117
    new-instance v1, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$c;

    .line 118
    .line 119
    invoke-direct {v1, p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity$c;-><init>(Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->J()V

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

.method private J()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->L()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/tools/c/b;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 7
    .line 8
    iget-object v2, v1, Lcom/bytedance/tools/c/d;->h:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/bytedance/tools/c/d;->i:Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, v2, v1}, Lcom/bytedance/tools/c/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/bytedance/tools/ui/view/d;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->l:Ljava/util/List;

    .line 20
    .line 21
    invoke-direct {v1, p0, v2, v0, v3}, Lcom/bytedance/tools/ui/view/d;-><init>(Landroid/content/Context;Landroid/widget/RadioGroup;Lcom/bytedance/tools/c/b;Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->i:Lcom/bytedance/tools/ui/view/d;

    .line 25
    .line 26
    new-instance v1, Lcom/bytedance/tools/ui/view/a;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 29
    .line 30
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->l:Ljava/util/List;

    .line 31
    .line 32
    invoke-direct {v1, p0, v2, v0, v3}, Lcom/bytedance/tools/ui/view/a;-><init>(Landroid/content/Context;Landroid/widget/RadioGroup;Lcom/bytedance/tools/c/b;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->j:Lcom/bytedance/tools/ui/view/a;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->i:Lcom/bytedance/tools/ui/view/d;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->j:Lcom/bytedance/tools/ui/view/a;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->i:Lcom/bytedance/tools/ui/view/d;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/view/d;->m()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->i:Lcom/bytedance/tools/ui/view/d;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->check(I)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->h:Landroid/widget/RadioGroup;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->j:Lcom/bytedance/tools/ui/view/a;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->check(I)V

    .line 80
    .line 81
    .line 82
    :goto_0
    return-void
    .line 83
.end method

.method private K()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->a:Landroid/widget/TextView;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 9
    .line 10
    iget-object v2, v2, Lcom/bytedance/tools/c/d;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->b:Landroid/widget/TextView;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->c:Landroid/widget/TextView;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 44
    .line 45
    iget-object v3, v3, Lcom/bytedance/tools/c/d;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v3, ":"

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v4, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 56
    .line 57
    iget-object v4, v4, Lcom/bytedance/tools/c/d;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->d:Landroid/widget/TextView;

    .line 70
    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    iget-object v4, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 77
    .line 78
    iget-object v4, v4, Lcom/bytedance/tools/c/d;->e:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 87
    .line 88
    iget-object v3, v3, Lcom/bytedance/tools/c/d;->f:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->e:Landroid/widget/TextView;

    .line 101
    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 108
    .line 109
    iget v3, v3, Lcom/bytedance/tools/c/d;->g:I

    .line 110
    .line 111
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    return-void
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

.method private L()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/InputStreamReader;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const-string v3, "previewIds_new.json"

    .line 9
    .line 10
    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    .line 17
    :try_start_1
    new-instance v2, Ljava/io/BufferedReader;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v4, Lorg/json/JSONArray;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {v4, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 44
    .line 45
    .line 46
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 55
    .line 56
    .line 57
    :goto_1
    move-object v0, v4

    .line 58
    goto :goto_5

    .line 59
    :catch_1
    move-exception v3

    .line 60
    goto :goto_2

    .line 61
    :catchall_0
    move-exception v2

    .line 62
    move-object v5, v2

    .line 63
    move-object v2, v0

    .line 64
    move-object v0, v5

    .line 65
    goto :goto_7

    .line 66
    :catch_2
    move-exception v3

    .line 67
    move-object v2, v0

    .line 68
    goto :goto_2

    .line 69
    :catchall_1
    move-exception v1

    .line 70
    move-object v2, v0

    .line 71
    move-object v0, v1

    .line 72
    move-object v1, v2

    .line 73
    goto :goto_7

    .line 74
    :catch_3
    move-exception v3

    .line 75
    move-object v1, v0

    .line 76
    move-object v2, v1

    .line 77
    :goto_2
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 78
    .line 79
    .line 80
    if-eqz v2, :cond_1

    .line 81
    .line 82
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catch_4
    move-exception v1

    .line 87
    goto :goto_4

    .line 88
    :cond_1
    :goto_3
    if-eqz v1, :cond_2

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 91
    .line 92
    .line 93
    goto :goto_5

    .line 94
    :goto_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 95
    .line 96
    .line 97
    :cond_2
    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v1, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->l:Ljava/util/List;

    .line 103
    .line 104
    if-nez v0, :cond_3

    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    const/4 v1, 0x0

    .line 108
    :goto_6
    :try_start_6
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-ge v1, v2, :cond_4

    .line 113
    .line 114
    new-instance v2, Lcom/bytedance/tools/c/b;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-direct {v2, v3}, Lcom/bytedance/tools/c/b;-><init>(Lorg/json/JSONObject;)V

    .line 121
    .line 122
    .line 123
    iget-object v3, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->l:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_5

    .line 126
    .line 127
    .line 128
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :catch_5
    move-exception v0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 133
    .line 134
    .line 135
    :cond_4
    return-void

    .line 136
    :catchall_2
    move-exception v0

    .line 137
    :goto_7
    if-eqz v2, :cond_5

    .line 138
    .line 139
    :try_start_7
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 140
    .line 141
    .line 142
    goto :goto_8

    .line 143
    :catch_6
    move-exception v1

    .line 144
    goto :goto_9

    .line 145
    :cond_5
    :goto_8
    if-eqz v1, :cond_6

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 148
    .line 149
    .line 150
    goto :goto_a

    .line 151
    :goto_9
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 152
    .line 153
    .line 154
    :cond_6
    :goto_a
    throw v0
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

.method private M()V
    .locals 12

    .line 1
    iget v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->m:I

    .line 2
    .line 3
    const-string v1, "test_preview"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-string v3, "rit=?"

    .line 7
    .line 8
    const-string v4, "setting_rit"

    .line 9
    .line 10
    const-string v5, "config"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/content/ContentValues;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v7, ""

    .line 21
    .line 22
    invoke-virtual {v0, v5, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-array v2, v2, [Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 28
    .line 29
    iget-object v5, v5, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 30
    .line 31
    aput-object v5, v2, v6

    .line 32
    .line 33
    invoke-static {p0, v4, v0, v3, v2}, Lcom/bytedance/tools/d/d;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    const-string/jumbo v0, "\u6e05\u9664\u6210\u529f"

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p0, v1, v0, v7, v7}, Lcom/bytedance/tools/d/j;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lcom/bytedance/tools/ui/view/c;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/view/c;->getConfigModel()Lcom/bytedance/tools/c/b;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    new-instance v8, Lorg/json/JSONObject;

    .line 65
    .line 66
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 67
    .line 68
    .line 69
    :try_start_0
    invoke-virtual {v7}, Lcom/bytedance/tools/c/b;->a()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v7}, Lcom/bytedance/tools/c/b;->d()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    const-string v10, "1"

    .line 78
    .line 79
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    const-string v11, "ext"

    .line 84
    .line 85
    if-eqz v10, :cond_1

    .line 86
    .line 87
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string/jumbo v7, "{\"headers\":{\"x-tt-env\":\"ppe_live_online\",\"x-use-ppe\":\"1\",\"image-mode\":\""

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/view/c;->getImageMode()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v0, "\"}}"

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v8, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/view/c;->d()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_2

    .line 123
    .line 124
    const-string/jumbo v0, "\u53c2\u6570\u4e0d\u5408\u6cd5\uff0c\u8bf7\u91cd\u65b0\u8bbe\u7f6e"

    .line 125
    .line 126
    .line 127
    invoke-static {p0, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_2
    const-string v0, "aid"

    .line 136
    .line 137
    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    const-string v0, "cid"

    .line 141
    .line 142
    invoke-virtual {v8, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 146
    .line 147
    iget-object v0, v0, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {p0, v1, v0, v9, v7}, Lcom/bytedance/tools/d/j;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v0, "1696550504417319"

    .line 153
    .line 154
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_3

    .line 159
    .line 160
    const-string v0, "1696824047861763"

    .line 161
    .line 162
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_3

    .line 167
    .line 168
    const-string/jumbo v0, "{\"style_ids\":{\"playable_id\":1}}"

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :catch_0
    move-exception v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 177
    .line 178
    .line 179
    :cond_3
    :goto_0
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, Lcom/bytedance/tools/d/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v1, Landroid/content/ContentValues;

    .line 188
    .line 189
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    new-array v0, v2, [Ljava/lang/String;

    .line 196
    .line 197
    iget-object v2, p0, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->k:Lcom/bytedance/tools/c/d;

    .line 198
    .line 199
    iget-object v2, v2, Lcom/bytedance/tools/c/d;->a:Ljava/lang/String;

    .line 200
    .line 201
    aput-object v2, v0, v6

    .line 202
    .line 203
    invoke-static {p0, v4, v1, v3, v0}, Lcom/bytedance/tools/d/d;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    const-string/jumbo v0, "\u4fdd\u5b58\u6210\u529f"

    .line 207
    .line 208
    .line 209
    invoke-static {p0, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 214
    .line 215
    .line 216
    return-void
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


# virtual methods
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
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    sget p1, Lcom/bytedance/tools/R$layout;->D:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->C()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->I()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/bytedance/tools/ui/ui/ToolRitDetailActivity;->K()V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

    .line 30
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

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

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

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
