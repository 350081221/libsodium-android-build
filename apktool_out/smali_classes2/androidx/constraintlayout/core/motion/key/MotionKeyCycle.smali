.class public Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;
.super Landroidx/constraintlayout/core/motion/key/MotionKey;
.source "SourceFile"


# static fields
.field public static final KEY_TYPE:I = 0x4

.field static final NAME:Ljava/lang/String; = "KeyCycle"

.field public static final SHAPE_BOUNCE:I = 0x6

.field public static final SHAPE_COS_WAVE:I = 0x5

.field public static final SHAPE_REVERSE_SAW_WAVE:I = 0x4

.field public static final SHAPE_SAW_WAVE:I = 0x3

.field public static final SHAPE_SIN_WAVE:I = 0x0

.field public static final SHAPE_SQUARE_WAVE:I = 0x1

.field public static final SHAPE_TRIANGLE_WAVE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "KeyCycle"

.field public static final WAVE_OFFSET:Ljava/lang/String; = "waveOffset"

.field public static final WAVE_PERIOD:Ljava/lang/String; = "wavePeriod"

.field public static final WAVE_PHASE:Ljava/lang/String; = "wavePhase"

.field public static final WAVE_SHAPE:Ljava/lang/String; = "waveShape"


# instance fields
.field private mAlpha:F

.field private mCurveFit:I

.field private mCustomWaveShape:Ljava/lang/String;

.field private mElevation:F

.field private mProgress:F

.field private mRotation:F

.field private mRotationX:F

.field private mRotationY:F

.field private mScaleX:F

.field private mScaleY:F

.field private mTransitionEasing:Ljava/lang/String;

.field private mTransitionPathRotate:F

.field private mTranslationX:F

.field private mTranslationY:F

.field private mTranslationZ:F

.field private mWaveOffset:F

.field private mWavePeriod:F

.field private mWavePhase:F

.field private mWaveShape:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/constraintlayout/core/motion/key/MotionKey;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTransitionEasing:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mCurveFit:I

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveShape:I

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mCustomWaveShape:Ljava/lang/String;

    .line 14
    .line 15
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 16
    .line 17
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePeriod:F

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput v1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveOffset:F

    .line 21
    .line 22
    iput v1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePhase:F

    .line 23
    .line 24
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mProgress:F

    .line 25
    .line 26
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mAlpha:F

    .line 27
    .line 28
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mElevation:F

    .line 29
    .line 30
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotation:F

    .line 31
    .line 32
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTransitionPathRotate:F

    .line 33
    .line 34
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotationX:F

    .line 35
    .line 36
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotationY:F

    .line 37
    .line 38
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mScaleX:F

    .line 39
    .line 40
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mScaleY:F

    .line 41
    .line 42
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationX:F

    .line 43
    .line 44
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationY:F

    .line 45
    .line 46
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationZ:F

    .line 47
    .line 48
    const/4 v0, 0x4

    .line 49
    iput v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKey;->mType:I

    .line 50
    .line 51
    new-instance v0, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKey;->mCustom:Ljava/util/HashMap;

    .line 57
    .line 58
    return-void
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


# virtual methods
.method public addCycleValues(Ljava/util/HashMap;)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroidx/constraintlayout/core/motion/utils/KeyCycleOscillator;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_6

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "CUSTOM"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    const/4 v4, 0x7

    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v5, v0, Landroidx/constraintlayout/core/motion/key/MotionKey;->mCustom:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v14, v4

    .line 45
    check-cast v14, Landroidx/constraintlayout/core/motion/CustomVariable;

    .line 46
    .line 47
    if-eqz v14, :cond_0

    .line 48
    .line 49
    invoke-virtual {v14}, Landroidx/constraintlayout/core/motion/CustomVariable;->getType()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/16 v5, 0x385

    .line 54
    .line 55
    if-eq v4, v5, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    move-object v5, v3

    .line 63
    check-cast v5, Landroidx/constraintlayout/core/motion/utils/KeyCycleOscillator;

    .line 64
    .line 65
    if-nez v5, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget v6, v0, Landroidx/constraintlayout/core/motion/key/MotionKey;->mFramePosition:I

    .line 69
    .line 70
    iget v7, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveShape:I

    .line 71
    .line 72
    iget-object v8, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mCustomWaveShape:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v9, -0x1

    .line 75
    iget v10, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePeriod:F

    .line 76
    .line 77
    iget v11, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveOffset:F

    .line 78
    .line 79
    iget v12, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePhase:F

    .line 80
    .line 81
    invoke-virtual {v14}, Landroidx/constraintlayout/core/motion/CustomVariable;->getValueToInterpolate()F

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    invoke-virtual/range {v5 .. v14}, Landroidx/constraintlayout/core/motion/utils/KeyCycleOscillator;->setPoint(IILjava/lang/String;IFFFFLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->getValue(Ljava/lang/String;)F

    .line 90
    .line 91
    .line 92
    move-result v23

    .line 93
    invoke-static/range {v23 .. v23}, Ljava/lang/Float;->isNaN(F)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-object v15, v3

    .line 105
    check-cast v15, Landroidx/constraintlayout/core/motion/utils/KeyCycleOscillator;

    .line 106
    .line 107
    if-nez v15, :cond_5

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    iget v3, v0, Landroidx/constraintlayout/core/motion/key/MotionKey;->mFramePosition:I

    .line 111
    .line 112
    iget v4, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveShape:I

    .line 113
    .line 114
    iget-object v5, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mCustomWaveShape:Ljava/lang/String;

    .line 115
    .line 116
    const/16 v19, -0x1

    .line 117
    .line 118
    iget v6, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePeriod:F

    .line 119
    .line 120
    iget v7, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveOffset:F

    .line 121
    .line 122
    iget v8, v0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePhase:F

    .line 123
    .line 124
    move/from16 v16, v3

    .line 125
    .line 126
    move/from16 v17, v4

    .line 127
    .line 128
    move-object/from16 v18, v5

    .line 129
    .line 130
    move/from16 v20, v6

    .line 131
    .line 132
    move/from16 v21, v7

    .line 133
    .line 134
    move/from16 v22, v8

    .line 135
    .line 136
    invoke-virtual/range {v15 .. v23}, Landroidx/constraintlayout/core/motion/utils/KeyCycleOscillator;->setPoint(IILjava/lang/String;IFFFF)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_6
    return-void
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
.end method

.method public addValues(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroidx/constraintlayout/core/motion/utils/SplineSet;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public clone()Landroidx/constraintlayout/core/motion/key/MotionKey;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->clone()Landroidx/constraintlayout/core/motion/key/MotionKey;

    move-result-object v0

    return-object v0
.end method

.method public dump()V
    .locals 3

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MotionKeyCycle{mWaveShape="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveShape:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", mWavePeriod="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePeriod:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", mWaveOffset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveOffset:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", mWavePhase="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePhase:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", mRotation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotation:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public getAttributeNames(Ljava/util/HashSet;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mAlpha:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "alpha"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mElevation:F

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const-string v0, "elevation"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotation:F

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    const-string v0, "rotationZ"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_2
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotationX:F

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    const-string v0, "rotationX"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_3
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotationY:F

    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    const-string v0, "rotationY"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_4
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mScaleX:F

    .line 67
    .line 68
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    const-string v0, "scaleX"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :cond_5
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mScaleY:F

    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_6

    .line 86
    .line 87
    const-string v0, "scaleY"

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :cond_6
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTransitionPathRotate:F

    .line 93
    .line 94
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_7

    .line 99
    .line 100
    const-string v0, "pathRotate"

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_7
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationX:F

    .line 106
    .line 107
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_8

    .line 112
    .line 113
    const-string/jumbo v0, "translationX"

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_8
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationY:F

    .line 120
    .line 121
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_9

    .line 126
    .line 127
    const-string/jumbo v0, "translationY"

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    :cond_9
    iget v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationZ:F

    .line 134
    .line 135
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_a

    .line 140
    .line 141
    const-string/jumbo v0, "translationZ"

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    :cond_a
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKey;->mCustom:Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-lez v0, :cond_b

    .line 154
    .line 155
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/key/MotionKey;->mCustom:Ljava/util/HashMap;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_b

    .line 170
    .line 171
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Ljava/lang/String;

    .line 176
    .line 177
    new-instance v2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v3, "CUSTOM,"

    .line 183
    .line 184
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_b
    return-void
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
.end method

.method public getId(Ljava/lang/String;)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    :goto_0
    move p1, v1

    goto/16 :goto_1

    :sswitch_0
    const-string/jumbo v0, "visibility"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0x14

    goto/16 :goto_1

    :sswitch_1
    const-string/jumbo v0, "waveShape"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0x13

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "pathRotate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/16 p1, 0x12

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "curveFit"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/16 p1, 0x11

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "phase"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/16 p1, 0x10

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "alpha"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/16 p1, 0xf

    goto/16 :goto_1

    :sswitch_6
    const-string v0, "scaleY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/16 p1, 0xe

    goto/16 :goto_1

    :sswitch_7
    const-string v0, "scaleX"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/16 p1, 0xd

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "pivotY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/16 p1, 0xc

    goto/16 :goto_1

    :sswitch_9
    const-string v0, "pivotX"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 p1, 0xb

    goto/16 :goto_1

    :sswitch_a
    const-string v0, "period"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 p1, 0xa

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "progress"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 p1, 0x9

    goto/16 :goto_1

    :sswitch_c
    const-string v0, "offset"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 p1, 0x8

    goto/16 :goto_1

    :sswitch_d
    const-string/jumbo v0, "translationZ"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    const/4 p1, 0x7

    goto :goto_1

    :sswitch_e
    const-string/jumbo v0, "translationY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_0

    :cond_e
    const/4 p1, 0x6

    goto :goto_1

    :sswitch_f
    const-string/jumbo v0, "translationX"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_0

    :cond_f
    const/4 p1, 0x5

    goto :goto_1

    :sswitch_10
    const-string v0, "rotationZ"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_0

    :cond_10
    const/4 p1, 0x4

    goto :goto_1

    :sswitch_11
    const-string v0, "rotationY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto/16 :goto_0

    :cond_11
    const/4 p1, 0x3

    goto :goto_1

    :sswitch_12
    const-string v0, "rotationX"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto/16 :goto_0

    :cond_12
    const/4 p1, 0x2

    goto :goto_1

    :sswitch_13
    const-string v0, "easing"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto/16 :goto_0

    :cond_13
    const/4 p1, 0x1

    goto :goto_1

    :sswitch_14
    const-string v0, "customWave"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto/16 :goto_0

    :cond_14
    const/4 p1, 0x0

    :goto_1
    packed-switch p1, :pswitch_data_0

    return v1

    :pswitch_0
    const/16 p1, 0x192

    return p1

    :pswitch_1
    const/16 p1, 0x1a5

    return p1

    :pswitch_2
    const/16 p1, 0x1a0

    return p1

    :pswitch_3
    const/16 p1, 0x191

    return p1

    :pswitch_4
    const/16 p1, 0x1a9

    return p1

    :pswitch_5
    const/16 p1, 0x193

    return p1

    :pswitch_6
    const/16 p1, 0x138

    return p1

    :pswitch_7
    const/16 p1, 0x137

    return p1

    :pswitch_8
    const/16 p1, 0x13a

    return p1

    :pswitch_9
    const/16 p1, 0x139

    return p1

    :pswitch_a
    const/16 p1, 0x1a7

    return p1

    :pswitch_b
    const/16 p1, 0x13b

    return p1

    :pswitch_c
    const/16 p1, 0x1a8

    return p1

    :pswitch_d
    const/16 p1, 0x132

    return p1

    :pswitch_e
    const/16 p1, 0x131

    return p1

    :pswitch_f
    const/16 p1, 0x130

    return p1

    :pswitch_10
    const/16 p1, 0x136

    return p1

    :pswitch_11
    const/16 p1, 0x135

    return p1

    :pswitch_12
    const/16 p1, 0x134

    return p1

    :pswitch_13
    const/16 p1, 0x1a4

    return p1

    :pswitch_14
    const/16 p1, 0x1a6

    return p1

    :sswitch_data_0
    .sparse-switch
        -0x5e458df6 -> :sswitch_14
        -0x4e19c2d5 -> :sswitch_13
        -0x4a771f66 -> :sswitch_12
        -0x4a771f65 -> :sswitch_11
        -0x4a771f64 -> :sswitch_10
        -0x490b9c39 -> :sswitch_f
        -0x490b9c38 -> :sswitch_e
        -0x490b9c37 -> :sswitch_d
        -0x3cc89b6d -> :sswitch_c
        -0x3bab3dd3 -> :sswitch_b
        -0x3b1c8a3f -> :sswitch_a
        -0x3ae243aa -> :sswitch_9
        -0x3ae243a9 -> :sswitch_8
        -0x3621dfb2 -> :sswitch_7
        -0x3621dfb1 -> :sswitch_6
        0x589b15e -> :sswitch_5
        0x65b097b -> :sswitch_4
        0x2283b8a2 -> :sswitch_3
        0x2fdfbde0 -> :sswitch_2
        0x5b5cc028 -> :sswitch_1
        0x73b66312 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getValue(Ljava/lang/String;)F
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto/16 :goto_0

    .line 13
    .line 14
    :sswitch_0
    const-string v0, "pathRotate"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_0
    const/16 v1, 0xd

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :sswitch_1
    const-string v0, "phase"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_1
    const/16 v1, 0xc

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :sswitch_2
    const-string v0, "alpha"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_2
    const/16 v1, 0xb

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :sswitch_3
    const-string v0, "elevation"

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :cond_3
    const/16 v1, 0xa

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :sswitch_4
    const-string v0, "scaleY"

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_4
    const/16 v1, 0x9

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :sswitch_5
    const-string v0, "scaleX"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_5
    const/16 v1, 0x8

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :sswitch_6
    const-string v0, "progress"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_6

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_6
    const/4 v1, 0x7

    .line 108
    goto :goto_0

    .line 109
    :sswitch_7
    const-string v0, "offset"

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_7

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_7
    const/4 v1, 0x6

    .line 119
    goto :goto_0

    .line 120
    :sswitch_8
    const-string/jumbo v0, "translationZ"

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_8

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_8
    const/4 v1, 0x5

    .line 131
    goto :goto_0

    .line 132
    :sswitch_9
    const-string/jumbo v0, "translationY"

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_9

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_9
    const/4 v1, 0x4

    .line 143
    goto :goto_0

    .line 144
    :sswitch_a
    const-string/jumbo v0, "translationX"

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-nez p1, :cond_a

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_a
    const/4 v1, 0x3

    .line 155
    goto :goto_0

    .line 156
    :sswitch_b
    const-string v0, "rotationZ"

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_b

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_b
    const/4 v1, 0x2

    .line 166
    goto :goto_0

    .line 167
    :sswitch_c
    const-string v0, "rotationY"

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-nez p1, :cond_c

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_c
    const/4 v1, 0x1

    .line 177
    goto :goto_0

    .line 178
    :sswitch_d
    const-string v0, "rotationX"

    .line 179
    .line 180
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-nez p1, :cond_d

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_d
    const/4 v1, 0x0

    .line 188
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 189
    .line 190
    .line 191
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 192
    .line 193
    return p1

    .line 194
    :pswitch_0
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTransitionPathRotate:F

    .line 195
    .line 196
    return p1

    .line 197
    :pswitch_1
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePhase:F

    .line 198
    .line 199
    return p1

    .line 200
    :pswitch_2
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mAlpha:F

    .line 201
    .line 202
    return p1

    .line 203
    :pswitch_3
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mElevation:F

    .line 204
    .line 205
    return p1

    .line 206
    :pswitch_4
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mScaleY:F

    .line 207
    .line 208
    return p1

    .line 209
    :pswitch_5
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mScaleX:F

    .line 210
    .line 211
    return p1

    .line 212
    :pswitch_6
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mProgress:F

    .line 213
    .line 214
    return p1

    .line 215
    :pswitch_7
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveOffset:F

    .line 216
    .line 217
    return p1

    .line 218
    :pswitch_8
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationZ:F

    .line 219
    .line 220
    return p1

    .line 221
    :pswitch_9
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationY:F

    .line 222
    .line 223
    return p1

    .line 224
    :pswitch_a
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationX:F

    .line 225
    .line 226
    return p1

    .line 227
    :pswitch_b
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotation:F

    .line 228
    .line 229
    return p1

    .line 230
    :pswitch_c
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotationY:F

    .line 231
    .line 232
    return p1

    .line 233
    :pswitch_d
    iget p1, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotationX:F

    .line 234
    .line 235
    return p1

    .line 236
    nop

    .line 237
    :sswitch_data_0
    .sparse-switch
        -0x4a771f66 -> :sswitch_d
        -0x4a771f65 -> :sswitch_c
        -0x4a771f64 -> :sswitch_b
        -0x490b9c39 -> :sswitch_a
        -0x490b9c38 -> :sswitch_9
        -0x490b9c37 -> :sswitch_8
        -0x3cc89b6d -> :sswitch_7
        -0x3bab3dd3 -> :sswitch_6
        -0x3621dfb2 -> :sswitch_5
        -0x3621dfb1 -> :sswitch_4
        -0x42d1a3 -> :sswitch_3
        0x589b15e -> :sswitch_2
        0x65b097b -> :sswitch_1
        0x2fdfbde0 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public printAttributes()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->getAttributeNames(Ljava/util/HashSet;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, " ------------- "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKey;->mFramePosition:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " -------------"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Landroidx/constraintlayout/core/motion/utils/Utils;->log(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "MotionKeyCycle{Shape="

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveShape:I

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v2, ", Period="

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePeriod:F

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, ", Offset="

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveOffset:F

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v2, ", Phase="

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget v2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePhase:F

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 v2, 0x7d

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Landroidx/constraintlayout/core/motion/utils/Utils;->log(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    new-array v2, v1, [Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, [Ljava/lang/String;

    .line 101
    .line 102
    :goto_0
    array-length v2, v0

    .line 103
    if-ge v1, v2, :cond_0

    .line 104
    .line 105
    aget-object v2, v0, v1

    .line 106
    .line 107
    invoke-static {v2}, Landroidx/constraintlayout/core/motion/utils/TypedValues$AttributesType;->getId(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    aget-object v3, v0, v1

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v3, ":"

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    aget-object v3, v0, v1

    .line 126
    .line 127
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->getValue(Ljava/lang/String;)F

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v2}, Landroidx/constraintlayout/core/motion/utils/Utils;->log(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    add-int/lit8 v1, v1, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_0
    return-void
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

.method public setValue(IF)Z
    .locals 1

    const/16 v0, 0x13b

    if-eq p1, v0, :cond_2

    const/16 v0, 0x193

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1a0

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    .line 8
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/core/motion/key/MotionKey;->setValue(IF)Z

    move-result p1

    return p1

    .line 9
    :pswitch_0
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePhase:F

    goto :goto_0

    .line 10
    :pswitch_1
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveOffset:F

    goto :goto_0

    .line 11
    :pswitch_2
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWavePeriod:F

    goto :goto_0

    .line 12
    :pswitch_3
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mScaleY:F

    goto :goto_0

    .line 13
    :pswitch_4
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mScaleX:F

    goto :goto_0

    .line 14
    :pswitch_5
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotation:F

    goto :goto_0

    .line 15
    :pswitch_6
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotationY:F

    goto :goto_0

    .line 16
    :pswitch_7
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mRotationX:F

    goto :goto_0

    .line 17
    :pswitch_8
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mElevation:F

    goto :goto_0

    .line 18
    :pswitch_9
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationZ:F

    goto :goto_0

    .line 19
    :pswitch_a
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationY:F

    goto :goto_0

    .line 20
    :pswitch_b
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTranslationX:F

    goto :goto_0

    .line 21
    :cond_0
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTransitionPathRotate:F

    goto :goto_0

    .line 22
    :cond_1
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mAlpha:F

    goto :goto_0

    .line 23
    :cond_2
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mProgress:F

    :goto_0
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x130
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1a7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setValue(II)Z
    .locals 2

    const/16 v0, 0x191

    const/4 v1, 0x1

    if-eq p1, v0, :cond_2

    const/16 v0, 0x1a5

    if-eq p1, v0, :cond_1

    int-to-float v0, p2

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->setValue(IF)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/core/motion/key/MotionKey;->setValue(II)Z

    move-result p1

    return p1

    .line 3
    :cond_1
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mWaveShape:I

    return v1

    .line 4
    :cond_2
    iput p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mCurveFit:I

    return v1
.end method

.method public setValue(ILjava/lang/String;)Z
    .locals 2

    const/16 v0, 0x1a4

    const/4 v1, 0x1

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1a6

    if-eq p1, v0, :cond_0

    .line 5
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/core/motion/key/MotionKey;->setValue(ILjava/lang/String;)Z

    move-result p1

    return p1

    .line 6
    :cond_0
    iput-object p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mCustomWaveShape:Ljava/lang/String;

    return v1

    .line 7
    :cond_1
    iput-object p2, p0, Landroidx/constraintlayout/core/motion/key/MotionKeyCycle;->mTransitionEasing:Ljava/lang/String;

    return v1
.end method
