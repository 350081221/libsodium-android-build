.class public final Lcom/android/dx/cf/code/BytecodeArray;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;,
        Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;,
        Lcom/android/dx/cf/code/BytecodeArray$Visitor;
    }
.end annotation


# static fields
.field public static final EMPTY_VISITOR:Lcom/android/dx/cf/code/BytecodeArray$Visitor;


# instance fields
.field private final bytes:Lcom/android/dx/util/ByteArray;

.field private final pool:Lcom/android/dx/rop/cst/ConstantPool;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;

    invoke-direct {v0}, Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;-><init>()V

    sput-object v0, Lcom/android/dx/cf/code/BytecodeArray;->EMPTY_VISITOR:Lcom/android/dx/cf/code/BytecodeArray$Visitor;

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 14
    .line 15
    const-string p2, "pool == null"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string p2, "bytes == null"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
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

.method private parseLookupswitch(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x4

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v8, v2

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    shl-int/lit8 v3, v8, 0x8

    .line 12
    .line 13
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 14
    .line 15
    invoke-virtual {v4, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    or-int v8, v3, v4

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v1, p1

    .line 31
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 32
    .line 33
    add-int/lit8 v4, v0, 0x4

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/lit8 v0, v0, 0x8

    .line 40
    .line 41
    new-instance v7, Lcom/android/dx/cf/code/SwitchList;

    .line 42
    .line 43
    invoke-direct {v7, v3}, Lcom/android/dx/cf/code/SwitchList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    :goto_1
    if-ge v2, v3, :cond_1

    .line 47
    .line 48
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 49
    .line 50
    invoke-virtual {v4, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    iget-object v5, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 55
    .line 56
    add-int/lit8 v6, v0, 0x4

    .line 57
    .line 58
    invoke-virtual {v5, v6}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    add-int/2addr v5, p1

    .line 63
    add-int/lit8 v0, v0, 0x8

    .line 64
    .line 65
    invoke-virtual {v7, v4, v5}, Lcom/android/dx/cf/code/SwitchList;->add(II)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v7, v1}, Lcom/android/dx/cf/code/SwitchList;->setDefaultTarget(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7}, Lcom/android/dx/cf/code/SwitchList;->removeSuperfluousDefaults()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7}, Lcom/android/dx/cf/code/SwitchList;->setImmutable()V

    .line 78
    .line 79
    .line 80
    sub-int/2addr v0, p1

    .line 81
    const/16 v4, 0xab

    .line 82
    .line 83
    move-object v3, p2

    .line 84
    move v5, p1

    .line 85
    move v6, v0

    .line 86
    invoke-interface/range {v3 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V

    .line 87
    .line 88
    .line 89
    return v0
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

.method private parseNewarray(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Lcom/android/dx/cf/code/SimException;

    .line 13
    .line 14
    new-instance p2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "bad newarray code "

    .line 20
    .line 21
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-direct {p1, p2}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :pswitch_0
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->LONG_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_1
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->INT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_2
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->SHORT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_3
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->BYTE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_4
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->DOUBLE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_5
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->FLOAT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_6
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->CHAR_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_7
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->BOOLEAN_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 61
    .line 62
    :goto_0
    invoke-interface {p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->getPreviousOffset()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    new-instance v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;

    .line 67
    .line 68
    invoke-direct {v3, p0}, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;-><init>(Lcom/android/dx/cf/code/BytecodeArray;)V

    .line 69
    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    if-ltz v2, :cond_0

    .line 73
    .line 74
    invoke-virtual {p0, v2, v3}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 75
    .line 76
    .line 77
    iget-object v5, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->cst:Lcom/android/dx/rop/cst/Constant;

    .line 78
    .line 79
    instance-of v5, v5, Lcom/android/dx/rop/cst/CstInteger;

    .line 80
    .line 81
    if-eqz v5, :cond_0

    .line 82
    .line 83
    iget v5, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->length:I

    .line 84
    .line 85
    add-int/2addr v5, v2

    .line 86
    if-ne v5, p1, :cond_0

    .line 87
    .line 88
    iget v2, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->value:I

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    move v2, v4

    .line 92
    :goto_1
    add-int/lit8 v5, p1, 0x2

    .line 93
    .line 94
    new-instance v6, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    move v7, v4

    .line 102
    :goto_2
    iget-object v8, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 103
    .line 104
    add-int/lit8 v9, v5, 0x1

    .line 105
    .line 106
    invoke-virtual {v8, v5}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    const/16 v10, 0x59

    .line 111
    .line 112
    if-eq v8, v10, :cond_1

    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :cond_1
    invoke-virtual {p0, v9, v3}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 117
    .line 118
    .line 119
    iget v8, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->length:I

    .line 120
    .line 121
    if-eqz v8, :cond_6

    .line 122
    .line 123
    iget-object v10, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->cst:Lcom/android/dx/rop/cst/Constant;

    .line 124
    .line 125
    instance-of v10, v10, Lcom/android/dx/rop/cst/CstInteger;

    .line 126
    .line 127
    if-eqz v10, :cond_6

    .line 128
    .line 129
    iget v10, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->value:I

    .line 130
    .line 131
    if-eq v10, v7, :cond_2

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_2
    add-int/2addr v9, v8

    .line 135
    invoke-virtual {p0, v9, v3}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 136
    .line 137
    .line 138
    iget v8, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->length:I

    .line 139
    .line 140
    if-eqz v8, :cond_6

    .line 141
    .line 142
    iget-object v10, v3, Lcom/android/dx/cf/code/BytecodeArray$ConstantParserVisitor;->cst:Lcom/android/dx/rop/cst/Constant;

    .line 143
    .line 144
    instance-of v11, v10, Lcom/android/dx/rop/cst/CstLiteralBits;

    .line 145
    .line 146
    if-nez v11, :cond_3

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_3
    add-int/2addr v9, v8

    .line 150
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    iget-object v8, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 154
    .line 155
    add-int/lit8 v10, v9, 0x1

    .line 156
    .line 157
    invoke-virtual {v8, v9}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    const/4 v9, 0x1

    .line 162
    packed-switch v0, :pswitch_data_1

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :pswitch_8
    const/16 v11, 0x50

    .line 167
    .line 168
    if-eq v8, v11, :cond_4

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :pswitch_9
    const/16 v11, 0x4f

    .line 172
    .line 173
    if-eq v8, v11, :cond_4

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :pswitch_a
    const/16 v11, 0x56

    .line 177
    .line 178
    if-eq v8, v11, :cond_4

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :pswitch_b
    const/16 v11, 0x52

    .line 182
    .line 183
    if-eq v8, v11, :cond_4

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :pswitch_c
    const/16 v11, 0x51

    .line 187
    .line 188
    if-eq v8, v11, :cond_4

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :pswitch_d
    const/16 v11, 0x55

    .line 192
    .line 193
    if-eq v8, v11, :cond_4

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :pswitch_e
    const/16 v11, 0x54

    .line 197
    .line 198
    if-eq v8, v11, :cond_4

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_4
    move v9, v4

    .line 202
    :goto_3
    if-eqz v9, :cond_5

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 206
    .line 207
    move v5, v10

    .line 208
    goto :goto_2

    .line 209
    :cond_6
    :goto_4
    move v4, v7

    .line 210
    :cond_7
    const/4 v0, 0x2

    .line 211
    if-lt v4, v0, :cond_9

    .line 212
    .line 213
    if-eq v4, v2, :cond_8

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_8
    sub-int/2addr v5, p1

    .line 217
    invoke-interface {p2, p1, v5, v1, v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V

    .line 218
    .line 219
    .line 220
    return v5

    .line 221
    :cond_9
    :goto_5
    const/4 v2, 0x0

    .line 222
    invoke-interface {p2, p1, v0, v1, v2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V

    .line 223
    .line 224
    .line 225
    return v0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_e
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
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
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
.end method

.method private parseTableswitch(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x4

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x4

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v8, v2

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    shl-int/lit8 v3, v8, 0x8

    .line 12
    .line 13
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 14
    .line 15
    invoke-virtual {v4, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    or-int v8, v3, v4

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v1, p1

    .line 31
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 32
    .line 33
    add-int/lit8 v4, v0, 0x4

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 40
    .line 41
    add-int/lit8 v5, v0, 0x8

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    sub-int v5, v4, v3

    .line 48
    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0xc

    .line 52
    .line 53
    if-gt v3, v4, :cond_2

    .line 54
    .line 55
    new-instance v7, Lcom/android/dx/cf/code/SwitchList;

    .line 56
    .line 57
    invoke-direct {v7, v5}, Lcom/android/dx/cf/code/SwitchList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    :goto_1
    if-ge v2, v5, :cond_1

    .line 61
    .line 62
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 63
    .line 64
    invoke-virtual {v4, v0}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    add-int/2addr v4, p1

    .line 69
    add-int/lit8 v0, v0, 0x4

    .line 70
    .line 71
    add-int v6, v3, v2

    .line 72
    .line 73
    invoke-virtual {v7, v6, v4}, Lcom/android/dx/cf/code/SwitchList;->add(II)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v7, v1}, Lcom/android/dx/cf/code/SwitchList;->setDefaultTarget(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7}, Lcom/android/dx/cf/code/SwitchList;->removeSuperfluousDefaults()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7}, Lcom/android/dx/cf/code/SwitchList;->setImmutable()V

    .line 86
    .line 87
    .line 88
    sub-int/2addr v0, p1

    .line 89
    const/16 v4, 0xab

    .line 90
    .line 91
    move-object v3, p2

    .line 92
    move v5, p1

    .line 93
    move v6, v0

    .line 94
    invoke-interface/range {v3 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V

    .line 95
    .line 96
    .line 97
    return v0

    .line 98
    :cond_2
    new-instance p1, Lcom/android/dx/cf/code/SimException;

    .line 99
    .line 100
    const-string p2, "low / high inversion"

    .line 101
    .line 102
    invoke-direct {p1, p2}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
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

.method private parseWide(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    add-int/lit8 v1, p1, 0x2

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    const/16 v0, 0x84

    .line 18
    .line 19
    if-eq v3, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0xa9

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v3, v0, :cond_0

    .line 25
    .line 26
    packed-switch v3, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    packed-switch v3, :pswitch_data_1

    .line 30
    .line 31
    .line 32
    const/16 v0, 0xc4

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-interface {p2, v0, p1, v1}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitInvalid(III)V

    .line 36
    .line 37
    .line 38
    return v1

    .line 39
    :pswitch_0
    const/16 v5, 0x36

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    sget-object v9, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    move-object v4, p2

    .line 46
    move v6, p1

    .line 47
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :pswitch_1
    const/16 v5, 0x36

    .line 52
    .line 53
    const/4 v7, 0x4

    .line 54
    sget-object v9, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 55
    .line 56
    const/4 v10, 0x0

    .line 57
    move-object v4, p2

    .line 58
    move v6, p1

    .line 59
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 60
    .line 61
    .line 62
    return v1

    .line 63
    :pswitch_2
    const/16 v5, 0x36

    .line 64
    .line 65
    const/4 v7, 0x4

    .line 66
    sget-object v9, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    move-object v4, p2

    .line 70
    move v6, p1

    .line 71
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 72
    .line 73
    .line 74
    return v1

    .line 75
    :pswitch_3
    const/16 v5, 0x36

    .line 76
    .line 77
    const/4 v7, 0x4

    .line 78
    sget-object v9, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    move-object v4, p2

    .line 82
    move v6, p1

    .line 83
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 84
    .line 85
    .line 86
    return v1

    .line 87
    :pswitch_4
    const/16 v5, 0x36

    .line 88
    .line 89
    const/4 v7, 0x4

    .line 90
    sget-object v9, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 91
    .line 92
    const/4 v10, 0x0

    .line 93
    move-object v4, p2

    .line 94
    move v6, p1

    .line 95
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 96
    .line 97
    .line 98
    return v1

    .line 99
    :pswitch_5
    const/16 v5, 0x15

    .line 100
    .line 101
    const/4 v7, 0x4

    .line 102
    sget-object v9, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    move-object v4, p2

    .line 106
    move v6, p1

    .line 107
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 108
    .line 109
    .line 110
    return v1

    .line 111
    :pswitch_6
    const/16 v5, 0x15

    .line 112
    .line 113
    const/4 v7, 0x4

    .line 114
    sget-object v9, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 115
    .line 116
    const/4 v10, 0x0

    .line 117
    move-object v4, p2

    .line 118
    move v6, p1

    .line 119
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 120
    .line 121
    .line 122
    return v1

    .line 123
    :pswitch_7
    const/16 v5, 0x15

    .line 124
    .line 125
    const/4 v7, 0x4

    .line 126
    sget-object v9, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    move-object v4, p2

    .line 130
    move v6, p1

    .line 131
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 132
    .line 133
    .line 134
    return v1

    .line 135
    :pswitch_8
    const/16 v5, 0x15

    .line 136
    .line 137
    const/4 v7, 0x4

    .line 138
    sget-object v9, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 139
    .line 140
    const/4 v10, 0x0

    .line 141
    move-object v4, p2

    .line 142
    move v6, p1

    .line 143
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 144
    .line 145
    .line 146
    return v1

    .line 147
    :pswitch_9
    const/16 v5, 0x15

    .line 148
    .line 149
    const/4 v7, 0x4

    .line 150
    sget-object v9, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 151
    .line 152
    const/4 v10, 0x0

    .line 153
    move-object v4, p2

    .line 154
    move v6, p1

    .line 155
    invoke-interface/range {v4 .. v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 156
    .line 157
    .line 158
    return v1

    .line 159
    :cond_0
    const/4 v5, 0x4

    .line 160
    sget-object v7, Lcom/android/dx/rop/type/Type;->RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;

    .line 161
    .line 162
    const/4 v0, 0x0

    .line 163
    move-object v2, p2

    .line 164
    move v4, p1

    .line 165
    move v6, v8

    .line 166
    move v8, v0

    .line 167
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 168
    .line 169
    .line 170
    return v1

    .line 171
    :cond_1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 172
    .line 173
    add-int/lit8 v1, p1, 0x4

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Lcom/android/dx/util/ByteArray;->getShort(I)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    const/4 v5, 0x6

    .line 180
    sget-object v7, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 181
    .line 182
    move-object v2, p2

    .line 183
    move v4, p1

    .line 184
    move v6, v8

    .line 185
    move v8, v0

    .line 186
    invoke-interface/range {v2 .. v8}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 187
    .line 188
    .line 189
    const/4 p1, 0x6

    .line 190
    return p1

    .line 191
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x36
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.method public byteLength()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    invoke-virtual {v0}, Lcom/android/dx/util/ByteArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public forEach(Lcom/android/dx/cf/code/BytecodeArray$Visitor;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1, p1}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-int/2addr v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getBytes()Lcom/android/dx/util/ByteArray;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    return-object v0
.end method

.method public getInstructionOffsets()[I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lcom/android/dx/util/Bits;->makeBitSet(I)[I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-static {v1, v2, v3}, Lcom/android/dx/util/Bits;->set([IIZ)V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p0, v2, v3}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/2addr v2, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v1
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
.end method

.method public parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I
    .locals 11

    .line 1
    const-string v0, "...at bytecode offset "

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/android/dx/cf/code/BytecodeArray;->EMPTY_VISITOR:Lcom/android/dx/cf/code/BytecodeArray$Visitor;

    .line 6
    .line 7
    :cond_0
    move-object v1, p2

    .line 8
    :try_start_0
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Lcom/android/dx/cf/code/ByteOps;->opInfo(I)I

    .line 15
    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    const/4 v7, 0x5

    .line 19
    const/16 v3, 0xac

    .line 20
    .line 21
    const/16 v4, 0x4f

    .line 22
    .line 23
    const/16 v5, 0x2e

    .line 24
    .line 25
    const/4 v8, 0x3

    .line 26
    const/4 v9, 0x2

    .line 27
    const/4 v10, 0x1

    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, v2, p1, v10}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitInvalid(III)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :pswitch_0
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 37
    .line 38
    add-int/lit8 v3, p1, 0x1

    .line 39
    .line 40
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    add-int/2addr p2, p1

    .line 45
    const/16 v3, 0xc8

    .line 46
    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    const/16 v2, 0xa7

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/16 v2, 0xa8

    .line 53
    .line 54
    :goto_0
    invoke-interface {v1, v2, p1, v7, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitBranch(IIII)V

    .line 55
    .line 56
    .line 57
    return v7

    .line 58
    :pswitch_1
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 59
    .line 60
    add-int/lit8 v3, p1, 0x1

    .line 61
    .line 62
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 67
    .line 68
    add-int/lit8 v4, p1, 0x3

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 75
    .line 76
    invoke-interface {v3, p2}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const/4 v4, 0x4

    .line 81
    move v3, p1

    .line 82
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 83
    .line 84
    .line 85
    const/4 p1, 0x4

    .line 86
    return p1

    .line 87
    :pswitch_2
    invoke-direct {p0, p1, v1}, Lcom/android/dx/cf/code/BytecodeArray;->parseWide(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    return p1

    .line 92
    :pswitch_3
    invoke-direct {p0, p1, v1}, Lcom/android/dx/cf/code/BytecodeArray;->parseNewarray(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :pswitch_4
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 98
    .line 99
    add-int/lit8 v3, p1, 0x1

    .line 100
    .line 101
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 106
    .line 107
    invoke-interface {v3, p2}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    move-object v5, p2

    .line 112
    check-cast v5, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 113
    .line 114
    const/4 v4, 0x5

    .line 115
    const/4 v6, 0x0

    .line 116
    move v3, p1

    .line 117
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 118
    .line 119
    .line 120
    return v7

    .line 121
    :pswitch_5
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 122
    .line 123
    add-int/lit8 v3, p1, 0x1

    .line 124
    .line 125
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 130
    .line 131
    add-int/lit8 v4, p1, 0x3

    .line 132
    .line 133
    invoke-virtual {v3, v4}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    iget-object v4, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 138
    .line 139
    add-int/lit8 v5, p1, 0x4

    .line 140
    .line 141
    invoke-virtual {v4, v5}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    iget-object v5, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 146
    .line 147
    invoke-interface {v5, p2}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    const/4 p2, 0x5

    .line 152
    shl-int/lit8 v4, v4, 0x8

    .line 153
    .line 154
    or-int v6, v3, v4

    .line 155
    .line 156
    move v3, p1

    .line 157
    move v4, p2

    .line 158
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 159
    .line 160
    .line 161
    return v7

    .line 162
    :pswitch_6
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 163
    .line 164
    add-int/lit8 v3, p1, 0x1

    .line 165
    .line 166
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 171
    .line 172
    invoke-interface {v3, p2}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    const/4 v4, 0x3

    .line 177
    const/4 v6, 0x0

    .line 178
    move v3, p1

    .line 179
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 180
    .line 181
    .line 182
    return v8

    .line 183
    :pswitch_7
    sget-object p2, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 184
    .line 185
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 186
    .line 187
    .line 188
    return v10

    .line 189
    :pswitch_8
    sget-object p2, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 190
    .line 191
    invoke-interface {v1, v3, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 192
    .line 193
    .line 194
    return v10

    .line 195
    :pswitch_9
    sget-object p2, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 196
    .line 197
    invoke-interface {v1, v3, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 198
    .line 199
    .line 200
    return v10

    .line 201
    :pswitch_a
    sget-object p2, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 202
    .line 203
    invoke-interface {v1, v3, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 204
    .line 205
    .line 206
    return v10

    .line 207
    :pswitch_b
    sget-object p2, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 208
    .line 209
    invoke-interface {v1, v3, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 210
    .line 211
    .line 212
    return v10

    .line 213
    :pswitch_c
    sget-object p2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 214
    .line 215
    invoke-interface {v1, v3, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 216
    .line 217
    .line 218
    return v10

    .line 219
    :pswitch_d
    invoke-direct {p0, p1, v1}, Lcom/android/dx/cf/code/BytecodeArray;->parseLookupswitch(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    return p1

    .line 224
    :pswitch_e
    invoke-direct {p0, p1, v1}, Lcom/android/dx/cf/code/BytecodeArray;->parseTableswitch(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    return p1

    .line 229
    :pswitch_f
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 230
    .line 231
    add-int/lit8 v3, p1, 0x1

    .line 232
    .line 233
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    const/4 v4, 0x2

    .line 238
    sget-object v6, Lcom/android/dx/rop/type/Type;->RETURN_ADDRESS:Lcom/android/dx/rop/type/Type;

    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    move v3, p1

    .line 242
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 243
    .line 244
    .line 245
    return v9

    .line 246
    :pswitch_10
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 247
    .line 248
    add-int/lit8 v3, p1, 0x1

    .line 249
    .line 250
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getShort(I)I

    .line 251
    .line 252
    .line 253
    move-result p2

    .line 254
    add-int/2addr p2, p1

    .line 255
    invoke-interface {v1, v2, p1, v8, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitBranch(IIII)V

    .line 256
    .line 257
    .line 258
    return v8

    .line 259
    :pswitch_11
    sget-object p2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 260
    .line 261
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 262
    .line 263
    .line 264
    return v10

    .line 265
    :pswitch_12
    sget-object p2, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 266
    .line 267
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 268
    .line 269
    .line 270
    return v10

    .line 271
    :pswitch_13
    sget-object p2, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 272
    .line 273
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 274
    .line 275
    .line 276
    return v10

    .line 277
    :pswitch_14
    sget-object p2, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 278
    .line 279
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 280
    .line 281
    .line 282
    return v10

    .line 283
    :pswitch_15
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 284
    .line 285
    add-int/lit8 v3, p1, 0x1

    .line 286
    .line 287
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 292
    .line 293
    add-int/lit8 v3, p1, 0x2

    .line 294
    .line 295
    invoke-virtual {p2, v3}, Lcom/android/dx/util/ByteArray;->getByte(I)I

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    const/4 v4, 0x3

    .line 300
    sget-object v6, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 301
    .line 302
    move v3, p1

    .line 303
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 304
    .line 305
    .line 306
    return v8

    .line 307
    :pswitch_16
    sub-int/2addr v2, v8

    .line 308
    sget-object p2, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 309
    .line 310
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 311
    .line 312
    .line 313
    return v10

    .line 314
    :pswitch_17
    sub-int/2addr v2, v9

    .line 315
    sget-object p2, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 316
    .line 317
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 318
    .line 319
    .line 320
    return v10

    .line 321
    :pswitch_18
    sub-int/2addr v2, v10

    .line 322
    sget-object p2, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 323
    .line 324
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 325
    .line 326
    .line 327
    return v10

    .line 328
    :pswitch_19
    sget-object p2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 329
    .line 330
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 331
    .line 332
    .line 333
    return v10

    .line 334
    :pswitch_1a
    sget-object p2, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 335
    .line 336
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 337
    .line 338
    .line 339
    return v10

    .line 340
    :pswitch_1b
    sget-object p2, Lcom/android/dx/rop/type/Type;->SHORT:Lcom/android/dx/rop/type/Type;

    .line 341
    .line 342
    invoke-interface {v1, v4, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 343
    .line 344
    .line 345
    return v10

    .line 346
    :pswitch_1c
    sget-object p2, Lcom/android/dx/rop/type/Type;->CHAR:Lcom/android/dx/rop/type/Type;

    .line 347
    .line 348
    invoke-interface {v1, v4, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 349
    .line 350
    .line 351
    return v10

    .line 352
    :pswitch_1d
    sget-object p2, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    .line 353
    .line 354
    invoke-interface {v1, v4, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 355
    .line 356
    .line 357
    return v10

    .line 358
    :pswitch_1e
    sget-object p2, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 359
    .line 360
    invoke-interface {v1, v4, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 361
    .line 362
    .line 363
    return v10

    .line 364
    :pswitch_1f
    sget-object p2, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 365
    .line 366
    invoke-interface {v1, v4, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 367
    .line 368
    .line 369
    return v10

    .line 370
    :pswitch_20
    sget-object p2, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 371
    .line 372
    invoke-interface {v1, v4, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 373
    .line 374
    .line 375
    return v10

    .line 376
    :pswitch_21
    sget-object p2, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 377
    .line 378
    invoke-interface {v1, v4, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 379
    .line 380
    .line 381
    return v10

    .line 382
    :pswitch_22
    sget-object p2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 383
    .line 384
    invoke-interface {v1, v4, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 385
    .line 386
    .line 387
    return v10

    .line 388
    :pswitch_23
    add-int/lit8 v5, v2, -0x4b

    .line 389
    .line 390
    const/16 v2, 0x36

    .line 391
    .line 392
    const/4 v4, 0x1

    .line 393
    sget-object v6, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 394
    .line 395
    const/4 v7, 0x0

    .line 396
    move v3, p1

    .line 397
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 398
    .line 399
    .line 400
    return v10

    .line 401
    :pswitch_24
    add-int/lit8 v5, v2, -0x47

    .line 402
    .line 403
    const/16 v2, 0x36

    .line 404
    .line 405
    const/4 v4, 0x1

    .line 406
    sget-object v6, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    move v3, p1

    .line 410
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 411
    .line 412
    .line 413
    return v10

    .line 414
    :pswitch_25
    add-int/lit8 v5, v2, -0x43

    .line 415
    .line 416
    const/16 v2, 0x36

    .line 417
    .line 418
    const/4 v4, 0x1

    .line 419
    sget-object v6, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 420
    .line 421
    const/4 v7, 0x0

    .line 422
    move v3, p1

    .line 423
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 424
    .line 425
    .line 426
    return v10

    .line 427
    :pswitch_26
    add-int/lit8 v5, v2, -0x3f

    .line 428
    .line 429
    const/16 v2, 0x36

    .line 430
    .line 431
    const/4 v4, 0x1

    .line 432
    sget-object v6, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    move v3, p1

    .line 436
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 437
    .line 438
    .line 439
    return v10

    .line 440
    :pswitch_27
    add-int/lit8 v5, v2, -0x3b

    .line 441
    .line 442
    const/16 v2, 0x36

    .line 443
    .line 444
    const/4 v4, 0x1

    .line 445
    sget-object v6, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    move v3, p1

    .line 449
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 450
    .line 451
    .line 452
    return v10

    .line 453
    :pswitch_28
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 454
    .line 455
    add-int/lit8 v2, p1, 0x1

    .line 456
    .line 457
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 458
    .line 459
    .line 460
    move-result v5

    .line 461
    const/16 v2, 0x36

    .line 462
    .line 463
    const/4 v4, 0x2

    .line 464
    sget-object v6, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 465
    .line 466
    const/4 v7, 0x0

    .line 467
    move v3, p1

    .line 468
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 469
    .line 470
    .line 471
    return v9

    .line 472
    :pswitch_29
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 473
    .line 474
    add-int/lit8 v2, p1, 0x1

    .line 475
    .line 476
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 477
    .line 478
    .line 479
    move-result v5

    .line 480
    const/16 v2, 0x36

    .line 481
    .line 482
    const/4 v4, 0x2

    .line 483
    sget-object v6, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 484
    .line 485
    const/4 v7, 0x0

    .line 486
    move v3, p1

    .line 487
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 488
    .line 489
    .line 490
    return v9

    .line 491
    :pswitch_2a
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 492
    .line 493
    add-int/lit8 v2, p1, 0x1

    .line 494
    .line 495
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 496
    .line 497
    .line 498
    move-result v5

    .line 499
    const/16 v2, 0x36

    .line 500
    .line 501
    const/4 v4, 0x2

    .line 502
    sget-object v6, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 503
    .line 504
    const/4 v7, 0x0

    .line 505
    move v3, p1

    .line 506
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 507
    .line 508
    .line 509
    return v9

    .line 510
    :pswitch_2b
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 511
    .line 512
    add-int/lit8 v2, p1, 0x1

    .line 513
    .line 514
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    const/16 v2, 0x36

    .line 519
    .line 520
    const/4 v4, 0x2

    .line 521
    sget-object v6, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 522
    .line 523
    const/4 v7, 0x0

    .line 524
    move v3, p1

    .line 525
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 526
    .line 527
    .line 528
    return v9

    .line 529
    :pswitch_2c
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 530
    .line 531
    add-int/lit8 v2, p1, 0x1

    .line 532
    .line 533
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 534
    .line 535
    .line 536
    move-result v5

    .line 537
    const/16 v2, 0x36

    .line 538
    .line 539
    const/4 v4, 0x2

    .line 540
    sget-object v6, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 541
    .line 542
    const/4 v7, 0x0

    .line 543
    move v3, p1

    .line 544
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 545
    .line 546
    .line 547
    return v9

    .line 548
    :pswitch_2d
    sget-object p2, Lcom/android/dx/rop/type/Type;->SHORT:Lcom/android/dx/rop/type/Type;

    .line 549
    .line 550
    invoke-interface {v1, v5, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 551
    .line 552
    .line 553
    return v10

    .line 554
    :pswitch_2e
    sget-object p2, Lcom/android/dx/rop/type/Type;->CHAR:Lcom/android/dx/rop/type/Type;

    .line 555
    .line 556
    invoke-interface {v1, v5, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 557
    .line 558
    .line 559
    return v10

    .line 560
    :pswitch_2f
    sget-object p2, Lcom/android/dx/rop/type/Type;->BYTE:Lcom/android/dx/rop/type/Type;

    .line 561
    .line 562
    invoke-interface {v1, v5, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 563
    .line 564
    .line 565
    return v10

    .line 566
    :pswitch_30
    sget-object p2, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 567
    .line 568
    invoke-interface {v1, v5, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 569
    .line 570
    .line 571
    return v10

    .line 572
    :pswitch_31
    sget-object p2, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 573
    .line 574
    invoke-interface {v1, v5, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 575
    .line 576
    .line 577
    return v10

    .line 578
    :pswitch_32
    sget-object p2, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 579
    .line 580
    invoke-interface {v1, v5, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 581
    .line 582
    .line 583
    return v10

    .line 584
    :pswitch_33
    sget-object p2, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 585
    .line 586
    invoke-interface {v1, v5, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 587
    .line 588
    .line 589
    return v10

    .line 590
    :pswitch_34
    sget-object p2, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 591
    .line 592
    invoke-interface {v1, v5, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 593
    .line 594
    .line 595
    return v10

    .line 596
    :pswitch_35
    add-int/lit8 v5, v2, -0x2a

    .line 597
    .line 598
    const/16 v2, 0x15

    .line 599
    .line 600
    const/4 v4, 0x1

    .line 601
    sget-object v6, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 602
    .line 603
    const/4 v7, 0x0

    .line 604
    move v3, p1

    .line 605
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 606
    .line 607
    .line 608
    return v10

    .line 609
    :pswitch_36
    add-int/lit8 v5, v2, -0x26

    .line 610
    .line 611
    const/16 v2, 0x15

    .line 612
    .line 613
    const/4 v4, 0x1

    .line 614
    sget-object v6, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 615
    .line 616
    const/4 v7, 0x0

    .line 617
    move v3, p1

    .line 618
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 619
    .line 620
    .line 621
    return v10

    .line 622
    :pswitch_37
    add-int/lit8 v5, v2, -0x22

    .line 623
    .line 624
    const/16 v2, 0x15

    .line 625
    .line 626
    const/4 v4, 0x1

    .line 627
    sget-object v6, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 628
    .line 629
    const/4 v7, 0x0

    .line 630
    move v3, p1

    .line 631
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 632
    .line 633
    .line 634
    return v10

    .line 635
    :pswitch_38
    add-int/lit8 v5, v2, -0x1e

    .line 636
    .line 637
    const/16 v2, 0x15

    .line 638
    .line 639
    const/4 v4, 0x1

    .line 640
    sget-object v6, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 641
    .line 642
    const/4 v7, 0x0

    .line 643
    move v3, p1

    .line 644
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 645
    .line 646
    .line 647
    return v10

    .line 648
    :pswitch_39
    add-int/lit8 v5, v2, -0x1a

    .line 649
    .line 650
    const/16 v2, 0x15

    .line 651
    .line 652
    const/4 v4, 0x1

    .line 653
    sget-object v6, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 654
    .line 655
    const/4 v7, 0x0

    .line 656
    move v3, p1

    .line 657
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 658
    .line 659
    .line 660
    return v10

    .line 661
    :pswitch_3a
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 662
    .line 663
    add-int/lit8 v2, p1, 0x1

    .line 664
    .line 665
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 666
    .line 667
    .line 668
    move-result v5

    .line 669
    const/16 v2, 0x15

    .line 670
    .line 671
    const/4 v4, 0x2

    .line 672
    sget-object v6, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 673
    .line 674
    const/4 v7, 0x0

    .line 675
    move v3, p1

    .line 676
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 677
    .line 678
    .line 679
    return v9

    .line 680
    :pswitch_3b
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 681
    .line 682
    add-int/lit8 v2, p1, 0x1

    .line 683
    .line 684
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 685
    .line 686
    .line 687
    move-result v5

    .line 688
    const/16 v2, 0x15

    .line 689
    .line 690
    const/4 v4, 0x2

    .line 691
    sget-object v6, Lcom/android/dx/rop/type/Type;->DOUBLE:Lcom/android/dx/rop/type/Type;

    .line 692
    .line 693
    const/4 v7, 0x0

    .line 694
    move v3, p1

    .line 695
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 696
    .line 697
    .line 698
    return v9

    .line 699
    :pswitch_3c
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 700
    .line 701
    add-int/lit8 v2, p1, 0x1

    .line 702
    .line 703
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 704
    .line 705
    .line 706
    move-result v5

    .line 707
    const/16 v2, 0x15

    .line 708
    .line 709
    const/4 v4, 0x2

    .line 710
    sget-object v6, Lcom/android/dx/rop/type/Type;->FLOAT:Lcom/android/dx/rop/type/Type;

    .line 711
    .line 712
    const/4 v7, 0x0

    .line 713
    move v3, p1

    .line 714
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 715
    .line 716
    .line 717
    return v9

    .line 718
    :pswitch_3d
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 719
    .line 720
    add-int/lit8 v2, p1, 0x1

    .line 721
    .line 722
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 723
    .line 724
    .line 725
    move-result v5

    .line 726
    const/16 v2, 0x15

    .line 727
    .line 728
    const/4 v4, 0x2

    .line 729
    sget-object v6, Lcom/android/dx/rop/type/Type;->LONG:Lcom/android/dx/rop/type/Type;

    .line 730
    .line 731
    const/4 v7, 0x0

    .line 732
    move v3, p1

    .line 733
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 734
    .line 735
    .line 736
    return v9

    .line 737
    :pswitch_3e
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 738
    .line 739
    add-int/lit8 v2, p1, 0x1

    .line 740
    .line 741
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 742
    .line 743
    .line 744
    move-result v5

    .line 745
    const/16 v2, 0x15

    .line 746
    .line 747
    const/4 v4, 0x2

    .line 748
    sget-object v6, Lcom/android/dx/rop/type/Type;->INT:Lcom/android/dx/rop/type/Type;

    .line 749
    .line 750
    const/4 v7, 0x0

    .line 751
    move v3, p1

    .line 752
    invoke-interface/range {v1 .. v7}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitLocal(IIIILcom/android/dx/rop/type/Type;I)V

    .line 753
    .line 754
    .line 755
    return v9

    .line 756
    :pswitch_3f
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 757
    .line 758
    add-int/lit8 v2, p1, 0x1

    .line 759
    .line 760
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 761
    .line 762
    .line 763
    move-result p2

    .line 764
    iget-object v2, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 765
    .line 766
    invoke-interface {v2, p2}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 767
    .line 768
    .line 769
    move-result-object v5

    .line 770
    const/16 v2, 0x14

    .line 771
    .line 772
    const/4 v4, 0x3

    .line 773
    const/4 v6, 0x0

    .line 774
    move v3, p1

    .line 775
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 776
    .line 777
    .line 778
    return v8

    .line 779
    :pswitch_40
    iget-object v2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 780
    .line 781
    add-int/lit8 v3, p1, 0x1

    .line 782
    .line 783
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 784
    .line 785
    .line 786
    move-result v2

    .line 787
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 788
    .line 789
    invoke-interface {v3, v2}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 790
    .line 791
    .line 792
    move-result-object v5

    .line 793
    instance-of v2, v5, Lcom/android/dx/rop/cst/CstInteger;

    .line 794
    .line 795
    if-eqz v2, :cond_2

    .line 796
    .line 797
    move-object p2, v5

    .line 798
    check-cast p2, Lcom/android/dx/rop/cst/CstInteger;

    .line 799
    .line 800
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 801
    .line 802
    .line 803
    move-result p2

    .line 804
    :cond_2
    move v6, p2

    .line 805
    const/16 v2, 0x12

    .line 806
    .line 807
    const/4 v4, 0x3

    .line 808
    move v3, p1

    .line 809
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 810
    .line 811
    .line 812
    return v8

    .line 813
    :pswitch_41
    iget-object v2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 814
    .line 815
    add-int/lit8 v3, p1, 0x1

    .line 816
    .line 817
    invoke-virtual {v2, v3}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 818
    .line 819
    .line 820
    move-result v2

    .line 821
    iget-object v3, p0, Lcom/android/dx/cf/code/BytecodeArray;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 822
    .line 823
    invoke-interface {v3, v2}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 824
    .line 825
    .line 826
    move-result-object v5

    .line 827
    instance-of v2, v5, Lcom/android/dx/rop/cst/CstInteger;

    .line 828
    .line 829
    if-eqz v2, :cond_3

    .line 830
    .line 831
    move-object p2, v5

    .line 832
    check-cast p2, Lcom/android/dx/rop/cst/CstInteger;

    .line 833
    .line 834
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 835
    .line 836
    .line 837
    move-result p2

    .line 838
    :cond_3
    move v6, p2

    .line 839
    const/16 v2, 0x12

    .line 840
    .line 841
    const/4 v4, 0x2

    .line 842
    move v3, p1

    .line 843
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 844
    .line 845
    .line 846
    return v9

    .line 847
    :pswitch_42
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 848
    .line 849
    add-int/lit8 v2, p1, 0x1

    .line 850
    .line 851
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getShort(I)I

    .line 852
    .line 853
    .line 854
    move-result v6

    .line 855
    const/16 v2, 0x12

    .line 856
    .line 857
    const/4 v4, 0x3

    .line 858
    invoke-static {v6}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 859
    .line 860
    .line 861
    move-result-object v5

    .line 862
    move v3, p1

    .line 863
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 864
    .line 865
    .line 866
    return v8

    .line 867
    :pswitch_43
    iget-object p2, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    .line 868
    .line 869
    add-int/lit8 v2, p1, 0x1

    .line 870
    .line 871
    invoke-virtual {p2, v2}, Lcom/android/dx/util/ByteArray;->getByte(I)I

    .line 872
    .line 873
    .line 874
    move-result v6

    .line 875
    const/16 v2, 0x12

    .line 876
    .line 877
    const/4 v4, 0x2

    .line 878
    invoke-static {v6}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    move v3, p1

    .line 883
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 884
    .line 885
    .line 886
    return v9

    .line 887
    :pswitch_44
    const/16 v2, 0x12

    .line 888
    .line 889
    const/4 v4, 0x1

    .line 890
    sget-object v5, Lcom/android/dx/rop/cst/CstDouble;->VALUE_1:Lcom/android/dx/rop/cst/CstDouble;

    .line 891
    .line 892
    const/4 v6, 0x0

    .line 893
    move v3, p1

    .line 894
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 895
    .line 896
    .line 897
    return v10

    .line 898
    :pswitch_45
    const/16 v2, 0x12

    .line 899
    .line 900
    const/4 v4, 0x1

    .line 901
    sget-object v5, Lcom/android/dx/rop/cst/CstDouble;->VALUE_0:Lcom/android/dx/rop/cst/CstDouble;

    .line 902
    .line 903
    const/4 v6, 0x0

    .line 904
    move v3, p1

    .line 905
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 906
    .line 907
    .line 908
    return v10

    .line 909
    :pswitch_46
    const/16 v2, 0x12

    .line 910
    .line 911
    const/4 v4, 0x1

    .line 912
    sget-object v5, Lcom/android/dx/rop/cst/CstFloat;->VALUE_2:Lcom/android/dx/rop/cst/CstFloat;

    .line 913
    .line 914
    const/4 v6, 0x0

    .line 915
    move v3, p1

    .line 916
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 917
    .line 918
    .line 919
    return v10

    .line 920
    :pswitch_47
    const/16 v2, 0x12

    .line 921
    .line 922
    const/4 v4, 0x1

    .line 923
    sget-object v5, Lcom/android/dx/rop/cst/CstFloat;->VALUE_1:Lcom/android/dx/rop/cst/CstFloat;

    .line 924
    .line 925
    const/4 v6, 0x0

    .line 926
    move v3, p1

    .line 927
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 928
    .line 929
    .line 930
    return v10

    .line 931
    :pswitch_48
    const/16 v2, 0x12

    .line 932
    .line 933
    const/4 v4, 0x1

    .line 934
    sget-object v5, Lcom/android/dx/rop/cst/CstFloat;->VALUE_0:Lcom/android/dx/rop/cst/CstFloat;

    .line 935
    .line 936
    const/4 v6, 0x0

    .line 937
    move v3, p1

    .line 938
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 939
    .line 940
    .line 941
    return v10

    .line 942
    :pswitch_49
    const/16 v2, 0x12

    .line 943
    .line 944
    const/4 v4, 0x1

    .line 945
    sget-object v5, Lcom/android/dx/rop/cst/CstLong;->VALUE_1:Lcom/android/dx/rop/cst/CstLong;

    .line 946
    .line 947
    const/4 v6, 0x0

    .line 948
    move v3, p1

    .line 949
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 950
    .line 951
    .line 952
    return v10

    .line 953
    :pswitch_4a
    const/16 v2, 0x12

    .line 954
    .line 955
    const/4 v4, 0x1

    .line 956
    sget-object v5, Lcom/android/dx/rop/cst/CstLong;->VALUE_0:Lcom/android/dx/rop/cst/CstLong;

    .line 957
    .line 958
    const/4 v6, 0x0

    .line 959
    move v3, p1

    .line 960
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 961
    .line 962
    .line 963
    return v10

    .line 964
    :pswitch_4b
    const/16 v2, 0x12

    .line 965
    .line 966
    const/4 v4, 0x1

    .line 967
    sget-object v5, Lcom/android/dx/rop/cst/CstInteger;->VALUE_5:Lcom/android/dx/rop/cst/CstInteger;

    .line 968
    .line 969
    const/4 v6, 0x5

    .line 970
    move v3, p1

    .line 971
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 972
    .line 973
    .line 974
    return v10

    .line 975
    :pswitch_4c
    const/16 v2, 0x12

    .line 976
    .line 977
    const/4 v4, 0x1

    .line 978
    sget-object v5, Lcom/android/dx/rop/cst/CstInteger;->VALUE_4:Lcom/android/dx/rop/cst/CstInteger;

    .line 979
    .line 980
    const/4 v6, 0x4

    .line 981
    move v3, p1

    .line 982
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 983
    .line 984
    .line 985
    return v10

    .line 986
    :pswitch_4d
    const/16 v2, 0x12

    .line 987
    .line 988
    const/4 v4, 0x1

    .line 989
    sget-object v5, Lcom/android/dx/rop/cst/CstInteger;->VALUE_3:Lcom/android/dx/rop/cst/CstInteger;

    .line 990
    .line 991
    const/4 v6, 0x3

    .line 992
    move v3, p1

    .line 993
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 994
    .line 995
    .line 996
    return v10

    .line 997
    :pswitch_4e
    const/16 v2, 0x12

    .line 998
    .line 999
    const/4 v4, 0x1

    .line 1000
    sget-object v5, Lcom/android/dx/rop/cst/CstInteger;->VALUE_2:Lcom/android/dx/rop/cst/CstInteger;

    .line 1001
    .line 1002
    const/4 v6, 0x2

    .line 1003
    move v3, p1

    .line 1004
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1005
    .line 1006
    .line 1007
    return v10

    .line 1008
    :pswitch_4f
    const/16 v2, 0x12

    .line 1009
    .line 1010
    const/4 v4, 0x1

    .line 1011
    sget-object v5, Lcom/android/dx/rop/cst/CstInteger;->VALUE_1:Lcom/android/dx/rop/cst/CstInteger;

    .line 1012
    .line 1013
    const/4 v6, 0x1

    .line 1014
    move v3, p1

    .line 1015
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1016
    .line 1017
    .line 1018
    return v10

    .line 1019
    :pswitch_50
    const/16 v2, 0x12

    .line 1020
    .line 1021
    const/4 v4, 0x1

    .line 1022
    sget-object v5, Lcom/android/dx/rop/cst/CstInteger;->VALUE_0:Lcom/android/dx/rop/cst/CstInteger;

    .line 1023
    .line 1024
    const/4 v6, 0x0

    .line 1025
    move v3, p1

    .line 1026
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1027
    .line 1028
    .line 1029
    return v10

    .line 1030
    :pswitch_51
    const/16 v2, 0x12

    .line 1031
    .line 1032
    const/4 v4, 0x1

    .line 1033
    sget-object v5, Lcom/android/dx/rop/cst/CstInteger;->VALUE_M1:Lcom/android/dx/rop/cst/CstInteger;

    .line 1034
    .line 1035
    const/4 v6, -0x1

    .line 1036
    move v3, p1

    .line 1037
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1038
    .line 1039
    .line 1040
    return v10

    .line 1041
    :pswitch_52
    const/16 v2, 0x12

    .line 1042
    .line 1043
    const/4 v4, 0x1

    .line 1044
    sget-object v5, Lcom/android/dx/rop/cst/CstKnownNull;->THE_ONE:Lcom/android/dx/rop/cst/CstKnownNull;

    .line 1045
    .line 1046
    const/4 v6, 0x0

    .line 1047
    move v3, p1

    .line 1048
    invoke-interface/range {v1 .. v6}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V

    .line 1049
    .line 1050
    .line 1051
    return v10

    .line 1052
    :pswitch_53
    sget-object p2, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 1053
    .line 1054
    invoke-interface {v1, v2, p1, v10, p2}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1055
    .line 1056
    .line 1057
    :goto_1
    return v10

    .line 1058
    :catch_0
    move-exception p2

    .line 1059
    new-instance v1, Lcom/android/dx/cf/code/SimException;

    .line 1060
    .line 1061
    invoke-direct {v1, p2}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/Throwable;)V

    .line 1062
    .line 1063
    .line 1064
    new-instance p2, Ljava/lang/StringBuilder;

    .line 1065
    .line 1066
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    .line 1072
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p1

    .line 1076
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object p1

    .line 1083
    invoke-virtual {v1, p1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 1084
    .line 1085
    .line 1086
    throw v1

    .line 1087
    :catch_1
    move-exception p2

    .line 1088
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1089
    .line 1090
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1094
    .line 1095
    .line 1096
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object p1

    .line 1100
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object p1

    .line 1107
    invoke-virtual {p2, p1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    throw p2

    .line 1111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_37
        :pswitch_37
        :pswitch_37
        :pswitch_37
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_35
        :pswitch_35
        :pswitch_35
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_19
        :pswitch_18
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_14
        :pswitch_12
        :pswitch_11
        :pswitch_14
        :pswitch_13
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_11
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_10
        :pswitch_10
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
.end method

.method public processWorkSet([ILcom/android/dx/cf/code/BytecodeArray$Visitor;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    :goto_0
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lcom/android/dx/util/Bits;->findFirst([II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {p1, v0}, Lcom/android/dx/util/Bits;->clear([II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, p2}, Lcom/android/dx/cf/code/BytecodeArray;->parseInstruction(ILcom/android/dx/cf/code/BytecodeArray$Visitor;)I

    .line 15
    .line 16
    .line 17
    invoke-interface {p2, v0}, Lcom/android/dx/cf/code/BytecodeArray$Visitor;->setPreviousOffset(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string/jumbo p2, "visitor == null"

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
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

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/BytecodeArray;->bytes:Lcom/android/dx/util/ByteArray;

    invoke-virtual {v0}, Lcom/android/dx/util/ByteArray;->size()I

    move-result v0

    return v0
.end method
