.class public final synthetic Lcom/yuanqi/group/widgets/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/yuanqi/group/widgets/b;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/yuanqi/group/widgets/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/widgets/a;->a:Lcom/yuanqi/group/widgets/b;

    iput p2, p0, Lcom/yuanqi/group/widgets/a;->b:I

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/widgets/a;->a:Lcom/yuanqi/group/widgets/b;

    iget v1, p0, Lcom/yuanqi/group/widgets/a;->b:I

    invoke-static {v0, v1, p1}, Lcom/yuanqi/group/widgets/b;->t(Lcom/yuanqi/group/widgets/b;ILandroid/animation/ValueAnimator;)V

    return-void
.end method
