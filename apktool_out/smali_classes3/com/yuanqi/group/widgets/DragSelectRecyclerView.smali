.class public Lcom/yuanqi/group/widgets/DragSelectRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;
    }
.end annotation


# static fields
.field private static final x:Z = false

.field private static final y:I = 0x19


# instance fields
.field private a:I

.field private b:Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter<",
            "*>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Z

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;

.field private p:Z

.field private q:Z

.field private r:Landroid/os/Handler;

.field private s:Ljava/lang/Runnable;

.field private t:Landroid/graphics/RectF;

.field private u:Landroid/graphics/RectF;

.field private v:Landroid/graphics/Paint;

.field private w:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a:I

    .line 3
    new-instance v0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;

    invoke-direct {v0, p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;-><init>(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)V

    iput-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->w:Z

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->h(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 6
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a:I

    .line 8
    new-instance v0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;

    invoke-direct {v0, p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;-><init>(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)V

    iput-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->w:Z

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->h(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, -0x1

    .line 12
    iput p3, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a:I

    .line 13
    new-instance p3, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;

    invoke-direct {p3, p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$a;-><init>(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)V

    iput-object p3, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    const/4 p3, 0x0

    .line 14
    iput-boolean p3, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->w:Z

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->h(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method static synthetic b(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->r:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic c(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->p:Z

    return p0
.end method

.method static synthetic d(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)I
    .locals 0

    iget p0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->n:I

    return p0
.end method

.method static synthetic e(Lcom/yuanqi/group/widgets/DragSelectRecyclerView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->q:Z

    return p0
.end method

.method private g(Landroid/view/MotionEvent;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v0, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "Make sure your adapter makes a call to super.onBindViewHolder(), and doesn\'t override itemView tags."

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
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

.method private h(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->r:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const v1, 0x7f07009e

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-string v1, "Hotspot height = %d"

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object v4, Lcom/yqtech/multiapp/R$styleable;->DragSelectRecyclerView:[I

    .line 30
    .line 31
    invoke-virtual {p1, p2, v4, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :try_start_0
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_0

    .line 40
    .line 41
    const/4 p2, -0x1

    .line 42
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->g:I

    .line 43
    .line 44
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->h:I

    .line 45
    .line 46
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->i:I

    .line 47
    .line 48
    const-string p2, "Auto-scroll disabled"

    .line 49
    .line 50
    new-array v0, v3, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p2, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->g:I

    .line 61
    .line 62
    const/4 p2, 0x3

    .line 63
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->h:I

    .line 68
    .line 69
    const/4 p2, 0x2

    .line 70
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->i:I

    .line 75
    .line 76
    new-array p2, v2, [Ljava/lang/Object;

    .line 77
    .line 78
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->g:I

    .line 79
    .line 80
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    aput-object v0, p2, v3

    .line 85
    .line 86
    invoke-static {v1, p2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p2

    .line 94
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 95
    .line 96
    .line 97
    throw p2

    .line 98
    :cond_1
    iput v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->g:I

    .line 99
    .line 100
    new-array p1, v2, [Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    aput-object p2, p1, v3

    .line 107
    .line 108
    invoke-static {v1, p1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :goto_1
    return-void
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


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->b:Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->d:Z

    .line 15
    .line 16
    if-eqz v0, :cond_9

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->d:Z

    .line 27
    .line 28
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->p:Z

    .line 29
    .line 30
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->q:Z

    .line 31
    .line 32
    iget-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->r:Landroid/os/Handler;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->o:Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-interface {p1, v2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;->a(Z)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return v1

    .line 47
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v3, 0x2

    .line 52
    if-ne v0, v3, :cond_9

    .line 53
    .line 54
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->g:I

    .line 55
    .line 56
    const/4 v4, -0x1

    .line 57
    if-le v0, v4, :cond_8

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget v4, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->j:I

    .line 64
    .line 65
    int-to-float v4, v4

    .line 66
    cmpl-float v0, v0, v4

    .line 67
    .line 68
    const-wide/16 v4, 0x19

    .line 69
    .line 70
    const-string v6, "Auto scroll velocity = %d"

    .line 71
    .line 72
    if-ltz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget v7, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->k:I

    .line 79
    .line 80
    int-to-float v7, v7

    .line 81
    cmpg-float v0, v0, v7

    .line 82
    .line 83
    if-gtz v0, :cond_4

    .line 84
    .line 85
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->q:Z

    .line 86
    .line 87
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->p:Z

    .line 88
    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    iput-boolean v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->p:Z

    .line 92
    .line 93
    const-string v0, "Now in TOP hotspot"

    .line 94
    .line 95
    new-array v7, v2, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {v0, v7}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->r:Landroid/os/Handler;

    .line 101
    .line 102
    iget-object v7, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    .line 103
    .line 104
    invoke-virtual {v0, v7}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->r:Landroid/os/Handler;

    .line 108
    .line 109
    iget-object v7, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    .line 110
    .line 111
    invoke-virtual {v0, v7, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 112
    .line 113
    .line 114
    :cond_3
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->k:I

    .line 115
    .line 116
    iget v4, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->j:I

    .line 117
    .line 118
    sub-int/2addr v0, v4

    .line 119
    int-to-float v0, v0

    .line 120
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iget v4, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->j:I

    .line 125
    .line 126
    int-to-float v4, v4

    .line 127
    sub-float/2addr p1, v4

    .line 128
    sub-float/2addr v0, p1

    .line 129
    float-to-int p1, v0

    .line 130
    div-int/2addr p1, v3

    .line 131
    iput p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->n:I

    .line 132
    .line 133
    new-array v0, v1, [Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    aput-object p1, v0, v2

    .line 140
    .line 141
    invoke-static {v6, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    iget v7, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->l:I

    .line 150
    .line 151
    int-to-float v7, v7

    .line 152
    cmpl-float v0, v0, v7

    .line 153
    .line 154
    if-ltz v0, :cond_6

    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    iget v7, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->m:I

    .line 161
    .line 162
    int-to-float v7, v7

    .line 163
    cmpg-float v0, v0, v7

    .line 164
    .line 165
    if-gtz v0, :cond_6

    .line 166
    .line 167
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->p:Z

    .line 168
    .line 169
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->q:Z

    .line 170
    .line 171
    if-nez v0, :cond_5

    .line 172
    .line 173
    iput-boolean v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->q:Z

    .line 174
    .line 175
    const-string v0, "Now in BOTTOM hotspot"

    .line 176
    .line 177
    new-array v7, v2, [Ljava/lang/Object;

    .line 178
    .line 179
    invoke-static {v0, v7}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->r:Landroid/os/Handler;

    .line 183
    .line 184
    iget-object v7, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    .line 185
    .line 186
    invoke-virtual {v0, v7}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->r:Landroid/os/Handler;

    .line 190
    .line 191
    iget-object v7, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    .line 192
    .line 193
    invoke-virtual {v0, v7, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 194
    .line 195
    .line 196
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->m:I

    .line 201
    .line 202
    int-to-float v4, v0

    .line 203
    add-float/2addr p1, v4

    .line 204
    iget v4, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->l:I

    .line 205
    .line 206
    add-int/2addr v4, v0

    .line 207
    int-to-float v0, v4

    .line 208
    sub-float/2addr p1, v0

    .line 209
    float-to-int p1, p1

    .line 210
    div-int/2addr p1, v3

    .line 211
    iput p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->n:I

    .line 212
    .line 213
    new-array v0, v1, [Ljava/lang/Object;

    .line 214
    .line 215
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    aput-object p1, v0, v2

    .line 220
    .line 221
    invoke-static {v6, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto :goto_0

    .line 225
    :cond_6
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->p:Z

    .line 226
    .line 227
    if-nez p1, :cond_7

    .line 228
    .line 229
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->q:Z

    .line 230
    .line 231
    if-eqz p1, :cond_8

    .line 232
    .line 233
    :cond_7
    const-string p1, "Left the hotspot"

    .line 234
    .line 235
    new-array v0, v2, [Ljava/lang/Object;

    .line 236
    .line 237
    invoke-static {p1, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->r:Landroid/os/Handler;

    .line 241
    .line 242
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->s:Ljava/lang/Runnable;

    .line 243
    .line 244
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 245
    .line 246
    .line 247
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->p:Z

    .line 248
    .line 249
    iput-boolean v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->q:Z

    .line 250
    .line 251
    :cond_8
    :goto_0
    return v1

    .line 252
    :cond_9
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    return p1
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->w:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
.end method

.method public i(ZI)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->d:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string p1, "Drag selection is already active."

    .line 9
    .line 10
    new-array p2, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, p2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v1, -0x1

    .line 17
    iput v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a:I

    .line 18
    .line 19
    iput v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->e:I

    .line 20
    .line 21
    iput v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->f:I

    .line 22
    .line 23
    iget-object v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->b:Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;

    .line 24
    .line 25
    invoke-virtual {v2, p2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e(I)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x1

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->d:Z

    .line 33
    .line 34
    iput v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->c:I

    .line 35
    .line 36
    iput v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a:I

    .line 37
    .line 38
    new-array p1, v3, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    aput-object p2, p1, v0

    .line 45
    .line 46
    const-string p2, "Index %d is not selectable."

    .line 47
    .line 48
    invoke-static {p2, p1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return v0

    .line 52
    :cond_1
    iget-object v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->b:Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;

    .line 53
    .line 54
    invoke-virtual {v1, p2, v3}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->m(IZ)V

    .line 55
    .line 56
    .line 57
    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->d:Z

    .line 58
    .line 59
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->c:I

    .line 60
    .line 61
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a:I

    .line 62
    .line 63
    iget-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->o:Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;

    .line 64
    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-interface {p1, v3}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;->a(Z)V

    .line 68
    .line 69
    .line 70
    :cond_2
    new-array p1, v3, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    aput-object p2, p1, v0

    .line 77
    .line 78
    const-string p2, "Drag selection initialized, starting at index %d."

    .line 79
    .line 80
    invoke-static {p2, p1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return v3
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

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->w:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->v:Landroid/graphics/Paint;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->v:Landroid/graphics/Paint;

    .line 18
    .line 19
    const/high16 v1, -0x1000000

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->v:Landroid/graphics/Paint;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->v:Landroid/graphics/Paint;

    .line 31
    .line 32
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Landroid/graphics/RectF;

    .line 38
    .line 39
    iget v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->j:I

    .line 40
    .line 41
    int-to-float v1, v1

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-float v2, v2

    .line 47
    iget v3, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->k:I

    .line 48
    .line 49
    int-to-float v3, v3

    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v0, v4, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->t:Landroid/graphics/RectF;

    .line 55
    .line 56
    new-instance v0, Landroid/graphics/RectF;

    .line 57
    .line 58
    iget v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->l:I

    .line 59
    .line 60
    int-to-float v1, v1

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    int-to-float v2, v2

    .line 66
    iget v3, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->m:I

    .line 67
    .line 68
    int-to-float v3, v3

    .line 69
    invoke-direct {v0, v4, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->u:Landroid/graphics/RectF;

    .line 73
    .line 74
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->t:Landroid/graphics/RectF;

    .line 75
    .line 76
    iget-object v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->v:Landroid/graphics/Paint;

    .line 77
    .line 78
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->u:Landroid/graphics/RectF;

    .line 82
    .line 83
    iget-object v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->v:Landroid/graphics/Paint;

    .line 84
    .line 85
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->g:I

    .line 5
    .line 6
    const/4 p2, -0x1

    .line 7
    if-le p1, p2, :cond_0

    .line 8
    .line 9
    iget p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->h:I

    .line 10
    .line 11
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->j:I

    .line 12
    .line 13
    add-int/2addr p2, p1

    .line 14
    iput p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->k:I

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->g:I

    .line 21
    .line 22
    sub-int/2addr p1, p2

    .line 23
    iget p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->i:I

    .line 24
    .line 25
    sub-int/2addr p1, p2

    .line 26
    iput p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->l:I

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->i:I

    .line 33
    .line 34
    sub-int/2addr p1, p2

    .line 35
    iput p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->m:I

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    new-array p2, p1, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v1, 0x0

    .line 49
    aput-object v0, p2, v1

    .line 50
    .line 51
    const-string v0, "RecyclerView height = %d"

    .line 52
    .line 53
    invoke-static {v0, p2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 p2, 0x2

    .line 57
    new-array v0, p2, [Ljava/lang/Object;

    .line 58
    .line 59
    iget v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->j:I

    .line 60
    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    aput-object v2, v0, v1

    .line 66
    .line 67
    iget v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->j:I

    .line 68
    .line 69
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    aput-object v2, v0, p1

    .line 74
    .line 75
    const-string v2, "Hotspot top bound = %d to %d"

    .line 76
    .line 77
    invoke-static {v2, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-array p2, p2, [Ljava/lang/Object;

    .line 81
    .line 82
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->l:I

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    aput-object v0, p2, v1

    .line 89
    .line 90
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->m:I

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    aput-object v0, p2, p1

    .line 97
    .line 98
    const-string p1, "Hotspot bottom bound = %d to %d"

    .line 99
    .line 100
    invoke-static {p1, p2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_0
    return-void
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

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->setAdapter(Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Adapter must be a DragSelectRecyclerViewAdapter."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAdapter(Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter<",
            "*>;)V"
        }
    .end annotation

    .line 4
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 5
    iput-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->b:Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;

    return-void
.end method

.method public setFingerListener(Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;)V
    .locals 0
    .param p1    # Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerView;->o:Lcom/yuanqi/group/widgets/DragSelectRecyclerView$b;

    return-void
.end method
