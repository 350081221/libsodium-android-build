.class Lcom/yuanqi/group/effects/ExplosionField$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/effects/ExplosionField;->j(Landroid/view/View;Lcom/yuanqi/group/effects/ExplosionField$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Ljava/util/Random;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/yuanqi/group/effects/ExplosionField;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/effects/ExplosionField;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->c:Lcom/yuanqi/group/effects/ExplosionField;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/Random;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->a:Ljava/util/Random;

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


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->b:Landroid/view/View;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->a:Ljava/util/Random;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/high16 v1, 0x3f000000    # 0.5f

    .line 10
    .line 11
    sub-float/2addr v0, v1

    .line 12
    iget-object v2, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->b:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    mul-float/2addr v0, v2

    .line 20
    const v2, 0x3d4ccccd    # 0.05f

    .line 21
    .line 22
    .line 23
    mul-float/2addr v0, v2

    .line 24
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->b:Landroid/view/View;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->a:Ljava/util/Random;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sub-float/2addr v0, v1

    .line 36
    iget-object v1, p0, Lcom/yuanqi/group/effects/ExplosionField$b;->b:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    int-to-float v1, v1

    .line 43
    mul-float/2addr v0, v1

    .line 44
    mul-float/2addr v0, v2

    .line 45
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 46
    .line 47
    .line 48
    return-void
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
