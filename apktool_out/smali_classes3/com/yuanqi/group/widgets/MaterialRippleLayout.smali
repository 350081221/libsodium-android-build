.class public Lcom/yuanqi/group/widgets/MaterialRippleLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;,
        Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;,
        Lcom/yuanqi/group/widgets/MaterialRippleLayout$h;
    }
.end annotation


# static fields
.field private static final G:I = 0x15e

.field private static final H:I = 0x4b

.field private static final I:F = 35.0f

.field private static final J:F = 0.2f

.field private static final K:I = -0x1000000

.field private static final L:I = 0x0

.field private static final M:Z = true

.field private static final s0:Z = true

.field private static final t0:Z = false

.field private static final u0:Z = false

.field private static final v0:Z = false

.field private static final w0:I = 0x0

.field private static final x0:I = 0x32

.field private static final y0:J = 0x9c4L


# instance fields
.field private A:Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;

.field private B:Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;

.field private C:Z

.field private D:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Lcom/yuanqi/group/widgets/MaterialRippleLayout;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private E:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Lcom/yuanqi/group/widgets/MaterialRippleLayout;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private F:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Rect;

.field private c:I

.field private d:Z

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private j:I

.field private k:Z

.field private l:Landroid/graphics/drawable/Drawable;

.field private m:Z

.field private n:F

.field private o:F

.field private p:Landroid/widget/AdapterView;

.field private q:Landroid/view/View;

.field private r:Landroid/animation/AnimatorSet;

.field private s:Landroid/animation/ObjectAnimator;

.field private t:Landroid/graphics/Point;

.field private u:Landroid/graphics/Point;

.field private v:I

.field private w:Z

.field private x:Z

.field private y:I

.field private z:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    .line 5
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    .line 6
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 7
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->u:Landroid/graphics/Point;

    .line 8
    new-instance v1, Lcom/yuanqi/group/widgets/MaterialRippleLayout$a;

    const-class v2, Ljava/lang/Float;

    const-string v3, "radius"

    invoke-direct {v1, p0, v2, v3}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$a;-><init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->D:Landroid/util/Property;

    .line 9
    new-instance v1, Lcom/yuanqi/group/widgets/MaterialRippleLayout$b;

    const-class v2, Ljava/lang/Integer;

    const-string v3, "rippleAlpha"

    invoke-direct {v1, p0, v2, v3}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$b;-><init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->E:Landroid/util/Property;

    .line 10
    new-instance v1, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;

    invoke-direct {v1, p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;-><init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->F:Landroid/view/GestureDetector$SimpleOnGestureListener;

    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 12
    new-instance v2, Landroid/view/GestureDetector;

    iget-object v3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->F:Landroid/view/GestureDetector$SimpleOnGestureListener;

    invoke-direct {v2, p1, v3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->z:Landroid/view/GestureDetector;

    .line 13
    sget-object v2, Lcom/yqtech/multiapp/R$styleable;->MaterialRippleLayout:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x2

    const/high16 v2, -0x1000000

    .line 14
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->c:I

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/high16 v2, 0x420c0000    # 35.0f

    invoke-static {p2, v2}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->r(Landroid/content/res/Resources;F)F

    move-result p2

    float-to-int p2, p2

    const/4 v2, 0x4

    .line 16
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->f:I

    const/16 p2, 0x9

    .line 17
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->d:Z

    const/4 p2, 0x7

    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->e:Z

    const/4 p2, 0x5

    const/16 v2, 0x15e

    .line 19
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->g:I

    const p2, 0x3e4ccccd    # 0.2f

    .line 20
    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr p2, v2

    float-to-int p2, p2

    iput p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h:I

    const/4 p2, 0x3

    .line 21
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->i:Z

    const/4 p2, 0x6

    const/16 v2, 0x4b

    .line 22
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->j:I

    .line 23
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-direct {p2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    const/16 p2, 0xa

    .line 24
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->k:Z

    const/16 p2, 0x8

    .line 25
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->m:Z

    const/16 p2, 0xb

    .line 26
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->n:F

    .line 27
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    iget p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->c:I

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    iget p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h:I

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 30
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->s()V

    return-void
.end method

.method private A()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->s:Landroid/animation/ObjectAnimator;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-double v0, v0

    .line 18
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    int-to-double v4, v4

    .line 29
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    add-double/2addr v0, v2

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    const-wide v2, 0x3ff3333340000000L    # 1.2000000476837158

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    mul-double/2addr v0, v2

    .line 44
    double-to-float v0, v0

    .line 45
    iget-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->D:Landroid/util/Property;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    new-array v2, v2, [F

    .line 49
    .line 50
    iget v3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->f:I

    .line 51
    .line 52
    int-to-float v3, v3

    .line 53
    const/4 v4, 0x0

    .line 54
    aput v3, v2, v4

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    aput v0, v2, v3

    .line 58
    .line 59
    invoke-static {p0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-wide/16 v1, 0x9c4

    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->s:Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 72
    .line 73
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->s:Landroid/animation/ObjectAnimator;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 82
    .line 83
    .line 84
    return-void
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

.method private B(Ljava/lang/Runnable;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->getEndRadius()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->p()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->r:Landroid/animation/AnimatorSet;

    .line 19
    .line 20
    new-instance v2, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;

    .line 21
    .line 22
    invoke-direct {v2, p0, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$e;-><init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->D:Landroid/util/Property;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    new-array v2, v1, [F

    .line 32
    .line 33
    iget v3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->o:F

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    aput v3, v2, v4

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    aput v0, v2, v3

    .line 40
    .line 41
    invoke-static {p0, p1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->g:I

    .line 46
    .line 47
    int-to-long v5, v2

    .line 48
    invoke-virtual {p1, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 49
    .line 50
    .line 51
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 52
    .line 53
    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->E:Landroid/util/Property;

    .line 60
    .line 61
    new-array v5, v1, [I

    .line 62
    .line 63
    iget v6, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h:I

    .line 64
    .line 65
    aput v6, v5, v4

    .line 66
    .line 67
    aput v4, v5, v3

    .line 68
    .line 69
    invoke-static {p0, v2, v5}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget v5, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->j:I

    .line 74
    .line 75
    int-to-long v5, v5

    .line 76
    invoke-virtual {v2, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 77
    .line 78
    .line 79
    new-instance v5, Landroid/view/animation/AccelerateInterpolator;

    .line 80
    .line 81
    invoke-direct {v5}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 85
    .line 86
    .line 87
    iget v5, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->g:I

    .line 88
    .line 89
    iget v6, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->j:I

    .line 90
    .line 91
    sub-int/2addr v5, v6

    .line 92
    add-int/lit8 v5, v5, -0x32

    .line 93
    .line 94
    int-to-long v5, v5

    .line 95
    invoke-virtual {v2, v5, v6}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 96
    .line 97
    .line 98
    iget-boolean v5, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->k:Z

    .line 99
    .line 100
    if-eqz v5, :cond_1

    .line 101
    .line 102
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->r:Landroid/animation/AnimatorSet;

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->getRadius()F

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    cmpl-float v0, v5, v0

    .line 113
    .line 114
    if-lez v0, :cond_2

    .line 115
    .line 116
    const-wide/16 v0, 0x0

    .line 117
    .line 118
    invoke-virtual {v2, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->r:Landroid/animation/AnimatorSet;

    .line 122
    .line 123
    invoke-virtual {p1, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->r:Landroid/animation/AnimatorSet;

    .line 128
    .line 129
    new-array v1, v1, [Landroid/animation/Animator;

    .line 130
    .line 131
    aput-object p1, v1, v4

    .line 132
    .line 133
    aput-object v2, v1, v3

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 136
    .line 137
    .line 138
    :goto_0
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->r:Landroid/animation/AnimatorSet;

    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 141
    .line 142
    .line 143
    return-void
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

.method static synthetic a(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)F
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->getRadius()F

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->C:Z

    return p0
.end method

.method static synthetic c(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->m:Z

    return p0
.end method

.method static synthetic d(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->C:Z

    return p1
.end method

.method static synthetic e(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/widget/AdapterView;
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->u()Landroid/widget/AdapterView;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->x:Z

    return p1
.end method

.method static synthetic g(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->A()V

    return-void
.end method

.method private getEndRadius()F
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    div-int/lit8 v2, v0, 0x2

    .line 10
    .line 11
    div-int/lit8 v3, v1, 0x2

    .line 12
    .line 13
    iget-object v4, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 14
    .line 15
    iget v5, v4, Landroid/graphics/Point;->x:I

    .line 16
    .line 17
    if-le v2, v5, :cond_0

    .line 18
    .line 19
    sub-int/2addr v0, v5

    .line 20
    int-to-float v0, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    int-to-float v0, v5

    .line 23
    :goto_0
    iget v2, v4, Landroid/graphics/Point;->y:I

    .line 24
    .line 25
    if-le v3, v2, :cond_1

    .line 26
    .line 27
    sub-int/2addr v1, v2

    .line 28
    int-to-float v1, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    int-to-float v1, v2

    .line 31
    :goto_1
    float-to-double v2, v0

    .line 32
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 33
    .line 34
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    float-to-double v0, v1

    .line 39
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    add-double/2addr v2, v0

    .line 44
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    double-to-float v0, v0

    .line 49
    const v1, 0x3f99999a    # 1.2f

    .line 50
    .line 51
    .line 52
    mul-float/2addr v0, v1

    .line 53
    return v0
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

.method private getRadius()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->o:F

    return v0
.end method

.method static synthetic h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    return-object p0
.end method

.method static synthetic i(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->e:Z

    return p0
.end method

.method static synthetic j(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic k(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q()V

    return-void
.end method

.method static synthetic l(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->k:Z

    return p0
.end method

.method static synthetic m(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)I
    .locals 0

    iget p0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h:I

    return p0
.end method

.method static synthetic n(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->i:Z

    return p0
.end method

.method private o()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->m:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->u()Landroid/widget/AdapterView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->y:I

    .line 15
    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, v1

    .line 21
    :goto_0
    iput v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->y:I

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->p()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-virtual {p0, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->setRadius(F)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return v2

    .line 41
    :cond_2
    return v1
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

.method private p()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->r:Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->r:Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->s:Landroid/animation/ObjectAnimator;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method private q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B:Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->x:Z

    .line 10
    .line 11
    :cond_0
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
.end method

.method static r(Landroid/content/res/Resources;F)F
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    return p0
.end method

.method private s()V
    .locals 0

    return-void
.end method

.method private t(Landroid/view/View;II)Z
    .locals 5

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_4

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    iget p1, v3, Landroid/graphics/Rect;->left:I

    .line 34
    .line 35
    sub-int/2addr p2, p1

    .line 36
    iget p1, v3, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    sub-int/2addr p3, p1

    .line 39
    invoke-direct {p0, v2, p2, p3}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t(Landroid/view/View;II)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 48
    .line 49
    if-eq p1, p2, :cond_4

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-nez p2, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->isLongClickable()Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-nez p2, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/View;->isFocusableInTouchMode()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    :cond_2
    const/4 v1, 0x1

    .line 76
    :cond_3
    return v1

    .line 77
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->isFocusableInTouchMode()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    return p1
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

.method private u()Landroid/widget/AdapterView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->p:Landroid/widget/AdapterView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    instance-of v1, v0, Landroid/widget/AdapterView;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast v0, Landroid/widget/AdapterView;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->p:Landroid/widget/AdapterView;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v1, "Could not find a parent AdapterView"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
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

.method private v()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    return v0
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

.method public static w(Landroid/view/View;)Lcom/yuanqi/group/widgets/MaterialRippleLayout$h;
    .locals 1

    new-instance v0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$h;

    invoke-direct {v0, p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$h;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method private z()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->u()Landroid/widget/AdapterView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->y:I

    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string p2, "MaterialRippleLayout can host only one child"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
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

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 17
    .line 18
    .line 19
    if-nez v0, :cond_4

    .line 20
    .line 21
    iget v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->n:F

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    cmpl-float v0, v0, v1

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Landroid/graphics/Path;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v2, Landroid/graphics/RectF;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    int-to-float v3, v3

    .line 40
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    int-to-float v4, v4

    .line 45
    invoke-direct {v2, v1, v1, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->n:F

    .line 49
    .line 50
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 51
    .line 52
    invoke-virtual {v0, v2, v1, v1, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 59
    .line 60
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 61
    .line 62
    int-to-float v1, v1

    .line 63
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 64
    .line 65
    int-to-float v0, v0

    .line 66
    iget v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->o:F

    .line 67
    .line 68
    iget-object v3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    if-nez v0, :cond_3

    .line 75
    .line 76
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 82
    .line 83
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 84
    .line 85
    int-to-float v1, v1

    .line 86
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 87
    .line 88
    int-to-float v0, v0

    .line 89
    iget v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->o:F

    .line 90
    .line 91
    iget-object v3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    .line 92
    .line 93
    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_0
    return-void
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

.method public getChildView()Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    return-object v0
.end method

.method public getRippleAlpha()I
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    return v0
.end method

.method public isInEditMode()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-direct {p0, v0, v1, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t(Landroid/view/View;II)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    .line 5
    .line 6
    const/4 p4, 0x0

    .line 7
    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    iget-object p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 15
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

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_13

    .line 10
    .line 11
    iget-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    float-to-int v1, v1

    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    float-to-int v2, v2

    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->u:Landroid/graphics/Point;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 42
    .line 43
    iget v3, v2, Landroid/graphics/Point;->x:I

    .line 44
    .line 45
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 46
    .line 47
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    float-to-int v2, v2

    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    float-to-int v3, v3

    .line 62
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Point;->set(II)V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->z:Landroid/view/GestureDetector;

    .line 66
    .line 67
    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x1

    .line 72
    if-nez v1, :cond_12

    .line 73
    .line 74
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->C:Z

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/4 v3, 0x0

    .line 85
    if-eqz v1, :cond_10

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    if-eq v1, v2, :cond_b

    .line 89
    .line 90
    const/4 v5, 0x2

    .line 91
    if-eq v1, v5, :cond_7

    .line 92
    .line 93
    const/4 v0, 0x3

    .line 94
    if-eq v1, v0, :cond_3

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_3
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->m:Z

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 103
    .line 104
    iget-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->u:Landroid/graphics/Point;

    .line 105
    .line 106
    iget v5, v1, Landroid/graphics/Point;->x:I

    .line 107
    .line 108
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 109
    .line 110
    invoke-virtual {v0, v5, v1}, Landroid/graphics/Point;->set(II)V

    .line 111
    .line 112
    .line 113
    new-instance v0, Landroid/graphics/Point;

    .line 114
    .line 115
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->u:Landroid/graphics/Point;

    .line 119
    .line 120
    :cond_4
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 121
    .line 122
    invoke-virtual {v0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 123
    .line 124
    .line 125
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->e:Z

    .line 126
    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->x:Z

    .line 130
    .line 131
    if-nez p1, :cond_6

    .line 132
    .line 133
    invoke-direct {p0, v4}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B(Ljava/lang/Runnable;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_5
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 138
    .line 139
    invoke-virtual {p1, v3}, Landroid/view/View;->setPressed(Z)V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_0
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q()V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_3

    .line 146
    .line 147
    :cond_7
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->e:Z

    .line 148
    .line 149
    if-eqz v1, :cond_9

    .line 150
    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->w:Z

    .line 154
    .line 155
    if-nez v1, :cond_8

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_8
    if-nez v0, :cond_9

    .line 162
    .line 163
    invoke-direct {p0, v4}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B(Ljava/lang/Runnable;)V

    .line 164
    .line 165
    .line 166
    :cond_9
    :goto_1
    if-nez v0, :cond_12

    .line 167
    .line 168
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q()V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->s:Landroid/animation/ObjectAnimator;

    .line 172
    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 176
    .line 177
    .line 178
    :cond_a
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 181
    .line 182
    .line 183
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->w:Z

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_b
    new-instance p1, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;

    .line 187
    .line 188
    invoke-direct {p1, p0, v4}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;-><init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Lcom/yuanqi/group/widgets/MaterialRippleLayout$a;)V

    .line 189
    .line 190
    .line 191
    iput-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->A:Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;

    .line 192
    .line 193
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->x:Z

    .line 194
    .line 195
    if-eqz p1, :cond_c

    .line 196
    .line 197
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 198
    .line 199
    invoke-virtual {p1, v2}, Landroid/view/View;->setPressed(Z)V

    .line 200
    .line 201
    .line 202
    new-instance p1, Lcom/yuanqi/group/widgets/MaterialRippleLayout$d;

    .line 203
    .line 204
    invoke-direct {p1, p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$d;-><init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V

    .line 205
    .line 206
    .line 207
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    int-to-long v3, v1

    .line 212
    invoke-virtual {p0, p1, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 213
    .line 214
    .line 215
    :cond_c
    if-eqz v0, :cond_d

    .line 216
    .line 217
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->A:Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;

    .line 218
    .line 219
    invoke-direct {p0, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B(Ljava/lang/Runnable;)V

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_d
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->e:Z

    .line 224
    .line 225
    if-nez p1, :cond_e

    .line 226
    .line 227
    const/4 p1, 0x0

    .line 228
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->setRadius(F)V

    .line 229
    .line 230
    .line 231
    :cond_e
    :goto_2
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->i:Z

    .line 232
    .line 233
    if-nez p1, :cond_f

    .line 234
    .line 235
    if-eqz v0, :cond_f

    .line 236
    .line 237
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->A:Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;

    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->run()V

    .line 240
    .line 241
    .line 242
    :cond_f
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q()V

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_10
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->z()V

    .line 247
    .line 248
    .line 249
    iput-boolean v3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->w:Z

    .line 250
    .line 251
    new-instance v0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;

    .line 252
    .line 253
    invoke-direct {v0, p0, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;-><init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Landroid/view/MotionEvent;)V

    .line 254
    .line 255
    .line 256
    iput-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B:Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;

    .line 257
    .line 258
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->v()Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eqz p1, :cond_11

    .line 263
    .line 264
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q()V

    .line 265
    .line 266
    .line 267
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->x:Z

    .line 268
    .line 269
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B:Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;

    .line 270
    .line 271
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    int-to-long v0, v0

    .line 276
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_11
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B:Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;

    .line 281
    .line 282
    invoke-virtual {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->run()V

    .line 283
    .line 284
    .line 285
    :cond_12
    :goto_3
    return v2

    .line 286
    :cond_13
    :goto_4
    return v0
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

.method public setDefaultRippleAlpha(F)V
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float/2addr p1, v0

    .line 4
    float-to-int p1, p1

    .line 5
    iput p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v0, "MaterialRippleLayout must have a child view to handle clicks"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

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

.method public setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->q:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v0, "MaterialRippleLayout must have a child view to handle clicks"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

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

.method public setRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->o:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public setRippleAlpha(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setRippleBackground(I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->l:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->b:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public setRippleColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->c:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->a:Landroid/graphics/Paint;

    .line 9
    .line 10
    iget v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h:I

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public setRippleDelayClick(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->i:Z

    return-void
.end method

.method public setRippleDiameter(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->f:I

    return-void
.end method

.method public setRippleDuration(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->g:I

    return-void
.end method

.method public setRippleFadeDuration(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->j:I

    return-void
.end method

.method public setRippleHover(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->e:Z

    return-void
.end method

.method public setRippleInAdapter(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->m:Z

    return-void
.end method

.method public setRippleOverlay(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->d:Z

    return-void
.end method

.method public setRipplePersistent(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->k:Z

    return-void
.end method

.method public setRippleRoundedCorners(I)V
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->n:F

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->s()V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method public x()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Point;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    div-int/lit8 v1, v1, 0x2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    div-int/lit8 v2, v2, 0x2

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
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
.end method

.method public y(Landroid/graphics/Point;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Point;

    .line 2
    .line 3
    iget v1, p1, Landroid/graphics/Point;->x:I

    .line 4
    .line 5
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, Landroid/graphics/Point;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->t:Landroid/graphics/Point;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-direct {p0, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->B(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
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
