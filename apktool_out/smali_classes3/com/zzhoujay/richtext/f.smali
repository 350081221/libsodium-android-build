.class public Lcom/zzhoujay/richtext/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/c;
.implements Le3/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zzhoujay/richtext/f$b;
    }
.end annotation


# static fields
.field private static final i:Ljava/lang/String; = "RichText"

.field public static j:Z = true

.field private static final k:Ljava/lang/String; = "target"

.field private static l:Ljava/util/regex/Pattern;

.field private static m:Ljava/util/regex/Pattern;

.field private static n:Ljava/util/regex/Pattern;

.field private static o:Ljava/util/regex/Pattern;

.field private static final p:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/zzhoujay/richtext/c;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/zzhoujay/richtext/e;

.field private final c:Lg3/e;

.field private final d:Lg3/a;

.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/zzhoujay/richtext/g;

.field private g:I

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "<(img|IMG)(.*?)>"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/zzhoujay/richtext/f;->l:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "(width|WIDTH)=\"(.*?)\""

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/zzhoujay/richtext/f;->m:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "(height|HEIGHT)=\"(.*?)\""

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/zzhoujay/richtext/f;->n:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "(src|SRC)=\"(.*?)\""

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/zzhoujay/richtext/f;->o:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    new-instance v0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lcom/zzhoujay/richtext/f;->p:Ljava/util/HashMap;

    .line 39
    .line 40
    return-void
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

.method constructor <init>(Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zzhoujay/richtext/e;->ready:Lcom/zzhoujay/richtext/e;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zzhoujay/richtext/f;->b:Lcom/zzhoujay/richtext/e;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zzhoujay/richtext/f;->e:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    iget-object v0, p1, Lcom/zzhoujay/richtext/g;->b:Lcom/zzhoujay/richtext/i;

    .line 18
    .line 19
    sget-object v1, Lcom/zzhoujay/richtext/i;->markdown:Lcom/zzhoujay/richtext/i;

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    new-instance v0, Lg3/d;

    .line 24
    .line 25
    invoke-direct {v0, p2}, Lg3/d;-><init>(Landroid/widget/TextView;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zzhoujay/richtext/f;->c:Lg3/e;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Lg3/b;

    .line 32
    .line 33
    new-instance v1, Lcom/zzhoujay/richtext/ext/d;

    .line 34
    .line 35
    invoke-direct {v1, p2}, Lcom/zzhoujay/richtext/ext/d;-><init>(Landroid/widget/TextView;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Lg3/b;-><init>(Landroid/text/Html$TagHandler;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/zzhoujay/richtext/f;->c:Lg3/e;

    .line 42
    .line 43
    :goto_0
    iget v0, p1, Lcom/zzhoujay/richtext/g;->m:I

    .line 44
    .line 45
    if-lez v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Lcom/zzhoujay/richtext/ext/f;

    .line 48
    .line 49
    invoke-direct {v0}, Lcom/zzhoujay/richtext/ext/f;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-nez v0, :cond_2

    .line 57
    .line 58
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_1
    new-instance p2, Lg3/a;

    .line 66
    .line 67
    invoke-direct {p2}, Lg3/a;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, Lcom/zzhoujay/richtext/f;->d:Lg3/a;

    .line 71
    .line 72
    invoke-virtual {p1, p0}, Lcom/zzhoujay/richtext/g;->e(Lcom/zzhoujay/richtext/f;)V

    .line 73
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

.method static synthetic a(Lcom/zzhoujay/richtext/f;)Lcom/zzhoujay/richtext/g;
    .locals 0

    iget-object p0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    return-object p0
.end method

.method private declared-synchronized b(Ljava/lang/String;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lcom/zzhoujay/richtext/f;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    sget-object v0, Lcom/zzhoujay/richtext/f;->l:Ljava/util/regex/Pattern;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lcom/zzhoujay/richtext/f;->o:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const/4 v3, 0x0

    .line 53
    :goto_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance v4, Lcom/zzhoujay/richtext/c;

    .line 61
    .line 62
    iget-object v5, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 63
    .line 64
    iget-object v6, p0, Lcom/zzhoujay/richtext/f;->e:Ljava/lang/ref/WeakReference;

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-direct {v4, v3, v0, v5, v6}, Lcom/zzhoujay/richtext/c;-><init>(Ljava/lang/String;ILcom/zzhoujay/richtext/g;Landroid/widget/TextView;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v3}, Lcom/zzhoujay/richtext/f;->r(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {v4, v3}, Lcom/zzhoujay/richtext/c;->z(Z)V

    .line 80
    .line 81
    .line 82
    iget-object v3, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 83
    .line 84
    iget-boolean v5, v3, Lcom/zzhoujay/richtext/g;->c:Z

    .line 85
    .line 86
    if-nez v5, :cond_3

    .line 87
    .line 88
    iget-boolean v3, v3, Lcom/zzhoujay/richtext/g;->d:Z

    .line 89
    .line 90
    if-nez v3, :cond_3

    .line 91
    .line 92
    sget-object v3, Lcom/zzhoujay/richtext/f;->m:Ljava/util/regex/Pattern;

    .line 93
    .line 94
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_2

    .line 103
    .line 104
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v3}, Lcom/zzhoujay/richtext/f;->t(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v4, v3}, Lcom/zzhoujay/richtext/c;->G(I)V

    .line 117
    .line 118
    .line 119
    :cond_2
    sget-object v3, Lcom/zzhoujay/richtext/f;->n:Ljava/util/regex/Pattern;

    .line 120
    .line 121
    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_3

    .line 130
    .line 131
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1}, Lcom/zzhoujay/richtext/f;->t(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-virtual {v4, v1}, Lcom/zzhoujay/richtext/c;->x(I)V

    .line 144
    .line 145
    .line 146
    :cond_3
    iget-object v1, p0, Lcom/zzhoujay/richtext/f;->a:Ljava/util/HashMap;

    .line 147
    .line 148
    invoke-virtual {v4}, Lcom/zzhoujay/richtext/c;->k()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    add-int/lit8 v0, v0, 0x1

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_4
    monitor-exit p0

    .line 160
    return-void

    .line 161
    :catchall_0
    move-exception p1

    .line 162
    monitor-exit p0

    .line 163
    throw p1
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

.method private c(Landroid/widget/TextView;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/zzhoujay/richtext/f$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/zzhoujay/richtext/f$b;-><init>(Lcom/zzhoujay/richtext/f;Landroid/widget/TextView;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 7
    .line 8
    iget-boolean p1, p1, Lcom/zzhoujay/richtext/g;->u:Z

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-array p1, v1, [Ljava/lang/Void;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    new-array v1, v1, [Ljava/lang/Void;

    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
    .line 27
.end method

.method static e(Ljava/lang/Object;Lcom/zzhoujay/richtext/f;)V
    .locals 1

    invoke-static {}, Lcom/zzhoujay/richtext/h;->e()Lcom/zzhoujay/richtext/h;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/zzhoujay/richtext/h;->a(Ljava/lang/Object;Lcom/zzhoujay/richtext/f;)V

    return-void
.end method

.method public static g(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/zzhoujay/richtext/h;->e()Lcom/zzhoujay/richtext/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zzhoujay/richtext/h;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public static h(Ljava/lang/String;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    invoke-static {p0}, Lcom/zzhoujay/richtext/f;->j(Ljava/lang/String;)Lcom/zzhoujay/richtext/g$b;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/String;Lcom/zzhoujay/richtext/i;)Lcom/zzhoujay/richtext/g$b;
    .locals 1

    new-instance v0, Lcom/zzhoujay/richtext/g$b;

    invoke-direct {v0, p0, p1}, Lcom/zzhoujay/richtext/g$b;-><init>(Ljava/lang/String;Lcom/zzhoujay/richtext/i;)V

    return-object v0
.end method

.method public static j(Ljava/lang/String;)Lcom/zzhoujay/richtext/g$b;
    .locals 1

    sget-object v0, Lcom/zzhoujay/richtext/i;->html:Lcom/zzhoujay/richtext/i;

    invoke-static {p0, v0}, Lcom/zzhoujay/richtext/f;->i(Ljava/lang/String;Lcom/zzhoujay/richtext/i;)Lcom/zzhoujay/richtext/g$b;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/lang/String;)Lcom/zzhoujay/richtext/g$b;
    .locals 1

    sget-object v0, Lcom/zzhoujay/richtext/i;->markdown:Lcom/zzhoujay/richtext/i;

    invoke-static {p0, v0}, Lcom/zzhoujay/richtext/f;->i(Ljava/lang/String;Lcom/zzhoujay/richtext/i;)Lcom/zzhoujay/richtext/g$b;

    move-result-object p0

    return-object p0
.end method

.method static n(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/richtext/f;->p:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    monitor-exit v0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p0
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
.end method

.method public static p(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-static {v0}, Lcom/zzhoujay/richtext/f;->q(Ljava/io/File;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public static q(Ljava/io/File;)V
    .locals 0

    invoke-static {p0}, Lcom/zzhoujay/richtext/cache/a;->n(Ljava/io/File;)V

    return-void
.end method

.method private static r(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const-string v1, "gif"

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    add-int/2addr v0, v2

    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x0

    .line 33
    :goto_0
    return v2
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

.method private s()Landroid/text/SpannableStringBuilder;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zzhoujay/richtext/g;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zzhoujay/richtext/f;->c:Lg3/e;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Lg3/e;->parse(Ljava/lang/String;)Landroid/text/Spanned;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Landroid/text/SpannableStringBuilder;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroid/text/SpannableString;

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    move-object v0, v1

    .line 33
    :goto_0
    return-object v0
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

.method private static t(Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p0, -0x1

    .line 17
    :goto_0
    return p0
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
.end method

.method static u(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/zzhoujay/richtext/f;->p:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw p0
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

.method public static v()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zzhoujay/richtext/cache/a;->g()Lcom/zzhoujay/richtext/cache/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/cache/a;->d()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/zzhoujay/richtext/h;->e()Lcom/zzhoujay/richtext/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/h;->g()V

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
    .line 22
    .line 23
.end method


# virtual methods
.method public d(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Lcom/zzhoujay/richtext/f;->g:I

    .line 12
    .line 13
    if-lt p1, v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Lcom/zzhoujay/richtext/e;->loaded:Lcom/zzhoujay/richtext/e;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/zzhoujay/richtext/f;->b:Lcom/zzhoujay/richtext/e;

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zzhoujay/richtext/f;->e:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroid/widget/TextView;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/zzhoujay/richtext/g;->r:Le3/b;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    new-instance v0, Lcom/zzhoujay/richtext/f$a;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lcom/zzhoujay/richtext/f$a;-><init>(Lcom/zzhoujay/richtext/f;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
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

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zzhoujay/richtext/g;->t:Le3/f;

    .line 18
    .line 19
    invoke-interface {v0}, Le3/m;->recycle()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
.end method

.method public getDrawable(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    iget v0, p0, Lcom/zzhoujay/richtext/f;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/zzhoujay/richtext/f;->h:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/zzhoujay/richtext/g;->t:Le3/f;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    iget-boolean v0, v0, Lcom/zzhoujay/richtext/g;->l:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->e:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/widget/TextView;

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lcom/zzhoujay/richtext/ext/b;->a(Landroid/content/Context;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_3

    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_3
    iget-object v1, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 43
    .line 44
    iget-object v3, v1, Lcom/zzhoujay/richtext/g;->b:Lcom/zzhoujay/richtext/i;

    .line 45
    .line 46
    sget-object v4, Lcom/zzhoujay/richtext/i;->markdown:Lcom/zzhoujay/richtext/i;

    .line 47
    .line 48
    if-ne v3, v4, :cond_4

    .line 49
    .line 50
    new-instance v3, Lcom/zzhoujay/richtext/c;

    .line 51
    .line 52
    iget v4, p0, Lcom/zzhoujay/richtext/f;->h:I

    .line 53
    .line 54
    add-int/lit8 v4, v4, -0x1

    .line 55
    .line 56
    invoke-direct {v3, p1, v4, v1, v0}, Lcom/zzhoujay/richtext/c;-><init>(Ljava/lang/String;ILcom/zzhoujay/richtext/g;Landroid/widget/TextView;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/zzhoujay/richtext/f;->a:Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-virtual {v1, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    iget-object v1, p0, Lcom/zzhoujay/richtext/f;->a:Ljava/util/HashMap;

    .line 66
    .line 67
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v3, v1

    .line 72
    check-cast v3, Lcom/zzhoujay/richtext/c;

    .line 73
    .line 74
    if-nez v3, :cond_5

    .line 75
    .line 76
    new-instance v3, Lcom/zzhoujay/richtext/c;

    .line 77
    .line 78
    iget v1, p0, Lcom/zzhoujay/richtext/f;->h:I

    .line 79
    .line 80
    add-int/lit8 v1, v1, -0x1

    .line 81
    .line 82
    iget-object v4, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 83
    .line 84
    invoke-direct {v3, p1, v1, v4, v0}, Lcom/zzhoujay/richtext/c;-><init>(Ljava/lang/String;ILcom/zzhoujay/richtext/g;Landroid/widget/TextView;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/zzhoujay/richtext/f;->a:Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-virtual {v1, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_5
    :goto_0
    const/4 p1, 0x0

    .line 93
    invoke-virtual {v3, p1}, Lcom/zzhoujay/richtext/c;->y(I)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/zzhoujay/richtext/g;->j:Le3/e;

    .line 99
    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    invoke-interface {p1, v3}, Le3/e;->c(Lcom/zzhoujay/richtext/c;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Lcom/zzhoujay/richtext/c;->q()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_6

    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_6
    iget-object p1, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 113
    .line 114
    iget-object v1, p1, Lcom/zzhoujay/richtext/g;->t:Le3/f;

    .line 115
    .line 116
    invoke-interface {v1, v3, p1, v0}, Le3/d;->a(Lcom/zzhoujay/richtext/c;Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;)Landroid/graphics/drawable/Drawable;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1
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
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "RichText"

    .line 12
    .line 13
    const-string v1, "generateAndSet textView is recycle"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/zzhoujay/richtext/ext/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v1, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 20
    .line 21
    iget-boolean v1, v1, Lcom/zzhoujay/richtext/g;->v:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zzhoujay/richtext/f;->m()Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/zzhoujay/richtext/g;->r:Le3/b;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-interface {v0, v1}, Le3/b;->a(Z)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-direct {p0, v0}, Lcom/zzhoujay/richtext/f;->c(Landroid/widget/TextView;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void
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

.method m()Ljava/lang/CharSequence;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 14
    .line 15
    iget-object v2, v0, Lcom/zzhoujay/richtext/g;->b:Lcom/zzhoujay/richtext/i;

    .line 16
    .line 17
    sget-object v3, Lcom/zzhoujay/richtext/i;->markdown:Lcom/zzhoujay/richtext/i;

    .line 18
    .line 19
    if-eq v2, v3, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lcom/zzhoujay/richtext/g;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/zzhoujay/richtext/f;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/zzhoujay/richtext/f;->a:Ljava/util/HashMap;

    .line 33
    .line 34
    :goto_0
    sget-object v0, Lcom/zzhoujay/richtext/e;->loading:Lcom/zzhoujay/richtext/e;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/zzhoujay/richtext/f;->b:Lcom/zzhoujay/richtext/e;

    .line 37
    .line 38
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/zzhoujay/richtext/g;->g:Lcom/zzhoujay/richtext/b;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/b;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sget-object v2, Lcom/zzhoujay/richtext/b;->none:Lcom/zzhoujay/richtext/b;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/zzhoujay/richtext/b;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-le v0, v2, :cond_2

    .line 53
    .line 54
    invoke-static {}, Lcom/zzhoujay/richtext/h;->e()Lcom/zzhoujay/richtext/h;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 59
    .line 60
    iget-object v1, v1, Lcom/zzhoujay/richtext/g;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/zzhoujay/richtext/h;->f(Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :cond_2
    if-nez v1, :cond_3

    .line 67
    .line 68
    invoke-direct {p0}, Lcom/zzhoujay/richtext/f;->s()Landroid/text/SpannableStringBuilder;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :cond_3
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/zzhoujay/richtext/g;->t:Le3/f;

    .line 75
    .line 76
    invoke-interface {v0, p0}, Le3/f;->f(Le3/g;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->d:Lg3/a;

    .line 80
    .line 81
    iget-object v2, p0, Lcom/zzhoujay/richtext/f;->f:Lcom/zzhoujay/richtext/g;

    .line 82
    .line 83
    invoke-virtual {v0, v1, p0, v2}, Lg3/a;->e(Landroid/text/SpannableStringBuilder;Lg3/c;Lcom/zzhoujay/richtext/g;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lcom/zzhoujay/richtext/f;->g:I

    .line 88
    .line 89
    return-object v1
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

.method public o()Lcom/zzhoujay/richtext/e;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/f;->b:Lcom/zzhoujay/richtext/e;

    return-object v0
.end method
