.class public final Lcom/android/dx/cf/code/Merger;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z
    .locals 5

    .line 1
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/type/Type;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getBasicType()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getBasicType()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    const/16 v4, 0x9

    .line 28
    .line 29
    if-ne v0, v3, :cond_1

    .line 30
    .line 31
    sget-object p0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 32
    .line 33
    move v0, v4

    .line 34
    :cond_1
    if-ne v2, v3, :cond_2

    .line 35
    .line 36
    sget-object p1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 37
    .line 38
    move v2, v4

    .line 39
    :cond_2
    const/4 v3, 0x0

    .line 40
    if-ne v0, v4, :cond_c

    .line 41
    .line 42
    if-eq v2, v4, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    sget-object v0, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 46
    .line 47
    if-ne p0, v0, :cond_4

    .line 48
    .line 49
    return v3

    .line 50
    :cond_4
    if-ne p1, v0, :cond_5

    .line 51
    .line 52
    return v1

    .line 53
    :cond_5
    sget-object v0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 54
    .line 55
    if-ne p0, v0, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_9

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    return v3

    .line 71
    :cond_7
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_7

    .line 90
    .line 91
    :cond_8
    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Merger;->isPossiblyAssignableFrom(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    return p0

    .line 96
    :cond_9
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_b

    .line 101
    .line 102
    sget-object p1, Lcom/android/dx/rop/type/Type;->SERIALIZABLE:Lcom/android/dx/rop/type/Type;

    .line 103
    .line 104
    if-eq p0, p1, :cond_b

    .line 105
    .line 106
    sget-object p1, Lcom/android/dx/rop/type/Type;->CLONEABLE:Lcom/android/dx/rop/type/Type;

    .line 107
    .line 108
    if-ne p0, p1, :cond_a

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_a
    move v1, v3

    .line 112
    :cond_b
    :goto_0
    return v1

    .line 113
    :cond_c
    :goto_1
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isIntlike()Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_d

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isIntlike()Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_d

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_d
    move v1, v3

    .line 127
    :goto_2
    return v1
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

.method public static mergeLocals(Lcom/android/dx/cf/code/OneLocalsArray;Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;
    .locals 5

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/code/OneLocalsArray;->getMaxLocals()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Lcom/android/dx/cf/code/OneLocalsArray;->getMaxLocals()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ne v1, v0, :cond_6

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v0, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/android/dx/cf/code/OneLocalsArray;->getOrNull(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p1, v2}, Lcom/android/dx/cf/code/OneLocalsArray;->getOrNull(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v3, v4}, Lcom/android/dx/cf/code/Merger;->mergeType(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/type/TypeBearer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    if-eq v4, v3, :cond_3

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/android/dx/cf/code/OneLocalsArray;->copy()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    if-nez v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/code/OneLocalsArray;->invalidate(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-virtual {v1, v2, v4}, Lcom/android/dx/cf/code/OneLocalsArray;->set(ILcom/android/dx/rop/type/TypeBearer;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    if-nez v1, :cond_5

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_5
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_6
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 58
    .line 59
    const-string p1, "mismatched maxLocals values"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0
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

.method public static mergeStack(Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/cf/code/ExecutionStack;)Lcom/android/dx/cf/code/ExecutionStack;
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ExecutionStack;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ExecutionStack;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ne v1, v0, :cond_6

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v0, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peek(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p1, v2}, Lcom/android/dx/cf/code/ExecutionStack;->peek(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v3, v4}, Lcom/android/dx/cf/code/Merger;->mergeType(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/type/TypeBearer;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    if-eq v5, v3, :cond_3

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ExecutionStack;->copy()Lcom/android/dx/cf/code/ExecutionStack;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    if-eqz v5, :cond_2

    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v1, v2, v5}, Lcom/android/dx/cf/code/ExecutionStack;->change(ILcom/android/dx/rop/type/TypeBearer;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 47
    .line 48
    new-instance p1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v0, "incompatible: "

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ", "

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p0
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v0, "...while merging stack["

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, "]"

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p0

    .line 107
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    if-nez v1, :cond_5

    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_5
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_6
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 118
    .line 119
    const-string p1, "mismatched stack depths"

    .line 120
    .line 121
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p0
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

.method public static mergeType(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/type/TypeBearer;
    .locals 2

    .line 1
    if-eqz p0, :cond_9

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-ne p0, p1, :cond_2

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isReference()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_7

    .line 36
    .line 37
    sget-object v0, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 38
    .line 39
    if-ne p0, v0, :cond_3

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_3
    if-ne p1, v0, :cond_4

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_4
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isArray()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_6

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Merger;->mergeType(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/type/TypeBearer;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-nez p0, :cond_5

    .line 70
    .line 71
    sget-object p0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_5
    check-cast p0, Lcom/android/dx/rop/type/Type;

    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getArrayType()Lcom/android/dx/rop/type/Type;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_6
    sget-object p0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_7
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->isIntlike()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_8

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->isIntlike()Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_8

    .line 95
    .line 96
    sget-object p0, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_8
    return-object v0

    .line 100
    :cond_9
    :goto_0
    return-object p0
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
