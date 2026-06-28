.class public Lcom/yuanqi/master/tools/dialog/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/master/tools/dialog/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/yuanqi/master/tools/dialog/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const v0, 0x7f1304ac

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/master/tools/dialog/b$a;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/yuanqi/master/tools/dialog/a$a;

    invoke-direct {v0, p1, p2}, Lcom/yuanqi/master/tools/dialog/a$a;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    const v1, 0x7f1304b1

    iput v1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->s:I

    return-object p0
.end method

.method public b()Lcom/yuanqi/master/tools/dialog/b;
    .locals 3

    .line 1
    new-instance v0, Lcom/yuanqi/master/tools/dialog/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/yuanqi/master/tools/dialog/a$a;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget v1, v1, Lcom/yuanqi/master/tools/dialog/a$a;->b:I

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lcom/yuanqi/master/tools/dialog/b;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/yuanqi/master/tools/dialog/b;->a(Lcom/yuanqi/master/tools/dialog/b;)Lcom/yuanqi/master/tools/dialog/a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Lcom/yuanqi/master/tools/dialog/a$a;->a(Lcom/yuanqi/master/tools/dialog/a;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 22
    .line 23
    iget-boolean v1, v1, Lcom/yuanqi/master/tools/dialog/a$a;->c:Z

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 29
    .line 30
    iget-boolean v1, v1, Lcom/yuanqi/master/tools/dialog/a$a;->c:Z

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 39
    .line 40
    iget-object v1, v1, Lcom/yuanqi/master/tools/dialog/a$a;->d:Landroid/content/DialogInterface$OnCancelListener;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 46
    .line 47
    iget-object v1, v1, Lcom/yuanqi/master/tools/dialog/a$a;->e:Landroid/content/DialogInterface$OnDismissListener;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 53
    .line 54
    iget-object v1, v1, Lcom/yuanqi/master/tools/dialog/a$a;->f:Landroid/content/DialogInterface$OnKeyListener;

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-object v0
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

.method public c(Z)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 4
    .line 5
    const v0, 0x7f1304ae

    .line 6
    .line 7
    .line 8
    iput v0, p1, Lcom/yuanqi/master/tools/dialog/a$a;->s:I

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 11
    .line 12
    const/16 v0, 0x50

    .line 13
    .line 14
    iput v0, p1, Lcom/yuanqi/master/tools/dialog/a$a;->t:I

    .line 15
    .line 16
    return-object p0
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

.method public d(Z)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 4
    .line 5
    const v0, 0x7f1304b1

    .line 6
    .line 7
    .line 8
    iput v0, p1, Lcom/yuanqi/master/tools/dialog/a$a;->s:I

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    iput v0, p1, Lcom/yuanqi/master/tools/dialog/a$a;->t:I

    .line 14
    .line 15
    return-object p0
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
.end method

.method public e(Z)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 4
    .line 5
    const v0, 0x7f1304b1

    .line 6
    .line 7
    .line 8
    iput v0, p1, Lcom/yuanqi/master/tools/dialog/a$a;->s:I

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 11
    .line 12
    const/16 v0, 0x30

    .line 13
    .line 14
    iput v0, p1, Lcom/yuanqi/master/tools/dialog/a$a;->t:I

    .line 15
    .line 16
    return-object p0
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

.method public f()Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    const/4 v1, -0x1

    iput v1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->o:I

    return-object p0
.end method

.method public g(I)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iput p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->s:I

    return-object p0
.end method

.method public h(ILandroid/graphics/Bitmap;)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iget-object v0, v0, Lcom/yuanqi/master/tools/dialog/a$a;->l:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public i(Z)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iput-boolean p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->c:Z

    return-object p0
.end method

.method public j(I)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->n:Landroid/view/View;

    .line 5
    .line 6
    iput p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->m:I

    .line 7
    .line 8
    return-object p0
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
.end method

.method public k(Landroid/view/View;)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->n:Landroid/view/View;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->m:I

    .line 7
    .line 8
    return-object p0
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
.end method

.method public l(II)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iget-object v0, v0, Lcom/yuanqi/master/tools/dialog/a$a;->k:Landroid/util/SparseArray;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public m(Landroid/content/DialogInterface$OnCancelListener;)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iput-object p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->d:Landroid/content/DialogInterface$OnCancelListener;

    return-object p0
.end method

.method public n(ILandroid/view/View$OnClickListener;)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iget-object v0, v0, Lcom/yuanqi/master/tools/dialog/a$a;->i:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public o(Landroid/content/DialogInterface$OnDismissListener;)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iput-object p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->e:Landroid/content/DialogInterface$OnDismissListener;

    return-object p0
.end method

.method public p(Landroid/content/DialogInterface$OnKeyListener;)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iput-object p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->f:Landroid/content/DialogInterface$OnKeyListener;

    return-object p0
.end method

.method public q(ILandroid/view/View$OnLongClickListener;)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iget-object v0, v0, Lcom/yuanqi/master/tools/dialog/a$a;->j:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public r(ILjava/lang/CharSequence;)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iget-object v0, v0, Lcom/yuanqi/master/tools/dialog/a$a;->h:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public s(II)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    iget-object v0, v0, Lcom/yuanqi/master/tools/dialog/a$a;->g:Landroid/util/SparseArray;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public t(II)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 2
    .line 3
    iput p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->o:I

    .line 4
    .line 5
    iput p2, v0, Lcom/yuanqi/master/tools/dialog/a$a;->p:I

    .line 6
    .line 7
    return-object p0
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

.method public u(IIII)Lcom/yuanqi/master/tools/dialog/b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/tools/dialog/b$a;->a:Lcom/yuanqi/master/tools/dialog/a$a;

    .line 2
    .line 3
    iput p1, v0, Lcom/yuanqi/master/tools/dialog/a$a;->o:I

    .line 4
    .line 5
    iput p2, v0, Lcom/yuanqi/master/tools/dialog/a$a;->p:I

    .line 6
    .line 7
    iput p3, v0, Lcom/yuanqi/master/tools/dialog/a$a;->q:I

    .line 8
    .line 9
    iput p4, v0, Lcom/yuanqi/master/tools/dialog/a$a;->r:I

    .line 10
    .line 11
    return-object p0
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

.method public v()Lcom/yuanqi/master/tools/dialog/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/tools/dialog/b$a;->b()Lcom/yuanqi/master/tools/dialog/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 6
    .line 7
    .line 8
    return-object v0
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
.end method
