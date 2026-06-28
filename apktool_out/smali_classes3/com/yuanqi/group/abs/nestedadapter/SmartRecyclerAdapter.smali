.class public Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;
.super Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;
.source "SourceFile"


# static fields
.field public static final f:I = -0x1

.field public static final g:I = -0x2


# instance fields
.field private c:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

.field private d:Landroid/view/View;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$Adapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;-><init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method static synthetic b(Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;)Z
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e()Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;)Z
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->d()Z

    move-result p0

    return p0
.end method

.method private d()Z
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e()Z
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->d:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private i(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 6
    .line 7
    new-instance v0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$a;-><init>(Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;Landroidx/recyclerview/widget/GridLayoutManager;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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


# virtual methods
.method public f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e:Landroid/view/View;

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->a()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->d:Landroid/view/View;

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->a()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public getItemCount()I
    .locals 2

    invoke-super {p0}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->getItemCount()I

    move-result v0

    invoke-direct {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e()Z

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->d()Z

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-direct {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->getItemCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    const/4 p1, -0x2

    .line 26
    return p1

    .line 27
    :cond_1
    invoke-direct {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    add-int/lit8 p1, p1, -0x1

    .line 34
    .line 35
    :cond_2
    invoke-super {p0, p1}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->getItemViewType(I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
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

.method public h(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->a()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public j(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->d:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->a()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->c:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->i(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->getItemViewType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->getItemViewType(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    add-int/lit8 p2, p2, -0x1

    .line 23
    .line 24
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
    return-void
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

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 3

    .line 1
    const/4 v0, -0x2

    .line 2
    const/4 v1, -0x1

    .line 3
    if-ne p2, v1, :cond_0

    .line 4
    .line 5
    iget-object v2, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->d:Landroid/view/View;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->e:Landroid/view/View;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-eqz v2, :cond_4

    .line 15
    .line 16
    iget-object p1, p0, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;->c:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 17
    .line 18
    instance-of p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 19
    .line 20
    if-eqz p1, :cond_3

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    new-instance p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 29
    .line 30
    iget v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 31
    .line 32
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 33
    .line 34
    invoke-direct {p2, v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    new-instance p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 39
    .line 40
    invoke-direct {p2, v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    .line 41
    .line 42
    .line 43
    :goto_1
    const/4 p1, 0x1

    .line 44
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    new-instance p1, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$b;

    .line 51
    .line 52
    invoke-direct {p1, p0, v2}, Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter$b;-><init>(Lcom/yuanqi/group/abs/nestedadapter/SmartRecyclerAdapter;Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_4
    invoke-super {p0, p1, p2}, Lcom/yuanqi/group/abs/nestedadapter/RecyclerViewAdapterWrapper;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
