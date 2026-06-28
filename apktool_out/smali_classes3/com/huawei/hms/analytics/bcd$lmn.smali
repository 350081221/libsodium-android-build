.class public final Lcom/huawei/hms/analytics/bcd$lmn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/bcd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "lmn"
.end annotation


# instance fields
.field public ijk:J

.field public ikl:Ljava/lang/String;

.field public klm:Ljava/lang/String;

.field public lmn:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    iput-wide p4, p0, Lcom/huawei/hms/analytics/bcd$lmn;->ijk:J

    return-void
.end method


# virtual methods
.method public final lmn()V
    .locals 2

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/analytics/bcd$lmn;->ijk:J

    return-void
.end method
