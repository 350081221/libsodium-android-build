.class Lcom/android/dx/merge/InstructionTransformer$StringVisitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/io/CodeReader$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/merge/InstructionTransformer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "StringVisitor"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/merge/InstructionTransformer;


# direct methods
.method private constructor <init>(Lcom/android/dx/merge/InstructionTransformer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/InstructionTransformer$StringVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/dx/merge/InstructionTransformer;Lcom/android/dx/merge/InstructionTransformer$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/android/dx/merge/InstructionTransformer$StringVisitor;-><init>(Lcom/android/dx/merge/InstructionTransformer;)V

    return-void
.end method


# virtual methods
.method public visit([Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/DecodedInstruction;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->getIndex()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/merge/InstructionTransformer$StringVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/android/dx/merge/InstructionTransformer;->access$900(Lcom/android/dx/merge/InstructionTransformer;)Lcom/android/dx/merge/IndexMap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/android/dx/merge/IndexMap;->adjustString(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x1b

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-static {v0, p1}, Lcom/android/dx/merge/InstructionTransformer;->access$1000(ZI)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/android/dx/merge/InstructionTransformer$StringVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/android/dx/merge/InstructionTransformer;->access$700(Lcom/android/dx/merge/InstructionTransformer;)[Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, Lcom/android/dx/merge/InstructionTransformer$StringVisitor;->this$0:Lcom/android/dx/merge/InstructionTransformer;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/android/dx/merge/InstructionTransformer;->access$808(Lcom/android/dx/merge/InstructionTransformer;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p2, p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->withIndex(I)Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    aput-object p1, v0, v1

    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
.end method
