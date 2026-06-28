.class public final Lcom/android/dx/rop/code/BasicBlock;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/util/LabeledItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/rop/code/BasicBlock$Visitor;
    }
.end annotation


# instance fields
.field private final insns:Lcom/android/dx/rop/code/InsnList;

.field private final label:I

.field private final primarySuccessor:I

.field private final successors:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_7

    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    add-int/lit8 v1, v0, -0x2

    .line 16
    .line 17
    :goto_0
    const/4 v2, 0x1

    .line 18
    if-ltz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2, v1}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ne v3, v2, :cond_0

    .line 33
    .line 34
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    new-instance p2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string p3, "insns["

    .line 45
    .line 46
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p3, "] is a branch or can throw"

    .line 53
    .line 54
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_1
    sub-int/2addr v0, v2

    .line 66
    invoke-virtual {p2, v0}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eq v0, v2, :cond_5

    .line 79
    .line 80
    :try_start_1
    invoke-virtual {p3}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    .line 82
    .line 83
    const/4 v0, -0x1

    .line 84
    if-lt p4, v0, :cond_4

    .line 85
    .line 86
    if-ltz p4, :cond_3

    .line 87
    .line 88
    invoke-virtual {p3, p4}, Lcom/android/dx/util/IntList;->contains(I)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    new-instance p2, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v0, "primarySuccessor "

    .line 103
    .line 104
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p4, " not in successors "

    .line 111
    .line 112
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_3
    :goto_1
    iput p1, p0, Lcom/android/dx/rop/code/BasicBlock;->label:I

    .line 127
    .line 128
    iput-object p2, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 129
    .line 130
    iput-object p3, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 131
    .line 132
    iput p4, p0, Lcom/android/dx/rop/code/BasicBlock;->primarySuccessor:I

    .line 133
    .line 134
    return-void

    .line 135
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 136
    .line 137
    const-string p2, "primarySuccessor < -1"

    .line 138
    .line 139
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 144
    .line 145
    const-string p2, "successors == null"

    .line 146
    .line 147
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 152
    .line 153
    const-string p2, "insns does not end with a branch or throwing instruction"

    .line 154
    .line 155
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    const-string p2, "insns.size() == 0"

    .line 162
    .line 163
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :catch_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 168
    .line 169
    const-string p2, "insns == null"

    .line 170
    .line 171
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    const-string p2, "label < 0"

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1
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


# virtual methods
.method public canThrow()Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/InsnList;->getLast()Lcom/android/dx/rop/code/Insn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->canThrow()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getExceptionHandlerTypes()Lcom/android/dx/rop/type/TypeList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/InsnList;->getLast()Lcom/android/dx/rop/code/Insn;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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
.end method

.method public getFirstInsn()Lcom/android/dx/rop/code/Insn;
    .locals 2

    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    move-result-object v0

    return-object v0
.end method

.method public getInsns()Lcom/android/dx/rop/code/InsnList;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    return-object v0
.end method

.method public getLabel()I
    .locals 1

    iget v0, p0, Lcom/android/dx/rop/code/BasicBlock;->label:I

    return v0
.end method

.method public getLastInsn()Lcom/android/dx/rop/code/Insn;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/InsnList;->getLast()Lcom/android/dx/rop/code/Insn;

    move-result-object v0

    return-object v0
.end method

.method public getPrimarySuccessor()I
    .locals 1

    iget v0, p0, Lcom/android/dx/rop/code/BasicBlock;->primarySuccessor:I

    return v0
.end method

.method public getSecondarySuccessor()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Lcom/android/dx/rop/code/BasicBlock;->primarySuccessor:I

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :cond_0
    return v0

    .line 29
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 30
    .line 31
    const-string v1, "block doesn\'t have exactly two successors"

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
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

.method public getSuccessors()Lcom/android/dx/util/IntList;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    return-object v0
.end method

.method public hasExceptionHandlers()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/InsnList;->getLast()Lcom/android/dx/rop/code/Insn;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getCatches()Lcom/android/dx/rop/type/TypeList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return v0
    .line 21
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/android/dx/rop/code/BasicBlock;->label:I

    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withRegisterOffset(I)Lcom/android/dx/rop/code/BasicBlock;
    .locals 4

    new-instance v0, Lcom/android/dx/rop/code/BasicBlock;

    iget v1, p0, Lcom/android/dx/rop/code/BasicBlock;->label:I

    iget-object v2, p0, Lcom/android/dx/rop/code/BasicBlock;->insns:Lcom/android/dx/rop/code/InsnList;

    invoke-virtual {v2, p1}, Lcom/android/dx/rop/code/InsnList;->withRegisterOffset(I)Lcom/android/dx/rop/code/InsnList;

    move-result-object p1

    iget-object v2, p0, Lcom/android/dx/rop/code/BasicBlock;->successors:Lcom/android/dx/util/IntList;

    iget v3, p0, Lcom/android/dx/rop/code/BasicBlock;->primarySuccessor:I

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    return-object v0
.end method
