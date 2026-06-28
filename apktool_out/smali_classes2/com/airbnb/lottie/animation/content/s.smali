.class public Lcom/airbnb/lottie/animation/content/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/airbnb/lottie/animation/content/n;
.implements Lcom/airbnb/lottie/animation/keyframe/a$b;
.implements Lcom/airbnb/lottie/animation/content/k;


# instance fields
.field private final a:Landroid/graphics/Path;

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:Lcom/airbnb/lottie/x0;

.field private final e:Lcom/airbnb/lottie/animation/keyframe/m;

.field private f:Ljava/util/List;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/animation/content/t;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private final h:Lcom/airbnb/lottie/animation/content/b;


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/model/layer/b;Lcom/airbnb/lottie/model/content/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance v0, Lcom/airbnb/lottie/animation/content/b;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/airbnb/lottie/animation/content/b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->h:Lcom/airbnb/lottie/animation/content/b;

    .line 17
    .line 18
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/r;->b()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/r;->d()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput-boolean v0, p0, Lcom/airbnb/lottie/animation/content/s;->c:Z

    .line 29
    .line 30
    iput-object p1, p0, Lcom/airbnb/lottie/animation/content/s;->d:Lcom/airbnb/lottie/x0;

    .line 31
    .line 32
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/r;->c()Lcom/airbnb/lottie/model/animatable/h;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/airbnb/lottie/model/animatable/h;->d()Lcom/airbnb/lottie/animation/keyframe/m;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/airbnb/lottie/animation/content/s;->e:Lcom/airbnb/lottie/animation/keyframe/m;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 46
    .line 47
    .line 48
    return-void
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
.end method

.method private g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/airbnb/lottie/animation/content/s;->g:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->d:Lcom/airbnb/lottie/x0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/airbnb/lottie/x0;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
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
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Lcom/airbnb/lottie/animation/content/s;->g()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/animation/content/c;",
            ">;",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/animation/content/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge v0, v1, :cond_3

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/airbnb/lottie/animation/content/c;

    .line 14
    .line 15
    instance-of v2, v1, Lcom/airbnb/lottie/animation/content/v;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    move-object v2, v1

    .line 20
    check-cast v2, Lcom/airbnb/lottie/animation/content/v;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/airbnb/lottie/animation/content/v;->j()Lcom/airbnb/lottie/model/content/t$a;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    sget-object v4, Lcom/airbnb/lottie/model/content/t$a;->SIMULTANEOUSLY:Lcom/airbnb/lottie/model/content/t$a;

    .line 27
    .line 28
    if-ne v3, v4, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/airbnb/lottie/animation/content/s;->h:Lcom/airbnb/lottie/animation/content/b;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lcom/airbnb/lottie/animation/content/b;->a(Lcom/airbnb/lottie/animation/content/v;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p0}, Lcom/airbnb/lottie/animation/content/v;->d(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    instance-of v2, v1, Lcom/airbnb/lottie/animation/content/t;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    new-instance p2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    :cond_1
    check-cast v1, Lcom/airbnb/lottie/animation/content/t;

    .line 51
    .line 52
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object p1, p0, Lcom/airbnb/lottie/animation/content/s;->e:Lcom/airbnb/lottie/animation/keyframe/m;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/m;->r(Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    return-void
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
.end method

.method public d(Ljava/lang/Object;Lcom/airbnb/lottie/value/j;)V
    .locals 1
    .param p2    # Lcom/airbnb/lottie/value/j;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/airbnb/lottie/value/j<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/airbnb/lottie/c1;->P:Landroid/graphics/Path;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/airbnb/lottie/animation/content/s;->e:Lcom/airbnb/lottie/animation/keyframe/m;

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/a;->o(Lcom/airbnb/lottie/value/j;)V

    .line 8
    .line 9
    .line 10
    :cond_0
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

.method public e(Lcom/airbnb/lottie/model/e;ILjava/util/List;Lcom/airbnb/lottie/model/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/model/e;",
            "I",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/e;",
            ">;",
            "Lcom/airbnb/lottie/model/e;",
            ")V"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4, p0}, Lcom/airbnb/lottie/utils/k;->m(Lcom/airbnb/lottie/model/e;ILjava/util/List;Lcom/airbnb/lottie/model/e;Lcom/airbnb/lottie/animation/content/k;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Landroid/graphics/Path;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/airbnb/lottie/animation/content/s;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->e:Lcom/airbnb/lottie/animation/keyframe/m;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->k()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/airbnb/lottie/animation/content/s;->c:Z

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iput-boolean v1, p0, Lcom/airbnb/lottie/animation/content/s;->g:Z

    .line 27
    .line 28
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->e:Lcom/airbnb/lottie/animation/keyframe/m;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/graphics/Path;

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    iget-object v2, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 50
    .line 51
    sget-object v2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->h:Lcom/airbnb/lottie/animation/content/b;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Lcom/airbnb/lottie/animation/content/b;->b(Landroid/graphics/Path;)V

    .line 61
    .line 62
    .line 63
    iput-boolean v1, p0, Lcom/airbnb/lottie/animation/content/s;->g:Z

    .line 64
    .line 65
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/s;->a:Landroid/graphics/Path;

    .line 66
    .line 67
    return-object v0
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
