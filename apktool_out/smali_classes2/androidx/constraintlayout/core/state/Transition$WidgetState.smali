.class Landroidx/constraintlayout/core/state/Transition$WidgetState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/core/state/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WidgetState"
.end annotation


# instance fields
.field end:Landroidx/constraintlayout/core/state/WidgetFrame;

.field interpolated:Landroidx/constraintlayout/core/state/WidgetFrame;

.field motionControl:Landroidx/constraintlayout/core/motion/Motion;

.field motionWidgetEnd:Landroidx/constraintlayout/core/motion/MotionWidget;

.field motionWidgetInterpolated:Landroidx/constraintlayout/core/motion/MotionWidget;

.field motionWidgetStart:Landroidx/constraintlayout/core/motion/MotionWidget;

.field myKeyCache:Landroidx/constraintlayout/core/motion/utils/KeyCache;

.field myParentHeight:I

.field myParentWidth:I

.field start:Landroidx/constraintlayout/core/state/WidgetFrame;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/constraintlayout/core/motion/utils/KeyCache;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/constraintlayout/core/motion/utils/KeyCache;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->myKeyCache:Landroidx/constraintlayout/core/motion/utils/KeyCache;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->myParentHeight:I

    .line 13
    .line 14
    iput v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->myParentWidth:I

    .line 15
    .line 16
    new-instance v0, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 17
    .line 18
    invoke-direct {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->start:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 22
    .line 23
    new-instance v0, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 24
    .line 25
    invoke-direct {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->end:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 29
    .line 30
    new-instance v0, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 31
    .line 32
    invoke-direct {v0}, Landroidx/constraintlayout/core/state/WidgetFrame;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->interpolated:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 36
    .line 37
    new-instance v0, Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->start:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/motion/MotionWidget;-><init>(Landroidx/constraintlayout/core/state/WidgetFrame;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetStart:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 45
    .line 46
    new-instance v0, Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 47
    .line 48
    iget-object v1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->end:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 49
    .line 50
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/motion/MotionWidget;-><init>(Landroidx/constraintlayout/core/state/WidgetFrame;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetEnd:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 54
    .line 55
    new-instance v0, Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->interpolated:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 58
    .line 59
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/motion/MotionWidget;-><init>(Landroidx/constraintlayout/core/state/WidgetFrame;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetInterpolated:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 63
    .line 64
    new-instance v0, Landroidx/constraintlayout/core/motion/Motion;

    .line 65
    .line 66
    iget-object v1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetStart:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 67
    .line 68
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/motion/Motion;-><init>(Landroidx/constraintlayout/core/motion/MotionWidget;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 72
    .line 73
    iget-object v1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetStart:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/motion/Motion;->setStart(Landroidx/constraintlayout/core/motion/MotionWidget;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetEnd:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/motion/Motion;->setEnd(Landroidx/constraintlayout/core/motion/MotionWidget;)V

    .line 83
    .line 84
    .line 85
    return-void
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


# virtual methods
.method public getFrame(I)Landroidx/constraintlayout/core/state/WidgetFrame;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->start:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->end:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->interpolated:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 13
    .line 14
    return-object p1
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

.method public interpolate(IIFLandroidx/constraintlayout/core/state/Transition;)V
    .locals 7

    .line 1
    iput p2, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->myParentHeight:I

    .line 2
    .line 3
    iput p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->myParentWidth:I

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    move v1, p1

    .line 14
    move v2, p2

    .line 15
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/core/motion/Motion;->setup(IIFJ)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->interpolated:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 19
    .line 20
    iget-object v3, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->start:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 21
    .line 22
    iget-object v4, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->end:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 23
    .line 24
    move v0, p1

    .line 25
    move v1, p2

    .line 26
    move-object v5, p4

    .line 27
    move v6, p3

    .line 28
    invoke-static/range {v0 .. v6}, Landroidx/constraintlayout/core/state/WidgetFrame;->interpolate(IILandroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/Transition;F)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->interpolated:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 32
    .line 33
    iput p3, v0, Landroidx/constraintlayout/core/state/WidgetFrame;->interpolatedPos:F

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetInterpolated:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    iget-object v6, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->myKeyCache:Landroidx/constraintlayout/core/motion/utils/KeyCache;

    .line 44
    .line 45
    move v3, p3

    .line 46
    invoke-virtual/range {v1 .. v6}, Landroidx/constraintlayout/core/motion/Motion;->interpolate(Landroidx/constraintlayout/core/motion/MotionWidget;FJLandroidx/constraintlayout/core/motion/utils/KeyCache;)Z

    .line 47
    .line 48
    .line 49
    return-void
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
.end method

.method public setKeyAttribute(Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/constraintlayout/core/motion/key/MotionKeyAttributes;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/constraintlayout/core/motion/key/MotionKeyAttributes;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->applyDelta(Landroidx/constraintlayout/core/motion/utils/TypedValues;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/core/motion/Motion;->addKey(Landroidx/constraintlayout/core/motion/key/MotionKey;)V

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
.end method

.method public setKeyCycle(Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->applyDelta(Landroidx/constraintlayout/core/motion/utils/TypedValues;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/core/motion/Motion;->addKey(Landroidx/constraintlayout/core/motion/key/MotionKey;)V

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
.end method

.method public setKeyPosition(Landroidx/constraintlayout/core/motion/utils/TypedBundle;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/constraintlayout/core/motion/key/MotionKeyPosition;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/core/motion/utils/TypedBundle;->applyDelta(Landroidx/constraintlayout/core/motion/utils/TypedValues;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/core/motion/Motion;->addKey(Landroidx/constraintlayout/core/motion/key/MotionKey;)V

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
.end method

.method public update(Landroidx/constraintlayout/core/widgets/ConstraintWidget;I)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->start:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/core/state/WidgetFrame;->update(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 9
    .line 10
    iget-object p2, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetStart:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/core/motion/Motion;->setStart(Landroidx/constraintlayout/core/motion/MotionWidget;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->end:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/core/state/WidgetFrame;->update(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionControl:Landroidx/constraintlayout/core/motion/Motion;

    .line 25
    .line 26
    iget-object p2, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->motionWidgetEnd:Landroidx/constraintlayout/core/motion/MotionWidget;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/core/motion/Motion;->setEnd(Landroidx/constraintlayout/core/motion/MotionWidget;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    const/4 p1, -0x1

    .line 32
    iput p1, p0, Landroidx/constraintlayout/core/state/Transition$WidgetState;->myParentWidth:I

    .line 33
    .line 34
    return-void
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
