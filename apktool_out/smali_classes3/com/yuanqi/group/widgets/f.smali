.class public abstract Lcom/yuanqi/group/widgets/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final t:I = 0x258

.field public static final u:I = 0x2

.field public static final v:I = -0x1


# instance fields
.field private final a:I

.field private final b:I

.field private c:F

.field private d:F

.field private e:I

.field private f:Z

.field private g:Z

.field private h:I

.field private i:[Landroid/view/View;

.field private j:F

.field private k:Lcom/yuanqi/group/widgets/CardStackLayout;

.field private l:Z

.field private m:F

.field private n:F

.field private o:F

.field private p:I

.field private q:F

.field private r:I

.field private s:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/f;->l:Z

    .line 6
    .line 7
    const/high16 v1, -0x40800000    # -1.0f

    .line 8
    .line 9
    iput v1, p0, Lcom/yuanqi/group/widgets/f;->m:F

    .line 10
    .line 11
    iput v1, p0, Lcom/yuanqi/group/widgets/f;->n:F

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, p0, Lcom/yuanqi/group/widgets/f;->o:F

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    iput v1, p0, Lcom/yuanqi/group/widgets/f;->p:I

    .line 18
    .line 19
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->r:I

    .line 20
    .line 21
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->s:I

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 36
    .line 37
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->a:I

    .line 38
    .line 39
    const v0, 0x7f07009b

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    float-to-int v0, v0

    .line 47
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->b:I

    .line 48
    .line 49
    const v0, 0x7f07009c

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    float-to-int v1, v1

    .line 57
    int-to-float v1, v1

    .line 58
    iput v1, p0, Lcom/yuanqi/group/widgets/f;->q:F

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    float-to-int p1, p1

    .line 65
    int-to-float p1, p1

    .line 66
    iput p1, p0, Lcom/yuanqi/group/widgets/f;->j:F

    .line 67
    .line 68
    return-void
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

.method public static synthetic a(Lcom/yuanqi/group/widgets/f;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/group/widgets/f;->o(Landroid/view/View;)V

    return-void
.end method

.method static synthetic b(Lcom/yuanqi/group/widgets/f;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/group/widgets/f;->t(Z)V

    return-void
.end method

.method static synthetic c(Lcom/yuanqi/group/widgets/f;I)I
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/f;->p:I

    return p1
.end method

.method private synthetic o(Landroid/view/View;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/yuanqi/group/widgets/f;->t(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/yuanqi/group/widgets/f;->k:Lcom/yuanqi/group/widgets/CardStackLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/yuanqi/group/widgets/CardStackLayout;->getOnCardSelectedListener()Lcom/yuanqi/group/widgets/CardStackLayout$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/group/widgets/f;->k:Lcom/yuanqi/group/widgets/CardStackLayout;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/yuanqi/group/widgets/CardStackLayout;->getOnCardSelectedListener()Lcom/yuanqi/group/widgets/CardStackLayout$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, p0, Lcom/yuanqi/group/widgets/f;->p:I

    .line 20
    .line 21
    invoke-interface {v0, p1, v1}, Lcom/yuanqi/group/widgets/CardStackLayout$a;->a(Landroid/view/View;I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method private p(IF)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p2, v0

    .line 3
    .line 4
    if-ltz v0, :cond_3

    .line 5
    .line 6
    if-ltz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lt p1, v0, :cond_0

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ge p1, v0, :cond_3

    .line 20
    .line 21
    iget-object v0, p0, Lcom/yuanqi/group/widgets/f;->i:[Landroid/view/View;

    .line 22
    .line 23
    aget-object v0, v0, p1

    .line 24
    .line 25
    iget v1, p0, Lcom/yuanqi/group/widgets/f;->q:F

    .line 26
    .line 27
    div-float v1, p2, v1

    .line 28
    .line 29
    iget-boolean v2, p0, Lcom/yuanqi/group/widgets/f;->f:Z

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget v2, p0, Lcom/yuanqi/group/widgets/f;->e:I

    .line 34
    .line 35
    if-lez v2, :cond_1

    .line 36
    .line 37
    div-int/lit8 v2, v2, 0x3

    .line 38
    .line 39
    int-to-float v2, v2

    .line 40
    mul-float/2addr v1, v2

    .line 41
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    sub-int/2addr v2, p1

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    mul-int/lit8 v2, v2, -0x1

    .line 50
    .line 51
    div-int/lit8 v2, v2, 0x3

    .line 52
    .line 53
    mul-int/2addr v2, p1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    mul-int/lit8 v2, v2, 0x2

    .line 60
    .line 61
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    :goto_2
    int-to-float v2, v2

    .line 64
    mul-float/2addr v1, v2

    .line 65
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/f;->i(I)F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    add-float/2addr v2, v1

    .line 70
    invoke-virtual {v0, v2}, Landroid/view/View;->setY(F)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    :goto_3
    return-void
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

.method private t(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/f;->l:Z

    return-void
.end method

.method private u(Ljava/util/List;Ljava/lang/Runnable;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/lang/Runnable;",
            "Z)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x258

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 12
    .line 13
    .line 14
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    .line 15
    .line 16
    const/high16 v1, 0x40000000    # 2.0f

    .line 17
    .line 18
    invoke-direct {p1, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lcom/yuanqi/group/widgets/f$a;

    .line 25
    .line 26
    invoke-direct {p1, p0, p2, p3}, Lcom/yuanqi/group/widgets/f$a;-><init>(Lcom/yuanqi/group/widgets/f;Ljava/lang/Runnable;Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 33
    .line 34
    .line 35
    return-void
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


# virtual methods
.method d(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/f;->k:Lcom/yuanqi/group/widgets/CardStackLayout;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/yuanqi/group/widgets/f;->e(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 8
    .line 9
    .line 10
    const v1, 0x7f0900d5

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, p0, Lcom/yuanqi/group/widgets/f;->s:I

    .line 30
    .line 31
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    iget v3, p0, Lcom/yuanqi/group/widgets/f;->h:I

    .line 35
    .line 36
    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/f;->g:Z

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/f;->g(I)F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {p0, v1}, Lcom/yuanqi/group/widgets/f;->t(Z)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/f;->i(I)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iget v2, p0, Lcom/yuanqi/group/widgets/f;->r:I

    .line 63
    .line 64
    int-to-float v2, v2

    .line 65
    sub-float/2addr v1, v2

    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-direct {p0, v1}, Lcom/yuanqi/group/widgets/f;->t(Z)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-object v1, p0, Lcom/yuanqi/group/widgets/f;->i:[Landroid/view/View;

    .line 74
    .line 75
    aput-object v0, v1, p1

    .line 76
    .line 77
    iget-object p1, p0, Lcom/yuanqi/group/widgets/f;->k:Lcom/yuanqi/group/widgets/CardStackLayout;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    return-void
    .line 83
    .line 84
    .line 85
.end method

.method public abstract e(ILandroid/view/ViewGroup;)Landroid/view/View;
.end method

.method protected f(Landroid/view/View;II)Landroid/animation/Animator;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq p2, p3, :cond_0

    .line 5
    .line 6
    sget-object p3, Landroid/view/View;->Y:Landroid/util/Property;

    .line 7
    .line 8
    new-array v1, v1, [F

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    float-to-int v3, v3

    .line 15
    int-to-float v3, v3

    .line 16
    aput v3, v1, v2

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/yuanqi/group/widgets/f;->g(I)F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    aput p2, v1, v0

    .line 23
    .line 24
    invoke-static {p1, p3, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    sget-object p3, Landroid/view/View;->Y:Landroid/util/Property;

    .line 30
    .line 31
    new-array v1, v1, [F

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    float-to-int v3, v3

    .line 38
    int-to-float v3, v3

    .line 39
    aput v3, v1, v2

    .line 40
    .line 41
    invoke-virtual {p0, v2}, Lcom/yuanqi/group/widgets/f;->i(I)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    int-to-float p2, p2

    .line 46
    iget v3, p0, Lcom/yuanqi/group/widgets/f;->c:F

    .line 47
    .line 48
    mul-float/2addr p2, v3

    .line 49
    add-float/2addr v2, p2

    .line 50
    aput v2, v1, v0

    .line 51
    .line 52
    invoke-static {p1, p3, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
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

.method protected g(I)F
    .locals 2

    iget v0, p0, Lcom/yuanqi/group/widgets/f;->a:I

    iget v1, p0, Lcom/yuanqi/group/widgets/f;->b:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    move-result v1

    sub-int/2addr v1, p1

    int-to-float p1, v1

    iget v1, p0, Lcom/yuanqi/group/widgets/f;->c:F

    mul-float/2addr p1, v1

    sub-float/2addr v0, p1

    iget p1, p0, Lcom/yuanqi/group/widgets/f;->s:I

    int-to-float p1, p1

    sub-float/2addr v0, p1

    return v0
.end method

.method protected h()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/f;->c:F

    return v0
.end method

.method protected i(I)F
    .locals 2

    iget v0, p0, Lcom/yuanqi/group/widgets/f;->r:I

    int-to-float v0, v0

    iget v1, p0, Lcom/yuanqi/group/widgets/f;->d:F

    int-to-float p1, p1

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public j(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/f;->i:[Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    aget-object p1, v0, p1

    .line 8
    .line 9
    return-object p1
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

.method public abstract k()I
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/f;->p:I

    return v0
.end method

.method public m()Z
    .locals 2

    iget v0, p0, Lcom/yuanqi/group/widgets/f;->p:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/f;->l:Z

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, Lcom/yuanqi/group/widgets/f;->t(Z)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/yuanqi/group/widgets/f;->p:I

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    if-ne v1, v2, :cond_2

    .line 16
    .line 17
    const v1, 0x7f0900d5

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iput v1, p0, Lcom/yuanqi/group/widgets/f;->p:I

    .line 31
    .line 32
    new-instance v1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    move v2, v0

    .line 42
    :goto_0
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-ge v2, v3, :cond_1

    .line 47
    .line 48
    iget-object v3, p0, Lcom/yuanqi/group/widgets/f;->i:[Landroid/view/View;

    .line 49
    .line 50
    aget-object v3, v3, v2

    .line 51
    .line 52
    iget v4, p0, Lcom/yuanqi/group/widgets/f;->p:I

    .line 53
    .line 54
    invoke-virtual {p0, v3, v2, v4}, Lcom/yuanqi/group/widgets/f;->f(Landroid/view/View;II)Landroid/animation/Animator;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    new-instance v2, Lcom/yuanqi/group/widgets/e;

    .line 65
    .line 66
    invoke-direct {v2, p0, p1}, Lcom/yuanqi/group/widgets/e;-><init>(Lcom/yuanqi/group/widgets/f;Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, v1, v2, v0}, Lcom/yuanqi/group/widgets/f;->u(Ljava/util/List;Ljava/lang/Runnable;Z)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void
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

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const v2, 0x7f0900d5

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/high16 v4, -0x40800000    # -1.0f

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz p2, :cond_5

    .line 35
    .line 36
    const/4 v6, -0x1

    .line 37
    if-eq p2, v5, :cond_3

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    if-eq p2, v7, :cond_1

    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    if-eq p2, v2, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget p1, p0, Lcom/yuanqi/group/widgets/f;->p:I

    .line 47
    .line 48
    if-ne p1, v6, :cond_2

    .line 49
    .line 50
    iget p1, p0, Lcom/yuanqi/group/widgets/f;->m:F

    .line 51
    .line 52
    sub-float p1, v0, p1

    .line 53
    .line 54
    invoke-direct {p0, v2, p1}, Lcom/yuanqi/group/widgets/f;->p(IF)V

    .line 55
    .line 56
    .line 57
    :cond_2
    iget p1, p0, Lcom/yuanqi/group/widgets/f;->o:F

    .line 58
    .line 59
    iget p2, p0, Lcom/yuanqi/group/widgets/f;->n:F

    .line 60
    .line 61
    sub-float/2addr v0, p2

    .line 62
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    add-float/2addr p1, p2

    .line 67
    iput p1, p0, Lcom/yuanqi/group/widgets/f;->o:F

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget p2, p0, Lcom/yuanqi/group/widgets/f;->o:F

    .line 71
    .line 72
    iget v2, p0, Lcom/yuanqi/group/widgets/f;->j:F

    .line 73
    .line 74
    cmpg-float p2, p2, v2

    .line 75
    .line 76
    if-gez p2, :cond_4

    .line 77
    .line 78
    iget p2, p0, Lcom/yuanqi/group/widgets/f;->m:F

    .line 79
    .line 80
    sub-float/2addr v0, p2

    .line 81
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    iget v0, p0, Lcom/yuanqi/group/widgets/f;->j:F

    .line 86
    .line 87
    cmpg-float p2, p2, v0

    .line 88
    .line 89
    if-gez p2, :cond_4

    .line 90
    .line 91
    iget p2, p0, Lcom/yuanqi/group/widgets/f;->p:I

    .line 92
    .line 93
    if-ne p2, v6, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/f;->onClick(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->q()V

    .line 100
    .line 101
    .line 102
    :goto_0
    iput v4, p0, Lcom/yuanqi/group/widgets/f;->m:F

    .line 103
    .line 104
    iput v4, p0, Lcom/yuanqi/group/widgets/f;->n:F

    .line 105
    .line 106
    iput v3, p0, Lcom/yuanqi/group/widgets/f;->o:F

    .line 107
    .line 108
    return v1

    .line 109
    :cond_5
    iget p1, p0, Lcom/yuanqi/group/widgets/f;->m:F

    .line 110
    .line 111
    cmpl-float p1, p1, v4

    .line 112
    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    return v1

    .line 116
    :cond_6
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->m:F

    .line 117
    .line 118
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->n:F

    .line 119
    .line 120
    iput v3, p0, Lcom/yuanqi/group/widgets/f;->o:F

    .line 121
    .line 122
    :goto_1
    return v5
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

.method public q()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/yuanqi/group/widgets/f;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public r(Ljava/lang/Runnable;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ge v2, v3, :cond_0

    .line 18
    .line 19
    iget-object v3, p0, Lcom/yuanqi/group/widgets/f;->i:[Landroid/view/View;

    .line 20
    .line 21
    aget-object v3, v3, v2

    .line 22
    .line 23
    sget-object v5, Landroid/view/View;->Y:Landroid/util/Property;

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    new-array v6, v6, [F

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/view/View;->getY()F

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    float-to-int v7, v7

    .line 33
    int-to-float v7, v7

    .line 34
    aput v7, v6, v1

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lcom/yuanqi/group/widgets/f;->i(I)F

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    aput v7, v6, v4

    .line 41
    .line 42
    invoke-static {v3, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-direct {p0, v0, p1, v4}, Lcom/yuanqi/group/widgets/f;->u(Ljava/util/List;Ljava/lang/Runnable;Z)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method s(Lcom/yuanqi/group/widgets/CardStackLayout;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/widgets/f;->k:Lcom/yuanqi/group/widgets/CardStackLayout;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [Landroid/view/View;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/yuanqi/group/widgets/f;->i:[Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/CardStackLayout;->getCardGapBottom()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->c:F

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/CardStackLayout;->getCardGap()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->d:F

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/CardStackLayout;->getParallaxScale()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lcom/yuanqi/group/widgets/f;->e:I

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/CardStackLayout;->c()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/f;->f:Z

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget v0, p0, Lcom/yuanqi/group/widgets/f;->e:I

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/f;->f:Z

    .line 43
    .line 44
    :cond_0
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/CardStackLayout;->d()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/f;->g:Z

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput p1, p0, Lcom/yuanqi/group/widgets/f;->r:I

    .line 55
    .line 56
    iget p1, p0, Lcom/yuanqi/group/widgets/f;->a:I

    .line 57
    .line 58
    iget v0, p0, Lcom/yuanqi/group/widgets/f;->b:I

    .line 59
    .line 60
    sub-int/2addr p1, v0

    .line 61
    int-to-float p1, p1

    .line 62
    iget v0, p0, Lcom/yuanqi/group/widgets/f;->j:F

    .line 63
    .line 64
    sub-float/2addr p1, v0

    .line 65
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    int-to-float v0, v0

    .line 70
    iget v1, p0, Lcom/yuanqi/group/widgets/f;->c:F

    .line 71
    .line 72
    mul-float/2addr v0, v1

    .line 73
    sub-float/2addr p1, v0

    .line 74
    float-to-int p1, p1

    .line 75
    iput p1, p0, Lcom/yuanqi/group/widgets/f;->h:I

    .line 76
    .line 77
    return-void
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method
