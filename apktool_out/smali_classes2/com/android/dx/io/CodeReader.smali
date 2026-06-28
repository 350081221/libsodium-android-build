.class public final Lcom/android/dx/io/CodeReader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/io/CodeReader$Visitor;
    }
.end annotation


# instance fields
.field private callSiteVisitor:Lcom/android/dx/io/CodeReader$Visitor;

.field private fallbackVisitor:Lcom/android/dx/io/CodeReader$Visitor;

.field private fieldVisitor:Lcom/android/dx/io/CodeReader$Visitor;

.field private methodAndProtoVisitor:Lcom/android/dx/io/CodeReader$Visitor;

.field private methodVisitor:Lcom/android/dx/io/CodeReader$Visitor;

.field private stringVisitor:Lcom/android/dx/io/CodeReader$Visitor;

.field private typeVisitor:Lcom/android/dx/io/CodeReader$Visitor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/android/dx/io/CodeReader;->fallbackVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/android/dx/io/CodeReader;->stringVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/io/CodeReader;->typeVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/android/dx/io/CodeReader;->fieldVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/android/dx/io/CodeReader;->methodVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/android/dx/io/CodeReader;->methodAndProtoVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/android/dx/io/CodeReader;->callSiteVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method private callVisit([Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/DecodedInstruction;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/android/dx/io/CodeReader$1;->$SwitchMap$com$android$dx$io$IndexType:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lcom/android/dx/io/OpcodeInfo;->getIndexType(I)Lcom/android/dx/io/IndexType;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    aget v0, v0, v1

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lcom/android/dx/io/CodeReader;->callSiteVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_1
    iget-object v0, p0, Lcom/android/dx/io/CodeReader;->methodAndProtoVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_2
    iget-object v0, p0, Lcom/android/dx/io/CodeReader;->methodVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_3
    iget-object v0, p0, Lcom/android/dx/io/CodeReader;->fieldVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_4
    iget-object v0, p0, Lcom/android/dx/io/CodeReader;->typeVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_5
    iget-object v0, p0, Lcom/android/dx/io/CodeReader;->stringVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 38
    .line 39
    :goto_0
    if-nez v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lcom/android/dx/io/CodeReader;->fallbackVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 42
    .line 43
    :cond_0
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v0, p1, p2}, Lcom/android/dx/io/CodeReader$Visitor;->visit([Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/DecodedInstruction;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 50
.end method


# virtual methods
.method public setAllVisitors(Lcom/android/dx/io/CodeReader$Visitor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->fallbackVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->stringVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->typeVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->fieldVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->methodVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->methodAndProtoVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->callSiteVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setCallSiteVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->callSiteVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setFallbackVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->fallbackVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setFieldVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->fieldVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setMethodAndProtoVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->methodAndProtoVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setMethodVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->methodVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setStringVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->stringVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setTypeVisitor(Lcom/android/dx/io/CodeReader$Visitor;)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/io/CodeReader;->typeVisitor:Lcom/android/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public visitAll([Lcom/android/dx/io/instructions/DecodedInstruction;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/dex/DexException;
        }
    .end annotation

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    aget-object v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-direct {p0, p1, v2}, Lcom/android/dx/io/CodeReader;->callVisit([Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/DecodedInstruction;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public visitAll([S)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/dex/DexException;
        }
    .end annotation

    .line 4
    invoke-static {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->decodeAll([S)[Lcom/android/dx/io/instructions/DecodedInstruction;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/android/dx/io/CodeReader;->visitAll([Lcom/android/dx/io/instructions/DecodedInstruction;)V

    return-void
.end method
