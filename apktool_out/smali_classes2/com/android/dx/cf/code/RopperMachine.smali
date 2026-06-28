.class final Lcom/android/dx/cf/code/RopperMachine;
.super Lcom/android/dx/cf/code/ValueAwareMachine;
.source "SourceFile"


# static fields
.field private static final ARRAY_REFLECT_TYPE:Lcom/android/dx/rop/cst/CstType;

.field private static final MULTIANEWARRAY_METHOD:Lcom/android/dx/rop/cst/CstMethodRef;


# instance fields
.field private final advice:Lcom/android/dx/rop/code/TranslationAdvice;

.field private blockCanThrow:Z

.field private catches:Lcom/android/dx/rop/type/TypeList;

.field private catchesUsed:Z

.field private extraBlockCount:I

.field private hasJsr:Z

.field private final insns:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/Insn;",
            ">;"
        }
    .end annotation
.end field

.field private final maxLocals:I

.field private final method:Lcom/android/dx/cf/code/ConcreteMethod;

.field private final methods:Lcom/android/dx/cf/iface/MethodList;

.field private primarySuccessorIndex:I

.field private returnAddress:Lcom/android/dx/cf/code/ReturnAddress;

.field private returnOp:Lcom/android/dx/rop/code/Rop;

.field private returnPosition:Lcom/android/dx/rop/code/SourcePosition;

.field private returns:Z

.field private final ropper:Lcom/android/dx/cf/code/Ropper;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    const-string v1, "java/lang/reflect/Array"

    .line 4
    .line 5
    invoke-static {v1}, Lcom/android/dx/rop/type/Type;->internClassName(Ljava/lang/String;)Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/android/dx/cf/code/RopperMachine;->ARRAY_REFLECT_TYPE:Lcom/android/dx/rop/cst/CstType;

    .line 13
    .line 14
    new-instance v1, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 15
    .line 16
    new-instance v2, Lcom/android/dx/rop/cst/CstNat;

    .line 17
    .line 18
    new-instance v3, Lcom/android/dx/rop/cst/CstString;

    .line 19
    .line 20
    const-string v4, "newInstance"

    .line 21
    .line 22
    invoke-direct {v3, v4}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lcom/android/dx/rop/cst/CstString;

    .line 26
    .line 27
    const-string v5, "(Ljava/lang/Class;[I)Ljava/lang/Object;"

    .line 28
    .line 29
    invoke-direct {v4, v5}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v3, v4}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lcom/android/dx/cf/code/RopperMachine;->MULTIANEWARRAY_METHOD:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 39
    .line 40
    return-void
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

.method public constructor <init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/ValueAwareMachine;-><init>(Lcom/android/dx/rop/type/Prototype;)V

    .line 6
    .line 7
    .line 8
    if-eqz p4, :cond_2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->ropper:Lcom/android/dx/cf/code/Ropper;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/android/dx/cf/code/RopperMachine;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 17
    .line 18
    iput-object p4, p0, Lcom/android/dx/cf/code/RopperMachine;->methods:Lcom/android/dx/cf/iface/MethodList;

    .line 19
    .line 20
    iput-object p3, p0, Lcom/android/dx/cf/code/RopperMachine;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getMaxLocals()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lcom/android/dx/cf/code/RopperMachine;->maxLocals:I

    .line 27
    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    const/16 p2, 0x19

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    iput-boolean p2, p0, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    .line 42
    .line 43
    iput-boolean p2, p0, Lcom/android/dx/cf/code/RopperMachine;->returns:Z

    .line 44
    .line 45
    const/4 p3, -0x1

    .line 46
    iput p3, p0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 47
    .line 48
    iput p2, p0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 49
    .line 50
    iput-boolean p2, p0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    .line 51
    .line 52
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 58
    .line 59
    const-string p2, "advice == null"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 66
    .line 67
    const-string p2, "ropper == null"

    .line 68
    .line 69
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 74
    .line 75
    const-string p2, "methods == null"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
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

.method private getSources(II)Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->argCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/code/BaseMachine;->getLocalIndex()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-ltz v1, :cond_1

    .line 17
    .line 18
    new-instance p1, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 19
    .line 20
    invoke-direct {p1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {v1, p2}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, v3, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    new-instance v1, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    move v4, v3

    .line 41
    :goto_0
    if-ge v4, v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v4}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {p2, v5}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v1, v4, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    add-int/2addr p2, v5

    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/16 p2, 0x4f

    .line 63
    .line 64
    const-string v4, "shouldn\'t happen"

    .line 65
    .line 66
    const/4 v5, 0x2

    .line 67
    if-eq p1, p2, :cond_5

    .line 68
    .line 69
    const/16 p2, 0xb5

    .line 70
    .line 71
    if-eq p1, p2, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    if-ne v0, v5, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {v1, v3, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    .line 92
    .line 93
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_5
    const/4 p1, 0x3

    .line 98
    if-ne v0, p1, :cond_6

    .line 99
    .line 100
    invoke-virtual {v1, v3}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {v1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {v1, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v1, v3, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v5, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    move-object p1, v1

    .line 122
    :goto_2
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    .line 127
    .line 128
    invoke-direct {p1, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1
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

.method private jopToRopOpcode(ILcom/android/dx/rop/cst/Constant;)I
    .locals 3

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    const/16 v0, 0x14

    .line 4
    .line 5
    if-eq p1, v0, :cond_a

    .line 6
    .line 7
    const/16 v1, 0x15

    .line 8
    .line 9
    if-eq p1, v1, :cond_9

    .line 10
    .line 11
    const/16 v2, 0xab

    .line 12
    .line 13
    if-eq p1, v2, :cond_8

    .line 14
    .line 15
    const/16 v2, 0xac

    .line 16
    .line 17
    if-eq p1, v2, :cond_7

    .line 18
    .line 19
    const/16 v2, 0xc6

    .line 20
    .line 21
    if-eq p1, v2, :cond_6

    .line 22
    .line 23
    const/16 v2, 0xc7

    .line 24
    .line 25
    if-eq p1, v2, :cond_5

    .line 26
    .line 27
    sparse-switch p1, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    packed-switch p1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    const/16 v0, 0x34

    .line 34
    .line 35
    packed-switch p1, :pswitch_data_1

    .line 36
    .line 37
    .line 38
    new-instance p1, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    const-string p2, "shouldn\'t happen"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :pswitch_0
    const/16 p1, 0x25

    .line 47
    .line 48
    return p1

    .line 49
    :pswitch_1
    const/16 p1, 0x24

    .line 50
    .line 51
    return p1

    .line 52
    :pswitch_2
    const/16 p1, 0x2c

    .line 53
    .line 54
    return p1

    .line 55
    :pswitch_3
    const/16 p1, 0x2b

    .line 56
    .line 57
    return p1

    .line 58
    :pswitch_4
    const/16 p1, 0x23

    .line 59
    .line 60
    return p1

    .line 61
    :pswitch_5
    const/16 p1, 0x22

    .line 62
    .line 63
    return p1

    .line 64
    :pswitch_6
    const/16 p1, 0x29

    .line 65
    .line 66
    return p1

    .line 67
    :pswitch_7
    const/16 p1, 0x28

    .line 68
    .line 69
    return p1

    .line 70
    :pswitch_8
    const/16 p1, 0x3b

    .line 71
    .line 72
    return p1

    .line 73
    :pswitch_9
    const/16 p1, 0x35

    .line 74
    .line 75
    return p1

    .line 76
    :pswitch_a
    const/16 p1, 0x31

    .line 77
    .line 78
    return p1

    .line 79
    :pswitch_b
    check-cast p2, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 80
    .line 81
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isInstanceInit()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_1

    .line 86
    .line 87
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p2, p0, Lcom/android/dx/cf/code/RopperMachine;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 92
    .line 93
    invoke-virtual {p2}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p1, p2}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    const/16 p1, 0x33

    .line 105
    .line 106
    return p1

    .line 107
    :cond_1
    :goto_0
    return v0

    .line 108
    :pswitch_c
    check-cast p2, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 109
    .line 110
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v1, p0, Lcom/android/dx/cf/code/RopperMachine;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 115
    .line 116
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    const/4 p1, 0x0

    .line 127
    :goto_1
    iget-object v1, p0, Lcom/android/dx/cf/code/RopperMachine;->methods:Lcom/android/dx/cf/iface/MethodList;

    .line 128
    .line 129
    invoke-interface {v1}, Lcom/android/dx/cf/iface/MethodList;->size()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-ge p1, v1, :cond_3

    .line 134
    .line 135
    iget-object v1, p0, Lcom/android/dx/cf/code/RopperMachine;->methods:Lcom/android/dx/cf/iface/MethodList;

    .line 136
    .line 137
    invoke-interface {v1, p1}, Lcom/android/dx/cf/iface/MethodList;->get(I)Lcom/android/dx/cf/iface/Method;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-interface {v1}, Lcom/android/dx/cf/iface/Member;->getAccessFlags()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-static {v2}, Lcom/android/dx/rop/code/AccessFlags;->isPrivate(I)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_2

    .line 150
    .line 151
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-interface {v1}, Lcom/android/dx/cf/iface/Member;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v2, v1}, Lcom/android/dx/rop/cst/CstNat;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_2

    .line 164
    .line 165
    return v0

    .line 166
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isSignaturePolymorphic()Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_4

    .line 174
    .line 175
    const/16 p1, 0x3a

    .line 176
    .line 177
    return p1

    .line 178
    :cond_4
    const/16 p1, 0x32

    .line 179
    .line 180
    return p1

    .line 181
    :pswitch_d
    const/16 p1, 0x2f

    .line 182
    .line 183
    return p1

    .line 184
    :pswitch_e
    const/16 p1, 0x2d

    .line 185
    .line 186
    return p1

    .line 187
    :pswitch_f
    const/16 p1, 0x30

    .line 188
    .line 189
    return p1

    .line 190
    :pswitch_10
    const/16 p1, 0x2e

    .line 191
    .line 192
    return p1

    .line 193
    :pswitch_11
    const/4 p1, 0x6

    .line 194
    return p1

    .line 195
    :pswitch_12
    const/16 p1, 0xb

    .line 196
    .line 197
    return p1

    .line 198
    :pswitch_13
    const/16 p1, 0xc

    .line 199
    .line 200
    return p1

    .line 201
    :pswitch_14
    const/16 p1, 0xa

    .line 202
    .line 203
    return p1

    .line 204
    :pswitch_15
    const/16 p1, 0x9

    .line 205
    .line 206
    return p1

    .line 207
    :pswitch_16
    const/16 p1, 0x1c

    .line 208
    .line 209
    return p1

    .line 210
    :pswitch_17
    const/16 p1, 0x1b

    .line 211
    .line 212
    return p1

    .line 213
    :pswitch_18
    const/16 p1, 0x20

    .line 214
    .line 215
    return p1

    .line 216
    :pswitch_19
    const/16 p1, 0x1f

    .line 217
    .line 218
    return p1

    .line 219
    :pswitch_1a
    const/16 p1, 0x1e

    .line 220
    .line 221
    return p1

    .line 222
    :pswitch_1b
    const/16 p1, 0x1d

    .line 223
    .line 224
    return p1

    .line 225
    :sswitch_0
    const/16 p1, 0x16

    .line 226
    .line 227
    return p1

    .line 228
    :sswitch_1
    return v1

    .line 229
    :sswitch_2
    return v0

    .line 230
    :sswitch_3
    const/16 p1, 0x19

    .line 231
    .line 232
    return p1

    .line 233
    :sswitch_4
    const/16 p1, 0x18

    .line 234
    .line 235
    return p1

    .line 236
    :sswitch_5
    const/16 p1, 0x17

    .line 237
    .line 238
    return p1

    .line 239
    :sswitch_6
    const/16 p1, 0x13

    .line 240
    .line 241
    return p1

    .line 242
    :sswitch_7
    const/16 p1, 0x12

    .line 243
    .line 244
    return p1

    .line 245
    :sswitch_8
    const/16 p1, 0x11

    .line 246
    .line 247
    return p1

    .line 248
    :sswitch_9
    const/16 p1, 0x10

    .line 249
    .line 250
    return p1

    .line 251
    :sswitch_a
    const/16 p1, 0xf

    .line 252
    .line 253
    return p1

    .line 254
    :pswitch_1c
    :sswitch_b
    const/16 p1, 0xe

    .line 255
    .line 256
    return p1

    .line 257
    :sswitch_c
    const/16 p1, 0x27

    .line 258
    .line 259
    return p1

    .line 260
    :sswitch_d
    const/16 p1, 0x26

    .line 261
    .line 262
    return p1

    .line 263
    :cond_5
    :pswitch_1d
    const/16 p1, 0x8

    .line 264
    .line 265
    return p1

    .line 266
    :cond_6
    :pswitch_1e
    const/4 p1, 0x7

    .line 267
    return p1

    .line 268
    :cond_7
    :pswitch_1f
    const/16 p1, 0x21

    .line 269
    .line 270
    return p1

    .line 271
    :cond_8
    const/16 p1, 0xd

    .line 272
    .line 273
    return p1

    .line 274
    :cond_9
    :sswitch_e
    const/4 p1, 0x2

    .line 275
    return p1

    .line 276
    :cond_a
    :sswitch_f
    const/4 p1, 0x5

    .line 277
    return p1

    .line 278
    :cond_b
    :sswitch_10
    const/4 p1, 0x1

    .line 279
    return p1

    .line 280
    nop

    .line 281
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_10
        0x12 -> :sswitch_f
        0x2e -> :sswitch_d
        0x36 -> :sswitch_e
        0x4f -> :sswitch_c
        0x60 -> :sswitch_b
        0x64 -> :sswitch_a
        0x68 -> :sswitch_9
        0x6c -> :sswitch_8
        0x70 -> :sswitch_7
        0x74 -> :sswitch_6
        0x78 -> :sswitch_5
        0x7a -> :sswitch_4
        0x7c -> :sswitch_3
        0x7e -> :sswitch_2
        0x80 -> :sswitch_1
        0x82 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x84
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_17
        :pswitch_16
        :pswitch_1e
        :pswitch_1d
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_1e
        :pswitch_1d
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_1e
        :pswitch_1d
        :pswitch_11
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0xb1
        :pswitch_1f
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method private makeInvokePolymorphicInsn(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Insn;
    .locals 6

    .line 1
    move-object v5, p5

    .line 2
    check-cast v5, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 3
    .line 4
    new-instance p5, Lcom/android/dx/rop/code/InvokePolymorphicInsn;

    .line 5
    .line 6
    move-object v0, p5

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstMethodRef;)V

    .line 12
    .line 13
    .line 14
    return-object p5
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

.method private updateReturnOp(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-ne v0, p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/android/dx/rop/code/SourcePosition;->getLine()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/android/dx/rop/code/SourcePosition;->getLine()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-le p1, v0, :cond_1

    .line 27
    .line 28
    iput-object p2, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void

    .line 31
    :cond_2
    new-instance p2, Lcom/android/dx/cf/code/SimException;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v1, "return op mismatch: "

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
    const-string p1, ", "

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p2, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p2

    .line 64
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 65
    .line 66
    const-string p2, "pos == null"

    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 73
    .line 74
    const-string p2, "op == null"

    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
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


# virtual methods
.method public canThrow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    return v0
.end method

.method public getExtraBlockCount()I
    .locals 1

    iget v0, p0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    return v0
.end method

.method public getInsns()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/Insn;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getPrimarySuccessorIndex()I
    .locals 1

    iget v0, p0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    return v0
.end method

.method public getReturnAddress()Lcom/android/dx/cf/code/ReturnAddress;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnAddress:Lcom/android/dx/cf/code/ReturnAddress;

    return-object v0
.end method

.method public getReturnOp()Lcom/android/dx/rop/code/Rop;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnOp:Lcom/android/dx/rop/code/Rop;

    return-object v0
.end method

.method public getReturnPosition()Lcom/android/dx/rop/code/SourcePosition;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnPosition:Lcom/android/dx/rop/code/SourcePosition;

    return-object v0
.end method

.method public hasJsr()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/dx/cf/code/RopperMachine;->hasJsr:Z

    return v0
.end method

.method public hasRet()Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returnAddress:Lcom/android/dx/cf/code/ReturnAddress;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public returns()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/dx/cf/code/RopperMachine;->returns:Z

    return v0
.end method

.method public run(Lcom/android/dx/cf/code/Frame;II)V
    .locals 20

    move-object/from16 v7, p0

    move/from16 v0, p3

    .line 1
    iget v1, v7, Lcom/android/dx/cf/code/RopperMachine;->maxLocals:I

    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/dx/cf/code/ExecutionStack;->size()I

    move-result v2

    add-int/2addr v1, v2

    .line 2
    invoke-direct {v7, v0, v1}, Lcom/android/dx/cf/code/RopperMachine;->getSources(II)Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v11

    .line 3
    invoke-virtual {v11}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v2

    .line 4
    invoke-super/range {p0 .. p3}, Lcom/android/dx/cf/code/ValueAwareMachine;->run(Lcom/android/dx/cf/code/Frame;II)V

    .line 5
    iget-object v3, v7, Lcom/android/dx/cf/code/RopperMachine;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    move/from16 v4, p2

    invoke-virtual {v3, v4}, Lcom/android/dx/cf/code/ConcreteMethod;->makeSourcePosistion(I)Lcom/android/dx/rop/code/SourcePosition;

    move-result-object v6

    const/16 v3, 0x36

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v0, v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    .line 6
    :goto_0
    invoke-virtual {v7, v3}, Lcom/android/dx/cf/code/BaseMachine;->getLocalTarget(Z)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v3

    .line 7
    invoke-virtual/range {p0 .. p0}, Lcom/android/dx/cf/code/BaseMachine;->resultCount()I

    move-result v8

    if-nez v8, :cond_2

    const/16 v1, 0x57

    if-eq v0, v1, :cond_1

    const/16 v1, 0x58

    if-eq v0, v1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    if-ne v8, v5, :cond_1e

    .line 8
    invoke-virtual {v7, v4}, Lcom/android/dx/cf/code/BaseMachine;->result(I)Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_4

    move-object v1, v3

    goto :goto_2

    .line 9
    :cond_4
    sget-object v1, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 10
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCst()Lcom/android/dx/rop/cst/Constant;

    move-result-object v14

    const/16 v8, 0xc5

    if-ne v0, v8, :cond_7

    .line 11
    iput-boolean v5, v7, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    const/4 v0, 0x6

    .line 12
    iput v0, v7, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 13
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getNextReg()I

    move-result v0

    sget-object v13, Lcom/android/dx/rop/type/Type;->INT_ARRAY:Lcom/android/dx/rop/type/Type;

    invoke-static {v0, v13}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 14
    invoke-static {v13, v2}, Lcom/android/dx/rop/code/Rops;->opFilledNewArray(Lcom/android/dx/rop/type/TypeBearer;I)Lcom/android/dx/rop/code/Rop;

    move-result-object v9

    .line 15
    new-instance v12, Lcom/android/dx/rop/code/ThrowingCstInsn;

    iget-object v10, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    sget-object v16, Lcom/android/dx/rop/cst/CstType;->INT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    move-object v8, v12

    move-object/from16 v17, v10

    move-object v10, v6

    move-object v15, v12

    move-object/from16 v12, v17

    move-object/from16 v17, v13

    move-object/from16 v13, v16

    invoke-direct/range {v8 .. v13}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 16
    iget-object v8, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-static/range {v17 .. v17}, Lcom/android/dx/rop/code/Rops;->opMoveResult(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    move-result-object v8

    .line 18
    new-instance v9, Lcom/android/dx/rop/code/PlainInsn;

    sget-object v10, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    invoke-direct {v9, v8, v6, v0, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 19
    iget-object v8, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    move-object v8, v14

    check-cast v8, Lcom/android/dx/rop/cst/CstType;

    invoke-virtual {v8}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    move-result-object v8

    move v9, v4

    :goto_3
    if-ge v9, v2, :cond_5

    .line 21
    invoke-virtual {v8}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    move-result-object v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 22
    :cond_5
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result v9

    sget-object v10, Lcom/android/dx/rop/type/Type;->CLASS:Lcom/android/dx/rop/type/Type;

    invoke-static {v9, v10}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v9

    .line 23
    invoke-virtual {v8}, Lcom/android/dx/rop/type/Type;->isPrimitive()Z

    move-result v10

    if-eqz v10, :cond_6

    .line 24
    invoke-static {v8}, Lcom/android/dx/rop/cst/CstFieldRef;->forPrimitiveType(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstFieldRef;

    move-result-object v17

    .line 25
    new-instance v8, Lcom/android/dx/rop/code/ThrowingCstInsn;

    sget-object v13, Lcom/android/dx/rop/code/Rops;->GET_STATIC_OBJECT:Lcom/android/dx/rop/code/Rop;

    sget-object v15, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    iget-object v10, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    move-object v12, v8

    move-object v11, v14

    move-object v14, v6

    move-object/from16 v16, v10

    invoke-direct/range {v12 .. v17}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    goto :goto_4

    :cond_6
    move-object v11, v14

    .line 26
    new-instance v10, Lcom/android/dx/rop/code/ThrowingCstInsn;

    sget-object v13, Lcom/android/dx/rop/code/Rops;->CONST_OBJECT:Lcom/android/dx/rop/code/Rop;

    sget-object v15, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    iget-object v14, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    new-instance v12, Lcom/android/dx/rop/cst/CstType;

    invoke-direct {v12, v8}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    move-object v8, v12

    move-object v12, v10

    move-object/from16 v16, v14

    move-object v14, v6

    move-object/from16 v17, v8

    invoke-direct/range {v12 .. v17}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    move-object v8, v10

    .line 27
    :goto_4
    iget-object v10, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    invoke-virtual {v9}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object v8

    invoke-static {v8}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    move-result-object v8

    .line 29
    new-instance v10, Lcom/android/dx/rop/code/PlainInsn;

    sget-object v15, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    invoke-direct {v10, v8, v6, v9, v15}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 30
    iget-object v8, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result v8

    sget-object v10, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    invoke-static {v8, v10}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v8

    .line 32
    new-instance v10, Lcom/android/dx/rop/code/ThrowingCstInsn;

    sget-object v18, Lcom/android/dx/cf/code/RopperMachine;->MULTIANEWARRAY_METHOD:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 33
    invoke-virtual/range {v18 .. v18}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    move-result-object v12

    invoke-static {v12}, Lcom/android/dx/rop/code/Rops;->opInvokeStatic(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/rop/code/Rop;

    move-result-object v13

    .line 34
    invoke-static {v9, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v0

    iget-object v9, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    move-object v12, v10

    move-object v14, v6

    move-object v4, v15

    move-object v15, v0

    move-object/from16 v16, v9

    move-object/from16 v17, v18

    invoke-direct/range {v12 .. v17}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 35
    iget-object v0, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-virtual/range {v18 .. v18}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    move-result-object v0

    .line 38
    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opMoveResult(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    move-result-object v0

    .line 39
    new-instance v9, Lcom/android/dx/rop/code/PlainInsn;

    invoke-direct {v9, v0, v6, v8, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 40
    iget-object v0, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    invoke-static {v8}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v0

    const/16 v4, 0xc0

    move-object/from16 v19, v11

    move-object v11, v0

    move v0, v4

    move-object/from16 v4, v19

    goto :goto_5

    :cond_7
    move-object v4, v14

    const/16 v8, 0xa8

    if-ne v0, v8, :cond_8

    .line 42
    iput-boolean v5, v7, Lcom/android/dx/cf/code/RopperMachine;->hasJsr:Z

    return-void

    :cond_8
    const/16 v8, 0xa9

    if-ne v0, v8, :cond_9

    const/4 v8, 0x0

    .line 43
    :try_start_0
    invoke-virtual {v7, v8}, Lcom/android/dx/cf/code/BaseMachine;->arg(I)Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v0

    check-cast v0, Lcom/android/dx/cf/code/ReturnAddress;

    iput-object v0, v7, Lcom/android/dx/cf/code/RopperMachine;->returnAddress:Lcom/android/dx/cf/code/ReturnAddress;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 44
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Argument to RET was not a ReturnAddress"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 45
    :cond_9
    :goto_5
    invoke-direct {v7, v0, v4}, Lcom/android/dx/cf/code/RopperMachine;->jopToRopOpcode(ILcom/android/dx/rop/cst/Constant;)I

    move-result v8

    .line 46
    invoke-static {v8, v1, v11, v4}, Lcom/android/dx/rop/code/Rops;->ropFor(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Rop;

    move-result-object v9

    if-eqz v3, :cond_b

    .line 47
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->isCallLike()Z

    move-result v10

    if-eqz v10, :cond_b

    .line 48
    iget v10, v7, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    add-int/2addr v10, v5

    iput v10, v7, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 49
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    move-result v10

    const/16 v12, 0x3b

    if-ne v10, v12, :cond_a

    .line 50
    move-object v14, v4

    check-cast v14, Lcom/android/dx/rop/cst/CstCallSiteRef;

    invoke-virtual {v14}, Lcom/android/dx/rop/cst/CstCallSiteRef;->getReturnType()Lcom/android/dx/rop/type/Type;

    move-result-object v10

    goto :goto_6

    .line 51
    :cond_a
    move-object v14, v4

    check-cast v14, Lcom/android/dx/rop/cst/CstMethodRef;

    invoke-virtual {v14}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    move-result-object v10

    invoke-virtual {v10}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    move-result-object v10

    .line 52
    :goto_6
    new-instance v15, Lcom/android/dx/rop/code/PlainInsn;

    invoke-static {v10}, Lcom/android/dx/rop/code/Rops;->opMoveResult(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    move-result-object v10

    sget-object v12, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    invoke-direct {v15, v10, v6, v3, v12}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    goto :goto_7

    :cond_b
    if-eqz v3, :cond_c

    .line 53
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->canThrow()Z

    move-result v10

    if-eqz v10, :cond_c

    .line 54
    iget v10, v7, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    add-int/2addr v10, v5

    iput v10, v7, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 55
    new-instance v15, Lcom/android/dx/rop/code/PlainInsn;

    .line 56
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v10

    invoke-static {v10}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    move-result-object v10

    sget-object v12, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    invoke-direct {v15, v10, v6, v3, v12}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    :goto_7
    move-object v10, v15

    const/4 v15, 0x0

    goto :goto_8

    :cond_c
    move-object v15, v3

    const/4 v10, 0x0

    :goto_8
    const/16 v3, 0x29

    if-ne v8, v3, :cond_d

    .line 57
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->getResult()Lcom/android/dx/rop/type/Type;

    move-result-object v1

    invoke-static {v1}, Lcom/android/dx/rop/cst/CstType;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstType;

    move-result-object v1

    move-object v13, v9

    move-object v9, v1

    goto/16 :goto_a

    :cond_d
    if-nez v4, :cond_11

    const/4 v3, 0x2

    if-ne v2, v3, :cond_11

    const/4 v2, 0x0

    .line 58
    invoke-virtual {v11, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v2

    .line 59
    invoke-virtual {v11, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v3

    .line 60
    invoke-interface {v3}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    move-result v12

    if-nez v12, :cond_e

    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    move-result v12

    if-eqz v12, :cond_11

    :cond_e
    iget-object v12, v7, Lcom/android/dx/cf/code/RopperMachine;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    const/4 v13, 0x0

    .line 61
    invoke-virtual {v11, v13}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v14

    .line 62
    invoke-virtual {v11, v5}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v13

    .line 63
    invoke-interface {v12, v9, v14, v13}, Lcom/android/dx/rop/code/TranslationAdvice;->hasConstantOperation(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Z

    move-result v12

    if-eqz v12, :cond_11

    .line 64
    invoke-interface {v3}, Lcom/android/dx/rop/type/TypeBearer;->isConstant()Z

    move-result v4

    if-eqz v4, :cond_f

    .line 65
    move-object v2, v3

    check-cast v2, Lcom/android/dx/rop/cst/Constant;

    .line 66
    invoke-virtual {v11}, Lcom/android/dx/rop/code/RegisterSpecList;->withoutLast()Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v4

    .line 67
    invoke-virtual {v9}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    move-result v9

    const/16 v11, 0xf

    if-ne v9, v11, :cond_10

    .line 68
    check-cast v3, Lcom/android/dx/rop/cst/CstInteger;

    .line 69
    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    move-result v2

    neg-int v2, v2

    invoke-static {v2}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    move-result-object v2

    const/16 v3, 0xe

    move v8, v3

    goto :goto_9

    .line 70
    :cond_f
    check-cast v2, Lcom/android/dx/rop/cst/Constant;

    .line 71
    invoke-virtual {v11}, Lcom/android/dx/rop/code/RegisterSpecList;->withoutFirst()Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v4

    .line 72
    :cond_10
    :goto_9
    invoke-static {v8, v1, v4, v2}, Lcom/android/dx/rop/code/Rops;->ropFor(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Rop;

    move-result-object v1

    move-object v13, v1

    move-object v9, v2

    move-object v11, v4

    goto :goto_a

    :cond_11
    move-object v13, v9

    move-object v9, v4

    .line 73
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxCases()Lcom/android/dx/cf/code/SwitchList;

    move-result-object v1

    .line 74
    invoke-virtual/range {p0 .. p0}, Lcom/android/dx/cf/code/BaseMachine;->getInitValues()Ljava/util/ArrayList;

    move-result-object v18

    .line 75
    invoke-virtual {v13}, Lcom/android/dx/rop/code/Rop;->canThrow()Z

    move-result v2

    .line 76
    iget-boolean v3, v7, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    or-int/2addr v3, v2

    iput-boolean v3, v7, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    if-eqz v1, :cond_13

    .line 77
    invoke-virtual {v1}, Lcom/android/dx/cf/code/SwitchList;->size()I

    move-result v0

    if-nez v0, :cond_12

    .line 78
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    sget-object v1, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    sget-object v2, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v6, v3, v2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    const/4 v1, 0x0

    .line 79
    iput v1, v7, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    goto :goto_c

    .line 80
    :cond_12
    invoke-virtual {v1}, Lcom/android/dx/cf/code/SwitchList;->getValues()Lcom/android/dx/util/IntList;

    move-result-object v0

    .line 81
    new-instance v1, Lcom/android/dx/rop/code/SwitchInsn;

    move-object v12, v1

    move-object v14, v6

    move-object/from16 v16, v11

    move-object/from16 v17, v0

    invoke-direct/range {v12 .. v17}, Lcom/android/dx/rop/code/SwitchInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/util/IntList;)V

    .line 82
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    move-result v0

    iput v0, v7, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    :goto_b
    move-object v0, v1

    :goto_c
    move v8, v5

    move-object v3, v6

    goto/16 :goto_11

    :cond_13
    const/4 v3, 0x0

    const/16 v1, 0x21

    if-ne v8, v1, :cond_16

    .line 83
    invoke-virtual {v11}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v0

    if-eqz v0, :cond_14

    const/4 v0, 0x0

    .line 84
    invoke-virtual {v11, v0}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v1

    .line 85
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v2

    .line 86
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result v4

    if-eqz v4, :cond_15

    .line 87
    iget-object v4, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    new-instance v8, Lcom/android/dx/rop/code/PlainInsn;

    invoke-static {v2}, Lcom/android/dx/rop/code/Rops;->opMove(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    move-result-object v11

    .line 88
    invoke-static {v0, v2}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-direct {v8, v11, v6, v2, v1}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 89
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_14
    const/4 v0, 0x0

    .line 90
    :cond_15
    :goto_d
    new-instance v1, Lcom/android/dx/rop/code/PlainInsn;

    sget-object v2, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    invoke-direct {v1, v2, v6, v3, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 91
    iput v0, v7, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 92
    invoke-direct {v7, v13, v6}, Lcom/android/dx/cf/code/RopperMachine;->updateReturnOp(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;)V

    .line 93
    iput-boolean v5, v7, Lcom/android/dx/cf/code/RopperMachine;->returns:Z

    goto :goto_b

    :cond_16
    if-eqz v9, :cond_19

    if-eqz v2, :cond_18

    .line 94
    invoke-virtual {v13}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_17

    .line 95
    iget-object v0, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    move-object/from16 v1, p0

    move-object v2, v13

    move-object v3, v6

    move-object v4, v11

    move v8, v5

    move-object v5, v0

    move-object v0, v6

    move-object v6, v9

    invoke-direct/range {v1 .. v6}, Lcom/android/dx/cf/code/RopperMachine;->makeInvokePolymorphicInsn(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/rop/code/Insn;

    move-result-object v1

    goto :goto_e

    :cond_17
    move v8, v5

    move-object v0, v6

    .line 96
    new-instance v1, Lcom/android/dx/rop/code/ThrowingCstInsn;

    iget-object v2, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    move-object v12, v1

    move-object v14, v0

    move-object v15, v11

    move-object/from16 v16, v2

    move-object/from16 v17, v9

    invoke-direct/range {v12 .. v17}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 97
    :goto_e
    iput-boolean v8, v7, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    .line 98
    iget-object v2, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    invoke-interface {v2}, Lcom/android/dx/rop/type/TypeList;->size()I

    move-result v2

    iput v2, v7, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    goto :goto_f

    :cond_18
    move v8, v5

    move-object v0, v6

    .line 99
    new-instance v1, Lcom/android/dx/rop/code/PlainCstInsn;

    move-object v12, v1

    move-object v14, v0

    move-object/from16 v16, v11

    move-object/from16 v17, v9

    invoke-direct/range {v12 .. v17}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    :goto_f
    move-object v3, v0

    :goto_10
    move-object v0, v1

    goto :goto_11

    :cond_19
    move v8, v5

    move-object v3, v6

    if-eqz v2, :cond_1b

    .line 100
    new-instance v1, Lcom/android/dx/rop/code/ThrowingInsn;

    iget-object v2, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    invoke-direct {v1, v13, v3, v11, v2}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 101
    iput-boolean v8, v7, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    const/16 v2, 0xbf

    if-ne v0, v2, :cond_1a

    const/4 v0, -0x1

    .line 102
    iput v0, v7, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    goto :goto_10

    .line 103
    :cond_1a
    iget-object v0, v7, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    invoke-interface {v0}, Lcom/android/dx/rop/type/TypeList;->size()I

    move-result v0

    iput v0, v7, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    goto :goto_10

    .line 104
    :cond_1b
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    invoke-direct {v0, v13, v3, v15, v11}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 105
    :goto_11
    iget-object v1, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v10, :cond_1c

    .line 106
    iget-object v0, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1c
    if-eqz v18, :cond_1d

    .line 107
    iget v0, v7, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    add-int/2addr v0, v8

    iput v0, v7, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 108
    new-instance v0, Lcom/android/dx/rop/code/FillArrayDataInsn;

    sget-object v13, Lcom/android/dx/rop/code/Rops;->FILL_ARRAY_DATA:Lcom/android/dx/rop/code/Rop;

    .line 109
    invoke-virtual {v10}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-static {v1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v15

    move-object v12, v0

    move-object v14, v3

    move-object/from16 v16, v18

    move-object/from16 v17, v9

    invoke-direct/range {v12 .. v17}, Lcom/android/dx/rop/code/FillArrayDataInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Ljava/util/ArrayList;Lcom/android/dx/rop/cst/Constant;)V

    .line 110
    iget-object v1, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1d
    return-void

    :cond_1e
    move v0, v4

    move v8, v5

    move-object v3, v6

    .line 111
    iget-object v4, v7, Lcom/android/dx/cf/code/RopperMachine;->ropper:Lcom/android/dx/cf/code/Ropper;

    invoke-virtual {v4}, Lcom/android/dx/cf/code/Ropper;->getFirstTempStackReg()I

    move-result v4

    .line 112
    new-array v5, v2, [Lcom/android/dx/rop/code/RegisterSpec;

    move/from16 v19, v4

    move v4, v0

    move/from16 v0, v19

    :goto_12
    if-ge v4, v2, :cond_1f

    .line 113
    invoke-virtual {v11, v4}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v6

    .line 114
    invoke-virtual {v6}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v9

    .line 115
    invoke-virtual {v6, v0}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v10

    .line 116
    iget-object v12, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    new-instance v13, Lcom/android/dx/rop/code/PlainInsn;

    invoke-static {v9}, Lcom/android/dx/rop/code/Rops;->opMove(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    move-result-object v9

    invoke-direct {v13, v9, v3, v10, v6}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    aput-object v10, v5, v4

    .line 118
    invoke-virtual {v6}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v6

    add-int/2addr v0, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    .line 119
    :cond_1f
    invoke-virtual/range {p0 .. p0}, Lcom/android/dx/cf/code/BaseMachine;->getAuxInt()I

    move-result v0

    :goto_13
    if-eqz v0, :cond_20

    and-int/lit8 v2, v0, 0xf

    sub-int/2addr v2, v8

    .line 120
    aget-object v2, v5, v2

    .line 121
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/android/dx/rop/type/TypeBearer;

    move-result-object v4

    .line 122
    iget-object v6, v7, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    new-instance v9, Lcom/android/dx/rop/code/PlainInsn;

    invoke-static {v4}, Lcom/android/dx/rop/code/Rops;->opMove(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    move-result-object v10

    .line 123
    invoke-virtual {v2, v1}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v11

    invoke-direct {v9, v10, v3, v11, v2}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 124
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    invoke-interface {v4}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/dx/rop/type/Type;->getCategory()I

    move-result v2

    add-int/2addr v1, v2

    shr-int/lit8 v0, v0, 0x4

    goto :goto_13

    :cond_20
    return-void
.end method

.method public startBlock(Lcom/android/dx/rop/type/TypeList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->insns:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    .line 10
    .line 11
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returns:Z

    .line 12
    .line 13
    iput p1, p0, Lcom/android/dx/cf/code/RopperMachine;->primarySuccessorIndex:I

    .line 14
    .line 15
    iput p1, p0, Lcom/android/dx/cf/code/RopperMachine;->extraBlockCount:I

    .line 16
    .line 17
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->blockCanThrow:Z

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/android/dx/cf/code/RopperMachine;->hasJsr:Z

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/android/dx/cf/code/RopperMachine;->returnAddress:Lcom/android/dx/cf/code/ReturnAddress;

    .line 23
    .line 24
    return-void
.end method

.method public wereCatchesUsed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/dx/cf/code/RopperMachine;->catchesUsed:Z

    return v0
.end method
