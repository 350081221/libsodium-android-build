.class public final Lcom/android/dx/cf/code/ExecutionStack;
.super Lcom/android/dx/util/MutabilityControl;
.source "SourceFile"


# instance fields
.field private final local:[Z

.field private final stack:[Lcom/android/dx/rop/type/TypeBearer;

.field private stackPtr:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-direct {p0, v1}, Lcom/android/dx/util/MutabilityControl;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    new-array v1, p1, [Lcom/android/dx/rop/type/TypeBearer;

    .line 11
    .line 12
    iput-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 13
    .line 14
    new-array p1, p1, [Z

    .line 15
    .line 16
    iput-object p1, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 17
    .line 18
    iput v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static stackElementString(Lcom/android/dx/rop/type/TypeBearer;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "<invalid>"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method private static throwSimException(Ljava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;
    .locals 3

    new-instance v0, Lcom/android/dx/cf/code/SimException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stack: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public annotate(Lcom/android/dex/util/ExceptionWithContext;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-gt v1, v0, :cond_1

    .line 7
    .line 8
    if-ne v1, v0, :cond_0

    .line 9
    .line 10
    const-string/jumbo v2, "top0"

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    sub-int v2, v0, v1

    .line 15
    .line 16
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v4, "stack["

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, "]: "

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 39
    .line 40
    aget-object v2, v2, v1

    .line 41
    .line 42
    invoke-static {v2}, Lcom/android/dx/cf/code/ExecutionStack;->stackElementString(Lcom/android/dx/rop/type/TypeBearer;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p1, v2}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-void
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

.method public change(ILcom/android/dx/rop/type/TypeBearer;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getFrameType()Lcom/android/dx/rop/type/TypeBearer;

    .line 5
    .line 6
    .line 7
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 9
    .line 10
    sub-int/2addr v0, p1

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 14
    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eq v1, v2, :cond_1

    .line 36
    .line 37
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v2, "incompatible substitution: "

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lcom/android/dx/cf/code/ExecutionStack;->stackElementString(Lcom/android/dx/rop/type/TypeBearer;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, " -> "

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Lcom/android/dx/cf/code/ExecutionStack;->stackElementString(Lcom/android/dx/rop/type/TypeBearer;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, Lcom/android/dx/cf/code/ExecutionStack;->throwSimException(Ljava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-object p1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 74
    .line 75
    aput-object p2, p1, v0

    .line 76
    .line 77
    return-void

    .line 78
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 79
    .line 80
    const-string/jumbo p2, "type == null"

    .line 81
    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
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

.method public clear()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    iget v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v3, v2, v1

    .line 14
    .line 15
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 16
    .line 17
    aput-boolean v0, v2, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 23
    .line 24
    return-void
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
.end method

.method public copy()Lcom/android/dx/cf/code/ExecutionStack;
    .locals 5

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/ExecutionStack;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/ExecutionStack;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    iget-object v2, v0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 19
    .line 20
    iget-object v2, v0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 21
    .line 22
    array-length v3, v1

    .line 23
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 27
    .line 28
    iput v1, v0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 29
    .line 30
    return-object v0
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

.method public getMaxStack()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    array-length v0, v0

    return v0
.end method

.method public makeInitialized(Lcom/android/dx/rop/type/Type;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getInitializedType()Lcom/android/dx/rop/type/Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 19
    .line 20
    aget-object v3, v2, v1

    .line 21
    .line 22
    if-ne v3, p1, :cond_1

    .line 23
    .line 24
    aput-object v0, v2, v1

    .line 25
    .line 26
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    return-void
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
.end method

.method public merge(Lcom/android/dx/cf/code/ExecutionStack;)Lcom/android/dx/cf/code/ExecutionStack;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Merger;->mergeStack(Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/cf/code/ExecutionStack;)Lcom/android/dx/cf/code/ExecutionStack;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception v0

    .line 7
    const-string/jumbo v1, "underlay stack:"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/android/dx/cf/code/ExecutionStack;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "overlay stack:"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/android/dx/cf/code/ExecutionStack;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public peek(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    const-string/jumbo p1, "underflow"

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/android/dx/cf/code/ExecutionStack;->throwSimException(Ljava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 16
    .line 17
    sub-int/2addr v0, p1

    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    aget-object p1, v1, v0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v0, "n < 0"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
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
.end method

.method public peekLocal(I)Z
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 8
    .line 9
    sub-int/2addr v0, p1

    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    aget-boolean p1, v1, v0

    .line 13
    .line 14
    return p1

    .line 15
    :cond_0
    new-instance p1, Lcom/android/dx/cf/code/SimException;

    .line 16
    .line 17
    const-string v0, "stack: underflow"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v0, "n < 0"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
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
.end method

.method public peekType(I)Lcom/android/dx/rop/type/Type;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/ExecutionStack;->peek(I)Lcom/android/dx/rop/type/TypeBearer;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object p1

    return-object p1
.end method

.method public pop()Lcom/android/dx/rop/type/TypeBearer;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peek(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    iget v3, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 12
    .line 13
    add-int/lit8 v4, v3, -0x1

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    aput-object v5, v2, v4

    .line 17
    .line 18
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 19
    .line 20
    add-int/lit8 v4, v3, -0x1

    .line 21
    .line 22
    aput-boolean v0, v2, v4

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v3, v0

    .line 33
    iput v3, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 34
    .line 35
    return-object v1
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

.method public push(Lcom/android/dx/rop/type/TypeBearer;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getFrameType()Lcom/android/dx/rop/type/TypeBearer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    iget v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 17
    .line 18
    add-int v2, v1, v0

    .line 19
    .line 20
    iget-object v3, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 21
    .line 22
    array-length v4, v3

    .line 23
    if-le v2, v4, :cond_0

    .line 24
    .line 25
    const-string p1, "overflow"

    .line 26
    .line 27
    invoke-static {p1}, Lcom/android/dx/cf/code/ExecutionStack;->throwSimException(Ljava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    if-ne v0, v2, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    aput-object v0, v3, v1

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    iput v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 40
    .line 41
    :cond_1
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 42
    .line 43
    aput-object p1, v3, v0

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    iput v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 51
    .line 52
    const-string/jumbo v0, "type == null"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
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

.method public setLocal()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 5
    .line 6
    iget v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    aput-boolean v2, v0, v1

    .line 10
    .line 11
    return-void
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

.method public size()I
    .locals 1

    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    return v0
.end method
