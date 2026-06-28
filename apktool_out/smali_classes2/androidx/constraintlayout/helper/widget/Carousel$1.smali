.class Landroidx/constraintlayout/helper/widget/Carousel$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/helper/widget/Carousel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/constraintlayout/helper/widget/Carousel;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/helper/widget/Carousel;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->access$000(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->access$100(Landroidx/constraintlayout/helper/widget/Carousel;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 17
    .line 18
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->access$300(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/helper/widget/Carousel$Adapter;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 23
    .line 24
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$200(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-interface {v0, v1}, Landroidx/constraintlayout/helper/widget/Carousel$Adapter;->onNewItem(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 32
    .line 33
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->access$000(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getVelocity()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 42
    .line 43
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$400(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x2

    .line 48
    if-ne v1, v2, :cond_2

    .line 49
    .line 50
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 51
    .line 52
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$500(Landroidx/constraintlayout/helper/widget/Carousel;)F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    cmpl-float v1, v0, v1

    .line 57
    .line 58
    if-lez v1, :cond_2

    .line 59
    .line 60
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 61
    .line 62
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$200(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 67
    .line 68
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->access$300(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/helper/widget/Carousel$Adapter;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v2}, Landroidx/constraintlayout/helper/widget/Carousel$Adapter;->count()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    add-int/lit8 v2, v2, -0x1

    .line 77
    .line 78
    if-ge v1, v2, :cond_2

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 81
    .line 82
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$600(Landroidx/constraintlayout/helper/widget/Carousel;)F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    mul-float/2addr v0, v1

    .line 87
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 88
    .line 89
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$200(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_0

    .line 94
    .line 95
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 96
    .line 97
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$700(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 102
    .line 103
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->access$200(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-le v1, v2, :cond_0

    .line 108
    .line 109
    return-void

    .line 110
    :cond_0
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 111
    .line 112
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$200(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 117
    .line 118
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->access$300(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/helper/widget/Carousel$Adapter;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-interface {v2}, Landroidx/constraintlayout/helper/widget/Carousel$Adapter;->count()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    add-int/lit8 v2, v2, -0x1

    .line 127
    .line 128
    if-ne v1, v2, :cond_1

    .line 129
    .line 130
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 131
    .line 132
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$700(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 137
    .line 138
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->access$200(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-ge v1, v2, :cond_1

    .line 143
    .line 144
    return-void

    .line 145
    :cond_1
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$1;->this$0:Landroidx/constraintlayout/helper/widget/Carousel;

    .line 146
    .line 147
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->access$000(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    new-instance v2, Landroidx/constraintlayout/helper/widget/Carousel$1$1;

    .line 152
    .line 153
    invoke-direct {v2, p0, v0}, Landroidx/constraintlayout/helper/widget/Carousel$1$1;-><init>(Landroidx/constraintlayout/helper/widget/Carousel$1;F)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 157
    .line 158
    .line 159
    :cond_2
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
