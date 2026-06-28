.class Lcom/airbnb/lottie/animation/keyframe/o$a;
.super Lcom/airbnb/lottie/value/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/animation/keyframe/o;->r(Lcom/airbnb/lottie/value/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/airbnb/lottie/value/j<",
        "Lcom/airbnb/lottie/model/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/airbnb/lottie/value/b;

.field final synthetic e:Lcom/airbnb/lottie/value/j;

.field final synthetic f:Lcom/airbnb/lottie/model/b;

.field final synthetic g:Lcom/airbnb/lottie/animation/keyframe/o;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/animation/keyframe/o;Lcom/airbnb/lottie/value/b;Lcom/airbnb/lottie/value/j;Lcom/airbnb/lottie/model/b;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/lottie/animation/keyframe/o$a;->g:Lcom/airbnb/lottie/animation/keyframe/o;

    iput-object p2, p0, Lcom/airbnb/lottie/animation/keyframe/o$a;->d:Lcom/airbnb/lottie/value/b;

    iput-object p3, p0, Lcom/airbnb/lottie/animation/keyframe/o$a;->e:Lcom/airbnb/lottie/value/j;

    iput-object p4, p0, Lcom/airbnb/lottie/animation/keyframe/o$a;->f:Lcom/airbnb/lottie/model/b;

    invoke-direct {p0}, Lcom/airbnb/lottie/value/j;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/animation/keyframe/o$a;->e(Lcom/airbnb/lottie/value/b;)Lcom/airbnb/lottie/model/b;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/airbnb/lottie/value/b;)Lcom/airbnb/lottie/model/b;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/b<",
            "Lcom/airbnb/lottie/model/b;",
            ">;)",
            "Lcom/airbnb/lottie/model/b;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/airbnb/lottie/animation/keyframe/o$a;->d:Lcom/airbnb/lottie/value/b;

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->f()F

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->a()F

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->g()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lcom/airbnb/lottie/model/b;

    .line 18
    .line 19
    iget-object v4, v4, Lcom/airbnb/lottie/model/b;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->b()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lcom/airbnb/lottie/model/b;

    .line 26
    .line 27
    iget-object v5, v5, Lcom/airbnb/lottie/model/b;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->d()F

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->c()F

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->e()F

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    invoke-virtual/range {v1 .. v8}, Lcom/airbnb/lottie/value/b;->h(FFLjava/lang/Object;Ljava/lang/Object;FFF)Lcom/airbnb/lottie/value/b;

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Lcom/airbnb/lottie/animation/keyframe/o$a;->e:Lcom/airbnb/lottie/value/j;

    .line 45
    .line 46
    iget-object v2, v0, Lcom/airbnb/lottie/animation/keyframe/o$a;->d:Lcom/airbnb/lottie/value/b;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lcom/airbnb/lottie/value/j;->a(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    move-object v3, v1

    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->c()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/high16 v2, 0x3f800000    # 1.0f

    .line 60
    .line 61
    cmpl-float v1, v1, v2

    .line 62
    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->b()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/airbnb/lottie/value/b;->g()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_0
    check-cast v1, Lcom/airbnb/lottie/model/b;

    .line 75
    .line 76
    iget-object v2, v0, Lcom/airbnb/lottie/animation/keyframe/o$a;->f:Lcom/airbnb/lottie/model/b;

    .line 77
    .line 78
    iget-object v4, v1, Lcom/airbnb/lottie/model/b;->b:Ljava/lang/String;

    .line 79
    .line 80
    iget v5, v1, Lcom/airbnb/lottie/model/b;->c:F

    .line 81
    .line 82
    iget-object v6, v1, Lcom/airbnb/lottie/model/b;->d:Lcom/airbnb/lottie/model/b$a;

    .line 83
    .line 84
    iget v7, v1, Lcom/airbnb/lottie/model/b;->e:I

    .line 85
    .line 86
    iget v8, v1, Lcom/airbnb/lottie/model/b;->f:F

    .line 87
    .line 88
    iget v9, v1, Lcom/airbnb/lottie/model/b;->g:F

    .line 89
    .line 90
    iget v10, v1, Lcom/airbnb/lottie/model/b;->h:I

    .line 91
    .line 92
    iget v11, v1, Lcom/airbnb/lottie/model/b;->i:I

    .line 93
    .line 94
    iget v12, v1, Lcom/airbnb/lottie/model/b;->j:F

    .line 95
    .line 96
    iget-boolean v13, v1, Lcom/airbnb/lottie/model/b;->k:Z

    .line 97
    .line 98
    iget-object v14, v1, Lcom/airbnb/lottie/model/b;->l:Landroid/graphics/PointF;

    .line 99
    .line 100
    iget-object v15, v1, Lcom/airbnb/lottie/model/b;->m:Landroid/graphics/PointF;

    .line 101
    .line 102
    invoke-virtual/range {v2 .. v15}, Lcom/airbnb/lottie/model/b;->a(Ljava/lang/String;Ljava/lang/String;FLcom/airbnb/lottie/model/b$a;IFFIIFZLandroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, v0, Lcom/airbnb/lottie/animation/keyframe/o$a;->f:Lcom/airbnb/lottie/model/b;

    .line 106
    .line 107
    return-object v1
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
.end method
