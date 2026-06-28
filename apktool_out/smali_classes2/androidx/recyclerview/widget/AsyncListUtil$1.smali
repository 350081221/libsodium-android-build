.class Landroidx/recyclerview/widget/AsyncListUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/ThreadUtil$MainThreadCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/AsyncListUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/recyclerview/widget/ThreadUtil$MainThreadCallback<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/recyclerview/widget/AsyncListUtil;


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/AsyncListUtil;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private isRequestedGeneration(I)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    iget v0, v0, Landroidx/recyclerview/widget/AsyncListUtil;->mRequestedGeneration:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private recycleAllTiles()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 3
    .line 4
    iget-object v1, v1, Landroidx/recyclerview/widget/AsyncListUtil;->mTileList:Landroidx/recyclerview/widget/TileList;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/recyclerview/widget/TileList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 13
    .line 14
    iget-object v2, v1, Landroidx/recyclerview/widget/AsyncListUtil;->mBackgroundProxy:Landroidx/recyclerview/widget/ThreadUtil$BackgroundCallback;

    .line 15
    .line 16
    iget-object v1, v1, Landroidx/recyclerview/widget/AsyncListUtil;->mTileList:Landroidx/recyclerview/widget/TileList;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/TileList;->getAtIndex(I)Landroidx/recyclerview/widget/TileList$Tile;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v2, v1}, Landroidx/recyclerview/widget/ThreadUtil$BackgroundCallback;->recycleTile(Landroidx/recyclerview/widget/TileList$Tile;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 29
    .line 30
    iget-object v0, v0, Landroidx/recyclerview/widget/AsyncListUtil;->mTileList:Landroidx/recyclerview/widget/TileList;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/recyclerview/widget/TileList;->clear()V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method


# virtual methods
.method public addTile(ILandroidx/recyclerview/widget/TileList$Tile;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/recyclerview/widget/TileList$Tile<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/AsyncListUtil$1;->isRequestedGeneration(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 8
    .line 9
    iget-object p1, p1, Landroidx/recyclerview/widget/AsyncListUtil;->mBackgroundProxy:Landroidx/recyclerview/widget/ThreadUtil$BackgroundCallback;

    .line 10
    .line 11
    invoke-interface {p1, p2}, Landroidx/recyclerview/widget/ThreadUtil$BackgroundCallback;->recycleTile(Landroidx/recyclerview/widget/TileList$Tile;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 16
    .line 17
    iget-object p1, p1, Landroidx/recyclerview/widget/AsyncListUtil;->mTileList:Landroidx/recyclerview/widget/TileList;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/TileList;->addOrReplace(Landroidx/recyclerview/widget/TileList$Tile;)Landroidx/recyclerview/widget/TileList$Tile;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "duplicate tile @"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v1, p1, Landroidx/recyclerview/widget/TileList$Tile;->mStartPosition:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "AsyncListUtil"

    .line 45
    .line 46
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 50
    .line 51
    iget-object v0, v0, Landroidx/recyclerview/widget/AsyncListUtil;->mBackgroundProxy:Landroidx/recyclerview/widget/ThreadUtil$BackgroundCallback;

    .line 52
    .line 53
    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/ThreadUtil$BackgroundCallback;->recycleTile(Landroidx/recyclerview/widget/TileList$Tile;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget p1, p2, Landroidx/recyclerview/widget/TileList$Tile;->mStartPosition:I

    .line 57
    .line 58
    iget v0, p2, Landroidx/recyclerview/widget/TileList$Tile;->mItemCount:I

    .line 59
    .line 60
    add-int/2addr p1, v0

    .line 61
    const/4 v0, 0x0

    .line 62
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 63
    .line 64
    iget-object v1, v1, Landroidx/recyclerview/widget/AsyncListUtil;->mMissingPositions:Landroid/util/SparseIntArray;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/util/SparseIntArray;->size()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-ge v0, v1, :cond_3

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 73
    .line 74
    iget-object v1, v1, Landroidx/recyclerview/widget/AsyncListUtil;->mMissingPositions:Landroid/util/SparseIntArray;

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iget v2, p2, Landroidx/recyclerview/widget/TileList$Tile;->mStartPosition:I

    .line 81
    .line 82
    if-gt v2, v1, :cond_2

    .line 83
    .line 84
    if-ge v1, p1, :cond_2

    .line 85
    .line 86
    iget-object v2, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 87
    .line 88
    iget-object v2, v2, Landroidx/recyclerview/widget/AsyncListUtil;->mMissingPositions:Landroid/util/SparseIntArray;

    .line 89
    .line 90
    invoke-virtual {v2, v0}, Landroid/util/SparseIntArray;->removeAt(I)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 94
    .line 95
    iget-object v2, v2, Landroidx/recyclerview/widget/AsyncListUtil;->mViewCallback:Landroidx/recyclerview/widget/AsyncListUtil$ViewCallback;

    .line 96
    .line 97
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/AsyncListUtil$ViewCallback;->onItemLoaded(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    return-void
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
.end method

.method public removeTile(II)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/AsyncListUtil$1;->isRequestedGeneration(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 9
    .line 10
    iget-object p1, p1, Landroidx/recyclerview/widget/AsyncListUtil;->mTileList:Landroidx/recyclerview/widget/TileList;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/TileList;->removeAtPos(I)Landroidx/recyclerview/widget/TileList$Tile;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string/jumbo v0, "tile not found @"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, "AsyncListUtil"

    .line 37
    .line 38
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object p2, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 43
    .line 44
    iget-object p2, p2, Landroidx/recyclerview/widget/AsyncListUtil;->mBackgroundProxy:Landroidx/recyclerview/widget/ThreadUtil$BackgroundCallback;

    .line 45
    .line 46
    invoke-interface {p2, p1}, Landroidx/recyclerview/widget/ThreadUtil$BackgroundCallback;->recycleTile(Landroidx/recyclerview/widget/TileList$Tile;)V

    .line 47
    .line 48
    .line 49
    return-void
    .line 50
.end method

.method public updateItemCount(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/AsyncListUtil$1;->isRequestedGeneration(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 9
    .line 10
    iput p2, p1, Landroidx/recyclerview/widget/AsyncListUtil;->mItemCount:I

    .line 11
    .line 12
    iget-object p1, p1, Landroidx/recyclerview/widget/AsyncListUtil;->mViewCallback:Landroidx/recyclerview/widget/AsyncListUtil$ViewCallback;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/recyclerview/widget/AsyncListUtil$ViewCallback;->onDataRefresh()V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 18
    .line 19
    iget p2, p1, Landroidx/recyclerview/widget/AsyncListUtil;->mRequestedGeneration:I

    .line 20
    .line 21
    iput p2, p1, Landroidx/recyclerview/widget/AsyncListUtil;->mDisplayedGeneration:I

    .line 22
    .line 23
    invoke-direct {p0}, Landroidx/recyclerview/widget/AsyncListUtil$1;->recycleAllTiles()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/recyclerview/widget/AsyncListUtil$1;->this$0:Landroidx/recyclerview/widget/AsyncListUtil;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    iput-boolean p2, p1, Landroidx/recyclerview/widget/AsyncListUtil;->mAllowScrollHints:Z

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/recyclerview/widget/AsyncListUtil;->updateRange()V

    .line 32
    .line 33
    .line 34
    return-void
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
