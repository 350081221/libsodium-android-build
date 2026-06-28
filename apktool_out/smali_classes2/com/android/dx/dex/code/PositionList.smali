.class public final Lcom/android/dx/dex/code/PositionList;
.super Lcom/android/dx/util/FixedSizeList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/dex/code/PositionList$Entry;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/android/dx/dex/code/PositionList;

.field public static final IMPORTANT:I = 0x3

.field public static final LINES:I = 0x2

.field public static final NONE:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/android/dx/dex/code/PositionList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/dx/dex/code/PositionList;-><init>(I)V

    sput-object v0, Lcom/android/dx/dex/code/PositionList;->EMPTY:Lcom/android/dx/dex/code/PositionList;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    return-void
.end method

.method public static make(Lcom/android/dx/dex/code/DalvInsnList;I)Lcom/android/dx/dex/code/PositionList;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_8

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p1, v1, :cond_1

    .line 7
    .line 8
    if-ne p1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p1, "bogus howMuch"

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0

    .line 19
    :cond_1
    :goto_0
    sget-object v1, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    new-array v4, v3, [Lcom/android/dx/dex/code/PositionList$Entry;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    move-object v8, v1

    .line 29
    move v6, v5

    .line 30
    move v7, v6

    .line 31
    move v9, v7

    .line 32
    :goto_1
    if-ge v6, v3, :cond_6

    .line 33
    .line 34
    invoke-virtual {p0, v6}, Lcom/android/dx/dex/code/DalvInsnList;->get(I)Lcom/android/dx/dex/code/DalvInsn;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    instance-of v11, v10, Lcom/android/dx/dex/code/CodeAddress;

    .line 39
    .line 40
    if-eqz v11, :cond_2

    .line 41
    .line 42
    move v9, v0

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-virtual {v10}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    invoke-virtual {v11, v1}, Lcom/android/dx/rop/code/SourcePosition;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    if-nez v12, :cond_5

    .line 53
    .line 54
    invoke-virtual {v11, v8}, Lcom/android/dx/rop/code/SourcePosition;->sameLine(Lcom/android/dx/rop/code/SourcePosition;)Z

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    if-eqz v12, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    if-ne p1, v2, :cond_4

    .line 62
    .line 63
    if-nez v9, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    new-instance v8, Lcom/android/dx/dex/code/PositionList$Entry;

    .line 67
    .line 68
    invoke-virtual {v10}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    invoke-direct {v8, v9, v11}, Lcom/android/dx/dex/code/PositionList$Entry;-><init>(ILcom/android/dx/rop/code/SourcePosition;)V

    .line 73
    .line 74
    .line 75
    aput-object v8, v4, v7

    .line 76
    .line 77
    add-int/lit8 v7, v7, 0x1

    .line 78
    .line 79
    move v9, v5

    .line 80
    move-object v8, v11

    .line 81
    :cond_5
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    new-instance p0, Lcom/android/dx/dex/code/PositionList;

    .line 85
    .line 86
    invoke-direct {p0, v7}, Lcom/android/dx/dex/code/PositionList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    :goto_3
    if-ge v5, v7, :cond_7

    .line 90
    .line 91
    aget-object p1, v4, v5

    .line 92
    .line 93
    invoke-virtual {p0, v5, p1}, Lcom/android/dx/dex/code/PositionList;->set(ILcom/android/dx/dex/code/PositionList$Entry;)V

    .line 94
    .line 95
    .line 96
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_7
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 100
    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_8
    sget-object p0, Lcom/android/dx/dex/code/PositionList;->EMPTY:Lcom/android/dx/dex/code/PositionList;

    .line 104
    .line 105
    return-object p0
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


# virtual methods
.method public get(I)Lcom/android/dx/dex/code/PositionList$Entry;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/dx/dex/code/PositionList$Entry;

    return-object p1
.end method

.method public set(ILcom/android/dx/dex/code/PositionList$Entry;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    return-void
.end method
