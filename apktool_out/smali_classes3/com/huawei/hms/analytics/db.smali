.class public final Lcom/huawei/hms/analytics/db;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ikl:I

.field klm:I

.field lmn:[B


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x400

    iput v0, p0, Lcom/huawei/hms/analytics/db;->ikl:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/huawei/hms/analytics/db;->klm:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/hms/analytics/db;->lmn:[B

    return-void
.end method

.method public constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/huawei/hms/analytics/db;->klm:I

    const/16 p1, 0x400

    iput p1, p0, Lcom/huawei/hms/analytics/db;->ikl:I

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/huawei/hms/analytics/db;->lmn:[B

    return-void
.end method
