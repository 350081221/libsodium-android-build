.class public Lcom/huawei/hms/support/api/client/BundleResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/huawei/hms/support/api/client/BundleResult;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/huawei/hms/support/api/client/BundleResult;->b:Landroid/os/Bundle;

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
.method public getResultCode()I
    .locals 1

    iget v0, p0, Lcom/huawei/hms/support/api/client/BundleResult;->a:I

    return v0
.end method

.method public getRspBody()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/support/api/client/BundleResult;->b:Landroid/os/Bundle;

    return-object v0
.end method

.method public setResultCode(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hms/support/api/client/BundleResult;->a:I

    return-void
.end method

.method public setRspBody(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hms/support/api/client/BundleResult;->b:Landroid/os/Bundle;

    return-void
.end method
