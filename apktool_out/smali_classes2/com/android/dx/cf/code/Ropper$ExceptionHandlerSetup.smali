.class Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ExceptionHandlerSetup"
.end annotation


# instance fields
.field private caughtType:Lcom/android/dx/rop/type/Type;

.field private label:I


# direct methods
.method constructor <init>(Lcom/android/dx/rop/type/Type;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->caughtType:Lcom/android/dx/rop/type/Type;

    .line 5
    .line 6
    iput p2, p0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->label:I

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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


# virtual methods
.method getCaughtType()Lcom/android/dx/rop/type/Type;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->caughtType:Lcom/android/dx/rop/type/Type;

    return-object v0
.end method

.method public getLabel()I
    .locals 1

    iget v0, p0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->label:I

    return v0
.end method
