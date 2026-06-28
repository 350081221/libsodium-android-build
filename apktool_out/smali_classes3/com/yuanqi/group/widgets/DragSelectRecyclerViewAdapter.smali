.class public abstract Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VH:",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "TVH;>;"
    }
.end annotation


# instance fields
.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter$a;

.field private d:I

.field private e:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->d:I

    .line 6
    .line 7
    iput v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e:I

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private b()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->d:I

    .line 19
    .line 20
    iget-object v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->c:Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter$a;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v1, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter$a;->a(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
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


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final c()I
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final d()[Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    return-object v0
.end method

.method protected e(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final f(I)Z
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b()V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
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

.method public h(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "selected_indices"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->i(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public i(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e(I)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b()V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public final k(IIII)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p1, p2, :cond_2

    .line 3
    .line 4
    :goto_0
    if-gt p3, p4, :cond_1

    .line 5
    .line 6
    if-ne p3, p1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0, p3, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->m(IZ)V

    .line 10
    .line 11
    .line 12
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_2
    const/4 v1, -0x1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-ge p2, p1, :cond_6

    .line 22
    .line 23
    move v3, p2

    .line 24
    :goto_2
    if-gt v3, p1, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0, v3, v2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->m(IZ)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_3
    if-le p3, v1, :cond_5

    .line 33
    .line 34
    if-ge p3, p2, :cond_5

    .line 35
    .line 36
    :goto_3
    if-ge p3, p2, :cond_5

    .line 37
    .line 38
    if-ne p3, p1, :cond_4

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_4
    invoke-virtual {p0, p3, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->m(IZ)V

    .line 42
    .line 43
    .line 44
    :goto_4
    add-int/lit8 p3, p3, 0x1

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_5
    if-le p4, v1, :cond_a

    .line 48
    .line 49
    add-int/2addr p1, v2

    .line 50
    :goto_5
    if-gt p1, p4, :cond_a

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->m(IZ)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 p1, p1, 0x1

    .line 56
    .line 57
    goto :goto_5

    .line 58
    :cond_6
    move v3, p1

    .line 59
    :goto_6
    if-gt v3, p2, :cond_7

    .line 60
    .line 61
    invoke-virtual {p0, v3, v2}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->m(IZ)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_6

    .line 67
    :cond_7
    if-le p4, v1, :cond_9

    .line 68
    .line 69
    if-le p4, p2, :cond_9

    .line 70
    .line 71
    add-int/2addr p2, v2

    .line 72
    :goto_7
    if-gt p2, p4, :cond_9

    .line 73
    .line 74
    if-ne p2, p1, :cond_8

    .line 75
    .line 76
    goto :goto_8

    .line 77
    :cond_8
    invoke-virtual {p0, p2, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->m(IZ)V

    .line 78
    .line 79
    .line 80
    :goto_8
    add-int/lit8 p2, p2, 0x1

    .line 81
    .line 82
    goto :goto_7

    .line 83
    :cond_9
    if-le p3, v1, :cond_a

    .line 84
    .line 85
    :goto_9
    if-ge p3, p1, :cond_a

    .line 86
    .line 87
    invoke-virtual {p0, p3, v0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->m(IZ)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 p3, p3, 0x1

    .line 91
    .line 92
    goto :goto_9

    .line 93
    :cond_a
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b()V

    .line 94
    .line 95
    .line 96
    return-void
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

.method public l(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e:I

    return-void
.end method

.method public final m(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    if-eqz p2, :cond_2

    .line 9
    .line 10
    iget-object p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-nez p2, :cond_3

    .line 21
    .line 22
    iget p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e:I

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    if-eq p2, v0, :cond_1

    .line 26
    .line 27
    iget-object p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e:I

    .line 34
    .line 35
    if-ge p2, v0, :cond_3

    .line 36
    .line 37
    :cond_1
    iget-object p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    iget-object p2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b()V

    .line 75
    .line 76
    .line 77
    return-void
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

.method public n(Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter$a;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->c:Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter$a;

    return-void
.end method

.method public final o(I)Z
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e:I

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    if-eq v0, v2, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget v2, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->e:I

    .line 42
    .line 43
    if-ge v0, v2, :cond_2

    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    move v1, v0

    .line 56
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->b()V

    .line 60
    .line 61
    .line 62
    return v1
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

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVH;I)V"
        }
    .end annotation

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method public restoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "selected_indices"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/yuanqi/group/widgets/DragSelectRecyclerViewAdapter;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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
    .line 24
    .line 25
    .line 26
    .line 27
.end method
