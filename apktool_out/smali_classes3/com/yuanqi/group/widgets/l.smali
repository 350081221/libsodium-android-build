.class public Lcom/yuanqi/group/widgets/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:I = 0x0

.field public static final h:I = 0x1

.field private static final i:I = -0x1

.field private static final j:J = 0x3e8L

.field private static final k:J

.field private static final l:I


# instance fields
.field private a:I

.field private b:J

.field private c:J

.field private d:I

.field private e:Landroid/animation/Animator$AnimatorListener;

.field private f:Landroid/animation/ObjectAnimator;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/yuanqi/group/widgets/l;->a:I

    .line 6
    .line 7
    const-wide/16 v0, 0x3e8

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/yuanqi/group/widgets/l;->b:J

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/yuanqi/group/widgets/l;->c:J

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lcom/yuanqi/group/widgets/l;->d:I

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method static synthetic a(Lcom/yuanqi/group/widgets/l;)I
    .locals 0

    iget p0, p0, Lcom/yuanqi/group/widgets/l;->d:I

    return p0
.end method

.method static synthetic b(Lcom/yuanqi/group/widgets/l;)Landroid/animation/ObjectAnimator;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/widgets/l;->f:Landroid/animation/ObjectAnimator;

    return-object p0
.end method

.method static synthetic c(Lcom/yuanqi/group/widgets/l;Landroid/animation/ObjectAnimator;)Landroid/animation/ObjectAnimator;
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/l;->f:Landroid/animation/ObjectAnimator;

    return-object p1
.end method

.method static synthetic d(Lcom/yuanqi/group/widgets/l;)I
    .locals 0

    iget p0, p0, Lcom/yuanqi/group/widgets/l;->a:I

    return p0
.end method

.method static synthetic e(Lcom/yuanqi/group/widgets/l;)J
    .locals 2

    iget-wide v0, p0, Lcom/yuanqi/group/widgets/l;->b:J

    return-wide v0
.end method

.method static synthetic f(Lcom/yuanqi/group/widgets/l;)J
    .locals 2

    iget-wide v0, p0, Lcom/yuanqi/group/widgets/l;->c:J

    return-wide v0
.end method

.method static synthetic g(Lcom/yuanqi/group/widgets/l;)Landroid/animation/Animator$AnimatorListener;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/widgets/l;->e:Landroid/animation/Animator$AnimatorListener;

    return-object p0
.end method


# virtual methods
.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/l;->f:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

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

.method public i()Landroid/animation/Animator$AnimatorListener;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/l;->e:Landroid/animation/Animator$AnimatorListener;

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/l;->d:I

    return v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lcom/yuanqi/group/widgets/l;->b:J

    return-wide v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/l;->a:I

    return v0
.end method

.method public m()J
    .locals 2

    iget-wide v0, p0, Lcom/yuanqi/group/widgets/l;->c:J

    return-wide v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/l;->f:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o(Landroid/animation/Animator$AnimatorListener;)Lcom/yuanqi/group/widgets/l;
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/l;->e:Landroid/animation/Animator$AnimatorListener;

    return-object p0
.end method

.method public p(I)Lcom/yuanqi/group/widgets/l;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string v0, "The animation direction must be either ANIMATION_DIRECTION_LTR or ANIMATION_DIRECTION_RTL"

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p1

    .line 15
    :cond_1
    :goto_0
    iput p1, p0, Lcom/yuanqi/group/widgets/l;->d:I

    .line 16
    .line 17
    return-object p0
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

.method public q(J)Lcom/yuanqi/group/widgets/l;
    .locals 0

    iput-wide p1, p0, Lcom/yuanqi/group/widgets/l;->b:J

    return-object p0
.end method

.method public r(I)Lcom/yuanqi/group/widgets/l;
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/l;->a:I

    return-object p0
.end method

.method public s(J)Lcom/yuanqi/group/widgets/l;
    .locals 0

    iput-wide p1, p0, Lcom/yuanqi/group/widgets/l;->c:J

    return-object p0
.end method

.method public t(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lcom/yuanqi/group/widgets/m;",
            ">(TV;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/l;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lcom/yuanqi/group/widgets/l$a;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lcom/yuanqi/group/widgets/l$a;-><init>(Lcom/yuanqi/group/widgets/l;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Lcom/yuanqi/group/widgets/m;

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/yuanqi/group/widgets/m;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Lcom/yuanqi/group/widgets/l$b;

    .line 22
    .line 23
    invoke-direct {v1, p0, v0}, Lcom/yuanqi/group/widgets/l$b;-><init>(Lcom/yuanqi/group/widgets/l;Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v1}, Lcom/yuanqi/group/widgets/m;->setAnimationSetupCallback(Lcom/yuanqi/group/widgets/n$a;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
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
