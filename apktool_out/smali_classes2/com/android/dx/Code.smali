.class public final Lcom/android/dx/Code;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final catchLabels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/dx/Label;",
            ">;"
        }
    .end annotation
.end field

.field private final catchTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/dx/TypeId<",
            "*>;>;"
        }
    .end annotation
.end field

.field private catches:Lcom/android/dx/rop/type/StdTypeList;

.field private currentLabel:Lcom/android/dx/Label;

.field private final labels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/dx/Label;",
            ">;"
        }
    .end annotation
.end field

.field private final locals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/dx/Local<",
            "*>;>;"
        }
    .end annotation
.end field

.field private localsInitialized:Z

.field private final method:Lcom/android/dx/MethodId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/MethodId<",
            "**>;"
        }
    .end annotation
.end field

.field private final parameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/dx/Local<",
            "*>;>;"
        }
    .end annotation
.end field

.field private sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

.field private final thisLocal:Lcom/android/dx/Local;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/Local<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/android/dx/DexMaker$MethodDeclaration;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/Code;->labels:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/android/dx/Code;->parameters:Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/android/dx/Code;->locals:Ljava/util/List;

    .line 24
    .line 25
    sget-object v1, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 26
    .line 27
    iput-object v1, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lcom/android/dx/Code;->catchTypes:Ljava/util/List;

    .line 35
    .line 36
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lcom/android/dx/Code;->catchLabels:Ljava/util/List;

    .line 42
    .line 43
    sget-object v1, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 44
    .line 45
    iput-object v1, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 46
    .line 47
    iget-object v1, p1, Lcom/android/dx/DexMaker$MethodDeclaration;->method:Lcom/android/dx/MethodId;

    .line 48
    .line 49
    iput-object v1, p0, Lcom/android/dx/Code;->method:Lcom/android/dx/MethodId;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/android/dx/DexMaker$MethodDeclaration;->isStatic()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, Lcom/android/dx/Code;->thisLocal:Lcom/android/dx/Local;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object p1, v1, Lcom/android/dx/MethodId;->declaringType:Lcom/android/dx/TypeId;

    .line 62
    .line 63
    invoke-static {p0, p1}, Lcom/android/dx/Local;->get(Lcom/android/dx/Code;Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lcom/android/dx/Code;->thisLocal:Lcom/android/dx/Local;

    .line 68
    .line 69
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :goto_0
    iget-object p1, v1, Lcom/android/dx/MethodId;->parameters:Lcom/android/dx/TypeList;

    .line 73
    .line 74
    iget-object p1, p1, Lcom/android/dx/TypeList;->types:[Lcom/android/dx/TypeId;

    .line 75
    .line 76
    array-length v0, p1

    .line 77
    const/4 v1, 0x0

    .line 78
    :goto_1
    if-ge v1, v0, :cond_1

    .line 79
    .line 80
    aget-object v2, p1, v1

    .line 81
    .line 82
    iget-object v3, p0, Lcom/android/dx/Code;->parameters:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {p0, v2}, Lcom/android/dx/Local;->get(Lcom/android/dx/Code;Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    new-instance p1, Lcom/android/dx/Label;

    .line 95
    .line 96
    invoke-direct {p1}, Lcom/android/dx/Label;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    .line 100
    .line 101
    invoke-direct {p0, p1}, Lcom/android/dx/Code;->adopt(Lcom/android/dx/Label;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    .line 105
    .line 106
    const/4 v0, 0x1

    .line 107
    iput-boolean v0, p1, Lcom/android/dx/Label;->marked:Z

    .line 108
    .line 109
    return-void
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

.method private addInstruction(Lcom/android/dx/rop/code/Insn;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/Label;)V

    return-void
.end method

.method private addInstruction(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/Label;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    if-eqz v0, :cond_a

    iget-boolean v1, v0, Lcom/android/dx/Label;->marked:Z

    if-eqz v1, :cond_a

    .line 3
    iget-object v0, v0, Lcom/android/dx/Label;->instructions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    move-result p1

    const/4 v0, 0x1

    const-string/jumbo v1, "unexpected branch: "

    if-eq p1, v0, :cond_8

    const/4 v0, 0x2

    const/4 v2, 0x0

    if-eq p1, v0, :cond_6

    const/4 v0, 0x3

    const-string v3, "branch == null"

    if-eq p1, v0, :cond_4

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_0

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    iget-object p2, p0, Lcom/android/dx/Code;->catchLabels:Ljava/util/List;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v2, p1}, Lcom/android/dx/Code;->splitCurrentLabel(Lcom/android/dx/Label;Ljava/util/List;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    if-eqz p2, :cond_3

    .line 8
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/android/dx/Code;->splitCurrentLabel(Lcom/android/dx/Label;Ljava/util/List;)V

    goto :goto_0

    .line 9
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    if-eqz p2, :cond_5

    .line 10
    iget-object p1, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    iput-object p2, p1, Lcom/android/dx/Label;->primarySuccessor:Lcom/android/dx/Label;

    .line 11
    iput-object v2, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    goto :goto_0

    .line 12
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez p2, :cond_7

    .line 13
    iput-object v2, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    :goto_0
    return-void

    .line 14
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    if-nez p2, :cond_9

    return-void

    .line 15
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "no current label"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private adopt(Lcom/android/dx/Label;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/android/dx/Label;->code:Lcom/android/dx/Code;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-nez v0, :cond_1

    .line 7
    .line 8
    iput-object p0, p1, Lcom/android/dx/Label;->code:Lcom/android/dx/Code;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/android/dx/Code;->labels:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "Cannot adopt label; it belongs to another Code"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
    .line 24
.end method

.method private cleanUpLabels()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/Code;->labels:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/android/dx/Label;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/android/dx/Label;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, Lcom/android/dx/Label;->compact()V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v3, v1, 0x1

    .line 34
    .line 35
    iput v1, v2, Lcom/android/dx/Label;->id:I

    .line 36
    .line 37
    move v1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
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

.method private coerce(Lcom/android/dx/Local;Lcom/android/dx/TypeId;)Lcom/android/dx/Local;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Local<",
            "*>;",
            "Lcom/android/dx/TypeId<",
            "TT;>;)",
            "Lcom/android/dx/Local<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "requested "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p2, " but was "

    .line 26
    .line 27
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private static concatenate(Lcom/android/dx/Local;[Lcom/android/dx/Local;)Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;[",
            "Lcom/android/dx/Local<",
            "*>;)",
            "Lcom/android/dx/rop/code/RegisterSpecList;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    new-instance v2, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 8
    .line 9
    array-length v3, p1

    .line 10
    add-int/2addr v3, v1

    .line 11
    invoke-direct {v2, v3}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v2, v0, p0}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_1
    array-length p0, p1

    .line 24
    if-ge v0, p0, :cond_2

    .line 25
    .line 26
    add-int p0, v0, v1

    .line 27
    .line 28
    aget-object v3, p1, v0

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, p0, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    return-object v2
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

.method private getCastRop(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/code/Rop;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getBasicType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x6

    .line 6
    if-ne v0, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->getBasicType()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p1, Lcom/android/dx/rop/code/Rops;->TO_SHORT:Lcom/android/dx/rop/code/Rop;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    sget-object p1, Lcom/android/dx/rop/code/Rops;->TO_CHAR:Lcom/android/dx/rop/code/Rop;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    sget-object p1, Lcom/android/dx/rop/code/Rops;->TO_BYTE:Lcom/android/dx/rop/code/Rop;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_3
    :goto_0
    invoke-static {p2, p1}, Lcom/android/dx/rop/code/Rops;->opConv(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
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

.method private varargs invoke(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/rop/code/Rop;",
            "Lcom/android/dx/MethodId<",
            "TD;TR;>;",
            "Lcom/android/dx/Local<",
            "-TR;>;",
            "Lcom/android/dx/Local<",
            "+TD;>;[",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 4
    .line 5
    invoke-static {p4, p5}, Lcom/android/dx/Code;->concatenate(Lcom/android/dx/Local;[Lcom/android/dx/Local;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    iget-object v4, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 10
    .line 11
    iget-object v5, p2, Lcom/android/dx/MethodId;->constant:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 12
    .line 13
    move-object v0, v6

    .line 14
    move-object v1, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v6}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 19
    .line 20
    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-direct {p0, p3, p1}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
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
.end method

.method private moveResult(Lcom/android/dx/Local;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;Z)V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object p2, p2, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {p2}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 13
    .line 14
    iget-object p2, p2, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 15
    .line 16
    invoke-static {p2}, Lcom/android/dx/rop/code/Rops;->opMoveResult(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :goto_0
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v2, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 29
    .line 30
    invoke-direct {v0, p2, v1, p1, v2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method private splitCurrentLabel(Lcom/android/dx/Label;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Label;",
            "Ljava/util/List<",
            "Lcom/android/dx/Label;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->adopt(Lcom/android/dx/Label;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    .line 10
    .line 11
    iput-object v0, v1, Lcom/android/dx/Label;->primarySuccessor:Lcom/android/dx/Label;

    .line 12
    .line 13
    iput-object p1, v1, Lcom/android/dx/Label;->alternateSuccessor:Lcom/android/dx/Label;

    .line 14
    .line 15
    iput-object p2, v1, Lcom/android/dx/Label;->catchLabels:Ljava/util/List;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, v0, Lcom/android/dx/Label;->marked:Z

    .line 21
    .line 22
    return-void
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

.method private toTypeList(Ljava/util/List;)Lcom/android/dx/rop/type/StdTypeList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/dx/TypeId<",
            "*>;>;)",
            "Lcom/android/dx/rop/type/StdTypeList;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/type/StdTypeList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Lcom/android/dx/rop/type/StdTypeList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcom/android/dx/TypeId;

    .line 22
    .line 23
    iget-object v2, v2, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/android/dx/rop/type/StdTypeList;->set(ILcom/android/dx/rop/type/Type;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
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


# virtual methods
.method public addCatchClause(Lcom/android/dx/TypeId;Lcom/android/dx/Label;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/TypeId<",
            "+",
            "Ljava/lang/Throwable;",
            ">;",
            "Lcom/android/dx/Label;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/Code;->catchTypes:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p2}, Lcom/android/dx/Code;->adopt(Lcom/android/dx/Label;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/android/dx/Code;->catchTypes:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/android/dx/Code;->catchTypes:Ljava/util/List;

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/android/dx/Code;->toTypeList(Ljava/util/List;)Lcom/android/dx/rop/type/StdTypeList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 24
    .line 25
    iget-object p1, p0, Lcom/android/dx/Code;->catchLabels:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v1, "Already caught: "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2
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

.method public aget(Lcom/android/dx/Local;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;",
            "Lcom/android/dx/Local<",
            "*>;",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/android/dx/rop/code/Rops;->opAget(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-static {p2, p3}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object p3, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 26
    .line 27
    invoke-direct {v0, v1, v2, p2, p3}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public aput(Lcom/android/dx/Local;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 2
    .line 3
    iget-object v1, p3, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/android/dx/rop/code/Rops;->opAput(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p3, p1, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p2, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 30
    .line 31
    invoke-direct {v0, v1, v2, p1, p2}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method public arrayLength(Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/android/dx/Local<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/code/Rops;->ARRAY_LENGTH:Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v3, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p2, v3}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 21
    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public cast(Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/Local;->getType()Lcom/android/dx/TypeId;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->isReference()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 14
    .line 15
    sget-object v2, Lcom/android/dx/rop/code/Rops;->CHECK_CAST:Lcom/android/dx/rop/code/Rop;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 28
    .line 29
    iget-object p2, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 30
    .line 31
    iget-object v6, p2, Lcom/android/dx/TypeId;->constant:Lcom/android/dx/rop/cst/CstType;

    .line 32
    .line 33
    move-object v1, v0

    .line 34
    invoke-direct/range {v1 .. v6}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 38
    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 46
    .line 47
    iget-object v1, p2, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 48
    .line 49
    iget-object v1, v1, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 50
    .line 51
    iget-object v2, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 52
    .line 53
    iget-object v2, v2, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 54
    .line 55
    invoke-direct {p0, v1, v2}, Lcom/android/dx/Code;->getCastRop(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/code/Rop;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-direct {v0, v1, v2, p1, p2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    return-void
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

.method public compare(Lcom/android/dx/Comparison;Lcom/android/dx/Label;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Comparison;",
            "Lcom/android/dx/Label;",
            "Lcom/android/dx/Local<",
            "TT;>;",
            "Lcom/android/dx/Local<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lcom/android/dx/Code;->adopt(Lcom/android/dx/Label;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p3, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 7
    .line 8
    iget-object v1, p4, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/rop/type/StdTypeList;->make(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/StdTypeList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/android/dx/Comparison;->rop(Lcom/android/dx/rop/type/TypeList;)Lcom/android/dx/rop/code/Rop;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 23
    .line 24
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p4}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    invoke-static {p3, p4}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const/4 p4, 0x0

    .line 37
    invoke-direct {v0, p1, v1, p4, p3}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0, p2}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/Label;)V

    .line 41
    .line 42
    .line 43
    return-void
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

.method public compareFloatingPoint(Lcom/android/dx/Local;Lcom/android/dx/Local;Lcom/android/dx/Local;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Number;",
            ">(",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/android/dx/Local<",
            "TT;>;",
            "Lcom/android/dx/Local<",
            "TT;>;I)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p4, v0, :cond_0

    .line 3
    .line 4
    iget-object p4, p2, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 5
    .line 6
    iget-object p4, p4, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 7
    .line 8
    invoke-static {p4}, Lcom/android/dx/rop/code/Rops;->opCmpg(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, -0x1

    .line 14
    if-ne p4, v0, :cond_1

    .line 15
    .line 16
    iget-object p4, p2, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 17
    .line 18
    iget-object p4, p4, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 19
    .line 20
    invoke-static {p4}, Lcom/android/dx/rop/code/Rops;->opCmpl(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    :goto_0
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-static {p2, p3}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {v0, p4, v1, p1, p2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    new-instance p2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string p3, "expected 1 or -1 but was "

    .line 59
    .line 60
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
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

.method public compareLongs(Lcom/android/dx/Local;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/code/Rops;->CMPL_LONG:Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-static {p2, p3}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-direct {v0, v1, v2, p1, p2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public compareZ(Lcom/android/dx/Comparison;Lcom/android/dx/Label;Lcom/android/dx/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Comparison;",
            "Lcom/android/dx/Label;",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lcom/android/dx/Code;->adopt(Lcom/android/dx/Label;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p3, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/android/dx/rop/type/StdTypeList;->make(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/StdTypeList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Lcom/android/dx/Comparison;->rop(Lcom/android/dx/rop/type/TypeList;)Lcom/android/dx/rop/code/Rop;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 19
    .line 20
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-static {p3}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v0, p1, v1, v2, p3}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p2}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/Label;)V

    .line 33
    .line 34
    .line 35
    return-void
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

.method public getParameter(ILcom/android/dx/TypeId;)Lcom/android/dx/Local;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/android/dx/TypeId<",
            "TT;>;)",
            "Lcom/android/dx/Local<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/Code;->thisLocal:Lcom/android/dx/Local;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/android/dx/Code;->parameters:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/android/dx/Local;

    .line 14
    .line 15
    invoke-direct {p0, p1, p2}, Lcom/android/dx/Code;->coerce(Lcom/android/dx/Local;Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
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

.method public getThis(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/TypeId<",
            "TT;>;)",
            "Lcom/android/dx/Local<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/Code;->thisLocal:Lcom/android/dx/Local;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Lcom/android/dx/Code;->coerce(Lcom/android/dx/Local;Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "static methods cannot access \'this\'"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public iget(Lcom/android/dx/FieldId;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/FieldId<",
            "TD;+TV;>;",
            "Lcom/android/dx/Local<",
            "TV;>;",
            "Lcom/android/dx/Local<",
            "TD;>;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 2
    .line 3
    iget-object v0, p2, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opGetField(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-static {p3}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 22
    .line 23
    iget-object v5, p1, Lcom/android/dx/FieldId;->constant:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 24
    .line 25
    move-object v0, v6

    .line 26
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v6}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    invoke-direct {p0, p2, p1}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method initializeLocals()V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/Code;->localsInitialized:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/android/dx/Code;->localsInitialized:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/android/dx/Code;->locals:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lcom/android/dx/Local;

    .line 27
    .line 28
    invoke-virtual {v3, v2}, Lcom/android/dx/Local;->initialize(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    add-int/2addr v2, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lcom/android/dx/Code;->parameters:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    move v4, v2

    .line 46
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lcom/android/dx/Local;

    .line 57
    .line 58
    sub-int v6, v4, v2

    .line 59
    .line 60
    invoke-static {v6}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-virtual {v5, v4}, Lcom/android/dx/Local;->initialize(I)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    add-int/2addr v4, v6

    .line 69
    new-instance v6, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 70
    .line 71
    iget-object v7, v5, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 72
    .line 73
    iget-object v7, v7, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 74
    .line 75
    invoke-static {v7}, Lcom/android/dx/rop/code/Rops;->opMoveParam(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    iget-object v9, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 80
    .line 81
    invoke-virtual {v5}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    sget-object v11, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 86
    .line 87
    move-object v7, v6

    .line 88
    invoke-direct/range {v7 .. v12}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    iget-object v2, p0, Lcom/android/dx/Code;->labels:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lcom/android/dx/Label;

    .line 102
    .line 103
    iget-object v2, v2, Lcom/android/dx/Label;->instructions:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v2, v1, v0}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 112
    .line 113
    .line 114
    throw v0
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
.end method

.method public instanceOfType(Lcom/android/dx/Local;Lcom/android/dx/Local;Lcom/android/dx/TypeId;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;",
            "Lcom/android/dx/Local<",
            "*>;",
            "Lcom/android/dx/TypeId<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/code/Rops;->INSTANCE_OF:Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    iget-object v5, p3, Lcom/android/dx/TypeId;->constant:Lcom/android/dx/rop/cst/CstType;

    .line 18
    .line 19
    move-object v0, v6

    .line 20
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v6}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 24
    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 28
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
.end method

.method public varargs invokeDirect(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/MethodId<",
            "TD;TR;>;",
            "Lcom/android/dx/Local<",
            "-TR;>;",
            "Lcom/android/dx/Local<",
            "+TD;>;[",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/dx/MethodId;->prototype(Z)Lcom/android/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opInvokeDirect(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/code/Rop;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/android/dx/Code;->invoke(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    return-void
.end method

.method public varargs invokeInterface(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/MethodId<",
            "TD;TR;>;",
            "Lcom/android/dx/Local<",
            "-TR;>;",
            "Lcom/android/dx/Local<",
            "+TD;>;[",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/dx/MethodId;->prototype(Z)Lcom/android/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opInvokeInterface(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/code/Rop;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/android/dx/Code;->invoke(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    return-void
.end method

.method public varargs invokeStatic(Lcom/android/dx/MethodId;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/MethodId<",
            "*TR;>;",
            "Lcom/android/dx/Local<",
            "-TR;>;[",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/dx/MethodId;->prototype(Z)Lcom/android/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opInvokeStatic(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/code/Rop;

    move-result-object v2

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/android/dx/Code;->invoke(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    return-void
.end method

.method public varargs invokeSuper(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/MethodId<",
            "TD;TR;>;",
            "Lcom/android/dx/Local<",
            "-TR;>;",
            "Lcom/android/dx/Local<",
            "+TD;>;[",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/dx/MethodId;->prototype(Z)Lcom/android/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opInvokeSuper(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/code/Rop;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/android/dx/Code;->invoke(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    return-void
.end method

.method public varargs invokeVirtual(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/MethodId<",
            "TD;TR;>;",
            "Lcom/android/dx/Local<",
            "-TR;>;",
            "Lcom/android/dx/Local<",
            "+TD;>;[",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/dx/MethodId;->prototype(Z)Lcom/android/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opInvokeVirtual(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/code/Rop;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/android/dx/Code;->invoke(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    return-void
.end method

.method public iput(Lcom/android/dx/FieldId;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/FieldId<",
            "TD;TV;>;",
            "Lcom/android/dx/Local<",
            "+TD;>;",
            "Lcom/android/dx/Local<",
            "+TV;>;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 2
    .line 3
    iget-object v0, p3, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opPutField(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p3, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 26
    .line 27
    iget-object v5, p1, Lcom/android/dx/FieldId;->constant:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 28
    .line 29
    move-object v0, v6

    .line 30
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v6}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public jump(Lcom/android/dx/Label;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/Code;->adopt(Lcom/android/dx/Label;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 5
    .line 6
    sget-object v1, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0, p1}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/Label;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public loadConstant(Lcom/android/dx/Local;Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Local<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/android/dx/rop/code/Rops;->CONST_OBJECT_NOTHROW:Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opConst(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    move-object v2, v0

    .line 15
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v7, 0x1

    .line 20
    if-ne v0, v7, :cond_1

    .line 21
    .line 22
    new-instance v0, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    sget-object v5, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 31
    .line 32
    invoke-static {p2}, Lcom/android/dx/Constants;->getConstant(Ljava/lang/Object;)Lcom/android/dx/rop/cst/TypedConstant;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    move-object v1, v0

    .line 37
    invoke-direct/range {v1 .. v6}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance v0, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 45
    .line 46
    iget-object v3, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 47
    .line 48
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 49
    .line 50
    iget-object v5, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 51
    .line 52
    invoke-static {p2}, Lcom/android/dx/Constants;->getConstant(Ljava/lang/Object;)Lcom/android/dx/rop/cst/TypedConstant;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    move-object v1, v0

    .line 57
    invoke-direct/range {v1 .. v6}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, p1, v7}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 64
    .line 65
    .line 66
    :goto_1
    return-void
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

.method public mark(Lcom/android/dx/Label;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/Code;->adopt(Lcom/android/dx/Label;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lcom/android/dx/Label;->marked:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p1, Lcom/android/dx/Label;->marked:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/android/dx/Code;->jump(Lcom/android/dx/Label;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-object p1, p0, Lcom/android/dx/Code;->currentLabel:Lcom/android/dx/Label;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "already marked"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

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

.method public monitorEnter(Lcom/android/dx/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/code/Rops;->MONITOR_ENTER:Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v3, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1, v3}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
.end method

.method public monitorExit(Lcom/android/dx/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/code/Rops;->MONITOR_EXIT:Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v3, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1, v3}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
.end method

.method public move(Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Local<",
            "TT;>;",
            "Lcom/android/dx/Local<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 2
    .line 3
    iget-object v1, p2, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/android/dx/rop/code/Rops;->opMove(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-direct {v0, v1, v2, p1, p2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public moveException(Lcom/android/dx/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/type/Type;->THROWABLE:Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/android/dx/rop/code/Rops;->opMoveException(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v3, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1, v3}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
.end method

.method public newArray(Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Local<",
            "TT;>;",
            "Lcom/android/dx/Local<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opNewArray(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 22
    .line 23
    iget-object p2, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 24
    .line 25
    iget-object v5, p2, Lcom/android/dx/TypeId;->constant:Lcom/android/dx/rop/cst/CstType;

    .line 26
    .line 27
    move-object v0, v6

    .line 28
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v6}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public varargs newInstance(Lcom/android/dx/Local;Lcom/android/dx/MethodId;[Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Local<",
            "TT;>;",
            "Lcom/android/dx/MethodId<",
            "TT;",
            "Ljava/lang/Void;",
            ">;[",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v6, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 4
    .line 5
    sget-object v1, Lcom/android/dx/rop/code/Rops;->NEW_INSTANCE:Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    sget-object v3, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 10
    .line 11
    iget-object v4, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 12
    .line 13
    iget-object v0, p2, Lcom/android/dx/MethodId;->declaringType:Lcom/android/dx/TypeId;

    .line 14
    .line 15
    iget-object v5, v0, Lcom/android/dx/TypeId;->constant:Lcom/android/dx/rop/cst/CstType;

    .line 16
    .line 17
    move-object v0, v6

    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v6}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p0, p1, v0}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, p2, v0, p1, p3}, Lcom/android/dx/Code;->invokeDirect(Lcom/android/dx/MethodId;Lcom/android/dx/Local;Lcom/android/dx/Local;[Lcom/android/dx/Local;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1
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

.method public newLocal(Lcom/android/dx/TypeId;)Lcom/android/dx/Local;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/TypeId<",
            "TT;>;)",
            "Lcom/android/dx/Local<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/Code;->localsInitialized:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1}, Lcom/android/dx/Local;->get(Lcom/android/dx/Code;Lcom/android/dx/TypeId;)Lcom/android/dx/Local;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcom/android/dx/Code;->locals:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "Cannot allocate locals after adding instructions"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
    .line 23
    .line 24
.end method

.method public op(Lcom/android/dx/BinaryOp;Lcom/android/dx/Local;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/BinaryOp;",
            "Lcom/android/dx/Local<",
            "TT1;>;",
            "Lcom/android/dx/Local<",
            "TT1;>;",
            "Lcom/android/dx/Local<",
            "TT2;>;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p3, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    iget-object v1, p4, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    iget-object v1, v1, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    invoke-static {v0, v1}, Lcom/android/dx/rop/type/StdTypeList;->make(Lcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/StdTypeList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/dx/BinaryOp;->rop(Lcom/android/dx/rop/type/TypeList;)Lcom/android/dx/rop/code/Rop;

    move-result-object p1

    .line 5
    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-virtual {p4}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object p3

    .line 6
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    move-result p4

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    .line 7
    new-instance p4, Lcom/android/dx/rop/code/PlainInsn;

    iget-object v0, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-direct {p4, p1, v0, p2, p3}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, p4}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    goto :goto_0

    .line 8
    :cond_0
    new-instance p4, Lcom/android/dx/rop/code/ThrowingInsn;

    iget-object v1, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    iget-object v2, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    invoke-direct {p4, p1, v1, p3, v2}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    invoke-direct {p0, p4}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 9
    invoke-direct {p0, p2, v0}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    :goto_0
    return-void
.end method

.method public op(Lcom/android/dx/UnaryOp;Lcom/android/dx/Local;Lcom/android/dx/Local;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/UnaryOp;",
            "Lcom/android/dx/Local<",
            "TT;>;",
            "Lcom/android/dx/Local<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    iget-object v1, p3, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    invoke-virtual {p1, v1}, Lcom/android/dx/UnaryOp;->rop(Lcom/android/dx/TypeId;)Lcom/android/dx/rop/code/Rop;

    move-result-object p1

    iget-object v1, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p3}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-direct {v0, p1, v1, p2, p3}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    return-void
.end method

.method paramSize()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/Code;->parameters:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/android/dx/Local;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/android/dx/Local;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return v1
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

.method public removeCatchClause(Lcom/android/dx/TypeId;)Lcom/android/dx/Label;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/TypeId<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lcom/android/dx/Label;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/dx/Code;->catchTypes:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/android/dx/Code;->catchTypes:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/android/dx/Code;->catchTypes:Ljava/util/List;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/android/dx/Code;->toTypeList(Ljava/util/List;)Lcom/android/dx/rop/type/StdTypeList;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/android/dx/Code;->catchLabels:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcom/android/dx/Label;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "No catch clause: "

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
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

.method public returnValue(Lcom/android/dx/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/Code;->method:Lcom/android/dx/MethodId;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/android/dx/MethodId;->returnType:Lcom/android/dx/TypeId;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 14
    .line 15
    iget-object v1, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/android/dx/rop/code/Rops;->opReturn(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "declared "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Lcom/android/dx/Code;->method:Lcom/android/dx/MethodId;

    .line 54
    .line 55
    iget-object v2, v2, Lcom/android/dx/MethodId;->returnType:Lcom/android/dx/TypeId;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, " but returned "

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object p1, p1, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 66
    .line 67
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0
    .line 78
.end method

.method public returnVoid()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/Code;->method:Lcom/android/dx/MethodId;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/android/dx/MethodId;->returnType:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    sget-object v1, Lcom/android/dx/TypeId;->VOID:Lcom/android/dx/TypeId;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 14
    .line 15
    sget-object v1, Lcom/android/dx/rop/code/Rops;->RETURN_VOID:Lcom/android/dx/rop/code/Rop;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, "declared "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/android/dx/Code;->method:Lcom/android/dx/MethodId;

    .line 42
    .line 43
    iget-object v2, v2, Lcom/android/dx/MethodId;->returnType:Lcom/android/dx/TypeId;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, " but returned void"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0
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

.method public sget(Lcom/android/dx/FieldId;Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/FieldId<",
            "*+TV;>;",
            "Lcom/android/dx/Local<",
            "TV;>;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 2
    .line 3
    iget-object v0, p2, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opGetStatic(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    sget-object v3, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 14
    .line 15
    iget-object v4, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    iget-object v5, p1, Lcom/android/dx/FieldId;->constant:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 18
    .line 19
    move-object v0, v6

    .line 20
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v6}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    invoke-direct {p0, p2, p1}, Lcom/android/dx/Code;->moveResult(Lcom/android/dx/Local;Z)V

    .line 28
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
.end method

.method public sput(Lcom/android/dx/FieldId;Lcom/android/dx/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/FieldId<",
            "*TV;>;",
            "Lcom/android/dx/Local<",
            "+TV;>;)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 2
    .line 3
    iget-object v0, p2, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opPutStatic(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p2}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 22
    .line 23
    iget-object v5, p1, Lcom/android/dx/FieldId;->constant:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 24
    .line 25
    move-object v0, v6

    .line 26
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v6}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method public throwValue(Lcom/android/dx/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Local<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/rop/code/Rops;->THROW:Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/Code;->sourcePosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/dx/Local;->spec()Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v3, p0, Lcom/android/dx/Code;->catches:Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1, v3}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/android/dx/Code;->addInstruction(Lcom/android/dx/rop/code/Insn;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
.end method

.method toBasicBlocks()Lcom/android/dx/rop/code/BasicBlockList;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/Code;->localsInitialized:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/Code;->initializeLocals()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/android/dx/Code;->cleanUpLabels()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/android/dx/rop/code/BasicBlockList;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/android/dx/Code;->labels:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-direct {v0, v1}, Lcom/android/dx/rop/code/BasicBlockList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    iget-object v2, p0, Lcom/android/dx/Code;->labels:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-ge v1, v2, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Lcom/android/dx/Code;->labels:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lcom/android/dx/Label;

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/android/dx/Label;->toBasicBlock()Lcom/android/dx/rop/code/BasicBlock;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v1, v2}, Lcom/android/dx/rop/code/BasicBlockList;->set(ILcom/android/dx/rop/code/BasicBlock;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return-object v0
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
