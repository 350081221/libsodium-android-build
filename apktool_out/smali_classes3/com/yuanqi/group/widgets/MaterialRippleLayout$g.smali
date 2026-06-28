.class final Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/widgets/MaterialRippleLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "g"
.end annotation


# instance fields
.field private final a:Landroid/view/MotionEvent;

.field final synthetic b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;


# direct methods
.method public constructor <init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->a:Landroid/view/MotionEvent;

    .line 7
    .line 8
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
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->f(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->a:Landroid/view/MotionEvent;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->i(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$g;->b:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->g(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
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
