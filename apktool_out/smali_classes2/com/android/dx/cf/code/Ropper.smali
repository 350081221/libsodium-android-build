.class public final Lcom/android/dx/cf/code/Ropper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/Ropper$SubroutineInliner;,
        Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;,
        Lcom/android/dx/cf/code/Ropper$LabelAllocator;,
        Lcom/android/dx/cf/code/Ropper$Subroutine;,
        Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;,
        Lcom/android/dx/cf/code/Ropper$CatchInfo;
    }
.end annotation


# static fields
.field private static final PARAM_ASSIGNMENT:I = -0x1

.field private static final RETURN:I = -0x2

.field private static final SPECIAL_LABEL_COUNT:I = 0x7

.field private static final SYNCH_CATCH_1:I = -0x6

.field private static final SYNCH_CATCH_2:I = -0x7

.field private static final SYNCH_RETURN:I = -0x3

.field private static final SYNCH_SETUP_1:I = -0x4

.field private static final SYNCH_SETUP_2:I = -0x5


# instance fields
.field private final blocks:Lcom/android/dx/cf/code/ByteBlockList;

.field private final catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

.field private final exceptionSetupLabelAllocator:Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

.field private hasSubroutines:Z

.field private final machine:Lcom/android/dx/cf/code/RopperMachine;

.field private final maxLabel:I

.field private final maxLocals:I

.field private final method:Lcom/android/dx/cf/code/ConcreteMethod;

.field private final result:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/BasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private final resultSubroutines:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/util/IntList;",
            ">;"
        }
    .end annotation
.end field

.field private final sim:Lcom/android/dx/cf/code/Simulator;

.field private final startFrames:[Lcom/android/dx/cf/code/Frame;

.field private final subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

.field private synchNeedsExceptionHandler:Z


# direct methods
.method private constructor <init>(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)V
    .locals 4

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
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/android/dx/cf/code/BasicBlocker;->identifyBlocks(Lcom/android/dx/cf/code/ConcreteMethod;)Lcom/android/dx/cf/code/ByteBlockList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/android/dx/cf/code/Ropper;->blocks:Lcom/android/dx/cf/code/ByteBlockList;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/android/dx/util/LabeledList;->getMaxLabel()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iput v1, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getMaxLocals()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iput v2, p0, Lcom/android/dx/cf/code/Ropper;->maxLocals:I

    .line 27
    .line 28
    new-instance v3, Lcom/android/dx/cf/code/RopperMachine;

    .line 29
    .line 30
    invoke-direct {v3, p0, p1, p2, p3}, Lcom/android/dx/cf/code/RopperMachine;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;)V

    .line 31
    .line 32
    .line 33
    iput-object v3, p0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 34
    .line 35
    new-instance p2, Lcom/android/dx/cf/code/Simulator;

    .line 36
    .line 37
    invoke-direct {p2, v3, p1, p4}, Lcom/android/dx/cf/code/Simulator;-><init>(Lcom/android/dx/cf/code/Machine;Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/dex/DexOptions;)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper;->sim:Lcom/android/dx/cf/code/Simulator;

    .line 41
    .line 42
    new-array p2, v1, [Lcom/android/dx/cf/code/Frame;

    .line 43
    .line 44
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 45
    .line 46
    new-array p3, v1, [Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 47
    .line 48
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 49
    .line 50
    new-instance p3, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 53
    .line 54
    .line 55
    move-result p4

    .line 56
    mul-int/lit8 p4, p4, 0x2

    .line 57
    .line 58
    add-int/lit8 p4, p4, 0xa

    .line 59
    .line 60
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance p3, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    mul-int/lit8 p4, p4, 0x2

    .line 72
    .line 73
    add-int/lit8 p4, p4, 0xa

    .line 74
    .line 75
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 79
    .line 80
    new-array p3, v1, [Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 81
    .line 82
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 83
    .line 84
    const/4 p3, 0x0

    .line 85
    iput-boolean p3, p0, Lcom/android/dx/cf/code/Ropper;->synchNeedsExceptionHandler:Z

    .line 86
    .line 87
    new-instance p4, Lcom/android/dx/cf/code/Frame;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getMaxStack()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-direct {p4, v2, p1}, Lcom/android/dx/cf/code/Frame;-><init>(II)V

    .line 94
    .line 95
    .line 96
    aput-object p4, p2, p3

    .line 97
    .line 98
    new-instance p1, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;-><init>(Lcom/android/dx/cf/code/Ropper;)V

    .line 101
    .line 102
    .line 103
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper;->exceptionSetupLabelAllocator:Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 107
    .line 108
    const-string p2, "advice == null"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 115
    .line 116
    const-string p2, "method == null"

    .line 117
    .line 118
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

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
.end method

.method static synthetic access$000(Lcom/android/dx/cf/code/Ropper;)Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->exceptionSetupLabelAllocator:Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

    return-object p0
.end method

.method static synthetic access$100(Lcom/android/dx/cf/code/Ropper;)I
    .locals 0

    iget p0, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    return p0
.end method

.method static synthetic access$1100(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/InsnList;)Lcom/android/dx/rop/code/InsnList;
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->filterMoveReturnAddressInsns(Lcom/android/dx/rop/code/InsnList;)Lcom/android/dx/rop/code/InsnList;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1200(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    return-void
.end method

.method static synthetic access$202(Lcom/android/dx/cf/code/Ropper;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/android/dx/cf/code/Ropper;->hasSubroutines:Z

    return p1
.end method

.method static synthetic access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/android/dx/cf/code/Ropper;IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/android/dx/cf/code/Ropper;->mergeAndWorkAsNecessary(IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V

    return-void
.end method

.method static synthetic access$600(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->isSubroutineCaller(Lcom/android/dx/rop/code/BasicBlock;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$700(Lcom/android/dx/cf/code/Ropper;)Lcom/android/dx/cf/code/ConcreteMethod;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    return-object p0
.end method

.method static synthetic access$800(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/Ropper;->addOrReplaceBlockNoDelete(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$900(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/cf/code/Ropper$Subroutine;
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->subroutineFromRetBlock(I)Lcom/android/dx/cf/code/Ropper$Subroutine;

    move-result-object p0

    return-object p0
.end method

.method private addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 18
    .line 19
    const-string p2, "block == null"

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1
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

.method private addExceptionSetupBlocks()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 9
    .line 10
    aget-object v3, v3, v2

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v3}, Lcom/android/dx/cf/code/Ropper$CatchInfo;->getSetups()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;

    .line 33
    .line 34
    invoke-direct {p0, v2}, Lcom/android/dx/cf/code/Ropper;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, Lcom/android/dx/rop/code/BasicBlock;->getFirstInsn()Lcom/android/dx/rop/code/Insn;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-instance v6, Lcom/android/dx/rop/code/InsnList;

    .line 47
    .line 48
    const/4 v7, 0x2

    .line 49
    invoke-direct {v6, v7}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-instance v7, Lcom/android/dx/rop/code/PlainInsn;

    .line 53
    .line 54
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->getCaughtType()Lcom/android/dx/rop/type/Type;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-static {v8}, Lcom/android/dx/rop/code/Rops;->opMoveException(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iget v9, p0, Lcom/android/dx/cf/code/Ropper;->maxLocals:I

    .line 63
    .line 64
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->getCaughtType()Lcom/android/dx/rop/type/Type;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-static {v9, v10}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    sget-object v10, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 73
    .line 74
    invoke-direct {v7, v8, v5, v9, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v1, v7}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 78
    .line 79
    .line 80
    new-instance v7, Lcom/android/dx/rop/code/PlainInsn;

    .line 81
    .line 82
    sget-object v8, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    invoke-direct {v7, v8, v5, v9, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 86
    .line 87
    .line 88
    const/4 v5, 0x1

    .line 89
    invoke-virtual {v6, v5, v7}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lcom/android/dx/rop/code/BasicBlock;

    .line 96
    .line 97
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->getLabel()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-static {v2}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-direct {v5, v4, v6, v7, v2}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 106
    .line 107
    .line 108
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 109
    .line 110
    aget-object v4, v4, v2

    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Frame;->getSubroutines()Lcom/android/dx/util/IntList;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-direct {p0, v5, v4}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    return-void
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

.method private addOrReplaceBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/Ropper;->removeBlockAndSpecialSuccessors(I)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    :goto_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return v0

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 34
    .line 35
    const-string p2, "block == null"

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
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

.method private addOrReplaceBlockNoDelete(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    :goto_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return v0

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 41
    .line 42
    const-string p2, "block == null"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
    .line 48
    .line 49
    .line 50
.end method

.method private addReturnBlock()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/RopperMachine;->getReturnOp()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->getReturnPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, -0x2

    .line 17
    invoke-direct {p0, v2}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isSynchronized()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x0

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    new-instance v3, Lcom/android/dx/rop/code/InsnList;

    .line 30
    .line 31
    invoke-direct {v3, v4}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v6, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 35
    .line 36
    sget-object v7, Lcom/android/dx/rop/code/Rops;->MONITOR_EXIT:Lcom/android/dx/rop/code/Rop;

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getSynchReg()Lcom/android/dx/rop/code/RegisterSpec;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-static {v8}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    sget-object v9, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 47
    .line 48
    invoke-direct {v6, v7, v1, v8, v9}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v5, v6}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 55
    .line 56
    .line 57
    const/4 v6, -0x3

    .line 58
    invoke-direct {p0, v6}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    new-instance v7, Lcom/android/dx/rop/code/BasicBlock;

    .line 63
    .line 64
    invoke-static {v6}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-direct {v7, v2, v3, v8, v6}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 69
    .line 70
    .line 71
    sget-object v2, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 72
    .line 73
    invoke-direct {p0, v7, v2}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 74
    .line 75
    .line 76
    move v2, v6

    .line 77
    :cond_1
    new-instance v3, Lcom/android/dx/rop/code/InsnList;

    .line 78
    .line 79
    invoke-direct {v3, v4}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getSources()Lcom/android/dx/rop/type/TypeList;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v4}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_2

    .line 91
    .line 92
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    invoke-interface {v4, v5}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {v5, v4}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {v4}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    :goto_0
    new-instance v6, Lcom/android/dx/rop/code/PlainInsn;

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    invoke-direct {v6, v0, v1, v7, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v5, v6}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 117
    .line 118
    .line 119
    new-instance v0, Lcom/android/dx/rop/code/BasicBlock;

    .line 120
    .line 121
    sget-object v1, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 122
    .line 123
    const/4 v4, -0x1

    .line 124
    invoke-direct {v0, v2, v3, v1, v4}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, v0, v1}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 128
    .line 129
    .line 130
    return-void
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

.method private addSetupBlocks()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getLocalVariables()Lcom/android/dx/cf/code/LocalVariableList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v2, v3}, Lcom/android/dx/cf/code/ConcreteMethod;->makeSourcePosistion(I)Lcom/android/dx/rop/code/SourcePosition;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v4, v0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 17
    .line 18
    invoke-virtual {v4}, Lcom/android/dx/cf/code/ConcreteMethod;->getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    invoke-virtual {v10}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v11

    .line 30
    new-instance v12, Lcom/android/dx/rop/code/InsnList;

    .line 31
    .line 32
    add-int/lit8 v4, v11, 0x1

    .line 33
    .line 34
    invoke-direct {v12, v4}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    move v13, v3

    .line 38
    move v14, v13

    .line 39
    :goto_0
    if-ge v13, v11, :cond_1

    .line 40
    .line 41
    invoke-virtual {v10, v13}, Lcom/android/dx/rop/type/StdTypeList;->get(I)Lcom/android/dx/rop/type/Type;

    .line 42
    .line 43
    .line 44
    move-result-object v15

    .line 45
    invoke-virtual {v1, v3, v14}, Lcom/android/dx/cf/code/LocalVariableList;->pcAndIndexToLocal(II)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-nez v4, :cond_0

    .line 50
    .line 51
    invoke-static {v14, v15}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {v4}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v14, v15, v4}, Lcom/android/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    :goto_1
    move-object v7, v4

    .line 65
    new-instance v9, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 66
    .line 67
    invoke-static {v15}, Lcom/android/dx/rop/code/Rops;->opMoveParam(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    sget-object v8, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 72
    .line 73
    invoke-static {v14}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 74
    .line 75
    .line 76
    move-result-object v16

    .line 77
    move-object v4, v9

    .line 78
    move-object v6, v2

    .line 79
    move-object v3, v9

    .line 80
    move-object/from16 v9, v16

    .line 81
    .line 82
    invoke-direct/range {v4 .. v9}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v13, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v15}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    add-int/2addr v14, v3

    .line 93
    add-int/lit8 v13, v13, 0x1

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    goto :goto_0

    .line 97
    :cond_1
    new-instance v1, Lcom/android/dx/rop/code/PlainInsn;

    .line 98
    .line 99
    sget-object v3, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 100
    .line 101
    sget-object v10, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    invoke-direct {v1, v3, v2, v13, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v11, v1}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 111
    .line 112
    .line 113
    invoke-direct/range {p0 .. p0}, Lcom/android/dx/cf/code/Ropper;->isSynchronized()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_2

    .line 118
    .line 119
    const/4 v4, -0x4

    .line 120
    invoke-direct {v0, v4}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    move v11, v4

    .line 125
    goto :goto_2

    .line 126
    :cond_2
    const/4 v11, 0x0

    .line 127
    :goto_2
    new-instance v4, Lcom/android/dx/rop/code/BasicBlock;

    .line 128
    .line 129
    const/4 v5, -0x1

    .line 130
    invoke-direct {v0, v5}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-static {v11}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-direct {v4, v5, v12, v6, v11}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 139
    .line 140
    .line 141
    sget-object v12, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 142
    .line 143
    invoke-direct {v0, v4, v12}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 144
    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    invoke-direct/range {p0 .. p0}, Lcom/android/dx/cf/code/Ropper;->getSynchReg()Lcom/android/dx/rop/code/RegisterSpec;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-direct/range {p0 .. p0}, Lcom/android/dx/cf/code/Ropper;->isStatic()Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    const/4 v14, 0x2

    .line 157
    const/4 v15, 0x1

    .line 158
    if-eqz v4, :cond_3

    .line 159
    .line 160
    new-instance v3, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 161
    .line 162
    sget-object v5, Lcom/android/dx/rop/code/Rops;->CONST_OBJECT:Lcom/android/dx/rop/code/Rop;

    .line 163
    .line 164
    sget-object v8, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 165
    .line 166
    iget-object v4, v0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 167
    .line 168
    invoke-virtual {v4}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    move-object v4, v3

    .line 173
    move-object v6, v2

    .line 174
    move-object v7, v10

    .line 175
    invoke-direct/range {v4 .. v9}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 176
    .line 177
    .line 178
    new-instance v4, Lcom/android/dx/rop/code/InsnList;

    .line 179
    .line 180
    invoke-direct {v4, v15}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 181
    .line 182
    .line 183
    const/4 v5, 0x0

    .line 184
    invoke-virtual {v4, v5, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 185
    .line 186
    .line 187
    move v3, v15

    .line 188
    goto :goto_3

    .line 189
    :cond_3
    new-instance v9, Lcom/android/dx/rop/code/InsnList;

    .line 190
    .line 191
    invoke-direct {v9, v14}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 192
    .line 193
    .line 194
    new-instance v8, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 195
    .line 196
    sget-object v5, Lcom/android/dx/rop/code/Rops;->MOVE_PARAM_OBJECT:Lcom/android/dx/rop/code/Rop;

    .line 197
    .line 198
    sget-object v16, Lcom/android/dx/rop/cst/CstInteger;->VALUE_0:Lcom/android/dx/rop/cst/CstInteger;

    .line 199
    .line 200
    move-object v4, v8

    .line 201
    move-object v6, v2

    .line 202
    move-object v7, v1

    .line 203
    move-object v14, v8

    .line 204
    move-object v8, v10

    .line 205
    move-object v15, v9

    .line 206
    move-object/from16 v9, v16

    .line 207
    .line 208
    invoke-direct/range {v4 .. v9}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 209
    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    invoke-virtual {v15, v4, v14}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 213
    .line 214
    .line 215
    new-instance v4, Lcom/android/dx/rop/code/PlainInsn;

    .line 216
    .line 217
    invoke-direct {v4, v3, v2, v13, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 218
    .line 219
    .line 220
    const/4 v3, 0x1

    .line 221
    invoke-virtual {v15, v3, v4}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 222
    .line 223
    .line 224
    move-object v4, v15

    .line 225
    :goto_3
    const/4 v5, -0x5

    .line 226
    invoke-direct {v0, v5}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    invoke-virtual {v4}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 231
    .line 232
    .line 233
    new-instance v6, Lcom/android/dx/rop/code/BasicBlock;

    .line 234
    .line 235
    invoke-static {v5}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-direct {v6, v11, v4, v7, v5}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v0, v6, v12}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 243
    .line 244
    .line 245
    new-instance v4, Lcom/android/dx/rop/code/InsnList;

    .line 246
    .line 247
    invoke-direct/range {p0 .. p0}, Lcom/android/dx/cf/code/Ropper;->isStatic()Z

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    if-eqz v6, :cond_4

    .line 252
    .line 253
    const/4 v14, 0x2

    .line 254
    goto :goto_4

    .line 255
    :cond_4
    move v14, v3

    .line 256
    :goto_4
    invoke-direct {v4, v14}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-direct/range {p0 .. p0}, Lcom/android/dx/cf/code/Ropper;->isStatic()Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_5

    .line 264
    .line 265
    new-instance v3, Lcom/android/dx/rop/code/PlainInsn;

    .line 266
    .line 267
    invoke-static {v1}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    invoke-direct {v3, v6, v2, v1, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 272
    .line 273
    .line 274
    const/4 v6, 0x0

    .line 275
    invoke-virtual {v4, v6, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 276
    .line 277
    .line 278
    :cond_5
    new-instance v3, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 279
    .line 280
    sget-object v6, Lcom/android/dx/rop/code/Rops;->MONITOR_ENTER:Lcom/android/dx/rop/code/Rop;

    .line 281
    .line 282
    invoke-static {v1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    sget-object v7, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 287
    .line 288
    invoke-direct {v3, v6, v2, v1, v7}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 289
    .line 290
    .line 291
    invoke-direct/range {p0 .. p0}, Lcom/android/dx/cf/code/Ropper;->isStatic()Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    invoke-virtual {v4, v1, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 299
    .line 300
    .line 301
    new-instance v1, Lcom/android/dx/rop/code/BasicBlock;

    .line 302
    .line 303
    const/4 v2, 0x0

    .line 304
    invoke-static {v2}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-direct {v1, v5, v4, v3, v2}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 309
    .line 310
    .line 311
    invoke-direct {v0, v1, v12}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 312
    .line 313
    .line 314
    :cond_6
    return-void
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

.method private addSynchExceptionHandlerBlock()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/cf/code/Ropper;->synchNeedsExceptionHandler:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/android/dx/cf/code/ConcreteMethod;->makeSourcePosistion(I)Lcom/android/dx/rop/code/SourcePosition;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v2, Lcom/android/dx/rop/type/Type;->THROWABLE:Lcom/android/dx/rop/type/Type;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, Lcom/android/dx/rop/code/InsnList;

    .line 20
    .line 21
    const/4 v5, 0x2

    .line 22
    invoke-direct {v4, v5}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v5, Lcom/android/dx/rop/code/PlainInsn;

    .line 26
    .line 27
    invoke-static {v2}, Lcom/android/dx/rop/code/Rops;->opMoveException(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v6, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 32
    .line 33
    invoke-direct {v5, v2, v0, v3, v6}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v1, v5}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 40
    .line 41
    sget-object v5, Lcom/android/dx/rop/code/Rops;->MONITOR_EXIT:Lcom/android/dx/rop/code/Rop;

    .line 42
    .line 43
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getSynchReg()Lcom/android/dx/rop/code/RegisterSpec;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-static {v6}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    sget-object v7, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 52
    .line 53
    invoke-direct {v2, v5, v0, v6, v7}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x1

    .line 57
    invoke-virtual {v4, v5, v2}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 61
    .line 62
    .line 63
    const/4 v2, -0x7

    .line 64
    invoke-direct {p0, v2}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    new-instance v6, Lcom/android/dx/rop/code/BasicBlock;

    .line 69
    .line 70
    const/4 v8, -0x6

    .line 71
    invoke-direct {p0, v8}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-static {v2}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-direct {v6, v8, v4, v9, v2}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 80
    .line 81
    .line 82
    sget-object v4, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 83
    .line 84
    invoke-direct {p0, v6, v4}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 85
    .line 86
    .line 87
    new-instance v6, Lcom/android/dx/rop/code/InsnList;

    .line 88
    .line 89
    invoke-direct {v6, v5}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 93
    .line 94
    sget-object v8, Lcom/android/dx/rop/code/Rops;->THROW:Lcom/android/dx/rop/code/Rop;

    .line 95
    .line 96
    invoke-static {v3}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {v5, v8, v0, v3, v7}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v1, v5}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lcom/android/dx/rop/code/BasicBlock;

    .line 110
    .line 111
    const/4 v1, -0x1

    .line 112
    invoke-direct {v0, v2, v6, v4, v1}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p0, v0, v4}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 116
    .line 117
    .line 118
    return-void
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

.method public static convert(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)Lcom/android/dx/rop/code/RopMethod;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/android/dx/cf/code/Ropper;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/android/dx/cf/code/Ropper;-><init>(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/cf/code/Ropper;->doit()V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/android/dx/cf/code/Ropper;->getRopMethod()Lcom/android/dx/rop/code/RopMethod;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p0

    .line 14
    :catch_0
    move-exception p1

    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string p3, "...while working on method "

    .line 21
    .line 22
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p1, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
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

.method private deleteUnreachableBlocks()V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 15
    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    invoke-direct {p0, v1}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v2, Lcom/android/dx/cf/code/Ropper$2;

    .line 23
    .line 24
    invoke-direct {v2, p0, v0}, Lcom/android/dx/cf/code/Ropper$2;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/util/IntList;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v1, v2}, Lcom/android/dx/cf/code/Ropper;->forEachNonSubBlockDepthFirst(ILcom/android/dx/rop/code/BasicBlock$Visitor;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->sort()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/lit8 v1, v1, -0x1

    .line 40
    .line 41
    :goto_0
    if-ltz v1, :cond_1

    .line 42
    .line 43
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lcom/android/dx/rop/code/BasicBlock;

    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v0, v2}, Lcom/android/dx/util/IntList;->indexOf(I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-gez v2, :cond_0

    .line 60
    .line 61
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    return-void
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

.method private doit()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/util/Bits;->makeBitSet(I)[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->addSetupBlocks()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->setFirstFrame()V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0, v1}, Lcom/android/dx/util/Bits;->findFirst([II)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-gez v2, :cond_1

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->addReturnBlock()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->addSynchExceptionHandlerBlock()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->addExceptionSetupBlocks()V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/android/dx/cf/code/Ropper;->hasSubroutines:Z

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->inlineSubroutines()V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    invoke-static {v0, v2}, Lcom/android/dx/util/Bits;->clear([II)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->blocks:Lcom/android/dx/cf/code/ByteBlockList;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Lcom/android/dx/cf/code/ByteBlockList;->labelToBlock(I)Lcom/android/dx/cf/code/ByteBlock;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 50
    .line 51
    aget-object v4, v4, v2

    .line 52
    .line 53
    :try_start_0
    invoke-direct {p0, v3, v4, v0}, Lcom/android/dx/cf/code/Ropper;->processBlock(Lcom/android/dx/cf/code/ByteBlock;Lcom/android/dx/cf/code/Frame;[I)V
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v3, "...while working on block "

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0
    .line 83
.end method

.method private filterMoveReturnAddressInsns(Lcom/android/dx/rop/code/InsnList;)Lcom/android/dx/rop/code/InsnList;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-virtual {v4}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    sget-object v5, Lcom/android/dx/rop/code/Rops;->MOVE_RETURN_ADDRESS:Lcom/android/dx/rop/code/Rop;

    .line 19
    .line 20
    if-eq v4, v5, :cond_0

    .line 21
    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-ne v3, v0, :cond_2

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    new-instance v2, Lcom/android/dx/rop/code/InsnList;

    .line 31
    .line 32
    invoke-direct {v2, v3}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    move v3, v1

    .line 36
    :goto_1
    if-ge v1, v0, :cond_4

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    sget-object v6, Lcom/android/dx/rop/code/Rops;->MOVE_RETURN_ADDRESS:Lcom/android/dx/rop/code/Rop;

    .line 47
    .line 48
    if-eq v5, v6, :cond_3

    .line 49
    .line 50
    add-int/lit8 v5, v3, 0x1

    .line 51
    .line 52
    invoke-virtual {v2, v3, v4}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 53
    .line 54
    .line 55
    move v3, v5

    .line 56
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 60
    .line 61
    .line 62
    return-object v2
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

.method private forEachNonSubBlockDepthFirst(ILcom/android/dx/rop/code/BasicBlock$Visitor;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    move-result-object p1

    new-instance v0, Ljava/util/BitSet;

    iget v1, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    invoke-direct {p0, p1, p2, v0}, Lcom/android/dx/cf/code/Ropper;->forEachNonSubBlockDepthFirst0(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock$Visitor;Ljava/util/BitSet;)V

    return-void
.end method

.method private forEachNonSubBlockDepthFirst0(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock$Visitor;Ljava/util/BitSet;)V
    .locals 5

    .line 1
    invoke-interface {p2, p1}, Lcom/android/dx/rop/code/BasicBlock$Visitor;->visitBlock(Lcom/android/dx/rop/code/BasicBlock;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p3, v0}, Ljava/util/BitSet;->set(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p3, v3}, Ljava/util/BitSet;->get(I)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->isSubroutineCaller(Lcom/android/dx/rop/code/BasicBlock;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    if-lez v2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-direct {p0, v3}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-ltz v3, :cond_2

    .line 47
    .line 48
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lcom/android/dx/rop/code/BasicBlock;

    .line 55
    .line 56
    invoke-direct {p0, v3, p2, p3}, Lcom/android/dx/cf/code/Ropper;->forEachNonSubBlockDepthFirst0(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock$Visitor;Ljava/util/BitSet;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-void
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

.method private getAvailableLabel()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getMinimumUnreservedLabel()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcom/android/dx/rop/code/BasicBlock;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-lt v2, v0, :cond_0

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    move v0, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return v0
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

.method private getMinimumUnreservedLabel()I
    .locals 2

    iget v0, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x7

    return v0
.end method

.method private getNormalRegCount()I
    .locals 2

    iget v0, p0, Lcom/android/dx/cf/code/Ropper;->maxLocals:I

    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getMaxStack()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private getRopMethod()Lcom/android/dx/rop/code/RopMethod;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lcom/android/dx/rop/code/BasicBlockList;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/android/dx/rop/code/BasicBlockList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_0

    .line 14
    .line 15
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lcom/android/dx/rop/code/BasicBlock;

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/rop/code/BasicBlockList;->set(ILcom/android/dx/rop/code/BasicBlock;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/android/dx/rop/code/RopMethod;

    .line 33
    .line 34
    const/4 v2, -0x1

    .line 35
    invoke-direct {p0, v2}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-direct {v0, v1, v2}, Lcom/android/dx/rop/code/RopMethod;-><init>(Lcom/android/dx/rop/code/BasicBlockList;I)V

    .line 40
    .line 41
    .line 42
    return-object v0
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

.method private getSpecialLabel(I)I
    .locals 2

    iget v0, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v1

    add-int/2addr v0, v1

    not-int p1, p1

    add-int/2addr v0, p1

    return v0
.end method

.method private getSynchReg()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getNormalRegCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    :cond_0
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private inlineSubroutines()V
    .locals 8

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lcom/android/dx/cf/code/Ropper$1;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0}, Lcom/android/dx/cf/code/Ropper$1;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/util/IntList;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {p0, v2, v1}, Lcom/android/dx/cf/code/Ropper;->forEachNonSubBlockDepthFirst(ILcom/android/dx/rop/code/BasicBlock$Visitor;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getAvailableLabel()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    move v4, v2

    .line 26
    :goto_0
    if-ge v4, v1, :cond_0

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v2

    .line 36
    :goto_1
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-ge v1, v4, :cond_2

    .line 43
    .line 44
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lcom/android/dx/rop/code/BasicBlock;

    .line 51
    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    iget-object v5, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lcom/android/dx/util/IntList;

    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-virtual {v3, v4, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :goto_3
    if-ge v2, v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    new-instance v5, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;

    .line 84
    .line 85
    new-instance v6, Lcom/android/dx/cf/code/Ropper$LabelAllocator;

    .line 86
    .line 87
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getAvailableLabel()I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    invoke-direct {v6, v7}, Lcom/android/dx/cf/code/Ropper$LabelAllocator;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v5, p0, v6, v3}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/Ropper$LabelAllocator;Ljava/util/ArrayList;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, v4}, Lcom/android/dx/cf/code/Ropper;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v5, v4}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->inlineSubroutineCalledFrom(Lcom/android/dx/rop/code/BasicBlock;)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->deleteUnreachableBlocks()V

    .line 108
    .line 109
    .line 110
    return-void
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
.end method

.method private isStatic()Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getAccessFlags()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isSubroutineCaller(Lcom/android/dx/rop/code/BasicBlock;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 20
    .line 21
    array-length v3, v1

    .line 22
    if-ge p1, v3, :cond_1

    .line 23
    .line 24
    aget-object p1, v1, p1

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    move v2, v0

    .line 29
    :cond_1
    return v2
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

.method private isSynchronized()Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getAccessFlags()I

    move-result v0

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/android/dx/rop/code/BasicBlock;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "no such label "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

.method private labelToResultIndex(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/android/dx/rop/code/BasicBlock;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ne v2, p1, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, -0x1

    .line 29
    return p1
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

.method private mergeAndWorkAsNecessary(IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Ropper$Subroutine;->getStartBlock()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {v1, p4, p3, p2}, Lcom/android/dx/cf/code/Frame;->mergeWithSubroutineCaller(Lcom/android/dx/cf/code/Frame;II)Lcom/android/dx/cf/code/Frame;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1, p4}, Lcom/android/dx/cf/code/Frame;->mergeWith(Lcom/android/dx/cf/code/Frame;)Lcom/android/dx/cf/code/Frame;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    if-eq p2, v1, :cond_3

    .line 23
    .line 24
    iget-object p3, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 25
    .line 26
    aput-object p2, p3, p1

    .line 27
    .line 28
    invoke-static {p5, p1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    if-eqz p3, :cond_2

    .line 33
    .line 34
    invoke-virtual {p4, p1, p2}, Lcom/android/dx/cf/code/Frame;->makeNewSubroutineStartFrame(II)Lcom/android/dx/cf/code/Frame;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    aput-object p2, v0, p1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    aput-object p4, v0, p1

    .line 42
    .line 43
    :goto_1
    invoke-static {p5, p1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 44
    .line 45
    .line 46
    :cond_3
    :goto_2
    return-void
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

.method private processBlock(Lcom/android/dx/cf/code/ByteBlock;Lcom/android/dx/cf/code/Frame;[I)V
    .locals 24

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ByteCatchList;->toRopCatchList()Lcom/android/dx/rop/type/TypeList;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/code/RopperMachine;->startBlock(Lcom/android/dx/rop/type/TypeList;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Lcom/android/dx/cf/code/Frame;->copy()Lcom/android/dx/cf/code/Frame;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->sim:Lcom/android/dx/cf/code/Simulator;

    .line 21
    .line 22
    move-object/from16 v9, p1

    .line 23
    .line 24
    invoke-virtual {v1, v9, v8}, Lcom/android/dx/cf/code/Simulator;->simulate(Lcom/android/dx/cf/code/ByteBlock;Lcom/android/dx/cf/code/Frame;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v8}, Lcom/android/dx/cf/code/Frame;->setImmutable()V

    .line 28
    .line 29
    .line 30
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->getExtraBlockCount()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->getInsns()Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/android/dx/cf/code/RopperMachine;->hasJsr()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v15, 0x1

    .line 61
    const/4 v6, 0x0

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1, v15}, Lcom/android/dx/util/IntList;->get(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget-object v3, v7, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 69
    .line 70
    aget-object v4, v3, v2

    .line 71
    .line 72
    if-nez v4, :cond_0

    .line 73
    .line 74
    new-instance v4, Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 75
    .line 76
    invoke-direct {v4, v7, v2}, Lcom/android/dx/cf/code/Ropper$Subroutine;-><init>(Lcom/android/dx/cf/code/Ropper;I)V

    .line 77
    .line 78
    .line 79
    aput-object v4, v3, v2

    .line 80
    .line 81
    :cond_0
    iget-object v3, v7, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 82
    .line 83
    aget-object v3, v3, v2

    .line 84
    .line 85
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {v3, v4}, Lcom/android/dx/cf/code/Ropper$Subroutine;->addCallerBlock(I)V

    .line 90
    .line 91
    .line 92
    iget-object v3, v7, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 93
    .line 94
    aget-object v2, v3, v2

    .line 95
    .line 96
    move-object/from16 v5, p3

    .line 97
    .line 98
    move-object v4, v1

    .line 99
    move-object/from16 v16, v2

    .line 100
    .line 101
    move v1, v15

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    iget-object v2, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 104
    .line 105
    invoke-virtual {v2}, Lcom/android/dx/cf/code/RopperMachine;->hasRet()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->getReturnAddress()Lcom/android/dx/cf/code/ReturnAddress;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ReturnAddress;->getSubroutineAddress()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iget-object v2, v7, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 122
    .line 123
    aget-object v3, v2, v1

    .line 124
    .line 125
    if-nez v3, :cond_2

    .line 126
    .line 127
    new-instance v3, Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 128
    .line 129
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-direct {v3, v7, v1, v4}, Lcom/android/dx/cf/code/Ropper$Subroutine;-><init>(Lcom/android/dx/cf/code/Ropper;II)V

    .line 134
    .line 135
    .line 136
    aput-object v3, v2, v1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {v3, v2}, Lcom/android/dx/cf/code/Ropper$Subroutine;->addRetBlock(I)V

    .line 144
    .line 145
    .line 146
    :goto_0
    iget-object v2, v7, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 147
    .line 148
    aget-object v2, v2, v1

    .line 149
    .line 150
    invoke-virtual {v2}, Lcom/android/dx/cf/code/Ropper$Subroutine;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget-object v3, v7, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 155
    .line 156
    aget-object v1, v3, v1

    .line 157
    .line 158
    move-object/from16 v5, p3

    .line 159
    .line 160
    invoke-virtual {v1, v8, v5}, Lcom/android/dx/cf/code/Ropper$Subroutine;->mergeToSuccessors(Lcom/android/dx/cf/code/Frame;[I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Lcom/android/dx/util/IntList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    move-object v4, v2

    .line 168
    move-object/from16 v16, v6

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_3
    move-object/from16 v5, p3

    .line 172
    .line 173
    iget-object v2, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 174
    .line 175
    invoke-virtual {v2}, Lcom/android/dx/cf/code/RopperMachine;->wereCatchesUsed()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_4

    .line 180
    .line 181
    move-object v4, v1

    .line 182
    move-object/from16 v16, v6

    .line 183
    .line 184
    move v1, v13

    .line 185
    goto :goto_1

    .line 186
    :cond_4
    move-object v4, v1

    .line 187
    move-object/from16 v16, v6

    .line 188
    .line 189
    const/4 v1, 0x0

    .line 190
    :goto_1
    invoke-virtual {v4}, Lcom/android/dx/util/IntList;->size()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    move v2, v1

    .line 195
    :goto_2
    if-ge v2, v3, :cond_5

    .line 196
    .line 197
    invoke-virtual {v4, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 198
    .line 199
    .line 200
    move-result v17

    .line 201
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 202
    .line 203
    .line 204
    move-result v18

    .line 205
    move-object/from16 v1, p0

    .line 206
    .line 207
    move/from16 v19, v2

    .line 208
    .line 209
    move/from16 v2, v17

    .line 210
    .line 211
    move/from16 v20, v3

    .line 212
    .line 213
    move/from16 v3, v18

    .line 214
    .line 215
    move-object/from16 v18, v4

    .line 216
    .line 217
    move-object/from16 v4, v16

    .line 218
    .line 219
    move-object v5, v8

    .line 220
    move-object v14, v6

    .line 221
    move-object/from16 v6, p3

    .line 222
    .line 223
    invoke-direct/range {v1 .. v6}, Lcom/android/dx/cf/code/Ropper;->mergeAndWorkAsNecessary(IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 224
    .line 225
    .line 226
    add-int/lit8 v2, v19, 0x1

    .line 227
    .line 228
    move-object/from16 v5, p3

    .line 229
    .line 230
    move-object v6, v14

    .line 231
    move-object/from16 v4, v18

    .line 232
    .line 233
    move/from16 v3, v20

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :catch_0
    move-exception v0

    .line 237
    new-instance v1, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const-string v2, "...while merging to block "

    .line 243
    .line 244
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-static/range {v17 .. v17}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_5
    move/from16 v20, v3

    .line 263
    .line 264
    move-object/from16 v18, v4

    .line 265
    .line 266
    move-object v14, v6

    .line 267
    if-nez v20, :cond_6

    .line 268
    .line 269
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 270
    .line 271
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->returns()Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_6

    .line 276
    .line 277
    const/4 v1, -0x2

    .line 278
    invoke-direct {v7, v1}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    invoke-static {v1}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    move v3, v15

    .line 287
    goto :goto_3

    .line 288
    :cond_6
    move-object/from16 v4, v18

    .line 289
    .line 290
    move/from16 v3, v20

    .line 291
    .line 292
    :goto_3
    if-nez v3, :cond_7

    .line 293
    .line 294
    const/4 v1, -0x1

    .line 295
    goto :goto_4

    .line 296
    :cond_7
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 297
    .line 298
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->getPrimarySuccessorIndex()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-ltz v1, :cond_8

    .line 303
    .line 304
    invoke-virtual {v4, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    :cond_8
    :goto_4
    move v6, v1

    .line 309
    invoke-direct/range {p0 .. p0}, Lcom/android/dx/cf/code/Ropper;->isSynchronized()Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-eqz v1, :cond_9

    .line 314
    .line 315
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 316
    .line 317
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->canThrow()Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_9

    .line 322
    .line 323
    move/from16 v16, v15

    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_9
    const/16 v16, 0x0

    .line 327
    .line 328
    :goto_5
    if-nez v16, :cond_b

    .line 329
    .line 330
    if-eqz v13, :cond_a

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_a
    move v1, v6

    .line 334
    goto/16 :goto_a

    .line 335
    .line 336
    :cond_b
    :goto_6
    new-instance v5, Lcom/android/dx/util/IntList;

    .line 337
    .line 338
    invoke-direct {v5, v3}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 339
    .line 340
    .line 341
    const/4 v1, 0x0

    .line 342
    const/4 v4, 0x0

    .line 343
    :goto_7
    if-ge v4, v13, :cond_e

    .line 344
    .line 345
    invoke-virtual {v0, v4}, Lcom/android/dx/cf/code/ByteCatchList;->get(I)Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-virtual {v2}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getExceptionClass()Lcom/android/dx/rop/cst/CstType;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    invoke-virtual {v2}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getHandlerPc()I

    .line 354
    .line 355
    .line 356
    move-result v17

    .line 357
    sget-object v2, Lcom/android/dx/rop/cst/CstType;->OBJECT:Lcom/android/dx/rop/cst/CstType;

    .line 358
    .line 359
    if-ne v3, v2, :cond_c

    .line 360
    .line 361
    move v2, v15

    .line 362
    goto :goto_8

    .line 363
    :cond_c
    const/4 v2, 0x0

    .line 364
    :goto_8
    or-int v18, v1, v2

    .line 365
    .line 366
    invoke-virtual {v8, v3}, Lcom/android/dx/cf/code/Frame;->makeExceptionHandlerStartFrame(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/cf/code/Frame;

    .line 367
    .line 368
    .line 369
    move-result-object v19

    .line 370
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 371
    .line 372
    .line 373
    move-result v20

    .line 374
    const/16 v21, 0x0

    .line 375
    .line 376
    move-object/from16 v1, p0

    .line 377
    .line 378
    move/from16 v2, v17

    .line 379
    .line 380
    move-object/from16 v22, v3

    .line 381
    .line 382
    move/from16 v3, v20

    .line 383
    .line 384
    move/from16 v20, v4

    .line 385
    .line 386
    move-object/from16 v4, v21

    .line 387
    .line 388
    move-object v15, v5

    .line 389
    move-object/from16 v5, v19

    .line 390
    .line 391
    move/from16 v23, v6

    .line 392
    .line 393
    move-object/from16 v6, p3

    .line 394
    .line 395
    invoke-direct/range {v1 .. v6}, Lcom/android/dx/cf/code/Ropper;->mergeAndWorkAsNecessary(IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V
    :try_end_1
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_1 .. :try_end_1} :catch_1

    .line 396
    .line 397
    .line 398
    iget-object v1, v7, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 399
    .line 400
    aget-object v1, v1, v17

    .line 401
    .line 402
    if-nez v1, :cond_d

    .line 403
    .line 404
    new-instance v1, Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 405
    .line 406
    invoke-direct {v1, v7, v14}, Lcom/android/dx/cf/code/Ropper$CatchInfo;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/Ropper$1;)V

    .line 407
    .line 408
    .line 409
    iget-object v2, v7, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 410
    .line 411
    aput-object v1, v2, v17

    .line 412
    .line 413
    :cond_d
    invoke-virtual/range {v22 .. v22}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/code/Ropper$CatchInfo;->getSetup(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    invoke-virtual {v1}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->getLabel()I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    invoke-virtual {v15, v1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 426
    .line 427
    .line 428
    add-int/lit8 v4, v20, 0x1

    .line 429
    .line 430
    move-object v5, v15

    .line 431
    move/from16 v1, v18

    .line 432
    .line 433
    move/from16 v6, v23

    .line 434
    .line 435
    const/4 v15, 0x1

    .line 436
    goto :goto_7

    .line 437
    :catch_1
    move-exception v0

    .line 438
    new-instance v1, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 441
    .line 442
    .line 443
    const-string v2, "...while merging exception to block "

    .line 444
    .line 445
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-static/range {v17 .. v17}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v0

    .line 463
    :cond_e
    move-object v15, v5

    .line 464
    move/from16 v23, v6

    .line 465
    .line 466
    if-eqz v16, :cond_10

    .line 467
    .line 468
    if-nez v1, :cond_10

    .line 469
    .line 470
    const/4 v0, -0x6

    .line 471
    invoke-direct {v7, v0}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    invoke-virtual {v15, v0}, Lcom/android/dx/util/IntList;->add(I)V

    .line 476
    .line 477
    .line 478
    const/4 v0, 0x1

    .line 479
    iput-boolean v0, v7, Lcom/android/dx/cf/code/Ropper;->synchNeedsExceptionHandler:Z

    .line 480
    .line 481
    sub-int v1, v12, v10

    .line 482
    .line 483
    sub-int/2addr v1, v0

    .line 484
    :goto_9
    if-ge v1, v12, :cond_10

    .line 485
    .line 486
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    check-cast v0, Lcom/android/dx/rop/code/Insn;

    .line 491
    .line 492
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->canThrow()Z

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    if-eqz v2, :cond_f

    .line 497
    .line 498
    sget-object v2, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 499
    .line 500
    invoke-virtual {v0, v2}, Lcom/android/dx/rop/code/Insn;->withAddedCatch(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/code/Insn;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v11, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 508
    .line 509
    goto :goto_9

    .line 510
    :cond_10
    move/from16 v1, v23

    .line 511
    .line 512
    if-ltz v1, :cond_11

    .line 513
    .line 514
    invoke-virtual {v15, v1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 515
    .line 516
    .line 517
    :cond_11
    invoke-virtual {v15}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 518
    .line 519
    .line 520
    move-object v4, v15

    .line 521
    :goto_a
    invoke-virtual {v4, v1}, Lcom/android/dx/util/IntList;->indexOf(I)I

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    move v6, v1

    .line 526
    :goto_b
    if-lez v10, :cond_15

    .line 527
    .line 528
    add-int/lit8 v12, v12, -0x1

    .line 529
    .line 530
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    check-cast v1, Lcom/android/dx/rop/code/Insn;

    .line 535
    .line 536
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    const/4 v3, 0x1

    .line 545
    if-ne v2, v3, :cond_12

    .line 546
    .line 547
    const/4 v2, 0x1

    .line 548
    goto :goto_c

    .line 549
    :cond_12
    const/4 v2, 0x0

    .line 550
    :goto_c
    new-instance v3, Lcom/android/dx/rop/code/InsnList;

    .line 551
    .line 552
    if-eqz v2, :cond_13

    .line 553
    .line 554
    const/4 v5, 0x2

    .line 555
    goto :goto_d

    .line 556
    :cond_13
    const/4 v5, 0x1

    .line 557
    :goto_d
    invoke-direct {v3, v5}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 558
    .line 559
    .line 560
    const/4 v5, 0x0

    .line 561
    invoke-virtual {v3, v5, v1}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 562
    .line 563
    .line 564
    if-eqz v2, :cond_14

    .line 565
    .line 566
    new-instance v2, Lcom/android/dx/rop/code/PlainInsn;

    .line 567
    .line 568
    sget-object v13, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 569
    .line 570
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    sget-object v15, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 575
    .line 576
    invoke-direct {v2, v13, v1, v14, v15}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 577
    .line 578
    .line 579
    const/4 v1, 0x1

    .line 580
    invoke-virtual {v3, v1, v2}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 581
    .line 582
    .line 583
    invoke-static {v6}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    goto :goto_e

    .line 588
    :cond_14
    move-object v1, v4

    .line 589
    :goto_e
    invoke-virtual {v3}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 590
    .line 591
    .line 592
    invoke-direct/range {p0 .. p0}, Lcom/android/dx/cf/code/Ropper;->getAvailableLabel()I

    .line 593
    .line 594
    .line 595
    move-result v2

    .line 596
    new-instance v13, Lcom/android/dx/rop/code/BasicBlock;

    .line 597
    .line 598
    invoke-direct {v13, v2, v3, v1, v6}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v8}, Lcom/android/dx/cf/code/Frame;->getSubroutines()Lcom/android/dx/util/IntList;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-direct {v7, v13, v1}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v4}, Lcom/android/dx/util/IntList;->mutableCopy()Lcom/android/dx/util/IntList;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-virtual {v4, v0, v2}, Lcom/android/dx/util/IntList;->set(II)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v4}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 616
    .line 617
    .line 618
    add-int/lit8 v10, v10, -0x1

    .line 619
    .line 620
    move v6, v2

    .line 621
    goto :goto_b

    .line 622
    :cond_15
    const/4 v5, 0x0

    .line 623
    if-nez v12, :cond_16

    .line 624
    .line 625
    move-object v0, v14

    .line 626
    goto :goto_f

    .line 627
    :cond_16
    add-int/lit8 v0, v12, -0x1

    .line 628
    .line 629
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    check-cast v0, Lcom/android/dx/rop/code/Insn;

    .line 634
    .line 635
    :goto_f
    if-eqz v0, :cond_17

    .line 636
    .line 637
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    const/4 v2, 0x1

    .line 646
    if-ne v1, v2, :cond_19

    .line 647
    .line 648
    :cond_17
    if-nez v0, :cond_18

    .line 649
    .line 650
    sget-object v0, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 651
    .line 652
    goto :goto_10

    .line 653
    :cond_18
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    :goto_10
    new-instance v1, Lcom/android/dx/rop/code/PlainInsn;

    .line 658
    .line 659
    sget-object v2, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 660
    .line 661
    sget-object v3, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 662
    .line 663
    invoke-direct {v1, v2, v0, v14, v3}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    add-int/lit8 v12, v12, 0x1

    .line 670
    .line 671
    :cond_19
    new-instance v0, Lcom/android/dx/rop/code/InsnList;

    .line 672
    .line 673
    invoke-direct {v0, v12}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 674
    .line 675
    .line 676
    move v14, v5

    .line 677
    :goto_11
    if-ge v14, v12, :cond_1a

    .line 678
    .line 679
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    check-cast v1, Lcom/android/dx/rop/code/Insn;

    .line 684
    .line 685
    invoke-virtual {v0, v14, v1}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 686
    .line 687
    .line 688
    add-int/lit8 v14, v14, 0x1

    .line 689
    .line 690
    goto :goto_11

    .line 691
    :cond_1a
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 692
    .line 693
    .line 694
    new-instance v1, Lcom/android/dx/rop/code/BasicBlock;

    .line 695
    .line 696
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 697
    .line 698
    .line 699
    move-result v2

    .line 700
    invoke-direct {v1, v2, v0, v4, v6}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v8}, Lcom/android/dx/cf/code/Frame;->getSubroutines()Lcom/android/dx/util/IntList;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-direct {v7, v1, v0}, Lcom/android/dx/cf/code/Ropper;->addOrReplaceBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z

    .line 708
    .line 709
    .line 710
    return-void
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
.end method

.method private removeBlockAndSpecialSuccessors(I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getMinimumUnreservedLabel()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/android/dx/rop/code/BasicBlock;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    :goto_0
    if-ge p1, v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-lt v3, v0, :cond_1

    .line 39
    .line 40
    invoke-direct {p0, v3}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-ltz v4, :cond_0

    .line 45
    .line 46
    invoke-direct {p0, v4}, Lcom/android/dx/cf/code/Ropper;->removeBlockAndSpecialSuccessors(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v1, "Invalid label "

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-void
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
.end method

.method private setFirstFrame()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget-object v1, v1, v2

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v1, v0}, Lcom/android/dx/cf/code/Frame;->initializeWithParameters(Lcom/android/dx/rop/type/StdTypeList;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 20
    .line 21
    aget-object v0, v0, v2

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/android/dx/cf/code/Frame;->setImmutable()V

    .line 24
    .line 25
    .line 26
    return-void
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

.method private subroutineFromRetBlock(I)Lcom/android/dx/cf/code/Ropper$Subroutine;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    :goto_0
    if-ltz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 9
    .line 10
    aget-object v1, v1, v0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {v1}, Lcom/android/dx/cf/code/Ropper$Subroutine;->access$1300(Lcom/android/dx/cf/code/Ropper$Subroutine;)Ljava/util/BitSet;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, p1}, Ljava/util/BitSet;->get(I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return-object p1
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


# virtual methods
.method getFirstTempStackReg()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getNormalRegCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isSynchronized()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    :cond_0
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
