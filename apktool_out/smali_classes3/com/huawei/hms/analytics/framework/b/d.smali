.class public final Lcom/huawei/hms/analytics/framework/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:J

.field public d:Ljava/lang/String;

.field private e:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/hms/analytics/framework/b/d;->e:[B

    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 0

    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lcom/huawei/hms/analytics/framework/b/d;->e:[B

    return-void
.end method

.method public final a()[B
    .locals 1

    iget-object v0, p0, Lcom/huawei/hms/analytics/framework/b/d;->e:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method
