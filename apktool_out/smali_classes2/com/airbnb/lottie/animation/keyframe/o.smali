.class public Lcom/airbnb/lottie/animation/keyframe/o;
.super Lcom/airbnb/lottie/animation/keyframe/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/airbnb/lottie/animation/keyframe/g<",
        "Lcom/airbnb/lottie/model/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/value/a<",
            "Lcom/airbnb/lottie/model/b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/animation/keyframe/g;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method bridge synthetic i(Lcom/airbnb/lottie/value/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/airbnb/lottie/animation/keyframe/o;->q(Lcom/airbnb/lottie/value/a;F)Lcom/airbnb/lottie/model/b;

    move-result-object p1

    return-object p1
.end method

.method q(Lcom/airbnb/lottie/value/a;F)Lcom/airbnb/lottie/model/b;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/a<",
            "Lcom/airbnb/lottie/model/b;",
            ">;F)",
            "Lcom/airbnb/lottie/model/b;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/animation/keyframe/a;->e:Lcom/airbnb/lottie/value/j;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v1, p1, Lcom/airbnb/lottie/value/a;->g:F

    .line 6
    .line 7
    iget-object v2, p1, Lcom/airbnb/lottie/value/a;->h:Ljava/lang/Float;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    :goto_0
    iget-object v3, p1, Lcom/airbnb/lottie/value/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, v3

    .line 22
    check-cast v4, Lcom/airbnb/lottie/model/b;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/airbnb/lottie/value/a;->c:Ljava/lang/Object;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    check-cast v3, Lcom/airbnb/lottie/model/b;

    .line 29
    .line 30
    move-object p1, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    check-cast p1, Lcom/airbnb/lottie/model/b;

    .line 33
    .line 34
    :goto_1
    invoke-virtual {p0}, Lcom/airbnb/lottie/animation/keyframe/a;->d()F

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-virtual {p0}, Lcom/airbnb/lottie/animation/keyframe/a;->f()F

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    move-object v3, v4

    .line 43
    move-object v4, p1

    .line 44
    move v5, p2

    .line 45
    invoke-virtual/range {v0 .. v7}, Lcom/airbnb/lottie/value/j;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/airbnb/lottie/model/b;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    .line 53
    .line 54
    cmpl-float p2, p2, v0

    .line 55
    .line 56
    if-nez p2, :cond_4

    .line 57
    .line 58
    iget-object p2, p1, Lcom/airbnb/lottie/value/a;->c:Ljava/lang/Object;

    .line 59
    .line 60
    if-nez p2, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    check-cast p2, Lcom/airbnb/lottie/model/b;

    .line 64
    .line 65
    return-object p2

    .line 66
    :cond_4
    :goto_2
    iget-object p1, p1, Lcom/airbnb/lottie/value/a;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Lcom/airbnb/lottie/model/b;

    .line 69
    .line 70
    return-object p1
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
.end method

.method public r(Lcom/airbnb/lottie/value/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/j<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/value/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/airbnb/lottie/value/b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/airbnb/lottie/model/b;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/airbnb/lottie/model/b;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lcom/airbnb/lottie/animation/keyframe/o$a;

    .line 12
    .line 13
    invoke-direct {v2, p0, v0, p1, v1}, Lcom/airbnb/lottie/animation/keyframe/o$a;-><init>(Lcom/airbnb/lottie/animation/keyframe/o;Lcom/airbnb/lottie/value/b;Lcom/airbnb/lottie/value/j;Lcom/airbnb/lottie/model/b;)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, v2}, Lcom/airbnb/lottie/animation/keyframe/a;->o(Lcom/airbnb/lottie/value/j;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
