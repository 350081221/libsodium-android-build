.class Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuanqi/group/widgets/DragSelectRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;->a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;->a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->b(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;->a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->c(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const-wide/16 v1, 0x19

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;->a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->d(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    neg-int v4, v4

    .line 28
    invoke-virtual {v0, v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;->a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->b(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)Landroid/os/Handler;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;->a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->e(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;->a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;

    .line 50
    .line 51
    invoke-static {v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->d(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {v0, v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;->a:Lcom/yuanqi/group/widgets/DragSelectRecyclerView;

    .line 59
    .line 60
    invoke-static {v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->b(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)Landroid/os/Handler;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    return-void
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
