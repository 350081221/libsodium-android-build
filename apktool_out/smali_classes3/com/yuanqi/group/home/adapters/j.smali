.class public final Lcom/yuanqi/group/home/adapters/j;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J*\u0010\u0012\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/yuanqi/group/home/adapters/SwipeGestureListener;",
        "Landroid/view/GestureDetector$SimpleOnGestureListener;",
        "adapter",
        "Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;",
        "recyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Landroidx/recyclerview/widget/RecyclerView;)V",
        "onFling",
        "",
        "e1",
        "Landroid/view/MotionEvent;",
        "e2",
        "velocityX",
        "",
        "velocityY",
        "onLongPress",
        "",
        "e",
        "onScroll",
        "distanceX",
        "distanceY",
        "onSingleTapUp",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1
    .param p1    # Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "adapter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "recyclerView"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/yuanqi/group/home/adapters/j;->a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    return-void
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
.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string p1, "e2"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    float-to-double p3, p3

    .line 7
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide p3

    .line 15
    cmpl-double p1, v0, p3

    .line 16
    .line 17
    if-lez p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/view/View;->getLeft()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    int-to-float p3, p3

    .line 30
    sub-float/2addr p1, p3

    .line 31
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    int-to-float p3, p3

    .line 42
    sub-float/2addr p2, p3

    .line 43
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    iget-object p2, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    instance-of p3, p1, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolder;

    .line 64
    .line 65
    if-eqz p3, :cond_0

    .line 66
    .line 67
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    .line 68
    .line 69
    check-cast p1, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolder;

    .line 70
    .line 71
    invoke-virtual {p3, p2, p1}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->t(ILcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolder;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :cond_1
    const/4 p1, 0x0

    .line 77
    return p1
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
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    sub-float/2addr v0, v1

    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    int-to-float v1, v1

    .line 29
    sub-float/2addr p1, v1

    .line 30
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->s(Landroid/view/View;I)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
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

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string p1, "e2"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    float-to-double v0, p3

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    float-to-double p3, p4

    .line 12
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide p3

    .line 16
    cmpl-double p1, v0, p3

    .line 17
    .line 18
    if-lez p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-virtual {p3}, Landroid/view/View;->getLeft()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    int-to-float p3, p3

    .line 31
    sub-float/2addr p1, p3

    .line 32
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    int-to-float p3, p3

    .line 43
    sub-float/2addr p2, p3

    .line 44
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    iget-object p2, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 53
    .line 54
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 59
    .line 60
    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    instance-of p3, p1, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolder;

    .line 65
    .line 66
    if-eqz p3, :cond_0

    .line 67
    .line 68
    iget-object p3, p0, Lcom/yuanqi/group/home/adapters/j;->a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    .line 69
    .line 70
    check-cast p1, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolder;

    .line 71
    .line 72
    invoke-virtual {p3, p2, p1}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->t(ILcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolder;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_1
    const/4 p1, 0x0

    .line 78
    return p1
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
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-float v1, v1

    .line 17
    sub-float/2addr v0, v1

    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    int-to-float v1, v1

    .line 29
    sub-float/2addr p1, v1

    .line 30
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    return p1

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, Lcom/yuanqi/group/home/adapters/j;->a:Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    .line 55
    .line 56
    invoke-virtual {v1, v0, p1}, Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;->n(ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    const/4 p1, 0x1

    .line 60
    return p1
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
