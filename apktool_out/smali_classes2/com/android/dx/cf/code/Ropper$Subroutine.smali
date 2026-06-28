.class Lcom/android/dx/cf/code/Ropper$Subroutine;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Subroutine"
.end annotation


# instance fields
.field private callerBlocks:Ljava/util/BitSet;

.field private retBlocks:Ljava/util/BitSet;

.field private startBlock:I

.field final synthetic this$0:Lcom/android/dx/cf/code/Ropper;


# direct methods
.method constructor <init>(Lcom/android/dx/cf/code/Ropper;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->this$0:Lcom/android/dx/cf/code/Ropper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->startBlock:I

    .line 3
    new-instance p2, Ljava/util/BitSet;

    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper;->access$100(Lcom/android/dx/cf/code/Ropper;)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->retBlocks:Ljava/util/BitSet;

    .line 4
    new-instance p2, Ljava/util/BitSet;

    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper;->access$100(Lcom/android/dx/cf/code/Ropper;)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    const/4 p2, 0x1

    .line 5
    invoke-static {p1, p2}, Lcom/android/dx/cf/code/Ropper;->access$202(Lcom/android/dx/cf/code/Ropper;Z)Z

    return-void
.end method

.method constructor <init>(Lcom/android/dx/cf/code/Ropper;II)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/Ropper$Subroutine;-><init>(Lcom/android/dx/cf/code/Ropper;I)V

    .line 7
    invoke-virtual {p0, p3}, Lcom/android/dx/cf/code/Ropper$Subroutine;->addRetBlock(I)V

    return-void
.end method

.method static synthetic access$1000(Lcom/android/dx/cf/code/Ropper$Subroutine;)I
    .locals 0

    iget p0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->startBlock:I

    return p0
.end method

.method static synthetic access$1300(Lcom/android/dx/cf/code/Ropper$Subroutine;)Ljava/util/BitSet;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->retBlocks:Ljava/util/BitSet;

    return-object p0
.end method


# virtual methods
.method addCallerBlock(I)V
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method

.method addRetBlock(I)V
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->retBlocks:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method

.method getStartBlock()I
    .locals 1

    iget v0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->startBlock:I

    return v0
.end method

.method getSuccessors()Lcom/android/dx/util/IntList;
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/BitSet;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-ltz v1, :cond_0

    .line 20
    .line 21
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 22
    .line 23
    invoke-static {v3, v1}, Lcom/android/dx/cf/code/Ropper;->access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v0, v3}, Lcom/android/dx/util/IntList;->add(I)V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 48
    .line 49
    .line 50
    return-object v0
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

.method mergeToSuccessors(Lcom/android/dx/cf/code/Frame;[I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    :goto_0
    if-ltz v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 11
    .line 12
    invoke-static {v2, v0}, Lcom/android/dx/cf/code/Ropper;->access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget v2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->startBlock:I

    .line 25
    .line 26
    invoke-virtual {p1, v2, v0}, Lcom/android/dx/cf/code/Frame;->subFrameForLabel(II)Lcom/android/dx/cf/code/Frame;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 33
    .line 34
    const/4 v5, -0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    move-object v8, p2

    .line 37
    invoke-static/range {v3 .. v8}, Lcom/android/dx/cf/code/Ropper;->access$400(Lcom/android/dx/cf/code/Ropper;IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-static {p2, v0}, Lcom/android/dx/util/Bits;->set([II)V

    .line 42
    .line 43
    .line 44
    :goto_1
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper$Subroutine;->callerBlocks:Ljava/util/BitSet;

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    invoke-virtual {v2, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    goto :goto_0

    .line 53
    :cond_1
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
