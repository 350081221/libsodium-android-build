.class public abstract Lcom/android/dx/cf/attrib/BaseLocalVariables;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "SourceFile"


# instance fields
.field private final localVariables:Lcom/android/dx/cf/code/LocalVariableList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/dx/cf/code/LocalVariableList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->isMutable()Z

    .line 5
    .line 6
    .line 7
    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/cf/attrib/BaseLocalVariables;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance p1, Lcom/android/dx/util/MutabilityException;

    .line 14
    .line 15
    const-string p2, "localVariables.isMutable()"

    .line 16
    .line 17
    invoke-direct {p1, p2}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string p2, "localVariables == null"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

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
.end method


# virtual methods
.method public final byteLength()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/attrib/BaseLocalVariables;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public final getLocalVariables()Lcom/android/dx/cf/code/LocalVariableList;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/attrib/BaseLocalVariables;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    return-object v0
.end method
