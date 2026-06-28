.class public Lcom/android/dx/cf/attrib/AttBootstrapMethods;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "SourceFile"


# static fields
.field private static final ATTRIBUTE_HEADER_BYTES:I = 0x8

.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "BootstrapMethods"

.field private static final BOOTSTRAP_ARGUMENT_BYTES:I = 0x2

.field private static final BOOTSTRAP_METHOD_BYTES:I = 0x4


# instance fields
.field private final bootstrapMethods:Lcom/android/dx/cf/code/BootstrapMethodsList;

.field private final byteLength:I


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/BootstrapMethodsList;)V
    .locals 3

    .line 1
    const-string v0, "BootstrapMethods"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/android/dx/cf/attrib/AttBootstrapMethods;->bootstrapMethods:Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    mul-int/lit8 v0, v0, 0x4

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x8

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lcom/android/dx/cf/code/BootstrapMethodsList;->get(I)Lcom/android/dx/cf/code/BootstrapMethodsList$Item;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->getBootstrapMethodArguments()Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    mul-int/lit8 v2, v2, 0x2

    .line 36
    .line 37
    add-int/2addr v0, v2

    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iput v0, p0, Lcom/android/dx/cf/attrib/AttBootstrapMethods;->byteLength:I

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
.end method


# virtual methods
.method public byteLength()I
    .locals 1

    iget v0, p0, Lcom/android/dx/cf/attrib/AttBootstrapMethods;->byteLength:I

    return v0
.end method

.method public getBootstrapMethods()Lcom/android/dx/cf/code/BootstrapMethodsList;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/attrib/AttBootstrapMethods;->bootstrapMethods:Lcom/android/dx/cf/code/BootstrapMethodsList;

    return-object v0
.end method
