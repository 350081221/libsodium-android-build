.class public Lcom/zzhoujay/richtext/drawable/d;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# static fields
.field private static final k:I = 0x357


# instance fields
.field private a:Landroid/graphics/Movie;

.field private b:J

.field private c:I

.field private d:I

.field private e:Z

.field private f:Landroid/widget/TextView;

.field private g:F

.field private h:F

.field private i:Landroid/graphics/Paint;

.field private j:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/graphics/Movie;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/richtext/drawable/d;->a:Landroid/graphics/Movie;

    .line 5
    .line 6
    iput p2, p0, Lcom/zzhoujay/richtext/drawable/d;->c:I

    .line 7
    .line 8
    iput p3, p0, Lcom/zzhoujay/richtext/drawable/d;->d:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1, p1, p3, p2}, Lcom/zzhoujay/richtext/drawable/d;->setBounds(IIII)V

    .line 12
    .line 13
    .line 14
    const/high16 p1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    iput p1, p0, Lcom/zzhoujay/richtext/drawable/d;->h:F

    .line 17
    .line 18
    iput p1, p0, Lcom/zzhoujay/richtext/drawable/d;->g:F

    .line 19
    .line 20
    new-instance p1, Landroid/graphics/Paint;

    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/zzhoujay/richtext/drawable/d;->i:Landroid/graphics/Paint;

    .line 26
    .line 27
    new-instance p1, Lcom/zzhoujay/richtext/drawable/d$a;

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-direct {p1, p0, p2}, Lcom/zzhoujay/richtext/drawable/d$a;-><init>(Lcom/zzhoujay/richtext/drawable/d;Landroid/os/Looper;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/zzhoujay/richtext/drawable/d;->j:Landroid/os/Handler;

    .line 37
    .line 38
    return-void
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
.end method

.method static synthetic a(Lcom/zzhoujay/richtext/drawable/d;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/zzhoujay/richtext/drawable/d;->e:Z

    return p0
.end method

.method static synthetic b(Lcom/zzhoujay/richtext/drawable/d;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/zzhoujay/richtext/drawable/d;->f:Landroid/widget/TextView;

    return-object p0
.end method

.method private c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    iget v1, p0, Lcom/zzhoujay/richtext/drawable/d;->d:I

    .line 11
    .line 12
    int-to-float v1, v1

    .line 13
    div-float/2addr v0, v1

    .line 14
    iput v0, p0, Lcom/zzhoujay/richtext/drawable/d;->g:F

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-float v0, v0

    .line 25
    iget v1, p0, Lcom/zzhoujay/richtext/drawable/d;->c:I

    .line 26
    .line 27
    int-to-float v1, v1

    .line 28
    div-float/2addr v0, v1

    .line 29
    iput v0, p0, Lcom/zzhoujay/richtext/drawable/d;->h:F

    .line 30
    .line 31
    return-void
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


# virtual methods
.method public d()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/drawable/d;->c:I

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/zzhoujay/richtext/drawable/d;->b:J

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    cmp-long v2, v2, v4

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/zzhoujay/richtext/drawable/d;->b:J

    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Lcom/zzhoujay/richtext/drawable/d;->a:Landroid/graphics/Movie;

    .line 16
    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/graphics/Movie;->duration()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const/16 v2, 0x3e8

    .line 26
    .line 27
    :cond_1
    iget-wide v3, p0, Lcom/zzhoujay/richtext/drawable/d;->b:J

    .line 28
    .line 29
    sub-long/2addr v0, v3

    .line 30
    int-to-long v2, v2

    .line 31
    rem-long/2addr v0, v2

    .line 32
    long-to-int v0, v0

    .line 33
    iget-object v1, p0, Lcom/zzhoujay/richtext/drawable/d;->a:Landroid/graphics/Movie;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Landroid/graphics/Movie;->setTime(I)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v1, p0, Lcom/zzhoujay/richtext/drawable/d;->g:F

    .line 43
    .line 44
    iget v2, p0, Lcom/zzhoujay/richtext/drawable/d;->h:F

    .line 45
    .line 46
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/zzhoujay/richtext/drawable/d;->a:Landroid/graphics/Movie;

    .line 50
    .line 51
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 52
    .line 53
    int-to-float v2, v2

    .line 54
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 55
    .line 56
    int-to-float v0, v0

    .line 57
    invoke-virtual {v1, p1, v2, v0}, Landroid/graphics/Movie;->draw(Landroid/graphics/Canvas;FF)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
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

.method public e()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/drawable/d;->d:I

    return v0
.end method

.method public f(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zzhoujay/richtext/drawable/d;->e:Z

    .line 3
    .line 4
    iput-object p1, p0, Lcom/zzhoujay/richtext/drawable/d;->f:Landroid/widget/TextView;

    .line 5
    .line 6
    iget-object p1, p0, Lcom/zzhoujay/richtext/drawable/d;->j:Landroid/os/Handler;

    .line 7
    .line 8
    const/16 v0, 0x357

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 11
    .line 12
    .line 13
    return-void
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

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zzhoujay/richtext/drawable/d;->e:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/zzhoujay/richtext/drawable/d;->f:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zzhoujay/richtext/drawable/d;->a:Landroid/graphics/Movie;

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
    .line 22
    .line 23
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/drawable/d;->c:I

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/drawable/d;->d:I

    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/d;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public setBounds(IIII)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 4
    invoke-direct {p0}, Lcom/zzhoujay/richtext/drawable/d;->c()V

    return-void
.end method

.method public setBounds(Landroid/graphics/Rect;)V
    .locals 0
    .param p1    # Landroid/graphics/Rect;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 2
    invoke-direct {p0}, Lcom/zzhoujay/richtext/drawable/d;->c()V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lcom/zzhoujay/richtext/drawable/d;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method
