.class public final Lcom/android/dx/dex/file/TypeListItem;
.super Lcom/android/dx/dex/file/OffsettedItem;
.source "SourceFile"


# static fields
.field private static final ALIGNMENT:I = 0x4

.field private static final ELEMENT_SIZE:I = 0x2

.field private static final HEADER_SIZE:I = 0x4


# instance fields
.field private final list:Lcom/android/dx/rop/type/TypeList;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/type/TypeList;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    add-int/2addr v0, v1

    .line 9
    invoke-direct {p0, v1, v0}, Lcom/android/dx/dex/file/OffsettedItem;-><init>(II)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 13
    .line 14
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


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 15
    .line 16
    invoke-interface {v2, v1}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1, v2}, Lcom/android/dx/dex/file/TypeIdsSection;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/dex/file/TypeIdItem;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
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
.end method

.method protected compareTo0(Lcom/android/dx/dex/file/OffsettedItem;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    check-cast p1, Lcom/android/dx/dex/file/TypeListItem;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lcom/android/dx/rop/type/StdTypeList;->compareContents(Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public getList()Lcom/android/dx/rop/type/TypeList;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    invoke-static {v0}, Lcom/android/dx/rop/type/StdTypeList;->hashContents(Lcom/android/dx/rop/type/TypeList;)I

    move-result v0

    return v0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 1

    sget-object v0, Lcom/android/dx/dex/file/ItemType;->TYPE_TYPE_LIST:Lcom/android/dx/dex/file/ItemType;

    return-object v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "unsupported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected writeTo0(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getTypeIds()Lcom/android/dx/dex/file/TypeIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, " type_list"

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {p2, v2, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v3, "  size: "

    .line 48
    .line 49
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v3, 0x4

    .line 64
    invoke-interface {p2, v3, v1}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move v1, v2

    .line 68
    :goto_0
    if-ge v1, v0, :cond_0

    .line 69
    .line 70
    iget-object v3, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 71
    .line 72
    invoke-interface {v3, v1}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {p1, v3}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/type/Type;)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    new-instance v5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v6, "  "

    .line 86
    .line 87
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-static {v4}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v4, " // "

    .line 98
    .line 99
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    const/4 v4, 0x2

    .line 114
    invoke-interface {p2, v4, v3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    add-int/lit8 v1, v1, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 121
    .line 122
    .line 123
    :goto_1
    if-ge v2, v0, :cond_1

    .line 124
    .line 125
    iget-object v1, p0, Lcom/android/dx/dex/file/TypeListItem;->list:Lcom/android/dx/rop/type/TypeList;

    .line 126
    .line 127
    invoke-interface {v1, v2}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {p1, v1}, Lcom/android/dx/dex/file/TypeIdsSection;->indexOf(Lcom/android/dx/rop/type/Type;)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 136
    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_1
    return-void
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
