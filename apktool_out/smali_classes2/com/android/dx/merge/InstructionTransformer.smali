.class final Lcom/android/dx/merge/InstructionTransformer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/merge/InstructionTransformer$CallSiteVisitor;,
        Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;,
        Lcom/android/dx/merge/InstructionTransformer$MethodVisitor;,
        Lcom/android/dx/merge/InstructionTransformer$TypeVisitor;,
        Lcom/android/dx/merge/InstructionTransformer$FieldVisitor;,
        Lcom/android/dx/merge/InstructionTransformer$StringVisitor;,
        Lcom/android/dx/merge/InstructionTransformer$GenericVisitor;
    }
.end annotation


# instance fields
.field private indexMap:Lcom/android/dx/merge/IndexMap;

.field private mappedAt:I

.field private mappedInstructions:[Lcom/android/dx/io/instructions/DecodedInstruction;

.field private final reader:Lcom/android/dx/io/CodeReader;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/io/CodeReader;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/io/CodeReader;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/merge/InstructionTransformer;->reader:Lcom/android/dx/io/CodeReader;

    .line 10
    .line 11
    new-instance v1, Lcom/android/dx/merge/InstructionTransformer$GenericVisitor;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p0, v2}, Lcom/android/dx/merge/InstructionTransformer$GenericVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/android/dx/io/CodeReader;->setAllVisitors(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lcom/android/dx/merge/InstructionTransformer$StringVisitor;

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, Lcom/android/dx/merge/InstructionTransformer$StringVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/android/dx/io/CodeReader;->setStringVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lcom/android/dx/merge/InstructionTransformer$TypeVisitor;

    .line 29
    .line 30
    invoke-direct {v1, p0, v2}, Lcom/android/dx/merge/InstructionTransformer$TypeVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/android/dx/io/CodeReader;->setTypeVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lcom/android/dx/merge/InstructionTransformer$FieldVisitor;

    .line 37
    .line 38
    invoke-direct {v1, p0, v2}, Lcom/android/dx/merge/InstructionTransformer$FieldVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/android/dx/io/CodeReader;->setFieldVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lcom/android/dx/merge/InstructionTransformer$MethodVisitor;

    .line 45
    .line 46
    invoke-direct {v1, p0, v2}, Lcom/android/dx/merge/InstructionTransformer$MethodVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/android/dx/io/CodeReader;->setMethodVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 50
    .line 51
    .line 52
    new-instance v1, Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;

    .line 53
    .line 54
    invoke-direct {v1, p0, v2}, Lcom/android/dx/merge/InstructionTransformer$MethodAndProtoVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/android/dx/io/CodeReader;->setMethodAndProtoVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lcom/android/dx/merge/InstructionTransformer$CallSiteVisitor;

    .line 61
    .line 62
    invoke-direct {v1, p0, v2}, Lcom/android/dx/merge/InstructionTransformer$CallSiteVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lcom/android/dx/io/CodeReader;->setCallSiteVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V

    .line 66
    .line 67
    .line 68
    return-void
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

.method static synthetic access$1000(ZI)V
    .locals 0

    invoke-static {p0, p1}, Lcom/android/dx/merge/InstructionTransformer;->jumboCheck(ZI)V

    return-void
.end method

.method static synthetic access$700(Lcom/android/dx/merge/InstructionTransformer;)[Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/merge/InstructionTransformer;->mappedInstructions:[Lcom/android/dx/io/instructions/DecodedInstruction;

    return-object p0
.end method

.method static synthetic access$808(Lcom/android/dx/merge/InstructionTransformer;)I
    .locals 2

    iget v0, p0, Lcom/android/dx/merge/InstructionTransformer;->mappedAt:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/android/dx/merge/InstructionTransformer;->mappedAt:I

    return v0
.end method

.method static synthetic access$900(Lcom/android/dx/merge/InstructionTransformer;)Lcom/android/dx/merge/IndexMap;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/merge/InstructionTransformer;->indexMap:Lcom/android/dx/merge/IndexMap;

    return-object p0
.end method

.method private static jumboCheck(ZI)V
    .locals 2

    if-nez p0, :cond_1

    const p0, 0xffff

    if-gt p1, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/android/dex/DexIndexOverflowException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot merge new index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " into a non-jumbo instruction!"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/dex/DexIndexOverflowException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public transform(Lcom/android/dx/merge/IndexMap;[S)[S
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/dex/DexException;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->decodeAll([S)[Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    array-length v0, p2

    .line 6
    iput-object p1, p0, Lcom/android/dx/merge/InstructionTransformer;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 7
    .line 8
    new-array p1, v0, [Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/android/dx/merge/InstructionTransformer;->mappedInstructions:[Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/android/dx/merge/InstructionTransformer;->mappedAt:I

    .line 14
    .line 15
    iget-object v1, p0, Lcom/android/dx/merge/InstructionTransformer;->reader:Lcom/android/dx/io/CodeReader;

    .line 16
    .line 17
    invoke-virtual {v1, p2}, Lcom/android/dx/io/CodeReader;->visitAll([Lcom/android/dx/io/instructions/DecodedInstruction;)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Lcom/android/dx/io/instructions/ShortArrayCodeOutput;

    .line 21
    .line 22
    invoke-direct {p2, v0}, Lcom/android/dx/io/instructions/ShortArrayCodeOutput;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/android/dx/merge/InstructionTransformer;->mappedInstructions:[Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 26
    .line 27
    array-length v1, v0

    .line 28
    :goto_0
    if-ge p1, v1, :cond_1

    .line 29
    .line 30
    aget-object v2, v0, p1

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2, p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->encode(Lcom/android/dx/io/instructions/CodeOutput;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lcom/android/dx/merge/InstructionTransformer;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/ShortArrayCodeOutput;->getArray()[S

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
    .line 48
    .line 49
    .line 50
.end method
