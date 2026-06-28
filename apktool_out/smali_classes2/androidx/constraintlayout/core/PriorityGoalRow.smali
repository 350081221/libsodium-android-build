.class public Landroidx/constraintlayout/core/PriorityGoalRow;
.super Landroidx/constraintlayout/core/ArrayRow;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field static final NOT_FOUND:I = -0x1

.field private static final epsilon:F = 1.0E-4f


# instance fields
.field private TABLE_SIZE:I

.field accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

.field private arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

.field mCache:Landroidx/constraintlayout/core/Cache;

.field private numGoals:I

.field private sortArray:[Landroidx/constraintlayout/core/SolverVariable;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/core/Cache;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/core/ArrayRow;-><init>(Landroidx/constraintlayout/core/Cache;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x80

    .line 5
    .line 6
    iput v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->TABLE_SIZE:I

    .line 7
    .line 8
    new-array v1, v0, [Landroidx/constraintlayout/core/SolverVariable;

    .line 9
    .line 10
    iput-object v1, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 11
    .line 12
    new-array v0, v0, [Landroidx/constraintlayout/core/SolverVariable;

    .line 13
    .line 14
    iput-object v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->sortArray:[Landroidx/constraintlayout/core/SolverVariable;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 18
    .line 19
    new-instance v0, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 20
    .line 21
    invoke-direct {v0, p0, p0}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;-><init>(Landroidx/constraintlayout/core/PriorityGoalRow;Landroidx/constraintlayout/core/PriorityGoalRow;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 25
    .line 26
    iput-object p1, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->mCache:Landroidx/constraintlayout/core/Cache;

    .line 27
    .line 28
    return-void
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
.end method

.method static synthetic access$000(Landroidx/constraintlayout/core/PriorityGoalRow;Landroidx/constraintlayout/core/SolverVariable;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/constraintlayout/core/PriorityGoalRow;->removeGoal(Landroidx/constraintlayout/core/SolverVariable;)V

    return-void
.end method

.method private final addToGoal(Landroidx/constraintlayout/core/SolverVariable;)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-le v0, v3, :cond_0

    .line 9
    .line 10
    array-length v0, v2

    .line 11
    mul-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [Landroidx/constraintlayout/core/SolverVariable;

    .line 18
    .line 19
    iput-object v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 20
    .line 21
    array-length v2, v0

    .line 22
    mul-int/lit8 v2, v2, 0x2

    .line 23
    .line 24
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, [Landroidx/constraintlayout/core/SolverVariable;

    .line 29
    .line 30
    iput-object v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->sortArray:[Landroidx/constraintlayout/core/SolverVariable;

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 33
    .line 34
    iget v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 35
    .line 36
    aput-object p1, v0, v2

    .line 37
    .line 38
    add-int/2addr v2, v1

    .line 39
    iput v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 40
    .line 41
    if-le v2, v1, :cond_2

    .line 42
    .line 43
    sub-int/2addr v2, v1

    .line 44
    aget-object v0, v0, v2

    .line 45
    .line 46
    iget v0, v0, Landroidx/constraintlayout/core/SolverVariable;->id:I

    .line 47
    .line 48
    iget v2, p1, Landroidx/constraintlayout/core/SolverVariable;->id:I

    .line 49
    .line 50
    if-le v0, v2, :cond_2

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    move v2, v0

    .line 54
    :goto_0
    iget v3, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 55
    .line 56
    if-ge v2, v3, :cond_1

    .line 57
    .line 58
    iget-object v3, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->sortArray:[Landroidx/constraintlayout/core/SolverVariable;

    .line 59
    .line 60
    iget-object v4, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 61
    .line 62
    aget-object v4, v4, v2

    .line 63
    .line 64
    aput-object v4, v3, v2

    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->sortArray:[Landroidx/constraintlayout/core/SolverVariable;

    .line 70
    .line 71
    new-instance v4, Landroidx/constraintlayout/core/PriorityGoalRow$1;

    .line 72
    .line 73
    invoke-direct {v4, p0}, Landroidx/constraintlayout/core/PriorityGoalRow$1;-><init>(Landroidx/constraintlayout/core/PriorityGoalRow;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v0, v3, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 80
    .line 81
    if-ge v0, v2, :cond_2

    .line 82
    .line 83
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 84
    .line 85
    iget-object v3, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->sortArray:[Landroidx/constraintlayout/core/SolverVariable;

    .line 86
    .line 87
    aget-object v3, v3, v0

    .line 88
    .line 89
    aput-object v3, v2, v0

    .line 90
    .line 91
    add-int/lit8 v0, v0, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    iput-boolean v1, p1, Landroidx/constraintlayout/core/SolverVariable;->inGoal:Z

    .line 95
    .line 96
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/core/SolverVariable;->addToRow(Landroidx/constraintlayout/core/ArrayRow;)V

    .line 97
    .line 98
    .line 99
    return-void
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

.method private final removeGoal(Landroidx/constraintlayout/core/SolverVariable;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_2

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    if-ne v2, p1, :cond_1

    .line 12
    .line 13
    :goto_1
    iget v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 14
    .line 15
    add-int/lit8 v3, v2, -0x1

    .line 16
    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 20
    .line 21
    add-int/lit8 v3, v1, 0x1

    .line 22
    .line 23
    aget-object v4, v2, v3

    .line 24
    .line 25
    aput-object v4, v2, v1

    .line 26
    .line 27
    move v1, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 30
    .line 31
    iput v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 32
    .line 33
    iput-boolean v0, p1, Landroidx/constraintlayout/core/SolverVariable;->inGoal:Z

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-void
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


# virtual methods
.method public addError(Landroidx/constraintlayout/core/SolverVariable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;->init(Landroidx/constraintlayout/core/SolverVariable;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Landroidx/constraintlayout/core/SolverVariable;->goalStrengthVector:[F

    .line 12
    .line 13
    iget v1, p1, Landroidx/constraintlayout/core/SolverVariable;->strength:I

    .line 14
    .line 15
    const/high16 v2, 0x3f800000    # 1.0f

    .line 16
    .line 17
    aput v2, v0, v1

    .line 18
    .line 19
    invoke-direct {p0, p1}, Landroidx/constraintlayout/core/PriorityGoalRow;->addToGoal(Landroidx/constraintlayout/core/SolverVariable;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/constraintlayout/core/ArrayRow;->constantValue:F

    .line 6
    .line 7
    return-void
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
.end method

.method public getPivotCandidate(Landroidx/constraintlayout/core/LinearSystem;[Z)Landroidx/constraintlayout/core/SolverVariable;
    .locals 4

    .line 1
    const/4 p1, -0x1

    .line 2
    const/4 v0, 0x0

    .line 3
    move v1, p1

    .line 4
    :goto_0
    iget v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 5
    .line 6
    if-ge v0, v2, :cond_3

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 9
    .line 10
    aget-object v2, v2, v0

    .line 11
    .line 12
    iget v3, v2, Landroidx/constraintlayout/core/SolverVariable;->id:I

    .line 13
    .line 14
    aget-boolean v3, p2, v3

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    iget-object v3, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;->init(Landroidx/constraintlayout/core/SolverVariable;)V

    .line 22
    .line 23
    .line 24
    if-ne v1, p1, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;->isNegative()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 36
    .line 37
    iget-object v3, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 38
    .line 39
    aget-object v3, v3, v1

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;->isSmallerThan(Landroidx/constraintlayout/core/SolverVariable;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    :goto_1
    move v1, v0

    .line 48
    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    if-ne v1, p1, :cond_4

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    return-object p1

    .line 55
    :cond_4
    iget-object p1, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 56
    .line 57
    aget-object p1, p1, v1

    .line 58
    .line 59
    return-object p1
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

.method public isEmpty()Z
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " goal -> ("

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v1, p0, Landroidx/constraintlayout/core/ArrayRow;->constantValue:F

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, ") : "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    iget v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->numGoals:I

    .line 32
    .line 33
    if-ge v1, v2, :cond_0

    .line 34
    .line 35
    iget-object v2, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->arrayGoals:[Landroidx/constraintlayout/core/SolverVariable;

    .line 36
    .line 37
    aget-object v2, v2, v1

    .line 38
    .line 39
    iget-object v3, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;->init(Landroidx/constraintlayout/core/SolverVariable;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, " "

    .line 58
    .line 59
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object v0
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

.method public updateFromRow(Landroidx/constraintlayout/core/LinearSystem;Landroidx/constraintlayout/core/ArrayRow;Z)V
    .locals 5

    .line 1
    iget-object p1, p2, Landroidx/constraintlayout/core/ArrayRow;->variable:Landroidx/constraintlayout/core/SolverVariable;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p3, p2, Landroidx/constraintlayout/core/ArrayRow;->variables:Landroidx/constraintlayout/core/ArrayRow$ArrayRowVariables;

    .line 7
    .line 8
    invoke-interface {p3}, Landroidx/constraintlayout/core/ArrayRow$ArrayRowVariables;->getCurrentSize()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p3, v1}, Landroidx/constraintlayout/core/ArrayRow$ArrayRowVariables;->getVariable(I)Landroidx/constraintlayout/core/SolverVariable;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {p3, v1}, Landroidx/constraintlayout/core/ArrayRow$ArrayRowVariables;->getVariableValue(I)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v4, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;->init(Landroidx/constraintlayout/core/SolverVariable;)V

    .line 26
    .line 27
    .line 28
    iget-object v4, p0, Landroidx/constraintlayout/core/PriorityGoalRow;->accessor:Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;

    .line 29
    .line 30
    invoke-virtual {v4, p1, v3}, Landroidx/constraintlayout/core/PriorityGoalRow$GoalVariableAccessor;->addToGoal(Landroidx/constraintlayout/core/SolverVariable;F)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-direct {p0, v2}, Landroidx/constraintlayout/core/PriorityGoalRow;->addToGoal(Landroidx/constraintlayout/core/SolverVariable;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget v2, p0, Landroidx/constraintlayout/core/ArrayRow;->constantValue:F

    .line 40
    .line 41
    iget v4, p2, Landroidx/constraintlayout/core/ArrayRow;->constantValue:F

    .line 42
    .line 43
    mul-float/2addr v4, v3

    .line 44
    add-float/2addr v2, v4

    .line 45
    iput v2, p0, Landroidx/constraintlayout/core/ArrayRow;->constantValue:F

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-direct {p0, p1}, Landroidx/constraintlayout/core/PriorityGoalRow;->removeGoal(Landroidx/constraintlayout/core/SolverVariable;)V

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
