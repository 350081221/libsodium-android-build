.class Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/widgets/MaterialRippleLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->d(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDown(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->performLongClick()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p1, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->d(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Z)Z

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->b(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->i(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p1, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->j(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$c;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->k(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
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
