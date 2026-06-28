.class public final Lcom/android/dx/cf/iface/StdField;
.super Lcom/android/dx/cf/iface/StdMember;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/cf/iface/Field;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/iface/StdMember;-><init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)V

    return-void
.end method


# virtual methods
.method public getConstantValue()Lcom/android/dx/rop/cst/TypedConstant;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/iface/StdMember;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ConstantValue"

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/android/dx/cf/attrib/AttConstantValue;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return-object v0

    .line 17
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/cf/attrib/AttConstantValue;->getConstantValue()Lcom/android/dx/rop/cst/TypedConstant;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
