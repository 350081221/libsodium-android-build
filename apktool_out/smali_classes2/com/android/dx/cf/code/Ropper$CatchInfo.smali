.class Lcom/android/dx/cf/code/Ropper$CatchInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CatchInfo"
.end annotation


# instance fields
.field private final setups:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/android/dx/rop/type/Type;",
            "Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/android/dx/cf/code/Ropper;


# direct methods
.method private constructor <init>(Lcom/android/dx/cf/code/Ropper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->this$0:Lcom/android/dx/cf/code/Ropper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->setups:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/Ropper$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper$CatchInfo;-><init>(Lcom/android/dx/cf/code/Ropper;)V

    return-void
.end method


# virtual methods
.method getSetup(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->setups:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/android/dx/cf/code/Ropper;->access$000(Lcom/android/dx/cf/code/Ropper;)Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;->getNextLabel()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-instance v1, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;

    .line 22
    .line 23
    invoke-direct {v1, p1, v0}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;-><init>(Lcom/android/dx/rop/type/Type;I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->setups:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-object v0, v1

    .line 32
    :cond_0
    return-object v0
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

.method getSetups()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->setups:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
