.class public Lcom/huawei/hms/aaid/entity/DeleteTokenResp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/core/aidl/IMessageEntity;


# instance fields
.field public retCode:I
    .annotation runtime Lcom/huawei/hms/core/aidl/annotation/Packed;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenResp;->retCode:I

    .line 6
    .line 7
    return-void
    .line 8
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
.end method


# virtual methods
.method public getRetCode()I
    .locals 1

    iget v0, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenResp;->retCode:I

    return v0
.end method

.method public setRetCode(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hms/aaid/entity/DeleteTokenResp;->retCode:I

    return-void
.end method
