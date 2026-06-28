.class public Lcom/zzhoujay/richtext/drawable/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:F

.field private c:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field private d:F


# direct methods
.method public constructor <init>()V
    .locals 4

    const/high16 v0, -0x1000000

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x40a00000    # 5.0f

    .line 6
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/zzhoujay/richtext/drawable/a;-><init>(ZFIF)V

    return-void
.end method

.method public constructor <init>(Lcom/zzhoujay/richtext/drawable/a;)V
    .locals 3

    .line 7
    iget-boolean v0, p1, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    iget v1, p1, Lcom/zzhoujay/richtext/drawable/a;->b:F

    iget v2, p1, Lcom/zzhoujay/richtext/drawable/a;->c:I

    iget p1, p1, Lcom/zzhoujay/richtext/drawable/a;->d:F

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/zzhoujay/richtext/drawable/a;-><init>(ZFIF)V

    return-void
.end method

.method constructor <init>(ZFIF)V
    .locals 0
    .param p3    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    .line 3
    iput p2, p0, Lcom/zzhoujay/richtext/drawable/a;->b:F

    .line 4
    iput p3, p0, Lcom/zzhoujay/richtext/drawable/a;->c:I

    .line 5
    iput p4, p0, Lcom/zzhoujay/richtext/drawable/a;->d:F

    return-void
.end method


# virtual methods
.method a()I
    .locals 1
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    iget v0, p0, Lcom/zzhoujay/richtext/drawable/a;->c:I

    return v0
.end method

.method b()F
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/drawable/a;->b:F

    return v0
.end method

.method c()F
    .locals 1

    iget v0, p0, Lcom/zzhoujay/richtext/drawable/a;->d:F

    return v0
.end method

.method d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    return v0
.end method

.method e(Lcom/zzhoujay/richtext/drawable/a;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    .line 4
    .line 5
    iget v0, p1, Lcom/zzhoujay/richtext/drawable/a;->b:F

    .line 6
    .line 7
    iput v0, p0, Lcom/zzhoujay/richtext/drawable/a;->b:F

    .line 8
    .line 9
    iget v0, p1, Lcom/zzhoujay/richtext/drawable/a;->c:I

    .line 10
    .line 11
    iput v0, p0, Lcom/zzhoujay/richtext/drawable/a;->c:I

    .line 12
    .line 13
    iget p1, p1, Lcom/zzhoujay/richtext/drawable/a;->d:F

    .line 14
    .line 15
    iput p1, p0, Lcom/zzhoujay/richtext/drawable/a;->d:F

    .line 16
    .line 17
    return-void
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
    instance-of v1, p1, Lcom/zzhoujay/richtext/drawable/a;

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
    check-cast p1, Lcom/zzhoujay/richtext/drawable/a;

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p1, Lcom/zzhoujay/richtext/drawable/a;->b:F

    .line 21
    .line 22
    iget v3, p0, Lcom/zzhoujay/richtext/drawable/a;->b:F

    .line 23
    .line 24
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget v1, p0, Lcom/zzhoujay/richtext/drawable/a;->c:I

    .line 32
    .line 33
    iget v3, p1, Lcom/zzhoujay/richtext/drawable/a;->c:I

    .line 34
    .line 35
    if-eq v1, v3, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget p1, p1, Lcom/zzhoujay/richtext/drawable/a;->d:F

    .line 39
    .line 40
    iget v1, p0, Lcom/zzhoujay/richtext/drawable/a;->d:F

    .line 41
    .line 42
    invoke-static {p1, v1}, Ljava/lang/Float;->compare(FF)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    return v0
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

.method public f(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iput p1, p0, Lcom/zzhoujay/richtext/drawable/a;->c:I

    return-void
.end method

.method public g(F)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/richtext/drawable/a;->b:F

    return-void
.end method

.method public h(F)V
    .locals 0

    iput p1, p0, Lcom/zzhoujay/richtext/drawable/a;->d:F

    return-void
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Lcom/zzhoujay/richtext/drawable/a;->b:F

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    cmpl-float v3, v1, v2

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v4

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget v1, p0, Lcom/zzhoujay/richtext/drawable/a;->c:I

    .line 23
    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget v1, p0, Lcom/zzhoujay/richtext/drawable/a;->d:F

    .line 28
    .line 29
    cmpl-float v2, v1, v2

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    :cond_1
    add-int/2addr v0, v4

    .line 38
    return v0
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

.method public i(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/zzhoujay/richtext/drawable/a;->a:Z

    return-void
.end method
