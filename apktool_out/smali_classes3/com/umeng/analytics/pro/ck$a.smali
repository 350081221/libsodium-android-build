.class public Lcom/umeng/analytics/pro/ck$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/cs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/ck;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/umeng/analytics/pro/ck$a;->a:J

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-long v0, p1

    .line 4
    iput-wide v0, p0, Lcom/umeng/analytics/pro/ck$a;->a:J

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/de;)Lcom/umeng/analytics/pro/cq;
    .locals 3

    new-instance v0, Lcom/umeng/analytics/pro/ck;

    iget-wide v1, p0, Lcom/umeng/analytics/pro/ck$a;->a:J

    invoke-direct {v0, p1, v1, v2}, Lcom/umeng/analytics/pro/ck;-><init>(Lcom/umeng/analytics/pro/de;J)V

    return-object v0
.end method
