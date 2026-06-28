.class final enum Lcom/android/dx/io/instructions/InstructionCodec$32;
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
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$100(I)I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    const/16 v0, 0xfa

    .line 6
    .line 7
    if-ne v2, v0, :cond_1

    .line 8
    .line 9
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$300(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$400(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1700(I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1800(I)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-static {v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$300(I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-static {v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$400(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-static {v2}, Lcom/android/dx/io/OpcodeInfo;->getIndexType(I)Lcom/android/dx/io/IndexType;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const/4 v8, 0x1

    .line 50
    if-lt p1, v8, :cond_0

    .line 51
    .line 52
    const/4 v9, 0x5

    .line 53
    if-gt p1, v9, :cond_0

    .line 54
    .line 55
    new-array v9, v9, [I

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    aput v4, v9, v10

    .line 59
    .line 60
    aput v5, v9, v8

    .line 61
    .line 62
    const/4 v4, 0x2

    .line 63
    aput v6, v9, v4

    .line 64
    .line 65
    const/4 v4, 0x3

    .line 66
    aput v1, v9, v4

    .line 67
    .line 68
    const/4 v1, 0x4

    .line 69
    aput v0, v9, v1

    .line 70
    .line 71
    invoke-static {v9, v10, p1}, Ljava/util/Arrays;->copyOfRange([III)[I

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    new-instance p1, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;

    .line 76
    .line 77
    move-object v0, p1

    .line 78
    move-object v1, p0

    .line 79
    move-object v4, v7

    .line 80
    move v5, p2

    .line 81
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;I[I)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_0
    new-instance p2, Lcom/android/dex/DexException;

    .line 86
    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v1, "bogus registerCount: "

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lcom/android/dx/util/Hex;->uNibble(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {p2, p1}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p2

    .line 112
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 113
    .line 114
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
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

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 6

    .line 1
    check-cast p1, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getG()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getRegisterCount()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, v2}, Lcom/android/dx/io/instructions/InstructionCodec;->access$500(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v0, v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$600(II)S

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getIndexUnit()S

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getC()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getD()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getE()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getF()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-static {v2, v3, v4, v5}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1900(IIII)S

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getProtoIndex()S

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-interface {p2, v0, v1, v2, p1}, Lcom/android/dx/io/instructions/CodeOutput;->write(SSSS)V

    .line 52
    .line 53
    .line 54
    return-void
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
