.class public Lcom/android/dx/ssa/LiteralOpUpgrader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final ssaMeth:Lcom/android/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

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
.end method

.method static synthetic access$000(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/ssa/NormalSsaInsn;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/ssa/LiteralOpUpgrader;->tryReplacingWithConstant(Lcom/android/dx/ssa/NormalSsaInsn;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 0

    invoke-static {p0}, Lcom/android/dx/ssa/LiteralOpUpgrader;->isConstIntZeroOrKnownNull(Lcom/android/dx/rop/code/RegisterSpec;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V

    return-void
.end method

.method private static isConstIntZeroOrKnownNull(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;->getLongBits()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long p0, v2, v4

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    :cond_0
    return v1
    .line 24
.end method

.method public static process(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/LiteralOpUpgrader;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/ssa/LiteralOpUpgrader;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/LiteralOpUpgrader;->run()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method private replacePlainInsn(Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p3, v1, p2, p4}, Lcom/android/dx/rop/code/Rops;->ropFor(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-nez p4, :cond_0

    .line 14
    .line 15
    new-instance p3, Lcom/android/dx/rop/code/PlainInsn;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p3, v3, p4, v0, p2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p3, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    move-object v2, p3

    .line 40
    move-object v6, p2

    .line 41
    move-object v7, p4

    .line 42
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    new-instance p2, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    invoke-direct {p2, p3, p4}, Lcom/android/dx/ssa/NormalSsaInsn;-><init>(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {p3}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    iget-object p4, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 63
    .line 64
    invoke-virtual {p4, p1}, Lcom/android/dx/ssa/SsaMethod;->onInsnRemoved(Lcom/android/dx/ssa/SsaInsn;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-interface {p3, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lcom/android/dx/ssa/SsaMethod;->onInsnAdded(Lcom/android/dx/ssa/SsaInsn;)V

    .line 77
    .line 78
    .line 79
    return-void
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

.method private run()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/android/dx/ssa/Optimizer;->getAdvice()Lcom/android/dx/rop/code/TranslationAdvice;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    new-instance v2, Lcom/android/dx/ssa/LiteralOpUpgrader$1;

    .line 8
    .line 9
    invoke-direct {v2, p0, v0}, Lcom/android/dx/ssa/LiteralOpUpgrader$1;-><init>(Lcom/android/dx/ssa/LiteralOpUpgrader;Lcom/android/dx/rop/code/TranslationAdvice;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/android/dx/ssa/SsaMethod;->forEachInsn(Lcom/android/dx/ssa/SsaInsn$Visitor;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private tryReplacingWithConstant(Lcom/android/dx/ssa/NormalSsaInsn;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v3, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 17
    .line 18
    invoke-virtual {v3, v1}, Lcom/android/dx/ssa/SsaMethod;->isRegALocal(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v3, 0x5

    .line 29
    if-eq v1, v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->getBasicType()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v5, 0x6

    .line 50
    if-ne v4, v5, :cond_1

    .line 51
    .line 52
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 53
    .line 54
    check-cast v1, Lcom/android/dx/rop/cst/Constant;

    .line 55
    .line 56
    invoke-direct {p0, p1, v4, v3, v1}, Lcom/android/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/16 v1, 0x38

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    if-ne v0, v1, :cond_0

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iget-object v0, p0, Lcom/android/dx/ssa/LiteralOpUpgrader;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    sub-int/2addr v0, v3

    .line 101
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lcom/android/dx/ssa/NormalSsaInsn;

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    invoke-direct {p0, p1, v4, v5, v0}, Lcom/android/dx/ssa/LiteralOpUpgrader;->replacePlainInsn(Lcom/android/dx/ssa/NormalSsaInsn;Lcom/android/dx/rop/code/RegisterSpecList;ILcom/android/dx/rop/cst/Constant;)V

    .line 109
    .line 110
    .line 111
    :cond_0
    return v3

    .line 112
    :cond_1
    return v2
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
.end method
