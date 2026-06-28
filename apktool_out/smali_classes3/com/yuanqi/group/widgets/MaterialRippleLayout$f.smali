.class Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/widgets/MaterialRippleLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;


# direct methods
.method private constructor <init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;Lcom/yuanqi/group/widgets/MaterialRippleLayout$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;-><init>(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)V

    return-void
.end method

.method private a(Landroid/widget/AdapterView;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->getItemId(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-wide/16 v1, 0x0

    .line 23
    .line 24
    :goto_0
    const/4 v3, -0x1

    .line 25
    if-eq v0, v3, :cond_1

    .line 26
    .line 27
    iget-object v3, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 28
    .line 29
    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
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


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->b(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v0, v0, Landroid/widget/AdapterView;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroid/widget/AdapterView;

    .line 39
    .line 40
    invoke-direct {p0, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a(Landroid/widget/AdapterView;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->c(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 53
    .line 54
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->e(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/widget/AdapterView;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p0, v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a(Landroid/widget/AdapterView;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iget-object v0, p0, Lcom/yuanqi/group/widgets/MaterialRippleLayout$f;->a:Lcom/yuanqi/group/widgets/MaterialRippleLayout;

    .line 63
    .line 64
    invoke-static {v0}, Lcom/yuanqi/group/widgets/MaterialRippleLayout;->h(Lcom/yuanqi/group/widgets/MaterialRippleLayout;)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_0
    return-void
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
