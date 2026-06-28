.class public final Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000N\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0014\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u001a3\u0010\t\u001a\u00020\u0008*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0012\u0010\u000e\u001a\u00020\u0008*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000c\u001a\u0014\u0010\u000f\u001a\u00020\u0008*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0008*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u001a2\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0011H\u0000\u001a(\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0082\u0008\u001a\u0014\u0010\u001f\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0002\u001a\r\u0010 \u001a\u00020\u0006*\u00020\u0011H\u0082\u0008\u001a*\u0010$\u001a\u000c\u0012\u0008\u0012\u00060\u0011j\u0002`#0\u00002\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0082\u0008\u00a2\u0006\u0004\u0008$\u0010%\u001a.\u0010)\u001a\u00020\u0006*\u000c\u0012\u0004\u0012\u00020\u00110\u0000j\u0002`&2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0082\n\u00a2\u0006\u0004\u0008)\u0010*\u001a6\u0010\t\u001a\u00020\u0008*\u000c\u0012\u0004\u0012\u00020\u00110\u0000j\u0002`&2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0006H\u0082\n\u00a2\u0006\u0004\u0008\t\u0010,\"\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\"\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008/\u0010.\"\u0014\u00100\u001a\u00020\u00028\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00080\u0010.\"\u0014\u00101\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00081\u00102\"1\u0010<\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00198G@GX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u00084\u00105\u0012\u0004\u0008:\u0010;\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109*\u0018\u0008\u0002\u0010$\"\u0008\u0012\u0004\u0012\u00020\u00110\u00002\u0008\u0012\u0004\u0012\u00020\u00110\u0000*\u000c\u0008\u0002\u0010=\"\u00020\u00112\u00020\u0011\u00a8\u0006>"
    }
    d2 = {
        "",
        "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;",
        "",
        "index",
        "",
        "time",
        "",
        "dataPoint",
        "Lkotlin/r2;",
        "set",
        "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V",
        "Landroidx/compose/ui/input/pointer/util/VelocityTracker;",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "event",
        "addPointerInputChange",
        "addPointerInputChangeLegacy",
        "addPointerInputChangeWithFix",
        "",
        "x",
        "y",
        "sampleCount",
        "degree",
        "coefficients",
        "polyFitLeastSquares",
        "dataPoints",
        "",
        "isDataDifferential",
        "calculateImpulseVelocity",
        "kineticEnergy",
        "kineticEnergyToVelocity",
        "a",
        "dot",
        "norm",
        "rows",
        "cols",
        "Landroidx/compose/ui/input/pointer/util/Vector;",
        "Matrix",
        "(II)[[F",
        "Landroidx/compose/ui/input/pointer/util/Matrix;",
        "row",
        "col",
        "get",
        "([[FII)F",
        "value",
        "([[FIIF)V",
        "AssumePointerMoveStoppedMilliseconds",
        "I",
        "HistorySize",
        "HorizonMilliseconds",
        "DefaultWeight",
        "F",
        "<set-?>",
        "VelocityTrackerAddPointsFix$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getVelocityTrackerAddPointsFix",
        "()Z",
        "setVelocityTrackerAddPointsFix",
        "(Z)V",
        "getVelocityTrackerAddPointsFix$annotations",
        "()V",
        "VelocityTrackerAddPointsFix",
        "Vector",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,728:1\n706#1:741\n713#1,2:742\n709#1,6:744\n706#1:750\n706#1:751\n701#1:752\n709#1:753\n709#1:754\n687#1:755\n687#1:756\n33#2,6:729\n33#2,6:735\n81#3:757\n107#3,2:758\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n487#1:741\n489#1:742,2\n491#1:744,6\n498#1:750\n500#1:751\n515#1:752\n557#1:753\n559#1:754\n667#1:755\n677#1:756\n385#1:729,6\n421#1:735,6\n727#1:757\n727#1:758,2\n*E\n"
    }
.end annotation


# static fields
.field private static final AssumePointerMoveStoppedMilliseconds:I = 0x28

.field private static final DefaultWeight:F = 1.0f

.field private static final HistorySize:I = 0x14

.field private static final HorizonMilliseconds:I = 0x64

.field private static final VelocityTrackerAddPointsFix$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerAddPointsFix$delegate:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method private static final Matrix(II)[[F
    .locals 3

    new-array v0, p0, [[F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    new-array v2, p1, [F

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final synthetic access$calculateImpulseVelocity([F[FIZ)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->calculateImpulseVelocity([F[FIZ)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V

    return-void
.end method

.method public static final addPointerInputChange(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 1
    .param p0    # Landroidx/compose/ui/input/pointer/util/VelocityTracker;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->getVelocityTrackerAddPointsFix()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->addPointerInputChangeWithFix(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->addPointerInputChangeLegacy(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V

    .line 12
    .line 13
    .line 14
    :goto_0
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
.end method

.method private static final addPointerInputChangeLegacy(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 10

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToDownIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->resetTracking()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getHistorical()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x0

    .line 30
    :goto_0
    if-ge v4, v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Landroidx/compose/ui/input/pointer/HistoricalChange;

    .line 37
    .line 38
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getPosition-F1C5BW0()J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    invoke-static {v6, v7, v0, v1}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getPosition-F1C5BW0()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    .line 51
    .line 52
    .line 53
    move-result-wide v8

    .line 54
    invoke-static {v8, v9, v0, v1}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getUptimeMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    .line 66
    .line 67
    .line 68
    move-result-wide v8

    .line 69
    invoke-virtual {p0, v0, v1, v8, v9}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    move-wide v0, v6

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 104
    .line 105
    .line 106
    return-void
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
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method

.method private static final addPointerInputChangeWithFix(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 8

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToDownIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->resetTracking()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getHistorical()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Landroidx/compose/ui/input/pointer/HistoricalChange;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getUptimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getOriginalEventPosition-F1C5BW0$ui_release()J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    invoke-virtual {p0, v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getOriginalEventPosition-F1C5BW0$ui_release()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getLastMoveEventTimeStamp$ui_release()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    sub-long/2addr v0, v2

    .line 73
    const-wide/16 v2, 0x28

    .line 74
    .line 75
    cmp-long v0, v0, v2

    .line 76
    .line 77
    if-lez v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->resetTracking()V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setLastMoveEventTimeStamp$ui_release(J)V

    .line 87
    .line 88
    .line 89
    return-void
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
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method

.method private static final calculateImpulseVelocity([F[FIZ)F
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    if-ge p2, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne p2, v1, :cond_4

    .line 9
    .line 10
    aget p2, p1, v2

    .line 11
    .line 12
    aget p1, p1, v3

    .line 13
    .line 14
    cmpg-float v1, p2, p1

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    move v1, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v1, v2

    .line 21
    :goto_0
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    if-eqz p3, :cond_3

    .line 25
    .line 26
    aget p0, p0, v2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    aget p3, p0, v2

    .line 30
    .line 31
    aget p0, p0, v3

    .line 32
    .line 33
    sub-float p0, p3, p0

    .line 34
    .line 35
    :goto_1
    sub-float/2addr p2, p1

    .line 36
    div-float/2addr p0, p2

    .line 37
    return p0

    .line 38
    :cond_4
    sub-int/2addr p2, v3

    .line 39
    move v4, p2

    .line 40
    :goto_2
    if-lez v4, :cond_9

    .line 41
    .line 42
    aget v5, p1, v4

    .line 43
    .line 44
    add-int/lit8 v6, v4, -0x1

    .line 45
    .line 46
    aget v7, p1, v6

    .line 47
    .line 48
    cmpg-float v5, v5, v7

    .line 49
    .line 50
    if-nez v5, :cond_5

    .line 51
    .line 52
    move v5, v3

    .line 53
    goto :goto_3

    .line 54
    :cond_5
    move v5, v2

    .line 55
    :goto_3
    if-eqz v5, :cond_6

    .line 56
    .line 57
    goto :goto_5

    .line 58
    :cond_6
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    int-to-float v7, v1

    .line 63
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    mul-float/2addr v7, v8

    .line 68
    float-to-double v7, v7

    .line 69
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 70
    .line 71
    .line 72
    move-result-wide v7

    .line 73
    double-to-float v7, v7

    .line 74
    mul-float/2addr v5, v7

    .line 75
    if-eqz p3, :cond_7

    .line 76
    .line 77
    aget v7, p0, v6

    .line 78
    .line 79
    neg-float v7, v7

    .line 80
    goto :goto_4

    .line 81
    :cond_7
    aget v7, p0, v4

    .line 82
    .line 83
    aget v8, p0, v6

    .line 84
    .line 85
    sub-float/2addr v7, v8

    .line 86
    :goto_4
    aget v8, p1, v4

    .line 87
    .line 88
    aget v6, p1, v6

    .line 89
    .line 90
    sub-float/2addr v8, v6

    .line 91
    div-float/2addr v7, v8

    .line 92
    sub-float v5, v7, v5

    .line 93
    .line 94
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    mul-float/2addr v5, v6

    .line 99
    add-float/2addr v0, v5

    .line 100
    if-ne v4, p2, :cond_8

    .line 101
    .line 102
    const/high16 v5, 0x3f000000    # 0.5f

    .line 103
    .line 104
    mul-float/2addr v0, v5

    .line 105
    :cond_8
    :goto_5
    add-int/lit8 v4, v4, -0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_9
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    int-to-float p1, v1

    .line 113
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    mul-float/2addr p1, p2

    .line 118
    float-to-double p1, p1

    .line 119
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 120
    .line 121
    .line 122
    move-result-wide p1

    .line 123
    double-to-float p1, p1

    .line 124
    mul-float/2addr p0, p1

    .line 125
    return p0
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
.end method

.method private static final dot([F[F)F
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    aget v4, p1, v2

    .line 9
    .line 10
    mul-float/2addr v3, v4

    .line 11
    add-float/2addr v1, v3

    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return v1
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
.end method

.method private static final get([[FII)F
    .locals 0

    aget-object p0, p0, p1

    aget p0, p0, p2

    return p0
.end method

.method public static final getVelocityTrackerAddPointsFix()Z
    .locals 1
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerAddPointsFix$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public static synthetic getVelocityTrackerAddPointsFix$annotations()V
    .locals 0
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    return-void
.end method

.method private static final kineticEnergyToVelocity(F)F
    .locals 3

    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    mul-float/2addr v1, p0

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float p0, v1

    mul-float/2addr v0, p0

    return v0
.end method

.method private static final norm([F)F
    .locals 2

    invoke-static {p0, p0}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    move-result p0

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final polyFitLeastSquares([F[FII[F)[F
    .locals 16
    .param p0    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # [F
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v1, v2, :cond_11

    .line 7
    .line 8
    if-eqz v0, :cond_10

    .line 9
    .line 10
    if-lt v1, v0, :cond_0

    .line 11
    .line 12
    add-int/lit8 v1, v0, -0x1

    .line 13
    .line 14
    :cond_0
    add-int/2addr v1, v2

    .line 15
    new-array v3, v1, [[F

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    move v5, v4

    .line 19
    :goto_0
    if-ge v5, v1, :cond_1

    .line 20
    .line 21
    new-array v6, v0, [F

    .line 22
    .line 23
    aput-object v6, v3, v5

    .line 24
    .line 25
    add-int/lit8 v5, v5, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v5, v4

    .line 29
    :goto_1
    const/high16 v6, 0x3f800000    # 1.0f

    .line 30
    .line 31
    if-ge v5, v0, :cond_3

    .line 32
    .line 33
    aget-object v7, v3, v4

    .line 34
    .line 35
    aput v6, v7, v5

    .line 36
    .line 37
    move v6, v2

    .line 38
    :goto_2
    if-ge v6, v1, :cond_2

    .line 39
    .line 40
    add-int/lit8 v7, v6, -0x1

    .line 41
    .line 42
    aget-object v7, v3, v7

    .line 43
    .line 44
    aget v7, v7, v5

    .line 45
    .line 46
    aget v8, p0, v5

    .line 47
    .line 48
    mul-float/2addr v7, v8

    .line 49
    aget-object v8, v3, v6

    .line 50
    .line 51
    aput v7, v8, v5

    .line 52
    .line 53
    add-int/lit8 v6, v6, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    new-array v5, v1, [[F

    .line 60
    .line 61
    move v7, v4

    .line 62
    :goto_3
    if-ge v7, v1, :cond_4

    .line 63
    .line 64
    new-array v8, v0, [F

    .line 65
    .line 66
    aput-object v8, v5, v7

    .line 67
    .line 68
    add-int/lit8 v7, v7, 0x1

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    new-array v7, v1, [[F

    .line 72
    .line 73
    move v8, v4

    .line 74
    :goto_4
    if-ge v8, v1, :cond_5

    .line 75
    .line 76
    new-array v9, v1, [F

    .line 77
    .line 78
    aput-object v9, v7, v8

    .line 79
    .line 80
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_5
    move v8, v4

    .line 84
    :goto_5
    if-ge v8, v1, :cond_d

    .line 85
    .line 86
    aget-object v9, v5, v8

    .line 87
    .line 88
    aget-object v10, v3, v8

    .line 89
    .line 90
    move v11, v4

    .line 91
    :goto_6
    if-ge v11, v0, :cond_6

    .line 92
    .line 93
    aget v12, v10, v11

    .line 94
    .line 95
    aput v12, v9, v11

    .line 96
    .line 97
    add-int/lit8 v11, v11, 0x1

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_6
    move v10, v4

    .line 101
    :goto_7
    if-ge v10, v8, :cond_8

    .line 102
    .line 103
    aget-object v11, v5, v10

    .line 104
    .line 105
    invoke-static {v9, v11}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    move v13, v4

    .line 110
    :goto_8
    if-ge v13, v0, :cond_7

    .line 111
    .line 112
    aget v14, v9, v13

    .line 113
    .line 114
    aget v15, v11, v13

    .line 115
    .line 116
    mul-float/2addr v15, v12

    .line 117
    sub-float/2addr v14, v15

    .line 118
    aput v14, v9, v13

    .line 119
    .line 120
    add-int/lit8 v13, v13, 0x1

    .line 121
    .line 122
    goto :goto_8

    .line 123
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_8
    invoke-static {v9, v9}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    float-to-double v10, v10

    .line 131
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v10

    .line 135
    double-to-float v10, v10

    .line 136
    const v11, 0x358637bd    # 1.0E-6f

    .line 137
    .line 138
    .line 139
    cmpg-float v11, v10, v11

    .line 140
    .line 141
    if-ltz v11, :cond_c

    .line 142
    .line 143
    div-float v10, v6, v10

    .line 144
    .line 145
    move v11, v4

    .line 146
    :goto_9
    if-ge v11, v0, :cond_9

    .line 147
    .line 148
    aget v12, v9, v11

    .line 149
    .line 150
    mul-float/2addr v12, v10

    .line 151
    aput v12, v9, v11

    .line 152
    .line 153
    add-int/lit8 v11, v11, 0x1

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_9
    aget-object v10, v7, v8

    .line 157
    .line 158
    move v11, v4

    .line 159
    :goto_a
    if-ge v11, v1, :cond_b

    .line 160
    .line 161
    if-ge v11, v8, :cond_a

    .line 162
    .line 163
    const/4 v12, 0x0

    .line 164
    goto :goto_b

    .line 165
    :cond_a
    aget-object v12, v3, v11

    .line 166
    .line 167
    invoke-static {v9, v12}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    :goto_b
    aput v12, v10, v11

    .line 172
    .line 173
    add-int/lit8 v11, v11, 0x1

    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    const-string v1, "Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means"

    .line 182
    .line 183
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_d
    sub-int/2addr v1, v2

    .line 188
    move v0, v1

    .line 189
    :goto_c
    const/4 v2, -0x1

    .line 190
    if-ge v2, v0, :cond_f

    .line 191
    .line 192
    aget-object v2, v5, v0

    .line 193
    .line 194
    move-object/from16 v3, p1

    .line 195
    .line 196
    invoke-static {v2, v3}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->dot([F[F)F

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    aput v2, p4, v0

    .line 201
    .line 202
    add-int/lit8 v2, v0, 0x1

    .line 203
    .line 204
    if-gt v2, v1, :cond_e

    .line 205
    .line 206
    move v4, v1

    .line 207
    :goto_d
    aget v6, p4, v0

    .line 208
    .line 209
    aget-object v8, v7, v0

    .line 210
    .line 211
    aget v8, v8, v4

    .line 212
    .line 213
    aget v9, p4, v4

    .line 214
    .line 215
    mul-float/2addr v8, v9

    .line 216
    sub-float/2addr v6, v8

    .line 217
    aput v6, p4, v0

    .line 218
    .line 219
    if-eq v4, v2, :cond_e

    .line 220
    .line 221
    add-int/lit8 v4, v4, -0x1

    .line 222
    .line 223
    goto :goto_d

    .line 224
    :cond_e
    aget v2, p4, v0

    .line 225
    .line 226
    aget-object v4, v7, v0

    .line 227
    .line 228
    aget v4, v4, v0

    .line 229
    .line 230
    div-float/2addr v2, v4

    .line 231
    aput v2, p4, v0

    .line 232
    .line 233
    add-int/lit8 v0, v0, -0x1

    .line 234
    .line 235
    goto :goto_c

    .line 236
    :cond_f
    return-object p4

    .line 237
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 238
    .line 239
    const-string v1, "At least one point must be provided"

    .line 240
    .line 241
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v0

    .line 245
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 246
    .line 247
    const-string v1, "The degree must be at positive integer"

    .line 248
    .line 249
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v0
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
.end method

.method public static synthetic polyFitLeastSquares$default([F[FII[FILjava/lang/Object;)[F
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x10

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    add-int/lit8 p4, p3, 0x1

    .line 6
    .line 7
    const/4 p5, 0x0

    .line 8
    invoke-static {p4, p5}, Lkotlin/ranges/s;->u(II)I

    .line 9
    .line 10
    .line 11
    move-result p4

    .line 12
    new-array p4, p4, [F

    .line 13
    .line 14
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->polyFitLeastSquares([F[FII[F)[F

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
.end method

.method private static final set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V
    .locals 1

    .line 1
    aget-object v0, p0, p1

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;

    invoke-direct {v0, p2, p3, p4}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;-><init>(JF)V

    aput-object v0, p0, p1

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p2, p3}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;->setTime(J)V

    .line 4
    invoke-virtual {v0, p4}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;->setDataPoint(F)V

    :goto_0
    return-void
.end method

.method private static final set([[FIIF)V
    .locals 0

    .line 5
    aget-object p0, p0, p1

    aput p3, p0, p2

    return-void
.end method

.method public static final setVelocityTrackerAddPointsFix(Z)V
    .locals 1
    .annotation build Landroidx/compose/ui/ExperimentalComposeUiApi;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->VelocityTrackerAddPointsFix$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
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
.end method
