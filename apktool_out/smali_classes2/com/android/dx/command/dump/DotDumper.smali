.class public Lcom/android/dx/command/dump/DotDumper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/cf/iface/ParseObserver;


# instance fields
.field private final args:Lcom/android/dx/command/dump/Args;

.field private final bytes:[B

.field private classFile:Lcom/android/dx/cf/direct/DirectClassFile;

.field private final dexOptions:Lcom/android/dx/dex/DexOptions;

.field private final filePath:Ljava/lang/String;

.field private final optimize:Z

.field private final strictParse:Z


# direct methods
.method constructor <init>([BLjava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/command/dump/DotDumper;->bytes:[B

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/command/dump/DotDumper;->filePath:Ljava/lang/String;

    .line 7
    .line 8
    iget-boolean p1, p3, Lcom/android/dx/command/dump/Args;->strictParse:Z

    .line 9
    .line 10
    iput-boolean p1, p0, Lcom/android/dx/command/dump/DotDumper;->strictParse:Z

    .line 11
    .line 12
    iget-boolean p1, p3, Lcom/android/dx/command/dump/Args;->optimize:Z

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/android/dx/command/dump/DotDumper;->optimize:Z

    .line 15
    .line 16
    iput-object p3, p0, Lcom/android/dx/command/dump/DotDumper;->args:Lcom/android/dx/command/dump/Args;

    .line 17
    .line 18
    new-instance p1, Lcom/android/dx/dex/DexOptions;

    .line 19
    .line 20
    invoke-direct {p1}, Lcom/android/dx/dex/DexOptions;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/android/dx/command/dump/DotDumper;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 24
    .line 25
    return-void
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

.method static dump([BLjava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 1

    new-instance v0, Lcom/android/dx/command/dump/DotDumper;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/dx/command/dump/DotDumper;-><init>([BLjava/lang/String;Lcom/android/dx/command/dump/Args;)V

    invoke-direct {v0}, Lcom/android/dx/command/dump/DotDumper;->run()V

    return-void
.end method

.method private run()V
    .locals 5

    .line 1
    new-instance v0, Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dump/DotDumper;->bytes:[B

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/command/dump/DotDumper;->filePath:Ljava/lang/String;

    .line 11
    .line 12
    iget-boolean v3, p0, Lcom/android/dx/command/dump/DotDumper;->strictParse:Z

    .line 13
    .line 14
    invoke-direct {v1, v0, v2, v3}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/android/dx/command/dump/DotDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 18
    .line 19
    sget-object v2, Lcom/android/dx/cf/direct/StdAttributeFactory;->THE_ONE:Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/android/dx/command/dump/DotDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic()I

    .line 27
    .line 28
    .line 29
    new-instance v1, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/android/dx/command/dump/DotDumper;->filePath:Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v4, p0, Lcom/android/dx/command/dump/DotDumper;->strictParse:Z

    .line 34
    .line 35
    invoke-direct {v1, v0, v3, v4}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Lcom/android/dx/cf/direct/DirectClassFile;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic()I

    .line 45
    .line 46
    .line 47
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public changeIndent(I)V
    .locals 0

    return-void
.end method

.method public endParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;Lcom/android/dx/cf/iface/Member;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v3, v2, Lcom/android/dx/cf/iface/Method;

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {v0, v1}, Lcom/android/dx/command/dump/DotDumper;->shouldDumpMethod(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    new-instance v3, Lcom/android/dx/cf/code/ConcreteMethod;

    .line 20
    .line 21
    check-cast v2, Lcom/android/dx/cf/iface/Method;

    .line 22
    .line 23
    iget-object v4, v0, Lcom/android/dx/command/dump/DotDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-direct {v3, v2, v4, v5, v5}, Lcom/android/dx/cf/code/ConcreteMethod;-><init>(Lcom/android/dx/cf/iface/Method;Lcom/android/dx/cf/iface/ClassFile;ZZ)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Lcom/android/dx/rop/code/DexTranslationAdvice;->THE_ONE:Lcom/android/dx/rop/code/DexTranslationAdvice;

    .line 30
    .line 31
    iget-object v4, v0, Lcom/android/dx/command/dump/DotDumper;->classFile:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 32
    .line 33
    invoke-virtual {v4}, Lcom/android/dx/cf/direct/DirectClassFile;->getMethods()Lcom/android/dx/cf/iface/MethodList;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v6, v0, Lcom/android/dx/command/dump/DotDumper;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 38
    .line 39
    invoke-static {v3, v2, v4, v6}, Lcom/android/dx/cf/code/Ropper;->convert(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)Lcom/android/dx/rop/code/RopMethod;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-boolean v6, v0, Lcom/android/dx/command/dump/DotDumper;->optimize:Z

    .line 44
    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/android/dx/cf/code/ConcreteMethod;->getAccessFlags()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-static {v6}, Lcom/android/dx/rop/code/AccessFlags;->isStatic(I)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-static {v3, v6}, Lcom/android/dx/command/dump/BaseDumper;->computeParamWidth(Lcom/android/dx/cf/code/ConcreteMethod;Z)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v4, v3, v6, v5, v2}, Lcom/android/dx/ssa/Optimizer;->optimize(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/rop/code/RopMethod;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    :cond_2
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 64
    .line 65
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v6, "digraph "

    .line 71
    .line 72
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string/jumbo v1, "{"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 92
    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v3, "\tfirst -> n"

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RopMethod;->getFirstLabel()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v3, ";"

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    const/4 v4, 0x0

    .line 135
    move v6, v4

    .line 136
    :goto_0
    if-ge v6, v2, :cond_7

    .line 137
    .line 138
    invoke-virtual {v1, v6}, Lcom/android/dx/rop/code/BasicBlockList;->get(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v7}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-virtual {v7}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v9}, Lcom/android/dx/util/IntList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    const-string v11, "\tn"

    .line 155
    .line 156
    if-nez v10, :cond_3

    .line 157
    .line 158
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 159
    .line 160
    new-instance v9, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v8, " -> returns;"

    .line 176
    .line 177
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_2

    .line 188
    .line 189
    :cond_3
    invoke-virtual {v9}, Lcom/android/dx/util/IntList;->size()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    const-string v12, " -> n"

    .line 194
    .line 195
    if-ne v10, v5, :cond_4

    .line 196
    .line 197
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 198
    .line 199
    new-instance v10, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v9, v4}, Lcom/android/dx/util/IntList;->get(I)I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_2

    .line 239
    .line 240
    :cond_4
    sget-object v10, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 241
    .line 242
    new-instance v13, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v14

    .line 254
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v14, " -> {"

    .line 258
    .line 259
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    invoke-virtual {v10, v13}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    move v10, v4

    .line 270
    :goto_1
    invoke-virtual {v9}, Lcom/android/dx/util/IntList;->size()I

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    if-ge v10, v13, :cond_6

    .line 275
    .line 276
    invoke-virtual {v9, v10}, Lcom/android/dx/util/IntList;->get(I)I

    .line 277
    .line 278
    .line 279
    move-result v13

    .line 280
    invoke-virtual {v7}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 281
    .line 282
    .line 283
    move-result v14

    .line 284
    if-eq v13, v14, :cond_5

    .line 285
    .line 286
    sget-object v14, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 287
    .line 288
    new-instance v15, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const-string v4, " n"

    .line 294
    .line 295
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-static {v13}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string v4, " "

    .line 306
    .line 307
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-virtual {v14, v4}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 318
    .line 319
    const/4 v4, 0x0

    .line 320
    goto :goto_1

    .line 321
    :cond_6
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 322
    .line 323
    const-string/jumbo v9, "};"

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v9}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 330
    .line 331
    new-instance v9, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-static {v8}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v7}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    invoke-static {v7}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const-string v7, " [label=\"primary\"];"

    .line 361
    .line 362
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    invoke-virtual {v4, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 373
    .line 374
    const/4 v4, 0x0

    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :cond_7
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 378
    .line 379
    const-string/jumbo v2, "}"

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    return-void
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
.end method

.method public parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected shouldDumpMethod(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/command/dump/DotDumper;->args:Lcom/android/dx/command/dump/Args;

    iget-object v0, v0, Lcom/android/dx/command/dump/Args;->method:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public startParsingMember(Lcom/android/dx/util/ByteArray;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method
