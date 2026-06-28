.class Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->i(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/recyclerview/widget/GridLayoutManager;

.field final synthetic b:Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;Landroidx/recyclerview/widget/GridLayoutManager;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;->b:Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;

    iput-object p2, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;->a:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object v2, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;->b:Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;

    .line 6
    .line 7
    invoke-static {v2}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->b(Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v0

    .line 16
    :goto_0
    iget-object v3, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;->b:Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;

    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->getItemCount()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sub-int/2addr v3, v1

    .line 23
    if-ne p1, v3, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;->b:Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->c(Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    move v0, v1

    .line 34
    :cond_1
    if-nez v0, :cond_3

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    return v1

    .line 40
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;->a:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1
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
