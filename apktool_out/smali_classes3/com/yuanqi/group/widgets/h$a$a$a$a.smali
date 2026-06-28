.class Lcom/yuanqi/group/widgets/h$a$a$a$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/h$a$a$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/h$a$a$a;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/h$a$a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/h$a$a$a$a;->a:Lcom/yuanqi/group/widgets/h$a$a$a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object p1, p0, Lcom/yuanqi/group/widgets/h$a$a$a$a;->a:Lcom/yuanqi/group/widgets/h$a$a$a;

    .line 5
    .line 6
    iget-object p1, p1, Lcom/yuanqi/group/widgets/h$a$a$a;->a:Lcom/yuanqi/group/widgets/h$a$a;

    .line 7
    .line 8
    iget-object v0, p1, Lcom/yuanqi/group/widgets/h$a$a;->f:Landroid/view/ViewGroup;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/yuanqi/group/widgets/h$a$a;->a:Landroid/widget/ImageView;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
