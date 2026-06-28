.class public Landroidx/constraintlayout/core/state/helpers/VerticalChainReference;
.super Landroidx/constraintlayout/core/state/helpers/ChainReference;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/core/state/State;)V
    .locals 1

    sget-object v0, Landroidx/constraintlayout/core/state/State$Helper;->VERTICAL_CHAIN:Landroidx/constraintlayout/core/state/State$Helper;

    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/core/state/helpers/ChainReference;-><init>(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/State$Helper;)V

    return-void
.end method


# virtual methods
.method public apply()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/state/HelperReference;->mReferences:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Landroidx/constraintlayout/core/state/HelperReference;->mState:Landroidx/constraintlayout/core/state/State;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->clearVertical()Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/core/state/HelperReference;->mReferences:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    move-object v2, v1

    .line 35
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_5

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-object v4, p0, Landroidx/constraintlayout/core/state/HelperReference;->mState:Landroidx/constraintlayout/core/state/State;

    .line 46
    .line 47
    invoke-virtual {v4, v3}, Landroidx/constraintlayout/core/state/State;->constraints(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-nez v2, :cond_3

    .line 52
    .line 53
    iget-object v2, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mTopToTop:Ljava/lang/Object;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget v4, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mMarginTop:I

    .line 62
    .line 63
    invoke-virtual {v2, v4}, Landroidx/constraintlayout/core/state/ConstraintReference;->margin(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget v4, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mMarginTopGone:I

    .line 68
    .line 69
    invoke-virtual {v2, v4}, Landroidx/constraintlayout/core/state/ConstraintReference;->marginGone(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    iget-object v2, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mTopToBottom:Ljava/lang/Object;

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget v4, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mMarginTop:I

    .line 82
    .line 83
    invoke-virtual {v2, v4}, Landroidx/constraintlayout/core/state/ConstraintReference;->margin(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget v4, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mMarginTopGone:I

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/constraintlayout/core/state/ConstraintReference;->marginGone(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    sget-object v2, Landroidx/constraintlayout/core/state/State;->PARENT:Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 96
    .line 97
    .line 98
    :goto_2
    move-object v2, v3

    .line 99
    :cond_3
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->getKey()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v3, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->topToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 113
    .line 114
    .line 115
    :cond_4
    move-object v1, v3

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    if-eqz v1, :cond_8

    .line 118
    .line 119
    iget-object v0, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mBottomToTop:Ljava/lang/Object;

    .line 120
    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToTop(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iget v1, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mMarginBottom:I

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->margin(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget v1, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mMarginBottomGone:I

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->marginGone(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    iget-object v0, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mBottomToBottom:Ljava/lang/Object;

    .line 140
    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget v1, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mMarginBottom:I

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->margin(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iget v1, p0, Landroidx/constraintlayout/core/state/ConstraintReference;->mMarginBottomGone:I

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->marginGone(I)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_7
    sget-object v0, Landroidx/constraintlayout/core/state/State;->PARENT:Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->bottomToBottom(Ljava/lang/Object;)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 162
    .line 163
    .line 164
    :cond_8
    :goto_3
    if-nez v2, :cond_9

    .line 165
    .line 166
    return-void

    .line 167
    :cond_9
    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/ChainReference;->mBias:F

    .line 168
    .line 169
    const/high16 v1, 0x3f000000    # 0.5f

    .line 170
    .line 171
    cmpl-float v1, v0, v1

    .line 172
    .line 173
    if-eqz v1, :cond_a

    .line 174
    .line 175
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->verticalBias(F)Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 176
    .line 177
    .line 178
    :cond_a
    sget-object v0, Landroidx/constraintlayout/core/state/helpers/VerticalChainReference$1;->$SwitchMap$androidx$constraintlayout$core$state$State$Chain:[I

    .line 179
    .line 180
    iget-object v1, p0, Landroidx/constraintlayout/core/state/helpers/ChainReference;->mStyle:Landroidx/constraintlayout/core/state/State$Chain;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    aget v0, v0, v1

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    if-eq v0, v1, :cond_d

    .line 190
    .line 191
    const/4 v3, 0x2

    .line 192
    if-eq v0, v3, :cond_c

    .line 193
    .line 194
    const/4 v1, 0x3

    .line 195
    if-eq v0, v1, :cond_b

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_b
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/core/state/ConstraintReference;->setVerticalChainStyle(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_c
    invoke-virtual {v2, v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->setVerticalChainStyle(I)V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_d
    const/4 v0, 0x0

    .line 207
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/core/state/ConstraintReference;->setVerticalChainStyle(I)V

    .line 208
    .line 209
    .line 210
    :goto_4
    return-void
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
