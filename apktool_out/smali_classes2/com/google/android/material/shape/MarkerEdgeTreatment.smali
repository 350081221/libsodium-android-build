.class public final Lcom/google/android/material/shape/MarkerEdgeTreatment;
.super Lcom/google/android/material/shape/EdgeTreatment;
.source "SourceFile"


# instance fields
.field private final radius:F


# direct methods
.method public constructor <init>(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/shape/EdgeTreatment;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x3a83126f    # 0.001f

    .line 5
    .line 6
    .line 7
    sub-float/2addr p1, v0

    .line 8
    iput p1, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

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
.end method


# virtual methods
.method forceIntersection()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getEdgePath(FFFLcom/google/android/material/shape/ShapePath;)V
    .locals 8
    .param p4    # Lcom/google/android/material/shape/ShapePath;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget p1, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

    .line 2
    .line 3
    float-to-double v0, p1

    .line 4
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 5
    .line 6
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v4

    .line 10
    mul-double/2addr v0, v4

    .line 11
    div-double/2addr v0, v2

    .line 12
    double-to-float p1, v0

    .line 13
    iget p3, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

    .line 14
    .line 15
    float-to-double v0, p3

    .line 16
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    float-to-double v4, p1

    .line 21
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    sub-double/2addr v0, v4

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    double-to-float p3, v0

    .line 31
    sub-float v0, p2, p1

    .line 32
    .line 33
    iget v1, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

    .line 34
    .line 35
    float-to-double v4, v1

    .line 36
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    mul-double/2addr v4, v6

    .line 41
    iget v1, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

    .line 42
    .line 43
    float-to-double v6, v1

    .line 44
    sub-double/2addr v4, v6

    .line 45
    neg-double v4, v4

    .line 46
    double-to-float v1, v4

    .line 47
    add-float/2addr v1, p3

    .line 48
    invoke-virtual {p4, v0, v1}, Lcom/google/android/material/shape/ShapePath;->reset(FF)V

    .line 49
    .line 50
    .line 51
    iget v0, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

    .line 52
    .line 53
    float-to-double v0, v0

    .line 54
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    mul-double/2addr v0, v4

    .line 59
    iget v4, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

    .line 60
    .line 61
    float-to-double v4, v4

    .line 62
    sub-double/2addr v0, v4

    .line 63
    neg-double v0, v0

    .line 64
    double-to-float v0, v0

    .line 65
    invoke-virtual {p4, p2, v0}, Lcom/google/android/material/shape/ShapePath;->lineTo(FF)V

    .line 66
    .line 67
    .line 68
    add-float/2addr p2, p1

    .line 69
    iget p1, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

    .line 70
    .line 71
    float-to-double v0, p1

    .line 72
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    mul-double/2addr v0, v2

    .line 77
    iget p1, p0, Lcom/google/android/material/shape/MarkerEdgeTreatment;->radius:F

    .line 78
    .line 79
    float-to-double v2, p1

    .line 80
    sub-double/2addr v0, v2

    .line 81
    neg-double v0, v0

    .line 82
    double-to-float p1, v0

    .line 83
    add-float/2addr p1, p3

    .line 84
    invoke-virtual {p4, p2, p1}, Lcom/google/android/material/shape/ShapePath;->lineTo(FF)V

    .line 85
    .line 86
    .line 87
    return-void
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
