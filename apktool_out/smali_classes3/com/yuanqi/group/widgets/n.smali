.class public Lcom/yuanqi/group/widgets/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/widgets/n$a;
    }
.end annotation


# static fields
.field private static final k:I = -0x1


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/graphics/Paint;

.field private c:F

.field private d:Landroid/graphics/LinearGradient;

.field private e:Landroid/graphics/Matrix;

.field private f:I

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Lcom/yuanqi/group/widgets/n$a;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/graphics/Paint;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/yuanqi/group/widgets/n;->a:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/yuanqi/group/widgets/n;->b:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-direct {p0, p3}, Lcom/yuanqi/group/widgets/n;->d(Landroid/util/AttributeSet;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method private d(Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/yuanqi/group/widgets/n;->g:I

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/yuanqi/group/widgets/n;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lcom/yqtech/multiapp/R$styleable;->ShimmerView:[I

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v1, p1, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Lcom/yuanqi/group/widgets/n;->g:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :catch_0
    move-exception v0

    .line 34
    :try_start_1
    const-string v1, "ShimmerTextView"

    .line 35
    .line 36
    const-string v2, "Error while creating the view:"

    .line 37
    .line 38
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_0
    :goto_2
    new-instance p1, Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/yuanqi/group/widgets/n;->e:Landroid/graphics/Matrix;

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
.end method

.method private i()V
    .locals 10

    .line 1
    new-instance v8, Landroid/graphics/LinearGradient;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/widgets/n;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    neg-int v0, v0

    .line 10
    int-to-float v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v0, 0x3

    .line 15
    new-array v5, v0, [I

    .line 16
    .line 17
    iget v6, p0, Lcom/yuanqi/group/widgets/n;->f:I

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    aput v6, v5, v7

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    iget v9, p0, Lcom/yuanqi/group/widgets/n;->g:I

    .line 24
    .line 25
    aput v9, v5, v7

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    aput v6, v5, v7

    .line 29
    .line 30
    new-array v6, v0, [F

    .line 31
    .line 32
    fill-array-data v6, :array_0

    .line 33
    .line 34
    .line 35
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 36
    .line 37
    move-object v0, v8

    .line 38
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 39
    .line 40
    .line 41
    iput-object v8, p0, Lcom/yuanqi/group/widgets/n;->d:Landroid/graphics/LinearGradient;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/yuanqi/group/widgets/n;->b:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
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
.method public a()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/n;->c:F

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/n;->f:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/n;->g:I

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/n;->i:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/n;->h:Z

    return v0
.end method

.method public g()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/n;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/yuanqi/group/widgets/n;->b:Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/group/widgets/n;->b:Landroid/graphics/Paint;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/yuanqi/group/widgets/n;->d:Landroid/graphics/LinearGradient;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/n;->e:Landroid/graphics/Matrix;

    .line 21
    .line 22
    const/high16 v1, 0x40000000    # 2.0f

    .line 23
    .line 24
    iget v2, p0, Lcom/yuanqi/group/widgets/n;->c:F

    .line 25
    .line 26
    mul-float/2addr v2, v1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/yuanqi/group/widgets/n;->d:Landroid/graphics/LinearGradient;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/yuanqi/group/widgets/n;->e:Landroid/graphics/Matrix;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/n;->b:Landroid/graphics/Paint;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void
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

.method protected h()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/n;->i()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/n;->i:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/n;->i:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/yuanqi/group/widgets/n;->j:Lcom/yuanqi/group/widgets/n$a;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/yuanqi/group/widgets/n;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lcom/yuanqi/group/widgets/n$a;->a(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public j(Lcom/yuanqi/group/widgets/n$a;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/n;->j:Lcom/yuanqi/group/widgets/n$a;

    return-void
.end method

.method public k(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/n;->c:F

    .line 2
    .line 3
    iget-object p1, p0, Lcom/yuanqi/group/widgets/n;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 6
    .line 7
    .line 8
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public l(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/n;->f:I

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/n;->i:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/n;->i()V

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
.end method

.method public m(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/n;->g:I

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/n;->i:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/n;->i()V

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
.end method

.method public n(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/n;->h:Z

    return-void
.end method
