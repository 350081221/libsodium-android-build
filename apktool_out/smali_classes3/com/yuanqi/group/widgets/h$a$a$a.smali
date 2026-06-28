.class Lcom/yuanqi/group/widgets/h$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/h$a$a;->onAnimationEnd(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/h$a$a;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/h$a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$a$a$a;->a:Lcom/yuanqi/group/widgets/h$a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$a$a$a;->a:Lcom/yuanqi/group/widgets/h$a$a;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/yuanqi/group/widgets/h$a$a;->g:Lcom/yuanqi/group/widgets/h$a;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/yuanqi/group/widgets/h$a;->d(Lcom/yuanqi/group/widgets/h$a;)Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$a$a$a;->a:Lcom/yuanqi/group/widgets/h$a$a;

    .line 17
    .line 18
    iget-object v1, v0, Lcom/yuanqi/group/widgets/h$a$a;->a:Landroid/widget/ImageView;

    .line 19
    .line 20
    iget v2, v0, Lcom/yuanqi/group/widgets/h$a$a;->b:I

    .line 21
    .line 22
    iget v3, v0, Lcom/yuanqi/group/widgets/h$a$a;->c:I

    .line 23
    .line 24
    iget v4, v0, Lcom/yuanqi/group/widgets/h$a$a;->d:I

    .line 25
    .line 26
    int-to-float v4, v4

    .line 27
    iget-object v0, v0, Lcom/yuanqi/group/widgets/h$a$a;->g:Lcom/yuanqi/group/widgets/h$a;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/yuanqi/group/widgets/h$a;->e(Lcom/yuanqi/group/widgets/h$a;)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v1, v2, v3, v4, v0}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/yuanqi/group/widgets/h$a$a$a;->a:Lcom/yuanqi/group/widgets/h$a$a;

    .line 38
    .line 39
    iget-wide v1, v1, Lcom/yuanqi/group/widgets/h$a$a;->e:J

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 42
    .line 43
    .line 44
    new-instance v1, Lcom/yuanqi/group/widgets/h$a$a$a$a;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lcom/yuanqi/group/widgets/h$a$a$a$a;-><init>(Lcom/yuanqi/group/widgets/h$a$a$a;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    :try_start_1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/h$a$a$a;->a:Lcom/yuanqi/group/widgets/h$a$a;

    .line 61
    .line 62
    iget-object v1, v0, Lcom/yuanqi/group/widgets/h$a$a;->f:Landroid/view/ViewGroup;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/yuanqi/group/widgets/h$a$a;->a:Landroid/widget/ImageView;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_1
    move-exception v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-void
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
