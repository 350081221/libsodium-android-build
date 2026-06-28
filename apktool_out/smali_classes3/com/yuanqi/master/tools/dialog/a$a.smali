.class public Lcom/yuanqi/master/tools/dialog/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/master/tools/dialog/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:I

.field public c:Z

.field public d:Landroid/content/DialogInterface$OnCancelListener;

.field public e:Landroid/content/DialogInterface$OnDismissListener;

.field public f:Landroid/content/DialogInterface$OnKeyListener;

.field public g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field public i:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View$OnClickListener;",
            ">;"
        }
    .end annotation
.end field

.field public j:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View$OnLongClickListener;",
            ">;"
        }
    .end annotation
.end field

.field public k:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public l:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public m:I

.field public n:Landroid/view/View;

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->g:Landroid/util/SparseArray;

    .line 10
    .line 11
    new-instance v0, Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->h:Landroid/util/SparseArray;

    .line 17
    .line 18
    new-instance v0, Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->i:Landroid/util/SparseArray;

    .line 24
    .line 25
    new-instance v0, Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->j:Landroid/util/SparseArray;

    .line 31
    .line 32
    new-instance v0, Landroid/util/SparseArray;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->k:Landroid/util/SparseArray;

    .line 38
    .line 39
    new-instance v0, Landroid/util/SparseArray;

    .line 40
    .line 41
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->l:Landroid/util/SparseArray;

    .line 45
    .line 46
    const/16 v0, 0x11

    .line 47
    .line 48
    iput v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->t:I

    .line 49
    .line 50
    iput-object p1, p0, Lcom/yuanqi/master/tools/dialog/a$a;->a:Landroid/content/Context;

    .line 51
    .line 52
    iput p2, p0, Lcom/yuanqi/master/tools/dialog/a$a;->b:I

    .line 53
    .line 54
    return-void
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
.end method


# virtual methods
.method public a(Lcom/yuanqi/master/tools/dialog/a;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->m:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/yuanqi/master/tools/dialog/c;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/yuanqi/master/tools/dialog/a$a;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v1, v2, v0}, Lcom/yuanqi/master/tools/dialog/c;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->n:Landroid/view/View;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    new-instance v1, Lcom/yuanqi/master/tools/dialog/c;

    .line 19
    .line 20
    invoke-direct {v1}, Lcom/yuanqi/master/tools/dialog/c;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->n:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/yuanqi/master/tools/dialog/c;->c(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    if-eqz v1, :cond_6

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/yuanqi/master/tools/dialog/a;->a()Lcom/yuanqi/master/tools/dialog/b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v1}, Lcom/yuanqi/master/tools/dialog/c;->a()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Lcom/yuanqi/master/tools/dialog/a;->d(Lcom/yuanqi/master/tools/dialog/c;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    move v1, v0

    .line 46
    :goto_1
    iget-object v2, p0, Lcom/yuanqi/master/tools/dialog/a$a;->h:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-ge v1, v2, :cond_2

    .line 53
    .line 54
    iget-object v2, p0, Lcom/yuanqi/master/tools/dialog/a$a;->h:Landroid/util/SparseArray;

    .line 55
    .line 56
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iget-object v3, p0, Lcom/yuanqi/master/tools/dialog/a$a;->h:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/CharSequence;

    .line 67
    .line 68
    invoke-virtual {p1, v2, v3}, Lcom/yuanqi/master/tools/dialog/a;->g(ILjava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move v1, v0

    .line 75
    :goto_2
    iget-object v2, p0, Lcom/yuanqi/master/tools/dialog/a$a;->k:Landroid/util/SparseArray;

    .line 76
    .line 77
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ge v1, v2, :cond_3

    .line 82
    .line 83
    iget-object v2, p0, Lcom/yuanqi/master/tools/dialog/a$a;->k:Landroid/util/SparseArray;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    iget-object v3, p0, Lcom/yuanqi/master/tools/dialog/a$a;->k:Landroid/util/SparseArray;

    .line 90
    .line 91
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-virtual {p1, v2, v3}, Lcom/yuanqi/master/tools/dialog/a;->e(II)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    :goto_3
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/a$a;->i:Landroid/util/SparseArray;

    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-ge v0, v1, :cond_4

    .line 114
    .line 115
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/a$a;->i:Landroid/util/SparseArray;

    .line 116
    .line 117
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iget-object v2, p0, Lcom/yuanqi/master/tools/dialog/a$a;->i:Landroid/util/SparseArray;

    .line 122
    .line 123
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Landroid/view/View$OnClickListener;

    .line 128
    .line 129
    invoke-virtual {p1, v1, v2}, Lcom/yuanqi/master/tools/dialog/a;->f(ILandroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    add-int/lit8 v0, v0, 0x1

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    invoke-virtual {p1}, Lcom/yuanqi/master/tools/dialog/a;->c()Landroid/view/Window;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iget v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->t:I

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    .line 142
    .line 143
    .line 144
    iget v0, p0, Lcom/yuanqi/master/tools/dialog/a$a;->s:I

    .line 145
    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    invoke-virtual {p1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget v1, p0, Lcom/yuanqi/master/tools/dialog/a$a;->o:I

    .line 156
    .line 157
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 158
    .line 159
    iget v1, p0, Lcom/yuanqi/master/tools/dialog/a$a;->p:I

    .line 160
    .line 161
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 162
    .line 163
    iget v1, p0, Lcom/yuanqi/master/tools/dialog/a$a;->q:I

    .line 164
    .line 165
    int-to-float v1, v1

    .line 166
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->verticalMargin:F

    .line 167
    .line 168
    iget v1, p0, Lcom/yuanqi/master/tools/dialog/a$a;->r:I

    .line 169
    .line 170
    int-to-float v1, v1

    .line 171
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->horizontalMargin:F

    .line 172
    .line 173
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 178
    .line 179
    const-string v0, "please set layout"

    .line 180
    .line 181
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p1
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
