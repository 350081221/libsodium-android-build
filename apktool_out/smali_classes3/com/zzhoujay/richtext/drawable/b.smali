.class public Lcom/zzhoujay/richtext/drawable/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/graphics/RectF;

.field b:Lcom/zzhoujay/richtext/c$b;

.field private c:Ljava/lang/String;

.field d:Lcom/zzhoujay/richtext/drawable/a;


# direct methods
.method constructor <init>(Lcom/zzhoujay/richtext/c;)V
    .locals 5

    .line 6
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/graphics/RectF;

    .line 7
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->l()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->e()I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 8
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->j()Lcom/zzhoujay/richtext/c$b;

    move-result-object v2

    new-instance v3, Lcom/zzhoujay/richtext/drawable/a;

    .line 9
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/c;->c()Lcom/zzhoujay/richtext/drawable/a;

    move-result-object p1

    invoke-direct {v3, p1}, Lcom/zzhoujay/richtext/drawable/a;-><init>(Lcom/zzhoujay/richtext/drawable/a;)V

    .line 10
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/zzhoujay/richtext/drawable/b;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zzhoujay/richtext/c$b;Lcom/zzhoujay/richtext/drawable/a;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zzhoujay/richtext/c$b;Lcom/zzhoujay/richtext/drawable/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/zzhoujay/richtext/drawable/b;->a:Landroid/graphics/RectF;

    .line 3
    iput-object p3, p0, Lcom/zzhoujay/richtext/drawable/b;->b:Lcom/zzhoujay/richtext/c$b;

    .line 4
    iput-object p1, p0, Lcom/zzhoujay/richtext/drawable/b;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/zzhoujay/richtext/drawable/b;->d:Lcom/zzhoujay/richtext/drawable/a;

    return-void
.end method

.method private static a([B)I
    .locals 3

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x8

    const v2, 0xff00

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    const/4 v1, 0x2

    aget-byte v1, p0, v1

    shl-int/lit8 v1, v1, 0x18

    ushr-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    const/4 v1, 0x3

    aget-byte p0, p0, v1

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method private static f(I)[B
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [B

    and-int/lit16 v1, p0, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x1

    aput-byte v1, v0, v2

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v2, 0x2

    aput-byte v1, v0, v2

    ushr-int/lit8 p0, p0, 0x18

    int-to-byte p0, p0

    const/4 v1, 0x3

    aput-byte p0, v0, v1

    return-object v0
.end method

.method public static g(Ljava/io/InputStream;Ljava/lang/String;)Lcom/zzhoujay/richtext/drawable/b;
    .locals 9

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->i(Ljava/io/InputStream;)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->i(Ljava/io/InputStream;)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->i(Ljava/io/InputStream;)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->i(Ljava/io/InputStream;)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->j(Ljava/io/InputStream;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->h(Ljava/io/InputStream;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->j(Ljava/io/InputStream;)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->i(Ljava/io/InputStream;)F

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->i(Ljava/io/InputStream;)F

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 38
    .line 39
    .line 40
    new-instance p0, Landroid/graphics/RectF;

    .line 41
    .line 42
    invoke-direct {p0, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lcom/zzhoujay/richtext/drawable/a;

    .line 46
    .line 47
    invoke-direct {v0, v5, v7, v6, v8}, Lcom/zzhoujay/richtext/drawable/a;-><init>(ZFIF)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lcom/zzhoujay/richtext/drawable/b;

    .line 51
    .line 52
    invoke-static {v4}, Lcom/zzhoujay/richtext/c$b;->valueOf(I)Lcom/zzhoujay/richtext/c$b;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-direct {v1, p1, p0, v2, v0}, Lcom/zzhoujay/richtext/drawable/b;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zzhoujay/richtext/c$b;Lcom/zzhoujay/richtext/drawable/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :catch_0
    move-exception p0

    .line 61
    invoke-static {p0}, Lcom/zzhoujay/richtext/ext/c;->a(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0
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

.method private static h(Ljava/io/InputStream;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static i(Ljava/io/InputStream;)F
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0}, Lcom/zzhoujay/richtext/drawable/b;->j(Ljava/io/InputStream;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0
.end method

.method private static j(Ljava/io/InputStream;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/zzhoujay/richtext/drawable/b;->a([B)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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

.method private static m(Ljava/io/OutputStream;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method private static n(Ljava/io/OutputStream;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-static {p1}, Lcom/zzhoujay/richtext/drawable/b;->f(I)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method private static o(Ljava/io/OutputStream;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, Lcom/zzhoujay/richtext/drawable/b;->f(I)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method


# virtual methods
.method public b()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->a:Landroid/graphics/RectF;

    return-object v0
.end method

.method public c()Lcom/zzhoujay/richtext/drawable/a;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->d:Lcom/zzhoujay/richtext/drawable/a;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/zzhoujay/richtext/c$b;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->b:Lcom/zzhoujay/richtext/c$b;

    return-object v0
.end method

.method public k(Ljava/io/OutputStream;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->a:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->n(Ljava/io/OutputStream;F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->a:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 11
    .line 12
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->n(Ljava/io/OutputStream;F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->a:Landroid/graphics/RectF;

    .line 16
    .line 17
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 18
    .line 19
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->n(Ljava/io/OutputStream;F)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->a:Landroid/graphics/RectF;

    .line 23
    .line 24
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 25
    .line 26
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->n(Ljava/io/OutputStream;F)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->b:Lcom/zzhoujay/richtext/c$b;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/c$b;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->o(Ljava/io/OutputStream;I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->d:Lcom/zzhoujay/richtext/drawable/a;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/drawable/a;->d()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->m(Ljava/io/OutputStream;Z)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->d:Lcom/zzhoujay/richtext/drawable/a;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/drawable/a;->a()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->o(Ljava/io/OutputStream;I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->d:Lcom/zzhoujay/richtext/drawable/a;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/drawable/a;->b()F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->n(Ljava/io/OutputStream;F)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->d:Lcom/zzhoujay/richtext/drawable/a;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/drawable/a;->c()F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {p1, v0}, Lcom/zzhoujay/richtext/drawable/b;->n(Ljava/io/OutputStream;F)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catch_0
    move-exception p1

    .line 82
    invoke-static {p1}, Lcom/zzhoujay/richtext/ext/c;->a(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    return-void
.end method

.method l(Lcom/zzhoujay/richtext/drawable/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->d:Lcom/zzhoujay/richtext/drawable/a;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/zzhoujay/richtext/drawable/b;->d:Lcom/zzhoujay/richtext/drawable/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zzhoujay/richtext/drawable/a;->e(Lcom/zzhoujay/richtext/drawable/a;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->a:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget-object v1, p1, Lcom/zzhoujay/richtext/drawable/b;->a:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Lcom/zzhoujay/richtext/drawable/b;->b:Lcom/zzhoujay/richtext/c$b;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/zzhoujay/richtext/drawable/b;->b:Lcom/zzhoujay/richtext/c$b;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/zzhoujay/richtext/drawable/b;->c:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/zzhoujay/richtext/drawable/b;->c:Ljava/lang/String;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method
