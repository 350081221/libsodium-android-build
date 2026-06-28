.class final Lcom/android/dx/Constants;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getConstant(Ljava/lang/Object;)Lcom/android/dx/rop/cst/TypedConstant;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/android/dx/rop/cst/CstKnownNull;->THE_ONE:Lcom/android/dx/rop/cst/CstKnownNull;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstBoolean;->make(Z)Lcom/android/dx/rop/cst/CstBoolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    instance-of v0, p0, Ljava/lang/Byte;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast p0, Ljava/lang/Byte;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstByte;->make(B)Lcom/android/dx/rop/cst/CstByte;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_2
    instance-of v0, p0, Ljava/lang/Character;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    check-cast p0, Ljava/lang/Character;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstChar;->make(C)Lcom/android/dx/rop/cst/CstChar;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_3
    instance-of v0, p0, Ljava/lang/Double;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    check-cast p0, Ljava/lang/Double;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    invoke-static {v0, v1}, Lcom/android/dx/rop/cst/CstDouble;->make(J)Lcom/android/dx/rop/cst/CstDouble;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_4
    instance-of v0, p0, Ljava/lang/Float;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    check-cast p0, Ljava/lang/Float;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstFloat;->make(I)Lcom/android/dx/rop/cst/CstFloat;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_5
    instance-of v0, p0, Ljava/lang/Integer;

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    check-cast p0, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_6
    instance-of v0, p0, Ljava/lang/Long;

    .line 105
    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    check-cast p0, Ljava/lang/Long;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    invoke-static {v0, v1}, Lcom/android/dx/rop/cst/CstLong;->make(J)Lcom/android/dx/rop/cst/CstLong;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :cond_7
    instance-of v0, p0, Ljava/lang/Short;

    .line 120
    .line 121
    if-eqz v0, :cond_8

    .line 122
    .line 123
    check-cast p0, Ljava/lang/Short;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstShort;->make(S)Lcom/android/dx/rop/cst/CstShort;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_8
    instance-of v0, p0, Ljava/lang/String;

    .line 135
    .line 136
    if-eqz v0, :cond_9

    .line 137
    .line 138
    new-instance v0, Lcom/android/dx/rop/cst/CstString;

    .line 139
    .line 140
    check-cast p0, Ljava/lang/String;

    .line 141
    .line 142
    invoke-direct {v0, p0}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_9
    instance-of v0, p0, Ljava/lang/Class;

    .line 147
    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 151
    .line 152
    check-cast p0, Ljava/lang/Class;

    .line 153
    .line 154
    invoke-static {p0}, Lcom/android/dx/TypeId;->get(Ljava/lang/Class;)Lcom/android/dx/TypeId;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    iget-object p0, p0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 159
    .line 160
    invoke-direct {v0, p0}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    :cond_a
    instance-of v0, p0, Lcom/android/dx/TypeId;

    .line 165
    .line 166
    if-eqz v0, :cond_b

    .line 167
    .line 168
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 169
    .line 170
    check-cast p0, Lcom/android/dx/TypeId;

    .line 171
    .line 172
    iget-object p0, p0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 173
    .line 174
    invoke-direct {v0, p0}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :cond_b
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 179
    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v2, "Not a constant: "

    .line 186
    .line 187
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0
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
