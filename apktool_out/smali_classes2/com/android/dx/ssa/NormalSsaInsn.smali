.class public final Lcom/android/dx/ssa/NormalSsaInsn;
.super Lcom/android/dx/ssa/SsaInsn;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private insn:Lcom/android/dx/rop/code/Insn;


# direct methods
.method constructor <init>(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0, p2}, Lcom/android/dx/ssa/SsaInsn;-><init>(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

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
.method public accept(Lcom/android/dx/ssa/SsaInsn$Visitor;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->isNormalMoveInsn()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lcom/android/dx/ssa/SsaInsn$Visitor;->visitMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-interface {p1, p0}, Lcom/android/dx/ssa/SsaInsn$Visitor;->visitNonMoveInsn(Lcom/android/dx/ssa/NormalSsaInsn;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    return-void
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
.end method

.method public canThrow()Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->canThrow()Z

    move-result v0

    return v0
.end method

.method public final changeOneSource(ILcom/android/dx/rop/code/RegisterSpec;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

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
    new-instance v2, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v1, :cond_1

    .line 18
    .line 19
    if-ne v3, p1, :cond_0

    .line 20
    .line 21
    move-object v4, p2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    :goto_1
    invoke-virtual {v2, v3, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eq v0, v1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getParent()Lcom/android/dx/ssa/SsaMethod;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, p0, p1, p2}, Lcom/android/dx/ssa/SsaMethod;->onSourceChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    iget-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p1, p2, v2}, Lcom/android/dx/rop/code/Insn;->withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 72
    .line 73
    return-void
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

.method public clone()Lcom/android/dx/ssa/NormalSsaInsn;
    .locals 1

    .line 3
    invoke-super {p0}, Lcom/android/dx/ssa/SsaInsn;->clone()Lcom/android/dx/ssa/SsaInsn;

    move-result-object v0

    check-cast v0, Lcom/android/dx/ssa/NormalSsaInsn;

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/android/dx/ssa/SsaInsn;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->clone()Lcom/android/dx/ssa/NormalSsaInsn;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->clone()Lcom/android/dx/ssa/NormalSsaInsn;

    move-result-object v0

    return-object v0
.end method

.method public getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x36

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    const/4 v1, 0x0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_1
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_2
    return-object v0
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

.method public getOpcode()Lcom/android/dx/rop/code/Rop;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    move-result-object v0

    return-object v0
.end method

.method public getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    return-object v0
.end method

.method public getSources()Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v0

    return-object v0
.end method

.method public hasSideEffect()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-static {}, Lcom/android/dx/ssa/Optimizer;->getPreserveLocals()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    move v1, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    :goto_0
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v3, 0x2

    .line 33
    if-eq v0, v3, :cond_2

    .line 34
    .line 35
    const/4 v3, 0x5

    .line 36
    if-eq v0, v3, :cond_2

    .line 37
    .line 38
    const/16 v3, 0x37

    .line 39
    .line 40
    if-eq v0, v3, :cond_2

    .line 41
    .line 42
    return v2

    .line 43
    :cond_2
    return v1
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

.method public isMoveException()Z
    .locals 2

    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isNormalMoveInsn()Z
    .locals 2

    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPhiOrMove()Z
    .locals 1

    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->isNormalMoveInsn()Z

    move-result v0

    return v0
.end method

.method public final mapSourceRegisters(Lcom/android/dx/ssa/RegisterMapper;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lcom/android/dx/ssa/RegisterMapper;->map(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2, p1}, Lcom/android/dx/rop/code/Insn;->withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getParent()Lcom/android/dx/ssa/SsaMethod;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1, p0, v0}, Lcom/android/dx/ssa/SsaMethod;->onSourcesChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
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
.end method

.method public final setNewSources(Lcom/android/dx/rop/code/RegisterSpecList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/android/dx/rop/code/Insn;->withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    const-string v0, "Sources counts don\'t match"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
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
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/android/dx/ssa/NormalSsaInsn;->toRopInsn()Lcom/android/dx/rop/code/Insn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toRopInsn()Lcom/android/dx/rop/code/Insn;
    .locals 3

    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v1

    iget-object v2, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    invoke-virtual {v2}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/dx/rop/code/Insn;->withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;

    move-result-object v0

    return-object v0
.end method

.method public upgradeToLiteral()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->withSourceLiteral()Lcom/android/dx/rop/code/Insn;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lcom/android/dx/ssa/NormalSsaInsn;->insn:Lcom/android/dx/rop/code/Insn;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getParent()Lcom/android/dx/ssa/SsaMethod;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, p0, v0}, Lcom/android/dx/ssa/SsaMethod;->onSourcesChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method
