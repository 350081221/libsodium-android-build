.class public final Lcom/zzhoujay/richtext/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zzhoujay/richtext/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static final A:I = 0x9

.field private static final B:Landroid/os/Handler;

.field private static final C:Le3/d;

.field private static final D:Le3/d;


# instance fields
.field final a:Ljava/lang/String;

.field b:Lcom/zzhoujay/richtext/i;

.field c:Z

.field d:Z

.field e:Lcom/zzhoujay/richtext/b;

.field f:Le3/e;

.field g:Le3/h;

.field h:Z

.field i:I

.field j:Le3/i;

.field k:Le3/k;

.field l:Le3/j;

.field m:Le3/l;

.field n:Le3/f;

.field o:Le3/b;

.field p:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field q:Z

.field r:Lcom/zzhoujay/richtext/c$b;

.field s:I

.field t:I

.field u:Lcom/zzhoujay/richtext/drawable/a;

.field v:Z

.field w:Z

.field x:Lcom/zzhoujay/richtext/ig/i;

.field y:Le3/d;

.field z:Le3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zzhoujay/richtext/g$b$a;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/zzhoujay/richtext/g$b$a;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zzhoujay/richtext/g$b;->B:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Lcom/zzhoujay/richtext/g$b$b;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zzhoujay/richtext/g$b$b;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zzhoujay/richtext/g$b;->C:Le3/d;

    .line 18
    .line 19
    new-instance v0, Lcom/zzhoujay/richtext/g$b$c;

    .line 20
    .line 21
    invoke-direct {v0}, Lcom/zzhoujay/richtext/g$b$c;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/zzhoujay/richtext/g$b;->D:Le3/d;

    .line 25
    .line 26
    return-void
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
.end method

.method constructor <init>(Ljava/lang/String;Lcom/zzhoujay/richtext/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zzhoujay/richtext/g$b;->b:Lcom/zzhoujay/richtext/i;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/zzhoujay/richtext/g$b;->c:Z

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    iput-boolean p2, p0, Lcom/zzhoujay/richtext/g$b;->d:Z

    .line 13
    .line 14
    iput-boolean p2, p0, Lcom/zzhoujay/richtext/g$b;->h:Z

    .line 15
    .line 16
    iput p2, p0, Lcom/zzhoujay/richtext/g$b;->i:I

    .line 17
    .line 18
    sget-object v0, Lcom/zzhoujay/richtext/b;->all:Lcom/zzhoujay/richtext/b;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/zzhoujay/richtext/g$b;->e:Lcom/zzhoujay/richtext/b;

    .line 21
    .line 22
    iput-boolean p2, p0, Lcom/zzhoujay/richtext/g$b;->q:Z

    .line 23
    .line 24
    sget-object v0, Lcom/zzhoujay/richtext/c$b;->none:Lcom/zzhoujay/richtext/c$b;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/zzhoujay/richtext/g$b;->r:Lcom/zzhoujay/richtext/c$b;

    .line 27
    .line 28
    const/high16 v0, -0x80000000

    .line 29
    .line 30
    iput v0, p0, Lcom/zzhoujay/richtext/g$b;->s:I

    .line 31
    .line 32
    iput v0, p0, Lcom/zzhoujay/richtext/g$b;->t:I

    .line 33
    .line 34
    new-instance v0, Lcom/zzhoujay/richtext/drawable/a;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/zzhoujay/richtext/drawable/a;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/zzhoujay/richtext/g$b;->u:Lcom/zzhoujay/richtext/drawable/a;

    .line 40
    .line 41
    iput-boolean p1, p0, Lcom/zzhoujay/richtext/g$b;->v:Z

    .line 42
    .line 43
    sget-object p1, Lcom/zzhoujay/richtext/g$b;->C:Le3/d;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->y:Le3/d;

    .line 46
    .line 47
    sget-object p1, Lcom/zzhoujay/richtext/g$b;->D:Le3/d;

    .line 48
    .line 49
    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->z:Le3/d;

    .line 50
    .line 51
    iput-boolean p2, p0, Lcom/zzhoujay/richtext/g$b;->w:Z

    .line 52
    .line 53
    return-void
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
.end method

.method static synthetic a()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/zzhoujay/richtext/g$b;->B:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public A(Lcom/zzhoujay/richtext/i;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->b:Lcom/zzhoujay/richtext/i;

    return-object p0
.end method

.method public B(Le3/k;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->k:Le3/k;

    return-object p0
.end method

.method public C(Le3/l;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->m:Le3/l;

    return-object p0
.end method

.method public b(Z)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/g$b;->c:Z

    return-object p0
.end method

.method public c(Z)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/g$b;->q:Z

    return-object p0
.end method

.method public d(Ljava/lang/Object;)Lcom/zzhoujay/richtext/g$b;
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/zzhoujay/richtext/g$b;->p:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public e(I)Lcom/zzhoujay/richtext/g$b;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/zzhoujay/richtext/g$b;->u:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, p1}, Lcom/zzhoujay/richtext/drawable/a;->f(I)V

    return-object p0
.end method

.method public f(F)Lcom/zzhoujay/richtext/g$b;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/g$b;->u:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, p1}, Lcom/zzhoujay/richtext/drawable/a;->h(F)V

    return-object p0
.end method

.method public g(F)Lcom/zzhoujay/richtext/g$b;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/g$b;->u:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, p1}, Lcom/zzhoujay/richtext/drawable/a;->g(F)V

    return-object p0
.end method

.method public h(Lcom/zzhoujay/richtext/b;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->e:Lcom/zzhoujay/richtext/b;

    return-object p0
.end method

.method public i(Z)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lcom/zzhoujay/richtext/g$b;->i:I

    return-object p0
.end method

.method public j(Le3/b;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->o:Le3/b;

    return-object p0
.end method

.method public k(Le3/d;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->z:Le3/d;

    return-object p0
.end method

.method public l(Le3/e;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->f:Le3/e;

    return-object p0
.end method

.method public m(Le3/i;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->j:Le3/i;

    return-object p0
.end method

.method public n(Lcom/zzhoujay/richtext/ig/i;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->x:Lcom/zzhoujay/richtext/ig/i;

    return-object p0
.end method

.method public o(Le3/f;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->n:Le3/f;

    return-object p0
.end method

.method public p(Le3/j;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->l:Le3/j;

    return-object p0
.end method

.method public q(Landroid/widget/TextView;)Lcom/zzhoujay/richtext/f;
    .locals 3

    .line 1
    const-string v0, "com.zzhoujay.okhttpimagedownloader.OkHttpImageDownloader"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zzhoujay/richtext/g$b;->n:Le3/f;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/zzhoujay/richtext/ig/g;

    .line 8
    .line 9
    invoke-direct {v1}, Lcom/zzhoujay/richtext/ig/g;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/zzhoujay/richtext/g$b;->n:Le3/f;

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/zzhoujay/richtext/g$b;->n:Le3/f;

    .line 15
    .line 16
    instance-of v1, v1, Lcom/zzhoujay/richtext/ig/g;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zzhoujay/richtext/g$b;->x:Lcom/zzhoujay/richtext/ig/i;

    .line 21
    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    :try_start_0
    const-string v1, "com.zzhoujay.okhttpimagedownloader.OkHttpImageDownloader"

    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0}, Lcom/zzhoujay/richtext/f;->n(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lcom/zzhoujay/richtext/ig/i;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v2, v1

    .line 43
    check-cast v2, Lcom/zzhoujay/richtext/ig/i;

    .line 44
    .line 45
    invoke-static {v0, v2}, Lcom/zzhoujay/richtext/f;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    iput-object v2, p0, Lcom/zzhoujay/richtext/g$b;->x:Lcom/zzhoujay/richtext/ig/i;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_0
    sget-object v0, Lcom/zzhoujay/richtext/ig/f;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/zzhoujay/richtext/f;->n(Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lcom/zzhoujay/richtext/ig/f;

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    new-instance v1, Lcom/zzhoujay/richtext/ig/f;

    .line 62
    .line 63
    invoke-direct {v1}, Lcom/zzhoujay/richtext/ig/f;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1}, Lcom/zzhoujay/richtext/f;->u(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    iput-object v1, p0, Lcom/zzhoujay/richtext/g$b;->x:Lcom/zzhoujay/richtext/ig/i;

    .line 70
    .line 71
    :cond_3
    :goto_0
    new-instance v0, Lcom/zzhoujay/richtext/f;

    .line 72
    .line 73
    new-instance v1, Lcom/zzhoujay/richtext/g;

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-direct {v1, p0, v2}, Lcom/zzhoujay/richtext/g;-><init>(Lcom/zzhoujay/richtext/g$b;Lcom/zzhoujay/richtext/g$a;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1, p1}, Lcom/zzhoujay/richtext/f;-><init>(Lcom/zzhoujay/richtext/g;Landroid/widget/TextView;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lcom/zzhoujay/richtext/g$b;->p:Ljava/lang/ref/WeakReference;

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/f;->e(Ljava/lang/Object;Lcom/zzhoujay/richtext/f;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    iput-object v2, p0, Lcom/zzhoujay/richtext/g$b;->p:Ljava/lang/ref/WeakReference;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/f;->l()V

    .line 96
    .line 97
    .line 98
    return-object v0
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
.end method

.method public r(Le3/h;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->g:Le3/h;

    return-object p0
.end method

.method public s(Z)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/g$b;->h:Z

    return-object p0
.end method

.method public t(Le3/d;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->y:Le3/d;

    return-object p0
.end method

.method public u(Z)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/g$b;->d:Z

    return-object p0
.end method

.method public v(Lcom/zzhoujay/richtext/c$b;)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-object p1, p0, Lcom/zzhoujay/richtext/g$b;->r:Lcom/zzhoujay/richtext/c$b;

    return-object p0
.end method

.method public w(Z)Lcom/zzhoujay/richtext/g$b;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/g$b;->u:Lcom/zzhoujay/richtext/drawable/a;

    invoke-virtual {v0, p1}, Lcom/zzhoujay/richtext/drawable/a;->i(Z)V

    return-object p0
.end method

.method public x(Z)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/g$b;->v:Z

    return-object p0
.end method

.method public y(II)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zzhoujay/richtext/g$b;->s:I

    .line 2
    .line 3
    iput p2, p0, Lcom/zzhoujay/richtext/g$b;->t:I

    .line 4
    .line 5
    return-object p0
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

.method public z(Z)Lcom/zzhoujay/richtext/g$b;
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/g$b;->w:Z

    return-object p0
.end method
