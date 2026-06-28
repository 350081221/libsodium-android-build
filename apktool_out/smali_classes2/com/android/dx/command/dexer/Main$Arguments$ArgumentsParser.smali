.class Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main$Arguments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ArgumentsParser"
.end annotation


# instance fields
.field private final arguments:[Ljava/lang/String;

.field private current:Ljava/lang/String;

.field private index:I

.field private lastValue:Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->arguments:[Ljava/lang/String;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

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

.method private getNextValue()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->arguments:[Ljava/lang/String;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-lt v0, v2, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return v0

    .line 10
    :cond_0
    aget-object v1, v1, v0

    .line 11
    .line 12
    iput-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    add-int/2addr v0, v1

    .line 16
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 17
    .line 18
    return v1
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public getCurrent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    return-object v0
.end method

.method public getLastValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->lastValue:Ljava/lang/String;

    return-object v0
.end method

.method public getNext()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->arguments:[Ljava/lang/String;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-lt v0, v2, :cond_0

    .line 8
    .line 9
    return v3

    .line 10
    :cond_0
    aget-object v0, v1, v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "--"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    add-int/2addr v0, v1

    .line 35
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 36
    .line 37
    return v1

    .line 38
    :cond_2
    :goto_0
    return v3
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

.method public getRemaining()[Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->arguments:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget v2, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->index:I

    .line 5
    .line 6
    sub-int/2addr v1, v2

    .line 7
    new-array v3, v1, [Ljava/lang/String;

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-static {v0, v2, v3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object v3
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public isArg(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_3

    .line 6
    .line 7
    add-int/lit8 v1, v0, -0x1

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/16 v3, 0x3d

    .line 14
    .line 15
    if-ne v2, v3, :cond_3

    .line 16
    .line 17
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->lastValue:Ljava/lang/String;

    .line 33
    .line 34
    return v3

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getNextValue()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->lastValue:Ljava/lang/String;

    .line 57
    .line 58
    return v3

    .line 59
    :cond_1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 60
    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v2, "Missing value after parameter "

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance p1, Lcom/android/dx/command/UsageException;

    .line 82
    .line 83
    invoke-direct {p1}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_2
    return v0

    .line 88
    :cond_3
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->current:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    return p1
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
