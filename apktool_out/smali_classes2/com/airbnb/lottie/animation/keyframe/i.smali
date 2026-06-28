.class public Lcom/airbnb/lottie/animation/keyframe/i;
.super Lcom/airbnb/lottie/value/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/airbnb/lottie/value/a<",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field private s:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final t:Lcom/airbnb/lottie/value/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/value/a<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/value/a;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/k;",
            "Lcom/airbnb/lottie/value/a<",
            "Landroid/graphics/PointF;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lcom/airbnb/lottie/value/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v3, v0

    .line 4
    check-cast v3, Landroid/graphics/PointF;

    .line 5
    .line 6
    iget-object v0, p2, Lcom/airbnb/lottie/value/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v4, v0

    .line 9
    check-cast v4, Landroid/graphics/PointF;

    .line 10
    .line 11
    iget-object v5, p2, Lcom/airbnb/lottie/value/a;->d:Landroid/view/animation/Interpolator;

    .line 12
    .line 13
    iget-object v6, p2, Lcom/airbnb/lottie/value/a;->e:Landroid/view/animation/Interpolator;

    .line 14
    .line 15
    iget-object v7, p2, Lcom/airbnb/lottie/value/a;->f:Landroid/view/animation/Interpolator;

    .line 16
    .line 17
    iget v8, p2, Lcom/airbnb/lottie/value/a;->g:F

    .line 18
    .line 19
    iget-object v9, p2, Lcom/airbnb/lottie/value/a;->h:Ljava/lang/Float;

    .line 20
    .line 21
    move-object v1, p0

    .line 22
    move-object v2, p1

    .line 23
    invoke-direct/range {v1 .. v9}, Lcom/airbnb/lottie/value/a;-><init>(Lcom/airbnb/lottie/k;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/airbnb/lottie/animation/keyframe/i;->t:Lcom/airbnb/lottie/value/a;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/airbnb/lottie/animation/keyframe/i;->j()V

    .line 29
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
.end method


# virtual methods
.method public j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/value/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/airbnb/lottie/value/a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v1, Landroid/graphics/PointF;

    .line 10
    .line 11
    move-object v2, v0

    .line 12
    check-cast v2, Landroid/graphics/PointF;

    .line 13
    .line 14
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 15
    .line 16
    check-cast v0, Landroid/graphics/PointF;

    .line 17
    .line 18
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 19
    .line 20
    invoke-virtual {v1, v2, v0}, Landroid/graphics/PointF;->equals(FF)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    iget-object v1, p0, Lcom/airbnb/lottie/value/a;->b:Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v2, p0, Lcom/airbnb/lottie/value/a;->c:Ljava/lang/Object;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    check-cast v1, Landroid/graphics/PointF;

    .line 40
    .line 41
    check-cast v2, Landroid/graphics/PointF;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/airbnb/lottie/animation/keyframe/i;->t:Lcom/airbnb/lottie/value/a;

    .line 44
    .line 45
    iget-object v3, v0, Lcom/airbnb/lottie/value/a;->o:Landroid/graphics/PointF;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/airbnb/lottie/value/a;->p:Landroid/graphics/PointF;

    .line 48
    .line 49
    invoke-static {v1, v2, v3, v0}, Lcom/airbnb/lottie/utils/l;->d(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/Path;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/airbnb/lottie/animation/keyframe/i;->s:Landroid/graphics/Path;

    .line 54
    .line 55
    :cond_1
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
.end method

.method k()Landroid/graphics/Path;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/animation/keyframe/i;->s:Landroid/graphics/Path;

    return-object v0
.end method
