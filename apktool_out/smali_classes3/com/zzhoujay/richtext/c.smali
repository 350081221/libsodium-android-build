.class public Lcom/zzhoujay/richtext/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zzhoujay/richtext/c$c;,
        Lcom/zzhoujay/richtext/c$a;,
        Lcom/zzhoujay/richtext/c$b;
    }
.end annotation


# static fields
.field public static final q:I = -0x80000000

.field public static final r:I = 0x7fffffff


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private final c:I

.field private d:I

.field private e:I

.field private f:Lcom/zzhoujay/richtext/c$b;

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Lcom/zzhoujay/richtext/drawable/a;

.field private m:Landroid/graphics/drawable/Drawable;

.field private n:Landroid/graphics/drawable/Drawable;

.field private o:Ljava/lang/String;

.field private p:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILcom/zzhoujay/richtext/g;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lcom/zzhoujay/richtext/c;->c:I

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/zzhoujay/richtext/c;->k:Z

    .line 10
    .line 11
    invoke-virtual {p3}, Lcom/zzhoujay/richtext/g;->c()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lcom/zzhoujay/richtext/c;->p:I

    .line 16
    .line 17
    iget-object p1, p3, Lcom/zzhoujay/richtext/g;->w:Lcom/zzhoujay/richtext/ig/i;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, ""

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->o:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {p0}, Lcom/zzhoujay/richtext/c;->b()V

    .line 35
    .line 36
    .line 37
    iget-boolean p1, p3, Lcom/zzhoujay/richtext/g;->e:Z

    .line 38
    .line 39
    iput-boolean p1, p0, Lcom/zzhoujay/richtext/c;->i:Z

    .line 40
    .line 41
    iget-boolean p1, p3, Lcom/zzhoujay/richtext/g;->c:Z

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    const p1, 0x7fffffff

    .line 46
    .line 47
    .line 48
    iput p1, p0, Lcom/zzhoujay/richtext/c;->d:I

    .line 49
    .line 50
    const/high16 p1, -0x80000000

    .line 51
    .line 52
    iput p1, p0, Lcom/zzhoujay/richtext/c;->e:I

    .line 53
    .line 54
    sget-object p1, Lcom/zzhoujay/richtext/c$b;->fit_auto:Lcom/zzhoujay/richtext/c$b;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-object p1, p3, Lcom/zzhoujay/richtext/g;->f:Lcom/zzhoujay/richtext/c$b;

    .line 60
    .line 61
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    .line 62
    .line 63
    iget p1, p3, Lcom/zzhoujay/richtext/g;->h:I

    .line 64
    .line 65
    iput p1, p0, Lcom/zzhoujay/richtext/c;->d:I

    .line 66
    .line 67
    iget p1, p3, Lcom/zzhoujay/richtext/g;->i:I

    .line 68
    .line 69
    iput p1, p0, Lcom/zzhoujay/richtext/c;->e:I

    .line 70
    .line 71
    :goto_1
    iget-boolean p1, p3, Lcom/zzhoujay/richtext/g;->l:Z

    .line 72
    .line 73
    xor-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    iput-boolean p1, p0, Lcom/zzhoujay/richtext/c;->j:Z

    .line 76
    .line 77
    new-instance p1, Lcom/zzhoujay/richtext/drawable/a;

    .line 78
    .line 79
    iget-object p2, p3, Lcom/zzhoujay/richtext/g;->s:Lcom/zzhoujay/richtext/drawable/a;

    .line 80
    .line 81
    invoke-direct {p1, p2}, Lcom/zzhoujay/richtext/drawable/a;-><init>(Lcom/zzhoujay/richtext/drawable/a;)V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    .line 85
    .line 86
    iget-object p1, p3, Lcom/zzhoujay/richtext/g;->x:Le3/d;

    .line 87
    .line 88
    invoke-interface {p1, p0, p3, p4}, Le3/d;->a(Lcom/zzhoujay/richtext/c;Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;)Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->m:Landroid/graphics/drawable/Drawable;

    .line 93
    .line 94
    iget-object p1, p3, Lcom/zzhoujay/richtext/g;->y:Le3/d;

    .line 95
    .line 96
    invoke-interface {p1, p0, p3, p4}, Le3/d;->a(Lcom/zzhoujay/richtext/c;Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;)Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->n:Landroid/graphics/drawable/Drawable;

    .line 101
    .line 102
    return-void
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

.method private b()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zzhoujay/richtext/c;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/zzhoujay/richtext/ext/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/zzhoujay/richtext/c;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public A(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->m:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public B(Lcom/zzhoujay/richtext/c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    return-void
.end method

.method public C(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/c;->j:Z

    return-void
.end method

.method public D(Z)V
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, p1}, Lcom/zzhoujay/richtext/drawable/a;->i(Z)V

    return-void
.end method

.method public E(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zzhoujay/richtext/c;->d:I

    .line 2
    .line 3
    iput p2, p0, Lcom/zzhoujay/richtext/c;->e:I

    .line 4
    .line 5
    return-void
    .line 6
    .line 7
    .line 8
    .line 9
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

.method public F(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zzhoujay/richtext/c;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zzhoujay/richtext/c;->b()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Lf3/k;

    .line 12
    .line 13
    invoke-direct {p1}, Lf3/k;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1
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
.end method

.method public G(I)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/richtext/c;->d:I

    return-void
.end method

.method public H()Z
    .locals 2

    iget v0, p0, Lcom/zzhoujay/richtext/c;->g:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a()Z
    .locals 2

    iget v0, p0, Lcom/zzhoujay/richtext/c;->g:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Lcom/zzhoujay/richtext/drawable/a;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    return-object v0
.end method

.method public d()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->n:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/c;->e:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zzhoujay/richtext/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/zzhoujay/richtext/c;

    .line 12
    .line 13
    iget v1, p0, Lcom/zzhoujay/richtext/c;->c:I

    .line 14
    .line 15
    iget v3, p1, Lcom/zzhoujay/richtext/c;->c:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/zzhoujay/richtext/c;->d:I

    .line 21
    .line 22
    iget v3, p1, Lcom/zzhoujay/richtext/c;->d:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lcom/zzhoujay/richtext/c;->e:I

    .line 28
    .line 29
    iget v3, p1, Lcom/zzhoujay/richtext/c;->e:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    .line 35
    .line 36
    iget-object v3, p1, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget v1, p0, Lcom/zzhoujay/richtext/c;->g:I

    .line 42
    .line 43
    iget v3, p1, Lcom/zzhoujay/richtext/c;->g:I

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->h:Z

    .line 49
    .line 50
    iget-boolean v3, p1, Lcom/zzhoujay/richtext/c;->h:Z

    .line 51
    .line 52
    if-eq v1, v3, :cond_7

    .line 53
    .line 54
    return v2

    .line 55
    :cond_7
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->i:Z

    .line 56
    .line 57
    iget-boolean v3, p1, Lcom/zzhoujay/richtext/c;->i:Z

    .line 58
    .line 59
    if-eq v1, v3, :cond_8

    .line 60
    .line 61
    return v2

    .line 62
    :cond_8
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->j:Z

    .line 63
    .line 64
    iget-boolean v3, p1, Lcom/zzhoujay/richtext/c;->j:Z

    .line 65
    .line 66
    if-eq v1, v3, :cond_9

    .line 67
    .line 68
    return v2

    .line 69
    :cond_9
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->k:Z

    .line 70
    .line 71
    iget-boolean v3, p1, Lcom/zzhoujay/richtext/c;->k:Z

    .line 72
    .line 73
    if-eq v1, v3, :cond_a

    .line 74
    .line 75
    return v2

    .line 76
    :cond_a
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->o:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v3, p1, Lcom/zzhoujay/richtext/c;->o:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_b

    .line 85
    .line 86
    return v2

    .line 87
    :cond_b
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->a:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v3, p1, Lcom/zzhoujay/richtext/c;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_c

    .line 96
    .line 97
    return v2

    .line 98
    :cond_c
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->b:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v3, p1, Lcom/zzhoujay/richtext/c;->b:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_d

    .line 107
    .line 108
    return v2

    .line 109
    :cond_d
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    .line 110
    .line 111
    iget-object v3, p1, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    .line 112
    .line 113
    invoke-virtual {v1, v3}, Lcom/zzhoujay/richtext/drawable/a;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-nez v1, :cond_e

    .line 118
    .line 119
    return v2

    .line 120
    :cond_e
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->m:Landroid/graphics/drawable/Drawable;

    .line 121
    .line 122
    if-eqz v1, :cond_f

    .line 123
    .line 124
    iget-object v3, p1, Lcom/zzhoujay/richtext/c;->m:Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_10

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_f
    iget-object v1, p1, Lcom/zzhoujay/richtext/c;->m:Landroid/graphics/drawable/Drawable;

    .line 134
    .line 135
    if-eqz v1, :cond_10

    .line 136
    .line 137
    :goto_0
    return v2

    .line 138
    :cond_10
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->n:Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    iget-object p1, p1, Lcom/zzhoujay/richtext/c;->n:Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    if-eqz v1, :cond_11

    .line 143
    .line 144
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    goto :goto_1

    .line 149
    :cond_11
    if-nez p1, :cond_12

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_12
    move v0, v2

    .line 153
    :goto_1
    return v0
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
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/c;->g:I

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->m:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget v1, p0, Lcom/zzhoujay/richtext/c;->c:I

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget v1, p0, Lcom/zzhoujay/richtext/c;->d:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget v1, p0, Lcom/zzhoujay/richtext/c;->e:I

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    mul-int/lit8 v0, v0, 0x1f

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v0, v1

    .line 40
    mul-int/lit8 v0, v0, 0x1f

    .line 41
    .line 42
    iget v1, p0, Lcom/zzhoujay/richtext/c;->g:I

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->h:Z

    .line 48
    .line 49
    add-int/2addr v0, v1

    .line 50
    mul-int/lit8 v0, v0, 0x1f

    .line 51
    .line 52
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->i:Z

    .line 53
    .line 54
    add-int/2addr v0, v1

    .line 55
    mul-int/lit8 v0, v0, 0x1f

    .line 56
    .line 57
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->j:Z

    .line 58
    .line 59
    add-int/2addr v0, v1

    .line 60
    mul-int/lit8 v0, v0, 0x1f

    .line 61
    .line 62
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->k:Z

    .line 63
    .line 64
    add-int/2addr v0, v1

    .line 65
    mul-int/lit8 v0, v0, 0x1f

    .line 66
    .line 67
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/zzhoujay/richtext/drawable/a;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move v1, v2

    .line 78
    :goto_0
    add-int/2addr v0, v1

    .line 79
    mul-int/lit8 v0, v0, 0x1f

    .line 80
    .line 81
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->m:Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v1, v2

    .line 91
    :goto_1
    add-int/2addr v0, v1

    .line 92
    mul-int/lit8 v0, v0, 0x1f

    .line 93
    .line 94
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->n:Landroid/graphics/drawable/Drawable;

    .line 95
    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :cond_2
    add-int/2addr v0, v2

    .line 103
    mul-int/lit8 v0, v0, 0x1f

    .line 104
    .line 105
    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->o:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/2addr v0, v1

    .line 112
    return v0
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
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/c;->c:I

    return v0
.end method

.method public j()Lcom/zzhoujay/richtext/c$b;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/c;->d:I

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zzhoujay/richtext/c;->h:Z

    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zzhoujay/richtext/c;->i:Z

    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zzhoujay/richtext/c;->k:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/c;->d:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/zzhoujay/richtext/c;->e:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zzhoujay/richtext/c;->j:Z

    return v0
.end method

.method public r(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/zzhoujay/richtext/c;->h:Z

    .line 2
    .line 3
    const/high16 v0, -0x80000000

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const p1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    iput p1, p0, Lcom/zzhoujay/richtext/c;->d:I

    .line 11
    .line 12
    iput v0, p0, Lcom/zzhoujay/richtext/c;->e:I

    .line 13
    .line 14
    sget-object p1, Lcom/zzhoujay/richtext/c$b;->fit_auto:Lcom/zzhoujay/richtext/c$b;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput v0, p0, Lcom/zzhoujay/richtext/c;->d:I

    .line 20
    .line 21
    iput v0, p0, Lcom/zzhoujay/richtext/c;->e:I

    .line 22
    .line 23
    sget-object p1, Lcom/zzhoujay/richtext/c$b;->none:Lcom/zzhoujay/richtext/c$b;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    .line 26
    .line 27
    :goto_0
    return-void
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/c;->i:Z

    return-void
.end method

.method public t(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, p1}, Lcom/zzhoujay/richtext/drawable/a;->f(I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageHolder{source=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", key=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/zzhoujay/richtext/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zzhoujay/richtext/c;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zzhoujay/richtext/c;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zzhoujay/richtext/c;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scaleType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->f:Lcom/zzhoujay/richtext/c$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zzhoujay/richtext/c;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", autoFix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", autoPlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", show="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->j:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isGif="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zzhoujay/richtext/c;->k:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", borderHolder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeHolder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", prefixCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zzhoujay/richtext/c;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(F)V
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, p1}, Lcom/zzhoujay/richtext/drawable/a;->h(F)V

    return-void
.end method

.method public v(F)V
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/c;->l:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, p1}, Lcom/zzhoujay/richtext/drawable/a;->g(F)V

    return-void
.end method

.method public w(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/c;->n:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public x(I)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/richtext/c;->e:I

    return-void
.end method

.method public y(I)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/richtext/c;->g:I

    return-void
.end method

.method public z(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/c;->k:Z

    return-void
.end method
