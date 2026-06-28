.class Lcom/yuanqi/group/widgets/BaseView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/widgets/BaseView;->m(FFJ)Landroid/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/BaseView;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/BaseView;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/BaseView$a;->a:Lcom/yuanqi/group/widgets/BaseView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/BaseView$a;->a:Lcom/yuanqi/group/widgets/BaseView;

    invoke-virtual {v0, p1}, Lcom/yuanqi/group/widgets/BaseView;->d(Landroid/animation/ValueAnimator;)V

    return-void
.end method
