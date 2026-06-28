.class Lcom/zzhoujay/richtext/ig/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/m;


# instance fields
.field private final a:Lcom/zzhoujay/richtext/drawable/d;

.field private final b:Landroid/graphics/Bitmap;

.field private final c:I

.field private final d:I


# direct methods
.method private constructor <init>(Lcom/zzhoujay/richtext/drawable/d;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/richtext/ig/l;->a:Lcom/zzhoujay/richtext/drawable/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zzhoujay/richtext/ig/l;->b:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Lcom/zzhoujay/richtext/ig/l;->c:I

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lcom/zzhoujay/richtext/ig/l;->d:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Lf3/j;

    .line 26
    .line 27
    invoke-direct {p1}, Lf3/j;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    if-nez p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/drawable/d;->d()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iput p2, p0, Lcom/zzhoujay/richtext/ig/l;->c:I

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/drawable/d;->e()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Lcom/zzhoujay/richtext/ig/l;->d:I

    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :cond_2
    new-instance p1, Lf3/j;

    .line 47
    .line 48
    invoke-direct {p1}, Lf3/j;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p1
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
.end method

.method static a(Landroid/graphics/Bitmap;)Lcom/zzhoujay/richtext/ig/l;
    .locals 2

    new-instance v0, Lcom/zzhoujay/richtext/ig/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/zzhoujay/richtext/ig/l;-><init>(Lcom/zzhoujay/richtext/drawable/d;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method static d(Lcom/zzhoujay/richtext/drawable/d;)Lcom/zzhoujay/richtext/ig/l;
    .locals 2

    new-instance v0, Lcom/zzhoujay/richtext/ig/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zzhoujay/richtext/ig/l;-><init>(Lcom/zzhoujay/richtext/drawable/d;Landroid/graphics/Bitmap;)V

    return-object v0
.end method


# virtual methods
.method g()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/l;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method h()Lcom/zzhoujay/richtext/drawable/d;
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/l;->a:Lcom/zzhoujay/richtext/drawable/d;

    return-object v0
.end method

.method i(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/l;->a:Lcom/zzhoujay/richtext/drawable/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zzhoujay/richtext/ig/l;->b:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zzhoujay/richtext/ig/l;->b:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object v1, p0, Lcom/zzhoujay/richtext/ig/l;->b:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v2, v2, p1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-object v0
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
.end method

.method j()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/ig/l;->c:I

    return v0
.end method

.method k()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/ig/l;->d:I

    return v0
.end method

.method l()Z
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/l;->a:Lcom/zzhoujay/richtext/drawable/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/ig/l;->a:Lcom/zzhoujay/richtext/drawable/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/drawable/d;->g()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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
