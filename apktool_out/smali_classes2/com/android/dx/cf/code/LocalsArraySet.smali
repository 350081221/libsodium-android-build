.class public Lcom/android/dx/cf/code/LocalsArraySet;
.super Lcom/android/dx/cf/code/LocalsArray;
.source "SourceFile"


# instance fields
.field private final primary:Lcom/android/dx/cf/code/OneLocalsArray;

.field private final secondaries:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/cf/code/LocalsArray;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/LocalsArray;-><init>(Z)V

    .line 2
    new-instance v0, Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-direct {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;-><init>(I)V

    iput-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    return-void
.end method

.method private constructor <init>(Lcom/android/dx/cf/code/LocalsArraySet;)V
    .locals 4

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/cf/code/LocalsArraySet;->getMaxLocals()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/LocalsArray;-><init>(Z)V

    .line 8
    iget-object v0, p1, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {v0}, Lcom/android/dx/cf/code/OneLocalsArray;->copy()Lcom/android/dx/cf/code/OneLocalsArray;

    move-result-object v0

    iput-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p1, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 10
    iget-object v0, p1, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_2

    .line 11
    iget-object v2, p1, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/dx/cf/code/LocalsArray;

    if-nez v2, :cond_1

    .line 12
    iget-object v2, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 13
    :cond_1
    iget-object v3, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    invoke-virtual {v2}, Lcom/android/dx/cf/code/LocalsArray;->copy()Lcom/android/dx/cf/code/LocalsArray;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/cf/code/OneLocalsArray;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/cf/code/OneLocalsArray;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/cf/code/LocalsArray;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-virtual {p1}, Lcom/android/dx/cf/code/OneLocalsArray;->getMaxLocals()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/LocalsArray;-><init>(Z)V

    .line 5
    iput-object p1, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 6
    iput-object p2, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    return-void
.end method

.method private getSecondaryForLabel(I)Lcom/android/dx/cf/code/LocalsArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/android/dx/cf/code/LocalsArray;

    .line 18
    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private mergeWithOne(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/LocalsArraySet;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/cf/code/OneLocalsArray;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/cf/code/OneLocalsArray;->merge(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    move v5, v4

    .line 31
    :goto_0
    if-ge v4, v2, :cond_3

    .line 32
    .line 33
    iget-object v6, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, Lcom/android/dx/cf/code/LocalsArray;

    .line 40
    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v6, p1}, Lcom/android/dx/cf/code/LocalsArray;->merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;

    .line 44
    .line 45
    .line 46
    move-result-object v7
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_1

    .line 48
    :catch_0
    move-exception v7

    .line 49
    new-instance v8, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v9, "Merging one locals against caller block "

    .line 55
    .line 56
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-static {v4}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v7, v8}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    const/4 v7, 0x0

    .line 74
    :goto_1
    if-nez v5, :cond_2

    .line 75
    .line 76
    if-eq v6, v7, :cond_1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_1
    move v5, v3

    .line 80
    goto :goto_3

    .line 81
    :cond_2
    :goto_2
    const/4 v5, 0x1

    .line 82
    :goto_3
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    iget-object p1, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 89
    .line 90
    if-ne p1, v0, :cond_4

    .line 91
    .line 92
    if-nez v5, :cond_4

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_4
    new-instance p1, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 96
    .line 97
    invoke-direct {p1, v0, v1}, Lcom/android/dx/cf/code/LocalsArraySet;-><init>(Lcom/android/dx/cf/code/OneLocalsArray;Ljava/util/ArrayList;)V

    .line 98
    .line 99
    .line 100
    return-object p1
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

.method private mergeWithSet(Lcom/android/dx/cf/code/LocalsArraySet;)Lcom/android/dx/cf/code/LocalsArraySet;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/cf/code/LocalsArraySet;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/cf/code/OneLocalsArray;->merge(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p1, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    move v7, v6

    .line 35
    :goto_0
    if-ge v6, v3, :cond_7

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    if-ge v6, v1, :cond_0

    .line 39
    .line 40
    iget-object v9, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    check-cast v9, Lcom/android/dx/cf/code/LocalsArray;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    move-object v9, v8

    .line 50
    :goto_1
    if-ge v6, v2, :cond_1

    .line 51
    .line 52
    iget-object v10, p1, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    check-cast v10, Lcom/android/dx/cf/code/LocalsArray;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    move-object v10, v8

    .line 62
    :goto_2
    if-ne v9, v10, :cond_2

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_2
    if-nez v9, :cond_3

    .line 66
    .line 67
    move-object v8, v10

    .line 68
    goto :goto_4

    .line 69
    :cond_3
    if-nez v10, :cond_4

    .line 70
    .line 71
    :goto_3
    move-object v8, v9

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    :try_start_0
    invoke-virtual {v9, v10}, Lcom/android/dx/cf/code/LocalsArray;->merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;

    .line 74
    .line 75
    .line 76
    move-result-object v8
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    goto :goto_4

    .line 78
    :catch_0
    move-exception v10

    .line 79
    new-instance v11, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v12, "Merging locals set for caller block "

    .line 85
    .line 86
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    invoke-virtual {v10, v11}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :goto_4
    if-nez v7, :cond_6

    .line 104
    .line 105
    if-eq v9, v8, :cond_5

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_5
    move v7, v5

    .line 109
    goto :goto_6

    .line 110
    :cond_6
    :goto_5
    const/4 v7, 0x1

    .line 111
    :goto_6
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    add-int/lit8 v6, v6, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_7
    iget-object p1, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 118
    .line 119
    if-ne p1, v0, :cond_8

    .line 120
    .line 121
    if-nez v7, :cond_8

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_8
    new-instance p1, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 125
    .line 126
    invoke-direct {p1, v0, v4}, Lcom/android/dx/cf/code/LocalsArraySet;-><init>(Lcom/android/dx/cf/code/OneLocalsArray;Ljava/util/ArrayList;)V

    .line 127
    .line 128
    .line 129
    return-object p1
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


# virtual methods
.method public annotate(Lcom/android/dex/util/ExceptionWithContext;)V
    .locals 5

    .line 1
    const-string v0, "(locals array set; primary)"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, v0, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/android/dx/cf/code/LocalsArray;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v4, "(locals array set: primary for caller "

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 v4, 0x29

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {p1, v3}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/android/dx/cf/code/LocalsArray;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    return-void
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

.method public copy()Lcom/android/dx/cf/code/LocalsArray;
    .locals 1

    new-instance v0, Lcom/android/dx/cf/code/LocalsArraySet;

    invoke-direct {v0, p0}, Lcom/android/dx/cf/code/LocalsArraySet;-><init>(Lcom/android/dx/cf/code/LocalsArraySet;)V

    return-object v0
.end method

.method public get(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->get(I)Lcom/android/dx/rop/type/TypeBearer;

    move-result-object p1

    return-object p1
.end method

.method public getCategory1(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->getCategory1(I)Lcom/android/dx/rop/type/TypeBearer;

    move-result-object p1

    return-object p1
.end method

.method public getCategory2(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->getCategory2(I)Lcom/android/dx/rop/type/TypeBearer;

    move-result-object p1

    return-object p1
.end method

.method public getMaxLocals()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {v0}, Lcom/android/dx/cf/code/OneLocalsArray;->getMaxLocals()I

    move-result v0

    return v0
.end method

.method public getOrNull(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->getOrNull(I)Lcom/android/dx/rop/type/TypeBearer;

    move-result-object p1

    return-object p1
.end method

.method protected getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    return-object v0
.end method

.method public invalidate(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->invalidate(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/android/dx/cf/code/LocalsArray;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lcom/android/dx/cf/code/LocalsArray;->invalidate(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
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

.method public makeInitialized(Lcom/android/dx/rop/type/Type;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/OneLocalsArray;->getMaxLocals()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;->makeInitialized(Lcom/android/dx/rop/type/Type;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/android/dx/cf/code/LocalsArray;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Lcom/android/dx/cf/code/LocalsArray;->makeInitialized(Lcom/android/dx/rop/type/Type;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    return-void
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

.method public bridge synthetic merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/LocalsArraySet;->merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArraySet;

    move-result-object p1

    return-object p1
.end method

.method public merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArraySet;
    .locals 2

    .line 2
    :try_start_0
    instance-of v0, p1, Lcom/android/dx/cf/code/LocalsArraySet;

    if-eqz v0, :cond_0

    .line 3
    move-object v0, p1

    check-cast v0, Lcom/android/dx/cf/code/LocalsArraySet;

    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/LocalsArraySet;->mergeWithSet(Lcom/android/dx/cf/code/LocalsArraySet;)Lcom/android/dx/cf/code/LocalsArraySet;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/LocalsArraySet;->mergeWithOne(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/LocalsArraySet;

    move-result-object p1
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :goto_0
    invoke-virtual {p1}, Lcom/android/dx/cf/code/LocalsArraySet;->setImmutable()V

    return-object p1

    :catch_0
    move-exception v0

    const-string/jumbo v1, "underlay locals:"

    .line 6
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0, v0}, Lcom/android/dx/cf/code/LocalsArraySet;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    const-string v1, "overlay locals:"

    .line 8
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, v0}, Lcom/android/dx/cf/code/LocalsArray;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 10
    throw v0
.end method

.method public mergeWithSubroutineCaller(Lcom/android/dx/cf/code/LocalsArray;I)Lcom/android/dx/cf/code/LocalsArraySet;
    .locals 8

    .line 1
    invoke-direct {p0, p2}, Lcom/android/dx/cf/code/LocalsArraySet;->getSecondaryForLabel(I)Lcom/android/dx/cf/code/LocalsArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/dx/cf/code/LocalsArray;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/code/OneLocalsArray;->merge(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-ne v0, p1, :cond_0

    .line 16
    .line 17
    move-object p1, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/LocalsArray;->merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 29
    .line 30
    if-ne v1, v0, :cond_2

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/lit8 v1, p2, 0x1

    .line 40
    .line 41
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    move-object v5, v3

    .line 53
    :goto_1
    if-ge v4, v1, :cond_7

    .line 54
    .line 55
    if-ne v4, p2, :cond_3

    .line 56
    .line 57
    move-object v6, p1

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    if-ge v4, v0, :cond_4

    .line 60
    .line 61
    iget-object v6, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    check-cast v6, Lcom/android/dx/cf/code/LocalsArray;

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    move-object v6, v3

    .line 71
    :goto_2
    if-eqz v6, :cond_6

    .line 72
    .line 73
    if-nez v5, :cond_5

    .line 74
    .line 75
    invoke-virtual {v6}, Lcom/android/dx/cf/code/LocalsArray;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    invoke-virtual {v6}, Lcom/android/dx/cf/code/LocalsArray;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v5, v7}, Lcom/android/dx/cf/code/OneLocalsArray;->merge(Lcom/android/dx/cf/code/OneLocalsArray;)Lcom/android/dx/cf/code/OneLocalsArray;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    :cond_6
    :goto_3
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_7
    new-instance p1, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 95
    .line 96
    invoke-direct {p1, v5, v2}, Lcom/android/dx/cf/code/LocalsArraySet;-><init>(Lcom/android/dx/cf/code/OneLocalsArray;Ljava/util/ArrayList;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/android/dx/cf/code/LocalsArraySet;->setImmutable()V

    .line 100
    .line 101
    .line 102
    return-object p1
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

.method public set(ILcom/android/dx/rop/type/TypeBearer;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-virtual {v0, p1, p2}, Lcom/android/dx/cf/code/OneLocalsArray;->set(ILcom/android/dx/rop/type/TypeBearer;)V

    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/dx/cf/code/LocalsArray;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1, p1, p2}, Lcom/android/dx/cf/code/LocalsArray;->set(ILcom/android/dx/rop/type/TypeBearer;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public set(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/android/dx/cf/code/LocalsArraySet;->set(ILcom/android/dx/rop/type/TypeBearer;)V

    return-void
.end method

.method public setImmutable()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->primary:Lcom/android/dx/cf/code/OneLocalsArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/android/dx/cf/code/LocalsArray;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-super {p0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public subArrayForLabel(I)Lcom/android/dx/cf/code/LocalsArray;
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/LocalsArraySet;->getSecondaryForLabel(I)Lcom/android/dx/cf/code/LocalsArray;

    move-result-object p1

    return-object p1
.end method

.method public toHuman()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "(locals array set; primary)\n"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/android/dx/cf/code/LocalsArraySet;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/android/dx/cf/code/OneLocalsArray;->toHuman()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x0

    .line 34
    :goto_0
    if-ge v3, v2, :cond_1

    .line 35
    .line 36
    iget-object v4, p0, Lcom/android/dx/cf/code/LocalsArraySet;->secondaries:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lcom/android/dx/cf/code/LocalsArray;

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    new-instance v5, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v6, "(locals array set: primary for caller "

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v6, ")\n"

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Lcom/android/dx/cf/code/LocalsArray;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4}, Lcom/android/dx/cf/code/OneLocalsArray;->toHuman()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0
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
