.class public final Lcom/android/dx/Local;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final code:Lcom/android/dx/Code;

.field private reg:I

.field private spec:Lcom/android/dx/rop/code/RegisterSpec;

.field final type:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/android/dx/Code;Lcom/android/dx/TypeId;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/Code;",
            "Lcom/android/dx/TypeId<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/android/dx/Local;->reg:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/Local;->code:Lcom/android/dx/Code;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
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
.end method

.method static get(Lcom/android/dx/Code;Lcom/android/dx/TypeId;)Lcom/android/dx/Local;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/android/dx/Code;",
            "Lcom/android/dx/TypeId<",
            "TT;>;)",
            "Lcom/android/dx/Local<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/android/dx/Local;

    invoke-direct {v0, p0, p1}, Lcom/android/dx/Local;-><init>(Lcom/android/dx/Code;Lcom/android/dx/TypeId;)V

    return-object v0
.end method


# virtual methods
.method public getType()Lcom/android/dx/TypeId;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    return-object v0
.end method

.method initialize(I)I
    .locals 1

    .line 1
    iput p1, p0, Lcom/android/dx/Local;->reg:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/android/dx/Local;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/android/dx/Local;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method size()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    iget-object v0, v0, Lcom/android/dx/TypeId;->ropType:Lcom/android/dx/rop/type/Type;

    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->getCategory()I

    move-result v0

    return v0
.end method

.method spec()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/Local;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/Local;->code:Lcom/android/dx/Code;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/android/dx/Code;->initializeLocals()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/android/dx/Local;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 18
    .line 19
    .line 20
    throw v0

    .line 21
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/android/dx/Local;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    return-object v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/android/dx/Local;->reg:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/android/dx/Local;->type:Lcom/android/dx/TypeId;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
