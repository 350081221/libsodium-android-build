.class Lcom/bytedance/tools/ui/view/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/tools/ui/ui/a/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/tools/ui/view/b$a;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/tools/ui/ui/a/a;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/bytedance/tools/ui/view/b$a;


# direct methods
.method constructor <init>(Lcom/bytedance/tools/ui/view/b$a;Lcom/bytedance/tools/ui/ui/a/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    iput-object p2, p0, Lcom/bytedance/tools/ui/view/b$a$a;->a:Lcom/bytedance/tools/ui/ui/a/a;

    iput-object p3, p0, Lcom/bytedance/tools/ui/view/b$a$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->a:Lcom/bytedance/tools/ui/ui/a/a;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/bytedance/tools/ui/ui/a/c;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/bytedance/tools/ui/view/b$a;->a:Lcom/bytedance/tools/c/a;

    .line 10
    .line 11
    check-cast v0, Lcom/bytedance/tools/ui/ui/a/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/ui/a/c;->h()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "1"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "0"

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v1, v0}, Lcom/bytedance/tools/c/a;->h(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    instance-of v1, v0, Lcom/bytedance/tools/ui/ui/a/b;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v1, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 33
    .line 34
    iget-object v1, v1, Lcom/bytedance/tools/ui/view/b$a;->a:Lcom/bytedance/tools/c/a;

    .line 35
    .line 36
    check-cast v0, Lcom/bytedance/tools/ui/ui/a/b;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/bytedance/tools/ui/ui/a/b;->i()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v1, v0}, Lcom/bytedance/tools/c/a;->h(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/bytedance/tools/ui/view/b$a;->a:Lcom/bytedance/tools/c/a;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/bytedance/tools/c/a;->i()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, p0, Lcom/bytedance/tools/ui/view/b$a$a;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/bytedance/tools/ui/view/b$a;->c:Lcom/bytedance/tools/ui/view/b;

    .line 64
    .line 65
    invoke-static {v0}, Lcom/bytedance/tools/ui/view/b;->f(Lcom/bytedance/tools/ui/view/b;)Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 70
    .line 71
    iget-object v1, v1, Lcom/bytedance/tools/ui/view/b$a;->a:Lcom/bytedance/tools/c/a;

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/bytedance/tools/c/a;->p()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iget-object v2, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 78
    .line 79
    iget-object v2, v2, Lcom/bytedance/tools/ui/view/b$a;->a:Lcom/bytedance/tools/c/a;

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/bytedance/tools/c/a;->i()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v0, v1, v2}, Lcom/bytedance/tools/d/g;->c(Landroid/content/Context;ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 89
    .line 90
    iget-object v1, v0, Lcom/bytedance/tools/ui/view/b$a;->c:Lcom/bytedance/tools/ui/view/b;

    .line 91
    .line 92
    iget-object v0, v0, Lcom/bytedance/tools/ui/view/b$a;->a:Lcom/bytedance/tools/c/a;

    .line 93
    .line 94
    invoke-static {v1, v0}, Lcom/bytedance/tools/ui/view/b;->k(Lcom/bytedance/tools/ui/view/b;Lcom/bytedance/tools/c/a;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 101
    .line 102
    iget-object v0, v0, Lcom/bytedance/tools/ui/view/b$a;->b:Landroid/view/View;

    .line 103
    .line 104
    sget v1, Lcom/bytedance/tools/R$id;->v4:I

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Landroid/widget/ImageView;

    .line 111
    .line 112
    sget v1, Lcom/bytedance/tools/R$drawable;->H0:I

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 119
    .line 120
    iget-object v0, v0, Lcom/bytedance/tools/ui/view/b$a;->b:Landroid/view/View;

    .line 121
    .line 122
    sget v1, Lcom/bytedance/tools/R$id;->v4:I

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Landroid/widget/ImageView;

    .line 129
    .line 130
    sget v1, Lcom/bytedance/tools/R$drawable;->I0:I

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 133
    .line 134
    .line 135
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->a:Lcom/bytedance/tools/ui/ui/a/a;

    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->c:Lcom/bytedance/tools/ui/view/b$a;

    .line 141
    .line 142
    iget-object v1, v0, Lcom/bytedance/tools/ui/view/b$a;->c:Lcom/bytedance/tools/ui/view/b;

    .line 143
    .line 144
    iget-object v0, v0, Lcom/bytedance/tools/ui/view/b$a;->a:Lcom/bytedance/tools/c/a;

    .line 145
    .line 146
    invoke-static {v1, v0}, Lcom/bytedance/tools/ui/view/b;->l(Lcom/bytedance/tools/ui/view/b;Lcom/bytedance/tools/c/a;)V

    .line 147
    .line 148
    .line 149
    return-void
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

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/bytedance/tools/ui/view/b$a$a;->a:Lcom/bytedance/tools/ui/ui/a/a;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
