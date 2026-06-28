.class public abstract Lcom/android/dx/command/dump/BaseDumper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/cf/iface/ParseObserver;


# instance fields
.field protected args:Lcom/android/dx/command/dump/Args;

.field private final bytes:[B

.field protected final dexOptions:Lcom/android/dx/dex/DexOptions;

.field private final filePath:Ljava/lang/String;

.field private final hexCols:I

.field private indent:I

.field private final out:Ljava/io/PrintStream;

.field private final rawBytes:Z

.field private readBytes:I

.field private separator:Ljava/lang/String;

.field private final strictParse:Z

.field private final width:I


# direct methods
.method public constructor <init>([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/command/dump/BaseDumper;->bytes:[B

    .line 5
    .line 6
    iget-boolean p1, p4, Lcom/android/dx/command/dump/Args;->rawBytes:Z

    .line 7
    .line 8
    iput-boolean p1, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/command/dump/BaseDumper;->out:Ljava/io/PrintStream;

    .line 11
    .line 12
    iget p2, p4, Lcom/android/dx/command/dump/Args;->width:I

    .line 13
    .line 14
    if-gtz p2, :cond_0

    .line 15
    .line 16
    const/16 p2, 0x4f

    .line 17
    .line 18
    :cond_0
    iput p2, p0, Lcom/android/dx/command/dump/BaseDumper;->width:I

    .line 19
    .line 20
    iput-object p3, p0, Lcom/android/dx/command/dump/BaseDumper;->filePath:Ljava/lang/String;

    .line 21
    .line 22
    iget-boolean p3, p4, Lcom/android/dx/command/dump/Args;->strictParse:Z

    .line 23
    .line 24
    iput-boolean p3, p0, Lcom/android/dx/command/dump/BaseDumper;->strictParse:Z

    .line 25
    .line 26
    const/4 p3, 0x0

    .line 27
    iput p3, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const-string/jumbo p1, "|"

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string p1, ""

    .line 36
    .line 37
    :goto_0
    iput-object p1, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 38
    .line 39
    iput p3, p0, Lcom/android/dx/command/dump/BaseDumper;->readBytes:I

    .line 40
    .line 41
    iput-object p4, p0, Lcom/android/dx/command/dump/BaseDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 42
    .line 43
    new-instance p1, Lcom/android/dx/dex/DexOptions;

    .line 44
    .line 45
    invoke-direct {p1}, Lcom/android/dx/dex/DexOptions;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/android/dx/command/dump/BaseDumper;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 49
    .line 50
    add-int/lit8 p2, p2, -0x5

    .line 51
    .line 52
    div-int/lit8 p2, p2, 0xf

    .line 53
    .line 54
    add-int/lit8 p2, p2, 0x1

    .line 55
    .line 56
    and-int/lit8 p1, p2, -0x2

    .line 57
    .line 58
    const/4 p2, 0x6

    .line 59
    if-ge p1, p2, :cond_2

    .line 60
    .line 61
    :goto_1
    move p1, p2

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 p2, 0xa

    .line 64
    .line 65
    if-le p1, p2, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_2
    iput p1, p0, Lcom/android/dx/command/dump/BaseDumper;->hexCols:I

    .line 69
    .line 70
    return-void
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
.end method

.method static computeParamWidth(Lcom/android/dx/cf/code/ConcreteMethod;Z)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/type/StdTypeList;->getWordCount()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
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
.end method


# virtual methods
.method public changeIndent(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string/jumbo p1, "|"

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p1, ""

    .line 15
    .line 16
    :goto_0
    iput-object p1, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    :goto_1
    iget v0, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 20
    .line 21
    if-ge p1, v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "  "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    return-void
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

.method public endParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;Lcom/android/dx/cf/iface/Member;)V
    .locals 0

    return-void
.end method

.method protected final getBytes()[B
    .locals 1

    iget-object v0, p0, Lcom/android/dx/command/dump/BaseDumper;->bytes:[B

    return-object v0
.end method

.method protected final getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/command/dump/BaseDumper;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method protected final getRawBytes()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    return v0
.end method

.method protected final getReadBytes()I
    .locals 1

    iget v0, p0, Lcom/android/dx/command/dump/BaseDumper;->readBytes:I

    return v0
.end method

.method protected final getStrictParse()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/dx/command/dump/BaseDumper;->strictParse:Z

    return v0
.end method

.method protected final getWidth1()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dx/command/dump/BaseDumper;->hexCols:I

    .line 6
    .line 7
    mul-int/lit8 v1, v0, 0x2

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x5

    .line 10
    .line 11
    div-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    return v1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected final getWidth2()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/command/dump/BaseDumper;->rawBytes:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getWidth1()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget v1, p0, Lcom/android/dx/command/dump/BaseDumper;->width:I

    .line 14
    .line 15
    sub-int/2addr v1, v0

    .line 16
    iget v0, p0, Lcom/android/dx/command/dump/BaseDumper;->indent:I

    .line 17
    .line 18
    mul-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    sub-int/2addr v1, v0

    .line 21
    return v1
.end method

.method protected final hexDump(II)Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/android/dx/command/dump/BaseDumper;->bytes:[B

    iget v4, p0, Lcom/android/dx/command/dump/BaseDumper;->hexCols:I

    const/4 v5, 0x4

    move v1, p1

    move v2, p2

    move v3, p1

    invoke-static/range {v0 .. v5}, Lcom/android/dx/util/Hex;->dump([BIIIII)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/android/dx/util/ByteArray;->underlyingOffset(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getRawBytes()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p3}, Lcom/android/dx/command/dump/BaseDumper;->hexDump(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, ""

    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, p1, p4}, Lcom/android/dx/command/dump/BaseDumper;->twoColumns(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lcom/android/dx/command/dump/BaseDumper;->print(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lcom/android/dx/command/dump/BaseDumper;->readBytes:I

    .line 26
    .line 27
    add-int/2addr p1, p3

    .line 28
    iput p1, p0, Lcom/android/dx/command/dump/BaseDumper;->readBytes:I

    .line 29
    .line 30
    return-void
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

.method protected final print(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/android/dx/command/dump/BaseDumper;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    return-void
.end method

.method protected final println(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/android/dx/command/dump/BaseDumper;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public startParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected final twoColumns(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getWidth1()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getWidth2()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    new-instance v0, Ljava/io/StringWriter;

    .line 16
    .line 17
    mul-int/lit8 v2, p1, 0x2

    .line 18
    .line 19
    invoke-direct {v0, v2}, Ljava/io/StringWriter;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lcom/android/dx/util/IndentingWriter;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1, v3}, Lcom/android/dx/util/IndentingWriter;-><init>(Ljava/io/Writer;ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/16 v1, 0xa

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eq p1, v1, :cond_1

    .line 43
    .line 44
    :cond_0
    invoke-virtual {v2, v1}, Lcom/android/dx/util/IndentingWriter;->write(I)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {v2}, Ljava/io/Writer;->flush()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_2
    iget-object v2, p0, Lcom/android/dx/command/dump/BaseDumper;->separator:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {p1, v0, v2, p2, v1}, Lcom/android/dx/util/TwoColumnOutput;->toString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    return-object p1

    .line 62
    :catch_0
    move-exception p1

    .line 63
    new-instance p2, Ljava/lang/RuntimeException;

    .line 64
    .line 65
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p2
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
