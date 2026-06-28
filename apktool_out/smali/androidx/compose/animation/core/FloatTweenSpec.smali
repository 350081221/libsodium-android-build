.class public final Landroidx/compose/animation/core/FloatTweenSpec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/animation/core/FloatAnimationSpec;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0002J \u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/animation/core/FloatTweenSpec;",
        "Landroidx/compose/animation/core/FloatAnimationSpec;",
        "duration",
        "",
        "delay",
        "easing",
        "Landroidx/compose/animation/core/Easing;",
        "(IILandroidx/compose/animation/core/Easing;)V",
        "getDelay",
        "()I",
        "getDuration",
        "clampPlayTime",
        "",
        "playTime",
        "getDurationNanos",
        "initialValue",
        "",
        "targetValue",
        "initialVelocity",
        "getValueFromNanos",
        "playTimeNanos",
        "getVelocityFromNanos",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final delay:I

.field private final duration:I

.field private final easing:Landroidx/compose/animation/core/Easing;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/core/FloatTweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(IILandroidx/compose/animation/core/Easing;)V
    .locals 0
    .param p3    # Landroidx/compose/animation/core/Easing;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    .line 3
    iput p2, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delay:I

    .line 4
    iput-object p3, p0, Landroidx/compose/animation/core/FloatTweenSpec;->easing:Landroidx/compose/animation/core/Easing;

    return-void
.end method

.method public synthetic constructor <init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/16 p1, 0x12c

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 5
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutSlowInEasing()Landroidx/compose/animation/core/Easing;

    move-result-object p3

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/animation/core/FloatTweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;)V

    return-void
.end method

.method private final clampPlayTime(J)J
    .locals 8

    iget v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delay:I

    int-to-long v0, v0

    sub-long v2, p1, v0

    const-wide/16 v4, 0x0

    iget p1, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    int-to-long v6, p1

    invoke-static/range {v2 .. v7}, Lkotlin/ranges/s;->K(JJJ)J

    move-result-wide p1

    return-wide p1
.end method


# virtual methods
.method public final getDelay()I
    .locals 1

    iget v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delay:I

    return v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    return v0
.end method

.method public getDurationNanos(FFF)J
    .locals 2

    iget p1, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delay:I

    iget p2, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    add-int/2addr p1, p2

    int-to-long p1, p1

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method public getValueFromNanos(JFFF)F
    .locals 2

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/compose/animation/core/FloatTweenSpec;->clampPlayTime(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    iget p5, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-nez p5, :cond_0

    .line 14
    .line 15
    move p1, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    long-to-float p1, p1

    .line 18
    int-to-float p2, p5

    .line 19
    div-float/2addr p1, p2

    .line 20
    :goto_0
    iget-object p2, p0, Landroidx/compose/animation/core/FloatTweenSpec;->easing:Landroidx/compose/animation/core/Easing;

    .line 21
    .line 22
    const/4 p5, 0x0

    .line 23
    invoke-static {p1, p5, v0}, Lkotlin/ranges/s;->H(FFF)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-interface {p2, p1}, Landroidx/compose/animation/core/Easing;->transform(F)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-static {p3, p4, p1}, Landroidx/compose/animation/core/VectorConvertersKt;->lerp(FFF)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
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
.end method

.method public getVelocityFromNanos(JFFF)F
    .locals 10

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/compose/animation/core/FloatTweenSpec;->clampPlayTime(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v2, p1, v2

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    if-nez v2, :cond_1

    .line 18
    .line 19
    return p5

    .line 20
    :cond_1
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    sub-long v2, p1, v2

    .line 23
    .line 24
    mul-long v5, v2, v0

    .line 25
    .line 26
    move-object v4, p0

    .line 27
    move v7, p3

    .line 28
    move v8, p4

    .line 29
    move v9, p5

    .line 30
    invoke-virtual/range {v4 .. v9}, Landroidx/compose/animation/core/FloatTweenSpec;->getValueFromNanos(JFFF)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    mul-long v4, p1, v0

    .line 35
    .line 36
    move-object v3, p0

    .line 37
    move v6, p3

    .line 38
    move v7, p4

    .line 39
    move v8, p5

    .line 40
    invoke-virtual/range {v3 .. v8}, Landroidx/compose/animation/core/FloatTweenSpec;->getValueFromNanos(JFFF)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    sub-float/2addr p1, v2

    .line 45
    const/high16 p2, 0x447a0000    # 1000.0f

    .line 46
    .line 47
    mul-float/2addr p1, p2

    .line 48
    return p1
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
.end method
