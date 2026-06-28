.class public Lorg/osmdroid/views/overlay/advancedpolyline/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(FFF)I
    .locals 3

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    mul-float v1, p2, v0

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    sub-float/2addr v1, v2

    .line 8
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-float v1, v2, v1

    .line 13
    .line 14
    mul-float/2addr v1, p1

    .line 15
    const/high16 p1, 0x3f000000    # 0.5f

    .line 16
    .line 17
    mul-float/2addr p1, v1

    .line 18
    sub-float/2addr p2, p1

    .line 19
    const/high16 p1, 0x42700000    # 60.0f

    .line 20
    .line 21
    div-float p1, p0, p1

    .line 22
    .line 23
    rem-float/2addr p1, v0

    .line 24
    sub-float/2addr p1, v2

    .line 25
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    sub-float/2addr v2, p1

    .line 30
    mul-float/2addr v2, v1

    .line 31
    float-to-int p0, p0

    .line 32
    div-int/lit8 p0, p0, 0x3c

    .line 33
    .line 34
    const/high16 p1, 0x437f0000    # 255.0f

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    packed-switch p0, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    move p0, v0

    .line 41
    move p1, p0

    .line 42
    move v1, p1

    .line 43
    goto :goto_1

    .line 44
    :pswitch_0
    add-float/2addr v1, p2

    .line 45
    mul-float/2addr v1, p1

    .line 46
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    mul-float v1, p2, p1

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-float/2addr v2, p2

    .line 57
    mul-float/2addr v2, p1

    .line 58
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    goto :goto_1

    .line 63
    :pswitch_1
    add-float/2addr v2, p2

    .line 64
    mul-float/2addr v2, p1

    .line 65
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    mul-float v2, p2, p1

    .line 70
    .line 71
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    add-float/2addr v1, p2

    .line 76
    mul-float/2addr v1, p1

    .line 77
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    goto :goto_0

    .line 82
    :pswitch_2
    mul-float p0, p2, p1

    .line 83
    .line 84
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-float/2addr v2, p2

    .line 89
    mul-float/2addr v2, p1

    .line 90
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    add-float/2addr v1, p2

    .line 95
    mul-float/2addr v1, p1

    .line 96
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :goto_0
    move v1, v2

    .line 101
    goto :goto_1

    .line 102
    :pswitch_3
    mul-float p0, p2, p1

    .line 103
    .line 104
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    add-float/2addr v1, p2

    .line 109
    mul-float/2addr v1, p1

    .line 110
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-float/2addr v2, p2

    .line 115
    mul-float/2addr v2, p1

    .line 116
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    goto :goto_1

    .line 121
    :pswitch_4
    add-float/2addr v2, p2

    .line 122
    mul-float/2addr v2, p1

    .line 123
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    add-float/2addr v1, p2

    .line 128
    mul-float/2addr v1, p1

    .line 129
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    mul-float/2addr p2, p1

    .line 134
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    goto :goto_1

    .line 139
    :pswitch_5
    add-float/2addr v1, p2

    .line 140
    mul-float/2addr v1, p1

    .line 141
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    add-float/2addr v2, p2

    .line 146
    mul-float/2addr v2, p1

    .line 147
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    mul-float/2addr p2, p1

    .line 152
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    :goto_1
    const/16 p2, 0xff

    .line 157
    .line 158
    invoke-static {p0, v0, p2}, Lorg/osmdroid/views/overlay/advancedpolyline/a;->c(III)I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    invoke-static {v1, v0, p2}, Lorg/osmdroid/views/overlay/advancedpolyline/a;->c(III)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-static {p1, v0, p2}, Lorg/osmdroid/views/overlay/advancedpolyline/a;->c(III)I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    invoke-static {p0, v1, p1}, Landroid/graphics/Color;->rgb(III)I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    return p0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method

.method public static b(FFF)F
    .locals 1

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    move p0, p1

    goto :goto_0

    :cond_0
    cmpl-float p1, p0, p2

    if-lez p1, :cond_1

    move p0, p2

    :cond_1
    :goto_0
    return p0
.end method

.method private static c(III)I
    .locals 0

    if-ge p0, p1, :cond_0

    move p0, p1

    goto :goto_0

    :cond_0
    if-le p0, p2, :cond_1

    move p0, p2

    :cond_1
    :goto_0
    return p0
.end method
