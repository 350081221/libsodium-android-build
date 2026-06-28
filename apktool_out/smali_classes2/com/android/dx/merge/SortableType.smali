.class final Lcom/android/dx/merge/SortableType;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NULLS_LAST_ORDER:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/android/dx/merge/SortableType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final classDef:Lcom/android/dex/ClassDef;

.field private depth:I

.field private final dex:Lcom/android/dex/Dex;

.field private final indexMap:Lcom/android/dx/merge/IndexMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/android/dx/merge/SortableType$1;

    invoke-direct {v0}, Lcom/android/dx/merge/SortableType$1;-><init>()V

    sput-object v0, Lcom/android/dx/merge/SortableType;->NULLS_LAST_ORDER:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Lcom/android/dex/Dex;Lcom/android/dx/merge/IndexMap;Lcom/android/dex/ClassDef;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/android/dx/merge/SortableType;->depth:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/merge/SortableType;->dex:Lcom/android/dex/Dex;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/android/dx/merge/SortableType;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    .line 12
    .line 13
    return-void
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

.method static synthetic access$000(Lcom/android/dx/merge/SortableType;)I
    .locals 0

    iget p0, p0, Lcom/android/dx/merge/SortableType;->depth:I

    return p0
.end method


# virtual methods
.method public getClassDef()Lcom/android/dex/ClassDef;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    return-object v0
.end method

.method public getDex()Lcom/android/dex/Dex;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/merge/SortableType;->dex:Lcom/android/dex/Dex;

    return-object v0
.end method

.method public getIndexMap()Lcom/android/dx/merge/IndexMap;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/merge/SortableType;->indexMap:Lcom/android/dx/merge/IndexMap;

    return-object v0
.end method

.method public getTypeIndex()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    invoke-virtual {v0}, Lcom/android/dex/ClassDef;->getTypeIndex()I

    move-result v0

    return v0
.end method

.method public isDepthAssigned()Z
    .locals 2

    iget v0, p0, Lcom/android/dx/merge/SortableType;->depth:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public tryAssignDepth([Lcom/android/dx/merge/SortableType;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dex/ClassDef;->getSupertypeIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, -0x1

    .line 10
    if-ne v0, v3, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/android/dex/ClassDef;->getSupertypeIndex()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v4, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    .line 21
    .line 22
    invoke-virtual {v4}, Lcom/android/dex/ClassDef;->getTypeIndex()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eq v0, v4, :cond_6

    .line 27
    .line 28
    iget-object v0, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/android/dex/ClassDef;->getSupertypeIndex()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    aget-object v0, p1, v0

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    move v0, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget v0, v0, Lcom/android/dx/merge/SortableType;->depth:I

    .line 41
    .line 42
    if-ne v0, v3, :cond_2

    .line 43
    .line 44
    return v1

    .line 45
    :cond_2
    :goto_0
    iget-object v4, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/android/dex/ClassDef;->getInterfaces()[S

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    array-length v5, v4

    .line 52
    move v6, v1

    .line 53
    :goto_1
    if-ge v6, v5, :cond_5

    .line 54
    .line 55
    aget-short v7, v4, v6

    .line 56
    .line 57
    aget-object v7, p1, v7

    .line 58
    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    iget v7, v7, Lcom/android/dx/merge/SortableType;->depth:I

    .line 67
    .line 68
    if-ne v7, v3, :cond_4

    .line 69
    .line 70
    return v1

    .line 71
    :cond_4
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    add-int/2addr v0, v2

    .line 79
    iput v0, p0, Lcom/android/dx/merge/SortableType;->depth:I

    .line 80
    .line 81
    return v2

    .line 82
    :cond_6
    new-instance p1, Lcom/android/dex/DexException;

    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v1, "Class with type index "

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lcom/android/dx/merge/SortableType;->classDef:Lcom/android/dex/ClassDef;

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/android/dex/ClassDef;->getTypeIndex()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, " extends itself"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {p1, v0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1
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
