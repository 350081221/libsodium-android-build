.class final enum Lcom/android/dx/io/instructions/InstructionCodec$36;
.super Lcom/android/dx/io/instructions/InstructionCodec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/io/instructions/InstructionCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/android/dx/io/instructions/InstructionCodec;-><init>(Ljava/lang/String;ILcom/android/dx/io/instructions/InstructionCodec$1;)V

    return-void
.end method


# virtual methods
.method public decode(ILcom/android/dx/io/instructions/CodeInput;)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readInt()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eq v0, v4, :cond_6

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-eq v0, v4, :cond_4

    .line 17
    .line 18
    const/4 v4, 0x4

    .line 19
    if-eq v0, v4, :cond_2

    .line 20
    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    new-array v0, v1, [J

    .line 24
    .line 25
    :goto_0
    if-ge v3, v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readLong()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    aput-wide v4, v0, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p2, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 37
    .line 38
    invoke-direct {p2, p0, p1, v0}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[J)V

    .line 39
    .line 40
    .line 41
    return-object p2

    .line 42
    :cond_1
    new-instance p1, Lcom/android/dex/DexException;

    .line 43
    .line 44
    new-instance p2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v1, "bogus element_width: "

    .line 50
    .line 51
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p1, p2}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    new-array v0, v1, [I

    .line 70
    .line 71
    :goto_1
    if-ge v3, v1, :cond_3

    .line 72
    .line 73
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readInt()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    aput v2, v0, v3

    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    new-instance p2, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 83
    .line 84
    invoke-direct {p2, p0, p1, v0}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[I)V

    .line 85
    .line 86
    .line 87
    return-object p2

    .line 88
    :cond_4
    new-array v0, v1, [S

    .line 89
    .line 90
    :goto_2
    if-ge v3, v1, :cond_5

    .line 91
    .line 92
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    int-to-short v2, v2

    .line 97
    aput-short v2, v0, v3

    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    new-instance p2, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 103
    .line 104
    invoke-direct {p2, p0, p1, v0}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[S)V

    .line 105
    .line 106
    .line 107
    return-object p2

    .line 108
    :cond_6
    new-array v0, v1, [B

    .line 109
    .line 110
    move v5, v4

    .line 111
    move v4, v3

    .line 112
    :goto_3
    if-ge v3, v1, :cond_8

    .line 113
    .line 114
    if-eqz v5, :cond_7

    .line 115
    .line 116
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    :cond_7
    and-int/lit16 v6, v4, 0xff

    .line 121
    .line 122
    int-to-byte v6, v6

    .line 123
    aput-byte v6, v0, v3

    .line 124
    .line 125
    shr-int/2addr v4, v2

    .line 126
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    xor-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    new-instance p2, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 132
    .line 133
    invoke-direct {p2, p0, p1, v0}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[B)V

    .line 134
    .line 135
    .line 136
    return-object p2
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

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getElementWidthUnit()S

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getData()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcodeUnit()S

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-interface {p2, v2}, Lcom/android/dx/io/instructions/CodeOutput;->write(S)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, v0}, Lcom/android/dx/io/instructions/CodeOutput;->write(S)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getSize()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-interface {p2, p1}, Lcom/android/dx/io/instructions/CodeOutput;->writeInt(I)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    if-eq v0, p1, :cond_3

    .line 30
    .line 31
    const/4 p1, 0x2

    .line 32
    if-eq v0, p1, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x4

    .line 35
    if-eq v0, p1, :cond_1

    .line 36
    .line 37
    const/16 p1, 0x8

    .line 38
    .line 39
    if-ne v0, p1, :cond_0

    .line 40
    .line 41
    check-cast v1, [J

    .line 42
    .line 43
    invoke-interface {p2, v1}, Lcom/android/dx/io/instructions/CodeOutput;->write([J)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, Lcom/android/dex/DexException;

    .line 48
    .line 49
    new-instance p2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v1, "bogus element_width: "

    .line 55
    .line 56
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p1, p2}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_1
    check-cast v1, [I

    .line 75
    .line 76
    invoke-interface {p2, v1}, Lcom/android/dx/io/instructions/CodeOutput;->write([I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    check-cast v1, [S

    .line 81
    .line 82
    invoke-interface {p2, v1}, Lcom/android/dx/io/instructions/CodeOutput;->write([S)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    check-cast v1, [B

    .line 87
    .line 88
    invoke-interface {p2, v1}, Lcom/android/dx/io/instructions/CodeOutput;->write([B)V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-void
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
