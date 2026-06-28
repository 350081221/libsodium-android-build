.class public final Lcom/android/dx/cf/attrib/AttInnerClasses;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "SourceFile"


# static fields
.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "InnerClasses"


# instance fields
.field private final innerClasses:Lcom/android/dx/cf/attrib/InnerClassList;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/attrib/InnerClassList;)V
    .locals 1

    .line 1
    const-string v0, "InnerClasses"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->isMutable()Z

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/cf/attrib/AttInnerClasses;->innerClasses:Lcom/android/dx/cf/attrib/InnerClassList;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_1
    new-instance p1, Lcom/android/dx/util/MutabilityException;

    .line 16
    .line 17
    const-string v0, "innerClasses.isMutable()"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 24
    .line 25
    const-string v0, "innerClasses == null"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
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
.method public byteLength()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/attrib/AttInnerClasses;->innerClasses:Lcom/android/dx/cf/attrib/InnerClassList;

    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public getInnerClasses()Lcom/android/dx/cf/attrib/InnerClassList;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/attrib/AttInnerClasses;->innerClasses:Lcom/android/dx/cf/attrib/InnerClassList;

    return-object v0
.end method
