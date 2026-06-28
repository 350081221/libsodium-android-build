.class public Lcom/android/dx/ssa/back/IdenticalBlockCombiner;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final blocks:Lcom/android/dx/rop/code/BasicBlockList;

.field private final newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

.field private final ropMethod:Lcom/android/dx/rop/code/RopMethod;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/RopMethod;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->ropMethod:Lcom/android/dx/rop/code/RopMethod;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlockList;->getMutableCopy()Lcom/android/dx/rop/code/BasicBlockList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private combineBlocks(ILcom/android/dx/util/IntList;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/util/IntList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget-object v4, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 14
    .line 15
    invoke-virtual {v4, v3}, Lcom/android/dx/rop/code/BasicBlockList;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v5, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->ropMethod:Lcom/android/dx/rop/code/RopMethod;

    .line 20
    .line 21
    invoke-virtual {v4}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v5, v4}, Lcom/android/dx/rop/code/RopMethod;->labelToPredecessors(I)Lcom/android/dx/util/IntList;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Lcom/android/dx/util/IntList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    move v6, v1

    .line 34
    :goto_1
    if-ge v6, v5, :cond_0

    .line 35
    .line 36
    iget-object v7, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 37
    .line 38
    invoke-virtual {v4, v6}, Lcom/android/dx/util/IntList;->get(I)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    invoke-virtual {v7, v8}, Lcom/android/dx/rop/code/BasicBlockList;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-direct {p0, v7, v3, p1}, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->replaceSucc(Lcom/android/dx/rop/code/BasicBlock;II)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v6, v6, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    return-void
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

.method private static compareInsns(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlock;->getInsns()Lcom/android/dx/rop/code/InsnList;

    move-result-object p0

    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getInsns()Lcom/android/dx/rop/code/InsnList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/InsnList;->contentEquals(Lcom/android/dx/rop/code/InsnList;)Z

    move-result p0

    return p0
.end method

.method private replaceSucc(Lcom/android/dx/rop/code/BasicBlock;II)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->mutableCopy()Lcom/android/dx/util/IntList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p2}, Lcom/android/dx/util/IntList;->indexOf(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, v1, p3}, Lcom/android/dx/util/IntList;->set(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ne v1, p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p3, v1

    .line 24
    :goto_0
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 25
    .line 26
    .line 27
    new-instance p2, Lcom/android/dx/rop/code/BasicBlock;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getInsns()Lcom/android/dx/rop/code/InsnList;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {p2, v1, v2, v0, p3}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 38
    .line 39
    .line 40
    iget-object p3, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p3, p1}, Lcom/android/dx/util/LabeledList;->indexOfLabel(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p3, p1, p2}, Lcom/android/dx/rop/code/BasicBlockList;->set(ILcom/android/dx/rop/code/BasicBlock;)V

    .line 51
    .line 52
    .line 53
    return-void
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
.method public process()Lcom/android/dx/rop/code/RopMethod;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/util/BitSet;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/android/dx/util/LabeledList;->getMaxLabel()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    const/4 v4, 0x1

    .line 21
    if-ge v3, v0, :cond_6

    .line 22
    .line 23
    iget-object v5, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 24
    .line 25
    invoke-virtual {v5, v3}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v5}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-virtual {v1, v6}, Ljava/util/BitSet;->get(I)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_0
    iget-object v6, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->ropMethod:Lcom/android/dx/rop/code/RopMethod;

    .line 42
    .line 43
    invoke-virtual {v5}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v6, v5}, Lcom/android/dx/rop/code/RopMethod;->labelToPredecessors(I)Lcom/android/dx/util/IntList;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5}, Lcom/android/dx/util/IntList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    move v7, v2

    .line 56
    :goto_1
    if-ge v7, v6, :cond_5

    .line 57
    .line 58
    invoke-virtual {v5, v7}, Lcom/android/dx/util/IntList;->get(I)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    iget-object v9, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 63
    .line 64
    invoke-virtual {v9, v8}, Lcom/android/dx/rop/code/BasicBlockList;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual {v1, v8}, Ljava/util/BitSet;->get(I)Z

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-nez v10, :cond_4

    .line 73
    .line 74
    invoke-virtual {v9}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-virtual {v10}, Lcom/android/dx/util/IntList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-gt v10, v4, :cond_4

    .line 83
    .line 84
    invoke-virtual {v9}, Lcom/android/dx/rop/code/BasicBlock;->getFirstInsn()Lcom/android/dx/rop/code/Insn;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-virtual {v10}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {v10}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    const/16 v11, 0x37

    .line 97
    .line 98
    if-ne v10, v11, :cond_1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    new-instance v10, Lcom/android/dx/util/IntList;

    .line 102
    .line 103
    invoke-direct {v10}, Lcom/android/dx/util/IntList;-><init>()V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v11, v7, 0x1

    .line 107
    .line 108
    :goto_2
    if-ge v11, v6, :cond_3

    .line 109
    .line 110
    invoke-virtual {v5, v11}, Lcom/android/dx/util/IntList;->get(I)I

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    iget-object v13, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->blocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 115
    .line 116
    invoke-virtual {v13, v12}, Lcom/android/dx/rop/code/BasicBlockList;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-virtual {v13}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    invoke-virtual {v14}, Lcom/android/dx/util/IntList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    if-ne v14, v4, :cond_2

    .line 129
    .line 130
    invoke-static {v9, v13}, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->compareInsns(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock;)Z

    .line 131
    .line 132
    .line 133
    move-result v13

    .line 134
    if-eqz v13, :cond_2

    .line 135
    .line 136
    invoke-virtual {v10, v12}, Lcom/android/dx/util/IntList;->add(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v12}, Ljava/util/BitSet;->set(I)V

    .line 140
    .line 141
    .line 142
    :cond_2
    add-int/lit8 v11, v11, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    invoke-direct {p0, v8, v10}, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->combineBlocks(ILcom/android/dx/util/IntList;)V

    .line 146
    .line 147
    .line 148
    :cond_4
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_5
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_6
    sub-int/2addr v0, v4

    .line 156
    :goto_5
    if-ltz v0, :cond_8

    .line 157
    .line 158
    iget-object v2, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 159
    .line 160
    invoke-virtual {v2, v0}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_7

    .line 173
    .line 174
    iget-object v2, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 175
    .line 176
    const/4 v3, 0x0

    .line 177
    invoke-virtual {v2, v0, v3}, Lcom/android/dx/rop/code/BasicBlockList;->set(ILcom/android/dx/rop/code/BasicBlock;)V

    .line 178
    .line 179
    .line 180
    :cond_7
    add-int/lit8 v0, v0, -0x1

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    iget-object v0, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 184
    .line 185
    invoke-virtual {v0}, Lcom/android/dx/util/LabeledList;->shrinkToFit()V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 191
    .line 192
    .line 193
    new-instance v0, Lcom/android/dx/rop/code/RopMethod;

    .line 194
    .line 195
    iget-object v1, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->newBlocks:Lcom/android/dx/rop/code/BasicBlockList;

    .line 196
    .line 197
    iget-object v2, p0, Lcom/android/dx/ssa/back/IdenticalBlockCombiner;->ropMethod:Lcom/android/dx/rop/code/RopMethod;

    .line 198
    .line 199
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RopMethod;->getFirstLabel()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-direct {v0, v1, v2}, Lcom/android/dx/rop/code/RopMethod;-><init>(Lcom/android/dx/rop/code/BasicBlockList;I)V

    .line 204
    .line 205
    .line 206
    return-object v0
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
.end method
