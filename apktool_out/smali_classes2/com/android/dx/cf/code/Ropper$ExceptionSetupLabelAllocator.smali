.class Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;
.super Lcom/android/dx/cf/code/Ropper$LabelAllocator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ExceptionSetupLabelAllocator"
.end annotation


# instance fields
.field maxSetupLabel:I

.field final synthetic this$0:Lcom/android/dx/cf/code/Ropper;


# direct methods
.method constructor <init>(Lcom/android/dx/cf/code/Ropper;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper;->access$100(Lcom/android/dx/cf/code/Ropper;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, Lcom/android/dx/cf/code/Ropper$LabelAllocator;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper;->access$100(Lcom/android/dx/cf/code/Ropper;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {p1}, Lcom/android/dx/cf/code/Ropper;->access$700(Lcom/android/dx/cf/code/Ropper;)Lcom/android/dx/cf/code/ConcreteMethod;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/2addr v0, p1

    .line 27
    iput v0, p0, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;->maxSetupLabel:I

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
.end method


# virtual methods
.method getNextLabel()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/Ropper$LabelAllocator;->nextAvailableLabel:I

    .line 2
    .line 3
    iget v1, p0, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;->maxSetupLabel:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    iput v1, p0, Lcom/android/dx/cf/code/Ropper$LabelAllocator;->nextAvailableLabel:I

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method
