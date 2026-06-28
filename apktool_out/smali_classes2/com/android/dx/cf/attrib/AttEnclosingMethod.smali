.class public final Lcom/android/dx/cf/attrib/AttEnclosingMethod;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "SourceFile"


# static fields
.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "EnclosingMethod"


# instance fields
.field private final method:Lcom/android/dx/rop/cst/CstNat;

.field private final type:Lcom/android/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V
    .locals 1

    .line 1
    const-string v0, "EnclosingMethod"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->type:Lcom/android/dx/rop/cst/CstType;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->method:Lcom/android/dx/rop/cst/CstNat;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 14
    .line 15
    const-string/jumbo p2, "type == null"

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
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


# virtual methods
.method public byteLength()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public getEnclosingClass()Lcom/android/dx/rop/cst/CstType;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->type:Lcom/android/dx/rop/cst/CstType;

    return-object v0
.end method

.method public getMethod()Lcom/android/dx/rop/cst/CstNat;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->method:Lcom/android/dx/rop/cst/CstNat;

    return-object v0
.end method
