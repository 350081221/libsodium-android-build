.class public final Lcom/android/dx/dex/code/StdCatchBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/dex/code/CatchBuilder;


# static fields
.field private static final MAX_CATCH_RANGE:I = 0xffff


# instance fields
.field private final addresses:Lcom/android/dx/dex/code/BlockAddresses;

.field private final method:Lcom/android/dx/rop/code/RopMethod;

.field private final order:[I


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/RopMethod;[ILcom/android/dx/dex/code/BlockAddresses;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->method:Lcom/android/dx/rop/code/RopMethod;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->order:[I

    .line 13
    .line 14
    iput-object p3, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->addresses:Lcom/android/dx/dex/code/BlockAddresses;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 18
    .line 19
    const-string p2, "addresses == null"

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 26
    .line 27
    const-string p2, "order == null"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 34
    .line 35
    const-string p2, "method == null"

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public static build(Lcom/android/dx/rop/code/RopMethod;[ILcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable;
    .locals 10

    .line 2
    array-length v0, p1

    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    move-result-object p0

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    sget-object v2, Lcom/android/dx/dex/code/CatchHandlerList;->EMPTY:Lcom/android/dx/dex/code/CatchHandlerList;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move v6, v4

    :goto_0
    if-ge v6, v0, :cond_4

    .line 6
    aget v7, p1, v6

    invoke-virtual {p0, v7}, Lcom/android/dx/rop/code/BasicBlockList;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    move-result-object v7

    .line 7
    invoke-virtual {v7}, Lcom/android/dx/rop/code/BasicBlock;->canThrow()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_2

    .line 8
    :cond_0
    invoke-static {v7, p2}, Lcom/android/dx/dex/code/StdCatchBuilder;->handlersFor(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchHandlerList;

    move-result-object v8

    .line 9
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v9

    if-nez v9, :cond_1

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {v2, v8}, Lcom/android/dx/util/FixedSizeList;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 11
    invoke-static {v3, v7, p2}, Lcom/android/dx/dex/code/StdCatchBuilder;->rangeIsValid(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/BlockAddresses;)Z

    move-result v9

    if-eqz v9, :cond_2

    move-object v5, v7

    goto :goto_2

    .line 12
    :cond_2
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v9

    if-eqz v9, :cond_3

    .line 13
    invoke-static {v3, v5, v2, p2}, Lcom/android/dx/dex/code/StdCatchBuilder;->makeEntry(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/CatchHandlerList;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable$Entry;

    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    move-object v3, v7

    move-object v5, v3

    move-object v2, v8

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 15
    :cond_4
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result p0

    if-eqz p0, :cond_5

    .line 16
    invoke-static {v3, v5, v2, p2}, Lcom/android/dx/dex/code/StdCatchBuilder;->makeEntry(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/CatchHandlerList;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable$Entry;

    move-result-object p0

    .line 17
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-nez p0, :cond_6

    .line 19
    sget-object p0, Lcom/android/dx/dex/code/CatchTable;->EMPTY:Lcom/android/dx/dex/code/CatchTable;

    return-object p0

    .line 20
    :cond_6
    new-instance p1, Lcom/android/dx/dex/code/CatchTable;

    invoke-direct {p1, p0}, Lcom/android/dx/dex/code/CatchTable;-><init>(I)V

    :goto_3
    if-ge v4, p0, :cond_7

    .line 21
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/dx/dex/code/CatchTable$Entry;

    invoke-virtual {p1, v4, p2}, Lcom/android/dx/dex/code/CatchTable;->set(ILcom/android/dx/dex/code/CatchTable$Entry;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 22
    :cond_7
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    return-object p1
.end method

.method private static handlersFor(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchHandlerList;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlock;->getLastInsn()Lcom/android/dx/rop/code/Insn;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    sget-object p0, Lcom/android/dx/dex/code/CatchHandlerList;->EMPTY:Lcom/android/dx/dex/code/CatchHandlerList;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    const/4 v4, -0x1

    .line 31
    if-ne v2, v4, :cond_1

    .line 32
    .line 33
    if-ne v1, v3, :cond_2

    .line 34
    .line 35
    :cond_1
    if-eq v2, v4, :cond_3

    .line 36
    .line 37
    add-int/lit8 v4, v3, 0x1

    .line 38
    .line 39
    if-ne v1, v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v2, v1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    .line 49
    .line 50
    const-string p1, "shouldn\'t happen: weird successors list"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_3
    :goto_0
    const/4 v1, 0x0

    .line 57
    move v2, v1

    .line 58
    :goto_1
    if-ge v2, v3, :cond_5

    .line 59
    .line 60
    invoke-interface {p0, v2}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget-object v5, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Lcom/android/dx/rop/type/Type;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    add-int/lit8 v3, v2, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    :goto_2
    new-instance v2, Lcom/android/dx/dex/code/CatchHandlerList;

    .line 79
    .line 80
    invoke-direct {v2, v3}, Lcom/android/dx/dex/code/CatchHandlerList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    :goto_3
    if-ge v1, v3, :cond_6

    .line 84
    .line 85
    new-instance v4, Lcom/android/dx/rop/cst/CstType;

    .line 86
    .line 87
    invoke-interface {p0, v1}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-direct {v4, v5}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-virtual {p1, v5}, Lcom/android/dx/dex/code/BlockAddresses;->getStart(I)Lcom/android/dx/dex/code/CodeAddress;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v5}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-virtual {v2, v1, v4, v5}, Lcom/android/dx/dex/code/CatchHandlerList;->set(ILcom/android/dx/rop/cst/CstType;I)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 113
    .line 114
    .line 115
    return-object v2
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

.method private static makeEntry(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/CatchHandlerList;Lcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable$Entry;
    .locals 0

    .line 1
    invoke-virtual {p3, p0}, Lcom/android/dx/dex/code/BlockAddresses;->getLast(Lcom/android/dx/rop/code/BasicBlock;)Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p3, p1}, Lcom/android/dx/dex/code/BlockAddresses;->getEnd(Lcom/android/dx/rop/code/BasicBlock;)Lcom/android/dx/dex/code/CodeAddress;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p3, Lcom/android/dx/dex/code/CatchTable$Entry;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-direct {p3, p0, p1, p2}, Lcom/android/dx/dex/code/CatchTable$Entry;-><init>(IILcom/android/dx/dex/code/CatchHandlerList;)V

    .line 20
    .line 21
    .line 22
    return-object p3
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
.end method

.method private static rangeIsValid(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/BlockAddresses;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p2, p0}, Lcom/android/dx/dex/code/BlockAddresses;->getLast(Lcom/android/dx/rop/code/BasicBlock;)Lcom/android/dx/dex/code/CodeAddress;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {p2, p1}, Lcom/android/dx/dex/code/BlockAddresses;->getEnd(Lcom/android/dx/rop/code/BasicBlock;)Lcom/android/dx/dex/code/CodeAddress;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sub-int/2addr p1, p0

    .line 22
    const p0, 0xffff

    .line 23
    .line 24
    .line 25
    if-gt p1, p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    :goto_0
    return p0

    .line 31
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 32
    .line 33
    const-string p1, "end == null"

    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 40
    .line 41
    const-string p1, "start == null"

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public build()Lcom/android/dx/dex/code/CatchTable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->method:Lcom/android/dx/rop/code/RopMethod;

    iget-object v1, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->order:[I

    iget-object v2, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->addresses:Lcom/android/dx/dex/code/BlockAddresses;

    invoke-static {v0, v1, v2}, Lcom/android/dx/dex/code/StdCatchBuilder;->build(Lcom/android/dx/rop/code/RopMethod;[ILcom/android/dx/dex/code/BlockAddresses;)Lcom/android/dx/dex/code/CatchTable;

    move-result-object v0

    return-object v0
.end method

.method public getCatchTypes()Ljava/util/HashSet;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/rop/type/Type;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->method:Lcom/android/dx/rop/code/RopMethod;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v4, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v4}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5}, Lcom/android/dx/rop/code/BasicBlock;->getLastInsn()Lcom/android/dx/rop/code/Insn;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-interface {v5}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    move v7, v3

    .line 39
    :goto_1
    if-ge v7, v6, :cond_0

    .line 40
    .line 41
    invoke-interface {v5, v7}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v7, v7, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-object v0
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

.method public hasAnyCatches()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/StdCatchBuilder;->method:Lcom/android/dx/rop/code/RopMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Lcom/android/dx/rop/code/BasicBlock;->getLastInsn()Lcom/android/dx/rop/code/Insn;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v4}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v2
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
