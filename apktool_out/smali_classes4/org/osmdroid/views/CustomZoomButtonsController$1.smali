.class Lorg/osmdroid/views/CustomZoomButtonsController$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/views/CustomZoomButtonsController;-><init>(Lorg/osmdroid/views/MapView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/osmdroid/views/CustomZoomButtonsController;


# direct methods
.method constructor <init>(Lorg/osmdroid/views/CustomZoomButtonsController;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController$1;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController$1;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/osmdroid/views/CustomZoomButtonsController;->access$000(Lorg/osmdroid/views/CustomZoomButtonsController;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController$1;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 10
    .line 11
    invoke-static {p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->access$100(Lorg/osmdroid/views/CustomZoomButtonsController;)Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/CustomZoomButtonsController$1;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/Float;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/high16 v1, 0x3f800000    # 1.0f

    .line 32
    .line 33
    sub-float/2addr v1, p1

    .line 34
    invoke-static {v0, v1}, Lorg/osmdroid/views/CustomZoomButtonsController;->access$202(Lorg/osmdroid/views/CustomZoomButtonsController;F)F

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lorg/osmdroid/views/CustomZoomButtonsController$1;->this$0:Lorg/osmdroid/views/CustomZoomButtonsController;

    .line 38
    .line 39
    invoke-static {p1}, Lorg/osmdroid/views/CustomZoomButtonsController;->access$300(Lorg/osmdroid/views/CustomZoomButtonsController;)V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method
