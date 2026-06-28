.class Lcom/google/android/material/timepicker/TimePickerClockPresenter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/timepicker/ClockHandView$OnRotateListener;
.implements Lcom/google/android/material/timepicker/TimePickerView$OnSelectionChange;
.implements Lcom/google/android/material/timepicker/TimePickerView$OnPeriodChangeListener;
.implements Lcom/google/android/material/timepicker/ClockHandView$OnActionUpListener;
.implements Lcom/google/android/material/timepicker/TimePickerPresenter;


# static fields
.field private static final DEGREES_PER_HOUR:I = 0x1e

.field private static final DEGREES_PER_MINUTE:I = 0x6

.field private static final HOUR_CLOCK_24_VALUES:[Ljava/lang/String;

.field private static final HOUR_CLOCK_VALUES:[Ljava/lang/String;

.field private static final MINUTE_CLOCK_VALUES:[Ljava/lang/String;


# instance fields
.field private broadcasting:Z

.field private hourRotation:F

.field private minuteRotation:F

.field private final time:Lcom/google/android/material/timepicker/TimeModel;

.field private final timePickerView:Lcom/google/android/material/timepicker/TimePickerView;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    const-string v0, "12"

    .line 2
    .line 3
    const-string v1, "1"

    .line 4
    .line 5
    const-string v2, "2"

    .line 6
    .line 7
    const-string v3, "3"

    .line 8
    .line 9
    const-string v4, "4"

    .line 10
    .line 11
    const-string v5, "5"

    .line 12
    .line 13
    const-string v6, "6"

    .line 14
    .line 15
    const-string v7, "7"

    .line 16
    .line 17
    const-string v8, "8"

    .line 18
    .line 19
    const-string v9, "9"

    .line 20
    .line 21
    const-string v10, "10"

    .line 22
    .line 23
    const-string v11, "11"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->HOUR_CLOCK_VALUES:[Ljava/lang/String;

    .line 30
    .line 31
    const-string v1, "00"

    .line 32
    .line 33
    const-string v2, "1"

    .line 34
    .line 35
    const-string v3, "2"

    .line 36
    .line 37
    const-string v4, "3"

    .line 38
    .line 39
    const-string v5, "4"

    .line 40
    .line 41
    const-string v6, "5"

    .line 42
    .line 43
    const-string v7, "6"

    .line 44
    .line 45
    const-string v8, "7"

    .line 46
    .line 47
    const-string v9, "8"

    .line 48
    .line 49
    const-string v10, "9"

    .line 50
    .line 51
    const-string v11, "10"

    .line 52
    .line 53
    const-string v12, "11"

    .line 54
    .line 55
    const-string v13, "12"

    .line 56
    .line 57
    const-string v14, "13"

    .line 58
    .line 59
    const-string v15, "14"

    .line 60
    .line 61
    const-string v16, "15"

    .line 62
    .line 63
    const-string v17, "16"

    .line 64
    .line 65
    const-string v18, "17"

    .line 66
    .line 67
    const-string v19, "18"

    .line 68
    .line 69
    const-string v20, "19"

    .line 70
    .line 71
    const-string v21, "20"

    .line 72
    .line 73
    const-string v22, "21"

    .line 74
    .line 75
    const-string v23, "22"

    .line 76
    .line 77
    const-string v24, "23"

    .line 78
    .line 79
    filled-new-array/range {v1 .. v24}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->HOUR_CLOCK_24_VALUES:[Ljava/lang/String;

    .line 84
    .line 85
    const-string v1, "00"

    .line 86
    .line 87
    const-string v2, "5"

    .line 88
    .line 89
    const-string v3, "10"

    .line 90
    .line 91
    const-string v4, "15"

    .line 92
    .line 93
    const-string v5, "20"

    .line 94
    .line 95
    const-string v6, "25"

    .line 96
    .line 97
    const-string v7, "30"

    .line 98
    .line 99
    const-string v8, "35"

    .line 100
    .line 101
    const-string v9, "40"

    .line 102
    .line 103
    const-string v10, "45"

    .line 104
    .line 105
    const-string v11, "50"

    .line 106
    .line 107
    const-string v12, "55"

    .line 108
    .line 109
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sput-object v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->MINUTE_CLOCK_VALUES:[Ljava/lang/String;

    .line 114
    .line 115
    return-void
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

.method public constructor <init>(Lcom/google/android/material/timepicker/TimePickerView;Lcom/google/android/material/timepicker/TimeModel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->broadcasting:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->initialize()V

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

.method static synthetic access$000(Lcom/google/android/material/timepicker/TimePickerClockPresenter;)Lcom/google/android/material/timepicker/TimeModel;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    return-object p0
.end method

.method private getHourClockValues()[Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    iget v0, v0, Lcom/google/android/material/timepicker/TimeModel;->format:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->HOUR_CLOCK_24_VALUES:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->HOUR_CLOCK_VALUES:[Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method private getHourRotation()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    invoke-virtual {v0}, Lcom/google/android/material/timepicker/TimeModel;->getHourForDisplay()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1e

    rem-int/lit16 v0, v0, 0x168

    return v0
.end method

.method private performHapticFeedback(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/timepicker/TimeModel;->minute:I

    .line 4
    .line 5
    if-ne v1, p2, :cond_0

    .line 6
    .line 7
    iget p2, v0, Lcom/google/android/material/timepicker/TimeModel;->hour:I

    .line 8
    .line 9
    if-eq p2, p1, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 12
    .line 13
    const/4 p2, 0x4

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
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

.method private updateCurrentLevel()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/timepicker/TimeModel;->selection:I

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget v1, v0, Lcom/google/android/material/timepicker/TimeModel;->format:I

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    iget v0, v0, Lcom/google/android/material/timepicker/TimeModel;->hour:I

    .line 15
    .line 16
    const/16 v1, 0xc

    .line 17
    .line 18
    if-lt v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lcom/google/android/material/timepicker/TimePickerView;->setCurrentLevel(I)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method private updateTime()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    iget v2, v1, Lcom/google/android/material/timepicker/TimeModel;->period:I

    invoke-virtual {v1}, Lcom/google/android/material/timepicker/TimeModel;->getHourForDisplay()I

    move-result v1

    iget-object v3, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    iget v3, v3, Lcom/google/android/material/timepicker/TimeModel;->minute:I

    invoke-virtual {v0, v2, v1, v3}, Lcom/google/android/material/timepicker/TimePickerView;->updateTime(III)V

    return-void
.end method

.method private updateValues()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->HOUR_CLOCK_VALUES:[Ljava/lang/String;

    const-string v1, "%d"

    invoke-direct {p0, v0, v1}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->updateValues([Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->MINUTE_CLOCK_VALUES:[Ljava/lang/String;

    const-string v1, "%02d"

    invoke-direct {p0, v0, v1}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->updateValues([Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private updateValues([Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    aget-object v2, p1, v0

    invoke-static {v1, v2, p2}, Lcom/google/android/material/timepicker/TimeModel;->formatText(Landroid/content/res/Resources;Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public hide()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public initialize()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/android/material/timepicker/TimeModel;->format:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/material/timepicker/TimePickerView;->showToggle()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/google/android/material/timepicker/TimePickerView;->addOnRotateListener(Lcom/google/android/material/timepicker/ClockHandView$OnRotateListener;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lcom/google/android/material/timepicker/TimePickerView;->setOnSelectionChangeListener(Lcom/google/android/material/timepicker/TimePickerView$OnSelectionChange;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lcom/google/android/material/timepicker/TimePickerView;->setOnPeriodChangeListener(Lcom/google/android/material/timepicker/TimePickerView$OnPeriodChangeListener;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lcom/google/android/material/timepicker/TimePickerView;->setOnActionUpListener(Lcom/google/android/material/timepicker/ClockHandView$OnActionUpListener;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->updateValues()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->invalidate()V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public invalidate()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->getHourRotation()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iput v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->hourRotation:F

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 9
    .line 10
    iget v1, v0, Lcom/google/android/material/timepicker/TimeModel;->minute:I

    .line 11
    .line 12
    mul-int/lit8 v1, v1, 0x6

    .line 13
    .line 14
    int-to-float v1, v1

    .line 15
    iput v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->minuteRotation:F

    .line 16
    .line 17
    iget v0, v0, Lcom/google/android/material/timepicker/TimeModel;->selection:I

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->setSelection(IZ)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->updateTime()V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public onActionUp(FZ)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->broadcasting:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 5
    .line 6
    iget v2, v1, Lcom/google/android/material/timepicker/TimeModel;->minute:I

    .line 7
    .line 8
    iget v3, v1, Lcom/google/android/material/timepicker/TimeModel;->hour:I

    .line 9
    .line 10
    iget v1, v1, Lcom/google/android/material/timepicker/TimeModel;->selection:I

    .line 11
    .line 12
    const/16 v4, 0xa

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-ne v1, v4, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 18
    .line 19
    iget p2, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->hourRotation:F

    .line 20
    .line 21
    invoke-virtual {p1, p2, v5}, Lcom/google/android/material/timepicker/TimePickerView;->setHandRotation(FZ)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-class p2, Landroid/view/accessibility/AccessibilityManager;

    .line 31
    .line 32
    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    move p1, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move p1, v5

    .line 49
    :goto_0
    if-nez p1, :cond_3

    .line 50
    .line 51
    const/16 p1, 0xc

    .line 52
    .line 53
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->setSelection(IZ)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p2, :cond_2

    .line 62
    .line 63
    add-int/lit8 p1, p1, 0xf

    .line 64
    .line 65
    div-int/lit8 p1, p1, 0x1e

    .line 66
    .line 67
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 68
    .line 69
    mul-int/lit8 p1, p1, 0x5

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Lcom/google/android/material/timepicker/TimeModel;->setMinute(I)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 75
    .line 76
    iget p1, p1, Lcom/google/android/material/timepicker/TimeModel;->minute:I

    .line 77
    .line 78
    mul-int/lit8 p1, p1, 0x6

    .line 79
    .line 80
    int-to-float p1, p1

    .line 81
    iput p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->minuteRotation:F

    .line 82
    .line 83
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 84
    .line 85
    iget v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->minuteRotation:F

    .line 86
    .line 87
    invoke-virtual {p1, v0, p2}, Lcom/google/android/material/timepicker/TimePickerView;->setHandRotation(FZ)V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_1
    iput-boolean v5, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->broadcasting:Z

    .line 91
    .line 92
    invoke-direct {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->updateTime()V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, v3, v2}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->performHapticFeedback(II)V

    .line 96
    .line 97
    .line 98
    return-void
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
.end method

.method public onPeriodChange(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    invoke-virtual {v0, p1}, Lcom/google/android/material/timepicker/TimeModel;->setPeriod(I)V

    return-void
.end method

.method public onRotate(FZ)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->broadcasting:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/android/material/timepicker/TimeModel;->hour:I

    .line 9
    .line 10
    iget v0, v0, Lcom/google/android/material/timepicker/TimeModel;->minute:I

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v2, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 17
    .line 18
    iget v3, v2, Lcom/google/android/material/timepicker/TimeModel;->selection:I

    .line 19
    .line 20
    const/16 v4, 0xc

    .line 21
    .line 22
    if-ne v3, v4, :cond_1

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x3

    .line 25
    .line 26
    div-int/lit8 p1, p1, 0x6

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Lcom/google/android/material/timepicker/TimeModel;->setMinute(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 32
    .line 33
    iget p1, p1, Lcom/google/android/material/timepicker/TimeModel;->minute:I

    .line 34
    .line 35
    mul-int/lit8 p1, p1, 0x6

    .line 36
    .line 37
    int-to-double v2, p1

    .line 38
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    double-to-float p1, v2

    .line 43
    iput p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->minuteRotation:F

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    add-int/lit8 p1, p1, 0xf

    .line 47
    .line 48
    div-int/lit8 p1, p1, 0x1e

    .line 49
    .line 50
    iget v2, v2, Lcom/google/android/material/timepicker/TimeModel;->format:I

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    if-ne v2, v3, :cond_2

    .line 54
    .line 55
    rem-int/lit8 p1, p1, 0xc

    .line 56
    .line 57
    iget-object v2, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/google/android/material/timepicker/TimePickerView;->getCurrentLevel()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    const/4 v3, 0x2

    .line 64
    if-ne v2, v3, :cond_2

    .line 65
    .line 66
    add-int/lit8 p1, p1, 0xc

    .line 67
    .line 68
    :cond_2
    iget-object v2, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Lcom/google/android/material/timepicker/TimeModel;->setHour(I)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->getHourRotation()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    int-to-float p1, p1

    .line 78
    iput p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->hourRotation:F

    .line 79
    .line 80
    :goto_0
    if-nez p2, :cond_3

    .line 81
    .line 82
    invoke-direct {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->updateTime()V

    .line 83
    .line 84
    .line 85
    invoke-direct {p0, v1, v0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->performHapticFeedback(II)V

    .line 86
    .line 87
    .line 88
    :cond_3
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
.end method

.method public onSelectionChanged(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->setSelection(IZ)V

    return-void
.end method

.method setSelection(IZ)V
    .locals 4

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lcom/google/android/material/timepicker/TimePickerView;->setAnimateOnTouchUp(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 14
    .line 15
    iput p1, v1, Lcom/google/android/material/timepicker/TimeModel;->selection:I

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v2, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->MINUTE_CLOCK_VALUES:[Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-direct {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->getHourClockValues()[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_1
    if-eqz v0, :cond_2

    .line 29
    .line 30
    sget v3, Lcom/google/android/material/R$string;->material_minute_suffix:I

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    iget-object v3, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->time:Lcom/google/android/material/timepicker/TimeModel;

    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/google/android/material/timepicker/TimeModel;->getHourContentDescriptionResId()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :goto_2
    invoke-virtual {v1, v2, v3}, Lcom/google/android/material/timepicker/TimePickerView;->setValues([Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->updateCurrentLevel()V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->minuteRotation:F

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    iget v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->hourRotation:F

    .line 53
    .line 54
    :goto_3
    invoke-virtual {v1, v0, p2}, Lcom/google/android/material/timepicker/TimePickerView;->setHandRotation(FZ)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Lcom/google/android/material/timepicker/TimePickerView;->setActiveSelection(I)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 63
    .line 64
    new-instance p2, Lcom/google/android/material/timepicker/TimePickerClockPresenter$1;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget v1, Lcom/google/android/material/R$string;->material_hour_selection:I

    .line 73
    .line 74
    invoke-direct {p2, p0, v0, v1}, Lcom/google/android/material/timepicker/TimePickerClockPresenter$1;-><init>(Lcom/google/android/material/timepicker/TimePickerClockPresenter;Landroid/content/Context;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p2}, Lcom/google/android/material/timepicker/TimePickerView;->setMinuteHourDelegate(Landroidx/core/view/AccessibilityDelegateCompat;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 81
    .line 82
    new-instance p2, Lcom/google/android/material/timepicker/TimePickerClockPresenter$2;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget v1, Lcom/google/android/material/R$string;->material_minute_selection:I

    .line 91
    .line 92
    invoke-direct {p2, p0, v0, v1}, Lcom/google/android/material/timepicker/TimePickerClockPresenter$2;-><init>(Lcom/google/android/material/timepicker/TimePickerClockPresenter;Landroid/content/Context;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p2}, Lcom/google/android/material/timepicker/TimePickerView;->setHourClickDelegate(Landroidx/core/view/AccessibilityDelegateCompat;)V

    .line 96
    .line 97
    .line 98
    return-void
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
.end method

.method public show()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerClockPresenter;->timePickerView:Lcom/google/android/material/timepicker/TimePickerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
