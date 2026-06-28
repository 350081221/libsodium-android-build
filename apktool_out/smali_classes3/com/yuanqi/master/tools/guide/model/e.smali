.class public Lcom/yuanqi/master/tools/guide/model/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yuanqi/master/tools/guide/model/b;


# instance fields
.field private a:Landroid/view/View;

.field private b:Lcom/yuanqi/master/tools/guide/model/b$a;

.field private c:I

.field private d:I

.field private e:Lcom/yuanqi/master/tools/guide/model/c;

.field private f:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/yuanqi/master/tools/guide/model/b$a;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/model/e;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/yuanqi/master/tools/guide/model/e;->b:Lcom/yuanqi/master/tools/guide/model/b$a;

    .line 7
    .line 8
    iput p3, p0, Lcom/yuanqi/master/tools/guide/model/e;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/yuanqi/master/tools/guide/model/e;->d:I

    .line 11
    .line 12
    return-void
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
.end method

.method private c(Landroid/view/View;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/yuanqi/master/tools/guide/model/e;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-static {p1, v1}, Lz2/c;->a(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    iget v2, p0, Lcom/yuanqi/master/tools/guide/model/e;->d:I

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    int-to-float v1, v1

    .line 18
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 19
    .line 20
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 21
    .line 22
    sub-int/2addr v1, v2

    .line 23
    int-to-float v1, v1

    .line 24
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 25
    .line 26
    iget v1, p1, Landroid/graphics/Rect;->right:I

    .line 27
    .line 28
    add-int/2addr v1, v2

    .line 29
    int-to-float v1, v1

    .line 30
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 31
    .line 32
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 33
    .line 34
    add-int/2addr p1, v2

    .line 35
    int-to-float p1, p1

    .line 36
    iput p1, v0, Landroid/graphics/RectF;->bottom:F

    .line 37
    .line 38
    return-object v0
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
.end method


# virtual methods
.method public a(Landroid/view/View;)Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->a:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->f:Landroid/graphics/RectF;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/yuanqi/master/tools/guide/model/e;->c(Landroid/view/View;)Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/model/e;->f:Landroid/graphics/RectF;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->e:Lcom/yuanqi/master/tools/guide/model/c;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-boolean v0, v0, Lcom/yuanqi/master/tools/guide/model/c;->d:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lcom/yuanqi/master/tools/guide/model/e;->c(Landroid/view/View;)Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/model/e;->f:Landroid/graphics/RectF;

    .line 29
    .line 30
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->a:Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, "\'s location:"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->f:Landroid/graphics/RectF;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Lz2/a;->f(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/yuanqi/master/tools/guide/model/e;->f:Landroid/graphics/RectF;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    const-string v0, "the highlight view is null!"

    .line 71
    .line 72
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1
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
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->c:I

    return v0
.end method

.method public d(Lcom/yuanqi/master/tools/guide/model/c;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/tools/guide/model/e;->e:Lcom/yuanqi/master/tools/guide/model/c;

    return-void
.end method

.method public getOptions()Lcom/yuanqi/master/tools/guide/model/c;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->e:Lcom/yuanqi/master/tools/guide/model/c;

    return-object v0
.end method

.method public getRadius()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->a:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    div-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, Lcom/yuanqi/master/tools/guide/model/e;->a:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    div-int/lit8 v1, v1, 0x2

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v1, p0, Lcom/yuanqi/master/tools/guide/model/e;->d:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    int-to-float v0, v0

    .line 27
    return v0

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    const-string v1, "the highlight view is null!"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
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
.end method

.method public getShape()Lcom/yuanqi/master/tools/guide/model/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/guide/model/e;->b:Lcom/yuanqi/master/tools/guide/model/b$a;

    return-object v0
.end method
