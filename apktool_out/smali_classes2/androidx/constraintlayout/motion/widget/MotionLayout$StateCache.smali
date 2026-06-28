.class Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "StateCache"
.end annotation


# instance fields
.field final KeyEndState:Ljava/lang/String;

.field final KeyProgress:Ljava/lang/String;

.field final KeyStartState:Ljava/lang/String;

.field final KeyVelocity:Ljava/lang/String;

.field endState:I

.field mProgress:F

.field mVelocity:F

.field startState:I

.field final synthetic this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 7
    .line 8
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    .line 9
    .line 10
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mVelocity:F

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->startState:I

    .line 14
    .line 15
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    .line 16
    .line 17
    const-string p1, "motion.progress"

    .line 18
    .line 19
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->KeyProgress:Ljava/lang/String;

    .line 20
    .line 21
    const-string p1, "motion.velocity"

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->KeyVelocity:Ljava/lang/String;

    .line 24
    .line 25
    const-string p1, "motion.StartState"

    .line 26
    .line 27
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->KeyStartState:Ljava/lang/String;

    .line 28
    .line 29
    const-string p1, "motion.EndState"

    .line 30
    .line 31
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->KeyEndState:Ljava/lang/String;

    .line 32
    .line 33
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
.end method


# virtual methods
.method apply()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->startState:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    .line 7
    .line 8
    if-eq v2, v1, :cond_3

    .line 9
    .line 10
    :cond_0
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 13
    .line 14
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->transitionToState(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    .line 21
    .line 22
    if-ne v2, v1, :cond_2

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(III)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 31
    .line 32
    invoke-virtual {v3, v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(II)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 36
    .line 37
    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;->SETUP:Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Landroidx/constraintlayout/motion/widget/MotionLayout$TransitionState;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mVelocity:F

    .line 43
    .line 44
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 60
    .line 61
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_5
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 68
    .line 69
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    .line 70
    .line 71
    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mVelocity:F

    .line 72
    .line 73
    invoke-virtual {v0, v2, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(FF)V

    .line 74
    .line 75
    .line 76
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 77
    .line 78
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    .line 79
    .line 80
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mVelocity:F

    .line 81
    .line 82
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->startState:I

    .line 83
    .line 84
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    .line 85
    .line 86
    return-void
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

.method public getTransitionState()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "motion.progress"

    .line 7
    .line 8
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 11
    .line 12
    .line 13
    const-string v1, "motion.velocity"

    .line 14
    .line 15
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mVelocity:F

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 18
    .line 19
    .line 20
    const-string v1, "motion.StartState"

    .line 21
    .line 22
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->startState:I

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    const-string v1, "motion.EndState"

    .line 28
    .line 29
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    return-object v0
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
.end method

.method public recordState()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->access$100(Landroidx/constraintlayout/motion/widget/MotionLayout;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->access$200(Landroidx/constraintlayout/motion/widget/MotionLayout;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->startState:I

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getVelocity()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mVelocity:F

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->this$0:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    .line 32
    .line 33
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
.end method

.method public setEndState(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    return-void
.end method

.method public setProgress(F)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    return-void
.end method

.method public setStartState(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->startState:I

    return-void
.end method

.method public setTransitionState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "motion.progress"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mProgress:F

    .line 8
    .line 9
    const-string v0, "motion.velocity"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mVelocity:F

    .line 16
    .line 17
    const-string v0, "motion.StartState"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->startState:I

    .line 24
    .line 25
    const-string v0, "motion.EndState"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->endState:I

    .line 32
    .line 33
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
.end method

.method public setVelocity(F)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$StateCache;->mVelocity:F

    return-void
.end method
